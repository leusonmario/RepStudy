import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
        int int2 = java.lang.Integer.compare(23420000, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(119);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "119" + "'", str1, "119");
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.setGridFsDatabase("24");
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.gridFsDatabase = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(true);
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
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray6 = mongoProperties0.getPassword();
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
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
        java.lang.String str11 = mongoClientOptions6.getDescription();
        int int12 = mongoClientOptions6.getSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry13 = mongoClientOptions6.getCodecRegistry();
        boolean boolean14 = mongoClientOptions6.isSocketKeepAlive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(codecRegistry13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder4 = builder3.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.serverSelectionTimeout(15);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(167772160);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxWaitTime((-2147456633));
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        boolean boolean16 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions14.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.dbDecoderFactory(dBDecoderFactory17);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        int int2 = java.lang.Integer.rotateRight((int) (short) 0, 8388608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.database;
        mongoProperties10.setHost("mongodb://localhost/test");
        java.lang.String str14 = mongoProperties10.getHost();
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        int int17 = mongoClientOptions16.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions16.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties10.builder(mongoClientOptions16);
        javax.net.SocketFactory socketFactory20 = mongoClientOptions16.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory21 = mongoClientOptions16.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder2.dbEncoderFactory(dBEncoderFactory21);
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
        int int36 = mongoClientOptions33.getSocketTimeout();
        int int37 = mongoClientOptions33.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern38 = mongoClientOptions33.getReadConcern();
        javax.net.SocketFactory socketFactory39 = mongoClientOptions33.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder2.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder2.sslEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertNotNull(dBEncoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 500 + "'", int37 == 500);
        org.junit.Assert.assertNotNull(readConcern38);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
        java.lang.String str1 = java.lang.Integer.toString(16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "16" + "'", str1, "16");
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
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
        javax.net.SocketFactory socketFactory17 = mongoClientOptions10.getSocketFactory();
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
        org.junit.Assert.assertNotNull(socketFactory17);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setHost("78528512");
        mongoProperties0.setAuthenticationDatabase("111000100000000000000000001000");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        mongoProperties0.setGridFsDatabase("30000");
        mongoProperties0.authenticationDatabase = "128";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.database;
        mongoProperties8.setHost("mongodb://localhost/test");
        java.lang.String str12 = mongoProperties8.getUri();
        java.lang.String str13 = mongoProperties8.getDatabase();
        java.lang.Class<?> wildcardClass14 = mongoProperties8.getFieldNamingStrategy();
        char[] charArray15 = mongoProperties8.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray23 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties16.password = charArray23;
        mongoProperties16.database = "";
        boolean boolean27 = mongoProperties16.hasCustomAddress();
        java.lang.String str28 = mongoProperties16.authenticationDatabase;
        java.lang.Integer int29 = mongoProperties16.getPort();
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
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties30.builder(mongoClientOptions46);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties48 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str49 = mongoProperties48.database;
        java.lang.String str50 = mongoProperties48.authenticationDatabase;
        java.lang.Integer int51 = mongoProperties48.port;
        java.lang.Class<java.lang.Integer> intClass52 = java.lang.Integer.TYPE;
        mongoProperties48.fieldNamingStrategy = intClass52;
        mongoProperties30.fieldNamingStrategy = intClass52;
        mongoProperties16.setFieldNamingStrategy(intClass52);
        mongoProperties8.setFieldNamingStrategy(intClass52);
        mongoProperties0.setFieldNamingStrategy(intClass52);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNotNull(intClass52);
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
        int int1 = java.lang.Integer.reverseBytes(1073741830);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100663360 + "'", int1 == 100663360);
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
        int int1 = java.lang.Integer.reverse(67108864);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder5.heartbeatSocketTimeout(64);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold(33554432);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
        int int2 = java.lang.Integer.rotateRight(24, 1073741830);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1610612736 + "'", int2 == 1610612736);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
        int int2 = java.lang.Integer.min(17459436, 10001101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10001101 + "'", int2 == 10001101);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
        int int1 = java.lang.Integer.reverse(127362600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 342288864 + "'", int1 == 342288864);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("101000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 101000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1015", 27017);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 27017 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatConnectTimeout(83886080);
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
        com.mongodb.MongoClientOptions.Builder builder29 = builder15.dbDecoderFactory(dBDecoderFactory28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder8.dbDecoderFactory(dBDecoderFactory28);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.description("");
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder39 = builder33.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder43 = builder39.serverSelectionTimeout(580061184);
        com.mongodb.MongoClientOptions.Builder builder44 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder44.build();
        boolean boolean46 = mongoClientOptions45.isCursorFinalizerEnabled();
        int int47 = mongoClientOptions45.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern48 = mongoClientOptions45.getWriteConcern();
        com.mongodb.WriteConcern writeConcern49 = mongoClientOptions45.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder50 = builder39.writeConcern(writeConcern49);
        com.mongodb.MongoClientOptions.Builder builder51 = builder8.writeConcern(writeConcern49);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(dBDecoderFactory28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20000 + "'", int47 == 20000);
        org.junit.Assert.assertNotNull(writeConcern48);
        org.junit.Assert.assertNotNull(writeConcern49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
        int int2 = java.lang.Integer.min((-2147456632), 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147456632) + "'", int2 == (-2147456632));
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        char[] charArray4 = mongoProperties0.getPassword();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.database = "2147483652";
        int int8 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.database = "134217728";
        mongoProperties0.port = 9765651;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
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
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int16 = mongoClientOptions10.getHeartbeatSocketTimeout();
        boolean boolean17 = mongoClientOptions10.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.host = "ffffffff";
        mongoProperties0.uri = "20600000000";
        java.lang.String str10 = mongoProperties0.host;
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        boolean boolean13 = mongoClientOptions12.isCursorFinalizerEnabled();
        int int14 = mongoClientOptions12.getHeartbeatConnectTimeout();
        int int15 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions12);
        int int17 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ffffffff" + "'", str10, "ffffffff");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27017 + "'", int17 == 27017);
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("", 87);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 87 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
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
        java.lang.String str21 = mongoProperties0.host;
        java.lang.String str22 = mongoProperties0.uri;
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
        int int2 = java.lang.Integer.max(0, (-746586112));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions1.getHeartbeatConnectTimeout();
        boolean boolean8 = mongoClientOptions1.isAlwaysUseMBeans();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList9 = mongoClientOptions1.getCommandListeners();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(commandListenerList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(commandListenerList9);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
        java.lang.String str2 = java.lang.Integer.toString(10, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
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
        int int16 = mongoClientOptions10.getSocketTimeout();
        int int17 = mongoClientOptions10.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30000 + "'", int15 == 30000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        java.lang.Integer int9 = mongoProperties0.getPort();
        java.lang.String str10 = mongoProperties0.getUri();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
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
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder22 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        boolean boolean24 = mongoClientOptions23.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList25 = mongoClientOptions23.getCommandListeners();
        boolean boolean26 = mongoClientOptions23.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions23.getWriteConcern();
        boolean boolean28 = mongoClientOptions23.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        java.lang.String str30 = mongoProperties0.authenticationDatabase;
        mongoProperties0.host = "20600000000";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray40 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties33.password = charArray40;
        java.lang.Class<java.lang.Integer> intClass42 = java.lang.Integer.TYPE;
        mongoProperties33.fieldNamingStrategy = intClass42;
        java.lang.String str44 = mongoProperties33.username;
        mongoProperties33.authenticationDatabase = "-1";
        mongoProperties33.setUsername("");
        java.lang.String str49 = mongoProperties33.username;
        mongoProperties33.setPort((java.lang.Integer) 15);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray59 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties52.password = charArray59;
        mongoProperties52.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties63 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray70 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties63.password = charArray70;
        java.lang.String str72 = mongoProperties63.database;
        java.lang.String str73 = mongoProperties63.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties74 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions75 = null;
        org.springframework.core.env.Environment environment76 = null;
        com.mongodb.MongoClient mongoClient77 = mongoProperties74.createMongoClient(mongoClientOptions75, environment76);
        com.mongodb.MongoClientOptions.Builder builder78 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder80 = builder78.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder81 = builder78.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder83 = builder81.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions84 = builder81.build();
        com.mongodb.MongoClientOptions.Builder builder85 = mongoProperties74.builder(mongoClientOptions84);
        int int86 = mongoClientOptions84.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder87 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions84);
        java.lang.String str88 = mongoClientOptions84.getDescription();
        com.mongodb.MongoClientOptions.Builder builder89 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions84);
        org.springframework.core.env.Environment environment90 = null;
        com.mongodb.MongoClient mongoClient91 = mongoProperties63.createMongoClient(mongoClientOptions84, environment90);
        com.mongodb.MongoClientOptions.Builder builder92 = mongoProperties52.builder(mongoClientOptions84);
        com.mongodb.MongoClientOptions mongoClientOptions93 = builder92.build();
        int int94 = mongoClientOptions93.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder95 = mongoProperties33.builder(mongoClientOptions93);
        com.mongodb.MongoClientOptions.Builder builder96 = mongoProperties0.builder(mongoClientOptions93);
        com.mongodb.MongoClientOptions.Builder builder98 = builder96.connectionsPerHost(5120000);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(commandListenerList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(mongoClient77);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(mongoClientOptions84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(mongoClient91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(mongoClientOptions93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 120000 + "'", int94 == 120000);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
        int int1 = java.lang.Integer.reverse(9765651);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-926897920) + "'", int1 == (-926897920));
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
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
        int int18 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str19 = mongoProperties0.getMongoClientDatabase();
        org.springframework.core.env.Environment environment20 = null;
        int int21 = mongoProperties0.determinePort(environment20);
        mongoProperties0.setPort((java.lang.Integer) 134217793);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "test" + "'", str19, "test");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
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
        boolean boolean35 = mongoClientOptions27.isSocketKeepAlive();
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        int int2 = java.lang.Integer.sum((-301989888), 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-301989808) + "'", int2 == (-301989808));
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        int int2 = java.lang.Integer.rotateLeft(5000000, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1275067196) + "'", int2 == (-1275067196));
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
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
        java.lang.Class<?> wildcardClass22 = mongoClient21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder0.heartbeatFrequency(1100100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder9.connectTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectTimeout must be >= 0");
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
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
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
        java.lang.Class<?> wildcardClass36 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray37 = null;
        mongoProperties0.setPassword(charArray37);
        java.lang.String str39 = mongoProperties0.gridFsDatabase;
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
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "200" + "'", str39, "200");
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getLocalThreshold();
        boolean boolean8 = mongoClientOptions1.isSslEnabled();
        int int9 = mongoClientOptions1.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
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
        com.mongodb.MongoClientOptions.Builder builder41 = builder8.dbEncoderFactory(dBEncoderFactory40);
        com.mongodb.MongoClientOptions.Builder builder43 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder45 = builder8.maxConnectionLifeTime(5);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.serverSelectionTimeout((int) (short) -1);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.description("23420000");
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder53 = builder49.socketTimeout(110000);
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
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
        int int2 = java.lang.Integer.rotateLeft(525, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 218103810 + "'", int2 == 218103810);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
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
        org.bson.codecs.configuration.CodecRegistry codecRegistry20 = mongoClientOptions15.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatSocketTimeout((int) '#');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.database;
        java.lang.String str26 = mongoProperties24.getAuthenticationDatabase();
        mongoProperties24.setUsername("5");
        java.lang.String str29 = mongoProperties24.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int31 = mongoProperties30.port;
        mongoProperties30.setUri("hi!");
        char[] charArray34 = mongoProperties30.getPassword();
        com.mongodb.MongoClientOptions.Builder builder35 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        boolean boolean37 = mongoClientOptions36.isCursorFinalizerEnabled();
        int int38 = mongoClientOptions36.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern39 = mongoClientOptions36.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties30.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties24.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder45 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder45.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList47 = mongoClientOptions46.getCommandListeners();
        javax.net.SocketFactory socketFactory48 = mongoClientOptions46.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder49 = builder42.socketFactory(socketFactory48);
        com.mongodb.MongoClientOptions.Builder builder50 = builder23.socketFactory(socketFactory48);
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
        org.junit.Assert.assertNotNull(codecRegistry20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNull(charArray34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertNotNull(writeConcern39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(commandListenerList47);
        org.junit.Assert.assertNotNull(socketFactory48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        boolean boolean4 = mongoClientOptions1.isSslEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions1.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
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
        int int17 = mongoClientOptions10.getLocalThreshold();
        boolean boolean18 = mongoClientOptions10.isSocketKeepAlive();
        java.lang.String str19 = mongoClientOptions10.getRequiredReplicaSetName();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.sslEnabled(false);
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
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        mongoProperties0.setDatabase("100");
        java.lang.String str17 = mongoProperties0.database;
        mongoProperties0.setUri("-536870913");
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
        int int32 = mongoClientOptions30.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList33 = mongoClientOptions30.getCommandListeners();
        int int34 = mongoClientOptions30.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions30);
        org.springframework.core.env.Environment environment36 = null;
        com.mongodb.MongoClient mongoClient37 = mongoProperties0.createMongoClient(mongoClientOptions30, environment36);
        java.lang.String str38 = mongoClientOptions30.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100" + "'", str17, "100");
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(commandListenerList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(mongoClient37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10L + "'", long1 == 10L);
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
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
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        int int39 = mongoClientOptions24.getThreadsAllowedToBlockForConnectionMultiplier();
        int int40 = mongoClientOptions24.getServerSelectionTimeout();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 5 + "'", int39 == 5);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 30000 + "'", int40 == 30000);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("10c944", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10c944");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 0, 200000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        mongoProperties0.database = "mongodb://localhost/test";
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList25 = mongoClientOptions23.getCommandListeners();
        int int26 = mongoClientOptions23.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList27 = mongoClientOptions23.getCommandListeners();
        boolean boolean28 = mongoClientOptions23.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        boolean boolean30 = mongoClientOptions23.isSslEnabled();
        int int31 = mongoClientOptions23.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        boolean boolean33 = mongoClientOptions23.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(commandListenerList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(commandListenerList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10000 + "'", int31 == 10000);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        boolean boolean8 = mongoClientOptions6.isSslEnabled();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions6.getWriteConcern();
        com.mongodb.ReadPreference readPreference10 = mongoClientOptions6.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions6.getDbDecoderFactory();
        boolean boolean12 = mongoClientOptions6.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        int int15 = mongoClientOptions14.getHeartbeatConnectTimeout();
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList28 = mongoClientOptions26.getCommandListeners();
        int int29 = mongoClientOptions26.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList30 = mongoClientOptions26.getCommandListeners();
        boolean boolean31 = mongoClientOptions14.equals((java.lang.Object) mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions26);
        boolean boolean33 = mongoClientOptions6.equals((java.lang.Object) mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(readPreference10);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(commandListenerList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(commandListenerList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
        int int1 = java.lang.Integer.lowestOneBit(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
        int int1 = java.lang.Integer.parseInt("8000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8000 + "'", int1 == 8000);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
        int int2 = java.lang.Integer.min(0, 268828672);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
        int int1 = java.lang.Integer.signum(8192);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Integer int4 = mongoProperties0.getPort();
        mongoProperties0.gridFsDatabase = "hi!";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.database;
        java.lang.String str9 = mongoProperties7.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int11 = mongoProperties10.port;
        mongoProperties10.setUri("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray21 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties14.password = charArray21;
        mongoProperties10.password = charArray21;
        mongoProperties7.password = charArray21;
        java.lang.String str25 = mongoProperties7.getDatabase();
        java.lang.String str26 = mongoProperties7.getDatabase();
        mongoProperties7.setUsername("35");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray36 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties29.password = charArray36;
        java.lang.Class<java.lang.Integer> intClass38 = java.lang.Integer.TYPE;
        mongoProperties29.fieldNamingStrategy = intClass38;
        java.lang.String str40 = mongoProperties29.username;
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties29.builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties29.builder(mongoClientOptions43);
        mongoProperties29.setUsername("34");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory59 = mongoClientOptions57.getDbDecoderFactory();
        int int60 = mongoClientOptions57.getSocketTimeout();
        int int61 = mongoClientOptions57.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties29.builder(mongoClientOptions57);
        char[] charArray63 = mongoProperties29.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties64 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray71 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties64.password = charArray71;
        java.lang.String str73 = mongoProperties64.database;
        java.lang.String str74 = mongoProperties64.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties75 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions76 = null;
        org.springframework.core.env.Environment environment77 = null;
        com.mongodb.MongoClient mongoClient78 = mongoProperties75.createMongoClient(mongoClientOptions76, environment77);
        com.mongodb.MongoClientOptions.Builder builder79 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder81 = builder79.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder82 = builder79.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder84 = builder82.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions85 = builder82.build();
        com.mongodb.MongoClientOptions.Builder builder86 = mongoProperties75.builder(mongoClientOptions85);
        int int87 = mongoClientOptions85.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder88 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions85);
        java.lang.String str89 = mongoClientOptions85.getDescription();
        com.mongodb.MongoClientOptions.Builder builder90 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions85);
        org.springframework.core.env.Environment environment91 = null;
        com.mongodb.MongoClient mongoClient92 = mongoProperties64.createMongoClient(mongoClientOptions85, environment91);
        java.lang.String str93 = mongoProperties64.username;
        char[] charArray94 = mongoProperties64.getPassword();
        mongoProperties29.setPassword(charArray94);
        mongoProperties7.setPassword(charArray94);
        mongoProperties0.password = charArray94;
        java.lang.String str98 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClient50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(dBDecoderFactory59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 15 + "'", int61 == 15);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(mongoClient78);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(mongoClientOptions85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(mongoClient92);
        org.junit.Assert.assertNull(str93);
        org.junit.Assert.assertNotNull(charArray94);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray94), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray94), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray94), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.sslEnabled(false);
        javax.net.SocketFactory socketFactory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketFactory(socketFactory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
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
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("30000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 30000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions1.isSocketKeepAlive();
        boolean boolean6 = mongoClientOptions1.isCursorFinalizerEnabled();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions1.getDbDecoderFactory();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
        java.lang.String str1 = java.lang.Integer.toOctalString(11010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25402" + "'", str1, "25402");
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minHeartbeatFrequency(4194304);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionIdleTime(54546204);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
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
        mongoProperties0.setUri("5");
        java.lang.String str21 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5" + "'", str21, "5");
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList32 = mongoClientOptions30.getCommandListeners();
        java.lang.String str33 = mongoClientOptions30.getRequiredReplicaSetName();
        int int34 = mongoClientOptions30.getThreadsAllowedToBlockForConnectionMultiplier();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList35 = mongoClientOptions30.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder36 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder36.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList38 = mongoClientOptions37.getCommandListeners();
        boolean boolean39 = mongoClientOptions30.equals((java.lang.Object) commandListenerList38);
        boolean boolean40 = mongoClientOptions15.equals((java.lang.Object) boolean39);
        int int41 = mongoClientOptions15.getServerSelectionTimeout();
        int int42 = mongoClientOptions15.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
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
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(commandListenerList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertNotNull(commandListenerList35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(commandListenerList38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 30000 + "'", int41 == 30000);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("97");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 97");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
        int int1 = java.lang.Integer.reverse(34);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1140850688 + "'", int1 == 1140850688);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("-1");
        java.lang.String str6 = mongoProperties0.getDatabase();
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.String str8 = mongoProperties0.database;
        char[] charArray9 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(charArray9);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
        java.lang.String str1 = java.lang.Integer.toBinaryString(23420);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101101101111100" + "'", str1, "101101101111100");
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
        int int1 = java.lang.Integer.reverseBytes(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
        int int2 = java.lang.Integer.sum(838860799, 25600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 838886399 + "'", int2 == 838886399);
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
        int int2 = java.lang.Integer.compare(37748736, 157187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Integer int4 = mongoProperties0.getPort();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
        int int2 = java.lang.Integer.max(2329, (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2329 + "'", int2 == 2329);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
        int int1 = java.lang.Integer.reverse(20648881);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1916216192) + "'", int1 == (-1916216192));
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
        int int1 = java.lang.Integer.parseUnsignedInt("167772160");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 167772160 + "'", int1 == 167772160);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
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
        java.lang.String str42 = mongoProperties0.gridFsDatabase;
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
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.cursorFinalizerEnabled(false);
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
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions32.getDbDecoderFactory();
        int int35 = mongoClientOptions32.getSocketTimeout();
        int int36 = mongoClientOptions32.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern37 = mongoClientOptions32.getReadConcern();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions32.getSocketFactory();
        com.mongodb.WriteConcern writeConcern39 = mongoClientOptions32.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder40 = builder19.writeConcern(writeConcern39);
        java.lang.Class<?> wildcardClass41 = builder40.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 500 + "'", int36 == 500);
        org.junit.Assert.assertNotNull(readConcern37);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertNotNull(writeConcern39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
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
        java.lang.String str17 = mongoProperties0.authenticationDatabase;
        mongoProperties0.username = "133fde";
        mongoProperties0.setHost("");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
        int int1 = java.lang.Integer.numberOfTrailingZeros(65536);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        int int1 = java.lang.Integer.reverse(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 335544320 + "'", int1 == 335544320);
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime(342288864);
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
        int int1 = java.lang.Integer.numberOfLeadingZeros(924209280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.database;
        mongoProperties0.setAuthenticationDatabase("34");
        mongoProperties0.setDatabase("");
        java.lang.Class<?> wildcardClass16 = mongoProperties0.getFieldNamingStrategy();
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
        org.junit.Assert.assertNull(wildcardClass16);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        int int10 = mongoClientOptions9.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder12 = builder11.legacyDefaults();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97" + "'", str7, "97");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
        int int2 = java.lang.Integer.min(110000, (-301989808));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-301989808) + "'", int2 == (-301989808));
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
        int int1 = java.lang.Integer.bitCount(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.host = "ffffffff";
        mongoProperties0.uri = "20600000000";
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
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
        java.lang.String str20 = mongoProperties0.host;
        int int21 = mongoProperties0.getDEFAULT_PORT();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1100100" + "'", str20, "1100100");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
        int int1 = java.lang.Integer.lowestOneBit((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
        java.lang.String str2 = java.lang.Integer.toString(24, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "24" + "'", str2, "24");
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
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
        boolean boolean66 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
        int int2 = java.lang.Integer.rotateRight(113, (-1337982976));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
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
        java.lang.Class<?> wildcardClass12 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        boolean boolean16 = mongoClientOptions14.isAlwaysUseMBeans();
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions14, environment17);
        java.lang.Integer int19 = mongoProperties0.port;
        java.lang.Class<?> wildcardClass20 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
        int int2 = java.lang.Integer.min(1889533965, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
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
        javax.net.SocketFactory socketFactory39 = mongoClientOptions35.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        com.mongodb.DBEncoderFactory dBEncoderFactory41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder42 = builder40.dbEncoderFactory(dBEncoderFactory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(socketFactory39);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
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
        boolean boolean18 = mongoClientOptions10.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        boolean boolean20 = mongoClientOptions10.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("20000000004");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 20000000004");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minHeartbeatFrequency(2147483647);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.description("10");
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.maxWaitTime((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatFrequency((-301989888));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: heartbeatFrequency must be > 0");
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
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
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
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        boolean boolean13 = mongoClientOptions9.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        int int15 = mongoClientOptions9.getLocalThreshold();
        org.bson.codecs.configuration.CodecRegistry codecRegistry16 = mongoClientOptions9.getCodecRegistry();
        int int17 = mongoClientOptions9.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        boolean boolean19 = mongoClientOptions9.isSslEnabled();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(codecRegistry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
        int int2 = java.lang.Integer.min(20000, 268828672);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
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
        com.mongodb.event.CommandListener commandListener39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder40 = builder38.addCommandListener(commandListener39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
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
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("101000", 54546204);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 54546204 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
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
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int12 = mongoClientOptions6.getHeartbeatConnectTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.authenticationDatabase;
        boolean boolean15 = mongoProperties13.hasCustomAddress();
        java.lang.String str16 = mongoProperties13.username;
        java.lang.String str17 = mongoProperties13.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray25 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties18.password = charArray25;
        java.lang.String str27 = mongoProperties18.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.database;
        java.lang.String str30 = mongoProperties28.authenticationDatabase;
        java.lang.Integer int31 = mongoProperties28.port;
        java.lang.Class<java.lang.Integer> intClass32 = java.lang.Integer.TYPE;
        mongoProperties28.fieldNamingStrategy = intClass32;
        mongoProperties18.setFieldNamingStrategy(intClass32);
        mongoProperties13.fieldNamingStrategy = intClass32;
        boolean boolean36 = mongoClientOptions6.equals((java.lang.Object) intClass32);
        int int37 = mongoClientOptions6.getHeartbeatConnectTimeout();
        int int38 = mongoClientOptions6.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNotNull(intClass32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20000 + "'", int37 == 20000);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectionsPerHost(22930800);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.alwaysUseMBeans(false);
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
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
        int int1 = java.lang.Integer.signum(5242880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
        int int2 = java.lang.Integer.remainderUnsigned(335544320, 25600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5120 + "'", int2 == 5120);
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        mongoProperties0.username = "test";
        mongoProperties0.setUsername("12");
        mongoProperties0.authenticationDatabase = "20600000000";
        java.lang.Class<?> wildcardClass10 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass11 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str12 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int14 = mongoProperties13.port;
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties13.builder(mongoClientOptions15);
        mongoProperties13.port = 1;
        mongoProperties13.setHost("141");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray28 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties21.password = charArray28;
        java.lang.Class<java.lang.Integer> intClass30 = java.lang.Integer.TYPE;
        mongoProperties21.fieldNamingStrategy = intClass30;
        java.lang.String str32 = mongoProperties21.username;
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties21.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions35);
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties21.builder(mongoClientOptions37);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.database;
        java.lang.String str41 = mongoProperties39.authenticationDatabase;
        java.lang.Integer int42 = mongoProperties39.port;
        java.lang.Class<java.lang.Integer> intClass43 = java.lang.Integer.TYPE;
        mongoProperties39.fieldNamingStrategy = intClass43;
        mongoProperties21.fieldNamingStrategy = intClass43;
        mongoProperties13.setFieldNamingStrategy(intClass43);
        mongoProperties0.fieldNamingStrategy = intClass43;
        java.lang.String str48 = mongoProperties0.getUsername();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(int42);
        org.junit.Assert.assertNotNull(intClass43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "12" + "'", str48, "12");
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1000000000000000000000000000010", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1000000000000000000000000000010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int8 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minHeartbeatFrequency(100);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray20 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties13.password = charArray20;
        java.lang.Class<java.lang.Integer> intClass22 = java.lang.Integer.TYPE;
        mongoProperties13.fieldNamingStrategy = intClass22;
        java.lang.String str24 = mongoProperties13.username;
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties13.builder(mongoClientOptions25);
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
        int int39 = mongoClientOptions37.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions37);
        java.lang.String str41 = mongoClientOptions37.getDescription();
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions37);
        java.lang.String str43 = mongoClientOptions37.getDescription();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions37);
        boolean boolean45 = mongoClientOptions37.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder46 = com.mongodb.MongoClientOptions.builder(mongoClientOptions37);
        org.springframework.core.env.Environment environment47 = null;
        com.mongodb.MongoClient mongoClient48 = mongoProperties13.createMongoClient(mongoClientOptions37, environment47);
        boolean boolean49 = mongoClientOptions37.isAlwaysUseMBeans();
        boolean boolean50 = mongoClientOptions37.isSslEnabled();
        javax.net.SocketFactory socketFactory51 = mongoClientOptions37.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder52 = builder12.socketFactory(socketFactory51);
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.description("");
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.heartbeatConnectTimeout(83886080);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties60 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions61 = null;
        org.springframework.core.env.Environment environment62 = null;
        com.mongodb.MongoClient mongoClient63 = mongoProperties60.createMongoClient(mongoClientOptions61, environment62);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder67 = builder64.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder67.build();
        com.mongodb.MongoClientOptions.Builder builder71 = mongoProperties60.builder(mongoClientOptions70);
        com.mongodb.DBDecoderFactory dBDecoderFactory72 = mongoClientOptions70.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder73 = builder59.dbDecoderFactory(dBDecoderFactory72);
        com.mongodb.MongoClientOptions.Builder builder74 = builder12.dbDecoderFactory(dBDecoderFactory72);
        com.mongodb.MongoClientOptions.Builder builder75 = builder9.dbDecoderFactory(dBDecoderFactory72);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(commandListenerList5);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClient30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClient48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(socketFactory51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClient63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(dBDecoderFactory72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.username = "test";
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setDatabase("97");
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.authenticationDatabase = "30324000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
        java.lang.Integer int1 = java.lang.Integer.getInteger("25600");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        java.lang.Integer int1 = java.lang.Integer.getInteger("6400000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        int int1 = java.lang.Integer.highestOneBit((-503054336));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.username = "test";
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setDatabase("97");
        java.lang.String str9 = mongoProperties0.uri;
        java.lang.String str10 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97" + "'", str10, "97");
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
        int int1 = java.lang.Integer.numberOfLeadingZeros(218234880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
        int int2 = java.lang.Integer.divideUnsigned(1200000123, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100000010 + "'", int2 == 100000010);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
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
        boolean boolean16 = mongoClientOptions10.isSslEnabled();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
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
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions20);
        mongoProperties0.setPort((java.lang.Integer) 87);
        mongoProperties0.port = 838860800;
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
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        int int5 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList7 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder11 = builder8.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatSocketTimeout(8);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder16.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder24 = builder16.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.description("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.heartbeatConnectTimeout(83886080);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        org.springframework.core.env.Environment environment34 = null;
        com.mongodb.MongoClient mongoClient35 = mongoProperties32.createMongoClient(mongoClientOptions33, environment34);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder39 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties32.builder(mongoClientOptions42);
        com.mongodb.DBDecoderFactory dBDecoderFactory44 = mongoClientOptions42.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder31.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder16.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder11.dbDecoderFactory(dBDecoderFactory44);
        boolean boolean48 = mongoClientOptions1.equals((java.lang.Object) dBDecoderFactory44);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertNotNull(commandListenerList7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(dBDecoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-926897920));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("214d1d80");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"214d1d80\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        mongoProperties0.host = "1200000000";
        char[] charArray8 = mongoProperties0.password;
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.username;
        char[] charArray11 = mongoProperties0.password;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
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
        boolean boolean18 = mongoClientOptions10.isSslInvalidHostNameAllowed();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        boolean boolean10 = mongoClientOptions9.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList11 = mongoClientOptions9.getCommandListeners();
        boolean boolean12 = mongoClientOptions9.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern13 = mongoClientOptions9.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder14 = builder5.writeConcern(writeConcern13);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.minConnectionsPerHost(218103810);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(commandListenerList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(writeConcern13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
        int int2 = java.lang.Integer.min(11010, 851968);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11010 + "'", int2 == 11010);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        int int4 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Integer int5 = mongoProperties0.getPort();
        java.lang.String str6 = mongoProperties0.getUsername();
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str7 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        java.lang.String str7 = mongoProperties0.database;
        java.lang.Integer int8 = mongoProperties0.port;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.heartbeatFrequency(100000);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatConnectTimeout(120);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
        int int1 = java.lang.Integer.numberOfTrailingZeros(8192);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
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
        char[] charArray12 = mongoProperties0.password;
        mongoProperties0.database = "100";
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions1.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
        int int2 = java.lang.Integer.rotateLeft(512, 1250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2048 + "'", int2 == 2048);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
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
        org.springframework.core.env.Environment environment17 = null;
        int int18 = mongoProperties0.determinePort(environment17);
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
        java.lang.String str1 = java.lang.Integer.toBinaryString(2013265920);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111000000000000000000000000000" + "'", str1, "1111000000000000000000000000000");
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.Integer int11 = mongoProperties0.getPort();
        java.lang.String str12 = mongoProperties0.gridFsDatabase;
        mongoProperties0.port = 536870912;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.localThreshold(9);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.serverSelectionTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.description("test");
        com.mongodb.MongoClientOptions.Builder builder22 = builder16.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        java.lang.String str32 = mongoClientOptions31.getDescription();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions31);
        int int34 = mongoClientOptions31.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder35 = com.mongodb.MongoClientOptions.builder(mongoClientOptions31);
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
        int int48 = mongoClientOptions46.getLocalThreshold();
        int int49 = mongoClientOptions46.getMaxConnectionIdleTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry50 = mongoClientOptions46.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder51 = builder35.codecRegistry(codecRegistry50);
        com.mongodb.MongoClientOptions.Builder builder52 = builder24.codecRegistry(codecRegistry50);
        com.mongodb.MongoClientOptions.Builder builder53 = builder3.codecRegistry(codecRegistry50);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder55 = builder53.heartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: heartbeatFrequency must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 500 + "'", int34 == 500);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 15 + "'", int48 == 15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(codecRegistry50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
        int int2 = java.lang.Integer.sum(11, 23564);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23575 + "'", int2 == 23575);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.database;
        mongoProperties17.setHost("mongodb://localhost/test");
        java.lang.String str21 = mongoProperties17.getHost();
        com.mongodb.MongoClientOptions.Builder builder22 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        int int24 = mongoClientOptions23.getHeartbeatConnectTimeout();
        int int25 = mongoClientOptions23.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties17.builder(mongoClientOptions23);
        javax.net.SocketFactory socketFactory27 = mongoClientOptions23.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions23);
        java.lang.Class<?> wildcardClass29 = builder28.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "test" + "'", str15, "test");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
        int int1 = java.lang.Integer.parseInt("1261534");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1261534 + "'", int1 == 1261534);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
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
        mongoProperties0.setUsername("111100101110110011000000000");
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
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        int int1 = java.lang.Integer.reverseBytes(736557408);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1626990123 + "'", int1 == 1626990123);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
        int int2 = java.lang.Integer.compareUnsigned(1889533965, (-1916216192));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
        java.lang.String str2 = java.lang.Integer.toString(1776, 1410560);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1776" + "'", str2, "1776");
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.port = 16;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.serverSelectionTimeout(580061184);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.description("");
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.description("test");
        com.mongodb.MongoClientOptions.Builder builder27 = builder21.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder29 = builder21.serverSelectionTimeout((-1));
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.description("");
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder38 = builder32.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder48 = builder45.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder54 = builder50.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder55 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder55.build();
        boolean boolean57 = mongoClientOptions56.isCursorFinalizerEnabled();
        int int58 = mongoClientOptions56.getHeartbeatConnectTimeout();
        int int59 = mongoClientOptions56.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference60 = mongoClientOptions56.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder61 = builder50.readPreference(readPreference60);
        com.mongodb.MongoClientOptions.Builder builder62 = builder44.readPreference(readPreference60);
        com.mongodb.MongoClientOptions.Builder builder63 = builder21.readPreference(readPreference60);
        com.mongodb.MongoClientOptions.Builder builder64 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions65 = builder64.build();
        boolean boolean66 = mongoClientOptions65.isCursorFinalizerEnabled();
        int int67 = mongoClientOptions65.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern68 = mongoClientOptions65.getWriteConcern();
        com.mongodb.WriteConcern writeConcern69 = mongoClientOptions65.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder70 = builder63.writeConcern(writeConcern69);
        com.mongodb.MongoClientOptions.Builder builder71 = builder12.writeConcern(writeConcern69);
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
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 20000 + "'", int58 == 20000);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(readPreference60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoClientOptions65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 20000 + "'", int67 == 20000);
        org.junit.Assert.assertNotNull(writeConcern68);
        org.junit.Assert.assertNotNull(writeConcern69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        org.springframework.core.env.Environment environment7 = null;
        int int8 = mongoProperties0.determinePort(environment7);
        com.mongodb.MongoClientOptions.Builder builder9 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions10);
        java.lang.String str13 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
        java.lang.String str2 = java.lang.Integer.toString(215, 399297740);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "215" + "'", str2, "215");
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
        int int2 = java.lang.Integer.divideUnsigned(200, 1250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
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
        boolean boolean19 = mongoClientOptions13.isAlwaysUseMBeans();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        mongoProperties0.database = "5000000";
        org.springframework.core.env.Environment environment7 = null;
        int int8 = mongoProperties0.determinePort(environment7);
        mongoProperties0.setHost("1000000000000000000000000000010");
        mongoProperties0.port = 50000000;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatSocketTimeout(65536);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(10060000, 1677721600);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10060000" + "'", str2, "10060000");
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
        int int2 = java.lang.Integer.remainderUnsigned(220000000, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
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
        boolean boolean11 = mongoClientOptions6.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("cae0000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"cae0000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
        int int2 = java.lang.Integer.min(177, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        int int1 = java.lang.Integer.lowestOneBit(1200000123);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        int int5 = mongoProperties0.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties6.authenticationDatabase = "12";
        boolean boolean9 = mongoProperties6.hasCustomAddress();
        mongoProperties6.setUri("");
        int int12 = mongoProperties6.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int14 = mongoProperties13.port;
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties13.builder(mongoClientOptions15);
        mongoProperties13.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray26 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties19.password = charArray26;
        java.lang.String str28 = mongoProperties19.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.database;
        java.lang.String str31 = mongoProperties29.authenticationDatabase;
        java.lang.Integer int32 = mongoProperties29.port;
        java.lang.Class<java.lang.Integer> intClass33 = java.lang.Integer.TYPE;
        mongoProperties29.fieldNamingStrategy = intClass33;
        mongoProperties19.setFieldNamingStrategy(intClass33);
        mongoProperties13.fieldNamingStrategy = intClass33;
        mongoProperties6.fieldNamingStrategy = intClass33;
        mongoProperties0.setFieldNamingStrategy(intClass33);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int40 = mongoProperties39.port;
        mongoProperties39.setAuthenticationDatabase("");
        java.lang.Integer int43 = mongoProperties39.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray51 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties44.password = charArray51;
        mongoProperties39.setPassword(charArray51);
        mongoProperties39.setHost("12");
        mongoProperties39.database = "97";
        java.lang.String str58 = mongoProperties39.getHost();
        java.lang.String str59 = mongoProperties39.getAuthenticationDatabase();
        char[] charArray60 = mongoProperties39.getPassword();
        mongoProperties0.password = charArray60;
        boolean boolean62 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(intClass33);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "12" + "'", str58, "12");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52" + "'", str1, "52");
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
        long long1 = java.lang.Integer.toUnsignedLong(838886399);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 838886399L + "'", long1 == 838886399L);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        boolean boolean7 = mongoClientOptions1.isAlwaysUseMBeans();
        boolean boolean8 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int9 = mongoClientOptions1.getHeartbeatSocketTimeout();
        int int10 = mongoClientOptions1.getServerSelectionTimeout();
        int int11 = mongoClientOptions1.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(commandListenerList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30000 + "'", int10 == 30000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setUri("ffffffff");
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.cursorFinalizerEnabled(false);
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
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions32.getDbDecoderFactory();
        int int35 = mongoClientOptions32.getSocketTimeout();
        int int36 = mongoClientOptions32.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern37 = mongoClientOptions32.getReadConcern();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions32.getSocketFactory();
        com.mongodb.WriteConcern writeConcern39 = mongoClientOptions32.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder40 = builder19.writeConcern(writeConcern39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.cursorFinalizerEnabled(false);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 500 + "'", int36 == 500);
        org.junit.Assert.assertNotNull(readConcern37);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertNotNull(writeConcern39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray13 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties6.password = charArray13;
        java.lang.Class<java.lang.Integer> intClass15 = java.lang.Integer.TYPE;
        mongoProperties6.fieldNamingStrategy = intClass15;
        java.lang.String str17 = mongoProperties6.username;
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties6.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions20);
        mongoProperties6.setUsername("34");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory36 = mongoClientOptions34.getDbDecoderFactory();
        int int37 = mongoClientOptions34.getSocketTimeout();
        int int38 = mongoClientOptions34.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties6.builder(mongoClientOptions34);
        int int40 = mongoClientOptions34.getLocalThreshold();
        int int41 = mongoClientOptions34.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties0.builder(mongoClientOptions34);
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
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions53);
        int int57 = mongoClientOptions53.getHeartbeatFrequency();
        int int58 = mongoClientOptions53.getLocalThreshold();
        java.lang.String str59 = mongoClientOptions53.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder60 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions53);
        com.mongodb.DBEncoderFactory dBEncoderFactory61 = mongoClientOptions53.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties0.builder(mongoClientOptions53);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList63 = mongoClientOptions53.getCommandListeners();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(dBDecoderFactory36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClient46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10000 + "'", int57 == 10000);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 15 + "'", int58 == 15);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(dBEncoderFactory61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(commandListenerList63);
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
        int int1 = java.lang.Integer.parseUnsignedInt("120035");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 120035 + "'", int1 == 120035);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        java.lang.String str15 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setPort((java.lang.Integer) 52);
        mongoProperties0.setGridFsDatabase("161056");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "test" + "'", str15, "test");
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        java.lang.String str1 = java.lang.Integer.toString((-1916216192));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1916216192" + "'", str1, "-1916216192");
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        java.lang.Class<java.lang.Integer> intClass13 = java.lang.Integer.TYPE;
        mongoProperties0.setFieldNamingStrategy(intClass13);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.database;
        java.lang.String str17 = mongoProperties15.authenticationDatabase;
        java.lang.Class<?> wildcardClass18 = mongoProperties15.fieldNamingStrategy;
        mongoProperties15.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties15.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        java.lang.String str32 = mongoClientOptions31.getDescription();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties15.builder(mongoClientOptions31);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.springframework.core.env.Environment environment36 = null;
        com.mongodb.MongoClient mongoClient37 = mongoProperties34.createMongoClient(mongoClientOptions35, environment36);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder41 = builder38.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties34.builder(mongoClientOptions44);
        int int46 = mongoClientOptions44.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList47 = mongoClientOptions44.getCommandListeners();
        int int48 = mongoClientOptions44.getLocalThreshold();
        int int49 = mongoClientOptions44.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties15.builder(mongoClientOptions44);
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties0.builder(mongoClientOptions44);
        java.lang.String str52 = mongoProperties0.getHost();
        mongoProperties0.setHost("536870912");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(intClass13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClient37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(commandListenerList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 15 + "'", int48 == 15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(str52);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
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
        com.mongodb.MongoClientOptions.Builder builder18 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        boolean boolean20 = mongoClientOptions19.isSslEnabled();
        org.bson.codecs.configuration.CodecRegistry codecRegistry21 = mongoClientOptions19.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions19);
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(codecRegistry21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("10741506000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 10741506000 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder2.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        int int1 = java.lang.Integer.lowestOneBit(1073741826);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("100010100100110000100000000000", 7803356);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 7803356 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
        int int1 = java.lang.Integer.parseUnsignedInt("1114112");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1114112 + "'", int1 == 1114112);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("35");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionIdleTime(52);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.socketKeepAlive(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
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
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        boolean boolean15 = mongoClientOptions10.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str9 = mongoClientOptions6.getRequiredReplicaSetName();
        int int10 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions6.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int14 = mongoClientOptions6.getConnectTimeout();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions6.getWriteConcern();
        int int16 = mongoClientOptions6.getSocketTimeout();
        int int17 = mongoClientOptions6.getHeartbeatFrequency();
        int int18 = mongoClientOptions6.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions6.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120000 + "'", int18 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
        java.lang.String str1 = java.lang.Integer.toOctalString(1090519040);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10100000000" + "'", str1, "10100000000");
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.requiredReplicaSetName("16");
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.maxConnectionIdleTime(35);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.serverSelectionTimeout((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
        int int1 = java.lang.Integer.reverse(474955779);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1073548744) + "'", int1 == (-1073548744));
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
        int int2 = java.lang.Integer.compareUnsigned(2329, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
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
        int int26 = mongoProperties0.getDEFAULT_PORT();
        boolean boolean27 = mongoProperties0.hasCustomCredentials();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27017 + "'", int26 == 27017);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        com.mongodb.MongoClientOptions.Builder builder6 = mongoProperties0.builder(mongoClientOptions5);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2000000000");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.database;
        mongoProperties0.setAuthenticationDatabase("34");
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str15 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder16 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        int int18 = mongoClientOptions17.getHeartbeatConnectTimeout();
        int int19 = mongoClientOptions17.getConnectionsPerHost();
        int int20 = mongoClientOptions17.getHeartbeatSocketTimeout();
        javax.net.SocketFactory socketFactory21 = mongoClientOptions17.getSocketFactory();
        java.lang.String str22 = mongoClientOptions17.getRequiredReplicaSetName();
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties0.createMongoClient(mongoClientOptions17, environment23);
        int int25 = mongoClientOptions17.getMinConnectionsPerHost();
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
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertNotNull(socketFactory21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(mongoClient24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        mongoProperties0.setDatabase("35");
        mongoProperties0.authenticationDatabase = "11034880";
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
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties0.builder(mongoClientOptions18);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.database;
        java.lang.String str28 = mongoProperties26.getAuthenticationDatabase();
        mongoProperties26.host = "hi!";
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList43 = mongoClientOptions41.getCommandListeners();
        int int44 = mongoClientOptions41.getMaxConnectionIdleTime();
        org.springframework.core.env.Environment environment45 = null;
        com.mongodb.MongoClient mongoClient46 = mongoProperties26.createMongoClient(mongoClientOptions41, environment45);
        int int47 = mongoClientOptions41.getThreadsAllowedToBlockForConnectionMultiplier();
        int int48 = mongoClientOptions41.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient50 = mongoProperties0.createMongoClient(mongoClientOptions41, environment49);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoException; message: host and port should be specified in host:port format");
        } catch (com.mongodb.MongoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(commandListenerList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(mongoClient46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
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
        com.mongodb.ReadConcern readConcern64 = mongoClientOptions52.getReadConcern();
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
        org.junit.Assert.assertNotNull(readConcern64);
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
        java.lang.String str1 = java.lang.Integer.toString(2048);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2048" + "'", str1, "2048");
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatSocketTimeout(22930800);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.sslEnabled(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int15 = mongoProperties14.port;
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties14.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder27 = builder24.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        java.lang.String str31 = mongoClientOptions30.getDescription();
        int int32 = mongoClientOptions30.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str33 = mongoClientOptions30.getRequiredReplicaSetName();
        int int34 = mongoClientOptions30.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern35 = mongoClientOptions30.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder36 = builder19.readConcern(readConcern35);
        com.mongodb.MongoClientOptions.Builder builder37 = builder13.readConcern(readConcern35);
        com.mongodb.MongoClientOptions.Builder builder39 = builder13.socketTimeout(52);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10000 + "'", int34 == 10000);
        org.junit.Assert.assertNotNull(readConcern35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int25 = mongoProperties24.port;
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties24.builder(mongoClientOptions26);
        mongoProperties24.port = 1;
        java.lang.String str30 = mongoProperties24.getMongoClientDatabase();
        java.lang.String str31 = mongoProperties24.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder32 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        int int34 = mongoClientOptions33.getHeartbeatConnectTimeout();
        int int35 = mongoClientOptions33.getConnectionsPerHost();
        int int36 = mongoClientOptions33.getHeartbeatSocketTimeout();
        org.springframework.core.env.Environment environment37 = null;
        com.mongodb.MongoClient mongoClient38 = mongoProperties24.createMongoClient(mongoClientOptions33, environment37);
        com.mongodb.ReadConcern readConcern39 = mongoClientOptions33.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions33);
        com.mongodb.DBDecoderFactory dBDecoderFactory41 = mongoClientOptions33.getDbDecoderFactory();
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
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "test" + "'", str30, "test");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertNotNull(mongoClient38);
        org.junit.Assert.assertNotNull(readConcern39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(dBDecoderFactory41);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getSocketTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.database;
        java.lang.String str9 = mongoProperties7.authenticationDatabase;
        java.lang.String str10 = mongoProperties7.getMongoClientDatabase();
        java.lang.String str11 = mongoProperties7.uri;
        mongoProperties7.port = 100;
        java.lang.String str14 = mongoProperties7.gridFsDatabase;
        boolean boolean15 = mongoClientOptions1.equals((java.lang.Object) mongoProperties7);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int17 = mongoProperties16.port;
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties16.builder(mongoClientOptions18);
        mongoProperties16.port = 1;
        java.lang.String str22 = mongoProperties16.getMongoClientDatabase();
        org.springframework.core.env.Environment environment23 = null;
        int int24 = mongoProperties16.determinePort(environment23);
        com.mongodb.MongoClientOptions.Builder builder25 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties16.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions26);
        int int30 = mongoClientOptions26.getHeartbeatConnectTimeout();
        org.springframework.core.env.Environment environment31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties7.createMongoClient(mongoClientOptions26, environment31);
        mongoProperties7.setUri("100101010000001011111001");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "test" + "'", str22, "test");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertNotNull(mongoClient32);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("214d1d80", 2048);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 2048 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.serverSelectionTimeout(37748736);
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList31 = mongoClientOptions29.getCommandListeners();
        java.lang.String str32 = mongoClientOptions29.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory33 = mongoClientOptions29.getDbEncoderFactory();
        int int34 = mongoClientOptions29.getServerSelectionTimeout();
        com.mongodb.WriteConcern writeConcern35 = mongoClientOptions29.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder36 = builder16.writeConcern(writeConcern35);
        com.mongodb.MongoClientOptions.Builder builder38 = builder16.alwaysUseMBeans(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        org.springframework.core.env.Environment environment41 = null;
        com.mongodb.MongoClient mongoClient42 = mongoProperties39.createMongoClient(mongoClientOptions40, environment41);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder46 = builder43.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties39.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.maxConnectionLifeTime(167772160);
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder56 = builder52.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder57 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions58 = builder57.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList59 = mongoClientOptions58.getCommandListeners();
        javax.net.SocketFactory socketFactory60 = mongoClientOptions58.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder61 = builder52.socketFactory(socketFactory60);
        com.mongodb.MongoClientOptions.Builder builder62 = builder16.socketFactory(socketFactory60);
        com.mongodb.MongoClientOptions.Builder builder64 = builder16.localThreshold((int) (short) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClient22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(commandListenerList31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(dBEncoderFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 30000 + "'", int34 == 30000);
        org.junit.Assert.assertNotNull(writeConcern35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClient42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
        org.junit.Assert.assertNotNull(commandListenerList59);
        org.junit.Assert.assertNotNull(socketFactory60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
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
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.event.CommandListener commandListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.addCommandListener(commandListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
        int int2 = java.lang.Integer.rotateLeft(256, 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 256 + "'", int2 == 256);
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("2000000000", 32785);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 32785 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setDatabase("1111111111111111111111111111111");
        mongoProperties0.port = (-503054336);
        mongoProperties0.username = "3548381184";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("5000000");
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(6);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.description("2048");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        mongoProperties0.host = "1200000000";
        int int8 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        mongoProperties0.database = "mongodb://localhost/test";
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList25 = mongoClientOptions23.getCommandListeners();
        int int26 = mongoClientOptions23.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList27 = mongoClientOptions23.getCommandListeners();
        boolean boolean28 = mongoClientOptions23.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        java.lang.String str30 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass31 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(commandListenerList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(commandListenerList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
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
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int15 = mongoClientOptions10.getHeartbeatFrequency();
        boolean boolean16 = mongoClientOptions10.isCursorFinalizerEnabled();
        boolean boolean17 = mongoClientOptions10.isAlwaysUseMBeans();
        java.lang.String str18 = mongoClientOptions10.getDescription();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("101000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"101000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.String str5 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "1";
        java.lang.String str8 = mongoProperties0.uri;
        mongoProperties0.authenticationDatabase = "10c944";
        java.lang.String str11 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        java.lang.Integer int5 = mongoProperties0.port;
        mongoProperties0.setDatabase("141");
        java.lang.String str8 = mongoProperties0.getHost();
        java.lang.String str9 = mongoProperties0.uri;
        java.lang.String str10 = mongoProperties0.database;
        org.springframework.core.env.Environment environment11 = null;
        int int12 = mongoProperties0.determinePort(environment11);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "141" + "'", str10, "141");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        boolean boolean4 = mongoClientOptions1.isSslEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions1.getDbEncoderFactory();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions1.getMinConnectionsPerHost();
        int int8 = mongoClientOptions1.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("6400000000", 838860799);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 838860799 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        int int2 = java.lang.Integer.divideUnsigned(9765651, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(127362600);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "127362600" + "'", str1, "127362600");
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        java.lang.String str1 = java.lang.Integer.toString((-994836476));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-994836476" + "'", str1, "-994836476");
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        java.lang.String str15 = mongoProperties0.getUsername();
        java.lang.String str16 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionLifeTime(167772160);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.socketTimeout(67108864);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        java.lang.String str25 = mongoClientOptions24.getDescription();
        int int26 = mongoClientOptions24.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str27 = mongoClientOptions24.getRequiredReplicaSetName();
        int int28 = mongoClientOptions24.getHeartbeatFrequency();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions24.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder17.socketFactory(socketFactory29);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10000 + "'", int28 == 10000);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
        int int2 = java.lang.Integer.compare(177, 161056);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"f\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
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
        boolean boolean19 = mongoProperties0.hasCustomAddress();
        java.lang.String str20 = mongoProperties0.getGridFsDatabase();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("34e7e76");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"34e7e76\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.database;
        java.lang.String str17 = mongoProperties15.authenticationDatabase;
        java.lang.String str18 = mongoProperties15.getMongoClientDatabase();
        java.lang.String str19 = mongoProperties15.database;
        java.lang.String str20 = mongoProperties15.getDatabase();
        boolean boolean21 = mongoClientOptions10.equals((java.lang.Object) mongoProperties15);
        int int22 = mongoClientOptions10.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions10.getWriteConcern();
        int int24 = mongoClientOptions10.getServerSelectionTimeout();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int26 = mongoClientOptions10.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "test" + "'", str18, "test");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30000 + "'", int24 == 30000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
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
        java.lang.String str20 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str21 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "97" + "'", str20, "97");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97" + "'", str21, "97");
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
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
        java.lang.String str18 = mongoProperties0.gridFsDatabase;
        java.lang.Integer int19 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder20 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        int int23 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions21.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions21, environment27);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray36 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties29.password = charArray36;
        java.lang.String str38 = mongoProperties29.database;
        char[] charArray39 = mongoProperties29.getPassword();
        mongoProperties29.database = "mongodb://localhost/test";
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList54 = mongoClientOptions52.getCommandListeners();
        int int55 = mongoClientOptions52.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList56 = mongoClientOptions52.getCommandListeners();
        boolean boolean57 = mongoClientOptions52.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties29.builder(mongoClientOptions52);
        org.springframework.core.env.Environment environment59 = null;
        com.mongodb.MongoClient mongoClient60 = mongoProperties0.createMongoClient(mongoClientOptions52, environment59);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 500 + "'", int25 == 500);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(commandListenerList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(commandListenerList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClient60);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder15.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder25 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        boolean boolean27 = mongoClientOptions26.isCursorFinalizerEnabled();
        int int28 = mongoClientOptions26.getHeartbeatConnectTimeout();
        int int29 = mongoClientOptions26.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference30 = mongoClientOptions26.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder31 = builder20.readPreference(readPreference30);
        com.mongodb.MongoClientOptions.Builder builder32 = builder14.readPreference(readPreference30);
        org.bson.codecs.configuration.CodecRegistry codecRegistry33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder34 = builder32.codecRegistry(codecRegistry33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: codecRegistry can not be null");
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(readPreference30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
        int int1 = java.lang.Integer.numberOfLeadingZeros(10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
        int int2 = java.lang.Integer.min((int) (byte) -1, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
        int int2 = java.lang.Integer.remainderUnsigned(8, 2013265920);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
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
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        boolean boolean13 = mongoClientOptions9.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        boolean boolean15 = mongoClientOptions9.isSslInvalidHostNameAllowed();
        int int16 = mongoClientOptions9.getHeartbeatFrequency();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
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
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int16 = mongoClientOptions10.getServerSelectionTimeout();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30000 + "'", int16 == 30000);
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("1250");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1250");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("-1");
        java.lang.String str6 = mongoProperties0.getDatabase();
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.uri = "2147510664";
        java.lang.String str10 = mongoProperties0.username;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1" + "'", str10, "-1");
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.socketTimeout(5000000);
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
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
        int int1 = java.lang.Integer.parseUnsignedInt("67108864");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
        java.lang.String str1 = java.lang.Integer.toHexString(176320);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2b0c0" + "'", str1, "2b0c0");
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
        java.lang.String str1 = java.lang.Integer.toString((-1006632930));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1006632930" + "'", str1, "-1006632930");
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1111000000000000000000000000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.host = "111000100000000000000000001000";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
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
        java.lang.Class<?> wildcardClass45 = mongoClientOptions36.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
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
        com.mongodb.MongoClientOptions.Builder builder24 = builder5.socketTimeout(131072);
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
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
        int int2 = java.lang.Integer.min(200, 37);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
        int int2 = java.lang.Integer.parseUnsignedInt("536870912", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2017510370) + "'", int2 == (-2017510370));
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("127362560", 27528);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 27528 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
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
        int int38 = mongoClientOptions24.getHeartbeatConnectTimeout();
        java.lang.String str39 = mongoClientOptions24.getDescription();
        int int40 = mongoClientOptions24.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
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
        mongoProperties0.uri = "6400000000";
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
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder13 = builder6.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.database;
        mongoProperties14.setHost("mongodb://localhost/test");
        java.lang.String str18 = mongoProperties14.getHost();
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getHeartbeatConnectTimeout();
        int int22 = mongoClientOptions20.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties14.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions20.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder26 = builder6.dbEncoderFactory(dBEncoderFactory25);
        com.mongodb.MongoClientOptions.Builder builder27 = builder3.dbEncoderFactory(dBEncoderFactory25);
        com.mongodb.MongoClientOptions.Builder builder29 = builder3.threadsAllowedToBlockForConnectionMultiplier((int) '#');
        com.mongodb.MongoClientOptions.Builder builder31 = builder3.connectionsPerHost(110100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        mongoProperties0.uri = "97";
        mongoProperties0.clearPassword();
        mongoProperties0.setAuthenticationDatabase("");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
        int int2 = java.lang.Integer.rotateLeft((-301989888), (-570425344));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-301989888) + "'", int2 == (-301989888));
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("100101010000001011111001", (-1275067196));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1275067196 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
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
        com.mongodb.ReadConcern readConcern19 = mongoClientOptions16.getReadConcern();
        int int20 = mongoClientOptions16.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions16.getDbDecoderFactory();
        java.lang.String str22 = mongoClientOptions16.getRequiredReplicaSetName();
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
        org.junit.Assert.assertNotNull(readConcern19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
        java.lang.String str1 = java.lang.Integer.toOctalString(27);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "33" + "'", str1, "33");
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        boolean boolean21 = mongoClientOptions20.isCursorFinalizerEnabled();
        int int22 = mongoClientOptions20.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions20.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = builder18.writeConcern(writeConcern23);
        com.mongodb.MongoClientOptions.Builder builder25 = builder8.writeConcern(writeConcern23);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.maxConnectionIdleTime(16);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder29.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
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
        int int34 = mongoClientOptions27.getSocketTimeout();
        java.lang.String str35 = mongoClientOptions27.getDescription();
        int int36 = mongoClientOptions27.getHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10000 + "'", int36 == 10000);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.database;
        java.lang.String str32 = mongoProperties30.authenticationDatabase;
        java.lang.String str33 = mongoProperties30.getMongoClientDatabase();
        java.lang.String str34 = mongoProperties30.uri;
        char[] charArray35 = mongoProperties30.password;
        mongoProperties30.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.springframework.core.env.Environment environment39 = null;
        com.mongodb.MongoClient mongoClient40 = mongoProperties37.createMongoClient(mongoClientOptions38, environment39);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder44 = builder41.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties37.builder(mongoClientOptions47);
        int int49 = mongoClientOptions47.getLocalThreshold();
        org.springframework.core.env.Environment environment50 = null;
        com.mongodb.MongoClient mongoClient51 = mongoProperties30.createMongoClient(mongoClientOptions47, environment50);
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        int int53 = mongoClientOptions47.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties0.builder(mongoClientOptions47);
        org.bson.codecs.configuration.CodecRegistry codecRegistry55 = mongoClientOptions47.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties57 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str58 = mongoProperties57.database;
        java.lang.String str59 = mongoProperties57.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties60 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int61 = mongoProperties60.port;
        mongoProperties60.setUri("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties64 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray71 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties64.password = charArray71;
        mongoProperties60.password = charArray71;
        mongoProperties57.password = charArray71;
        java.lang.String str75 = mongoProperties57.getDatabase();
        java.lang.String str76 = mongoProperties57.getDatabase();
        mongoProperties57.setUsername("35");
        java.lang.String str79 = mongoProperties57.uri;
        org.springframework.core.env.Environment environment80 = null;
        int int81 = mongoProperties57.determinePort(environment80);
        boolean boolean82 = mongoClientOptions47.equals((java.lang.Object) int81);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "test" + "'", str33, "test");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "mongodb://localhost/test" + "'", str34, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertNotNull(mongoClient51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 120000 + "'", int53 == 120000);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(codecRegistry55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "mongodb://localhost/test" + "'", str59, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "mongodb://localhost/test" + "'", str79, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 27017 + "'", int81 == 27017);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("", 268828672);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 268828672 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("35");
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.socketTimeout((-2147483648));
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder12 = builder9.requiredReplicaSetName("10100000000");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        mongoProperties0.setHost("141");
        mongoProperties0.authenticationDatabase = "23420000";
        java.lang.String str10 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 2048);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "141" + "'", str10, "141");
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.database;
        mongoProperties10.setHost("mongodb://localhost/test");
        java.lang.String str14 = mongoProperties10.getHost();
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        int int17 = mongoClientOptions16.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions16.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties10.builder(mongoClientOptions16);
        javax.net.SocketFactory socketFactory20 = mongoClientOptions16.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory21 = mongoClientOptions16.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder2.dbEncoderFactory(dBEncoderFactory21);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.connectionsPerHost(30000);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder35 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        int int37 = mongoClientOptions36.getHeartbeatConnectTimeout();
        int int38 = mongoClientOptions36.getMaxConnectionIdleTime();
        int int39 = mongoClientOptions36.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions36);
        org.bson.codecs.configuration.CodecRegistry codecRegistry41 = mongoClientOptions36.getCodecRegistry();
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions36.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder43 = builder30.dbDecoderFactory(dBDecoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder44 = builder24.dbDecoderFactory(dBDecoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder46 = builder24.heartbeatFrequency(32768);
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.requiredReplicaSetName("566418188");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertNotNull(dBEncoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20000 + "'", int37 == 20000);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertNotNull(codecRegistry41);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
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
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient18);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("34");
        java.lang.String str7 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray15 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties8.password = charArray15;
        java.lang.Class<java.lang.Integer> intClass17 = java.lang.Integer.TYPE;
        mongoProperties8.fieldNamingStrategy = intClass17;
        java.lang.String str19 = mongoProperties8.username;
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties8.builder(mongoClientOptions20);
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
        java.lang.String str38 = mongoClientOptions32.getDescription();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        boolean boolean40 = mongoClientOptions32.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder41 = com.mongodb.MongoClientOptions.builder(mongoClientOptions32);
        org.springframework.core.env.Environment environment42 = null;
        com.mongodb.MongoClient mongoClient43 = mongoProperties8.createMongoClient(mongoClientOptions32, environment42);
        int int44 = mongoClientOptions32.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties0.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        int int47 = mongoClientOptions32.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClient43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10000 + "'", int44 == 10000);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20000 + "'", int47 == 20000);
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("5242944", 37);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 37 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.getDatabase();
        mongoProperties0.host = "100";
        mongoProperties0.setDatabase("17");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
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
        com.mongodb.event.CommandListener commandListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.addCommandListener(commandListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatConnectTimeout(4194304);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketTimeout(808146084);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectTimeout(16);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.serverSelectionTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.description("");
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.localThreshold((int) (short) 0);
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
        com.mongodb.DBEncoderFactory dBEncoderFactory40 = mongoClientOptions36.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = builder21.dbEncoderFactory(dBEncoderFactory40);
        com.mongodb.MongoClientOptions.Builder builder42 = builder16.dbEncoderFactory(dBEncoderFactory40);
        com.mongodb.MongoClientOptions.Builder builder44 = builder16.maxWaitTime((int) (short) 1);
        java.lang.Class<?> wildcardClass45 = builder44.getClass();
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
        org.junit.Assert.assertNotNull(mongoClient29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandListenerList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(dBEncoderFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
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
        mongoProperties0.clearPassword();
        java.lang.String str21 = mongoProperties0.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray29 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties22.password = charArray29;
        java.lang.String str31 = mongoProperties22.database;
        java.lang.String str32 = mongoProperties22.getHost();
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
        int int45 = mongoClientOptions43.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions43);
        java.lang.String str47 = mongoClientOptions43.getDescription();
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions43);
        org.springframework.core.env.Environment environment49 = null;
        com.mongodb.MongoClient mongoClient50 = mongoProperties22.createMongoClient(mongoClientOptions43, environment49);
        int int51 = mongoClientOptions43.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions43);
        boolean boolean53 = mongoClientOptions43.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties0.builder(mongoClientOptions43);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder58 = builder55.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions61 = builder58.build();
        java.lang.String str62 = mongoClientOptions61.getDescription();
        int int63 = mongoClientOptions61.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str64 = mongoClientOptions61.getRequiredReplicaSetName();
        int int65 = mongoClientOptions61.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder66 = com.mongodb.MongoClientOptions.builder(mongoClientOptions61);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList67 = mongoClientOptions61.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder68 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions61);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties69 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions70 = null;
        org.springframework.core.env.Environment environment71 = null;
        com.mongodb.MongoClient mongoClient72 = mongoProperties69.createMongoClient(mongoClientOptions70, environment71);
        com.mongodb.MongoClientOptions.Builder builder73 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder75 = builder73.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder76 = builder73.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder78 = builder76.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions79 = builder76.build();
        com.mongodb.MongoClientOptions.Builder builder80 = mongoProperties69.builder(mongoClientOptions79);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList81 = mongoClientOptions79.getCommandListeners();
        java.lang.String str82 = mongoClientOptions79.getRequiredReplicaSetName();
        java.lang.String str83 = mongoClientOptions79.getDescription();
        int int84 = mongoClientOptions79.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder85 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions79);
        com.mongodb.MongoClientOptions.Builder builder86 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions87 = builder86.build();
        boolean boolean88 = mongoClientOptions87.isCursorFinalizerEnabled();
        int int89 = mongoClientOptions87.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern90 = mongoClientOptions87.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory91 = mongoClientOptions87.getDbEncoderFactory();
        javax.net.SocketFactory socketFactory92 = mongoClientOptions87.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder93 = builder85.socketFactory(socketFactory92);
        boolean boolean94 = mongoClientOptions61.equals((java.lang.Object) builder85);
        com.mongodb.DBDecoderFactory dBDecoderFactory95 = mongoClientOptions61.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder96 = builder54.dbDecoderFactory(dBDecoderFactory95);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "12" + "'", str21, "12");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(mongoClient50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(mongoClientOptions61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 15 + "'", int65 == 15);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(commandListenerList67);
        org.junit.Assert.assertNotNull(mongoClient72);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(mongoClientOptions79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(commandListenerList81);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 20000 + "'", int84 == 20000);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(mongoClientOptions87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 20000 + "'", int89 == 20000);
        org.junit.Assert.assertNotNull(writeConcern90);
        org.junit.Assert.assertNotNull(dBEncoderFactory91);
        org.junit.Assert.assertNotNull(socketFactory92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory95);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        int int1 = java.lang.Integer.reverse(127362560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6744544 + "'", int1 == 6744544);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.maxConnectionLifeTime(1);
        boolean boolean24 = mongoClientOptions6.equals((java.lang.Object) 1);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions6);
        boolean boolean28 = mongoClientOptions6.isCursorFinalizerEnabled();
        int int29 = mongoClientOptions6.getLocalThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
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
        boolean boolean38 = mongoClientOptions24.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        int int2 = java.lang.Integer.divideUnsigned(67108864, 1610612736);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
        int int2 = java.lang.Integer.divideUnsigned(16, (-994836476));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
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
        boolean boolean36 = mongoProperties0.hasCustomAddress();
        boolean boolean37 = mongoProperties0.hasCustomCredentials();
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
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
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
        com.mongodb.event.CommandListener commandListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder27 = builder25.addCommandListener(commandListener26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int12 = mongoClientOptions10.getMaxConnectionIdleTime();
        int int13 = mongoClientOptions10.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int15 = mongoClientOptions10.getMinConnectionsPerHost();
        int int16 = mongoClientOptions10.getLocalThreshold();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.socketFactory(socketFactory17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.threadsAllowedToBlockForConnectionMultiplier(123);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
        int int1 = java.lang.Integer.numberOfLeadingZeros(2013265920);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        int int1 = java.lang.Integer.bitCount(342288864);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
        int int2 = java.lang.Integer.compareUnsigned(353647361, 23420);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.database;
        mongoProperties0.authenticationDatabase = "test";
        mongoProperties0.setAuthenticationDatabase("100000");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("cae0000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"cae0000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray6 = mongoProperties0.getPassword();
        java.lang.String str7 = mongoProperties0.uri;
        java.lang.String str8 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("-536870913", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: -536870913");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.serverSelectionTimeout(399297740);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
        java.lang.String str1 = java.lang.Integer.toOctalString(43295);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "124437" + "'", str1, "124437");
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(209715200);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.alwaysUseMBeans(false);
        com.mongodb.event.CommandListener commandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder8.addCommandListener(commandListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
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
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
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
        boolean boolean36 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setUri("hi!");
        java.lang.String str39 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.uri = "100011100100000000000000000";
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
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        int int2 = java.lang.Integer.divideUnsigned(11010, 45435459);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
        int int1 = java.lang.Integer.lowestOneBit(6400000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2048 + "'", int1 == 2048);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.heartbeatFrequency(100000);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.description("10");
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.sslEnabled(true);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("100363501535", 50000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 50000000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
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
        java.lang.Integer int24 = mongoProperties0.port;
        java.lang.String str25 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("268435456", 27528);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 27528 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned((-2147483644), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        int int2 = java.lang.Integer.rotateRight((-1337982976), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1337982976) + "'", int2 == (-1337982976));
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("141", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 141");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
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
        mongoProperties0.setUri("5");
        java.lang.String str21 = mongoProperties0.host;
        com.mongodb.MongoClientOptions.Builder builder22 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions23.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties0.builder(mongoClientOptions23);
        mongoProperties0.port = 5242880;
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
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
        int int15 = mongoClientOptions10.getMinConnectionsPerHost();
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions10.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int18 = mongoClientOptions10.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.database;
        java.lang.String str32 = mongoProperties30.authenticationDatabase;
        java.lang.String str33 = mongoProperties30.getMongoClientDatabase();
        java.lang.String str34 = mongoProperties30.uri;
        char[] charArray35 = mongoProperties30.password;
        mongoProperties30.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.springframework.core.env.Environment environment39 = null;
        com.mongodb.MongoClient mongoClient40 = mongoProperties37.createMongoClient(mongoClientOptions38, environment39);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder44 = builder41.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties37.builder(mongoClientOptions47);
        int int49 = mongoClientOptions47.getLocalThreshold();
        org.springframework.core.env.Environment environment50 = null;
        com.mongodb.MongoClient mongoClient51 = mongoProperties30.createMongoClient(mongoClientOptions47, environment50);
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        int int53 = mongoClientOptions47.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties0.builder(mongoClientOptions47);
        org.bson.codecs.configuration.CodecRegistry codecRegistry55 = mongoClientOptions47.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        int int57 = mongoClientOptions47.getSocketTimeout();
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "test" + "'", str33, "test");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "mongodb://localhost/test" + "'", str34, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertNotNull(mongoClient51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 120000 + "'", int53 == 120000);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(codecRegistry55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
        int int1 = java.lang.Integer.numberOfLeadingZeros(30000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.cursorFinalizerEnabled(false);
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
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions32.getDbDecoderFactory();
        int int35 = mongoClientOptions32.getSocketTimeout();
        int int36 = mongoClientOptions32.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern37 = mongoClientOptions32.getReadConcern();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions32.getSocketFactory();
        com.mongodb.WriteConcern writeConcern39 = mongoClientOptions32.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder40 = builder19.writeConcern(writeConcern39);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray48 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties41.password = charArray48;
        java.lang.Class<java.lang.Integer> intClass50 = java.lang.Integer.TYPE;
        mongoProperties41.fieldNamingStrategy = intClass50;
        java.lang.String str52 = mongoProperties41.username;
        com.mongodb.MongoClientOptions mongoClientOptions53 = null;
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties41.builder(mongoClientOptions53);
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties41.builder(mongoClientOptions55);
        mongoProperties41.setUsername("34");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory71 = mongoClientOptions69.getDbDecoderFactory();
        int int72 = mongoClientOptions69.getSocketTimeout();
        int int73 = mongoClientOptions69.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties41.builder(mongoClientOptions69);
        boolean boolean76 = mongoClientOptions69.equals((java.lang.Object) 500);
        int int77 = mongoClientOptions69.getConnectTimeout();
        int int78 = mongoClientOptions69.getServerSelectionTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry79 = mongoClientOptions69.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder80 = builder19.codecRegistry(codecRegistry79);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 500 + "'", int36 == 500);
        org.junit.Assert.assertNotNull(readConcern37);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertNotNull(writeConcern39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClient62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(dBDecoderFactory71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 15 + "'", int73 == 15);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10000 + "'", int77 == 10000);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 30000 + "'", int78 == 30000);
        org.junit.Assert.assertNotNull(codecRegistry79);
        org.junit.Assert.assertNotNull(builder80);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("31000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 31000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionLifeTime(167772160);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.cursorFinalizerEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder17.connectionsPerHost((-503054336));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectionPerHost must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("1f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1f\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-2147483644));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000000000000000000000000100" + "'", str1, "10000000000000000000000000000100");
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
        int int2 = java.lang.Integer.min(32785, 5000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32785 + "'", int2 == 32785);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
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
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int16 = mongoClientOptions10.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 500 + "'", int16 == 500);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
        int int1 = java.lang.Integer.highestOneBit(28);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("0");
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.String str6 = mongoProperties0.username;
        mongoProperties0.gridFsDatabase = "hi!";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
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
        boolean boolean20 = mongoProperties0.hasCustomCredentials();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
        int int2 = java.lang.Integer.sum(1, 50000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50000001 + "'", int2 == 50000001);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
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
        int int17 = mongoClientOptions10.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.alwaysUseMBeans(true);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
        java.lang.String str1 = java.lang.Integer.toHexString(27);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1b" + "'", str1, "1b");
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str9 = mongoClientOptions6.getRequiredReplicaSetName();
        int int10 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList12 = mongoClientOptions6.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int14 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        javax.net.SocketFactory socketFactory17 = mongoClientOptions6.getSocketFactory();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray25 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties18.password = charArray25;
        boolean boolean27 = mongoClientOptions6.equals((java.lang.Object) mongoProperties18);
        mongoProperties18.port = 353647361;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
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
        com.mongodb.ReadConcern readConcern15 = mongoClientOptions10.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        java.lang.Class<?> wildcardClass18 = mongoClientOptions17.getClass();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory14);
        org.junit.Assert.assertNotNull(readConcern15);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatConnectTimeout(83886080);
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
        com.mongodb.MongoClientOptions.Builder builder29 = builder15.dbDecoderFactory(dBDecoderFactory28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder6.dbDecoderFactory(dBDecoderFactory28);
        com.mongodb.MongoClientOptions.Builder builder32 = builder6.sslEnabled(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(dBDecoderFactory28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions5.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions5.getSocketFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertNotNull(socketFactory11);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setPort((java.lang.Integer) 8);
        mongoProperties0.gridFsDatabase = "1111111111111111111111111111111";
        java.lang.String str17 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str18 = mongoProperties0.username;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "test" + "'", str17, "test");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        mongoProperties0.username = "test";
        mongoProperties0.setDatabase("80");
        mongoProperties0.setUsername("");
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        boolean boolean18 = mongoClientOptions16.isSslEnabled();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions16, environment19);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray28 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties21.password = charArray28;
        java.lang.Class<java.lang.Integer> intClass30 = java.lang.Integer.TYPE;
        mongoProperties21.fieldNamingStrategy = intClass30;
        java.lang.String str32 = mongoProperties21.username;
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties21.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions35);
        mongoProperties21.setUsername("34");
        mongoProperties21.setPort((java.lang.Integer) 120000);
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties21.builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder43 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder43.build();
        boolean boolean45 = mongoClientOptions44.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList46 = mongoClientOptions44.getCommandListeners();
        boolean boolean47 = mongoClientOptions44.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern48 = mongoClientOptions44.getWriteConcern();
        boolean boolean49 = mongoClientOptions44.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties21.builder(mongoClientOptions44);
        int int51 = mongoClientOptions44.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions44);
        int int53 = mongoClientOptions44.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(commandListenerList46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(writeConcern48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 120000 + "'", int51 == 120000);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
        int int1 = java.lang.Integer.reverseBytes(111110100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-731406586) + "'", int1 == (-731406586));
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
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
        boolean boolean35 = mongoClientOptions28.equals((java.lang.Object) 500);
        java.lang.String str36 = mongoClientOptions28.getRequiredReplicaSetName();
        boolean boolean37 = mongoClientOptions28.isCursorFinalizerEnabled();
        int int38 = mongoClientOptions28.getHeartbeatFrequency();
        int int39 = mongoClientOptions28.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10000 + "'", int38 == 10000);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        org.springframework.core.env.Environment environment7 = null;
        int int8 = mongoProperties0.determinePort(environment7);
        com.mongodb.MongoClientOptions.Builder builder9 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions10);
        java.lang.String str13 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(209715200);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxConnectionLifeTime(342288864);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.database;
        java.lang.String str24 = mongoProperties22.authenticationDatabase;
        java.lang.Class<?> wildcardClass25 = mongoProperties22.fieldNamingStrategy;
        mongoProperties22.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties22.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties22.builder(mongoClientOptions30);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder35 = builder32.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        java.lang.String str39 = mongoClientOptions38.getDescription();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties22.builder(mongoClientOptions38);
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList54 = mongoClientOptions51.getCommandListeners();
        int int55 = mongoClientOptions51.getLocalThreshold();
        int int56 = mongoClientOptions51.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties22.builder(mongoClientOptions51);
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties0.builder(mongoClientOptions51);
        int int59 = mongoClientOptions51.getConnectTimeout();
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClient44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 15 + "'", int53 == 15);
        org.junit.Assert.assertNotNull(commandListenerList54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 15 + "'", int55 == 15);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10000 + "'", int59 == 10000);
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
        int int2 = java.lang.Integer.compareUnsigned(104857600, 808146084);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
        int int1 = java.lang.Integer.highestOneBit((-994836476));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("838860799", (-746586112));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -746586112 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
        java.lang.String str1 = java.lang.Integer.toBinaryString(285212672);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10001000000000000000000000000" + "'", str1, "10001000000000000000000000000");
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("3020", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 3020");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        int int1 = java.lang.Integer.signum((-994836476));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.connectTimeout(1024);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.minConnectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder16 = builder11.legacyDefaults();
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder11.build();
        boolean boolean18 = mongoClientOptions17.isAlwaysUseMBeans();
        int int19 = mongoClientOptions17.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
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
        int int33 = mongoClientOptions27.getConnectTimeout();
        java.lang.String str34 = mongoClientOptions27.getRequiredReplicaSetName();
        int int35 = mongoClientOptions27.getServerSelectionTimeout();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 30000 + "'", int35 == 30000);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
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
        boolean boolean18 = mongoClientOptions10.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        java.lang.Class<?> wildcardClass20 = builder19.getClass();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        java.lang.String str1 = java.lang.Integer.toOctalString(32768);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000" + "'", str1, "100000");
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
        int int2 = java.lang.Integer.divideUnsigned(0, 1140850688);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(209715200);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.maxConnectionIdleTime(10100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "29" + "'", str1, "29");
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
        int int1 = java.lang.Integer.parseInt("268828672");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 268828672 + "'", int1 == 268828672);
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("214d1d80", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 214d1d80");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        char[] charArray4 = mongoProperties0.getPassword();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setAuthenticationDatabase("1200000000");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(wildcardClass6);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
        long long1 = java.lang.Integer.toUnsignedLong(9765625);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9765625L + "'", long1 == 9765625L);
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
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
        mongoProperties15.setUsername("34");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions43.getDbDecoderFactory();
        int int46 = mongoClientOptions43.getSocketTimeout();
        int int47 = mongoClientOptions43.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties15.builder(mongoClientOptions43);
        org.bson.codecs.configuration.CodecRegistry codecRegistry49 = mongoClientOptions43.getCodecRegistry();
        com.mongodb.ReadPreference readPreference50 = mongoClientOptions43.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder51 = builder14.readPreference(readPreference50);
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.description("");
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder58 = builder54.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder60 = builder54.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder62 = builder54.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.connectionsPerHost((int) 'a');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties65 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str66 = mongoProperties65.database;
        mongoProperties65.setHost("mongodb://localhost/test");
        java.lang.String str69 = mongoProperties65.getUri();
        int int70 = mongoProperties65.getDEFAULT_PORT();
        java.lang.String str71 = mongoProperties65.gridFsDatabase;
        java.lang.String str72 = mongoProperties65.getUri();
        com.mongodb.MongoClientOptions.Builder builder73 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions74 = builder73.build();
        int int75 = mongoClientOptions74.getHeartbeatConnectTimeout();
        int int76 = mongoClientOptions74.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry77 = mongoClientOptions74.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder78 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions74);
        com.mongodb.MongoClientOptions.Builder builder79 = mongoProperties65.builder(mongoClientOptions74);
        com.mongodb.MongoClientOptions.Builder builder80 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder82 = builder80.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder83 = builder80.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder85 = builder83.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder87 = builder85.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder89 = builder85.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder90 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions91 = builder90.build();
        boolean boolean92 = mongoClientOptions91.isCursorFinalizerEnabled();
        int int93 = mongoClientOptions91.getHeartbeatConnectTimeout();
        int int94 = mongoClientOptions91.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference95 = mongoClientOptions91.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder96 = builder85.readPreference(readPreference95);
        com.mongodb.MongoClientOptions.Builder builder97 = builder79.readPreference(readPreference95);
        com.mongodb.MongoClientOptions.Builder builder98 = builder62.readPreference(readPreference95);
        com.mongodb.MongoClientOptions.Builder builder99 = builder51.readPreference(readPreference95);
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(codecRegistry49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "mongodb://localhost/test" + "'", str69, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 27017 + "'", int70 == 27017);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "mongodb://localhost/test" + "'", str72, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(mongoClientOptions74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 20000 + "'", int75 == 20000);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertNotNull(codecRegistry77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(mongoClientOptions91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 20000 + "'", int93 == 20000);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(readPreference95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(builder98);
        org.junit.Assert.assertNotNull(builder99);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
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
        boolean boolean18 = mongoClientOptions10.isSslEnabled();
        int int19 = mongoClientOptions10.getSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry20 = mongoClientOptions10.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(codecRegistry20);
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
        int int2 = java.lang.Integer.compareUnsigned(8388608, 218103810);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("6400000", 50000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 50000000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout(83886080);
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder6.dbDecoderFactory(dBDecoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.sslEnabled(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.database;
        mongoProperties23.setHost("mongodb://localhost/test");
        java.lang.String str27 = mongoProperties23.getHost();
        com.mongodb.MongoClientOptions.Builder builder28 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder28.build();
        int int30 = mongoClientOptions29.getHeartbeatConnectTimeout();
        int int31 = mongoClientOptions29.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties23.builder(mongoClientOptions29);
        javax.net.SocketFactory socketFactory33 = mongoClientOptions29.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory34 = mongoClientOptions29.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder35 = builder20.dbEncoderFactory(dBEncoderFactory34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.localThreshold(1200000000);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatSocketTimeout(1776);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClient10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb://localhost/test" + "'", str27, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(socketFactory33);
        org.junit.Assert.assertNotNull(dBEncoderFactory34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMaxWaitTime();
        int int7 = mongoClientOptions1.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("256", 45435459);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 45435459 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        int int2 = java.lang.Integer.sum(6, 838860799);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 838860805 + "'", int2 == 838860805);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
        java.lang.String str1 = java.lang.Integer.toString(200000000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "200000000" + "'", str1, "200000000");
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("230", 37748736);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 37748736 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("1200000123", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1200000123");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
        int int1 = java.lang.Integer.parseUnsignedInt("872415232");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 872415232 + "'", int1 == 872415232);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
        int int1 = java.lang.Integer.parseInt("119");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 119 + "'", int1 == 119);
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.Integer int2 = mongoProperties0.getPort();
        java.lang.String str3 = mongoProperties0.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int5 = mongoProperties4.port;
        mongoProperties4.setAuthenticationDatabase("");
        java.lang.Integer int8 = mongoProperties4.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray16 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties9.password = charArray16;
        mongoProperties4.setPassword(charArray16);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray26 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties19.password = charArray26;
        mongoProperties4.setPassword(charArray26);
        mongoProperties0.setPassword(charArray26);
        com.mongodb.MongoClientOptions.Builder builder30 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions31);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions31);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.description("");
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder42 = builder36.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.maxConnectionLifeTime(1);
        boolean boolean49 = mongoClientOptions31.equals((java.lang.Object) 1);
        int int50 = mongoClientOptions31.getMaxConnectionIdleTime();
        int int51 = mongoClientOptions31.getMaxWaitTime();
        int int52 = mongoClientOptions31.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties0.builder(mongoClientOptions31);
        boolean boolean54 = mongoClientOptions31.isAlwaysUseMBeans();
        boolean boolean55 = mongoClientOptions31.isSslEnabled();
        java.lang.String str56 = mongoClientOptions31.getRequiredReplicaSetName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 120000 + "'", int51 == 120000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("16");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 16");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("2", 566418188);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 566418188 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("100010000000000000000", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1111", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
        int int1 = java.lang.Integer.reverse(209715200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 304 + "'", int1 == 304);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
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
        boolean boolean31 = mongoClientOptions25.isSslInvalidHostNameAllowed();
        boolean boolean32 = mongoClientOptions25.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        int int34 = mongoClientOptions25.getConnectTimeout();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10000 + "'", int34 == 10000);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
        long long1 = java.lang.Integer.toUnsignedLong(1114112);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1114112L + "'", long1 == 1114112L);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.database;
        java.lang.String str17 = mongoProperties15.authenticationDatabase;
        java.lang.String str18 = mongoProperties15.getMongoClientDatabase();
        java.lang.String str19 = mongoProperties15.database;
        java.lang.String str20 = mongoProperties15.getDatabase();
        boolean boolean21 = mongoClientOptions10.equals((java.lang.Object) mongoProperties15);
        int int22 = mongoClientOptions10.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions10.getWriteConcern();
        int int24 = mongoClientOptions10.getServerSelectionTimeout();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        boolean boolean26 = mongoClientOptions10.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "test" + "'", str18, "test");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30000 + "'", int24 == 30000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.minHeartbeatFrequency(27017);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout(9);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions9.getDbDecoderFactory();
        int int11 = mongoClientOptions9.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
        int int2 = java.lang.Integer.min(161056, 304);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 304 + "'", int2 == 304);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int13 = mongoProperties0.getPort();
        char[] charArray14 = mongoProperties0.password;
        java.lang.String str15 = mongoProperties0.uri;
        mongoProperties0.uri = "30000";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minHeartbeatFrequency(32);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatConnectTimeout(167772160);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.minConnectionsPerHost(558701952);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.connectTimeout(87);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
        int int2 = java.lang.Integer.rotateLeft(33554432, (-301989808));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
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
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.connectionsPerHost(10060000);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.socketTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatConnectTimeout(6553600);
        com.mongodb.MongoClientOptions.Builder builder18 = builder17.legacyDefaults();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setUri("");
        int int6 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Integer int7 = mongoProperties0.getPort();
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.gridFsDatabase = "29";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        mongoProperties0.setDatabase("100");
        java.lang.String str17 = mongoProperties0.getUsername();
        mongoProperties0.uri = "141";
        java.lang.Class<?> wildcardClass20 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
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
        mongoProperties0.setHost("18");
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
        int int50 = mongoClientOptions46.getHeartbeatFrequency();
        int int51 = mongoClientOptions46.getLocalThreshold();
        java.lang.String str52 = mongoClientOptions46.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties0.builder(mongoClientOptions46);
        int int55 = mongoClientOptions46.getThreadsAllowedToBlockForConnectionMultiplier();
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
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 10000 + "'", int50 == 10000);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
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
        org.springframework.core.env.Environment environment40 = null;
        int int41 = mongoProperties0.determinePort(environment40);
        java.lang.String str42 = mongoProperties0.getDatabase();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 27017 + "'", int41 == 27017);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
        java.lang.String str1 = java.lang.Integer.toHexString(230);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e6" + "'", str1, "e6");
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder8 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.build();
        boolean boolean10 = mongoClientOptions9.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList11 = mongoClientOptions9.getCommandListeners();
        boolean boolean12 = mongoClientOptions9.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern13 = mongoClientOptions9.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder14 = builder5.writeConcern(writeConcern13);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.event.CommandListener commandListener17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder14.addCommandListener(commandListener17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(commandListenerList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(writeConcern13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        mongoProperties0.uri = "97";
        mongoProperties0.clearPassword();
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
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties10.builder(mongoClientOptions26);
        char[] charArray28 = mongoProperties10.password;
        java.lang.Integer int29 = mongoProperties10.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int31 = mongoProperties30.port;
        mongoProperties30.setAuthenticationDatabase("");
        java.lang.Integer int34 = mongoProperties30.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray42 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties35.password = charArray42;
        mongoProperties30.setPassword(charArray42);
        mongoProperties10.password = charArray42;
        mongoProperties0.password = charArray42;
        mongoProperties0.database = "2147483648";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(int31);
        org.junit.Assert.assertNull(int34);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(947912712, 128);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "947912712" + "'", str2, "947912712");
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        mongoProperties0.clearPassword();
        mongoProperties0.uri = "100010100100110000100000000000";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.threadsAllowedToBlockForConnectionMultiplier(6400000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
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
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        boolean boolean13 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int14 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
        java.lang.String str1 = java.lang.Integer.toOctalString(19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(212746274);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "212746274" + "'", str1, "212746274");
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
        int int1 = java.lang.Integer.signum(1920);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
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
        mongoProperties0.setUsername("1");
        java.lang.String str22 = mongoProperties0.getMongoClientDatabase();
        char[] charArray23 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97" + "'", str22, "97");
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setHost("1111111111111111111111111111111");
        java.lang.String str6 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.host = "30000";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("0");
        java.lang.Integer int5 = mongoProperties0.port;
        com.mongodb.MongoClientOptions.Builder builder6 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int9 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int10 = mongoClientOptions7.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions7);
        int int12 = mongoClientOptions7.getMinConnectionsPerHost();
        int int13 = mongoClientOptions7.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
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
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        java.lang.String str12 = mongoClientOptions6.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.database;
        mongoProperties0.setUri("25600");
        mongoProperties0.uri = "";
        java.lang.Integer int8 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str10 = mongoProperties9.database;
        mongoProperties9.setHost("mongodb://localhost/test");
        java.lang.String str13 = mongoProperties9.getHost();
        com.mongodb.MongoClientOptions.Builder builder14 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getHeartbeatConnectTimeout();
        int int17 = mongoClientOptions15.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties9.builder(mongoClientOptions15);
        javax.net.SocketFactory socketFactory19 = mongoClientOptions15.getSocketFactory();
        com.mongodb.WriteConcern writeConcern20 = mongoClientOptions15.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        org.springframework.core.env.Environment environment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient23 = mongoProperties0.createMongoClient(mongoClientOptions15, environment22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The connection string is invalid. Connection strings must start with 'mongodb://'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(socketFactory19);
        org.junit.Assert.assertNotNull(writeConcern20);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        java.lang.Integer int5 = mongoProperties0.port;
        mongoProperties0.setDatabase("141");
        java.lang.String str8 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder9 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions10.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions10);
        int int16 = mongoClientOptions10.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "141" + "'", str8, "141");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxWaitTime((int) '4');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.sslEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        com.mongodb.MongoClientOptions.Builder builder6 = mongoProperties0.builder(mongoClientOptions5);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatFrequency(120035);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("", 1200000123);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1200000123 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        mongoProperties0.setHost("97");
        mongoProperties0.uri = "1";
        java.lang.String str14 = mongoProperties0.username;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
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
        int int35 = mongoClientOptions27.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000 + "'", int35 == 120000);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        int int2 = java.lang.Integer.max(33554432, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33554432 + "'", int2 == 33554432);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getSocketTimeout();
        boolean boolean8 = mongoClientOptions6.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.String str5 = mongoProperties0.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder6 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean8 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int9 = mongoClientOptions7.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern10 = mongoClientOptions7.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions7.getDbEncoderFactory();
        boolean boolean12 = mongoClientOptions7.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions7);
        java.lang.Object obj14 = null;
        boolean boolean15 = mongoClientOptions7.equals(obj14);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList16 = mongoClientOptions7.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions7);
        org.bson.codecs.configuration.CodecRegistry codecRegistry18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder17.codecRegistry(codecRegistry18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: codecRegistry can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(writeConcern10);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(commandListenerList16);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
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
        int int42 = mongoClientOptions41.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 120000 + "'", int42 == 120000);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
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
        java.lang.String str22 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.uri = "113";
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
        java.lang.String str1 = java.lang.Integer.toString(131072);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "131072" + "'", str1, "131072");
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.host = "25600";
        mongoProperties0.setAuthenticationDatabase("133fde");
        java.lang.String str8 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int10 = mongoProperties9.port;
        mongoProperties9.setAuthenticationDatabase("");
        java.lang.String str13 = mongoProperties9.host;
        mongoProperties9.uri = "97";
        mongoProperties9.uri = "97";
        mongoProperties9.clearPassword();
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int40 = mongoProperties39.port;
        mongoProperties39.setAuthenticationDatabase("");
        java.lang.Integer int43 = mongoProperties39.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray51 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties44.password = charArray51;
        mongoProperties39.setPassword(charArray51);
        mongoProperties19.password = charArray51;
        mongoProperties9.password = charArray51;
        mongoProperties0.password = charArray51;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(str13);
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
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        char[] charArray4 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder5 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder5.build();
        boolean boolean7 = mongoClientOptions6.isCursorFinalizerEnabled();
        int int8 = mongoClientOptions6.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions6.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int12 = mongoProperties11.port;
        mongoProperties11.setAuthenticationDatabase("");
        java.lang.Integer int15 = mongoProperties11.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray23 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties16.password = charArray23;
        mongoProperties11.setPassword(charArray23);
        mongoProperties11.setHost("12");
        mongoProperties11.database = "97";
        java.lang.String str30 = mongoProperties11.getHost();
        java.lang.String str31 = mongoProperties11.getAuthenticationDatabase();
        char[] charArray32 = mongoProperties11.getPassword();
        mongoProperties0.password = charArray32;
        com.mongodb.MongoClientOptions.Builder builder34 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder34.build();
        int int36 = mongoClientOptions35.getHeartbeatConnectTimeout();
        int int37 = mongoClientOptions35.getMaxConnectionIdleTime();
        int int38 = mongoClientOptions35.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        int int40 = mongoClientOptions35.getSocketTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str42 = mongoProperties41.database;
        java.lang.String str43 = mongoProperties41.authenticationDatabase;
        java.lang.String str44 = mongoProperties41.getMongoClientDatabase();
        java.lang.String str45 = mongoProperties41.uri;
        mongoProperties41.port = 100;
        java.lang.String str48 = mongoProperties41.gridFsDatabase;
        boolean boolean49 = mongoClientOptions35.equals((java.lang.Object) mongoProperties41);
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        boolean boolean51 = mongoClientOptions35.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions35);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "12" + "'", str30, "12");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "test" + "'", str44, "test");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "mongodb://localhost/test" + "'", str45, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
        java.lang.String str2 = java.lang.Integer.toString((int) (byte) -1, 304);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1" + "'", str2, "-1");
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatSocketTimeout((-2147483644));
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxWaitTime(500);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.requiredReplicaSetName("200");
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder29 = builder26.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        java.lang.String str33 = mongoClientOptions32.getDescription();
        int int34 = mongoClientOptions32.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str35 = mongoClientOptions32.getRequiredReplicaSetName();
        int int36 = mongoClientOptions32.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder37 = com.mongodb.MongoClientOptions.builder(mongoClientOptions32);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList38 = mongoClientOptions32.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        java.lang.String str40 = mongoClientOptions32.getDescription();
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        int int42 = mongoClientOptions32.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.database;
        java.lang.String str46 = mongoProperties44.authenticationDatabase;
        java.lang.Class<?> wildcardClass47 = mongoProperties44.fieldNamingStrategy;
        mongoProperties44.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions50 = null;
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties44.builder(mongoClientOptions50);
        com.mongodb.MongoClientOptions mongoClientOptions52 = null;
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties44.builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder57 = builder54.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        java.lang.String str61 = mongoClientOptions60.getDescription();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties44.builder(mongoClientOptions60);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties63 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions64 = null;
        org.springframework.core.env.Environment environment65 = null;
        com.mongodb.MongoClient mongoClient66 = mongoProperties63.createMongoClient(mongoClientOptions64, environment65);
        com.mongodb.MongoClientOptions.Builder builder67 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder70 = builder67.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder70.build();
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties63.builder(mongoClientOptions73);
        int int75 = mongoClientOptions73.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList76 = mongoClientOptions73.getCommandListeners();
        int int77 = mongoClientOptions73.getLocalThreshold();
        int int78 = mongoClientOptions73.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder79 = mongoProperties44.builder(mongoClientOptions73);
        javax.net.SocketFactory socketFactory80 = mongoClientOptions73.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder81 = builder43.socketFactory(socketFactory80);
        com.mongodb.MongoClientOptions.Builder builder82 = builder25.socketFactory(socketFactory80);
        com.mongodb.WriteConcern writeConcern83 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder84 = builder82.writeConcern(writeConcern83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: writeConcern can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(commandListenerList38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 120000 + "'", int42 == 120000);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClient66);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 15 + "'", int75 == 15);
        org.junit.Assert.assertNotNull(commandListenerList76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 15 + "'", int77 == 15);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 10 + "'", int78 == 10);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(socketFactory80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.connectionsPerHost((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions14.getWriteConcern();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions14.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder19 = builder10.writeConcern(writeConcern18);
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
        int int32 = mongoClientOptions30.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions30);
        int int34 = mongoClientOptions30.getHeartbeatFrequency();
        int int35 = mongoClientOptions30.getLocalThreshold();
        java.lang.String str36 = mongoClientOptions30.getRequiredReplicaSetName();
        int int37 = mongoClientOptions30.getHeartbeatFrequency();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions30.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder39 = builder19.socketFactory(socketFactory38);
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
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10000 + "'", int34 == 10000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10000 + "'", int37 == 10000);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
        java.lang.String str2 = java.lang.Integer.toString((int) (short) 1, 474955779);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
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
        com.mongodb.MongoClientOptions mongoClientOptions79 = builder17.build();
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
        org.junit.Assert.assertNotNull(mongoClientOptions79);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
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
        mongoProperties0.uri = "5000000";
        java.lang.String str22 = mongoProperties0.getDatabase();
        java.lang.String str23 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "97" + "'", str22, "97");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        mongoProperties0.setUri("5");
        java.lang.String str17 = mongoProperties0.getDatabase();
        mongoProperties0.setAuthenticationDatabase("1200000000");
        mongoProperties0.setGridFsDatabase("test");
        java.lang.String str22 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setGridFsDatabase("558701952");
        mongoProperties0.setDatabase("ffffffff");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1200000000" + "'", str22, "1200000000");
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList57 = mongoClientOptions55.getCommandListeners();
        int int58 = mongoClientOptions55.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList59 = mongoClientOptions55.getCommandListeners();
        boolean boolean60 = mongoClientOptions55.isSocketKeepAlive();
        int int61 = mongoClientOptions55.getMinHeartbeatFrequency();
        org.springframework.core.env.Environment environment62 = null;
        com.mongodb.MongoClient mongoClient63 = mongoProperties0.createMongoClient(mongoClientOptions55, environment62);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions55);
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
        org.junit.Assert.assertNotNull(mongoClient48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(mongoClientOptions55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(commandListenerList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(commandListenerList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 500 + "'", int61 == 500);
        org.junit.Assert.assertNotNull(mongoClient63);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setAuthenticationDatabase("7976628");
        mongoProperties0.setHost("0");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.socketTimeout((-2046820352));
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.requiredReplicaSetName("20600000000");
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.socketTimeout(22930800);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.maxConnectionIdleTime(127362600);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.sslEnabled(true);
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
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
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
        java.lang.String str17 = mongoProperties0.getUsername();
        mongoProperties0.database = "52";
        java.lang.String str20 = mongoProperties0.database;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12" + "'", str17, "12");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "52" + "'", str20, "52");
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
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
        java.lang.String str33 = mongoClientOptions27.getRequiredReplicaSetName();
        int int34 = mongoClientOptions27.getConnectionsPerHost();
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
        java.lang.Integer int1 = java.lang.Integer.getInteger("100011100100000000000000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
        int int2 = java.lang.Integer.parseInt("33", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
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
        java.lang.String str18 = mongoProperties0.gridFsDatabase;
        java.lang.Integer int19 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder20 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        int int23 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions21.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions21, environment27);
        com.mongodb.DBEncoderFactory dBEncoderFactory29 = mongoClientOptions21.getDbEncoderFactory();
        int int30 = mongoClientOptions21.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 500 + "'", int25 == 500);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertNotNull(dBEncoderFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
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
        com.mongodb.ReadConcern readConcern19 = mongoClientOptions16.getReadConcern();
        int int20 = mongoClientOptions16.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions16.getDbDecoderFactory();
        boolean boolean22 = mongoClientOptions16.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions16);
        com.mongodb.ReadConcern readConcern24 = mongoClientOptions16.getReadConcern();
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
        org.junit.Assert.assertNotNull(readConcern19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(readConcern24);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
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
        boolean boolean36 = mongoProperties0.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int38 = mongoProperties37.port;
        mongoProperties37.setAuthenticationDatabase("");
        java.lang.Integer int41 = mongoProperties37.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray49 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties42.password = charArray49;
        mongoProperties37.setPassword(charArray49);
        mongoProperties0.password = charArray49;
        org.springframework.core.env.Environment environment53 = null;
        int int54 = mongoProperties0.determinePort(environment53);
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
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 27017 + "'", int54 == 27017);
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
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
        char[] charArray34 = mongoProperties0.getPassword();
        java.lang.String str35 = mongoProperties0.uri;
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
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "mongodb://localhost/test" + "'", str35, "mongodb://localhost/test");
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
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
        com.mongodb.event.CommandListener commandListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder23 = builder21.addCommandListener(commandListener22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1000000000000000000000000000010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1000000000000000000000000000010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("20000000004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000000004\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        java.lang.String str1 = java.lang.Integer.toBinaryString(167772160);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010000000000000000000000000" + "'", str1, "1010000000000000000000000000");
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
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
        mongoProperties0.setDatabase("25");
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
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
        java.lang.String str1 = java.lang.Integer.toOctalString(20648981);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "116612025" + "'", str1, "116612025");
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        mongoProperties0.setDatabase("35");
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
        boolean boolean24 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(intClass20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.gridFsDatabase = "141";
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.setAuthenticationDatabase("2");
        java.lang.String str10 = mongoProperties0.host;
        mongoProperties0.database = "558701952";
        java.lang.String str13 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setAuthenticationDatabase("31000000");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "141" + "'", str13, "141");
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
        int int2 = java.lang.Integer.remainderUnsigned(50, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(true);
        com.mongodb.event.CommandListener commandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder7.addCommandListener(commandListener10);
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
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        mongoProperties0.setUri("ffffffff");
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("e6");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"e6\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int16 = mongoProperties15.port;
        com.mongodb.MongoClientOptions mongoClientOptions17 = null;
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties15.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        java.lang.String str32 = mongoClientOptions31.getDescription();
        int int33 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str34 = mongoClientOptions31.getRequiredReplicaSetName();
        int int35 = mongoClientOptions31.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern36 = mongoClientOptions31.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder37 = builder20.readConcern(readConcern36);
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
        com.mongodb.MongoClientOptions.Builder builder50 = builder37.dbEncoderFactory(dBEncoderFactory49);
        com.mongodb.MongoClientOptions.Builder builder51 = builder14.dbEncoderFactory(dBEncoderFactory49);
        com.mongodb.MongoClientOptions.Builder builder52 = builder3.dbEncoderFactory(dBEncoderFactory49);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10000 + "'", int35 == 10000);
        org.junit.Assert.assertNotNull(readConcern36);
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
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
        int int2 = java.lang.Integer.sum(33554432, 10100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33564532 + "'", int2 == 33564532);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1200000000", (-503054336));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -503054336 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
        java.lang.String str1 = java.lang.Integer.toBinaryString(342288864);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10100011001101110100111100000" + "'", str1, "10100011001101110100111100000");
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        java.lang.String str1 = java.lang.Integer.toHexString(30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1e" + "'", str1, "1e");
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        java.lang.String str1 = java.lang.Integer.toHexString((-994836476));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "c4b40004" + "'", str1, "c4b40004");
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
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
        java.lang.String str22 = mongoProperties0.getDatabase();
        java.lang.String str23 = mongoProperties0.getDatabase();
        mongoProperties0.setUsername("110100");
        mongoProperties0.database = "50000000";
        boolean boolean28 = mongoProperties0.hasCustomAddress();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
        int int2 = java.lang.Integer.rotateRight(947912705, 7803356);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2013265901) + "'", int2 == (-2013265901));
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
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
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str34 = mongoProperties33.database;
        mongoProperties33.setHost("mongodb://localhost/test");
        java.lang.String str37 = mongoProperties33.getHost();
        com.mongodb.MongoClientOptions.Builder builder38 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder38.build();
        int int40 = mongoClientOptions39.getHeartbeatConnectTimeout();
        int int41 = mongoClientOptions39.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties33.builder(mongoClientOptions39);
        javax.net.SocketFactory socketFactory43 = mongoClientOptions39.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory44 = mongoClientOptions39.getDbEncoderFactory();
        int int45 = mongoClientOptions39.getMinHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference46 = mongoClientOptions39.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder47 = builder32.readPreference(readPreference46);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties48 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions49 = null;
        org.springframework.core.env.Environment environment50 = null;
        com.mongodb.MongoClient mongoClient51 = mongoProperties48.createMongoClient(mongoClientOptions49, environment50);
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder55 = builder52.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions58 = builder55.build();
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties48.builder(mongoClientOptions58);
        int int60 = mongoClientOptions58.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder61 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions58);
        int int62 = mongoClientOptions58.getHeartbeatConnectTimeout();
        int int63 = mongoClientOptions58.getServerSelectionTimeout();
        int int64 = mongoClientOptions58.getSocketTimeout();
        com.mongodb.ReadConcern readConcern65 = mongoClientOptions58.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder66 = builder32.readConcern(readConcern65);
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
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "mongodb://localhost/test" + "'", str37, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(socketFactory43);
        org.junit.Assert.assertNotNull(dBEncoderFactory44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 500 + "'", int45 == 500);
        org.junit.Assert.assertNotNull(readPreference46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClient51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 20000 + "'", int62 == 20000);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 30000 + "'", int63 == 30000);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(readConcern65);
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("6400000000", 8000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 8000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("512");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 512");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
        int int1 = java.lang.Integer.signum(1090519040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        int int1 = java.lang.Integer.parseInt("19");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.Integer int11 = mongoProperties0.getPort();
        mongoProperties0.setUri("2147510664");
        java.lang.String str14 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.socketTimeout((-2046820352));
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.requiredReplicaSetName("20600000000");
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.socketTimeout(22930800);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.maxConnectionIdleTime(127362600);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxWaitTime(51200);
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
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        int int2 = java.lang.Integer.remainderUnsigned(51200, 536870912);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51200 + "'", int2 == 51200);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.database;
        java.lang.String str5 = mongoProperties0.getUsername();
        mongoProperties0.gridFsDatabase = "hi!";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int9 = mongoProperties8.port;
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties8.builder(mongoClientOptions10);
        mongoProperties8.port = 1;
        mongoProperties8.setHost("141");
        java.lang.String str16 = mongoProperties8.host;
        java.lang.String str17 = mongoProperties8.authenticationDatabase;
        boolean boolean18 = mongoProperties8.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.database;
        mongoProperties19.setHost("mongodb://localhost/test");
        mongoProperties19.setDatabase("35");
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
        mongoProperties8.setFieldNamingStrategy(intClass39);
        mongoProperties0.fieldNamingStrategy = intClass39;
        mongoProperties0.username = "1015";
        java.lang.String str47 = mongoProperties0.username;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "141" + "'", str16, "141");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(intClass39);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1015" + "'", str47, "1015");
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.heartbeatSocketTimeout(268435456);
        com.mongodb.MongoClientOptions.Builder builder15 = builder14.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder17 = builder14.maxConnectionIdleTime((int) '4');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
        int int1 = java.lang.Integer.highestOneBit((-2013265901));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(52);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.database;
        mongoProperties12.setHost("mongodb://localhost/test");
        java.lang.String str16 = mongoProperties12.getHost();
        com.mongodb.MongoClientOptions.Builder builder17 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getHeartbeatConnectTimeout();
        int int20 = mongoClientOptions18.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties12.builder(mongoClientOptions18);
        javax.net.SocketFactory socketFactory22 = mongoClientOptions18.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        int int24 = mongoClientOptions18.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions18.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder26 = builder11.dbEncoderFactory(dBEncoderFactory25);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.connectionsPerHost(1920);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(socketFactory22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference5 = mongoClientOptions1.getReadPreference();
        com.mongodb.ReadConcern readConcern6 = mongoClientOptions1.getReadConcern();
        boolean boolean7 = mongoClientOptions1.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(readPreference5);
        org.junit.Assert.assertNotNull(readConcern6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10100000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
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
        java.lang.Class<?> wildcardClass19 = mongoProperties0.getFieldNamingStrategy();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("3548381184");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3548381184\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.database;
        java.lang.String str32 = mongoProperties30.authenticationDatabase;
        java.lang.String str33 = mongoProperties30.getMongoClientDatabase();
        java.lang.String str34 = mongoProperties30.uri;
        char[] charArray35 = mongoProperties30.password;
        mongoProperties30.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        org.springframework.core.env.Environment environment39 = null;
        com.mongodb.MongoClient mongoClient40 = mongoProperties37.createMongoClient(mongoClientOptions38, environment39);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder44 = builder41.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties37.builder(mongoClientOptions47);
        int int49 = mongoClientOptions47.getLocalThreshold();
        org.springframework.core.env.Environment environment50 = null;
        com.mongodb.MongoClient mongoClient51 = mongoProperties30.createMongoClient(mongoClientOptions47, environment50);
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        int int53 = mongoClientOptions47.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties0.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.description("");
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder61 = builder57.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder63 = builder57.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.description("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties69 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions70 = null;
        org.springframework.core.env.Environment environment71 = null;
        com.mongodb.MongoClient mongoClient72 = mongoProperties69.createMongoClient(mongoClientOptions70, environment71);
        com.mongodb.MongoClientOptions.Builder builder73 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder75 = builder73.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder76 = builder73.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder78 = builder76.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions79 = builder76.build();
        com.mongodb.MongoClientOptions.Builder builder80 = mongoProperties69.builder(mongoClientOptions79);
        com.mongodb.DBDecoderFactory dBDecoderFactory81 = mongoClientOptions79.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder82 = builder68.dbDecoderFactory(dBDecoderFactory81);
        com.mongodb.MongoClientOptions.Builder builder83 = builder63.dbDecoderFactory(dBDecoderFactory81);
        com.mongodb.MongoClientOptions.Builder builder84 = builder54.dbDecoderFactory(dBDecoderFactory81);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "test" + "'", str33, "test");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "mongodb://localhost/test" + "'", str34, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray35);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertNotNull(mongoClient51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 120000 + "'", int53 == 120000);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClient72);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(mongoClientOptions79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(dBDecoderFactory81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
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
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions27);
        boolean boolean38 = mongoClientOptions27.equals((java.lang.Object) 1111);
        int int39 = mongoClientOptions27.getConnectTimeout();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10000 + "'", int39 == 10000);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
        int int1 = java.lang.Integer.lowestOneBit(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-536870913));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3758096383" + "'", str1, "3758096383");
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
        int int1 = java.lang.Integer.numberOfTrailingZeros(23564);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
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
        char[] charArray21 = mongoProperties0.getPassword();
        mongoProperties0.setHost("19");
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
        mongoProperties24.setUsername("34");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory54 = mongoClientOptions52.getDbDecoderFactory();
        int int55 = mongoClientOptions52.getSocketTimeout();
        int int56 = mongoClientOptions52.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties24.builder(mongoClientOptions52);
        char[] charArray58 = mongoProperties24.getPassword();
        mongoProperties24.gridFsDatabase = "16";
        char[] charArray61 = mongoProperties24.getPassword();
        mongoProperties0.password = charArray61;
        java.lang.Class<?> wildcardClass63 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClient45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(dBDecoderFactory54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 15 + "'", int56 == 15);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxConnectionLifeTime(10);
        com.mongodb.event.CommandListener commandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder9.addCommandListener(commandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
        int int2 = java.lang.Integer.rotateLeft(4194304, 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
        int int2 = java.lang.Integer.compareUnsigned(34, 285212672);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getHeartbeatFrequency();
        java.lang.String str7 = mongoClientOptions1.getRequiredReplicaSetName();
        java.lang.Class<?> wildcardClass8 = mongoClientOptions1.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        int int2 = java.lang.Integer.compare(1552, 342288864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        com.mongodb.MongoClientOptions.Builder builder6 = mongoProperties0.builder(mongoClientOptions5);
        mongoProperties0.setUsername("19");
        mongoProperties0.port = 808146084;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
        int int2 = java.lang.Integer.remainderUnsigned(500, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
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
        java.lang.String str29 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
        int int2 = java.lang.Integer.remainderUnsigned(23420000, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int10 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions6.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.description("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.socketTimeout((-2046820352));
        com.mongodb.MongoClientOptions.Builder builder22 = builder14.requiredReplicaSetName("20600000000");
        com.mongodb.MongoClientOptions.Builder builder24 = builder14.socketTimeout(22930800);
        boolean boolean25 = mongoClientOptions6.equals((java.lang.Object) 22930800);
        boolean boolean26 = mongoClientOptions6.isSslEnabled();
        java.lang.String str27 = mongoClientOptions6.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder5.heartbeatSocketTimeout(64);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minHeartbeatFrequency(2);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder16 = builder13.description("10010000000000000000000000");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory4 = mongoClientOptions1.getDbDecoderFactory();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory4);
        org.junit.Assert.assertNotNull(commandListenerList5);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        int int1 = java.lang.Integer.bitCount(212729856);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1101111000000011101010011100011");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1101111000000011101010011100011\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
        int int1 = java.lang.Integer.numberOfTrailingZeros(2329);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.clearPassword();
        mongoProperties0.setUsername("924209280");
        mongoProperties0.uri = "1000000000000000000000000000010";
        java.lang.Class<?> wildcardClass11 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "9";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
        int int1 = java.lang.Integer.lowestOneBit(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
        int int2 = java.lang.Integer.compare(167772160, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        int int2 = java.lang.Integer.compareUnsigned(11, 1626990123);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("536870912", 1261534);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1261534 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
        java.lang.String str1 = java.lang.Integer.toString(10001101);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10001101" + "'", str1, "10001101");
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
        java.lang.String str1 = java.lang.Integer.toString(230);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "230" + "'", str1, "230");
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        int int1 = java.lang.Integer.reverse(212746274);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1141011760 + "'", int1 == 1141011760);
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("161056");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 161056");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        int int1 = java.lang.Integer.numberOfLeadingZeros(200);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
        java.lang.String str2 = java.lang.Integer.toString(0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        mongoProperties0.username = "test";
        mongoProperties0.setUsername("12");
        mongoProperties0.setPort((java.lang.Integer) 35);
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
        int int2 = java.lang.Integer.rotateRight((-1929379840), 268435456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1929379840) + "'", int2 == (-1929379840));
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
        java.lang.String str1 = java.lang.Integer.toBinaryString(50000001);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10111110101111000010000001" + "'", str1, "10111110101111000010000001");
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
        java.lang.String str1 = java.lang.Integer.toHexString(5242880);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "500000" + "'", str1, "500000");
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str4 = mongoProperties3.database;
        java.lang.String str5 = mongoProperties3.authenticationDatabase;
        java.lang.Class<?> wildcardClass6 = mongoProperties3.fieldNamingStrategy;
        mongoProperties3.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties3.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties3.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder13.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        java.lang.String str20 = mongoClientOptions19.getDescription();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties3.builder(mongoClientOptions19);
        com.mongodb.ReadConcern readConcern22 = mongoClientOptions19.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder23 = builder2.readConcern(readConcern22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.sslEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(readConcern22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.serverSelectionTimeout(808146084);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.sslInvalidHostNameAllowed(false);
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
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int10 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions6.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 120000 + "'", int11 == 120000);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
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
        mongoProperties0.setPort((java.lang.Integer) 32);
        com.mongodb.MongoClientOptions.Builder builder20 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
        int int22 = mongoClientOptions21.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions21);
        java.lang.String str24 = mongoClientOptions21.getRequiredReplicaSetName();
        boolean boolean25 = mongoClientOptions21.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("101101101111100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"101101101111100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
        int int1 = java.lang.Integer.bitCount(111110100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
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
        mongoProperties0.password = charArray33;
        mongoProperties0.setGridFsDatabase("128");
        mongoProperties0.setPort((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass6);
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
    }
}

