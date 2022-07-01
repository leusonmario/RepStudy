import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.Integer int11 = mongoProperties0.getPort();
        java.lang.String str12 = mongoProperties0.gridFsDatabase;
        mongoProperties0.port = 27528;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions1.getDbEncoderFactory();
        int int6 = mongoClientOptions1.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
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
        javax.net.SocketFactory socketFactory12 = mongoClientOptions6.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions6.getDbEncoderFactory();
        int int14 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int15 = mongoClientOptions6.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(socketFactory12);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setPort((java.lang.Integer) 16384);
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        int int2 = java.lang.Integer.compareUnsigned(0, 141);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        mongoProperties0.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.authenticationDatabase;
        boolean boolean10 = mongoProperties8.hasCustomAddress();
        java.lang.String str11 = mongoProperties8.username;
        java.lang.String str12 = mongoProperties8.getGridFsDatabase();
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
        mongoProperties8.fieldNamingStrategy = intClass27;
        char[] charArray31 = mongoProperties8.getPassword();
        mongoProperties8.gridFsDatabase = "10000";
        mongoProperties8.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int36 = mongoProperties35.port;
        mongoProperties35.setUri("hi!");
        java.lang.String str39 = mongoProperties35.authenticationDatabase;
        char[] charArray40 = mongoProperties35.getPassword();
        java.lang.String str41 = mongoProperties35.getGridFsDatabase();
        java.lang.Class<?> wildcardClass42 = mongoProperties35.fieldNamingStrategy;
        java.lang.String str43 = mongoProperties35.getDatabase();
        mongoProperties35.clearPassword();
        java.lang.String str45 = mongoProperties35.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray53 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties46.password = charArray53;
        java.lang.Class<java.lang.Integer> intClass55 = java.lang.Integer.TYPE;
        mongoProperties46.fieldNamingStrategy = intClass55;
        java.lang.String str57 = mongoProperties46.username;
        java.lang.String str58 = mongoProperties46.getUsername();
        mongoProperties46.setHost("1100100");
        java.lang.Integer int61 = mongoProperties46.port;
        java.lang.Integer int62 = mongoProperties46.port;
        java.lang.String str63 = mongoProperties46.getUri();
        char[] charArray64 = mongoProperties46.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties65 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int66 = mongoProperties65.port;
        com.mongodb.MongoClientOptions mongoClientOptions67 = null;
        com.mongodb.MongoClientOptions.Builder builder68 = mongoProperties65.builder(mongoClientOptions67);
        mongoProperties65.port = 1;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties71 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray78 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties71.password = charArray78;
        java.lang.String str80 = mongoProperties71.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties81 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str82 = mongoProperties81.database;
        java.lang.String str83 = mongoProperties81.authenticationDatabase;
        java.lang.Integer int84 = mongoProperties81.port;
        java.lang.Class<java.lang.Integer> intClass85 = java.lang.Integer.TYPE;
        mongoProperties81.fieldNamingStrategy = intClass85;
        mongoProperties71.setFieldNamingStrategy(intClass85);
        mongoProperties65.fieldNamingStrategy = intClass85;
        mongoProperties46.setFieldNamingStrategy(intClass85);
        mongoProperties35.setFieldNamingStrategy(intClass85);
        mongoProperties8.setFieldNamingStrategy(intClass85);
        mongoProperties0.setFieldNamingStrategy(intClass85);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(intClass27);
        org.junit.Assert.assertNull(charArray31);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(charArray40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNull(int62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "mongodb://localhost/test" + "'", str63, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertNull(int84);
        org.junit.Assert.assertNotNull(intClass85);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        java.lang.String str10 = mongoProperties0.uri;
        mongoProperties0.setPort((java.lang.Integer) 1100100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder11 = builder9.minHeartbeatFrequency((-1929379840));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: minHeartbeatFrequency must be > 0");
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
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        int int1 = java.lang.Integer.numberOfTrailingZeros(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
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
        com.mongodb.event.CommandListener commandListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder17 = builder15.addCommandListener(commandListener16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder15 = builder10.minHeartbeatFrequency(1114112);
        com.mongodb.MongoClientOptions.Builder builder17 = builder10.heartbeatConnectTimeout(100000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        int int1 = java.lang.Integer.bitCount(90);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        int int2 = java.lang.Integer.divideUnsigned(1677721600, 215);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7803356 + "'", int2 == 7803356);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        java.lang.Integer int1 = java.lang.Integer.getInteger("120035");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("test", 37748736);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 37748736 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
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
        int int12 = mongoClientOptions6.getLocalThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("100", 101000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 101000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        java.lang.String str1 = java.lang.Integer.toHexString(1114112);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110000" + "'", str1, "110000");
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        int int2 = java.lang.Integer.rotateRight(1410560, 120035);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176320 + "'", int2 == 176320);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder14.socketKeepAlive(false);
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
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int3 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions1.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
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
        mongoProperties0.gridFsDatabase = "cae0000";
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

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.database = "100011";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        java.lang.Integer int1 = java.lang.Integer.getInteger("127362560");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.minHeartbeatFrequency(25600);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.serverSelectionTimeout(35);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        int int2 = java.lang.Integer.divideUnsigned(295043073, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 147521536 + "'", int2 == 147521536);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
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
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.description("");
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder25 = builder19.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.maxConnectionLifeTime(1);
        com.mongodb.MongoClientOptions.Builder builder32 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder32.build();
        boolean boolean34 = mongoClientOptions33.isCursorFinalizerEnabled();
        int int35 = mongoClientOptions33.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions33.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder37 = builder27.writeConcern(writeConcern36);
        com.mongodb.MongoClientOptions.Builder builder38 = builder16.writeConcern(writeConcern36);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost((-994836476));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: minConnectionsPerHost must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
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
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        int int1 = java.lang.Integer.numberOfTrailingZeros(50000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.threadsAllowedToBlockForConnectionMultiplier(1200000000);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxWaitTime((-536870913));
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.socketTimeout(268435456);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.sslEnabled(false);
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
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        mongoProperties0.uri = "0";
        char[] charArray12 = mongoProperties0.getPassword();
        java.lang.String str13 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "34" + "'", str13, "34");
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("637534208", 1862270976);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1862270976 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1250, 7803356);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1250" + "'", str2, "1250");
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.cursorFinalizerEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder29 = builder27.threadsAllowedToBlockForConnectionMultiplier((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: threadsAllowedToBlockForConnectionMultiplier must be > 0");
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(5242944, 161056);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "5242944" + "'", str2, "5242944");
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(false);
        com.mongodb.event.CommandListener commandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.addCommandListener(commandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        int int2 = java.lang.Integer.max(78528512, 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 78528512 + "'", int2 == 78528512);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.threadsAllowedToBlockForConnectionMultiplier(1200000000);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxWaitTime((-536870913));
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.connectTimeout(45435459);
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
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.requiredReplicaSetName("");
        com.mongodb.ReadPreference readPreference5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.readPreference(readPreference5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: readPreference can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("1250");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1250");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        java.lang.String str1 = java.lang.Integer.toOctalString(1552);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3020" + "'", str1, "3020");
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        int int2 = java.lang.Integer.compare(101000, 167772160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        int int2 = java.lang.Integer.compareUnsigned(104857600, 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("52", 947912712);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 947912712 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder39 = builder35.connectTimeout((-2147456633));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectTimeout must be >= 0");
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
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
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
        com.mongodb.MongoClientOptions.Builder builder31 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        int int33 = mongoClientOptions32.getHeartbeatConnectTimeout();
        int int34 = mongoClientOptions32.getConnectionsPerHost();
        int int35 = mongoClientOptions32.getLocalThreshold();
        javax.net.SocketFactory socketFactory36 = mongoClientOptions32.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder37 = builder28.socketFactory(socketFactory36);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.sslInvalidHostNameAllowed(true);
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
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertNotNull(socketFactory36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        int int2 = java.lang.Integer.remainderUnsigned(832, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
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
        com.mongodb.MongoClientOptions.Builder builder21 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        boolean boolean23 = mongoClientOptions22.isCursorFinalizerEnabled();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList24 = mongoClientOptions22.getCommandListeners();
        boolean boolean25 = mongoClientOptions22.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties0.builder(mongoClientOptions22);
        int int27 = mongoClientOptions22.getLocalThreshold();
        org.bson.codecs.configuration.CodecRegistry codecRegistry28 = mongoClientOptions22.getCodecRegistry();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(commandListenerList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(codecRegistry28);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int3 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions1.getMinHeartbeatFrequency();
        java.lang.String str6 = mongoClientOptions1.getDescription();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        java.lang.String str1 = java.lang.Integer.toString(838860799);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "838860799" + "'", str1, "838860799");
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("-1");
        java.lang.String str6 = mongoProperties0.getDatabase();
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.setAuthenticationDatabase("2");
        mongoProperties0.setPort((java.lang.Integer) 97);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        int int2 = java.lang.Integer.parseUnsignedInt("15", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(90, 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "230" + "'", str2, "230");
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        java.lang.Integer int4 = mongoProperties0.getPort();
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.setUsername("200000000");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.String str5 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "1";
        java.lang.String str8 = mongoProperties0.uri;
        mongoProperties0.authenticationDatabase = "10c944";
        mongoProperties0.uri = "10060000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        int int1 = java.lang.Integer.reverse(295043073);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147456632) + "'", int1 == (-2147456632));
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        java.lang.Integer int15 = mongoProperties0.port;
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
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
        int int13 = mongoClientOptions6.getLocalThreshold();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setHost("1111111111111111111111111111111");
        java.lang.String str6 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str7 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "12" + "'", str6, "12");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
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
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions16.getWriteConcern();
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
        org.junit.Assert.assertNotNull(writeConcern23);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minHeartbeatFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.connectTimeout(54546204);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatConnectTimeout((int) (byte) -1);
        org.junit.Assert.assertNull(int1);
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
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        int int2 = java.lang.Integer.sum(9765625, 161056);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9926681 + "'", int2 == 9926681);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str5 = mongoProperties0.getUsername();
        mongoProperties0.authenticationDatabase = "10060000";
        mongoProperties0.setHost("10001101");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        int int2 = java.lang.Integer.compareUnsigned(2013265920, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
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
        int int16 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Integer int17 = mongoProperties0.getPort();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        int int1 = java.lang.Integer.parseUnsignedInt("113");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 113 + "'", int1 == 113);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        java.lang.String str1 = java.lang.Integer.toOctalString(872415232);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6400000000" + "'", str1, "6400000000");
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        int int2 = java.lang.Integer.parseInt("100011", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9765651 + "'", int2 == 9765651);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
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
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        org.springframework.core.env.Environment environment13 = null;
        com.mongodb.MongoClient mongoClient14 = mongoProperties11.createMongoClient(mongoClientOptions12, environment13);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder15.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties11.builder(mongoClientOptions21);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList23 = mongoClientOptions21.getCommandListeners();
        int int24 = mongoClientOptions21.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties0.builder(mongoClientOptions21);
        int int27 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str28 = mongoProperties0.getHost();
        mongoProperties0.authenticationDatabase = "23420000";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClient14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(commandListenerList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10000 + "'", int24 == 10000);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("6400000000", 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 50 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("924209280", 25);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 924209280 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("100000", 220000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 220000000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.maxConnectionLifeTime(123);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.localThreshold(7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1261534);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100110011111111011110" + "'", str1, "100110011111111011110");
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        int int2 = java.lang.Integer.compareUnsigned(5, 25600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions1.isSocketKeepAlive();
        boolean boolean6 = mongoClientOptions1.isSslEnabled();
        int int7 = mongoClientOptions1.getHeartbeatSocketTimeout();
        boolean boolean9 = mongoClientOptions1.equals((java.lang.Object) 64);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        int int2 = java.lang.Integer.sum(1862270976, 120035);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1862391011 + "'", int2 == 1862391011);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        java.lang.String str1 = java.lang.Integer.toString(512);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "512" + "'", str1, "512");
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry4 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxConnectionIdleTime(4);
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.connectionsPerHost(176320);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(codecRegistry4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.maxWaitTime((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        mongoProperties0.setGridFsDatabase("30000");
        mongoProperties0.authenticationDatabase = "128";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("6400000", 1200000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1200000000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        int int2 = java.lang.Integer.max((-528443136), 67108864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67108864 + "'", int2 == 67108864);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
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
        java.lang.Class<java.lang.Integer> intClass24 = null;
        mongoProperties0.setFieldNamingStrategy(intClass24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray33 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties26.password = charArray33;
        java.lang.Class<java.lang.Integer> intClass35 = java.lang.Integer.TYPE;
        mongoProperties26.fieldNamingStrategy = intClass35;
        java.lang.String str37 = mongoProperties26.username;
        java.lang.String str38 = mongoProperties26.getUsername();
        mongoProperties26.setHost("1100100");
        java.lang.String str41 = mongoProperties26.getDatabase();
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
        java.lang.String str55 = mongoClientOptions52.getDescription();
        int int56 = mongoClientOptions52.getSocketTimeout();
        int int57 = mongoClientOptions52.getSocketTimeout();
        int int58 = mongoClientOptions52.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties26.builder(mongoClientOptions52);
        char[] charArray60 = mongoProperties26.password;
        mongoProperties0.setPassword(charArray60);
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
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(mongoClient45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(dBDecoderFactory54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 500 + "'", int58 == 500);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Class<?> wildcardClass3 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setUri("7");
        java.lang.String str15 = mongoProperties0.uri;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        int int2 = java.lang.Integer.compare(525, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
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
        com.mongodb.MongoClientOptions.Builder builder17 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getHeartbeatConnectTimeout();
        int int20 = mongoClientOptions18.getMaxConnectionIdleTime();
        int int21 = mongoClientOptions18.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        int int23 = mongoClientOptions18.getSocketTimeout();
        int int24 = mongoClientOptions18.getSocketTimeout();
        java.lang.String str25 = mongoClientOptions18.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties0.builder(mongoClientOptions18);
        boolean boolean27 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        mongoProperties0.database = "hi!";
        java.lang.String str9 = mongoProperties0.host;
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        boolean boolean13 = mongoClientOptions12.isCursorFinalizerEnabled();
        int int14 = mongoClientOptions12.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions12.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList16 = mongoClientOptions12.getCommandListeners();
        int int17 = mongoClientOptions12.getHeartbeatConnectTimeout();
        boolean boolean18 = mongoClientOptions12.isAlwaysUseMBeans();
        boolean boolean19 = mongoClientOptions12.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxWaitTime(128);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.connectionsPerHost((int) 'a');
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertNotNull(commandListenerList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
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
        int int15 = mongoClientOptions10.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.WriteConcern writeConcern17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.writeConcern(writeConcern17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: writeConcern can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(commandListenerList13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
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
        mongoProperties0.setHost("4e2000");
        java.lang.String str24 = mongoProperties0.database;
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
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
        com.mongodb.MongoClientOptions.Builder builder24 = builder2.requiredReplicaSetName("test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str26 = mongoProperties25.database;
        java.lang.String str27 = mongoProperties25.authenticationDatabase;
        java.lang.Class<?> wildcardClass28 = mongoProperties25.fieldNamingStrategy;
        mongoProperties25.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties25.builder(mongoClientOptions31);
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties25.builder(mongoClientOptions33);
        java.lang.String str35 = mongoProperties25.username;
        com.mongodb.MongoClientOptions.Builder builder36 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder36.build();
        int int38 = mongoClientOptions37.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties25.builder(mongoClientOptions37);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray47 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties40.password = charArray47;
        java.lang.Class<java.lang.Integer> intClass49 = java.lang.Integer.TYPE;
        mongoProperties40.fieldNamingStrategy = intClass49;
        java.lang.String str51 = mongoProperties40.username;
        com.mongodb.MongoClientOptions mongoClientOptions52 = null;
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties40.builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties40.builder(mongoClientOptions54);
        mongoProperties40.setUsername("34");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory70 = mongoClientOptions68.getDbDecoderFactory();
        int int71 = mongoClientOptions68.getSocketTimeout();
        int int72 = mongoClientOptions68.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder73 = mongoProperties40.builder(mongoClientOptions68);
        org.bson.codecs.configuration.CodecRegistry codecRegistry74 = mongoClientOptions68.getCodecRegistry();
        com.mongodb.ReadPreference readPreference75 = mongoClientOptions68.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder76 = builder39.readPreference(readPreference75);
        com.mongodb.MongoClientOptions.Builder builder77 = builder24.readPreference(readPreference75);
        com.mongodb.event.CommandListener commandListener78 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder79 = builder77.addCommandListener(commandListener78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 500 + "'", int38 == 500);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClient61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoClientOptions68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(dBDecoderFactory70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 15 + "'", int72 == 15);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(codecRegistry74);
        org.junit.Assert.assertNotNull(readPreference75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
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
        boolean boolean35 = mongoClientOptions27.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder39 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder39.build();
        boolean boolean41 = mongoClientOptions40.isCursorFinalizerEnabled();
        int int42 = mongoClientOptions40.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern43 = mongoClientOptions40.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList44 = mongoClientOptions40.getCommandListeners();
        org.bson.codecs.configuration.CodecRegistry codecRegistry45 = mongoClientOptions40.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions40);
        com.mongodb.DBEncoderFactory dBEncoderFactory47 = mongoClientOptions40.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder48 = builder36.dbEncoderFactory(dBEncoderFactory47);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder50 = builder48.connectTimeout((-2046820352));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectTimeout must be >= 0");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(writeConcern43);
        org.junit.Assert.assertNotNull(commandListenerList44);
        org.junit.Assert.assertNotNull(codecRegistry45);
        org.junit.Assert.assertNotNull(dBEncoderFactory47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        int int2 = java.lang.Integer.sum((int) '4', 177);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 229 + "'", int2 == 229);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(52);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder11.threadsAllowedToBlockForConnectionMultiplier(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: threadsAllowedToBlockForConnectionMultiplier must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        int int1 = java.lang.Integer.bitCount(30000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(212729856);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        long long1 = java.lang.Integer.toUnsignedLong((-2046820320));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2248146976L + "'", long1 == 2248146976L);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("110100", (-2147456632));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147456632 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        int int2 = java.lang.Integer.rotateLeft(200, 200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 51200 + "'", int2 == 51200);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        int int1 = java.lang.Integer.lowestOneBit(256);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
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
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties0.createMongoClient(mongoClientOptions30, environment35);
        mongoProperties0.authenticationDatabase = "";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(commandListenerList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(mongoClient36);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        int int2 = java.lang.Integer.compare(31, 11034880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
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
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.description("100011");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.threadsAllowedToBlockForConnectionMultiplier(30000);
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
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.database;
        mongoProperties0.setAuthenticationDatabase("31000000");
        mongoProperties0.port = 5242880;
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
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        int int2 = java.lang.Integer.compareUnsigned(8, (-2147456633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        java.lang.String str2 = java.lang.Integer.toString(872415232, 50000000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "872415232" + "'", str2, "872415232");
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        java.lang.String str1 = java.lang.Integer.toString(67108864);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "67108864" + "'", str1, "67108864");
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
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
        org.springframework.core.env.Environment environment39 = null;
        int int40 = mongoProperties0.determinePort(environment39);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 27017 + "'", int40 == 27017);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        long long1 = java.lang.Integer.toUnsignedLong(459);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 459L + "'", long1 == 459L);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
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
        mongoProperties0.setAuthenticationDatabase("2147483652");
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
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry4 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.DBEncoderFactory dBEncoderFactory6 = mongoClientOptions1.getDbEncoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions1.getDbDecoderFactory();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList8 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(codecRegistry4);
        org.junit.Assert.assertNotNull(dBEncoderFactory6);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertNotNull(commandListenerList8);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatConnectTimeout(1677721600);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        int int5 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int7 = mongoClientOptions1.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
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
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("18");
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
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
        boolean boolean15 = mongoClientOptions6.isSocketKeepAlive();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
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
        int int43 = mongoClientOptions41.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        java.lang.String str45 = mongoClientOptions41.getDescription();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        java.lang.String str47 = mongoClientOptions41.getDescription();
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions41);
        boolean boolean49 = mongoClientOptions41.isSslEnabled();
        int int50 = mongoClientOptions41.getSocketTimeout();
        org.bson.codecs.configuration.CodecRegistry codecRegistry51 = mongoClientOptions41.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions41);
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
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(codecRegistry51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        long long1 = java.lang.Integer.toUnsignedLong((-536870913));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3758096383L + "'", long1 == 3758096383L);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        int int2 = java.lang.Integer.sum((int) (short) 10, 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory30 = mongoClientOptions23.getDbEncoderFactory();
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
        org.junit.Assert.assertNotNull(dBEncoderFactory30);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        int int1 = java.lang.Integer.parseInt("11010");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11010 + "'", int1 == 11010);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        java.lang.String str1 = java.lang.Integer.toHexString(27016);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6988" + "'", str1, "6988");
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        boolean boolean5 = mongoClientOptions1.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList7 = mongoClientOptions1.getCommandListeners();
        java.lang.Class<?> wildcardClass8 = mongoClientOptions1.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(commandListenerList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
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
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatConnectTimeout((int) (byte) -1);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.threadsAllowedToBlockForConnectionMultiplier(134217728);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder45 = builder43.minConnectionsPerHost((-2147483644));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: minConnectionsPerHost must be >= 0");
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
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
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
        java.lang.Class<?> wildcardClass17 = builder14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        int int1 = java.lang.Integer.lowestOneBit(1073742086);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
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
        java.lang.Class<?> wildcardClass97 = mongoProperties0.getFieldNamingStrategy();
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
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setAuthenticationDatabase("10001101");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
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
        java.lang.String str19 = mongoClientOptions14.getDescription();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.description("");
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder22.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.requiredReplicaSetName("test");
        boolean boolean31 = mongoClientOptions14.equals((java.lang.Object) "test");
        java.lang.Class<?> wildcardClass32 = mongoClientOptions14.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        int int1 = java.lang.Integer.signum(111);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        int int1 = java.lang.Integer.signum(10100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
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
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.connectTimeout((-2147456633));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectTimeout must be >= 0");
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
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
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
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.sslInvalidHostNameAllowed(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties48 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray55 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties48.password = charArray55;
        java.lang.Class<java.lang.Integer> intClass57 = java.lang.Integer.TYPE;
        mongoProperties48.fieldNamingStrategy = intClass57;
        java.lang.String str59 = mongoProperties48.username;
        com.mongodb.MongoClientOptions mongoClientOptions60 = null;
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties48.builder(mongoClientOptions60);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties62 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions63 = null;
        org.springframework.core.env.Environment environment64 = null;
        com.mongodb.MongoClient mongoClient65 = mongoProperties62.createMongoClient(mongoClientOptions63, environment64);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder69 = builder66.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions72 = builder69.build();
        com.mongodb.MongoClientOptions.Builder builder73 = mongoProperties62.builder(mongoClientOptions72);
        int int74 = mongoClientOptions72.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder75 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions72);
        java.lang.String str76 = mongoClientOptions72.getDescription();
        com.mongodb.MongoClientOptions.Builder builder77 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions72);
        java.lang.String str78 = mongoClientOptions72.getDescription();
        com.mongodb.MongoClientOptions.Builder builder79 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions72);
        boolean boolean80 = mongoClientOptions72.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder81 = com.mongodb.MongoClientOptions.builder(mongoClientOptions72);
        org.springframework.core.env.Environment environment82 = null;
        com.mongodb.MongoClient mongoClient83 = mongoProperties48.createMongoClient(mongoClientOptions72, environment82);
        int int84 = mongoClientOptions72.getConnectTimeout();
        com.mongodb.ReadPreference readPreference85 = mongoClientOptions72.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder86 = builder47.readPreference(readPreference85);
        com.mongodb.MongoClientOptions.Builder builder88 = builder86.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder89 = builder86.legacyDefaults();
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
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(intClass57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClient65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(mongoClientOptions72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNull(str78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoClient83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 10000 + "'", int84 == 10000);
        org.junit.Assert.assertNotNull(readPreference85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Integer int4 = mongoProperties0.getPort();
        char[] charArray5 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray13 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties6.password = charArray13;
        mongoProperties6.database = "";
        mongoProperties6.setPort((java.lang.Integer) 131072);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.authenticationDatabase;
        boolean boolean21 = mongoProperties19.hasCustomAddress();
        java.lang.String str22 = mongoProperties19.username;
        java.lang.String str23 = mongoProperties19.getGridFsDatabase();
        mongoProperties19.setUri("34");
        java.lang.String str26 = mongoProperties19.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray34 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties27.password = charArray34;
        java.lang.Class<java.lang.Integer> intClass36 = java.lang.Integer.TYPE;
        mongoProperties27.fieldNamingStrategy = intClass36;
        java.lang.String str38 = mongoProperties27.username;
        com.mongodb.MongoClientOptions mongoClientOptions39 = null;
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties27.builder(mongoClientOptions39);
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties27.builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties27.builder(mongoClientOptions43);
        char[] charArray45 = mongoProperties27.password;
        mongoProperties19.password = charArray45;
        mongoProperties6.password = charArray45;
        mongoProperties0.setPassword(charArray45);
        java.lang.Class<?> wildcardClass49 = charArray45.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
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
        java.lang.String str19 = mongoProperties0.getGridFsDatabase();
        java.lang.String str20 = mongoProperties0.host;
        java.lang.Integer int21 = mongoProperties0.getPort();
        java.lang.Class<?> wildcardClass22 = mongoProperties0.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        int int1 = java.lang.Integer.highestOneBit((-536870913));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        mongoProperties0.database = "5000000";
        org.springframework.core.env.Environment environment7 = null;
        int int8 = mongoProperties0.determinePort(environment7);
        java.lang.String str9 = mongoProperties0.uri;
        int int10 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        int int2 = java.lang.Integer.compare((-2147456632), 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        boolean boolean4 = mongoClientOptions1.isSslEnabled();
        com.mongodb.WriteConcern writeConcern5 = mongoClientOptions1.getWriteConcern();
        java.lang.String str6 = mongoClientOptions1.getDescription();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(writeConcern5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        mongoProperties0.gridFsDatabase = "";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
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
        java.lang.String str24 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder25 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        int int27 = mongoClientOptions26.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions26);
        mongoProperties0.setHost("26");
        java.lang.String str31 = mongoProperties0.uri;
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "35" + "'", str24, "35");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 500 + "'", int27 == 500);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.uri = "a86100";
        mongoProperties0.gridFsDatabase = "17";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("131072", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 131072");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        int int1 = java.lang.Integer.parseUnsignedInt("10000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10000 + "'", int1 == 10000);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        int int1 = java.lang.Integer.highestOneBit(4194304);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4194304 + "'", int1 == 4194304);
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
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
        mongoProperties0.setUsername("134217728");
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
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        int int2 = java.lang.Integer.compareUnsigned(0, (-1929379840));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        int int1 = java.lang.Integer.reverseBytes((-1337982976));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16560 + "'", int1 == 16560);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        int int2 = java.lang.Integer.rotateRight((int) (short) 100, 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
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
        com.mongodb.MongoClientOptions.Builder builder34 = builder2.alwaysUseMBeans(false);
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
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        int int1 = java.lang.Integer.parseUnsignedInt("268828672");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 268828672 + "'", int1 == 268828672);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        int int2 = java.lang.Integer.divideUnsigned(200000000, 200000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder4 = builder3.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxWaitTime((int) (byte) 10);
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(141);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.sslInvalidHostNameAllowed(true);
        com.mongodb.event.CommandListener commandListener25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder26 = builder20.addCommandListener(commandListener25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
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
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        int int2 = java.lang.Integer.min(141, 7803356);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 141 + "'", int2 == 141);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        mongoProperties0.setHost("12");
        mongoProperties0.setGridFsDatabase("5371574540");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.serverSelectionTimeout(580061184);
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions14.getWriteConcern();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions14.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder19 = builder8.writeConcern(writeConcern18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder8.description("2000000000");
        com.mongodb.MongoClientOptions.Builder builder23 = builder8.cursorFinalizerEnabled(false);
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
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxConnectionIdleTime(2147483647);
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
        int int27 = mongoClientOptions24.getSocketTimeout();
        int int28 = mongoClientOptions24.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern29 = mongoClientOptions24.getReadConcern();
        java.lang.String str30 = mongoClientOptions24.getDescription();
        org.bson.codecs.configuration.CodecRegistry codecRegistry31 = mongoClientOptions24.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder32 = builder11.codecRegistry(codecRegistry31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder11.description("32768");
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(dBDecoderFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 500 + "'", int28 == 500);
        org.junit.Assert.assertNotNull(readConcern29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(codecRegistry31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        int int2 = java.lang.Integer.divideUnsigned(37, (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("637534208", 947912705);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 947912705 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("100110011111111011110");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100110011111111011110\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
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
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.connectionsPerHost(131072);
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
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getConnectionsPerHost();
        int int4 = mongoClientOptions1.getLocalThreshold();
        int int5 = mongoClientOptions1.getHeartbeatFrequency();
        int int6 = mongoClientOptions1.getConnectTimeout();
        javax.net.SocketFactory socketFactory7 = mongoClientOptions1.getSocketFactory();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10000 + "'", int5 == 10000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
        org.junit.Assert.assertNotNull(socketFactory7);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1073741826);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000000000000000000000000000010" + "'", str1, "1000000000000000000000000000010");
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        javax.net.SocketFactory socketFactory9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketFactory(socketFactory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
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
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.description("");
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder22.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxWaitTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean34 = mongoClientOptions33.isAlwaysUseMBeans();
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties0.createMongoClient(mongoClientOptions33, environment35);
        java.lang.String str37 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("19");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 19");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        java.lang.String str1 = java.lang.Integer.toOctalString(209715200);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1440000000" + "'", str1, "1440000000");
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
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
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        int int16 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions9);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        int int1 = java.lang.Integer.highestOneBit(100000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65536 + "'", int1 == 65536);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry4 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.DBEncoderFactory dBEncoderFactory6 = mongoClientOptions1.getDbEncoderFactory();
        int int7 = mongoClientOptions1.getSocketTimeout();
        boolean boolean8 = mongoClientOptions1.isSslInvalidHostNameAllowed();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(codecRegistry4);
        org.junit.Assert.assertNotNull(dBEncoderFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.heartbeatFrequency(637534208);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
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
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1200000123);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        int int1 = java.lang.Integer.parseInt("100011");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100011 + "'", int1 == 100011);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
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
        com.mongodb.event.CommandListener commandListener16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder17 = builder15.addCommandListener(commandListener16);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("924209280", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 924209280");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1000010100110100011101100", 1073742086);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1073742086 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        com.mongodb.MongoClientOptions.Builder builder6 = mongoProperties0.builder(mongoClientOptions5);
        mongoProperties0.uri = "21925803";
        char[] charArray9 = mongoProperties0.password;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(charArray9);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        int int2 = java.lang.Integer.max(10060000, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10060000 + "'", int2 == 10060000);
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        java.lang.String str2 = java.lang.Integer.toString(2000000000, 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100363501535" + "'", str2, "100363501535");
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("20000064610");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000064610\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        long long1 = java.lang.Integer.toUnsignedLong(134217728);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 134217728L + "'", long1 == 134217728L);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        int int2 = java.lang.Integer.sum(65, 134217728);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134217793 + "'", int2 == 134217793);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        boolean boolean8 = mongoClientOptions6.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1862391011);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1101111000000011101010011100011" + "'", str1, "1101111000000011101010011100011");
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("2");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        java.lang.String str1 = java.lang.Integer.toBinaryString(947912712);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111000100000000000000000001000" + "'", str1, "111000100000000000000000001000");
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(80738176, 2097152);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80738176" + "'", str2, "80738176");
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.database;
        mongoProperties0.setUri("25600");
        mongoProperties0.uri = "";
        java.lang.String str8 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        int int1 = java.lang.Integer.parseUnsignedInt("6400000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6400000 + "'", int1 == 6400000);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        java.lang.String str1 = java.lang.Integer.toBinaryString(9765625);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100101010000001011111001" + "'", str1, "100101010000001011111001");
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        int int1 = java.lang.Integer.highestOneBit(27016);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16384 + "'", int1 == 16384);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 30000 + "'", int35 == 30000);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        int int1 = java.lang.Integer.reverseBytes(54546204);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 474955779 + "'", int1 == 474955779);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
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
        char[] charArray20 = mongoProperties0.getPassword();
        java.lang.String str21 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder22 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.description("");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder34 = builder28.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.maxConnectionLifeTime(1);
        boolean boolean41 = mongoClientOptions23.equals((java.lang.Object) 1);
        int int42 = mongoClientOptions23.getMaxConnectionIdleTime();
        int int43 = mongoClientOptions23.getMaxWaitTime();
        org.springframework.core.env.Environment environment44 = null;
        com.mongodb.MongoClient mongoClient45 = mongoProperties0.createMongoClient(mongoClientOptions23, environment44);
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
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 120000 + "'", int43 == 120000);
        org.junit.Assert.assertNotNull(mongoClient45);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.minHeartbeatFrequency(25600);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.connectionsPerHost(5120000);
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        int int15 = mongoClientOptions14.getHeartbeatConnectTimeout();
        int int16 = mongoClientOptions14.getConnectionsPerHost();
        int int17 = mongoClientOptions14.getLocalThreshold();
        int int18 = mongoClientOptions14.getHeartbeatFrequency();
        int int19 = mongoClientOptions14.getConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory20 = mongoClientOptions14.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder21 = builder10.dbEncoderFactory(dBEncoderFactory20);
        com.mongodb.event.CommandListener commandListener22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder23 = builder21.addCommandListener(commandListener22);
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
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        java.lang.String str1 = java.lang.Integer.toBinaryString(637534208);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100110000000000000000000000000" + "'", str1, "100110000000000000000000000000");
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
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
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.maxWaitTime(131072);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.threadsAllowedToBlockForConnectionMultiplier(10100);
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
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
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
        char[] charArray22 = mongoProperties0.password;
        java.lang.String str23 = mongoProperties0.getUri();
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
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "mongodb://localhost/test" + "'", str23, "mongodb://localhost/test");
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        int int2 = java.lang.Integer.compare(0, 872415232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        int int1 = java.lang.Integer.signum(25600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        int int2 = java.lang.Integer.rotateLeft(268828672, 23564);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1610612992 + "'", int2 == 1610612992);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
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
        org.bson.codecs.configuration.CodecRegistry codecRegistry15 = mongoClientOptions10.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        boolean boolean17 = mongoClientOptions10.isSocketKeepAlive();
        int int18 = mongoClientOptions10.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertNotNull(codecRegistry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("512", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 512");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
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
        java.lang.String str24 = mongoProperties0.getGridFsDatabase();
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        int int1 = java.lang.Integer.lowestOneBit(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        int int2 = java.lang.Integer.compareUnsigned(80738176, 127362560);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
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
        com.mongodb.WriteConcern writeConcern24 = mongoClientOptions15.getWriteConcern();
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
        org.junit.Assert.assertNotNull(writeConcern24);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        int int2 = java.lang.Integer.rotateLeft(0, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("1000000000000000000000000000010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1000000000000000000000000000010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        int int2 = java.lang.Integer.min(924209280, 512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("400000000", 1111);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1111 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.lang.String str2 = mongoClientOptions1.getRequiredReplicaSetName();
        int int3 = mongoClientOptions1.getServerSelectionTimeout();
        int int4 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        int int5 = mongoClientOptions1.getSocketTimeout();
        int int6 = mongoClientOptions1.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        int int2 = java.lang.Integer.compareUnsigned(637534208, (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        int int2 = java.lang.Integer.remainderUnsigned(218234880, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 218234880 + "'", int2 == 218234880);
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getConnectTimeout();
        boolean boolean8 = mongoClientOptions1.isSocketKeepAlive();
        int int9 = mongoClientOptions1.getMinConnectionsPerHost();
        com.mongodb.ReadConcern readConcern10 = mongoClientOptions1.getReadConcern();
        boolean boolean11 = mongoClientOptions1.isSslEnabled();
        int int12 = mongoClientOptions1.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(readConcern10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("b0400000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"b0400000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        int int2 = java.lang.Integer.rotateLeft(111, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1776 + "'", int2 == 1776);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        int int2 = java.lang.Integer.max(74579968, 838860799);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 838860799 + "'", int2 == 838860799);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions6.getWriteConcern();
        boolean boolean10 = mongoClientOptions6.isAlwaysUseMBeans();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions6.getDbEncoderFactory();
        int int12 = mongoClientOptions6.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
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
        boolean boolean42 = mongoProperties0.hasCustomAddress();
        java.lang.String str43 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.host = "";
        mongoProperties0.setGridFsDatabase("2147510664");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        int int2 = java.lang.Integer.divideUnsigned(0, 22930800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        java.lang.String str1 = java.lang.Integer.toHexString(558701952);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "214d1d80" + "'", str1, "214d1d80");
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        int int1 = java.lang.Integer.parseUnsignedInt("111");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 111 + "'", int1 == 111);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("15de570");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"15de570\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        int int1 = java.lang.Integer.parseInt("15");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        int int1 = java.lang.Integer.reverseBytes((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        int int2 = java.lang.Integer.sum(268435456, (-570425344));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-301989888) + "'", int2 == (-301989888));
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        org.bson.codecs.configuration.CodecRegistry codecRegistry6 = mongoClientOptions1.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatFrequency(123);
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions11.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder14 = builder9.dbEncoderFactory(dBEncoderFactory13);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.requiredReplicaSetName("11034880");
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
        int int29 = mongoClientOptions27.getLocalThreshold();
        int int30 = mongoClientOptions27.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions27.getDbEncoderFactory();
        com.mongodb.ReadConcern readConcern32 = mongoClientOptions27.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder33 = builder14.readConcern(readConcern32);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(commandListenerList5);
        org.junit.Assert.assertNotNull(codecRegistry6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertNotNull(readConcern32);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        int int1 = java.lang.Integer.signum(1073741830);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int3 = mongoClientOptions1.getMaxConnectionLifeTime();
        int int4 = mongoClientOptions1.getMaxConnectionLifeTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry5 = mongoClientOptions1.getCodecRegistry();
        int int6 = mongoClientOptions1.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codecRegistry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 100, 22930800);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("200000000", 215);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 215 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        java.lang.String str2 = java.lang.Integer.toString(1342177280, 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "45155214203" + "'", str2, "45155214203");
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("200", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 200");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        int int1 = java.lang.Integer.numberOfTrailingZeros((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
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
        boolean boolean15 = mongoClientOptions10.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
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
        java.lang.Class<?> wildcardClass19 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        int int2 = java.lang.Integer.rotateRight(736557408, 1200000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 736557408 + "'", int2 == 736557408);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        int int1 = java.lang.Integer.reverse((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1006632960) + "'", int1 == (-1006632960));
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList16 = mongoClientOptions10.getCommandListeners();
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
        org.junit.Assert.assertNotNull(commandListenerList16);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        int int2 = java.lang.Integer.parseInt("2", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.database;
        java.lang.String str5 = mongoProperties0.getUsername();
        java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setPort((java.lang.Integer) 120000);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        int int1 = java.lang.Integer.highestOneBit(776936832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
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
        com.mongodb.event.CommandListener commandListener38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder39 = builder37.addCommandListener(commandListener38);
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
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        java.lang.String str1 = java.lang.Integer.toHexString(512);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "200" + "'", str1, "200");
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        long long1 = java.lang.Integer.toUnsignedLong(27017);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 27017L + "'", long1 == 27017L);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        mongoProperties0.uri = "97";
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
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions19.getDbDecoderFactory();
        int int22 = mongoClientOptions19.getSocketTimeout();
        int int23 = mongoClientOptions19.getMinHeartbeatFrequency();
        boolean boolean24 = mongoClientOptions19.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties0.builder(mongoClientOptions19);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.database;
        java.lang.String str28 = mongoProperties26.authenticationDatabase;
        java.lang.Integer int29 = mongoProperties26.port;
        java.lang.String str30 = mongoProperties26.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder31 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.description("");
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder41 = builder37.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder43 = builder37.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder49 = builder45.maxConnectionLifeTime(1);
        boolean boolean50 = mongoClientOptions32.equals((java.lang.Object) 1);
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties26.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder59 = builder56.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        int int63 = mongoClientOptions62.getMinHeartbeatFrequency();
        boolean boolean64 = mongoClientOptions62.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference65 = mongoClientOptions62.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder66 = builder55.readPreference(readPreference65);
        com.mongodb.MongoClientOptions.Builder builder67 = builder25.readPreference(readPreference65);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(mongoClient12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 500 + "'", int23 == 500);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 500 + "'", int63 == 500);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(readPreference65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        int int2 = java.lang.Integer.sum(34, 212746240);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 212746274 + "'", int2 == 212746274);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        int int1 = java.lang.Integer.lowestOneBit(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        long long1 = java.lang.Integer.toUnsignedLong(1862391011);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1862391011L + "'", long1 == 1862391011L);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions1.isSslInvalidHostNameAllowed();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions1.getDbEncoderFactory();
        int int9 = mongoClientOptions1.getMaxWaitTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry10 = mongoClientOptions1.getCodecRegistry();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertNotNull(codecRegistry10);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        int int2 = java.lang.Integer.remainderUnsigned(120035, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
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
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("200000000");
        com.mongodb.event.CommandListener commandListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.addCommandListener(commandListener15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.serverSelectionTimeout(580061184);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.serverSelectionTimeout(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.uri;
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str5 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder6 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int9 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int10 = mongoClientOptions7.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions7);
        int int12 = mongoClientOptions7.getMinConnectionsPerHost();
        boolean boolean13 = mongoClientOptions7.isSslInvalidHostNameAllowed();
        com.mongodb.DBDecoderFactory dBDecoderFactory14 = mongoClientOptions7.getDbDecoderFactory();
        int int15 = mongoClientOptions7.getHeartbeatSocketTimeout();
        org.springframework.core.env.Environment environment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient17 = mongoProperties0.createMongoClient(mongoClientOptions7, environment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb://localhost/test" + "'", str2, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
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
        java.lang.String str50 = mongoClientOptions10.getDescription();
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
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
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
        boolean boolean33 = mongoClientOptions25.equals((java.lang.Object) 1.0f);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setHost("1100100");
        mongoProperties0.setDatabase("100");
        mongoProperties0.port = 23420000;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        int int2 = java.lang.Integer.remainderUnsigned(947912712, (-746586112));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 947912712 + "'", int2 == 947912712);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        int int2 = java.lang.Integer.compareUnsigned(37748736, 838860799);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        int int1 = java.lang.Integer.signum(54546204);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        java.lang.String str1 = java.lang.Integer.toBinaryString(127362560);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111100101110110011000000000" + "'", str1, "111100101110110011000000000");
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(111110100, 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "34e7e76" + "'", str2, "34e7e76");
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
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
        com.mongodb.MongoClientOptions.Builder builder36 = builder2.description("100110000000000000000000000000");
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
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int32 = mongoProperties31.port;
        mongoProperties31.setAuthenticationDatabase("");
        java.lang.Integer int35 = mongoProperties31.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray43 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties36.password = charArray43;
        mongoProperties31.setPassword(charArray43);
        mongoProperties31.setHost("12");
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
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties31.builder(mongoClientOptions58);
        int int62 = mongoClientOptions58.getConnectionsPerHost();
        int int63 = mongoClientOptions58.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions58);
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties0.builder(mongoClientOptions58);
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.heartbeatFrequency(20648981);
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
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        int int1 = java.lang.Integer.lowestOneBit(9765625);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        int int2 = java.lang.Integer.compare(9765625, 120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        int int2 = java.lang.Integer.divideUnsigned(5242944, (-2147456633));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        int int1 = java.lang.Integer.parseUnsignedInt("400000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 400000000 + "'", int1 == 400000000);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        int int2 = java.lang.Integer.min(3, 83886080);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-746586112));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3548381184" + "'", str1, "3548381184");
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
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
        java.lang.String str40 = mongoClientOptions28.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        int int42 = mongoClientOptions28.getHeartbeatFrequency();
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
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10000 + "'", int42 == 10000);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        java.lang.String str2 = java.lang.Integer.toString(1200000123, (-2046820352));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1200000123" + "'", str2, "1200000123");
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        int int1 = java.lang.Integer.lowestOneBit(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        int int1 = java.lang.Integer.highestOneBit(10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8192 + "'", int1 == 8192);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        java.lang.String str1 = java.lang.Integer.toOctalString(1200000000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10741506000" + "'", str1, "10741506000");
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
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
        int int13 = mongoClientOptions9.getMinConnectionsPerHost();
        int int14 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
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
        mongoProperties0.gridFsDatabase = "10";
        java.lang.String str22 = mongoProperties0.username;
        mongoProperties0.setUri("test");
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions6.getWriteConcern();
        boolean boolean10 = mongoClientOptions6.isSslEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
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
        mongoProperties0.setUri("268828672");
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
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        int int2 = java.lang.Integer.sum(218234880, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 218234880 + "'", int2 == 218234880);
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
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
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.localThreshold(256);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(0);
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
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
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
        org.bson.codecs.configuration.CodecRegistry codecRegistry14 = mongoClientOptions10.getCodecRegistry();
        boolean boolean15 = mongoClientOptions10.isSslEnabled();
        java.lang.String str16 = mongoClientOptions10.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(codecRegistry14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minHeartbeatFrequency(2147483647);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketTimeout(26);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1100100");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.database;
        mongoProperties0.uri = "0";
        mongoProperties0.setGridFsDatabase("");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.alwaysUseMBeans(false);
        com.mongodb.event.CommandListener commandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder2.addCommandListener(commandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
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
        java.lang.Class<?> wildcardClass71 = mongoProperties0.fieldNamingStrategy;
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
        org.junit.Assert.assertNull(wildcardClass71);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        int int1 = java.lang.Integer.reverse(2000000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2731246 + "'", int1 == 2731246);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        boolean boolean4 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setPort((java.lang.Integer) 8);
        mongoProperties0.gridFsDatabase = "";
        boolean boolean9 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        int int2 = java.lang.Integer.max(6, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.database;
        mongoProperties0.setAuthenticationDatabase("34");
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions.Builder builder15 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.build();
        int int17 = mongoClientOptions16.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions16.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry19 = mongoClientOptions16.getCodecRegistry();
        boolean boolean20 = mongoClientOptions16.isSocketKeepAlive();
        org.springframework.core.env.Environment environment21 = null;
        com.mongodb.MongoClient mongoClient22 = mongoProperties0.createMongoClient(mongoClientOptions16, environment21);
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(codecRegistry19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(mongoClient22);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        java.lang.String str2 = java.lang.Integer.toString(4, (-2147456633));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
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
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties0.createMongoClient(mongoClientOptions30, environment35);
        java.lang.Integer int37 = mongoProperties0.port;
        int int38 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str39 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(commandListenerList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 27017 + "'", int38 == 27017);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "97" + "'", str39, "97");
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getHeartbeatFrequency();
        int int7 = mongoClientOptions1.getMinConnectionsPerHost();
        int int8 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str9 = mongoClientOptions1.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        java.lang.Integer int1 = java.lang.Integer.getInteger("cae0000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
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
        boolean boolean47 = mongoProperties0.hasCustomAddress();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        int int1 = java.lang.Integer.signum(16560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        int int2 = java.lang.Integer.remainderUnsigned(0, (-1006632960));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        int int2 = java.lang.Integer.compareUnsigned(111110100, 167772160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
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
        mongoProperties0.setHost("212746240");
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
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        int int2 = java.lang.Integer.compareUnsigned(18, 1552);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
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
        java.lang.String str20 = mongoProperties0.username;
        mongoProperties0.setUri("110100");
        mongoProperties0.setUsername("37777777777");
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        int int1 = java.lang.Integer.lowestOneBit(215);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        int int2 = java.lang.Integer.max(5242944, (-528443136));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5242944 + "'", int2 == 5242944);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
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
        int int20 = mongoClientOptions1.getMaxConnectionIdleTime();
        boolean boolean21 = mongoClientOptions1.isSslInvalidHostNameAllowed();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int23 = mongoClientOptions1.getMinConnectionsPerHost();
        int int24 = mongoClientOptions1.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 120000 + "'", int24 == 120000);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.heartbeatConnectTimeout(5);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.connectTimeout(1024);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.description("22930800");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minHeartbeatFrequency(558701952);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.connectTimeout(924209280);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        java.lang.Integer int1 = java.lang.Integer.getInteger("2147510664");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
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
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
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
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("1000010100110100011101100");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1000010100110100011101100");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.uri;
        java.lang.String str3 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str5 = mongoProperties4.database;
        mongoProperties4.setHost("mongodb://localhost/test");
        java.lang.String str8 = mongoProperties4.getUri();
        java.lang.String str9 = mongoProperties4.getDatabase();
        java.lang.Class<?> wildcardClass10 = mongoProperties4.getFieldNamingStrategy();
        char[] charArray11 = mongoProperties4.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray19 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties12.password = charArray19;
        mongoProperties12.database = "";
        boolean boolean23 = mongoProperties12.hasCustomAddress();
        java.lang.String str24 = mongoProperties12.authenticationDatabase;
        java.lang.Integer int25 = mongoProperties12.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray33 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties26.password = charArray33;
        java.lang.Class<java.lang.Integer> intClass35 = java.lang.Integer.TYPE;
        mongoProperties26.fieldNamingStrategy = intClass35;
        java.lang.String str37 = mongoProperties26.username;
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties26.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions mongoClientOptions40 = null;
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties26.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions mongoClientOptions42 = null;
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties26.builder(mongoClientOptions42);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.database;
        java.lang.String str46 = mongoProperties44.authenticationDatabase;
        java.lang.Integer int47 = mongoProperties44.port;
        java.lang.Class<java.lang.Integer> intClass48 = java.lang.Integer.TYPE;
        mongoProperties44.fieldNamingStrategy = intClass48;
        mongoProperties26.fieldNamingStrategy = intClass48;
        mongoProperties12.setFieldNamingStrategy(intClass48);
        mongoProperties4.setFieldNamingStrategy(intClass48);
        mongoProperties0.fieldNamingStrategy = intClass48;
        java.lang.Class<?> wildcardClass54 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb://localhost/test" + "'", str2, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(int47);
        org.junit.Assert.assertNotNull(intClass48);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
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
        boolean boolean35 = mongoClientOptions27.isSslEnabled();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.maxConnectionLifeTime(20000);
        com.mongodb.MongoClientOptions.Builder builder41 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.heartbeatFrequency(23564);
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
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
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.threadsAllowedToBlockForConnectionMultiplier(11010);
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
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        int int5 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList7 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int9 = mongoClientOptions1.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertNotNull(commandListenerList7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        mongoProperties0.username = "test";
        mongoProperties0.setUsername("12");
        mongoProperties0.authenticationDatabase = "20600000000";
        java.lang.Class<?> wildcardClass10 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str11 = mongoProperties0.database;
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        int int2 = java.lang.Integer.compare(29, 20648881);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("161056", 8192);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 8192 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        mongoProperties0.authenticationDatabase = "16";
        java.lang.String str13 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str14 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("120000");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray24 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties17.password = charArray24;
        java.lang.String str26 = mongoProperties17.database;
        char[] charArray27 = mongoProperties17.getPassword();
        mongoProperties17.database = "mongodb://localhost/test";
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList42 = mongoClientOptions40.getCommandListeners();
        int int43 = mongoClientOptions40.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList44 = mongoClientOptions40.getCommandListeners();
        boolean boolean45 = mongoClientOptions40.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties17.builder(mongoClientOptions40);
        boolean boolean47 = mongoClientOptions40.isSslEnabled();
        int int48 = mongoClientOptions40.getHeartbeatFrequency();
        org.springframework.core.env.Environment environment49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient50 = mongoProperties0.createMongoClient(mongoClientOptions40, environment49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The connection string is invalid. Connection strings must start with 'mongodb://'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(commandListenerList42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(commandListenerList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10000 + "'", int48 == 10000);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11010", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray18 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties11.password = charArray18;
        java.lang.String str20 = mongoProperties11.database;
        char[] charArray21 = mongoProperties11.getPassword();
        mongoProperties0.password = charArray21;
        java.lang.String str23 = mongoProperties0.database;
        boolean boolean24 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.uri = "4";
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
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
        int int13 = mongoClientOptions10.getConnectionsPerHost();
        int int14 = mongoClientOptions10.getConnectionsPerHost();
        int int15 = mongoClientOptions10.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        mongoProperties0.gridFsDatabase = "";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Integer int10 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList37 = mongoClientOptions24.getCommandListeners();
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
        org.junit.Assert.assertNotNull(commandListenerList37);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        int int1 = java.lang.Integer.reverse((-301989888));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 119 + "'", int1 == 119);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.setDatabase("34");
        java.lang.String str10 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass11 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "34" + "'", str10, "34");
        org.junit.Assert.assertNull(wildcardClass11);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        int int2 = java.lang.Integer.rotateRight(9926681, 1862270976);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9926681 + "'", int2 == 9926681);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        int int2 = java.lang.Integer.compareUnsigned(832, 30000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        java.lang.String str1 = java.lang.Integer.toString(1250);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1250" + "'", str1, "1250");
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        int int1 = java.lang.Integer.reverseBytes(1250);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-503054336) + "'", int1 == (-503054336));
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(32, 8192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        long long1 = java.lang.Integer.toUnsignedLong(32768);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 32768L + "'", long1 == 32768L);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        mongoProperties0.setGridFsDatabase("5");
        mongoProperties0.setDatabase("test");
        mongoProperties0.username = "2";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment12 = null;
        int int13 = mongoProperties0.determinePort(environment12);
        mongoProperties0.clearPassword();
        mongoProperties0.setPort((java.lang.Integer) 167772160);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        java.lang.String str1 = java.lang.Integer.toHexString(31);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1f" + "'", str1, "1f");
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        int int1 = java.lang.Integer.parseInt("7976628");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7976628 + "'", int1 == 7976628);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1101111000000011101010011100011", 212746274);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 212746274 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(16);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxConnectionIdleTime((-2147483644));
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.alwaysUseMBeans(true);
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
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
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
        char[] charArray34 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "16";
        char[] charArray37 = mongoProperties0.getPassword();
        mongoProperties0.username = "100111000100000";
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
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.description("");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder26 = builder20.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.description("");
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
        com.mongodb.MongoClientOptions.Builder builder46 = builder26.dbDecoderFactory(dBDecoderFactory44);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.database;
        mongoProperties47.setHost("mongodb://localhost/test");
        java.lang.String str51 = mongoProperties47.getHost();
        com.mongodb.MongoClientOptions.Builder builder52 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder52.build();
        int int54 = mongoClientOptions53.getHeartbeatConnectTimeout();
        int int55 = mongoClientOptions53.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties47.builder(mongoClientOptions53);
        javax.net.SocketFactory socketFactory57 = mongoClientOptions53.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory58 = mongoClientOptions53.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder26.dbEncoderFactory(dBEncoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder61 = builder26.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder62 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder62.build();
        int int64 = mongoClientOptions63.getHeartbeatConnectTimeout();
        int int65 = mongoClientOptions63.getConnectionsPerHost();
        int int66 = mongoClientOptions63.getLocalThreshold();
        javax.net.SocketFactory socketFactory67 = mongoClientOptions63.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder61.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder69 = builder17.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder70 = builder8.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder72 = builder8.threadsAllowedToBlockForConnectionMultiplier(838860800);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
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
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "mongodb://localhost/test" + "'", str51, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20000 + "'", int54 == 20000);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(socketFactory57);
        org.junit.Assert.assertNotNull(dBEncoderFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20000 + "'", int64 == 20000);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 15 + "'", int66 == 15);
        org.junit.Assert.assertNotNull(socketFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("2", 33554432);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 33554432 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        com.mongodb.MongoClientOptions.Builder builder4 = mongoProperties0.builder(mongoClientOptions3);
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setAuthenticationDatabase("7976628");
        mongoProperties0.setDatabase("22930800");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minHeartbeatFrequency(1111);
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("525", 1862270976);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1862270976 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("2147483652", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2147483652");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
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
        com.mongodb.MongoClientOptions.Builder builder57 = builder17.dbDecoderFactory(dBDecoderFactory56);
        com.mongodb.event.CommandListener commandListener58 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder59 = builder57.addCommandListener(commandListener58);
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
        org.junit.Assert.assertNotNull(mongoClient47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(dBDecoderFactory56);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        mongoProperties0.database = "5000000";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int8 = mongoProperties7.port;
        mongoProperties7.setAuthenticationDatabase("");
        java.lang.Integer int11 = mongoProperties7.getPort();
        java.lang.String str12 = mongoProperties7.getMongoClientDatabase();
        mongoProperties7.setPort((java.lang.Integer) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.authenticationDatabase;
        boolean boolean17 = mongoProperties15.hasCustomAddress();
        java.lang.String str18 = mongoProperties15.username;
        int int19 = mongoProperties15.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.database;
        java.lang.String str22 = mongoProperties20.authenticationDatabase;
        java.lang.Class<?> wildcardClass23 = mongoProperties20.fieldNamingStrategy;
        mongoProperties20.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties20.builder(mongoClientOptions26);
        java.lang.Class<java.lang.Integer> intClass28 = java.lang.Integer.TYPE;
        mongoProperties20.setFieldNamingStrategy(intClass28);
        mongoProperties15.setFieldNamingStrategy(intClass28);
        mongoProperties7.fieldNamingStrategy = intClass28;
        mongoProperties0.fieldNamingStrategy = intClass28;
        mongoProperties0.port = 29;
        java.lang.String str35 = mongoProperties0.getHost();
        mongoProperties0.gridFsDatabase = "23420";
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder41 = builder38.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        java.lang.String str45 = mongoClientOptions44.getDescription();
        int int46 = mongoClientOptions44.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern47 = mongoClientOptions44.getWriteConcern();
        boolean boolean48 = mongoClientOptions44.isAlwaysUseMBeans();
        org.springframework.core.env.Environment environment49 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient50 = mongoProperties0.createMongoClient(mongoClientOptions44, environment49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: can't specify port in construct and via host");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "test" + "'", str12, "test");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(intClass28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "mongodb://localhost/test" + "'", str35, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(writeConcern47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        int int2 = java.lang.Integer.sum(200, 872415232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 872415432 + "'", int2 == 872415432);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
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
        com.mongodb.MongoClientOptions.Builder builder16 = com.mongodb.MongoClientOptions.builder(mongoClientOptions12);
        java.util.List<com.mongodb.event.CommandListener> commandListenerList17 = mongoClientOptions12.getCommandListeners();
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
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(commandListenerList17);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
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
        com.mongodb.MongoClientOptions.Builder builder17 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        int int19 = mongoClientOptions18.getHeartbeatConnectTimeout();
        int int20 = mongoClientOptions18.getMaxConnectionIdleTime();
        int int21 = mongoClientOptions18.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions18);
        int int23 = mongoClientOptions18.getSocketTimeout();
        int int24 = mongoClientOptions18.getSocketTimeout();
        java.lang.String str25 = mongoClientOptions18.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties0.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.cursorFinalizerEnabled(false);
        javax.net.SocketFactory socketFactory29 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder30 = builder26.socketFactory(socketFactory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("test");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"test\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold(20648981);
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
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        int int1 = java.lang.Integer.reverseBytes(120);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2013265920 + "'", int1 == 2013265920);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
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
        mongoProperties0.gridFsDatabase = "15";
        java.lang.String str21 = mongoProperties0.database;
        java.lang.String str22 = mongoProperties0.getDatabase();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        java.lang.String str1 = java.lang.Integer.toString(215);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "215" + "'", str1, "215");
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
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
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.springframework.core.env.Environment environment25 = null;
        com.mongodb.MongoClient mongoClient26 = mongoProperties23.createMongoClient(mongoClientOptions24, environment25);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties23.builder(mongoClientOptions33);
        int int35 = mongoClientOptions33.getLocalThreshold();
        int int36 = mongoClientOptions33.getMaxConnectionIdleTime();
        org.bson.codecs.configuration.CodecRegistry codecRegistry37 = mongoClientOptions33.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder38 = builder20.codecRegistry(codecRegistry37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder20.maxWaitTime((-1));
        com.mongodb.MongoClientOptions.Builder builder42 = builder20.localThreshold(9);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder44 = builder42.minHeartbeatFrequency((-2046820320));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: minHeartbeatFrequency must be > 0");
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
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(codecRegistry37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        int int2 = java.lang.Integer.rotateLeft(167772160, 80738176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167772160 + "'", int2 == 167772160);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        int int1 = java.lang.Integer.reverseBytes(20648981);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 353647361 + "'", int1 == 353647361);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        int int2 = java.lang.Integer.max((int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
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
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.heartbeatFrequency(500);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.threadsAllowedToBlockForConnectionMultiplier(25);
        com.mongodb.MongoClientOptions.Builder builder35 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder36 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder36.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList38 = mongoClientOptions37.getCommandListeners();
        javax.net.SocketFactory socketFactory39 = mongoClientOptions37.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder35.socketFactory(socketFactory39);
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
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(commandListenerList38);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(52);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.threadsAllowedToBlockForConnectionMultiplier(1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        java.lang.String str1 = java.lang.Integer.toBinaryString(74579968);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100011100100000000000000000" + "'", str1, "100011100100000000000000000");
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
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
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions10.getDbEncoderFactory();
        int int19 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
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
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        java.lang.String str1 = java.lang.Integer.toOctalString(100000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "303240" + "'", str1, "303240");
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory98 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder99 = builder36.dbEncoderFactory(dBEncoderFactory98);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
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
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("558701952", 9765625);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 9765625 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
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
        int int29 = mongoClientOptions21.getSocketTimeout();
        int int30 = mongoClientOptions21.getMaxConnectionIdleTime();
        int int31 = mongoClientOptions21.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "17" + "'", str1, "17");
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
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
        int int20 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int21 = mongoClientOptions1.getMaxWaitTime();
        int int22 = mongoClientOptions1.getMaxConnectionLifeTime();
        java.lang.String str23 = mongoClientOptions1.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120000 + "'", int21 == 120000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
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
        org.bson.codecs.configuration.CodecRegistry codecRegistry15 = mongoClientOptions10.getCodecRegistry();
        java.lang.String str16 = mongoClientOptions10.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(codecRegistry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        int int1 = java.lang.Integer.reverse(32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65536 + "'", int1 == 65536);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
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
        java.lang.Class<?> wildcardClass19 = mongoProperties0.getFieldNamingStrategy();
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
        org.junit.Assert.assertNull(wildcardClass19);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("47868c7b");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"47868c7b\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1862270976);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        java.lang.Integer int1 = java.lang.Integer.getInteger("a");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("1440000000", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1440000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        int int2 = java.lang.Integer.compare(119, 2097152);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        long long1 = java.lang.Integer.toUnsignedLong(1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1L + "'", long1 == 1L);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10010000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10010000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1342177280, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1342177280" + "'", str2, "1342177280");
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.sslInvalidHostNameAllowed(true);
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
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
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
        mongoProperties0.database = "";
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
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        int int2 = java.lang.Integer.compare(12, 353647361);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        int int2 = java.lang.Integer.min(14, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
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
        boolean boolean40 = mongoClientOptions35.isSslInvalidHostNameAllowed();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
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
        mongoProperties0.setAuthenticationDatabase("11010");
        char[] charArray22 = mongoProperties0.password;
        mongoProperties0.setGridFsDatabase("10");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        java.lang.String str1 = java.lang.Integer.toString(30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30" + "'", str1, "30");
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1114112);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100010000000000000000" + "'", str1, "100010000000000000000");
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
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
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatConnectTimeout((int) (byte) -1);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.threadsAllowedToBlockForConnectionMultiplier(134217728);
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
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.socketKeepAlive(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties64 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str65 = mongoProperties64.database;
        mongoProperties64.setHost("mongodb://localhost/test");
        java.lang.String str68 = mongoProperties64.getHost();
        com.mongodb.MongoClientOptions.Builder builder69 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder69.build();
        int int71 = mongoClientOptions70.getHeartbeatConnectTimeout();
        int int72 = mongoClientOptions70.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder73 = mongoProperties64.builder(mongoClientOptions70);
        javax.net.SocketFactory socketFactory74 = mongoClientOptions70.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder75 = builder63.socketFactory(socketFactory74);
        com.mongodb.MongoClientOptions.Builder builder76 = builder43.socketFactory(socketFactory74);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder78 = builder43.connectTimeout((-2046820352));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectTimeout must be >= 0");
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
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "mongodb://localhost/test" + "'", str68, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 20000 + "'", int71 == 20000);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(socketFactory74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1410560);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1410560" + "'", str1, "1410560");
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        java.lang.Integer int1 = java.lang.Integer.getInteger("80");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.serverSelectionTimeout(74579968);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        java.lang.String str1 = java.lang.Integer.toString(29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "29" + "'", str1, "29");
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
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
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.socketTimeout(16384);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxWaitTime(120000);
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
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getConnectionsPerHost();
        int int4 = mongoClientOptions1.getLocalThreshold();
        int int5 = mongoClientOptions1.getConnectTimeout();
        int int6 = mongoClientOptions1.getServerSelectionTimeout();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10000 + "'", int5 == 10000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.Integer int4 = mongoProperties0.getPort();
        mongoProperties0.gridFsDatabase = "hi!";
        mongoProperties0.setPort((java.lang.Integer) 512);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        mongoProperties0.setGridFsDatabase("5");
        mongoProperties0.setDatabase("test");
        mongoProperties0.username = "2";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment12 = null;
        int int13 = mongoProperties0.determinePort(environment12);
        mongoProperties0.clearPassword();
        mongoProperties0.host = "133fde";
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(838860799);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.alwaysUseMBeans(true);
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
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        mongoProperties0.authenticationDatabase = "-1";
        mongoProperties0.setHost("18");
        java.lang.String str16 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1" + "'", str16, "-1");
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.serverSelectionTimeout((-1));
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.description("");
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder40 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder40.build();
        boolean boolean42 = mongoClientOptions41.isCursorFinalizerEnabled();
        int int43 = mongoClientOptions41.getHeartbeatConnectTimeout();
        int int44 = mongoClientOptions41.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference45 = mongoClientOptions41.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder46 = builder35.readPreference(readPreference45);
        com.mongodb.MongoClientOptions.Builder builder47 = builder29.readPreference(readPreference45);
        com.mongodb.MongoClientOptions.Builder builder48 = builder6.readPreference(readPreference45);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.serverSelectionTimeout(120);
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
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(readPreference45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.socketTimeout(0);
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
        java.lang.String str31 = mongoClientOptions28.getRequiredReplicaSetName();
        com.mongodb.DBEncoderFactory dBEncoderFactory32 = mongoClientOptions28.getDbEncoderFactory();
        int int33 = mongoClientOptions28.getServerSelectionTimeout();
        com.mongodb.WriteConcern writeConcern34 = mongoClientOptions28.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder35 = builder13.writeConcern(writeConcern34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.sslEnabled(true);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(commandListenerList30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(dBEncoderFactory32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30000 + "'", int33 == 30000);
        org.junit.Assert.assertNotNull(writeConcern34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.sslInvalidHostNameAllowed(false);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketTimeout(0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.database;
        mongoProperties10.setHost("mongodb://localhost/test");
        java.lang.String str14 = mongoProperties10.getUri();
        int int15 = mongoProperties10.getDEFAULT_PORT();
        java.lang.String str16 = mongoProperties10.gridFsDatabase;
        java.lang.String str17 = mongoProperties10.getUri();
        com.mongodb.MongoClientOptions.Builder builder18 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions19);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties10.builder(mongoClientOptions19);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions19);
        boolean boolean23 = mongoClientOptions19.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions19);
        int int25 = mongoClientOptions19.getLocalThreshold();
        org.bson.codecs.configuration.CodecRegistry codecRegistry26 = mongoClientOptions19.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder27 = builder7.codecRegistry(codecRegistry26);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNotNull(codecRegistry26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        java.lang.String str1 = java.lang.Integer.toString((-2147456632));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147456632" + "'", str1, "-2147456632");
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
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
        boolean boolean16 = mongoClientOptions10.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions10.getSocketFactory();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.uri;
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "test" + "'", str7, "test");
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        int int1 = java.lang.Integer.parseInt("120000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 120000 + "'", int1 == 120000);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        int int1 = java.lang.Integer.reverseBytes(293601280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32785 + "'", int1 == 32785);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(536870912);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "536870912" + "'", str1, "536870912");
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        int int2 = java.lang.Integer.max((int) (short) 0, 1610612992);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1610612992 + "'", int2 == 1610612992);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("37777777777");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"37777777777\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        java.lang.Integer int1 = java.lang.Integer.getInteger("26");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        int int2 = java.lang.Integer.sum(30, (-1006632960));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1006632930) + "'", int2 == (-1006632930));
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1200000000);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        com.mongodb.event.CommandListener commandListener14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder10.addCommandListener(commandListener14);
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
        org.junit.Assert.assertNotNull(mongoClientOptions13);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.socketKeepAlive(true);
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
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getSocketTimeout();
        int int27 = mongoClientOptions23.getMinHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern28 = mongoClientOptions23.getReadConcern();
        java.lang.String str29 = mongoClientOptions23.getDescription();
        org.bson.codecs.configuration.CodecRegistry codecRegistry30 = mongoClientOptions23.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder31 = builder8.codecRegistry(codecRegistry30);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.requiredReplicaSetName("5");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 500 + "'", int27 == 500);
        org.junit.Assert.assertNotNull(readConcern28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(codecRegistry30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
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
        boolean boolean11 = mongoClientOptions5.isSslEnabled();
        org.bson.codecs.configuration.CodecRegistry codecRegistry12 = mongoClientOptions5.getCodecRegistry();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(codecRegistry12);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.heartbeatConnectTimeout(64);
        com.mongodb.event.CommandListener commandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder11.addCommandListener(commandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.threadsAllowedToBlockForConnectionMultiplier(1200000000);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxWaitTime((-536870913));
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.connectionsPerHost(736557408);
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
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
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
        int int15 = mongoClientOptions6.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        boolean boolean17 = mongoClientOptions6.isSslInvalidHostNameAllowed();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        int int1 = java.lang.Integer.signum(832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder5.maxConnectionLifeTime(120035);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(false);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("400000000", 10001101);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 10001101 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
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
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions42);
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
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        int int1 = java.lang.Integer.numberOfTrailingZeros(27);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        int int2 = java.lang.Integer.divideUnsigned((-301989888), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 399297740 + "'", int2 == 399297740);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        int int2 = java.lang.Integer.remainderUnsigned((int) (short) -1, 101000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43295 + "'", int2 == 43295);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        int int2 = java.lang.Integer.max(1100100, 157187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1100100 + "'", int2 == 1100100);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        java.lang.String str1 = java.lang.Integer.toOctalString(119);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "167" + "'", str1, "167");
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
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
        boolean boolean21 = mongoProperties0.hasCustomCredentials();
        java.lang.String str22 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray30 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties23.password = charArray30;
        java.lang.Class<java.lang.Integer> intClass32 = java.lang.Integer.TYPE;
        mongoProperties23.fieldNamingStrategy = intClass32;
        java.lang.String str34 = mongoProperties23.username;
        java.lang.String str35 = mongoProperties23.getUsername();
        mongoProperties23.setHost("1100100");
        java.lang.String str38 = mongoProperties23.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.database;
        mongoProperties39.setHost("mongodb://localhost/test");
        mongoProperties39.setDatabase("35");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties45 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray52 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties45.password = charArray52;
        java.lang.String str54 = mongoProperties45.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str56 = mongoProperties55.database;
        java.lang.String str57 = mongoProperties55.authenticationDatabase;
        java.lang.Integer int58 = mongoProperties55.port;
        java.lang.Class<java.lang.Integer> intClass59 = java.lang.Integer.TYPE;
        mongoProperties55.fieldNamingStrategy = intClass59;
        mongoProperties45.setFieldNamingStrategy(intClass59);
        mongoProperties39.fieldNamingStrategy = intClass59;
        mongoProperties23.setFieldNamingStrategy(intClass59);
        mongoProperties0.setFieldNamingStrategy(intClass59);
        mongoProperties0.gridFsDatabase = "100363501535";
        char[] charArray67 = mongoProperties0.password;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "12" + "'", str22, "12");
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "test" + "'", str38, "test");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNotNull(intClass59);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("127362560", 10100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 10100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        int int2 = java.lang.Integer.remainderUnsigned(50000000, 209715200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50000000 + "'", int2 == 50000000);
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
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
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions10.getReadPreference();
        int int17 = mongoClientOptions10.getSocketTimeout();
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
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(177, 436207616);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "177" + "'", str2, "177");
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        mongoProperties0.authenticationDatabase = "16";
        java.lang.String str13 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.uri = "1111111111111111111111111111111";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
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
        com.mongodb.MongoClientOptions.Builder builder36 = builder30.maxWaitTime(25600);
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
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("80000004", 30000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 30000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        java.lang.String str5 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setPort((java.lang.Integer) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.authenticationDatabase;
        boolean boolean10 = mongoProperties8.hasCustomAddress();
        java.lang.String str11 = mongoProperties8.username;
        int int12 = mongoProperties8.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.database;
        java.lang.String str15 = mongoProperties13.authenticationDatabase;
        java.lang.Class<?> wildcardClass16 = mongoProperties13.fieldNamingStrategy;
        mongoProperties13.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions19);
        java.lang.Class<java.lang.Integer> intClass21 = java.lang.Integer.TYPE;
        mongoProperties13.setFieldNamingStrategy(intClass21);
        mongoProperties8.setFieldNamingStrategy(intClass21);
        mongoProperties0.fieldNamingStrategy = intClass21;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray32 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties25.password = charArray32;
        java.lang.String str34 = mongoProperties25.database;
        java.lang.String str35 = mongoProperties25.getHost();
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
        org.springframework.core.env.Environment environment52 = null;
        com.mongodb.MongoClient mongoClient53 = mongoProperties25.createMongoClient(mongoClientOptions46, environment52);
        boolean boolean54 = mongoClientOptions46.isSslInvalidHostNameAllowed();
        int int55 = mongoClientOptions46.getLocalThreshold();
        org.springframework.core.env.Environment environment56 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient57 = mongoProperties0.createMongoClient(mongoClientOptions46, environment56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(intClass21);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(mongoClient39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(mongoClient53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 15 + "'", int55 == 15);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.database;
        mongoProperties26.setHost("mongodb://localhost/test");
        java.lang.String str30 = mongoProperties26.getHost();
        com.mongodb.MongoClientOptions.Builder builder31 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        int int33 = mongoClientOptions32.getHeartbeatConnectTimeout();
        int int34 = mongoClientOptions32.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties26.builder(mongoClientOptions32);
        javax.net.SocketFactory socketFactory36 = mongoClientOptions32.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        int int38 = mongoClientOptions32.getHeartbeatConnectTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.authenticationDatabase;
        boolean boolean41 = mongoProperties39.hasCustomAddress();
        java.lang.String str42 = mongoProperties39.username;
        java.lang.String str43 = mongoProperties39.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray51 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties44.password = charArray51;
        java.lang.String str53 = mongoProperties44.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties54 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str55 = mongoProperties54.database;
        java.lang.String str56 = mongoProperties54.authenticationDatabase;
        java.lang.Integer int57 = mongoProperties54.port;
        java.lang.Class<java.lang.Integer> intClass58 = java.lang.Integer.TYPE;
        mongoProperties54.fieldNamingStrategy = intClass58;
        mongoProperties44.setFieldNamingStrategy(intClass58);
        mongoProperties39.fieldNamingStrategy = intClass58;
        boolean boolean62 = mongoClientOptions32.equals((java.lang.Object) intClass58);
        mongoProperties0.fieldNamingStrategy = intClass58;
        java.lang.String str64 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "mongodb://localhost/test" + "'", str30, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(socketFactory36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNotNull(intClass58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
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
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions28);
        com.mongodb.DBEncoderFactory dBEncoderFactory40 = mongoClientOptions28.getDbEncoderFactory();
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
        org.junit.Assert.assertNotNull(dBEncoderFactory40);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        java.lang.String str1 = java.lang.Integer.toBinaryString(3);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11" + "'", str1, "11");
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        int int2 = java.lang.Integer.rotateRight(16, 209715200);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        int int2 = java.lang.Integer.compare(256, 1090519040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry4 = mongoClientOptions1.getCodecRegistry();
        boolean boolean5 = mongoClientOptions1.isSslInvalidHostNameAllowed();
        int int6 = mongoClientOptions1.getLocalThreshold();
        boolean boolean7 = mongoClientOptions1.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(codecRegistry4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        java.lang.String str1 = java.lang.Integer.toBinaryString(110100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11010111000010100" + "'", str1, "11010111000010100");
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        int int2 = java.lang.Integer.sum(872415432, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 872415433 + "'", int2 == 872415433);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
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
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.localThreshold(127362560);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.connectionsPerHost(872415432);
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
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.maxWaitTime((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder0.socketTimeout((-1));
        com.mongodb.MongoClientOptions.Builder builder11 = builder0.requiredReplicaSetName("10c944");
        java.lang.Class<?> wildcardClass12 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1410560);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        int int1 = java.lang.Integer.lowestOneBit(37);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        int int2 = java.lang.Integer.compare(5242944, 1024);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        java.lang.String str1 = java.lang.Integer.toString(736557408);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "736557408" + "'", str1, "736557408");
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        int int1 = java.lang.Integer.highestOneBit(23564);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16384 + "'", int1 == 16384);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("1f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1f\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        int int2 = java.lang.Integer.divideUnsigned((-2147483648), 1073741830);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        int int2 = java.lang.Integer.rotateRight(110100, 525);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1889533965 + "'", int2 == 1889533965);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        int int2 = java.lang.Integer.compare(17459436, 131072);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("100010000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100010000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        int int2 = java.lang.Integer.min(110000, 1261534);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110000 + "'", int2 == 110000);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        int int1 = java.lang.Integer.highestOneBit(459);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
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
        java.lang.String str19 = mongoProperties0.username;
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        java.lang.String str2 = java.lang.Integer.toString(1073742086, 1200016507);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1073742086" + "'", str2, "1073742086");
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
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
        com.mongodb.event.CommandListener commandListener42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder43 = builder40.addCommandListener(commandListener42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("30", 111);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 111 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList10 = mongoClientOptions9.getCommandListeners();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(commandListenerList10);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        int int1 = java.lang.Integer.reverse((-1337982976));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 525 + "'", int1 == 525);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        mongoProperties0.setHost("141");
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties0.determinePort(environment10);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        int int2 = java.lang.Integer.rotateLeft(872415232, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 851968 + "'", int2 == 851968);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        int int1 = java.lang.Integer.highestOneBit(9765651);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8388608 + "'", int1 == 8388608);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.uri = "97";
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.username = "5000000";
        java.lang.String str10 = mongoProperties0.getHost();
        java.lang.Integer int11 = mongoProperties0.port;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97" + "'", str7, "97");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
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
        char[] charArray34 = mongoProperties0.getPassword();
        java.lang.String str35 = mongoProperties0.uri;
        mongoProperties0.authenticationDatabase = "1024";
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
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "mongodb://localhost/test" + "'", str35, "mongodb://localhost/test");
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.heartbeatSocketTimeout(8);
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        java.lang.String str13 = mongoClientOptions12.getDescription();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        int int15 = mongoClientOptions12.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder16 = com.mongodb.MongoClientOptions.builder(mongoClientOptions12);
        int int17 = mongoClientOptions12.getMinHeartbeatFrequency();
        org.bson.codecs.configuration.CodecRegistry codecRegistry18 = mongoClientOptions12.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder19 = builder5.codecRegistry(codecRegistry18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder5.heartbeatSocketTimeout(10000);
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList34 = mongoClientOptions32.getCommandListeners();
        java.lang.String str35 = mongoClientOptions32.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.heartbeatFrequency((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder39 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder39.build();
        int int41 = mongoClientOptions40.getHeartbeatConnectTimeout();
        int int42 = mongoClientOptions40.getConnectionsPerHost();
        org.bson.codecs.configuration.CodecRegistry codecRegistry43 = mongoClientOptions40.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.maxConnectionIdleTime(4);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int48 = mongoProperties47.port;
        com.mongodb.MongoClientOptions mongoClientOptions49 = null;
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties47.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder56 = builder52.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder60 = builder57.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder60.build();
        java.lang.String str64 = mongoClientOptions63.getDescription();
        int int65 = mongoClientOptions63.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str66 = mongoClientOptions63.getRequiredReplicaSetName();
        int int67 = mongoClientOptions63.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern68 = mongoClientOptions63.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder69 = builder52.readConcern(readConcern68);
        com.mongodb.MongoClientOptions.Builder builder70 = builder46.readConcern(readConcern68);
        com.mongodb.MongoClientOptions.Builder builder71 = builder36.readConcern(readConcern68);
        com.mongodb.MongoClientOptions.Builder builder72 = builder5.readConcern(readConcern68);
        com.mongodb.MongoClientOptions.Builder builder74 = builder5.sslInvalidHostNameAllowed(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertNotNull(codecRegistry18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(commandListenerList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(codecRegistry43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(int48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 5 + "'", int65 == 5);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10000 + "'", int67 == 10000);
        org.junit.Assert.assertNotNull(readConcern68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"f\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        boolean boolean4 = mongoClientOptions1.isSslEnabled();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions1.getDbEncoderFactory();
        int int6 = mongoClientOptions1.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str9 = mongoClientOptions6.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.setGridFsDatabase("hi!");
        java.lang.String str15 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray23 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties16.password = charArray23;
        java.lang.Class<java.lang.Integer> intClass25 = java.lang.Integer.TYPE;
        mongoProperties16.fieldNamingStrategy = intClass25;
        java.lang.String str27 = mongoProperties16.username;
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties16.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties16.builder(mongoClientOptions30);
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties16.builder(mongoClientOptions32);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.database;
        java.lang.String str36 = mongoProperties34.authenticationDatabase;
        java.lang.Integer int37 = mongoProperties34.port;
        java.lang.Class<java.lang.Integer> intClass38 = java.lang.Integer.TYPE;
        mongoProperties34.fieldNamingStrategy = intClass38;
        mongoProperties16.fieldNamingStrategy = intClass38;
        mongoProperties0.fieldNamingStrategy = intClass38;
        mongoProperties0.setGridFsDatabase("11010111000010100");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertNotNull(intClass38);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
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
        org.bson.codecs.configuration.CodecRegistry codecRegistry34 = mongoClientOptions25.getCodecRegistry();
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
        org.junit.Assert.assertNotNull(codecRegistry34);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1200000000);
        com.mongodb.event.CommandListener commandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.addCommandListener(commandListener13);
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
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
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
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties0.createMongoClient(mongoClientOptions30, environment35);
        java.lang.Integer int37 = mongoProperties0.port;
        int int38 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str39 = mongoProperties0.gridFsDatabase;
        int int40 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12" + "'", str19, "12");
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(commandListenerList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 27017 + "'", int38 == 27017);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 27017 + "'", int40 == 27017);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
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
        int int16 = mongoClientOptions12.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatFrequency(97);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        java.lang.Integer int1 = java.lang.Integer.getInteger("27017");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.socketTimeout((int) (short) -1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.sslInvalidHostNameAllowed(false);
        com.mongodb.event.CommandListener commandListener9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder2.addCommandListener(commandListener9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
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
        mongoProperties0.setPort((java.lang.Integer) 10060000);
        java.lang.String str34 = mongoProperties0.gridFsDatabase;
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("45155214203");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"45155214203\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(167772160);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "167772160" + "'", str1, "167772160");
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray30 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties23.password = charArray30;
        java.lang.String str32 = mongoProperties23.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str34 = mongoProperties33.database;
        java.lang.String str35 = mongoProperties33.authenticationDatabase;
        java.lang.Integer int36 = mongoProperties33.port;
        java.lang.Class<java.lang.Integer> intClass37 = java.lang.Integer.TYPE;
        mongoProperties33.fieldNamingStrategy = intClass37;
        mongoProperties23.setFieldNamingStrategy(intClass37);
        mongoProperties0.setFieldNamingStrategy(intClass37);
        boolean boolean41 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setDatabase("19");
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
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(intClass37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.Integer int4 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray12 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties5.password = charArray12;
        mongoProperties0.setPassword(charArray12);
        java.lang.String str15 = mongoProperties0.getUsername();
        mongoProperties0.uri = "1200000000";
        java.lang.Class<java.lang.Integer> intClass18 = null;
        mongoProperties0.fieldNamingStrategy = intClass18;
        mongoProperties0.setGridFsDatabase("100011100100000000000000000");
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        int int2 = java.lang.Integer.compareUnsigned(1889533965, 1920);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        int int2 = java.lang.Integer.rotateRight(2097152, 1610612992);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2097152 + "'", int2 == 2097152);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("2000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
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
        com.mongodb.WriteConcern writeConcern31 = mongoClientOptions27.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder33 = builder32.legacyDefaults();
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
        org.junit.Assert.assertNotNull(writeConcern31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        int int2 = java.lang.Integer.compareUnsigned(924209280, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
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
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.description("97");
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.socketKeepAlive(false);
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
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        int int2 = java.lang.Integer.remainderUnsigned(25, (-503054336));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatConnectTimeout((int) (byte) -1);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.socketKeepAlive(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
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
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions20);
        int int22 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions20.getMinHeartbeatFrequency();
        int int25 = mongoClientOptions20.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties0.builder(mongoClientOptions20);
        java.lang.Class<?> wildcardClass27 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 500 + "'", int24 == 500);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(wildcardClass27);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(268435456, (-1929379840));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "268435456" + "'", str2, "268435456");
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        long long1 = java.lang.Integer.toUnsignedLong(16384);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 16384L + "'", long1 == 16384L);
    }
}

