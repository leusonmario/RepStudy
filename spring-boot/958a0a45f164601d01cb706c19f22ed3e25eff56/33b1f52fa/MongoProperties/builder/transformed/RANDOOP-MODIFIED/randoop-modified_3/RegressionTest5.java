import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        int int2 = java.lang.Integer.remainderUnsigned((-2046820352), 285212672);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 251658240 + "'", int2 == 251658240);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
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
        mongoProperties0.setPort((java.lang.Integer) 8192);
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
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        int int2 = java.lang.Integer.sum(1200000123, 1073742086);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2021225087) + "'", int2 == (-2021225087));
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        java.lang.String str1 = java.lang.Integer.toString(1073741830);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1073741830" + "'", str1, "1073741830");
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Integer int6 = mongoProperties0.port;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        boolean boolean4 = mongoProperties0.hasCustomCredentials();
        java.lang.String str5 = mongoProperties0.database;
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        java.lang.Integer int8 = mongoProperties0.port;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        int int2 = java.lang.Integer.rotateRight(83886080, 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2560 + "'", int2 == 2560);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        int int1 = java.lang.Integer.lowestOneBit(399297740);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        int int1 = java.lang.Integer.numberOfTrailingZeros(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
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
        com.mongodb.MongoClientOptions.Builder builder38 = com.mongodb.MongoClientOptions.builder(mongoClientOptions28);
        int int39 = mongoClientOptions28.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20000 + "'", int39 == 20000);
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
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
        mongoProperties0.uri = "24";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
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
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        int int2 = java.lang.Integer.divideUnsigned(128, 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        int int1 = java.lang.Integer.numberOfTrailingZeros(120000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        int int2 = java.lang.Integer.rotateLeft(119, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-603979775) + "'", int2 == (-603979775));
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        java.lang.String str2 = java.lang.Integer.toString(18, 9765651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "18" + "'", str2, "18");
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
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
        boolean boolean15 = mongoClientOptions10.isSslEnabled();
        int int16 = mongoClientOptions10.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int18 = mongoClientOptions10.getSocketTimeout();
        int int19 = mongoClientOptions10.getMinHeartbeatFrequency();
        int int20 = mongoClientOptions10.getMaxWaitTime();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
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
        javax.net.SocketFactory socketFactory38 = mongoClientOptions24.getSocketFactory();
        org.bson.codecs.configuration.CodecRegistry codecRegistry39 = mongoClientOptions24.getCodecRegistry();
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
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertNotNull(codecRegistry39);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder12 = com.mongodb.MongoClientOptions.builder(mongoClientOptions11);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray20 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties13.password = charArray20;
        java.lang.String str22 = mongoProperties13.database;
        java.lang.String str23 = mongoProperties13.getHost();
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
        java.lang.String str38 = mongoClientOptions34.getDescription();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions34);
        org.springframework.core.env.Environment environment40 = null;
        com.mongodb.MongoClient mongoClient41 = mongoProperties13.createMongoClient(mongoClientOptions34, environment40);
        boolean boolean42 = mongoClientOptions34.isSslInvalidHostNameAllowed();
        java.lang.String str43 = mongoClientOptions34.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory44 = mongoClientOptions34.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder12.dbEncoderFactory(dBEncoderFactory44);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(mongoClient41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(dBEncoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
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
        boolean boolean13 = mongoClientOptions6.isSslInvalidHostNameAllowed();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        int int2 = java.lang.Integer.compareUnsigned(10000, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        int int2 = java.lang.Integer.compare(5242880, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions10.getDbEncoderFactory();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties20.authenticationDatabase = "12";
        boolean boolean23 = mongoProperties20.hasCustomAddress();
        mongoProperties20.setUri("");
        int int26 = mongoProperties20.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int28 = mongoProperties27.port;
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties27.builder(mongoClientOptions29);
        mongoProperties27.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray40 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties33.password = charArray40;
        java.lang.String str42 = mongoProperties33.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str44 = mongoProperties43.database;
        java.lang.String str45 = mongoProperties43.authenticationDatabase;
        java.lang.Integer int46 = mongoProperties43.port;
        java.lang.Class<java.lang.Integer> intClass47 = java.lang.Integer.TYPE;
        mongoProperties43.fieldNamingStrategy = intClass47;
        mongoProperties33.setFieldNamingStrategy(intClass47);
        mongoProperties27.fieldNamingStrategy = intClass47;
        mongoProperties20.fieldNamingStrategy = intClass47;
        java.lang.Class<?> wildcardClass52 = mongoProperties20.fieldNamingStrategy;
        boolean boolean53 = mongoClientOptions10.equals((java.lang.Object) mongoProperties20);
        int int54 = mongoClientOptions10.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27017 + "'", int26 == 27017);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNotNull(intClass47);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        java.lang.Class<java.lang.Integer> intClass8 = java.lang.Integer.TYPE;
        mongoProperties0.setFieldNamingStrategy(intClass8);
        java.lang.String str10 = mongoProperties0.username;
        java.lang.String str11 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(intClass8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        int int2 = java.lang.Integer.divideUnsigned(111, 212746274);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        int int1 = java.lang.Integer.signum(1200016507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        int int2 = java.lang.Integer.max(1552, 1862270976);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1862270976 + "'", int2 == 1862270976);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
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
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatConnectTimeout((-1));
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.heartbeatSocketTimeout(52);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.description("23420000");
        com.mongodb.MongoClientOptions.Builder builder36 = builder30.localThreshold(25600);
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
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
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
        mongoProperties0.gridFsDatabase = "1000000000000000000000000000010";
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
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
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
        int int38 = mongoClientOptions24.getThreadsAllowedToBlockForConnectionMultiplier();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
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
        mongoProperties0.setUri("141");
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
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
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
        com.mongodb.MongoClientOptions.Builder builder50 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder50.build();
        int int52 = mongoClientOptions51.getHeartbeatConnectTimeout();
        int int53 = mongoClientOptions51.getConnectionsPerHost();
        int int54 = mongoClientOptions51.getLocalThreshold();
        javax.net.SocketFactory socketFactory55 = mongoClientOptions51.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder56 = builder49.socketFactory(socketFactory55);
        com.mongodb.ReadConcern readConcern57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder58 = builder49.readConcern(readConcern57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: readConcern can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 20000 + "'", int52 == 20000);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 15 + "'", int54 == 15);
        org.junit.Assert.assertNotNull(socketFactory55);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        java.lang.String str1 = java.lang.Integer.toString((-528443136));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-528443136" + "'", str1, "-528443136");
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
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
        int int68 = mongoClientOptions10.getHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10000 + "'", int68 == 10000);
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        java.lang.String str1 = java.lang.Integer.toOctalString(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11" + "'", str1, "11");
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int13 = mongoProperties0.getPort();
        mongoProperties0.setUri("32768");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
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
        int int36 = mongoClientOptions28.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        int int38 = mongoClientOptions28.getConnectTimeout();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10000 + "'", int36 == 10000);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10000 + "'", int38 == 10000);
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.host = "hi!";
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList17 = mongoClientOptions15.getCommandListeners();
        int int18 = mongoClientOptions15.getMaxConnectionIdleTime();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions15, environment19);
        java.lang.String str21 = mongoClientOptions15.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandListenerList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
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
        java.lang.String str18 = mongoProperties0.username;
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "5" + "'", str18, "5");
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
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
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.description("");
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.description("test");
        com.mongodb.MongoClientOptions.Builder builder42 = builder36.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder48 = builder45.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        java.lang.String str52 = mongoClientOptions51.getDescription();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions51);
        int int54 = mongoClientOptions51.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder55 = com.mongodb.MongoClientOptions.builder(mongoClientOptions51);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties56 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions57 = null;
        org.springframework.core.env.Environment environment58 = null;
        com.mongodb.MongoClient mongoClient59 = mongoProperties56.createMongoClient(mongoClientOptions57, environment58);
        com.mongodb.MongoClientOptions.Builder builder60 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder63 = builder60.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions66 = builder63.build();
        com.mongodb.MongoClientOptions.Builder builder67 = mongoProperties56.builder(mongoClientOptions66);
        int int68 = mongoClientOptions66.getLocalThreshold();
        int int69 = mongoClientOptions66.getMaxConnectionIdleTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry70 = mongoClientOptions66.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder71 = builder55.codecRegistry(codecRegistry70);
        com.mongodb.MongoClientOptions.Builder builder72 = builder44.codecRegistry(codecRegistry70);
        com.mongodb.MongoClientOptions.Builder builder73 = builder7.codecRegistry(codecRegistry70);
        com.mongodb.MongoClientOptions.Builder builder75 = builder7.requiredReplicaSetName("10060000");
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
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 500 + "'", int54 == 500);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClient59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(mongoClientOptions66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 15 + "'", int68 == 15);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(codecRegistry70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
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
        java.lang.Integer int46 = mongoProperties0.getPort();
        org.springframework.core.env.Environment environment47 = null;
        int int48 = mongoProperties0.determinePort(environment47);
        mongoProperties0.setGridFsDatabase("24");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray58 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties51.password = charArray58;
        java.lang.Class<java.lang.Integer> intClass60 = java.lang.Integer.TYPE;
        mongoProperties51.fieldNamingStrategy = intClass60;
        java.lang.String str62 = mongoProperties51.username;
        com.mongodb.MongoClientOptions mongoClientOptions63 = null;
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties51.builder(mongoClientOptions63);
        java.lang.Class<?> wildcardClass65 = mongoProperties51.getFieldNamingStrategy();
        char[] charArray66 = mongoProperties51.password;
        mongoProperties0.setPassword(charArray66);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
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
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 27017 + "'", int48 == 27017);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.heartbeatSocketTimeout(8);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder7.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        java.lang.String str14 = mongoClientOptions13.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions13);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder19 = builder16.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        int int23 = mongoClientOptions22.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions22);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.description("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder33 = builder27.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.description("");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory51 = mongoClientOptions49.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder52 = builder38.dbDecoderFactory(dBDecoderFactory51);
        com.mongodb.MongoClientOptions.Builder builder53 = builder33.dbDecoderFactory(dBDecoderFactory51);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties54 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str55 = mongoProperties54.database;
        mongoProperties54.setHost("mongodb://localhost/test");
        java.lang.String str58 = mongoProperties54.getHost();
        com.mongodb.MongoClientOptions.Builder builder59 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder59.build();
        int int61 = mongoClientOptions60.getHeartbeatConnectTimeout();
        int int62 = mongoClientOptions60.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties54.builder(mongoClientOptions60);
        javax.net.SocketFactory socketFactory64 = mongoClientOptions60.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory65 = mongoClientOptions60.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder66 = builder33.dbEncoderFactory(dBEncoderFactory65);
        com.mongodb.MongoClientOptions.Builder builder68 = builder33.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder69 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder69.build();
        int int71 = mongoClientOptions70.getHeartbeatConnectTimeout();
        int int72 = mongoClientOptions70.getConnectionsPerHost();
        int int73 = mongoClientOptions70.getLocalThreshold();
        javax.net.SocketFactory socketFactory74 = mongoClientOptions70.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder75 = builder68.socketFactory(socketFactory74);
        com.mongodb.MongoClientOptions.Builder builder76 = builder24.socketFactory(socketFactory74);
        com.mongodb.MongoClientOptions.Builder builder77 = builder15.socketFactory(socketFactory74);
        com.mongodb.MongoClientOptions.Builder builder78 = builder3.socketFactory(socketFactory74);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClient42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(dBDecoderFactory51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "mongodb://localhost/test" + "'", str58, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20000 + "'", int61 == 20000);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(socketFactory64);
        org.junit.Assert.assertNotNull(dBEncoderFactory65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 20000 + "'", int71 == 20000);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 100 + "'", int72 == 100);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 15 + "'", int73 == 15);
        org.junit.Assert.assertNotNull(socketFactory74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        boolean boolean5 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int7 = mongoClientOptions1.getMaxWaitTime();
        int int8 = mongoClientOptions1.getConnectTimeout();
        com.mongodb.ReadConcern readConcern9 = mongoClientOptions1.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 120000 + "'", int7 == 120000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10000 + "'", int8 == 10000);
        org.junit.Assert.assertNotNull(readConcern9);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.heartbeatSocketTimeout(8);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getHeartbeatSocketTimeout();
        int int8 = mongoClientOptions6.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.description("11111111111111111111111111111111");
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder19.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        java.lang.String str26 = mongoClientOptions25.getDescription();
        int int27 = mongoClientOptions25.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str28 = mongoClientOptions25.getRequiredReplicaSetName();
        int int29 = mongoClientOptions25.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern30 = mongoClientOptions25.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder31 = builder18.readConcern(readConcern30);
        com.mongodb.MongoClientOptions.Builder builder33 = builder18.requiredReplicaSetName("20000000004");
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertNotNull(readConcern30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        java.lang.String str1 = java.lang.Integer.toHexString(2013265920);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "78000000" + "'", str1, "78000000");
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
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
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        int int37 = mongoClientOptions36.getMinHeartbeatFrequency();
        boolean boolean38 = mongoClientOptions36.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference39 = mongoClientOptions36.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder40 = builder29.readPreference(readPreference39);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str42 = mongoProperties41.database;
        java.lang.String str43 = mongoProperties41.authenticationDatabase;
        java.lang.Class<?> wildcardClass44 = mongoProperties41.fieldNamingStrategy;
        mongoProperties41.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions47 = null;
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties41.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder51 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder51.build();
        int int53 = mongoClientOptions52.getHeartbeatConnectTimeout();
        int int54 = mongoClientOptions52.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry55 = mongoClientOptions52.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder56 = builder50.codecRegistry(codecRegistry55);
        com.mongodb.MongoClientOptions.Builder builder57 = builder29.codecRegistry(codecRegistry55);
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.maxWaitTime(8);
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 500 + "'", int37 == 500);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(readPreference39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20000 + "'", int53 == 20000);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertNotNull(codecRegistry55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
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
        com.mongodb.MongoClientOptions.Builder builder34 = builder14.cursorFinalizerEnabled(true);
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
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        int int1 = java.lang.Integer.signum(218103810);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatFrequency(123);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.threadsAllowedToBlockForConnectionMultiplier(10);
        com.mongodb.event.CommandListener commandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder11.addCommandListener(commandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(commandListenerList5);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClientOptions.Builder builder8 = mongoProperties0.builder(mongoClientOptions7);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("3548381184");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 3548381184");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        int int2 = java.lang.Integer.compare(200000000, 1889533965);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(45435459, 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "45435459" + "'", str2, "45435459");
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        char[] charArray4 = mongoProperties0.getPassword();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setUri("");
        mongoProperties0.database = "212746274";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        int int1 = java.lang.Integer.numberOfTrailingZeros(127362560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
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
        java.lang.Class<?> wildcardClass41 = mongoProperties0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
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
        java.lang.Integer int46 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.database;
        java.lang.String str49 = mongoProperties47.authenticationDatabase;
        java.lang.Integer int50 = mongoProperties47.port;
        java.lang.String str51 = mongoProperties47.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions53 = null;
        org.springframework.core.env.Environment environment54 = null;
        com.mongodb.MongoClient mongoClient55 = mongoProperties52.createMongoClient(mongoClientOptions53, environment54);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder59 = builder56.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties52.builder(mongoClientOptions62);
        int int64 = mongoClientOptions62.getLocalThreshold();
        int int65 = mongoClientOptions62.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder66 = mongoProperties47.builder(mongoClientOptions62);
        java.lang.String str67 = mongoClientOptions62.getRequiredReplicaSetName();
        boolean boolean68 = mongoClientOptions62.isSslInvalidHostNameAllowed();
        int int69 = mongoClientOptions62.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties0.builder(mongoClientOptions62);
        com.mongodb.ReadPreference readPreference71 = mongoClientOptions62.getReadPreference();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
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
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(mongoClient55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 15 + "'", int64 == 15);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(readPreference71);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList15 = mongoClientOptions10.getCommandListeners();
        int int16 = mongoClientOptions10.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(commandListenerList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        int int2 = java.lang.Integer.parseUnsignedInt("7", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        int int2 = java.lang.Integer.max(14, 212729856);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 212729856 + "'", int2 == 212729856);
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        java.lang.String str1 = java.lang.Integer.toString(5120);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5120" + "'", str1, "5120");
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        java.lang.Integer int1 = java.lang.Integer.getInteger("2b02");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
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
        javax.net.SocketFactory socketFactory27 = mongoClientOptions6.getSocketFactory();
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
        org.junit.Assert.assertNotNull(socketFactory27);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        int int1 = java.lang.Integer.reverse(1114112);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34816 + "'", int1 == 34816);
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.threadsAllowedToBlockForConnectionMultiplier(1626990123);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setAuthenticationDatabase("25");
        mongoProperties0.setUri("");
        mongoProperties0.setUsername("27017");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        java.lang.String str2 = java.lang.Integer.toString(83886080, 2560);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "83886080" + "'", str2, "83886080");
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
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
        java.lang.String str31 = mongoClientOptions27.getRequiredReplicaSetName();
        int int32 = mongoClientOptions27.getSocketTimeout();
        int int33 = mongoClientOptions27.getHeartbeatConnectTimeout();
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1920);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1920" + "'", str1, "1920");
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        int int2 = java.lang.Integer.rotateLeft(11, 2097152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        int int1 = java.lang.Integer.reverseBytes(1090519040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("35");
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.connectTimeout(27017);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatFrequency((-1337982976));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: heartbeatFrequency must be > 0");
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
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        java.lang.String str2 = java.lang.Integer.toString((-570425344), 1200016507);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-570425344" + "'", str2, "-570425344");
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
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
        java.lang.Class<?> wildcardClass21 = builder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList2 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        boolean boolean4 = mongoClientOptions1.isSslEnabled();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(commandListenerList2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("2b0c0", 215);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 215 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.database;
        char[] charArray12 = mongoProperties0.password;
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
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        int int2 = java.lang.Integer.compareUnsigned(0, 5242880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(157187, 342288864);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "157187" + "'", str2, "157187");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("5371574540", 558701952);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 558701952 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
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
        boolean boolean29 = mongoProperties0.hasCustomAddress();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.threadsAllowedToBlockForConnectionMultiplier(558701952);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(8);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder14 = builder11.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        java.lang.String str18 = mongoClientOptions17.getDescription();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions17);
        int int20 = mongoClientOptions17.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder21 = com.mongodb.MongoClientOptions.builder(mongoClientOptions17);
        int int22 = mongoClientOptions17.getMinHeartbeatFrequency();
        org.bson.codecs.configuration.CodecRegistry codecRegistry23 = mongoClientOptions17.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder24 = builder10.codecRegistry(codecRegistry23);
        com.mongodb.MongoClientOptions.Builder builder25 = builder0.codecRegistry(codecRegistry23);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
        org.junit.Assert.assertNotNull(codecRegistry23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        java.lang.String str1 = java.lang.Integer.toOctalString(16384);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "40000" + "'", str1, "40000");
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.database;
        java.lang.Integer int10 = mongoProperties8.getPort();
        java.lang.String str11 = mongoProperties8.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int13 = mongoProperties12.port;
        mongoProperties12.setAuthenticationDatabase("");
        java.lang.Integer int16 = mongoProperties12.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray24 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties17.password = charArray24;
        mongoProperties12.setPassword(charArray24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray34 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties27.password = charArray34;
        mongoProperties12.setPassword(charArray34);
        mongoProperties8.setPassword(charArray34);
        mongoProperties0.password = charArray34;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        int int1 = java.lang.Integer.signum(808146084);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        int int2 = java.lang.Integer.rotateLeft(2048, 536870912);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2048 + "'", int2 == 2048);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(16);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectTimeout(104857600);
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
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(24);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.threadsAllowedToBlockForConnectionMultiplier(20000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.database;
        java.lang.String str39 = mongoProperties37.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties37.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxWaitTime((int) '4');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.database;
        mongoProperties44.setHost("mongodb://localhost/test");
        java.lang.String str48 = mongoProperties44.getHost();
        com.mongodb.MongoClientOptions.Builder builder49 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder49.build();
        int int51 = mongoClientOptions50.getHeartbeatConnectTimeout();
        int int52 = mongoClientOptions50.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties44.builder(mongoClientOptions50);
        javax.net.SocketFactory socketFactory54 = mongoClientOptions50.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder55 = builder43.socketFactory(socketFactory54);
        com.mongodb.MongoClientOptions.Builder builder56 = builder32.socketFactory(socketFactory54);
        com.mongodb.MongoClientOptions.Builder builder57 = builder12.socketFactory(socketFactory54);
        com.mongodb.MongoClientOptions.Builder builder58 = builder12.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.heartbeatConnectTimeout(25);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "mongodb://localhost/test" + "'", str48, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20000 + "'", int51 == 20000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(socketFactory54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        int int2 = java.lang.Integer.rotateRight(127362600, 32785);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1290533941) + "'", int2 == (-1290533941));
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        java.lang.String str10 = mongoProperties0.getDatabase();
        java.lang.String str11 = mongoProperties0.username;
        boolean boolean12 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getHeartbeatFrequency();
        com.mongodb.DBEncoderFactory dBEncoderFactory7 = mongoClientOptions1.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory7);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
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
        int int15 = mongoClientOptions10.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions10.getDbDecoderFactory();
        java.lang.Class<?> wildcardClass17 = mongoClientOptions10.getClass();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1006632960));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        java.lang.String str1 = java.lang.Integer.toString((-1929379840));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1929379840" + "'", str1, "-1929379840");
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(141, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "141" + "'", str2, "141");
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setUri("");
        int int6 = mongoProperties0.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int8 = mongoProperties7.port;
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties7.builder(mongoClientOptions9);
        mongoProperties7.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray20 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties13.password = charArray20;
        java.lang.String str22 = mongoProperties13.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.database;
        java.lang.String str25 = mongoProperties23.authenticationDatabase;
        java.lang.Integer int26 = mongoProperties23.port;
        java.lang.Class<java.lang.Integer> intClass27 = java.lang.Integer.TYPE;
        mongoProperties23.fieldNamingStrategy = intClass27;
        mongoProperties13.setFieldNamingStrategy(intClass27);
        mongoProperties7.fieldNamingStrategy = intClass27;
        mongoProperties0.fieldNamingStrategy = intClass27;
        int int32 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str33 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.port = 29;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(intClass27);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27017 + "'", int32 == 27017);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "12" + "'", str33, "12");
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
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
        javax.net.SocketFactory socketFactory50 = mongoClientOptions42.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions42);
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
        org.junit.Assert.assertNotNull(socketFactory50);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        int int2 = java.lang.Integer.compareUnsigned(50000001, 1410560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
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
        mongoProperties0.gridFsDatabase = "268828672";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
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
        int int14 = mongoClientOptions10.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList2 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int4 = mongoClientOptions1.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(commandListenerList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        mongoProperties0.setHost("97");
        mongoProperties0.username = "";
        com.mongodb.MongoClientOptions.Builder builder14 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList16 = mongoClientOptions15.getCommandListeners();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions15.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions15);
        boolean boolean19 = mongoProperties0.hasCustomCredentials();
        java.lang.String str20 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(commandListenerList16);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "test" + "'", str20, "test");
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        int int1 = java.lang.Integer.bitCount(120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        java.lang.String str1 = java.lang.Integer.toBinaryString(2560);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101000000000" + "'", str1, "101000000000");
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", (-603979775));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        java.lang.String str2 = java.lang.Integer.toString(0, 4194304);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
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
        java.lang.String str23 = mongoProperties0.getAuthenticationDatabase();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Class<?> wildcardClass3 = mongoProperties0.getFieldNamingStrategy();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
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
        mongoProperties0.gridFsDatabase = "18";
        java.lang.String str27 = mongoProperties0.getDatabase();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10c944" + "'", str27, "10c944");
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
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
        int int11 = mongoClientOptions6.getSocketTimeout();
        int int12 = mongoClientOptions6.getConnectionsPerHost();
        boolean boolean13 = mongoClientOptions6.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int15 = mongoClientOptions6.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        int int1 = java.lang.Integer.signum(335544320);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Class<java.lang.Integer> intClass4 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass4;
        com.mongodb.MongoClientOptions.Builder builder6 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int9 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int10 = mongoClientOptions7.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions7);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList13 = mongoClientOptions7.getCommandListeners();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(intClass4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(commandListenerList13);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
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
        mongoProperties0.clearPassword();
        mongoProperties0.host = "110100";
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList35 = mongoClientOptions33.getCommandListeners();
        java.lang.String str36 = mongoClientOptions33.getRequiredReplicaSetName();
        int int37 = mongoClientOptions33.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment38 = null;
        com.mongodb.MongoClient mongoClient39 = mongoProperties0.createMongoClient(mongoClientOptions33, environment38);
        com.mongodb.ReadConcern readConcern40 = mongoClientOptions33.getReadConcern();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(commandListenerList35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(readConcern40);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder17.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionLifeTime(399297740);
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        java.lang.String str5 = mongoProperties0.database;
        java.lang.String str6 = mongoProperties0.host;
        int int7 = mongoProperties0.getDEFAULT_PORT();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        mongoProperties0.authenticationDatabase = "34e7e76";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
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
        java.lang.String str20 = mongoProperties0.getUsername();
        java.lang.String str21 = mongoProperties0.getMongoClientDatabase();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "34" + "'", str20, "34");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "test" + "'", str21, "test");
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        int int2 = java.lang.Integer.divideUnsigned(1862391011, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58199719 + "'", int2 == 58199719);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1073548744));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        int int6 = mongoClientOptions1.getMaxConnectionIdleTime();
        com.mongodb.ReadConcern readConcern7 = mongoClientOptions1.getReadConcern();
        int int8 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList9 = mongoClientOptions1.getCommandListeners();
        int int10 = mongoClientOptions1.getConnectionsPerHost();
        int int11 = mongoClientOptions1.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(commandListenerList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(readConcern7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(commandListenerList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(24);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.threadsAllowedToBlockForConnectionMultiplier(20000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.database;
        java.lang.String str24 = mongoProperties22.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties22.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxWaitTime((int) '4');
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
        com.mongodb.MongoClientOptions.Builder builder40 = builder28.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder17.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions.Builder builder43 = builder17.heartbeatConnectTimeout(1200000000);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.connectTimeout(9);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions47 = null;
        org.springframework.core.env.Environment environment48 = null;
        com.mongodb.MongoClient mongoClient49 = mongoProperties46.createMongoClient(mongoClientOptions47, environment48);
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder53 = builder50.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.build();
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties46.builder(mongoClientOptions56);
        com.mongodb.DBDecoderFactory dBDecoderFactory58 = mongoClientOptions56.getDbDecoderFactory();
        int int59 = mongoClientOptions56.getSocketTimeout();
        int int60 = mongoClientOptions56.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder61 = com.mongodb.MongoClientOptions.builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions.Builder builder62 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder65 = builder62.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions68 = builder65.build();
        int int69 = mongoClientOptions68.getMaxConnectionLifeTime();
        boolean boolean70 = mongoClientOptions68.isSslEnabled();
        com.mongodb.WriteConcern writeConcern71 = mongoClientOptions68.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder72 = builder61.writeConcern(writeConcern71);
        com.mongodb.MongoClientOptions.Builder builder73 = builder45.writeConcern(writeConcern71);
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "mongodb://localhost/test" + "'", str33, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClient49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(dBDecoderFactory58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 500 + "'", int60 == 500);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoClientOptions68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(writeConcern71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
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
        int int97 = mongoClientOptions93.getHeartbeatFrequency();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList98 = mongoClientOptions93.getCommandListeners();
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
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 10000 + "'", int97 == 10000);
        org.junit.Assert.assertNotNull(commandListenerList98);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        int int1 = java.lang.Integer.bitCount(1250);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1610612992);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        boolean boolean4 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setPort((java.lang.Integer) 8);
        mongoProperties0.gridFsDatabase = "";
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(2731246, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2731246" + "'", str2, "2731246");
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(24);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.threadsAllowedToBlockForConnectionMultiplier(20000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.database;
        java.lang.String str24 = mongoProperties22.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties22.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxWaitTime((int) '4');
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
        com.mongodb.MongoClientOptions.Builder builder40 = builder28.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder17.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder42.build();
        boolean boolean44 = mongoClientOptions43.isCursorFinalizerEnabled();
        int int45 = mongoClientOptions43.getHeartbeatConnectTimeout();
        boolean boolean46 = mongoClientOptions43.isSslEnabled();
        com.mongodb.WriteConcern writeConcern47 = mongoClientOptions43.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder48 = builder41.writeConcern(writeConcern47);
        com.mongodb.MongoClientOptions.Builder builder50 = builder41.socketTimeout(9926681);
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "mongodb://localhost/test" + "'", str33, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 20000 + "'", int45 == 20000);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(writeConcern47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        mongoProperties0.setHost("97");
        mongoProperties0.username = "";
        java.lang.String str14 = mongoProperties0.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray22 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties15.password = charArray22;
        mongoProperties15.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray33 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties26.password = charArray33;
        java.lang.String str35 = mongoProperties26.database;
        java.lang.String str36 = mongoProperties26.getHost();
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
        int int49 = mongoClientOptions47.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        java.lang.String str51 = mongoClientOptions47.getDescription();
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        org.springframework.core.env.Environment environment53 = null;
        com.mongodb.MongoClient mongoClient54 = mongoProperties26.createMongoClient(mongoClientOptions47, environment53);
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties15.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder55.build();
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties0.builder(mongoClientOptions56);
        mongoProperties0.uri = "1250";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(mongoClient40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(mongoClient54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        int int2 = java.lang.Integer.rotateRight((-1006632960), 200000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1006632960) + "'", int2 == (-1006632960));
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
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
        int int36 = mongoClientOptions28.getConnectTimeout();
        int int37 = mongoClientOptions28.getServerSelectionTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry38 = mongoClientOptions28.getCodecRegistry();
        int int39 = mongoClientOptions28.getMaxConnectionIdleTime();
        java.lang.String str40 = mongoClientOptions28.getRequiredReplicaSetName();
        int int41 = mongoClientOptions28.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean42 = mongoClientOptions28.isAlwaysUseMBeans();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10000 + "'", int36 == 10000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 30000 + "'", int37 == 30000);
        org.junit.Assert.assertNotNull(codecRegistry38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.sslEnabled(false);
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
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        int int1 = java.lang.Integer.numberOfTrailingZeros(420020224);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        int int2 = java.lang.Integer.max(31000000, 1111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31000000 + "'", int2 == 31000000);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        int int1 = java.lang.Integer.signum(1626990123);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
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
        int int13 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean14 = mongoClientOptions10.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        java.lang.String str1 = java.lang.Integer.toBinaryString(11034880);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101010000110000100000000" + "'", str1, "101010000110000100000000");
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        long long1 = java.lang.Integer.toUnsignedLong(1111);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1111L + "'", long1 == 1111L);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
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
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions20);
        int int22 = mongoClientOptions20.getConnectTimeout();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions20.getReadPreference();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertNotNull(readPreference23);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(111110100);
        com.mongodb.event.CommandListener commandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder10.addCommandListener(commandListener13);
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
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.database;
        java.lang.String str5 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        int int1 = java.lang.Integer.signum(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.authenticationDatabase = "1024";
        com.mongodb.MongoClientOptions.Builder builder14 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        int int17 = mongoClientOptions15.getMaxConnectionLifeTime();
        int int18 = mongoClientOptions15.getMaxConnectionLifeTime();
        int int19 = mongoClientOptions15.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions15);
        boolean boolean22 = mongoClientOptions15.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        int int2 = java.lang.Integer.sum(78528512, 16560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78545072 + "'", int2 == 78545072);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.springframework.core.env.Environment environment8 = null;
        com.mongodb.MongoClient mongoClient9 = mongoProperties6.createMongoClient(mongoClientOptions7, environment8);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties6.builder(mongoClientOptions16);
        int int18 = mongoClientOptions16.getSocketTimeout();
        boolean boolean19 = mongoClientOptions16.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions16);
        int int22 = mongoClientOptions16.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions16);
        com.mongodb.WriteConcern writeConcern24 = mongoClientOptions16.getWriteConcern();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(mongoClient9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(writeConcern24);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        org.springframework.core.env.Environment environment5 = null;
        com.mongodb.MongoClient mongoClient6 = mongoProperties3.createMongoClient(mongoClientOptions4, environment5);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder7.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties3.builder(mongoClientOptions13);
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions13.getDbDecoderFactory();
        int int16 = mongoClientOptions13.getSocketTimeout();
        int int17 = mongoClientOptions13.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions13);
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions13.getWriteConcern();
        boolean boolean20 = mongoClientOptions13.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
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
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketTimeout(35);
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
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(24);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.threadsAllowedToBlockForConnectionMultiplier(20000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.database;
        java.lang.String str39 = mongoProperties37.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties37.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxWaitTime((int) '4');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.database;
        mongoProperties44.setHost("mongodb://localhost/test");
        java.lang.String str48 = mongoProperties44.getHost();
        com.mongodb.MongoClientOptions.Builder builder49 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder49.build();
        int int51 = mongoClientOptions50.getHeartbeatConnectTimeout();
        int int52 = mongoClientOptions50.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties44.builder(mongoClientOptions50);
        javax.net.SocketFactory socketFactory54 = mongoClientOptions50.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder55 = builder43.socketFactory(socketFactory54);
        com.mongodb.MongoClientOptions.Builder builder56 = builder32.socketFactory(socketFactory54);
        com.mongodb.MongoClientOptions.Builder builder57 = builder14.socketFactory(socketFactory54);
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.connectionsPerHost(1024);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "mongodb://localhost/test" + "'", str48, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20000 + "'", int51 == 20000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(socketFactory54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.gridFsDatabase;
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1200000123", 1261534);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1261534 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions1.getDbDecoderFactory();
        boolean boolean8 = mongoClientOptions1.isAlwaysUseMBeans();
        int int9 = mongoClientOptions1.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        java.lang.String str2 = java.lang.Integer.toString(1610612736, 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "965e88c6" + "'", str2, "965e88c6");
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.Integer int5 = mongoProperties0.port;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
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
        org.bson.codecs.configuration.CodecRegistry codecRegistry15 = mongoClientOptions9.getCodecRegistry();
        int int16 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions9.getHeartbeatSocketTimeout();
        java.lang.String str18 = mongoClientOptions9.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(codecRegistry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        java.lang.String str1 = java.lang.Integer.toHexString((-570425344));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "de000000" + "'", str1, "de000000");
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
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
        java.lang.Integer int11 = mongoProperties0.port;
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
        int int44 = mongoClientOptions39.getMaxConnectionIdleTime();
        int int45 = mongoClientOptions39.getMaxWaitTime();
        int int46 = mongoClientOptions39.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties0.builder(mongoClientOptions39);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minHeartbeatFrequency(1090519040);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(int11);
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
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 120000 + "'", int45 == 120000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10000 + "'", int46 == 10000);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
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
        int int17 = mongoClientOptions7.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        int int2 = java.lang.Integer.remainderUnsigned((-603979775), (-528443136));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-603979775) + "'", int2 == (-603979775));
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        int int1 = java.lang.Integer.highestOneBit(32785);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32768 + "'", int1 == 32768);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
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
        int int13 = mongoClientOptions6.getSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1250);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1250" + "'", str1, "1250");
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        int int1 = java.lang.Integer.reverse(229);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1493172224) + "'", int1 == (-1493172224));
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
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
        boolean boolean42 = mongoClientOptions15.isSocketKeepAlive();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1010000000000000000000000000", 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1010000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        int int1 = java.lang.Integer.lowestOneBit(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-1916216192));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10001101110010001101110010000000" + "'", str1, "10001101110010001101110010000000");
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        int int1 = java.lang.Integer.reverse(10060000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 117545216 + "'", int1 == 117545216);
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        java.lang.String str1 = java.lang.Integer.toHexString(11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "b" + "'", str1, "b");
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(false);
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
        int int21 = mongoClientOptions19.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList22 = mongoClientOptions19.getCommandListeners();
        int int23 = mongoClientOptions19.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions19.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder2.dbDecoderFactory(dBDecoderFactory24);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionLifeTime(176320);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.socketTimeout(218103810);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClient12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(commandListenerList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "212746274";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        int int1 = java.lang.Integer.signum(5120000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        int int2 = java.lang.Integer.remainderUnsigned(7, 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        int int2 = java.lang.Integer.remainderUnsigned(1889533965, 7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
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
        java.lang.Integer int28 = mongoProperties0.getPort();
        java.lang.Integer int29 = mongoProperties0.getPort();
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
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(int29);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.database;
        mongoProperties0.uri = "0";
        mongoProperties0.clearPassword();
        mongoProperties0.authenticationDatabase = "200";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
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
        int int20 = mongoClientOptions16.getConnectionsPerHost();
        boolean boolean21 = mongoClientOptions16.isSslInvalidHostNameAllowed();
        int int22 = mongoClientOptions16.getHeartbeatSocketTimeout();
        int int23 = mongoClientOptions16.getConnectTimeout();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        int int2 = java.lang.Integer.sum(776936832, 101000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 777037832 + "'", int2 == 777037832);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("b");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"b\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        int int2 = java.lang.Integer.divideUnsigned(9, 776936832);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        int int2 = java.lang.Integer.remainderUnsigned(60, 27528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60 + "'", int2 == 60);
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder4 = builder3.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1024);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.serverSelectionTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.threadsAllowedToBlockForConnectionMultiplier(10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
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
        char[] charArray38 = mongoProperties0.password;
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
        boolean boolean55 = mongoProperties39.hasCustomCredentials();
        java.lang.String str56 = mongoProperties39.gridFsDatabase;
        char[] charArray57 = mongoProperties39.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties58 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int59 = mongoProperties58.port;
        mongoProperties58.setUri("hi!");
        char[] charArray62 = mongoProperties58.getPassword();
        com.mongodb.MongoClientOptions.Builder builder63 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions64 = builder63.build();
        boolean boolean65 = mongoClientOptions64.isCursorFinalizerEnabled();
        int int66 = mongoClientOptions64.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern67 = mongoClientOptions64.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder68 = mongoProperties58.builder(mongoClientOptions64);
        com.mongodb.MongoClientOptions.Builder builder69 = mongoProperties39.builder(mongoClientOptions64);
        char[] charArray70 = mongoProperties39.getPassword();
        mongoProperties0.password = charArray70;
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
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int59);
        org.junit.Assert.assertNull(charArray62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(mongoClientOptions64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 20000 + "'", int66 == 20000);
        org.junit.Assert.assertNotNull(writeConcern67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
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
        java.lang.String str13 = mongoProperties0.gridFsDatabase;
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.core.env.Environment environment15 = null;
        int int16 = mongoProperties0.determinePort(environment15);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.database;
        mongoProperties0.setAuthenticationDatabase("34");
        mongoProperties0.setDatabase("");
        boolean boolean16 = mongoProperties0.hasCustomCredentials();
        int int17 = mongoProperties0.getDEFAULT_PORT();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27017 + "'", int17 == 27017);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.sslInvalidHostNameAllowed(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
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
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectionsPerHost((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder17.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder20.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxWaitTime((int) (byte) 10);
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
        com.mongodb.MongoClientOptions.Builder builder37 = builder23.dbDecoderFactory(dBDecoderFactory36);
        com.mongodb.MongoClientOptions.Builder builder38 = builder16.dbDecoderFactory(dBDecoderFactory36);
        com.mongodb.MongoClientOptions.Builder builder39 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder39.build();
        int int41 = mongoClientOptions40.getHeartbeatConnectTimeout();
        int int42 = mongoClientOptions40.getMaxConnectionIdleTime();
        int int43 = mongoClientOptions40.getHeartbeatFrequency();
        boolean boolean44 = mongoClientOptions40.isAlwaysUseMBeans();
        com.mongodb.DBEncoderFactory dBEncoderFactory45 = mongoClientOptions40.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder46 = builder38.dbEncoderFactory(dBEncoderFactory45);
        com.mongodb.MongoClientOptions.Builder builder48 = builder38.sslEnabled(false);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(dBDecoderFactory36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10000 + "'", int43 == 10000);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        int int2 = java.lang.Integer.parseUnsignedInt("177", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 177 + "'", int2 == 177);
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(6744544, 256);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6744544" + "'", str2, "6744544");
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        int int2 = java.lang.Integer.compareUnsigned((-301989888), 304);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
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
        java.lang.String str31 = mongoProperties0.uri;
        java.lang.Integer int32 = mongoProperties0.getPort();
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
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int32);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("100110000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 100110000000000000000000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        int int2 = java.lang.Integer.remainderUnsigned(1250, (-2147456632));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1250 + "'", int2 == 1250);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        int int2 = java.lang.Integer.remainderUnsigned(1250, 54546204);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1250 + "'", int2 == 1250);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("1024");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder5.threadsAllowedToBlockForConnectionMultiplier((-1073548744));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: threadsAllowedToBlockForConnectionMultiplier must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry4 = mongoClientOptions1.getCodecRegistry();
        int int5 = mongoClientOptions1.getConnectTimeout();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(codecRegistry4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10000 + "'", int5 == 10000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("de000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"de000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.username = "test";
        mongoProperties0.clearPassword();
        java.lang.String str7 = mongoProperties0.getUsername();
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.setUsername("3758096383");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        int int2 = java.lang.Integer.rotateRight(7, (-1006632960));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList3 = mongoClientOptions1.getCommandListeners();
        boolean boolean4 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern5 = mongoClientOptions1.getWriteConcern();
        boolean boolean6 = mongoClientOptions1.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.description("");
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
        com.mongodb.MongoClientOptions.Builder builder35 = builder21.dbDecoderFactory(dBDecoderFactory34);
        com.mongodb.MongoClientOptions.Builder builder36 = builder16.dbDecoderFactory(dBDecoderFactory34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder7.dbDecoderFactory(dBDecoderFactory34);
        com.mongodb.MongoClientOptions.Builder builder39 = builder7.maxConnectionIdleTime(872415432);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.localThreshold((int) '4');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(commandListenerList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(writeConcern5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        boolean boolean5 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList7 = mongoClientOptions1.getCommandListeners();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions1.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(commandListenerList7);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
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
        java.lang.String str26 = mongoProperties0.uri;
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb://localhost/test" + "'", str26, "mongodb://localhost/test");
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
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
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.heartbeatFrequency(34816);
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
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.uri;
        mongoProperties0.setPort((java.lang.Integer) 0);
        boolean boolean5 = mongoProperties0.hasCustomAddress();
        mongoProperties0.authenticationDatabase = "100";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str9 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb://localhost/test" + "'", str2, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        boolean boolean3 = mongoClientOptions1.isAlwaysUseMBeans();
        boolean boolean4 = mongoClientOptions1.isAlwaysUseMBeans();
        int int5 = mongoClientOptions1.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
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
        java.lang.String str14 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        boolean boolean16 = mongoClientOptions6.isSslInvalidHostNameAllowed();
        int int17 = mongoClientOptions6.getConnectionsPerHost();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        int int1 = java.lang.Integer.lowestOneBit(6553600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 262144 + "'", int1 == 262144);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
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
        mongoProperties0.setHost("1111111111111111111111111111111");
        mongoProperties0.clearPassword();
        char[] charArray22 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int24 = mongoProperties23.port;
        mongoProperties23.setUri("hi!");
        java.lang.String str27 = mongoProperties23.authenticationDatabase;
        char[] charArray28 = mongoProperties23.getPassword();
        java.lang.String str29 = mongoProperties23.getGridFsDatabase();
        java.lang.Class<?> wildcardClass30 = mongoProperties23.fieldNamingStrategy;
        java.lang.String str31 = mongoProperties23.getDatabase();
        mongoProperties23.clearPassword();
        java.lang.String str33 = mongoProperties23.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray41 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties34.password = charArray41;
        java.lang.Class<java.lang.Integer> intClass43 = java.lang.Integer.TYPE;
        mongoProperties34.fieldNamingStrategy = intClass43;
        java.lang.String str45 = mongoProperties34.username;
        java.lang.String str46 = mongoProperties34.getUsername();
        mongoProperties34.setHost("1100100");
        java.lang.Integer int49 = mongoProperties34.port;
        java.lang.Integer int50 = mongoProperties34.port;
        java.lang.String str51 = mongoProperties34.getUri();
        char[] charArray52 = mongoProperties34.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int54 = mongoProperties53.port;
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties53.builder(mongoClientOptions55);
        mongoProperties53.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray66 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties59.password = charArray66;
        java.lang.String str68 = mongoProperties59.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties69 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str70 = mongoProperties69.database;
        java.lang.String str71 = mongoProperties69.authenticationDatabase;
        java.lang.Integer int72 = mongoProperties69.port;
        java.lang.Class<java.lang.Integer> intClass73 = java.lang.Integer.TYPE;
        mongoProperties69.fieldNamingStrategy = intClass73;
        mongoProperties59.setFieldNamingStrategy(intClass73);
        mongoProperties53.fieldNamingStrategy = intClass73;
        mongoProperties34.setFieldNamingStrategy(intClass73);
        mongoProperties23.setFieldNamingStrategy(intClass73);
        mongoProperties0.fieldNamingStrategy = intClass73;
        java.lang.Integer int80 = mongoProperties0.port;
        mongoProperties0.setGridFsDatabase("97");
        java.lang.Integer int83 = mongoProperties0.port;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "mongodb://localhost/test" + "'", str51, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(int72);
        org.junit.Assert.assertNotNull(intClass73);
        org.junit.Assert.assertNull(int80);
        org.junit.Assert.assertNull(int83);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        int int1 = java.lang.Integer.signum((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        int int2 = java.lang.Integer.sum(15, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
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
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.description("");
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder31 = builder24.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str33 = mongoProperties32.database;
        mongoProperties32.setHost("mongodb://localhost/test");
        java.lang.String str36 = mongoProperties32.getHost();
        com.mongodb.MongoClientOptions.Builder builder37 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder37.build();
        int int39 = mongoClientOptions38.getHeartbeatConnectTimeout();
        int int40 = mongoClientOptions38.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties32.builder(mongoClientOptions38);
        javax.net.SocketFactory socketFactory42 = mongoClientOptions38.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory43 = mongoClientOptions38.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder44 = builder24.dbEncoderFactory(dBEncoderFactory43);
        com.mongodb.MongoClientOptions.Builder builder45 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder45.build();
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.heartbeatConnectTimeout((int) (byte) -1);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray62 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties55.password = charArray62;
        java.lang.Class<java.lang.Integer> intClass64 = java.lang.Integer.TYPE;
        mongoProperties55.fieldNamingStrategy = intClass64;
        java.lang.String str66 = mongoProperties55.username;
        com.mongodb.MongoClientOptions mongoClientOptions67 = null;
        com.mongodb.MongoClientOptions.Builder builder68 = mongoProperties55.builder(mongoClientOptions67);
        com.mongodb.MongoClientOptions mongoClientOptions69 = null;
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties55.builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.maxConnectionIdleTime((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties73 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str74 = mongoProperties73.database;
        java.lang.String str75 = mongoProperties73.authenticationDatabase;
        java.lang.Class<?> wildcardClass76 = mongoProperties73.fieldNamingStrategy;
        mongoProperties73.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions79 = null;
        com.mongodb.MongoClientOptions.Builder builder80 = mongoProperties73.builder(mongoClientOptions79);
        com.mongodb.MongoClientOptions mongoClientOptions81 = null;
        com.mongodb.MongoClientOptions.Builder builder82 = mongoProperties73.builder(mongoClientOptions81);
        com.mongodb.MongoClientOptions.Builder builder83 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder85 = builder83.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder86 = builder83.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder88 = builder86.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions89 = builder86.build();
        java.lang.String str90 = mongoClientOptions89.getDescription();
        com.mongodb.MongoClientOptions.Builder builder91 = mongoProperties73.builder(mongoClientOptions89);
        com.mongodb.ReadConcern readConcern92 = mongoClientOptions89.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder93 = builder72.readConcern(readConcern92);
        com.mongodb.MongoClientOptions.Builder builder94 = builder52.readConcern(readConcern92);
        com.mongodb.MongoClientOptions.Builder builder95 = builder24.readConcern(readConcern92);
        com.mongodb.MongoClientOptions.Builder builder96 = builder21.readConcern(readConcern92);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "mongodb://localhost/test" + "'", str36, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20000 + "'", int39 == 20000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(socketFactory42);
        org.junit.Assert.assertNotNull(dBEncoderFactory43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNull(wildcardClass76);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(mongoClientOptions89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(readConcern92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("-2147456632");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: -2147456632");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        boolean boolean14 = mongoClientOptions13.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions13.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions13.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder18 = builder2.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder20 = builder2.maxConnectionIdleTime((-1));
        java.lang.Class<?> wildcardClass21 = builder20.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The connection string is invalid. Connection strings must start with 'mongodb://'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.lang.String str1 = java.lang.Integer.toOctalString(101000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "305210" + "'", str1, "305210");
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory34 = mongoClientOptions30.getDbEncoderFactory();
        int int35 = mongoClientOptions30.getServerSelectionTimeout();
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions30.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions30);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.heartbeatSocketTimeout(141);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(commandListenerList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(dBEncoderFactory34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 30000 + "'", int35 == 30000);
        org.junit.Assert.assertNotNull(writeConcern36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("101010000110000100000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"101010000110000100000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
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
        int int23 = mongoClientOptions21.getLocalThreshold();
        int int24 = mongoClientOptions21.getMaxConnectionIdleTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry25 = mongoClientOptions21.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder26 = builder10.codecRegistry(codecRegistry25);
        java.lang.Class<?> wildcardClass27 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClient14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(codecRegistry25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
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
        mongoProperties0.setPort((java.lang.Integer) 120000);
        mongoProperties0.setUri("111110100");
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
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(54546204, 31000000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "54546204" + "'", str2, "54546204");
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
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
        int int16 = mongoClientOptions10.getSocketTimeout();
        int int17 = mongoClientOptions10.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120000 + "'", int17 == 120000);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
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
        int int34 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setGridFsDatabase("17");
        com.mongodb.MongoClientOptions.Builder builder37 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder37.build();
        java.lang.String str39 = mongoClientOptions38.getRequiredReplicaSetName();
        int int40 = mongoClientOptions38.getServerSelectionTimeout();
        int int41 = mongoClientOptions38.getThreadsAllowedToBlockForConnectionMultiplier();
        int int42 = mongoClientOptions38.getMinConnectionsPerHost();
        int int43 = mongoClientOptions38.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties0.builder(mongoClientOptions38);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 27017 + "'", int34 == 27017);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 30000 + "'", int40 == 30000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 120000 + "'", int43 == 120000);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        java.lang.String str5 = mongoProperties0.getUri();
        char[] charArray6 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.database;
        java.lang.String str9 = mongoProperties7.authenticationDatabase;
        java.lang.String str10 = mongoProperties7.getMongoClientDatabase();
        mongoProperties7.setUsername("-1");
        java.lang.String str13 = mongoProperties7.getDatabase();
        java.lang.String str14 = mongoProperties7.getUsername();
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.description("");
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder27 = builder21.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder33 = builder29.maxConnectionLifeTime(1);
        boolean boolean34 = mongoClientOptions16.equals((java.lang.Object) 1);
        int int35 = mongoClientOptions16.getMaxConnectionIdleTime();
        int int36 = mongoClientOptions16.getMaxWaitTime();
        int int37 = mongoClientOptions16.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties7.builder(mongoClientOptions16);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.database;
        java.lang.Integer int41 = mongoProperties39.getPort();
        java.lang.String str42 = mongoProperties39.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int44 = mongoProperties43.port;
        mongoProperties43.setAuthenticationDatabase("");
        java.lang.Integer int47 = mongoProperties43.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties48 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray55 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties48.password = charArray55;
        mongoProperties43.setPassword(charArray55);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties58 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray65 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties58.password = charArray65;
        mongoProperties43.setPassword(charArray65);
        mongoProperties39.setPassword(charArray65);
        mongoProperties7.setPassword(charArray65);
        mongoProperties0.password = charArray65;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1" + "'", str14, "-1");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 120000 + "'", int36 == 120000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(int44);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean13 = mongoProperties0.hasCustomAddress();
        java.lang.String str14 = mongoProperties0.host;
        org.springframework.core.env.Environment environment15 = null;
        int int16 = mongoProperties0.determinePort(environment15);
        java.lang.Class<?> wildcardClass17 = mongoProperties0.getFieldNamingStrategy();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        java.lang.String str10 = mongoProperties0.getDatabase();
        java.lang.String str11 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray19 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties12.password = charArray19;
        java.lang.Class<java.lang.Integer> intClass21 = java.lang.Integer.TYPE;
        mongoProperties12.fieldNamingStrategy = intClass21;
        java.lang.String str23 = mongoProperties12.username;
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties12.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions26);
        mongoProperties12.setUsername("34");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.springframework.core.env.Environment environment32 = null;
        com.mongodb.MongoClient mongoClient33 = mongoProperties30.createMongoClient(mongoClientOptions31, environment32);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder37 = builder34.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties30.builder(mongoClientOptions40);
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions40.getDbDecoderFactory();
        int int43 = mongoClientOptions40.getSocketTimeout();
        int int44 = mongoClientOptions40.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties12.builder(mongoClientOptions40);
        char[] charArray46 = mongoProperties12.getPassword();
        mongoProperties0.password = charArray46;
        char[] charArray48 = mongoProperties0.password;
        mongoProperties0.setHost("de000000");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClient33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
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
        mongoProperties0.uri = "1200000123";
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("35");
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.socketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.threadsAllowedToBlockForConnectionMultiplier(1090519040);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
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
        java.lang.Integer int46 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.database;
        java.lang.String str49 = mongoProperties47.authenticationDatabase;
        java.lang.Integer int50 = mongoProperties47.port;
        java.lang.String str51 = mongoProperties47.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions53 = null;
        org.springframework.core.env.Environment environment54 = null;
        com.mongodb.MongoClient mongoClient55 = mongoProperties52.createMongoClient(mongoClientOptions53, environment54);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder59 = builder56.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties52.builder(mongoClientOptions62);
        int int64 = mongoClientOptions62.getLocalThreshold();
        int int65 = mongoClientOptions62.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder66 = mongoProperties47.builder(mongoClientOptions62);
        java.lang.String str67 = mongoClientOptions62.getRequiredReplicaSetName();
        boolean boolean68 = mongoClientOptions62.isSslInvalidHostNameAllowed();
        int int69 = mongoClientOptions62.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties0.builder(mongoClientOptions62);
        mongoProperties0.clearPassword();
        java.lang.String str72 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
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
        org.junit.Assert.assertNull(int46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(mongoClient55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 15 + "'", int64 == 15);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        int int1 = java.lang.Integer.highestOneBit(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        long long1 = java.lang.Integer.toUnsignedLong(637534208);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 637534208L + "'", long1 == 637534208L);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        int int1 = java.lang.Integer.highestOneBit(80738176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatConnectTimeout(83886080);
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
        com.mongodb.DBDecoderFactory dBDecoderFactory33 = mongoClientOptions31.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder20.dbDecoderFactory(dBDecoderFactory33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder11.dbDecoderFactory(dBDecoderFactory33);
        com.mongodb.MongoClientOptions.Builder builder36 = builder4.dbDecoderFactory(dBDecoderFactory33);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.socketKeepAlive(true);
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
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.minConnectionsPerHost(24);
        com.mongodb.MongoClientOptions.Builder builder60 = builder56.threadsAllowedToBlockForConnectionMultiplier(20000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties61 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str62 = mongoProperties61.database;
        java.lang.String str63 = mongoProperties61.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions64 = null;
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties61.builder(mongoClientOptions64);
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.maxWaitTime((int) '4');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties68 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str69 = mongoProperties68.database;
        mongoProperties68.setHost("mongodb://localhost/test");
        java.lang.String str72 = mongoProperties68.getHost();
        com.mongodb.MongoClientOptions.Builder builder73 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions74 = builder73.build();
        int int75 = mongoClientOptions74.getHeartbeatConnectTimeout();
        int int76 = mongoClientOptions74.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder77 = mongoProperties68.builder(mongoClientOptions74);
        javax.net.SocketFactory socketFactory78 = mongoClientOptions74.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder79 = builder67.socketFactory(socketFactory78);
        com.mongodb.MongoClientOptions.Builder builder80 = builder56.socketFactory(socketFactory78);
        com.mongodb.MongoClientOptions.Builder builder82 = builder56.heartbeatConnectTimeout(1200000000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties83 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions84 = null;
        org.springframework.core.env.Environment environment85 = null;
        com.mongodb.MongoClient mongoClient86 = mongoProperties83.createMongoClient(mongoClientOptions84, environment85);
        com.mongodb.MongoClientOptions.Builder builder87 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder89 = builder87.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder90 = builder87.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder92 = builder90.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions93 = builder90.build();
        com.mongodb.MongoClientOptions.Builder builder94 = mongoProperties83.builder(mongoClientOptions93);
        com.mongodb.DBDecoderFactory dBDecoderFactory95 = mongoClientOptions93.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder96 = builder56.dbDecoderFactory(dBDecoderFactory95);
        com.mongodb.MongoClientOptions.Builder builder97 = builder36.dbDecoderFactory(dBDecoderFactory95);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder99 = builder97.heartbeatFrequency((-2147483644));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: heartbeatFrequency must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
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
        org.junit.Assert.assertNotNull(dBDecoderFactory33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "mongodb://localhost/test" + "'", str72, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(mongoClientOptions74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 20000 + "'", int75 == 20000);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(socketFactory78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(mongoClient86);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(mongoClientOptions93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(dBDecoderFactory95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder97);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        int int1 = java.lang.Integer.bitCount(1200016507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(11010, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11010" + "'", str2, "11010");
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        int int1 = java.lang.Integer.parseUnsignedInt("22930800");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22930800 + "'", int1 == 22930800);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        org.springframework.core.env.Environment environment5 = null;
        com.mongodb.MongoClient mongoClient6 = mongoProperties3.createMongoClient(mongoClientOptions4, environment5);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder7.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties3.builder(mongoClientOptions13);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList15 = mongoClientOptions13.getCommandListeners();
        int int16 = mongoClientOptions13.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList17 = mongoClientOptions13.getCommandListeners();
        boolean boolean18 = mongoClientOptions1.equals((java.lang.Object) mongoClientOptions13);
        boolean boolean19 = mongoClientOptions13.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertNotNull(mongoClient6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(commandListenerList15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(commandListenerList17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        long long1 = java.lang.Integer.toUnsignedLong(58199719);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 58199719L + "'", long1 == 58199719L);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        mongoProperties0.setPort((java.lang.Integer) 131072);
        mongoProperties0.setUri("1342177280");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        int int2 = java.lang.Integer.divideUnsigned(8000, 474955779);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionIdleTime((-2147483644));
        com.mongodb.MongoClientOptions.Builder builder19 = builder16.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout(5);
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder23 = builder19.dbDecoderFactory(dBDecoderFactory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        int int2 = java.lang.Integer.compareUnsigned(1090519040, 20648881);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1410560");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        int int1 = java.lang.Integer.lowestOneBit(1111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
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
        int int17 = mongoClientOptions15.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        java.lang.String str19 = mongoClientOptions15.getDescription();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        java.lang.String str21 = mongoClientOptions15.getDescription();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        boolean boolean23 = mongoClientOptions15.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.ReadConcern readConcern25 = mongoClientOptions15.getReadConcern();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(readConcern25);
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory26 = mongoClientOptions10.getDbEncoderFactory();
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
        org.junit.Assert.assertNotNull(dBEncoderFactory26);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
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
        int int55 = mongoClientOptions47.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions47);
        com.mongodb.DBDecoderFactory dBDecoderFactory57 = mongoClientOptions47.getDbDecoderFactory();
        boolean boolean58 = mongoClientOptions47.isSslInvalidHostNameAllowed();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 500 + "'", int55 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        int int2 = java.lang.Integer.max((-1929379840), 120035);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 120035 + "'", int2 == 120035);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
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
        mongoProperties0.setDatabase("0");
        mongoProperties0.authenticationDatabase = "4e2000";
        java.lang.Class<?> wildcardClass23 = mongoProperties0.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.lang.String str1 = java.lang.Integer.toString(229);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "229" + "'", str1, "229");
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        int int1 = java.lang.Integer.parseUnsignedInt("305210");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 305210 + "'", int1 == 305210);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder21 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList23 = mongoClientOptions22.getCommandListeners();
        javax.net.SocketFactory socketFactory24 = mongoClientOptions22.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder18.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        int int27 = mongoClientOptions26.getServerSelectionTimeout();
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
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(commandListenerList23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 30000 + "'", int27 == 30000);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
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
        int int13 = mongoClientOptions10.getMaxWaitTime();
        int int14 = mongoClientOptions10.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("111");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 111");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
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
        boolean boolean30 = mongoClientOptions23.isSocketKeepAlive();
        int int31 = mongoClientOptions23.getConnectionsPerHost();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(8192);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
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
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.connectTimeout((int) '#');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.database;
        java.lang.String str42 = mongoProperties40.getAuthenticationDatabase();
        mongoProperties40.setUsername("5");
        java.lang.String str45 = mongoProperties40.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int47 = mongoProperties46.port;
        mongoProperties46.setUri("hi!");
        char[] charArray50 = mongoProperties46.getPassword();
        com.mongodb.MongoClientOptions.Builder builder51 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder51.build();
        boolean boolean53 = mongoClientOptions52.isCursorFinalizerEnabled();
        int int54 = mongoClientOptions52.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern55 = mongoClientOptions52.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties46.builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties40.builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions.Builder builder58 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder61 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder61.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList63 = mongoClientOptions62.getCommandListeners();
        javax.net.SocketFactory socketFactory64 = mongoClientOptions62.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder65 = builder58.socketFactory(socketFactory64);
        com.mongodb.MongoClientOptions.Builder builder66 = builder39.socketFactory(socketFactory64);
        com.mongodb.MongoClientOptions.Builder builder67 = builder15.socketFactory(socketFactory64);
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
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(mongoClient22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20000 + "'", int54 == 20000);
        org.junit.Assert.assertNotNull(writeConcern55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertNotNull(commandListenerList63);
        org.junit.Assert.assertNotNull(socketFactory64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        int int2 = java.lang.Integer.rotateRight(161056, 134217728);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161056 + "'", int2 == 161056);
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        int int1 = java.lang.Integer.parseUnsignedInt("52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        int int1 = java.lang.Integer.reverse(8000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49807360 + "'", int1 == 49807360);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
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
        mongoProperties0.setHost("1111111111111111111111111111111");
        java.lang.String str18 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1111111111111111111111111111111" + "'", str18, "1111111111111111111111111111111");
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        int int2 = java.lang.Integer.divideUnsigned(947912705, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7405568 + "'", int2 == 7405568);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        java.lang.Integer int1 = java.lang.Integer.getInteger("637534208");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        int int2 = java.lang.Integer.sum(35, (-536870913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-536870878) + "'", int2 == (-536870878));
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        int int2 = java.lang.Integer.sum(872415433, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 872415433 + "'", int2 == 872415433);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList15 = mongoClientOptions10.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        int int17 = mongoClientOptions10.getMinConnectionsPerHost();
        boolean boolean18 = mongoClientOptions10.isAlwaysUseMBeans();
        int int19 = mongoClientOptions10.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(commandListenerList15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        java.lang.String str2 = java.lang.Integer.toString(268435456, 1610612992);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "268435456" + "'", str2, "268435456");
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList30 = mongoClientOptions28.getCommandListeners();
        int int31 = mongoClientOptions28.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions28);
        int int33 = mongoClientOptions28.getSocketTimeout();
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
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandListenerList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        int int2 = java.lang.Integer.divideUnsigned((int) (short) 10, 32785);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
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
        mongoProperties0.setUsername("0");
        java.lang.String str21 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97" + "'", str21, "97");
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010" + "'", str1, "1010");
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("111000100000000000000000001000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"111000100000000000000000001000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        int int2 = java.lang.Integer.compareUnsigned((-2013265901), 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("a");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: a");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        java.lang.String str1 = java.lang.Integer.toString((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        int int1 = java.lang.Integer.lowestOneBit(2731246);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        int int2 = java.lang.Integer.max((-570425344), 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        java.lang.String str1 = java.lang.Integer.toHexString(123);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7b" + "'", str1, "7b");
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.username = "test";
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setDatabase("97");
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
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
        mongoProperties0.setUsername("a86100");
        mongoProperties0.setGridFsDatabase("");
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
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("5242944", (-1337982976));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1337982976 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
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
        java.lang.Class<?> wildcardClass17 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setGridFsDatabase("229");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        java.lang.String str1 = java.lang.Integer.toBinaryString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.database;
        mongoProperties20.setHost("mongodb://localhost/test");
        java.lang.String str24 = mongoProperties20.getHost();
        com.mongodb.MongoClientOptions.Builder builder25 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        int int27 = mongoClientOptions26.getHeartbeatConnectTimeout();
        int int28 = mongoClientOptions26.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties20.builder(mongoClientOptions26);
        javax.net.SocketFactory socketFactory30 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder19.socketFactory(socketFactory30);
        com.mongodb.event.CommandListener commandListener32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder33 = builder31.addCommandListener(commandListener32);
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb://localhost/test" + "'", str24, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        java.lang.String str1 = java.lang.Integer.toString((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
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
        int int14 = mongoClientOptions10.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.setAuthenticationDatabase("hi!");
        mongoProperties0.database = "1100100";
        mongoProperties0.database = "33";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
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
        java.lang.String str22 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getLocalThreshold();
        boolean boolean8 = mongoClientOptions1.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        boolean boolean10 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
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
        javax.net.SocketFactory socketFactory36 = mongoClientOptions28.getSocketFactory();
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
        org.junit.Assert.assertNotNull(socketFactory36);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
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
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.heartbeatSocketTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketTimeout((-1493172224));
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        mongoProperties0.gridFsDatabase = "4e2000";
        java.lang.String str17 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        int int1 = java.lang.Integer.parseInt("3020");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3020 + "'", int1 == 3020);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
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
        mongoProperties0.setUsername("100110011111111011110");
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
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        java.lang.String str1 = java.lang.Integer.toString(23420000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23420000" + "'", str1, "23420000");
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.host = "25600";
        mongoProperties0.setAuthenticationDatabase("133fde");
        mongoProperties0.setGridFsDatabase("20000064610");
        java.lang.String str10 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "20000064610" + "'", str10, "20000064610");
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
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
        int int22 = mongoClientOptions15.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.uri;
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "110100";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setGridFsDatabase("100101010000001011111001");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        int int5 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setUri("110100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The connection string is invalid. Connection strings must start with 'mongodb://'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
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
        boolean boolean18 = mongoClientOptions6.isSocketKeepAlive();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
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
        mongoProperties0.host = "1111111111111111111111111111111";
        com.mongodb.MongoClientOptions.Builder builder22 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int27 = mongoClientOptions23.getMinHeartbeatFrequency();
        int int28 = mongoClientOptions23.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        boolean boolean30 = mongoClientOptions23.isSocketKeepAlive();
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 500 + "'", int27 == 500);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
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
        java.lang.String str55 = mongoProperties0.authenticationDatabase;
        boolean boolean56 = mongoProperties0.hasCustomAddress();
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
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        java.lang.String str1 = java.lang.Integer.toString(50000000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "50000000" + "'", str1, "50000000");
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        java.lang.String str1 = java.lang.Integer.toOctalString(304);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "460" + "'", str1, "460");
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        int int2 = java.lang.Integer.min(251658240, 9765625);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9765625 + "'", int2 == 9765625);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        long long1 = java.lang.Integer.toUnsignedLong(1626990123);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1626990123L + "'", long1 == 1626990123L);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        int int2 = java.lang.Integer.min(566418188, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatConnectTimeout(83886080);
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
        com.mongodb.MongoClientOptions.Builder builder31 = builder17.dbDecoderFactory(dBDecoderFactory30);
        com.mongodb.MongoClientOptions.Builder builder32 = builder2.dbDecoderFactory(dBDecoderFactory30);
        com.mongodb.MongoClientOptions.Builder builder34 = builder2.minConnectionsPerHost(1552);
        com.mongodb.MongoClientOptions.Builder builder36 = builder2.requiredReplicaSetName("-536870913");
        com.mongodb.MongoClientOptions.Builder builder38 = builder2.maxConnectionIdleTime(87);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
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
        int int36 = mongoClientOptions24.getConnectTimeout();
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions24.getReadPreference();
        int int38 = mongoClientOptions24.getLocalThreshold();
        int int39 = mongoClientOptions24.getConnectTimeout();
        boolean boolean40 = mongoClientOptions24.isAlwaysUseMBeans();
        int int41 = mongoClientOptions24.getLocalThreshold();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10000 + "'", int36 == 10000);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10000 + "'", int39 == 10000);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 15 + "'", int41 == 15);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(16);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        org.bson.codecs.configuration.CodecRegistry codecRegistry18 = mongoClientOptions17.getCodecRegistry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(codecRegistry18);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        int int1 = java.lang.Integer.reverseBytes(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 201326592 + "'", int1 == 201326592);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
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
        int int18 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.port = 10001101;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("mongodb://localhost/test");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.connectTimeout(9);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        int int2 = java.lang.Integer.remainderUnsigned((-1929379840), 924209280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 517168896 + "'", int2 == 517168896);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        long long1 = java.lang.Integer.toUnsignedLong(285212672);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 285212672L + "'", long1 == 285212672L);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        mongoProperties0.database = "hi!";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray16 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties9.password = charArray16;
        java.lang.Class<java.lang.Integer> intClass18 = java.lang.Integer.TYPE;
        mongoProperties9.fieldNamingStrategy = intClass18;
        java.lang.String str20 = mongoProperties9.username;
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties9.builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties9.builder(mongoClientOptions23);
        boolean boolean25 = mongoProperties9.hasCustomCredentials();
        java.lang.String str26 = mongoProperties9.gridFsDatabase;
        char[] charArray27 = mongoProperties9.password;
        mongoProperties0.setPassword(charArray27);
        java.lang.String str29 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        int int2 = java.lang.Integer.compareUnsigned(27017, 6553600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
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
        boolean boolean34 = mongoProperties0.hasCustomCredentials();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        java.lang.Integer int1 = java.lang.Integer.getInteger("256");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout(83886080);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties7.authenticationDatabase = "12";
        mongoProperties7.username = "97";
        java.lang.Integer int12 = mongoProperties7.port;
        mongoProperties7.setDatabase("141");
        java.lang.String str15 = mongoProperties7.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder16 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions17);
        int int19 = mongoClientOptions17.getMaxConnectionLifeTime();
        int int20 = mongoClientOptions17.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions17.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties7.builder(mongoClientOptions17);
        org.bson.codecs.configuration.CodecRegistry codecRegistry23 = mongoClientOptions17.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder24 = builder6.codecRegistry(codecRegistry23);
        com.mongodb.MongoClientOptions.Builder builder26 = builder6.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "141" + "'", str15, "141");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(codecRegistry23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        boolean boolean14 = mongoClientOptions13.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions13.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions13.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder18 = builder2.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectTimeout(32);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.description("97");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        long long1 = java.lang.Integer.toUnsignedLong(304);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 304L + "'", long1 == 304L);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("16", (-1006632960));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1006632960 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatConnectTimeout(83886080);
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
        com.mongodb.MongoClientOptions.Builder builder31 = builder17.dbDecoderFactory(dBDecoderFactory30);
        com.mongodb.MongoClientOptions.Builder builder32 = builder2.dbDecoderFactory(dBDecoderFactory30);
        com.mongodb.MongoClientOptions.Builder builder34 = builder2.minConnectionsPerHost(1552);
        com.mongodb.MongoClientOptions.Builder builder36 = builder2.requiredReplicaSetName("-536870913");
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.description("");
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.description("");
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder49 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder49.build();
        boolean boolean51 = mongoClientOptions50.isCursorFinalizerEnabled();
        int int52 = mongoClientOptions50.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern53 = mongoClientOptions50.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder54 = builder48.writeConcern(writeConcern53);
        com.mongodb.MongoClientOptions.Builder builder55 = builder39.writeConcern(writeConcern53);
        com.mongodb.MongoClientOptions.Builder builder56 = builder2.writeConcern(writeConcern53);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions mongoClientOptions57 = builder2.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: state should be: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 20000 + "'", int52 == 20000);
        org.junit.Assert.assertNotNull(writeConcern53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        java.lang.String str1 = java.lang.Integer.toBinaryString(2097152);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000000000000000000000" + "'", str1, "1000000000000000000000");
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("15de570");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"15de570\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("de000000", 43295);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 43295 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        long long1 = java.lang.Integer.toUnsignedLong(11034880);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 11034880L + "'", long1 == 11034880L);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
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
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder16.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder23 = builder16.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder16.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.connectTimeout(1024);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.minConnectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder31 = builder25.heartbeatSocketTimeout(5000000);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.description("");
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder40 = builder34.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder41 = builder34.legacyDefaults();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.database;
        mongoProperties42.setHost("mongodb://localhost/test");
        java.lang.String str46 = mongoProperties42.getHost();
        com.mongodb.MongoClientOptions.Builder builder47 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder47.build();
        int int49 = mongoClientOptions48.getHeartbeatConnectTimeout();
        int int50 = mongoClientOptions48.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties42.builder(mongoClientOptions48);
        javax.net.SocketFactory socketFactory52 = mongoClientOptions48.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory53 = mongoClientOptions48.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder54 = builder34.dbEncoderFactory(dBEncoderFactory53);
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.alwaysUseMBeans(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties57 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions58 = null;
        org.springframework.core.env.Environment environment59 = null;
        com.mongodb.MongoClient mongoClient60 = mongoProperties57.createMongoClient(mongoClientOptions58, environment59);
        com.mongodb.MongoClientOptions.Builder builder61 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder64 = builder61.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions67 = builder64.build();
        com.mongodb.MongoClientOptions.Builder builder68 = mongoProperties57.builder(mongoClientOptions67);
        com.mongodb.DBDecoderFactory dBDecoderFactory69 = mongoClientOptions67.getDbDecoderFactory();
        int int70 = mongoClientOptions67.getSocketTimeout();
        int int71 = mongoClientOptions67.getMinHeartbeatFrequency();
        org.bson.codecs.configuration.CodecRegistry codecRegistry72 = mongoClientOptions67.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder73 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions67);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties74 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str75 = mongoProperties74.database;
        mongoProperties74.setHost("mongodb://localhost/test");
        java.lang.String str78 = mongoProperties74.getUri();
        int int79 = mongoProperties74.getDEFAULT_PORT();
        java.lang.String str80 = mongoProperties74.gridFsDatabase;
        java.lang.String str81 = mongoProperties74.getUri();
        com.mongodb.MongoClientOptions.Builder builder82 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions83 = builder82.build();
        com.mongodb.MongoClientOptions.Builder builder84 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions83);
        com.mongodb.MongoClientOptions.Builder builder85 = mongoProperties74.builder(mongoClientOptions83);
        com.mongodb.MongoClientOptions.Builder builder86 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions83);
        boolean boolean87 = mongoClientOptions83.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder88 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions83);
        org.bson.codecs.configuration.CodecRegistry codecRegistry89 = mongoClientOptions83.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder90 = builder73.codecRegistry(codecRegistry89);
        com.mongodb.MongoClientOptions.Builder builder91 = builder56.codecRegistry(codecRegistry89);
        com.mongodb.MongoClientOptions.Builder builder92 = builder31.codecRegistry(codecRegistry89);
        com.mongodb.MongoClientOptions.Builder builder93 = builder13.codecRegistry(codecRegistry89);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "mongodb://localhost/test" + "'", str46, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20000 + "'", int49 == 20000);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(socketFactory52);
        org.junit.Assert.assertNotNull(dBEncoderFactory53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClient60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoClientOptions67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(dBDecoderFactory69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 500 + "'", int71 == 500);
        org.junit.Assert.assertNotNull(codecRegistry72);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "mongodb://localhost/test" + "'", str78, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 27017 + "'", int79 == 27017);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "mongodb://localhost/test" + "'", str81, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(mongoClientOptions83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(codecRegistry89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        java.lang.String str10 = mongoProperties0.getDatabase();
        java.lang.String str11 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray19 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties12.password = charArray19;
        java.lang.Class<java.lang.Integer> intClass21 = java.lang.Integer.TYPE;
        mongoProperties12.fieldNamingStrategy = intClass21;
        java.lang.String str23 = mongoProperties12.username;
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties12.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions26);
        mongoProperties12.setUsername("34");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        org.springframework.core.env.Environment environment32 = null;
        com.mongodb.MongoClient mongoClient33 = mongoProperties30.createMongoClient(mongoClientOptions31, environment32);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder37 = builder34.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties30.builder(mongoClientOptions40);
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions40.getDbDecoderFactory();
        int int43 = mongoClientOptions40.getSocketTimeout();
        int int44 = mongoClientOptions40.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties12.builder(mongoClientOptions40);
        char[] charArray46 = mongoProperties12.getPassword();
        mongoProperties0.password = charArray46;
        mongoProperties0.clearPassword();
        mongoProperties0.port = 20000;
        mongoProperties0.setUri("12");
        char[] charArray53 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClient33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[\000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        int int1 = java.lang.Integer.lowestOneBit((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.authenticationDatabase = "12";
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        org.springframework.core.env.Environment environment16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties12.createMongoClient(mongoClientOptions15, environment16);
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
        mongoProperties18.setUsername("34");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory48 = mongoClientOptions46.getDbDecoderFactory();
        int int49 = mongoClientOptions46.getSocketTimeout();
        int int50 = mongoClientOptions46.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties18.builder(mongoClientOptions46);
        int int52 = mongoClientOptions46.getLocalThreshold();
        int int53 = mongoClientOptions46.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties12.builder(mongoClientOptions46);
        org.springframework.core.env.Environment environment55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient56 = mongoProperties0.createMongoClient(mongoClientOptions46, environment55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The connection string is invalid. Connection strings must start with 'mongodb://'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(dBDecoderFactory48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 15 + "'", int50 == 15);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 15 + "'", int52 == 15);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20000 + "'", int53 == 20000);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        int int1 = java.lang.Integer.bitCount(1677721600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        int int1 = java.lang.Integer.highestOneBit(1552);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        int int2 = java.lang.Integer.compare(22930800, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        int int2 = java.lang.Integer.divideUnsigned(0, (-2013265901));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned((int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
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
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.threadsAllowedToBlockForConnectionMultiplier(32768);
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
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
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
        mongoProperties0.username = "80738176";
        mongoProperties0.port = 176320;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
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
        java.lang.String str17 = mongoClientOptions10.getRequiredReplicaSetName();
        com.mongodb.ReadConcern readConcern18 = mongoClientOptions10.getReadConcern();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(readConcern18);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        int int1 = java.lang.Integer.bitCount(17);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1111000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1111000000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
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
        java.lang.String str21 = mongoProperties0.getGridFsDatabase();
        java.lang.String str22 = mongoProperties0.host;
        char[] charArray23 = mongoProperties0.getPassword();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(charArray23);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minHeartbeatFrequency(2147483647);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray14 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties7.password = charArray14;
        java.lang.Class<java.lang.Integer> intClass16 = java.lang.Integer.TYPE;
        mongoProperties7.fieldNamingStrategy = intClass16;
        java.lang.String str18 = mongoProperties7.username;
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties7.builder(mongoClientOptions19);
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties7.builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionIdleTime((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str26 = mongoProperties25.database;
        java.lang.String str27 = mongoProperties25.authenticationDatabase;
        java.lang.Class<?> wildcardClass28 = mongoProperties25.fieldNamingStrategy;
        mongoProperties25.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties25.builder(mongoClientOptions31);
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties25.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder38 = builder35.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        java.lang.String str42 = mongoClientOptions41.getDescription();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties25.builder(mongoClientOptions41);
        com.mongodb.ReadConcern readConcern44 = mongoClientOptions41.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder45 = builder24.readConcern(readConcern44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder6.readConcern(readConcern44);
        com.mongodb.MongoClientOptions.Builder builder48 = builder6.localThreshold(5000000);
        com.mongodb.MongoClientOptions.Builder builder49 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder49.build();
        int int51 = mongoClientOptions50.getHeartbeatConnectTimeout();
        int int52 = mongoClientOptions50.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions50);
        int int54 = mongoClientOptions50.getSocketTimeout();
        boolean boolean55 = mongoClientOptions50.isCursorFinalizerEnabled();
        javax.net.SocketFactory socketFactory56 = mongoClientOptions50.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory57 = mongoClientOptions50.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder58 = builder48.dbEncoderFactory(dBEncoderFactory57);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(readConcern44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20000 + "'", int51 == 20000);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(socketFactory56);
        org.junit.Assert.assertNotNull(dBEncoderFactory57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("100101010000001011111001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100101010000001011111001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.connectionsPerHost((int) (byte) 10);
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
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
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
        mongoProperties0.setHost("1111111111111111111111111111111");
        mongoProperties0.clearPassword();
        char[] charArray22 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int24 = mongoProperties23.port;
        mongoProperties23.setUri("hi!");
        java.lang.String str27 = mongoProperties23.authenticationDatabase;
        char[] charArray28 = mongoProperties23.getPassword();
        java.lang.String str29 = mongoProperties23.getGridFsDatabase();
        java.lang.Class<?> wildcardClass30 = mongoProperties23.fieldNamingStrategy;
        java.lang.String str31 = mongoProperties23.getDatabase();
        mongoProperties23.clearPassword();
        java.lang.String str33 = mongoProperties23.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray41 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties34.password = charArray41;
        java.lang.Class<java.lang.Integer> intClass43 = java.lang.Integer.TYPE;
        mongoProperties34.fieldNamingStrategy = intClass43;
        java.lang.String str45 = mongoProperties34.username;
        java.lang.String str46 = mongoProperties34.getUsername();
        mongoProperties34.setHost("1100100");
        java.lang.Integer int49 = mongoProperties34.port;
        java.lang.Integer int50 = mongoProperties34.port;
        java.lang.String str51 = mongoProperties34.getUri();
        char[] charArray52 = mongoProperties34.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int54 = mongoProperties53.port;
        com.mongodb.MongoClientOptions mongoClientOptions55 = null;
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties53.builder(mongoClientOptions55);
        mongoProperties53.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray66 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties59.password = charArray66;
        java.lang.String str68 = mongoProperties59.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties69 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str70 = mongoProperties69.database;
        java.lang.String str71 = mongoProperties69.authenticationDatabase;
        java.lang.Integer int72 = mongoProperties69.port;
        java.lang.Class<java.lang.Integer> intClass73 = java.lang.Integer.TYPE;
        mongoProperties69.fieldNamingStrategy = intClass73;
        mongoProperties59.setFieldNamingStrategy(intClass73);
        mongoProperties53.fieldNamingStrategy = intClass73;
        mongoProperties34.setFieldNamingStrategy(intClass73);
        mongoProperties23.setFieldNamingStrategy(intClass73);
        mongoProperties0.fieldNamingStrategy = intClass73;
        java.lang.String str80 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(charArray28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "mongodb://localhost/test" + "'", str51, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNull(int72);
        org.junit.Assert.assertNotNull(intClass73);
        org.junit.Assert.assertNull(str80);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList3 = mongoClientOptions1.getCommandListeners();
        boolean boolean4 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern5 = mongoClientOptions1.getWriteConcern();
        boolean boolean6 = mongoClientOptions1.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(commandListenerList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(writeConcern5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
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
        int int14 = mongoClientOptions7.getMaxWaitTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions7.getDbDecoderFactory();
        int int16 = mongoClientOptions7.getConnectionsPerHost();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        org.springframework.core.env.Environment environment4 = null;
        com.mongodb.MongoClient mongoClient5 = mongoProperties0.createMongoClient(mongoClientOptions3, environment4);
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.database;
        java.lang.String str10 = mongoProperties8.authenticationDatabase;
        java.lang.Class<?> wildcardClass11 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties8.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties8.builder(mongoClientOptions16);
        java.lang.String str18 = mongoProperties8.username;
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties8.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder24 = builder23.legacyDefaults();
        org.junit.Assert.assertNotNull(mongoClient5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500 + "'", int21 == 500);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        java.lang.Integer int5 = mongoProperties0.port;
        mongoProperties0.setDatabase("141");
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setPort((java.lang.Integer) 25);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        java.lang.String str2 = java.lang.Integer.toString(1, (-2147483648));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        java.lang.String str1 = java.lang.Integer.toBinaryString(131072);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000000000000000" + "'", str1, "100000000000000000");
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        int int2 = java.lang.Integer.divideUnsigned(26, 212729856);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.localThreshold(167772160);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime(5242944);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        int int1 = java.lang.Integer.reverse(777037832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 269814388 + "'", int1 == 269814388);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("214d1d80", 27);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 214d1d80 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
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
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder20 = com.mongodb.MongoClientOptions.builder(mongoClientOptions12);
        int int21 = mongoClientOptions12.getMinConnectionsPerHost();
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
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.port = 100;
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        com.mongodb.event.CommandListener commandListener10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder9.addCommandListener(commandListener10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        int int1 = java.lang.Integer.reverse(400000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2223080 + "'", int1 == 2223080);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        int int2 = java.lang.Integer.min(2731246, 131072);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 131072 + "'", int2 == 131072);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.port = 100;
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList20 = mongoClientOptions18.getCommandListeners();
        java.lang.String str21 = mongoClientOptions18.getRequiredReplicaSetName();
        java.lang.String str22 = mongoClientOptions18.getDescription();
        int int23 = mongoClientOptions18.getHeartbeatConnectTimeout();
        int int24 = mongoClientOptions18.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties0.builder(mongoClientOptions18);
        int int27 = mongoClientOptions18.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(commandListenerList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 20000 + "'", int27 == 20000);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        int int1 = java.lang.Integer.highestOneBit(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        int int2 = java.lang.Integer.compareUnsigned(5120, 474955779);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.lang.String str2 = java.lang.Integer.toString(1015, (-2147456633));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1015" + "'", str2, "1015");
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1776);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        int int2 = java.lang.Integer.rotateRight(110100, 16560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1374420991) + "'", int2 == (-1374420991));
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1200016507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("3758096383");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3758096383\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
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
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions10.getReadPreference();
        java.lang.String str17 = mongoClientOptions10.getDescription();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        int int1 = java.lang.Integer.lowestOneBit(1610612736);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4e2000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str5 = mongoProperties0.host;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder7 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions8);
        int int10 = mongoClientOptions8.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions8.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
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
        boolean boolean39 = mongoClientOptions29.isCursorFinalizerEnabled();
        javax.net.SocketFactory socketFactory40 = mongoClientOptions29.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.heartbeatFrequency(200);
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        mongoProperties0.host = "34";
        java.lang.String str7 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
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
        mongoProperties0.setGridFsDatabase("23564");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray29 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties22.password = charArray29;
        java.lang.String str31 = mongoProperties22.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str33 = mongoProperties32.database;
        java.lang.String str34 = mongoProperties32.authenticationDatabase;
        java.lang.Integer int35 = mongoProperties32.port;
        java.lang.Class<java.lang.Integer> intClass36 = java.lang.Integer.TYPE;
        mongoProperties32.fieldNamingStrategy = intClass36;
        mongoProperties22.setFieldNamingStrategy(intClass36);
        mongoProperties0.setFieldNamingStrategy(intClass36);
        mongoProperties0.authenticationDatabase = "2b02";
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
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(intClass36);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.database;
        java.lang.String str20 = mongoProperties18.authenticationDatabase;
        java.lang.Class<?> wildcardClass21 = mongoProperties18.fieldNamingStrategy;
        mongoProperties18.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties18.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties18.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder31 = builder28.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        java.lang.String str35 = mongoClientOptions34.getDescription();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties18.builder(mongoClientOptions34);
        com.mongodb.ReadConcern readConcern37 = mongoClientOptions34.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder17.readConcern(readConcern37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder17.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder17.build();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(readConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Integer int4 = mongoProperties0.getPort();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.database;
        mongoProperties6.setHost("mongodb://localhost/test");
        java.lang.String str10 = mongoProperties6.getUri();
        int int11 = mongoProperties6.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties6.gridFsDatabase;
        java.lang.String str13 = mongoProperties6.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getHeartbeatConnectTimeout();
        int int17 = mongoClientOptions15.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry18 = mongoClientOptions15.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties6.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.sslEnabled(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(codecRegistry18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        int int2 = java.lang.Integer.compareUnsigned(141, 111110100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
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
        boolean boolean59 = mongoClientOptions51.isSocketKeepAlive();
        int int60 = mongoClientOptions51.getConnectTimeout();
        int int61 = mongoClientOptions51.getHeartbeatFrequency();
        int int62 = mongoClientOptions51.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10000 + "'", int60 == 10000);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10000 + "'", int61 == 10000);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        int int2 = java.lang.Integer.sum(459, 285212672);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 285213131 + "'", int2 == 285213131);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        int int2 = java.lang.Integer.rotateLeft((-2017510370), 1073741826);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 519893114 + "'", int2 == 519893114);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        java.lang.String str1 = java.lang.Integer.toString(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3" + "'", str1, "3");
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getLocalThreshold();
        boolean boolean8 = mongoClientOptions1.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        boolean boolean10 = mongoClientOptions1.isSocketKeepAlive();
        int int11 = mongoClientOptions1.getConnectionsPerHost();
        boolean boolean12 = mongoClientOptions1.isSslEnabled();
        boolean boolean13 = mongoClientOptions1.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        int int1 = java.lang.Integer.numberOfLeadingZeros(127362560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        int int2 = java.lang.Integer.compare(399297740, 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.database = "1";
        mongoProperties0.authenticationDatabase = "2147483652";
        mongoProperties0.setHost("1015");
        mongoProperties0.host = "7";
        boolean boolean15 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str9 = mongoClientOptions6.getRequiredReplicaSetName();
        int int10 = mongoClientOptions6.getHeartbeatFrequency();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions6.getSocketFactory();
        int int12 = mongoClientOptions6.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.DBDecoderFactory dBDecoderFactory14 = mongoClientOptions6.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory15 = mongoClientOptions6.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory14);
        org.junit.Assert.assertNotNull(socketFactory15);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        java.lang.String str5 = mongoProperties0.database;
        java.lang.String str6 = mongoProperties0.uri;
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList26 = mongoClientOptions24.getCommandListeners();
        java.lang.String str27 = mongoClientOptions24.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder32 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        java.lang.String str36 = mongoClientOptions35.getDescription();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions35);
        int int38 = mongoClientOptions35.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder39 = com.mongodb.MongoClientOptions.builder(mongoClientOptions35);
        int int40 = mongoClientOptions35.getMinHeartbeatFrequency();
        org.bson.codecs.configuration.CodecRegistry codecRegistry41 = mongoClientOptions35.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder42 = builder28.codecRegistry(codecRegistry41);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str44 = mongoProperties43.database;
        java.lang.String str45 = mongoProperties43.authenticationDatabase;
        java.lang.Class<?> wildcardClass46 = mongoProperties43.fieldNamingStrategy;
        mongoProperties43.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions49 = null;
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties43.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder53 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder53.build();
        int int55 = mongoClientOptions54.getHeartbeatConnectTimeout();
        int int56 = mongoClientOptions54.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry57 = mongoClientOptions54.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder58 = builder52.codecRegistry(codecRegistry57);
        com.mongodb.MongoClientOptions.Builder builder59 = builder28.codecRegistry(codecRegistry57);
        com.mongodb.MongoClientOptions.Builder builder60 = builder13.codecRegistry(codecRegistry57);
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.socketTimeout(14);
        com.mongodb.MongoClientOptions.Builder builder64 = builder60.connectionsPerHost(101000);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(commandListenerList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 500 + "'", int38 == 500);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 500 + "'", int40 == 500);
        org.junit.Assert.assertNotNull(codecRegistry41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20000 + "'", int55 == 20000);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertNotNull(codecRegistry57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.Integer int11 = mongoProperties0.getPort();
        java.lang.String str12 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setUsername("141");
        java.lang.String str15 = mongoProperties0.username;
        java.lang.String str16 = mongoProperties0.uri;
        mongoProperties0.host = "120035";
        mongoProperties0.setAuthenticationDatabase("1010000000000000000000000000");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "141" + "'", str15, "141");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment7 = null;
        int int8 = mongoProperties0.determinePort(environment7);
        boolean boolean9 = mongoProperties0.hasCustomCredentials();
        java.lang.String str10 = mongoProperties0.uri;
        mongoProperties0.uri = "10060000";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        int int1 = java.lang.Integer.parseUnsignedInt("256");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minHeartbeatFrequency(736557408);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.sslEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
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
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        int int35 = mongoClientOptions25.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
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
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.serverSelectionTimeout(45435459);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.threadsAllowedToBlockForConnectionMultiplier(51200);
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
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        int int2 = java.lang.Integer.rotateRight(8388608, 3020);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2048 + "'", int2 == 2048);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionIdleTime((-2147483644));
        com.mongodb.MongoClientOptions.Builder builder19 = builder16.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.description("");
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder40 = builder34.minConnectionsPerHost(141);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder46 = builder43.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        int int50 = mongoClientOptions49.getMaxConnectionLifeTime();
        boolean boolean51 = mongoClientOptions49.isSslEnabled();
        com.mongodb.WriteConcern writeConcern52 = mongoClientOptions49.getWriteConcern();
        com.mongodb.ReadPreference readPreference53 = mongoClientOptions49.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder54 = builder42.readPreference(readPreference53);
        com.mongodb.MongoClientOptions.Builder builder55 = builder21.readPreference(readPreference53);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
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
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(writeConcern52);
        org.junit.Assert.assertNotNull(readPreference53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        int int2 = java.lang.Integer.min(157187, 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(32);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
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
        boolean boolean29 = mongoClientOptions21.isSslInvalidHostNameAllowed();
        java.lang.String str30 = mongoClientOptions21.getDescription();
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        java.lang.String str1 = java.lang.Integer.toBinaryString(2329);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100011001" + "'", str1, "100100011001");
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        int int1 = java.lang.Integer.highestOneBit((-1374420991));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.localThreshold(24);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.connectTimeout(16384);
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
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        java.lang.String str1 = java.lang.Integer.toBinaryString(100011);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11000011010101011" + "'", str1, "11000011010101011");
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray8 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties1.password = charArray8;
        java.lang.Class<java.lang.Integer> intClass10 = java.lang.Integer.TYPE;
        mongoProperties1.fieldNamingStrategy = intClass10;
        java.lang.String str12 = mongoProperties1.username;
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties1.builder(mongoClientOptions13);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties15.createMongoClient(mongoClientOptions16, environment17);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder19.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties15.builder(mongoClientOptions25);
        int int27 = mongoClientOptions25.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        java.lang.String str29 = mongoClientOptions25.getDescription();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        java.lang.String str31 = mongoClientOptions25.getDescription();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions25);
        boolean boolean33 = mongoClientOptions25.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder34 = com.mongodb.MongoClientOptions.builder(mongoClientOptions25);
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties1.createMongoClient(mongoClientOptions25, environment35);
        boolean boolean37 = mongoClientOptions25.isAlwaysUseMBeans();
        boolean boolean38 = mongoClientOptions25.isSslEnabled();
        javax.net.SocketFactory socketFactory39 = mongoClientOptions25.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder0.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxConnectionIdleTime(1073741826);
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
        int int56 = mongoClientOptions53.getMinConnectionsPerHost();
        int int57 = mongoClientOptions53.getConnectionsPerHost();
        com.mongodb.ReadConcern readConcern58 = mongoClientOptions53.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder59 = builder40.readConcern(readConcern58);
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.socketTimeout(517168896);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClient46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(commandListenerList55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(readConcern58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(12, 500000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12" + "'", str2, "12");
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
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
        int int36 = mongoClientOptions24.getConnectTimeout();
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions24.getReadPreference();
        int int38 = mongoClientOptions24.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder39.build();
        int int41 = mongoClientOptions40.getServerSelectionTimeout();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10000 + "'", int36 == 10000);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 30000 + "'", int41 == 30000);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        int int2 = java.lang.Integer.min(268435456, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
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
        java.lang.String str45 = mongoProperties0.getAuthenticationDatabase();
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "0" + "'", str45, "0");
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        int int2 = java.lang.Integer.remainderUnsigned(16, 218103810);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
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
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
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
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        int int2 = java.lang.Integer.rotateRight(1862270976, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1862270976 + "'", int2 == 1862270976);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        int int2 = java.lang.Integer.divideUnsigned(0, (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
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
        char[] charArray23 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "10000";
        mongoProperties0.host = "100101010000001011111001";
        java.lang.String str28 = mongoProperties0.getDatabase();
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
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        int int1 = java.lang.Integer.parseUnsignedInt("90");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        int int2 = java.lang.Integer.compare(22930800, 1100100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        int int2 = java.lang.Integer.divideUnsigned(20000, 7405568);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
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
        int int39 = mongoClientOptions35.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry40 = mongoClientOptions35.getCodecRegistry();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(codecRegistry40);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
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
        java.lang.Class<?> wildcardClass39 = mongoProperties0.fieldNamingStrategy;
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList2 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.connectTimeout(24);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.socketTimeout(1200000123);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(commandListenerList2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
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
        com.mongodb.MongoClientOptions.Builder builder42 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.description("30");
        com.mongodb.MongoClientOptions.Builder builder46 = builder42.alwaysUseMBeans(false);
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
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        int int1 = java.lang.Integer.numberOfTrailingZeros(262144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        int int1 = java.lang.Integer.parseInt("111110100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 111110100 + "'", int1 == 111110100);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        int int1 = java.lang.Integer.parseInt("6744544");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6744544 + "'", int1 == 6744544);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("35");
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.socketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxConnectionIdleTime(10100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        int int1 = java.lang.Integer.numberOfLeadingZeros(269814388);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("6400000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"6400000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        int int1 = java.lang.Integer.parseUnsignedInt("30");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.lang.String str2 = java.lang.Integer.toString(1410560, (-1374420991));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1410560" + "'", str2, "1410560");
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(176320, 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "176320" + "'", str2, "176320");
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minHeartbeatFrequency(4194304);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.heartbeatSocketTimeout(16777216);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.heartbeatSocketTimeout(295043073);
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
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
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
        boolean boolean15 = mongoClientOptions10.isSslInvalidHostNameAllowed();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions10.getWriteConcern();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(writeConcern16);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(8000, 176320);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8000" + "'", str2, "8000");
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setPort((java.lang.Integer) 8);
        mongoProperties0.database = "-536870913";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray24 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties17.password = charArray24;
        mongoProperties17.database = "";
        java.lang.String str28 = mongoProperties17.getHost();
        mongoProperties17.authenticationDatabase = "1024";
        com.mongodb.MongoClientOptions.Builder builder31 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        int int34 = mongoClientOptions32.getMaxConnectionLifeTime();
        int int35 = mongoClientOptions32.getMaxConnectionLifeTime();
        int int36 = mongoClientOptions32.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties17.builder(mongoClientOptions32);
        int int39 = mongoClientOptions32.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.threadsAllowedToBlockForConnectionMultiplier(838886399);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 500 + "'", int36 == 500);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        int int1 = java.lang.Integer.bitCount(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        int int1 = java.lang.Integer.reverseBytes(7803356);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-602835200) + "'", int1 == (-602835200));
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
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
        java.lang.String str20 = mongoProperties0.gridFsDatabase;
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        int int2 = java.lang.Integer.min((int) (short) 10, 45435459);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
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
        java.lang.String str23 = mongoClientOptions16.getRequiredReplicaSetName();
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        int int1 = java.lang.Integer.lowestOneBit((-2046820352));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33554432 + "'", int1 == 33554432);
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern7 = mongoClientOptions1.getWriteConcern();
        int int8 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int9 = mongoClientOptions1.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(writeConcern7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        int int2 = java.lang.Integer.compareUnsigned(9, 27017);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.connectTimeout(851968);
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
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        boolean boolean4 = mongoClientOptions1.isSslEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions1.getDbEncoderFactory();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        java.lang.String str7 = mongoClientOptions1.getRequiredReplicaSetName();
        int int8 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int9 = mongoClientOptions1.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int3 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions1.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionLifeTime(519893114);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.build();
        boolean boolean9 = mongoClientOptions8.isCursorFinalizerEnabled();
        int int10 = mongoClientOptions8.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions8.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.writeConcern(writeConcern11);
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        int int15 = mongoClientOptions14.getHeartbeatConnectTimeout();
        int int16 = mongoClientOptions14.getMaxConnectionIdleTime();
        int int17 = mongoClientOptions14.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        int int19 = mongoClientOptions14.getMinConnectionsPerHost();
        boolean boolean20 = mongoClientOptions14.isSslInvalidHostNameAllowed();
        int int21 = mongoClientOptions14.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        int int23 = mongoClientOptions14.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions14.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder26 = builder6.dbDecoderFactory(dBDecoderFactory25);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(6400000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        int int1 = java.lang.Integer.lowestOneBit(113);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
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
        mongoProperties0.setAuthenticationDatabase("128");
        java.lang.Class<?> wildcardClass15 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.authenticationDatabase = "134217728";
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(wildcardClass15);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.serverSelectionTimeout(500);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout((int) (short) -1);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray20 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties13.password = charArray20;
        java.lang.Class<java.lang.Integer> intClass22 = java.lang.Integer.TYPE;
        mongoProperties13.fieldNamingStrategy = intClass22;
        java.lang.String str24 = mongoProperties13.username;
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties13.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties13.builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.socketKeepAlive(true);
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
        com.mongodb.MongoClientOptions.Builder builder44 = builder32.socketFactory(socketFactory43);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.connectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder47 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder47.build();
        boolean boolean49 = mongoClientOptions48.isCursorFinalizerEnabled();
        int int50 = mongoClientOptions48.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern51 = mongoClientOptions48.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory52 = mongoClientOptions48.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder53 = builder44.dbEncoderFactory(dBEncoderFactory52);
        com.mongodb.MongoClientOptions.Builder builder54 = builder10.dbEncoderFactory(dBEncoderFactory52);
        com.mongodb.MongoClientOptions.Builder builder56 = builder10.socketTimeout(101000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties57 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str58 = mongoProperties57.database;
        java.lang.String str59 = mongoProperties57.getAuthenticationDatabase();
        mongoProperties57.setUsername("5");
        java.lang.String str62 = mongoProperties57.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties63 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int64 = mongoProperties63.port;
        mongoProperties63.setUri("hi!");
        char[] charArray67 = mongoProperties63.getPassword();
        com.mongodb.MongoClientOptions.Builder builder68 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions69 = builder68.build();
        boolean boolean70 = mongoClientOptions69.isCursorFinalizerEnabled();
        int int71 = mongoClientOptions69.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern72 = mongoClientOptions69.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder73 = mongoProperties63.builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties57.builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder75 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder77 = builder75.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder78 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions79 = builder78.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList80 = mongoClientOptions79.getCommandListeners();
        javax.net.SocketFactory socketFactory81 = mongoClientOptions79.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder82 = builder75.socketFactory(socketFactory81);
        com.mongodb.MongoClientOptions.Builder builder83 = builder56.socketFactory(socketFactory81);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "mongodb://localhost/test" + "'", str37, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(socketFactory43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20000 + "'", int50 == 20000);
        org.junit.Assert.assertNotNull(writeConcern51);
        org.junit.Assert.assertNotNull(dBEncoderFactory52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(int64);
        org.junit.Assert.assertNull(charArray67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 20000 + "'", int71 == 20000);
        org.junit.Assert.assertNotNull(writeConcern72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(mongoClientOptions79);
        org.junit.Assert.assertNotNull(commandListenerList80);
        org.junit.Assert.assertNotNull(socketFactory81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        java.lang.Integer int1 = java.lang.Integer.getInteger("45155214203");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
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
        char[] charArray23 = mongoProperties0.getPassword();
        java.lang.String str24 = mongoProperties0.getHost();
        java.lang.String str25 = mongoProperties0.getMongoClientDatabase();
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
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "test" + "'", str25, "test");
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
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
        java.lang.String str28 = mongoProperties0.getHost();
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
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
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
        java.lang.Integer int28 = mongoProperties0.getPort();
        java.lang.String str29 = mongoProperties0.database;
        mongoProperties0.clearPassword();
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
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
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
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        int int1 = java.lang.Integer.signum(2731246);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Integer int4 = mongoProperties0.getPort();
        char[] charArray5 = mongoProperties0.password;
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.setGridFsDatabase("24");
        java.lang.String str6 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
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
        java.lang.String str28 = mongoProperties0.database;
        java.lang.String str29 = mongoProperties0.database;
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        int int2 = java.lang.Integer.compare(16560, 151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatConnectTimeout((int) (byte) -1);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.heartbeatConnectTimeout(78528512);
        com.mongodb.MongoClientOptions.Builder builder22 = builder16.socketTimeout(832);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder26 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.getDescription();
        int int31 = mongoClientOptions29.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str32 = mongoClientOptions29.getRequiredReplicaSetName();
        org.bson.codecs.configuration.CodecRegistry codecRegistry33 = mongoClientOptions29.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder34 = builder22.codecRegistry(codecRegistry33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder7.codecRegistry(codecRegistry33);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder39 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        java.lang.String str43 = mongoClientOptions42.getDescription();
        int int44 = mongoClientOptions42.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str45 = mongoClientOptions42.getRequiredReplicaSetName();
        int int46 = mongoClientOptions42.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder47 = com.mongodb.MongoClientOptions.builder(mongoClientOptions42);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList48 = mongoClientOptions42.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions42);
        java.lang.String str50 = mongoClientOptions42.getDescription();
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions42);
        int int52 = mongoClientOptions42.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions42);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties54 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str55 = mongoProperties54.database;
        java.lang.String str56 = mongoProperties54.authenticationDatabase;
        java.lang.Class<?> wildcardClass57 = mongoProperties54.fieldNamingStrategy;
        mongoProperties54.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions60 = null;
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties54.builder(mongoClientOptions60);
        com.mongodb.MongoClientOptions mongoClientOptions62 = null;
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties54.builder(mongoClientOptions62);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder67 = builder64.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder67.build();
        java.lang.String str71 = mongoClientOptions70.getDescription();
        com.mongodb.MongoClientOptions.Builder builder72 = mongoProperties54.builder(mongoClientOptions70);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties73 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions74 = null;
        org.springframework.core.env.Environment environment75 = null;
        com.mongodb.MongoClient mongoClient76 = mongoProperties73.createMongoClient(mongoClientOptions74, environment75);
        com.mongodb.MongoClientOptions.Builder builder77 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder79 = builder77.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder80 = builder77.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder82 = builder80.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions83 = builder80.build();
        com.mongodb.MongoClientOptions.Builder builder84 = mongoProperties73.builder(mongoClientOptions83);
        int int85 = mongoClientOptions83.getLocalThreshold();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList86 = mongoClientOptions83.getCommandListeners();
        int int87 = mongoClientOptions83.getLocalThreshold();
        int int88 = mongoClientOptions83.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder89 = mongoProperties54.builder(mongoClientOptions83);
        javax.net.SocketFactory socketFactory90 = mongoClientOptions83.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder91 = builder53.socketFactory(socketFactory90);
        com.mongodb.MongoClientOptions.Builder builder92 = builder35.socketFactory(socketFactory90);
        com.mongodb.MongoClientOptions.Builder builder94 = builder35.localThreshold(0);
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(codecRegistry33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(commandListenerList48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 120000 + "'", int52 == 120000);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(wildcardClass57);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClient76);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(mongoClientOptions83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 15 + "'", int85 == 15);
        org.junit.Assert.assertNotNull(commandListenerList86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 15 + "'", int87 == 15);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 10 + "'", int88 == 10);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(socketFactory90);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder94);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        int int2 = java.lang.Integer.divideUnsigned(67108864, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1917396 + "'", int2 == 1917396);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("25600", 32785);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 32785 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        java.lang.String str1 = java.lang.Integer.toBinaryString(17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10001" + "'", str1, "10001");
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
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
        java.lang.String str19 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.socketTimeout((-2046820352));
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.requiredReplicaSetName("20600000000");
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.socketTimeout(22930800);
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectTimeout((int) (byte) -1);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray30 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties23.password = charArray30;
        java.lang.Class<java.lang.Integer> intClass32 = java.lang.Integer.TYPE;
        mongoProperties23.fieldNamingStrategy = intClass32;
        java.lang.String str34 = mongoProperties23.username;
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties23.builder(mongoClientOptions35);
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties23.builder(mongoClientOptions37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxConnectionIdleTime((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str42 = mongoProperties41.database;
        java.lang.String str43 = mongoProperties41.authenticationDatabase;
        java.lang.Class<?> wildcardClass44 = mongoProperties41.fieldNamingStrategy;
        mongoProperties41.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions47 = null;
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties41.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions mongoClientOptions49 = null;
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties41.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder54 = builder51.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder54.build();
        java.lang.String str58 = mongoClientOptions57.getDescription();
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties41.builder(mongoClientOptions57);
        com.mongodb.ReadConcern readConcern60 = mongoClientOptions57.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder61 = builder40.readConcern(readConcern60);
        com.mongodb.MongoClientOptions.Builder builder62 = builder20.readConcern(readConcern60);
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.localThreshold(16384);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties65 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions66 = null;
        org.springframework.core.env.Environment environment67 = null;
        com.mongodb.MongoClient mongoClient68 = mongoProperties65.createMongoClient(mongoClientOptions66, environment67);
        com.mongodb.MongoClientOptions.Builder builder69 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder72 = builder69.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder74 = builder72.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions75 = builder72.build();
        com.mongodb.MongoClientOptions.Builder builder76 = mongoProperties65.builder(mongoClientOptions75);
        int int77 = mongoClientOptions75.getLocalThreshold();
        int int78 = mongoClientOptions75.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder79 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions75);
        com.mongodb.MongoClientOptions.Builder builder80 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions75);
        com.mongodb.DBDecoderFactory dBDecoderFactory81 = mongoClientOptions75.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder82 = builder64.dbDecoderFactory(dBDecoderFactory81);
        com.mongodb.MongoClientOptions.Builder builder83 = builder2.dbDecoderFactory(dBDecoderFactory81);
        com.mongodb.MongoClientOptions.Builder builder85 = builder83.maxConnectionLifeTime(67108864);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(readConcern60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoClient68);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(mongoClientOptions75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 15 + "'", int77 == 15);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.maxConnectionLifeTime(1);
        boolean boolean19 = mongoClientOptions1.equals((java.lang.Object) 1);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder21 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        boolean boolean23 = mongoClientOptions22.isSslEnabled();
        org.bson.codecs.configuration.CodecRegistry codecRegistry24 = mongoClientOptions22.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder25 = builder20.codecRegistry(codecRegistry24);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: localThreshold must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(codecRegistry24);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
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
        int int14 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions6.getConnectTimeout();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
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
        javax.net.SocketFactory socketFactory55 = mongoClientOptions47.getSocketFactory();
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
        org.junit.Assert.assertNotNull(socketFactory55);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.uri;
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "110100";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.uri;
        java.lang.String str11 = mongoProperties0.host;
        mongoProperties0.setUsername("");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        java.lang.String str2 = java.lang.Integer.toString(8000, 566418188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "8000" + "'", str2, "8000");
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        int int1 = java.lang.Integer.parseUnsignedInt("215");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 215 + "'", int1 == 215);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
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
        mongoProperties0.setUri("10100000000");
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
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        int int2 = java.lang.Integer.min((-1916216192), 2560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1916216192) + "'", int2 == (-1916216192));
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
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
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.minConnectionsPerHost(1261534);
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
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
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
        boolean boolean16 = mongoClientOptions10.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        boolean boolean18 = mongoClientOptions10.isSslEnabled();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.database = "101000000000000000000000000";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        int int2 = java.lang.Integer.compare(212729856, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10100011001101110100111100000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100011001101110100111100000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
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
        java.lang.String str14 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int16 = mongoClientOptions6.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 120000 + "'", int16 == 120000);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("229", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 229");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        java.lang.String str2 = java.lang.Integer.toString(29, 776936832);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "29" + "'", str2, "29");
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("34e7e76", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.heartbeatConnectTimeout(32);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatConnectTimeout((-536870913));
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray16 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties9.password = charArray16;
        java.lang.Class<java.lang.Integer> intClass18 = java.lang.Integer.TYPE;
        mongoProperties9.fieldNamingStrategy = intClass18;
        java.lang.String str20 = mongoProperties9.username;
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties9.builder(mongoClientOptions21);
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
        int int35 = mongoClientOptions33.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions33);
        java.lang.String str37 = mongoClientOptions33.getDescription();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions33);
        java.lang.String str39 = mongoClientOptions33.getDescription();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions33);
        boolean boolean41 = mongoClientOptions33.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder42 = com.mongodb.MongoClientOptions.builder(mongoClientOptions33);
        org.springframework.core.env.Environment environment43 = null;
        com.mongodb.MongoClient mongoClient44 = mongoProperties9.createMongoClient(mongoClientOptions33, environment43);
        boolean boolean45 = mongoClientOptions33.isAlwaysUseMBeans();
        boolean boolean46 = mongoClientOptions33.isSslEnabled();
        javax.net.SocketFactory socketFactory47 = mongoClientOptions33.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder48 = builder8.socketFactory(socketFactory47);
        com.mongodb.MongoClientOptions.Builder builder49 = builder5.socketFactory(socketFactory47);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.maxConnectionLifeTime(30000);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClient44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(socketFactory47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        java.lang.String str1 = java.lang.Integer.toOctalString(23420);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55574" + "'", str1, "55574");
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
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
        java.lang.String str13 = mongoProperties0.uri;
        java.lang.String str14 = mongoProperties0.uri;
        mongoProperties0.setUsername("20600000000");
        java.lang.String str17 = mongoProperties0.host;
        java.lang.String str18 = mongoProperties0.getUri();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        java.lang.Integer int5 = mongoProperties0.port;
        mongoProperties0.setDatabase("141");
        java.lang.String str8 = mongoProperties0.getHost();
        mongoProperties0.port = 78528512;
        mongoProperties0.setDatabase("23420000");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        java.lang.String str1 = java.lang.Integer.toString(64);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.host;
        mongoProperties0.database = "127362560";
        java.lang.String str8 = mongoProperties0.username;
        java.lang.Integer int9 = mongoProperties0.getPort();
        mongoProperties0.database = "25";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
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
        java.lang.String str15 = mongoProperties0.getGridFsDatabase();
        boolean boolean16 = mongoProperties0.hasCustomAddress();
        java.lang.String str17 = mongoProperties0.host;
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
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
        org.bson.codecs.configuration.CodecRegistry codecRegistry34 = mongoClientOptions28.getCodecRegistry();
        int int35 = mongoClientOptions28.getServerSelectionTimeout();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.heartbeatConnectTimeout(0);
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
        org.junit.Assert.assertNotNull(codecRegistry34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 30000 + "'", int35 == 30000);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-603979775));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11011100000000000000000000000001" + "'", str1, "11011100000000000000000000000001");
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("35");
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.socketTimeout((-2147483648));
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder(mongoClientOptions10);
        org.bson.codecs.configuration.CodecRegistry codecRegistry12 = mongoClientOptions10.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(codecRegistry12);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
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
        com.mongodb.MongoClientOptions.Builder builder16 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        int int18 = mongoClientOptions17.getHeartbeatConnectTimeout();
        int int19 = mongoClientOptions17.getMaxConnectionIdleTime();
        int int20 = mongoClientOptions17.getMaxWaitTime();
        int int21 = mongoClientOptions17.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray23 = mongoProperties0.password;
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
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(charArray23);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        java.lang.String str1 = java.lang.Integer.toBinaryString(8388608);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000000000000000000000" + "'", str1, "100000000000000000000000");
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.username = "test";
        mongoProperties0.setDatabase("200");
        java.lang.String str8 = mongoProperties0.host;
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
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
        int int46 = mongoClientOptions36.getSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList19 = mongoClientOptions17.getCommandListeners();
        java.lang.String str20 = mongoClientOptions17.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory21 = mongoClientOptions17.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder2.dbEncoderFactory(dBEncoderFactory21);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxConnectionIdleTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.requiredReplicaSetName("200");
        com.mongodb.DBDecoderFactory dBDecoderFactory27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder28 = builder24.dbDecoderFactory(dBDecoderFactory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClient10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(commandListenerList19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(dBEncoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("101101101111100", (-731406586));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -731406586 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(30000, 1073741830);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "30000" + "'", str2, "30000");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
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
        java.lang.String str16 = mongoProperties0.database;
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        int int1 = java.lang.Integer.reverse(5242944);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33556992 + "'", int1 == 33556992);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("b");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"b\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 0, 22930800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

