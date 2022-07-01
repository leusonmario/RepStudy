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
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean13 = mongoClientOptions11.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder15 = builder3.socketFactory(socketFactory14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder3.requiredReplicaSetName("4294967295");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder3.localThreshold((-129));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        int int1 = java.lang.Integer.lowestOneBit(16384);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16384 + "'", int1 == 16384);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder23 = builder15.minConnectionsPerHost(0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder25 = builder15.maxConnectionIdleTime((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        int int2 = java.lang.Integer.compare(69, 65368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.port;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int8 = mongoProperties7.getDEFAULT_PORT();
        mongoProperties7.setHost("hi!");
        mongoProperties7.host = "";
        mongoProperties7.username = "100";
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions18.getDbDecoderFactory();
        int int21 = mongoClientOptions18.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties7.builder(mongoClientOptions18);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.host;
        java.lang.String str25 = mongoProperties23.host;
        java.lang.Integer int26 = mongoProperties23.getPort();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        boolean boolean32 = mongoClientOptions30.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties23.builder(mongoClientOptions30);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties34.gridFsDatabase = "hi!";
        char[] charArray41 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties34.setPassword(charArray41);
        mongoProperties23.setPassword(charArray41);
        mongoProperties7.setPassword(charArray41);
        mongoProperties0.setPassword(charArray41);
        mongoProperties0.username = "23360430000";
        java.lang.String str48 = mongoProperties0.getHost();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        mongoProperties0.setPort((java.lang.Integer) 10000);
        java.lang.String str11 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "369098752";
        java.lang.String str14 = mongoProperties0.host;
        int int15 = mongoProperties0.getDEFAULT_PORT();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        boolean boolean20 = mongoClientOptions19.isAlwaysUseMBeans();
        int int21 = mongoClientOptions19.getLocalThreshold();
        int int22 = mongoClientOptions19.getSocketTimeout();
        javax.net.SocketFactory socketFactory23 = mongoClientOptions19.getSocketFactory();
        boolean boolean24 = mongoClientOptions19.isAlwaysUseMBeans();
        int int25 = mongoClientOptions19.getMaxConnectionIdleTime();
        org.springframework.core.env.Environment environment26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient27 = mongoProperties0.createMongoClient(mongoClientOptions19, environment26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(socketFactory23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        int int2 = java.lang.Integer.rotateRight(8388608, (-2078539520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8388608 + "'", int2 == 8388608);
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionLifeTime((-129));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("10001001101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10001001101\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        int int2 = java.lang.Integer.min(0, 301);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        mongoProperties0.port = 947912705;
        int int7 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.username = "14152";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("7340545", 2097152);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 2097152 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.heartbeatFrequency(4521984);
        java.lang.Class<?> wildcardClass22 = builder15.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.gridFsDatabase = "hi!";
        char[] charArray19 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties12.setPassword(charArray19);
        mongoProperties11.setPassword(charArray19);
        int int22 = mongoProperties11.getDEFAULT_PORT();
        java.lang.String str23 = mongoProperties11.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.host;
        java.lang.String str26 = mongoProperties24.host;
        java.lang.Integer int27 = mongoProperties24.getPort();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        boolean boolean33 = mongoClientOptions31.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties24.builder(mongoClientOptions31);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties35.gridFsDatabase = "hi!";
        char[] charArray42 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties35.setPassword(charArray42);
        mongoProperties24.setPassword(charArray42);
        mongoProperties11.setPassword(charArray42);
        mongoProperties0.password = charArray42;
        java.lang.Integer int47 = mongoProperties0.port;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, a, #, 4]");
        org.junit.Assert.assertNull(int47);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.description("26");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatThreadCount((-2094296184));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions11.getDbDecoderFactory();
        int int14 = mongoClientOptions11.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties17.gridFsDatabase = "hi!";
        char[] charArray24 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties17.setPassword(charArray24);
        mongoProperties16.setPassword(charArray24);
        mongoProperties0.password = charArray24;
        java.lang.Integer int28 = mongoProperties0.port;
        mongoProperties0.port = 369098778;
        mongoProperties0.setAuthenticationDatabase("a2fe130");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, a, #, 4]");
        org.junit.Assert.assertNull(int28);
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        int int1 = java.lang.Integer.numberOfLeadingZeros(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getAcceptableLatencyDifference();
        javax.net.SocketFactory socketFactory7 = mongoClientOptions3.getSocketFactory();
        int int8 = mongoClientOptions3.getSocketTimeout();
        java.lang.String str9 = mongoClientOptions3.getRequiredReplicaSetName();
        int int10 = mongoClientOptions3.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(socketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        int int2 = java.lang.Integer.remainderUnsigned(8, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        int int2 = java.lang.Integer.rotateRight(28, 16810040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7168 + "'", int2 == 7168);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        int int2 = java.lang.Integer.remainderUnsigned(64, 150994944);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference(1);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.localThreshold(35);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.description("11610");
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder36 = builder30.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder42 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.build();
        int int49 = mongoClientOptions48.getMaxConnectionLifeTime();
        int int50 = mongoClientOptions48.getMaxConnectionLifeTime();
        int int51 = mongoClientOptions48.getLocalThreshold();
        int int52 = mongoClientOptions48.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str53 = mongoClientOptions48.getRequiredReplicaSetName();
        int int54 = mongoClientOptions48.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference55 = mongoClientOptions48.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder56 = builder42.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder57 = builder29.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder58 = builder8.readPreference(readPreference55);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.description("1111111111111111111111111111111");
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.socketTimeout(1342177280);
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.cursorFinalizerEnabled(false);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5000 + "'", int54 == 5000);
        org.junit.Assert.assertNotNull(readPreference55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int8 = mongoClientOptions3.getLocalThreshold();
        int int9 = mongoClientOptions3.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        int int1 = java.lang.Integer.numberOfLeadingZeros(124911713);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        int int2 = java.lang.Integer.rotateLeft(1101011, 8388608);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1101011 + "'", int2 == 1101011);
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        int int1 = java.lang.Integer.highestOneBit(1101011);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1048576 + "'", int1 == 1048576);
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        int int2 = java.lang.Integer.remainderUnsigned(139, 107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "";
        java.lang.String str5 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions9.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(29);
        javax.net.SocketFactory socketFactory16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder17 = builder13.socketFactory(socketFactory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        int int2 = java.lang.Integer.rotateRight(1073741827, (-1346368000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741827 + "'", int2 == 1073741827);
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1100001101010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1100001101010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions9.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        com.mongodb.MongoClientOptions.Builder builder23 = builder18.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.host;
        mongoProperties24.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass28 = mongoProperties24.fieldNamingStrategy;
        mongoProperties24.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str32 = mongoProperties31.getUri();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        int int37 = mongoClientOptions36.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties31.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties24.builder(mongoClientOptions36);
        javax.net.SocketFactory socketFactory40 = mongoClientOptions36.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = builder23.socketFactory(socketFactory40);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        int int46 = mongoClientOptions45.getMaxConnectionLifeTime();
        int int47 = mongoClientOptions45.getMaxConnectionLifeTime();
        int int48 = mongoClientOptions45.getLocalThreshold();
        int int49 = mongoClientOptions45.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str50 = mongoClientOptions45.getRequiredReplicaSetName();
        int int51 = mongoClientOptions45.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference52 = mongoClientOptions45.getReadPreference();
        com.mongodb.WriteConcern writeConcern53 = mongoClientOptions45.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder54 = builder23.writeConcern(writeConcern53);
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.minHeartbeatFrequency(25);
        boolean boolean57 = mongoClientOptions9.equals((java.lang.Object) 25);
        int int58 = mongoClientOptions9.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory59 = mongoClientOptions9.getDbDecoderFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "mongodb://localhost/test" + "'", str32, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 15 + "'", int48 == 15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5000 + "'", int51 == 5000);
        org.junit.Assert.assertNotNull(readPreference52);
        org.junit.Assert.assertNotNull(writeConcern53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 5000 + "'", int58 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory59);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("10010000", 6144);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 6144 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.Integer int8 = mongoProperties0.getPort();
        java.lang.String str9 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean15 = mongoClientOptions13.equals((java.lang.Object) (-2147483648));
        int int16 = mongoClientOptions13.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions13.getDbDecoderFactory();
        int int18 = mongoClientOptions13.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions13);
        mongoProperties0.clearPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder10 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        com.mongodb.MongoClientOptions.Builder builder24 = builder19.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder19.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int30 = mongoProperties29.getDEFAULT_PORT();
        mongoProperties29.setHost("hi!");
        mongoProperties29.host = "";
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        java.lang.String str39 = mongoClientOptions38.toString();
        int int40 = mongoClientOptions38.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties29.builder(mongoClientOptions38);
        int int42 = mongoClientOptions38.getConnectTimeout();
        javax.net.SocketFactory socketFactory43 = mongoClientOptions38.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory44 = mongoClientOptions38.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder28.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder10.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder0.dbDecoderFactory(dBDecoderFactory44);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder49 = builder0.minHeartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27017 + "'", int30 == 27017);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10000 + "'", int42 == 10000);
        org.junit.Assert.assertNotNull(socketFactory43);
        org.junit.Assert.assertNotNull(dBDecoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getSocketTimeout();
        boolean boolean16 = mongoClientOptions9.isSocketKeepAlive();
        java.lang.String str17 = mongoClientOptions9.getDescription();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        int int22 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions21.getLocalThreshold();
        boolean boolean25 = mongoClientOptions21.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        javax.net.SocketFactory socketFactory27 = mongoClientOptions21.getSocketFactory();
        int int28 = mongoClientOptions21.getSocketTimeout();
        int int29 = mongoClientOptions21.getSocketTimeout();
        boolean boolean30 = mongoClientOptions9.equals((java.lang.Object) mongoClientOptions21);
        java.lang.Class<?> wildcardClass31 = mongoClientOptions9.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11i71" + "'", str7, "11i71");
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        int int2 = java.lang.Integer.rotateRight(11534336, 32768000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11534336 + "'", int2 == 11534336);
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        int int2 = java.lang.Integer.divideUnsigned(499100673, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17210368 + "'", int2 == 17210368);
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties0.getHost();
        java.lang.String str13 = mongoProperties0.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        mongoProperties14.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass18 = mongoProperties14.fieldNamingStrategy;
        mongoProperties14.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.getUri();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        int int27 = mongoClientOptions26.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties21.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties14.builder(mongoClientOptions26);
        int int30 = mongoClientOptions26.getConnectTimeout();
        int int31 = mongoClientOptions26.getConnectTimeout();
        int int32 = mongoClientOptions26.getConnectionsPerHost();
        int int33 = mongoClientOptions26.getMinHeartbeatFrequency();
        org.springframework.core.env.Environment environment34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient35 = mongoProperties0.createMongoClient(mongoClientOptions26, environment34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10000 + "'", int31 == 10000);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 500 + "'", int33 == 500);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.description("61");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxWaitTime(369098752);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder32 = builder28.heartbeatFrequency((-805306361));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUri("1100100");
        mongoProperties0.setUri("1");
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean15 = mongoClientOptions13.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory16 = mongoClientOptions13.getSocketFactory();
        boolean boolean17 = mongoClientOptions13.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions13);
        java.lang.String str19 = mongoClientOptions13.toString();
        int int20 = mongoClientOptions13.getConnectionsPerHost();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier(10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.connectionsPerHost(2200002);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold((-1306525534));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder4.maxAutoConnectRetryTime(0L);
        com.mongodb.MongoClientOptions.Builder builder18 = builder4.localThreshold(2147483647);
        com.mongodb.MongoClientOptions.Builder builder19 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout(144);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1071000000);
        java.lang.Class<?> wildcardClass24 = builder21.getClass();
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
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        int int2 = java.lang.Integer.compare(24, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        java.lang.String str1 = java.lang.Integer.toOctalString(10032);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23460" + "'", str1, "23460");
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.description("26");
        com.mongodb.MongoClientOptions.Builder builder23 = builder15.minHeartbeatFrequency(64);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime(4);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minHeartbeatFrequency(100663114);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatConnectRetryFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minHeartbeatFrequency(1024);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectionsPerHost(13);
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
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1111111111111111111111111111111", 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1111111111111111111111111111111\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxAutoConnectRetryTime((long) 97);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.threadsAllowedToBlockForConnectionMultiplier(100100034);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        java.lang.String str2 = java.lang.Integer.toString(100663296, (-2147363649));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100663296" + "'", str2, "100663296");
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(10000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(67108864);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder8.acceptableLatencyDifference((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acceptableLatencyDifference must be greater than or equal to 0");
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
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        java.lang.Integer int1 = java.lang.Integer.getInteger("49284096");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(1100001);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.heartbeatConnectTimeout(24);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatThreadCount(37289984);
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
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int7 = mongoProperties6.getDEFAULT_PORT();
        mongoProperties6.setHost("hi!");
        mongoProperties6.host = "";
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        java.lang.String str16 = mongoClientOptions15.toString();
        int int17 = mongoClientOptions15.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties6.builder(mongoClientOptions15);
        int int19 = mongoClientOptions15.getConnectTimeout();
        javax.net.SocketFactory socketFactory20 = mongoClientOptions15.getSocketFactory();
        boolean boolean21 = mongoClientOptions15.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.acceptableLatencyDifference(18);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxWaitTime(1359872);
        com.mongodb.MongoClientOptions.Builder builder29 = builder28.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.legacyDefaults();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        boolean boolean7 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions6.getDbDecoderFactory();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.connectionsPerHost(100663114);
        com.mongodb.MongoClientOptions.Builder builder15 = builder10.maxAutoConnectRetryTime((long) 48);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean13 = mongoClientOptions11.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder15 = builder3.socketFactory(socketFactory14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder3.requiredReplicaSetName("97");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxAutoConnectRetryTime((long) (-1879048192));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        java.lang.String str1 = java.lang.Integer.toOctalString(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11" + "'", str1, "11");
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        int int1 = java.lang.Integer.reverse(11010);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1087635456 + "'", int1 == 1087635456);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        int int1 = java.lang.Integer.reverse(262144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8192 + "'", int1 == 8192);
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1a", 1856);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1856 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder4.maxAutoConnectRetryTime(0L);
        com.mongodb.MongoClientOptions.Builder builder18 = builder4.localThreshold(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder20 = builder4.maxWaitTime((-2147363649));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
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
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        int int1 = java.lang.Integer.reverse(92274688);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 416 + "'", int1 == 416);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        int int2 = java.lang.Integer.min(0, 947912705);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        java.lang.String str12 = mongoClientOptions11.toString();
        int int13 = mongoClientOptions11.getHeartbeatFrequency();
        int int14 = mongoClientOptions11.getMinConnectionsPerHost();
        boolean boolean15 = mongoClientOptions11.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions11.getReadPreference();
        boolean boolean17 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minHeartbeatFrequency(44);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5000 + "'", int13 == 5000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1342177280 + "'", int14 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions3.getReadPreference();
        boolean boolean9 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions3.getDbEncoderFactory();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions3.getSocketFactory();
        boolean boolean12 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int13 = mongoClientOptions3.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        int int1 = java.lang.Integer.signum(120000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        int int1 = java.lang.Integer.reverseBytes(10032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 807862272 + "'", int1 == 807862272);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatThreadCount(100);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatThreadCount(637534208);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.cursorFinalizerEnabled(true);
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
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        int int1 = java.lang.Integer.bitCount(805306368);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory27 = mongoClientOptions21.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder11.dbDecoderFactory(dBDecoderFactory27);
        com.mongodb.MongoClientOptions.Builder builder30 = builder11.maxConnectionLifeTime(16777216);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(dBDecoderFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        long long1 = java.lang.Integer.toUnsignedLong(452984832);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 452984832L + "'", long1 == 452984832L);
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        int int1 = java.lang.Integer.numberOfLeadingZeros(327680000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        java.lang.Integer int1 = java.lang.Integer.getInteger("4e20");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        java.lang.String str9 = mongoProperties0.uri;
        boolean boolean10 = mongoProperties0.hasCustomAddress();
        char[] charArray11 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.host;
        mongoProperties12.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass16 = mongoProperties12.fieldNamingStrategy;
        mongoProperties12.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.getUri();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties19.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions24);
        boolean boolean28 = mongoClientOptions24.isAlwaysUseMBeans();
        int int29 = mongoClientOptions24.getHeartbeatConnectTimeout();
        int int30 = mongoClientOptions24.getHeartbeatSocketTimeout();
        int int31 = mongoClientOptions24.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions24);
        org.springframework.core.env.Environment environment33 = null;
        int int34 = mongoProperties0.determinePort(environment33);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-1811939327));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10010100000000000000000000000001" + "'", str1, "10010100000000000000000000000001");
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        mongoProperties0.port = 1342177280;
        java.lang.String str10 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.String str13 = mongoProperties0.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int15 = mongoProperties14.getDEFAULT_PORT();
        mongoProperties14.setHost("hi!");
        mongoProperties14.host = "";
        mongoProperties14.setPort((java.lang.Integer) 0);
        java.lang.String str22 = mongoProperties14.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties23.gridFsDatabase = "hi!";
        char[] charArray30 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties23.setPassword(charArray30);
        mongoProperties14.setPassword(charArray30);
        mongoProperties0.password = charArray30;
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\000, \000, \000, \000]");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        java.lang.Integer int1 = java.lang.Integer.getInteger("6");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10010100000000000000000000000001");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10010100000000000000000000000001");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("11i71");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11i71\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        int int2 = java.lang.Integer.remainderUnsigned(82595524, 420313426);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82595524 + "'", int2 == 82595524);
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder10 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        com.mongodb.MongoClientOptions.Builder builder24 = builder19.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder19.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int30 = mongoProperties29.getDEFAULT_PORT();
        mongoProperties29.setHost("hi!");
        mongoProperties29.host = "";
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        java.lang.String str39 = mongoClientOptions38.toString();
        int int40 = mongoClientOptions38.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties29.builder(mongoClientOptions38);
        int int42 = mongoClientOptions38.getConnectTimeout();
        javax.net.SocketFactory socketFactory43 = mongoClientOptions38.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory44 = mongoClientOptions38.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder28.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder10.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder0.dbDecoderFactory(dBDecoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minHeartbeatFrequency(916455424);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27017 + "'", int30 == 27017);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 20000 + "'", int40 == 20000);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10000 + "'", int42 == 10000);
        org.junit.Assert.assertNotNull(socketFactory43);
        org.junit.Assert.assertNotNull(dBDecoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        int int2 = java.lang.Integer.max((-161061274), (-2147363649));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-161061274) + "'", int2 == (-161061274));
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        int int2 = java.lang.Integer.min(0, 393216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        int int2 = java.lang.Integer.parseUnsignedInt("1000", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39304 + "'", int2 == 39304);
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("16000000000", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 16000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory15 = mongoClientOptions13.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory15);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.acceptableLatencyDifference(5);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatConnectRetryFrequency(524288000);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxWaitTime(1664);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.maxWaitTime(0);
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
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        int int2 = java.lang.Integer.min(0, 103872);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass26 = mongoProperties0.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str28 = mongoProperties27.host;
        java.lang.String str29 = mongoProperties27.host;
        java.lang.String str30 = mongoProperties27.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str32 = mongoProperties31.host;
        mongoProperties31.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass35 = mongoProperties31.fieldNamingStrategy;
        java.lang.String str36 = mongoProperties31.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.getUri();
        char[] charArray39 = new char[] {};
        mongoProperties37.setPassword(charArray39);
        mongoProperties31.setPassword(charArray39);
        mongoProperties27.setPassword(charArray39);
        mongoProperties0.password = charArray39;
        char[] charArray44 = mongoProperties0.password;
        java.lang.String str45 = mongoProperties0.host;
        java.lang.Integer int46 = mongoProperties0.getPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(wildcardClass35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[]");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(int46);
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties2 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str3 = mongoProperties2.host;
        java.lang.String str4 = mongoProperties2.host;
        java.lang.Integer int5 = mongoProperties2.getPort();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        boolean boolean11 = mongoClientOptions9.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties2.builder(mongoClientOptions9);
        boolean boolean13 = mongoClientOptions9.isSocketKeepAlive();
        int int14 = mongoClientOptions9.getLocalThreshold();
        int int15 = mongoClientOptions9.getLocalThreshold();
        int int16 = mongoClientOptions9.getMinHeartbeatFrequency();
        int int17 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions9);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionIdleTime(100011);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.host;
        mongoProperties21.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass25 = mongoProperties21.fieldNamingStrategy;
        java.lang.String str26 = mongoProperties21.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        com.mongodb.MongoClientOptions.Builder builder34 = builder29.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str36 = mongoProperties35.host;
        mongoProperties35.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass39 = mongoProperties35.fieldNamingStrategy;
        mongoProperties35.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.getUri();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        int int48 = mongoClientOptions47.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties42.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties35.builder(mongoClientOptions47);
        javax.net.SocketFactory socketFactory51 = mongoClientOptions47.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder52 = builder34.socketFactory(socketFactory51);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder52.build();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties21.builder(mongoClientOptions53);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str56 = mongoProperties55.host;
        org.springframework.core.env.Environment environment57 = null;
        int int58 = mongoProperties55.determinePort(environment57);
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        boolean boolean63 = mongoClientOptions62.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory64 = mongoClientOptions62.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties55.builder(mongoClientOptions62);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions69 = builder66.build();
        int int70 = mongoClientOptions69.getMaxConnectionLifeTime();
        int int71 = mongoClientOptions69.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder72 = mongoProperties55.builder(mongoClientOptions69);
        int int73 = mongoClientOptions69.getHeartbeatFrequency();
        boolean boolean74 = mongoClientOptions69.isCursorFinalizerEnabled();
        int int75 = mongoClientOptions69.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern76 = mongoClientOptions69.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder77 = builder54.writeConcern(writeConcern76);
        com.mongodb.MongoClientOptions.Builder builder78 = builder20.writeConcern(writeConcern76);
        com.mongodb.MongoClientOptions.Builder builder79 = builder20.legacyDefaults();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 500 + "'", int16 == 500);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "mongodb://localhost/test" + "'", str43, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(socketFactory51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 27017 + "'", int58 == 27017);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 5000 + "'", int73 == 5000);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1342177280 + "'", int75 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        int int2 = java.lang.Integer.min(6250, (-2093492383));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2093492383) + "'", int2 == (-2093492383));
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        java.lang.String str2 = java.lang.Integer.toString(117440720, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "117440720" + "'", str2, "117440720");
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder10.maxConnectionLifeTime((-2146433021));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        int int1 = java.lang.Integer.reverseBytes(452984832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxConnectionLifeTime(100663114);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder12.localThreshold((-2145648352));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
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
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.gridFsDatabase = "90";
        char[] charArray12 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        java.lang.String str1 = java.lang.Integer.toOctalString(578813952);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4240000000" + "'", str1, "4240000000");
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime(5);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatConnectTimeout(45);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.alwaysUseMBeans(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.lang.Integer int1 = java.lang.Integer.getInteger("37512700001");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.String str13 = mongoProperties0.getHost();
        mongoProperties0.setUri("4e20");
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions19.getMaxConnectionLifeTime();
        boolean boolean22 = mongoClientOptions19.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions19);
        java.lang.String str24 = mongoProperties0.gridFsDatabase;
        java.lang.String str25 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str26 = mongoProperties0.getUsername();
        java.lang.Integer int27 = mongoProperties0.getPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(int27);
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.setPort((java.lang.Integer) 27017);
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions15.getWriteConcern();
        int int19 = mongoClientOptions15.getMinHeartbeatFrequency();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.database = "37";
        mongoProperties0.database = "19";
        java.lang.String str12 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "19" + "'", str12, "19");
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) ' ', 11534336);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        int int2 = java.lang.Integer.sum(24, 10032);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10056 + "'", int2 == 10056);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        int int2 = java.lang.Integer.remainderUnsigned(1073741825, 105906176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14680065 + "'", int2 == 14680065);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("26214400", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 26214400");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11000000000000000000000000000", (-804206261));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -804206261 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        int int2 = java.lang.Integer.rotateLeft(16810040, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2143813376) + "'", int2 == (-2143813376));
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        int int2 = java.lang.Integer.remainderUnsigned(80803801, 24584435);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7050496 + "'", int2 == 7050496);
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("16777215", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder14 = builder9.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder18 = builder9.maxConnectionLifeTime(120000);
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) builder9);
        com.mongodb.MongoClientOptions.Builder builder21 = builder9.connectionsPerHost(120000);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime(20000);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder28 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxAutoConnectRetryTime((long) 6086926);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.autoConnectRetry(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        long long1 = java.lang.Integer.toUnsignedLong(1154027520);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1154027520L + "'", long1 == 1154027520L);
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectRetryFrequency(2147483647);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) 385875968);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        int int2 = java.lang.Integer.max(100, (-2146433021));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("10010100000000000000000000000001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10010100000000000000000000000001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.minConnectionsPerHost(262144);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.database = "1b";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(103872, 1610612736);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "103872" + "'", str2, "103872");
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        javax.net.SocketFactory socketFactory16 = mongoClientOptions12.getSocketFactory();
        int int17 = mongoClientOptions12.getHeartbeatConnectRetryFrequency();
        boolean boolean18 = mongoClientOptions12.isAutoConnectRetry();
        int int19 = mongoClientOptions12.getAcceptableLatencyDifference();
        java.lang.String str20 = mongoClientOptions12.getRequiredReplicaSetName();
        java.lang.String str21 = mongoClientOptions12.getDescription();
        java.lang.String str22 = mongoClientOptions12.toString();
        boolean boolean23 = mongoClientOptions12.isAlwaysUseMBeans();
        java.lang.String str24 = mongoClientOptions12.getRequiredReplicaSetName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        int int1 = java.lang.Integer.signum(109051904);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime(4);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minHeartbeatFrequency(100663114);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatConnectRetryFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean21 = mongoClientOptions20.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions20.getDbDecoderFactory();
        int int23 = mongoClientOptions20.getLocalThreshold();
        boolean boolean24 = mongoClientOptions20.isAlwaysUseMBeans();
        long long25 = mongoClientOptions20.getMaxAutoConnectRetryTime();
        boolean boolean26 = mongoClientOptions20.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory27 = mongoClientOptions20.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder16.dbEncoderFactory(dBEncoderFactory27);
        com.mongodb.MongoClientOptions.Builder builder30 = builder16.heartbeatFrequency(102886528);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(97);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference(327680000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout(10010000);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(301);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        java.lang.String str1 = java.lang.Integer.toHexString((-2094296184));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "832b9388" + "'", str1, "832b9388");
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        int int2 = java.lang.Integer.remainderUnsigned(452984832, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.setPort((java.lang.Integer) 27017);
        mongoProperties0.port = (-1140785152);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        int int24 = mongoClientOptions20.getMaxConnectionLifeTime();
        boolean boolean25 = mongoClientOptions20.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties0.builder(mongoClientOptions20);
        java.lang.String str27 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUsername("-1681772544");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "test" + "'", str27, "test");
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        boolean boolean7 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions6.getDbDecoderFactory();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        boolean boolean11 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern12 = mongoClientOptions6.getWriteConcern();
        int int13 = mongoClientOptions6.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions6.getWriteConcern();
        int int15 = mongoClientOptions6.getHeartbeatConnectRetryFrequency();
        int int16 = mongoClientOptions6.getSocketTimeout();
        int int17 = mongoClientOptions6.getHeartbeatThreadCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(writeConcern12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1176610106);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000110001000011010010100111010" + "'", str1, "1000110001000011010010100111010");
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        int int2 = java.lang.Integer.compareUnsigned(65368, (-1006632951));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        long long1 = java.lang.Integer.toUnsignedLong(10010000);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10010000L + "'", long1 == 10010000L);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder23 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        com.mongodb.MongoClientOptions.Builder builder37 = builder32.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder39 = builder32.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int43 = mongoProperties42.getDEFAULT_PORT();
        mongoProperties42.setHost("hi!");
        mongoProperties42.host = "";
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        java.lang.String str52 = mongoClientOptions51.toString();
        int int53 = mongoClientOptions51.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties42.builder(mongoClientOptions51);
        int int55 = mongoClientOptions51.getConnectTimeout();
        javax.net.SocketFactory socketFactory56 = mongoClientOptions51.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory57 = mongoClientOptions51.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder58 = builder41.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder59 = builder23.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder60 = builder13.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder61 = builder12.dbDecoderFactory(dBDecoderFactory57);
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.threadsAllowedToBlockForConnectionMultiplier(69);
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder67 = builder63.cursorFinalizerEnabled(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 27017 + "'", int43 == 27017);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 20000 + "'", int53 == 20000);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10000 + "'", int55 == 10000);
        org.junit.Assert.assertNotNull(socketFactory56);
        org.junit.Assert.assertNotNull(dBDecoderFactory57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions29.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder25.dbEncoderFactory(dBEncoderFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minHeartbeatFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.threadsAllowedToBlockForConnectionMultiplier(99);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder40 = builder36.minConnectionsPerHost((-2139080703));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1207959552);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1207959552" + "'", str1, "1207959552");
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        int int1 = java.lang.Integer.lowestOneBit(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("7340545", 170910000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 170910000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        int int1 = java.lang.Integer.reverse(150994944);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 144 + "'", int1 == 144);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        java.lang.String str2 = java.lang.Integer.toString(3, 376832);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3" + "'", str2, "3");
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        int int1 = java.lang.Integer.highestOneBit(144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions11.getDbDecoderFactory();
        int int14 = mongoClientOptions11.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties17.gridFsDatabase = "hi!";
        char[] charArray24 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties17.setPassword(charArray24);
        mongoProperties16.setPassword(charArray24);
        mongoProperties0.password = charArray24;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.host;
        mongoProperties28.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass32 = mongoProperties28.fieldNamingStrategy;
        java.lang.String str33 = mongoProperties28.getDatabase();
        java.lang.String str34 = mongoProperties28.getUsername();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        boolean boolean39 = mongoClientOptions38.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties41.gridFsDatabase = "hi!";
        char[] charArray48 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties41.setPassword(charArray48);
        mongoProperties40.setPassword(charArray48);
        boolean boolean51 = mongoClientOptions38.equals((java.lang.Object) mongoProperties40);
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties28.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties0.builder(mongoClientOptions38);
        boolean boolean54 = mongoClientOptions38.isAlwaysUseMBeans();
        int int55 = mongoClientOptions38.getHeartbeatConnectTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 20000 + "'", int55 == 20000);
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        int int2 = java.lang.Integer.rotateRight(1073741827, 16810012);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str10 = mongoProperties9.host;
        mongoProperties9.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass13 = mongoProperties9.fieldNamingStrategy;
        mongoProperties9.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.getUri();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        int int22 = mongoClientOptions21.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties16.builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties9.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions21.getWriteConcern();
        int int27 = mongoClientOptions21.getLocalThreshold();
        com.mongodb.ReadPreference readPreference28 = mongoClientOptions21.getReadPreference();
        long long29 = mongoClientOptions21.getMaxAutoConnectRetryTime();
        java.lang.String str30 = mongoClientOptions21.getRequiredReplicaSetName();
        java.lang.String str31 = mongoClientOptions21.getRequiredReplicaSetName();
        boolean boolean32 = mongoClientOptions3.equals((java.lang.Object) str31);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(writeConcern26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(readPreference28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.host;
        java.lang.String str9 = mongoProperties7.host;
        java.lang.Integer int10 = mongoProperties7.getPort();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties7.builder(mongoClientOptions14);
        boolean boolean18 = mongoClientOptions14.isSocketKeepAlive();
        int int19 = mongoClientOptions14.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties0.builder(mongoClientOptions14);
        int int21 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        int int22 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1342177280 + "'", int19 == 1342177280);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        int int1 = java.lang.Integer.numberOfLeadingZeros(22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(11010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11010" + "'", str1, "11010");
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder2.acceptableLatencyDifference((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder17 = builder2.heartbeatConnectTimeout((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        java.lang.String str1 = java.lang.Integer.toString((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        int int1 = java.lang.Integer.highestOneBit((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        int int1 = java.lang.Integer.lowestOneBit((-161061274));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.setHost("test");
        java.lang.String str14 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean20 = mongoClientOptions18.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions18);
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions18.getWriteConcern();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions18.getReadPreference();
        int int24 = mongoClientOptions18.getMinHeartbeatFrequency();
        int int25 = mongoClientOptions18.getMinHeartbeatFrequency();
        java.lang.String str26 = mongoClientOptions18.getRequiredReplicaSetName();
        int int27 = mongoClientOptions18.getSocketTimeout();
        javax.net.SocketFactory socketFactory28 = mongoClientOptions18.getSocketFactory();
        int int29 = mongoClientOptions18.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertNotNull(readPreference23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 500 + "'", int24 == 500);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 500 + "'", int25 == 500);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1100100000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1100100000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        boolean boolean7 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions6.getDbDecoderFactory();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        char[] charArray11 = mongoProperties0.password;
        java.lang.Integer int12 = mongoProperties0.port;
        java.lang.String str13 = mongoProperties0.uri;
        java.lang.String str14 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatSocketTimeout(74579968);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketTimeout(393216);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        java.lang.Integer int1 = java.lang.Integer.getInteger("a0000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        int int1 = java.lang.Integer.highestOneBit((-1306525696));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        int int12 = mongoClientOptions11.getMaxWaitTime();
        int int13 = mongoClientOptions11.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        mongoProperties0.setGridFsDatabase("10000000000000000000000100111000");
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("60000000", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 60000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder9.socketFactory(socketFactory26);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.connectionsPerHost(8402945);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.heartbeatThreadCount(107);
        com.mongodb.MongoClientOptions.Builder builder33 = builder27.threadsAllowedToBlockForConnectionMultiplier(3648);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxAutoConnectRetryTime((long) (-1681772544));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        boolean boolean18 = mongoProperties0.hasCustomAddress();
        java.lang.String str19 = mongoProperties0.username;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        int int1 = java.lang.Integer.numberOfTrailingZeros(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        mongoProperties0.setAuthenticationDatabase("1100100");
        java.lang.String str28 = mongoProperties0.authenticationDatabase;
        mongoProperties0.authenticationDatabase = "80803801";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1100100" + "'", str28, "1100100");
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.database = "3";
        java.lang.String str7 = mongoProperties0.getDatabase();
        java.lang.String str8 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3" + "'", str7, "3");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        int int2 = java.lang.Integer.divideUnsigned(149159936, 1717986912);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(11610);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions15.getMaxConnectionLifeTime();
        int int18 = mongoClientOptions15.getLocalThreshold();
        int int19 = mongoClientOptions15.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str20 = mongoClientOptions15.getRequiredReplicaSetName();
        int int21 = mongoClientOptions15.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions15.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder11.dbDecoderFactory(dBDecoderFactory22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxWaitTime(7340545);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.description("1100");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5000 + "'", int21 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("61", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 61");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        int int1 = java.lang.Integer.highestOneBit(103872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65536 + "'", int1 == 65536);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        int int2 = java.lang.Integer.remainderUnsigned(393216, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setPort((java.lang.Integer) 4);
        mongoProperties0.setUsername("90");
        java.lang.String str22 = mongoProperties0.uri;
        char[] charArray23 = mongoProperties0.password;
        char[] charArray24 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertNull(charArray24);
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("99", 469762048);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 469762048 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(26);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "26" + "'", str1, "26");
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("11001000011010111100101010010", 792740645);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 792740645 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.String str13 = mongoProperties0.getHost();
        mongoProperties0.setUri("4e20");
        char[] charArray22 = new char[] { ' ', '#', '4', '4', '4', ' ' };
        mongoProperties0.setPassword(charArray22);
        java.lang.String str24 = mongoProperties0.getUri();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), " #444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), " #444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[ , #, 4, 4, 4,  ]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "4e20" + "'", str24, "4e20");
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        int int1 = java.lang.Integer.signum(268435472);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) 5);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
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
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        int int1 = java.lang.Integer.highestOneBit(1744830464);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        int int2 = java.lang.Integer.remainderUnsigned(369098778, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 282 + "'", int2 == 282);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("6989", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean13 = mongoClientOptions11.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder15 = builder3.socketFactory(socketFactory14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionIdleTime(20480000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.host;
        java.lang.String str20 = mongoProperties18.host;
        mongoProperties18.setPort((java.lang.Integer) 0);
        mongoProperties18.setDatabase("1100001");
        java.lang.String str25 = mongoProperties18.username;
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        boolean boolean31 = mongoClientOptions29.isAutoConnectRetry();
        javax.net.SocketFactory socketFactory32 = mongoClientOptions29.getSocketFactory();
        int int33 = mongoClientOptions29.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties18.builder(mongoClientOptions29);
        com.mongodb.ReadPreference readPreference35 = mongoClientOptions29.getReadPreference();
        com.mongodb.ReadPreference readPreference36 = mongoClientOptions29.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder37 = builder15.readPreference(readPreference36);
        com.mongodb.MongoClientOptions.Builder builder39 = builder15.connectionsPerHost(268435456);
        com.mongodb.MongoClientOptions.Builder builder41 = builder15.localThreshold(37289984);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.connectTimeout(16384);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(readPreference35);
        org.junit.Assert.assertNotNull(readPreference36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        boolean boolean7 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions6.getDbDecoderFactory();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.connectionsPerHost(100663114);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionLifeTime(18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        int int1 = java.lang.Integer.lowestOneBit(469763033);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("20000011610");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 20000011610");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        int int2 = java.lang.Integer.sum(100663296, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100663296 + "'", int2 == 100663296);
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getUri();
        mongoProperties0.host = "1c";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        int int2 = java.lang.Integer.sum(1100001, 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17877217 + "'", int2 == 17877217);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        int int1 = java.lang.Integer.numberOfTrailingZeros(17210368);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1100101");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int11 = mongoProperties10.getDEFAULT_PORT();
        mongoProperties10.setHost("hi!");
        mongoProperties10.host = "";
        mongoProperties10.setPort((java.lang.Integer) 0);
        java.lang.String str18 = mongoProperties10.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties19.gridFsDatabase = "hi!";
        char[] charArray26 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties19.setPassword(charArray26);
        mongoProperties10.setPassword(charArray26);
        mongoProperties0.password = charArray26;
        java.lang.String str30 = mongoProperties0.database;
        mongoProperties0.setUsername("c43d9");
        mongoProperties0.setGridFsDatabase("10c8e1");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        int int2 = java.lang.Integer.divideUnsigned(109051904, 29364232);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        int int1 = java.lang.Integer.reverseBytes(803801);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-649917440) + "'", int1 == (-649917440));
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(44, 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2e" + "'", str2, "2e");
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.socketTimeout(2147483647);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.requiredReplicaSetName("3");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(31);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(499100673);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) 478150657);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        int int1 = java.lang.Integer.lowestOneBit((-2094296184));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        int int2 = java.lang.Integer.sum(4, 16777215);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16777219 + "'", int2 == 16777219);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int7 = mongoProperties6.getDEFAULT_PORT();
        mongoProperties6.setHost("hi!");
        mongoProperties6.host = "";
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties6.builder(mongoClientOptions17);
        java.lang.String str19 = mongoProperties6.getHost();
        mongoProperties6.setUri("4e20");
        char[] charArray28 = new char[] { ' ', '#', '4', '4', '4', ' ' };
        mongoProperties6.setPassword(charArray28);
        mongoProperties0.password = charArray28;
        java.lang.String str31 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setDatabase("61");
        java.lang.String str34 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " #444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " #444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , #, 4, 4, 4,  ]");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("m1w");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"m1w\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.getPort();
        char[] charArray7 = mongoProperties0.password;
        mongoProperties0.setDatabase("100");
        mongoProperties0.setHost("2684354568");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        java.lang.String str1 = java.lang.Integer.toHexString(469763033);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1c0003d9" + "'", str1, "1c0003d9");
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions3.isAutoConnectRetry();
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        int int8 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        int int2 = java.lang.Integer.compare(301, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.database = "3";
        mongoProperties0.uri = "";
        mongoProperties0.username = "149159936";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        long long1 = java.lang.Integer.toUnsignedLong(162);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 162L + "'", long1 == 162L);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties5.builder(mongoClientOptions14);
        int int18 = mongoClientOptions14.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.String str20 = mongoProperties0.getUsername();
        java.lang.String str21 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        org.springframework.core.env.Environment environment23 = null;
        com.mongodb.MongoClient mongoClient24 = mongoProperties0.createMongoClient(mongoClientOptions22, environment23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(mongoClient24);
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        int int1 = java.lang.Integer.reverse(524288);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4096 + "'", int1 == 4096);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        int int1 = java.lang.Integer.numberOfLeadingZeros(452984852);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        javax.net.SocketFactory socketFactory16 = mongoClientOptions12.getSocketFactory();
        int int17 = mongoClientOptions12.getHeartbeatConnectRetryFrequency();
        boolean boolean18 = mongoClientOptions12.isAutoConnectRetry();
        int int19 = mongoClientOptions12.getAcceptableLatencyDifference();
        java.lang.String str20 = mongoClientOptions12.getRequiredReplicaSetName();
        int int21 = mongoClientOptions12.getMaxConnectionLifeTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("12000000000", (-2147480000));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147480000 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        java.lang.String str1 = java.lang.Integer.toHexString(268435456);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000" + "'", str1, "10000000");
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        mongoProperties12.username = "100";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean24 = mongoClientOptions23.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions23);
        com.mongodb.WriteConcern writeConcern29 = mongoClientOptions23.getWriteConcern();
        int int30 = mongoClientOptions23.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern31 = mongoClientOptions23.getWriteConcern();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(writeConcern29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 120000 + "'", int30 == 120000);
        org.junit.Assert.assertNotNull(writeConcern31);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.lang.String str1 = java.lang.Integer.toString(11610);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11610" + "'", str1, "11610");
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("5ce10e");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"5ce10e\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("11000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11000000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1744830464);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1744830464" + "'", str1, "1744830464");
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(985, (-2147483336));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "985" + "'", str2, "985");
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (-2147483648));
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions14.getWriteConcern();
        int int18 = mongoClientOptions14.getHeartbeatConnectRetryFrequency();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        java.lang.String str1 = java.lang.Integer.toOctalString(369098752);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2600000000" + "'", str1, "2600000000");
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.setPort((java.lang.Integer) 4);
        mongoProperties0.setUsername("90");
        java.lang.String str22 = mongoProperties0.uri;
        mongoProperties0.uri = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.threadsAllowedToBlockForConnectionMultiplier(105);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.cursorFinalizerEnabled(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int20 = mongoProperties19.getDEFAULT_PORT();
        mongoProperties19.setHost("hi!");
        mongoProperties19.host = "";
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        java.lang.String str29 = mongoClientOptions28.toString();
        int int30 = mongoClientOptions28.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties19.builder(mongoClientOptions28);
        int int32 = mongoClientOptions28.getConnectTimeout();
        javax.net.SocketFactory socketFactory33 = mongoClientOptions28.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder16.socketFactory(socketFactory33);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27017 + "'", int20 == 27017);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10000 + "'", int32 == 10000);
        org.junit.Assert.assertNotNull(socketFactory33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.maxAutoConnectRetryTime((long) 44);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketTimeout(107);
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
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        int int2 = java.lang.Integer.compare(99, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        int int21 = mongoClientOptions18.getMaxConnectionIdleTime();
        int int22 = mongoClientOptions18.getMinHeartbeatFrequency();
        boolean boolean23 = mongoClientOptions18.isAlwaysUseMBeans();
        boolean boolean24 = mongoClientOptions18.isAlwaysUseMBeans();
        boolean boolean25 = mongoClientOptions18.isCursorFinalizerEnabled();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient26 = mongoProperties0.createMongoClient(mongoClientOptions18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        int int2 = java.lang.Integer.sum(6086926, 805306368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 811393294 + "'", int2 == 811393294);
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        int int2 = java.lang.Integer.compareUnsigned(24, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        int int1 = java.lang.Integer.highestOneBit(68);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        java.lang.String str2 = java.lang.Integer.toString(811393294, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "811393294" + "'", str2, "811393294");
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.String str13 = mongoProperties0.getHost();
        mongoProperties0.setUri("4e20");
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions19.getMaxConnectionLifeTime();
        boolean boolean22 = mongoClientOptions19.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions19);
        java.lang.String str24 = mongoProperties0.gridFsDatabase;
        java.lang.String str25 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str26 = mongoProperties0.getUsername();
        java.lang.String str27 = mongoProperties0.getUsername();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        java.lang.String str8 = mongoClientOptions7.toString();
        int int9 = mongoClientOptions7.getMaxWaitTime();
        int int10 = mongoClientOptions7.getConnectionsPerHost();
        int int11 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int12 = mongoClientOptions7.getMaxConnectionIdleTime();
        com.mongodb.ReadPreference readPreference13 = mongoClientOptions7.getReadPreference();
        org.springframework.core.env.Environment environment14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient15 = mongoProperties0.createMongoClient(mongoClientOptions7, environment14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(readPreference13);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        java.lang.String str1 = java.lang.Integer.toString(7341045);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7341045" + "'", str1, "7341045");
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        int int1 = java.lang.Integer.reverse(58376);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 270991360 + "'", int1 == 270991360);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions10.getLocalThreshold();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = builder6.socketFactory(socketFactory16);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder17.build();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions18.getWriteConcern();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(writeConcern19);
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.socketTimeout(2147483647);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.requiredReplicaSetName("3");
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(53182464);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.acceptableLatencyDifference(536870912);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("16");
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatFrequency(16810012);
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
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.String str8 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str10 = mongoProperties9.host;
        java.lang.String str11 = mongoProperties9.host;
        java.lang.Integer int12 = mongoProperties9.getPort();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean18 = mongoClientOptions16.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties9.builder(mongoClientOptions16);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties20.gridFsDatabase = "hi!";
        char[] charArray27 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties20.setPassword(charArray27);
        mongoProperties9.setPassword(charArray27);
        mongoProperties0.password = charArray27;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, a, #, 4]");
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        int int2 = java.lang.Integer.divideUnsigned(0, (-2145648384));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) 5);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.maxWaitTime(1100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.getUri();
        char[] charArray8 = new char[] {};
        mongoProperties6.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        mongoProperties0.setGridFsDatabase("7fffffff");
        char[] charArray13 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.threadsAllowedToBlockForConnectionMultiplier(10000);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.minConnectionsPerHost(67108864);
        java.lang.Class<?> wildcardClass27 = builder26.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass27;
        java.lang.String str29 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[]");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "7fffffff" + "'", str29, "7fffffff");
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        int int1 = java.lang.Integer.lowestOneBit(6144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2048 + "'", int1 == 2048);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectionsPerHost((-2147478648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
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
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        int int1 = java.lang.Integer.reverseBytes(1073741828);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108928 + "'", int1 == 67108928);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass5);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        int int1 = java.lang.Integer.parseInt("100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        int int2 = java.lang.Integer.max(478150657, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 478150657 + "'", int2 == 478150657);
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.lang.String str1 = java.lang.Integer.toString(1879048193);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1879048193" + "'", str1, "1879048193");
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        java.lang.String str9 = mongoProperties0.uri;
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketKeepAlive(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties15.gridFsDatabase = "hi!";
        char[] charArray22 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties15.setPassword(charArray22);
        mongoProperties14.setPassword(charArray22);
        java.lang.String str25 = mongoProperties14.getHost();
        mongoProperties14.setHost("test");
        java.lang.String str28 = mongoProperties14.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        boolean boolean34 = mongoClientOptions32.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties14.builder(mongoClientOptions32);
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions32.getWriteConcern();
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions32.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder38 = builder13.readPreference(readPreference37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder13.heartbeatFrequency(536870912);
        com.mongodb.MongoClientOptions.Builder builder42 = builder13.autoConnectRetry(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(writeConcern36);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        boolean boolean7 = mongoClientOptions3.isAutoConnectRetry();
        int int8 = mongoClientOptions3.getMaxWaitTime();
        int int9 = mongoClientOptions3.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 120000 + "'", int8 == 120000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1342177280 + "'", int9 == 1342177280);
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("20004004002");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20004004002\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("300000000", 2097152);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 2097152 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        int int16 = mongoClientOptions12.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions12.getWriteConcern();
        int int18 = mongoClientOptions12.getLocalThreshold();
        com.mongodb.ReadPreference readPreference19 = mongoClientOptions12.getReadPreference();
        long long20 = mongoClientOptions12.getMaxAutoConnectRetryTime();
        java.lang.String str21 = mongoClientOptions12.getRequiredReplicaSetName();
        int int22 = mongoClientOptions12.getMinHeartbeatFrequency();
        boolean boolean23 = mongoClientOptions12.isSocketKeepAlive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(readPreference19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        java.lang.String str1 = java.lang.Integer.toBinaryString(45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101101" + "'", str1, "101101");
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(469763033, 1174410104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "469763033" + "'", str2, "469763033");
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        javax.net.SocketFactory socketFactory9 = mongoClientOptions3.getSocketFactory();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int11 = mongoClientOptions3.getHeartbeatConnectTimeout();
        boolean boolean12 = mongoClientOptions3.isSocketKeepAlive();
        int int13 = mongoClientOptions3.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.String str16 = mongoProperties0.getHost();
        mongoProperties0.setPort((java.lang.Integer) 25);
        mongoProperties0.host = "11000100000000000000000000001001";
        char[] charArray21 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(charArray21);
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        int int1 = java.lang.Integer.lowestOneBit(1359872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16384 + "'", int1 == 16384);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        int int2 = java.lang.Integer.rotateLeft(1140850688, 16810040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4456448 + "'", int2 == 4456448);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUri("8");
        mongoProperties0.uri = "2162000001";
        mongoProperties0.host = "536870912";
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatFrequency();
        int int17 = mongoClientOptions14.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions14.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions14);
        int int20 = mongoClientOptions14.getHeartbeatConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5000 + "'", int16 == 5000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        boolean boolean11 = mongoClientOptions7.isSocketKeepAlive();
        int int12 = mongoClientOptions7.getLocalThreshold();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions7.getSocketFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(socketFactory13);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        java.lang.Integer int1 = java.lang.Integer.getInteger("33554432");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("-2147478648", 1071000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal leading minus sign on unsigned string -2147478648.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        int int2 = java.lang.Integer.remainderUnsigned(11010, 4521984);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11010 + "'", int2 == 11010);
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(1100001);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.minConnectionsPerHost(132);
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.requiredReplicaSetName("27017");
        java.lang.Class<?> wildcardClass21 = builder14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        java.lang.String str2 = java.lang.Integer.toString(132, 420313426);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "132" + "'", str2, "132");
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        long long1 = java.lang.Integer.toUnsignedLong(1100100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1100100L + "'", long1 == 1100100L);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.description("61");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.connectionsPerHost(500);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.autoConnectRetry(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("20004004002", 268435456);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 268435456 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectTimeout(35);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions19.getLocalThreshold();
        int int23 = mongoClientOptions19.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions19.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder14.dbEncoderFactory(dBEncoderFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        int int33 = mongoClientOptions32.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions32.getMaxConnectionLifeTime();
        int int35 = mongoClientOptions32.getLocalThreshold();
        boolean boolean36 = mongoClientOptions32.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory37 = mongoClientOptions32.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder38 = builder26.socketFactory(socketFactory37);
        com.mongodb.MongoClientOptions.Builder builder39 = builder14.socketFactory(socketFactory37);
        com.mongodb.MongoClientOptions.Builder builder41 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder43 = builder14.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(socketFactory37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        com.mongodb.MongoClientOptions.Builder builder14 = builder9.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder18 = builder9.maxConnectionLifeTime(120000);
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) builder9);
        com.mongodb.MongoClientOptions.Builder builder21 = builder9.connectionsPerHost(120000);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxConnectionLifeTime(20000);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder28 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxAutoConnectRetryTime((long) 6086926);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder32 = builder28.connectTimeout((-2147480000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.host;
        mongoProperties7.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass11 = mongoProperties7.fieldNamingStrategy;
        mongoProperties7.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.getUri();
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties14.builder(mongoClientOptions19);
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties7.builder(mongoClientOptions19);
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions19.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions19);
        char[] charArray25 = mongoProperties0.password;
        java.lang.String str26 = mongoProperties0.getHost();
        java.lang.Integer int27 = mongoProperties0.getPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1100001" + "'", str26, "1100001");
        org.junit.Assert.assertNull(int27);
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        int int1 = java.lang.Integer.parseUnsignedInt("4764");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4764 + "'", int1 == 4764);
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setUri("22");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int10 = mongoProperties9.getDEFAULT_PORT();
        mongoProperties9.setHost("hi!");
        mongoProperties9.host = "";
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        java.lang.String str19 = mongoClientOptions18.toString();
        int int20 = mongoClientOptions18.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties9.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        int int23 = mongoClientOptions18.getHeartbeatSocketTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.getUri();
        char[] charArray26 = mongoProperties24.password;
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        boolean boolean31 = mongoClientOptions30.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory32 = mongoClientOptions30.getDbDecoderFactory();
        int int33 = mongoClientOptions30.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties24.builder(mongoClientOptions30);
        java.lang.String str35 = mongoProperties24.database;
        boolean boolean36 = mongoClientOptions18.equals((java.lang.Object) str35);
        java.lang.String str37 = mongoClientOptions18.getDescription();
        int int38 = mongoClientOptions18.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties0.builder(mongoClientOptions18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongodb://localhost/test" + "'", str25, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        mongoProperties0.setAuthenticationDatabase("1100100");
        java.lang.String str28 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "8";
        java.lang.String str31 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int33 = mongoProperties32.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int35 = mongoProperties34.getDEFAULT_PORT();
        mongoProperties34.setHost("hi!");
        mongoProperties34.host = "";
        mongoProperties34.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties43.gridFsDatabase = "hi!";
        char[] charArray50 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties43.setPassword(charArray50);
        mongoProperties42.setPassword(charArray50);
        mongoProperties34.setPassword(charArray50);
        mongoProperties32.password = charArray50;
        mongoProperties0.password = charArray50;
        mongoProperties0.authenticationDatabase = "20000";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1100100" + "'", str28, "1100100");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27017 + "'", int33 == 27017);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 27017 + "'", int35 == 27017);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[a, a, #, 4]");
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(805306368);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "805306368" + "'", str1, "805306368");
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("7fffffff");
        boolean boolean9 = mongoProperties0.hasCustomCredentials();
        java.lang.Integer int10 = mongoProperties0.port;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        int int1 = java.lang.Integer.reverse(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        int int1 = java.lang.Integer.parseInt("99");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMinConnectionsPerHost();
        int int7 = mongoClientOptions5.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "20";
        mongoProperties0.setUri("20004004002");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        java.lang.String str5 = mongoClientOptions3.getDescription();
        long long6 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        java.lang.String str7 = mongoClientOptions3.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.database = "27017";
        java.lang.String str6 = mongoProperties0.database;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "27017" + "'", str6, "27017");
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        int int1 = java.lang.Integer.bitCount((-1577058304));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("21004600200", 162);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 162 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        long long1 = java.lang.Integer.toUnsignedLong((-804206261));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3490761035L + "'", long1 == 3490761035L);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "1100001";
        mongoProperties0.uri = "101";
        mongoProperties0.uri = "-1610612736";
        java.lang.String str15 = mongoProperties0.authenticationDatabase;
        java.lang.String str16 = mongoProperties0.getHost();
        boolean boolean17 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "-2146433022";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        java.lang.String str3 = mongoProperties0.getDatabase();
        java.lang.Integer int4 = mongoProperties0.port;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.heartbeatConnectTimeout(16777216);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.threadsAllowedToBlockForConnectionMultiplier(1664);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.host;
        mongoProperties11.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass15 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.getUri();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties18.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties11.builder(mongoClientOptions23);
        int int27 = mongoClientOptions23.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern28 = mongoClientOptions23.getWriteConcern();
        int int29 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.WriteConcern writeConcern30 = mongoClientOptions23.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder31 = builder0.writeConcern(writeConcern30);
        com.mongodb.MongoClientOptions.Builder builder32 = builder31.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertNotNull(writeConcern28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertNotNull(writeConcern30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions5.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean10 = mongoClientOptions5.isSocketKeepAlive();
        int int11 = mongoClientOptions5.getHeartbeatSocketTimeout();
        int int12 = mongoClientOptions5.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.getUri();
        char[] charArray10 = mongoProperties8.password;
        char[] charArray11 = mongoProperties8.password;
        char[] charArray12 = mongoProperties8.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        mongoProperties13.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.getUri();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties20.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties13.builder(mongoClientOptions25);
        int int29 = mongoClientOptions25.getConnectTimeout();
        int int30 = mongoClientOptions25.getConnectTimeout();
        int int31 = mongoClientOptions25.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties8.builder(mongoClientOptions25);
        java.lang.String str33 = mongoClientOptions25.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions25);
        mongoProperties0.setGridFsDatabase("478150657");
        java.lang.String str37 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("94000001");
        java.lang.String str40 = mongoProperties0.getDatabase();
        java.lang.String str41 = mongoProperties0.gridFsDatabase;
        java.lang.String str42 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1100001" + "'", str40, "1100001");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "94000001" + "'", str41, "94000001");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1100001" + "'", str42, "1100001");
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAlwaysUseMBeans();
        int int9 = mongoClientOptions7.getLocalThreshold();
        int int10 = mongoClientOptions7.getSocketTimeout();
        int int11 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions7);
        java.lang.String str13 = mongoProperties0.getHost();
        mongoProperties0.database = "128";
        java.lang.String str16 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean21 = mongoClientOptions20.isAlwaysUseMBeans();
        int int22 = mongoClientOptions20.getLocalThreshold();
        long long23 = mongoClientOptions20.getMaxAutoConnectRetryTime();
        int int24 = mongoClientOptions20.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder31 = builder25.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        int int44 = mongoClientOptions43.getMaxConnectionLifeTime();
        int int45 = mongoClientOptions43.getMaxConnectionLifeTime();
        int int46 = mongoClientOptions43.getLocalThreshold();
        int int47 = mongoClientOptions43.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str48 = mongoClientOptions43.getRequiredReplicaSetName();
        int int49 = mongoClientOptions43.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference50 = mongoClientOptions43.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder51 = builder37.readPreference(readPreference50);
        boolean boolean52 = mongoClientOptions20.equals((java.lang.Object) readPreference50);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient53 = mongoProperties0.createMongoClient(mongoClientOptions20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "128" + "'", str16, "128");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5000 + "'", int49 == 5000);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions3.isAutoConnectRetry();
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern8 = mongoClientOptions3.getWriteConcern();
        boolean boolean9 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions3.getDbEncoderFactory();
        java.lang.String str11 = mongoClientOptions3.getRequiredReplicaSetName();
        int int12 = mongoClientOptions3.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(writeConcern8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        mongoProperties12.username = "100";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean24 = mongoClientOptions23.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions23);
        java.lang.Class<?> wildcardClass29 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.core.env.Environment environment30 = null;
        int int31 = mongoProperties0.determinePort(environment30);
        java.lang.String str32 = mongoProperties0.username;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 27017 + "'", int31 == 27017);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "100" + "'", str32, "100");
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "1100001";
        mongoProperties0.uri = "101";
        mongoProperties0.uri = "-1610612736";
        java.lang.String str15 = mongoProperties0.host;
        java.lang.String str16 = mongoProperties0.getUsername();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(socketFactory6);
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("600000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 600000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        int int1 = java.lang.Integer.parseInt("11");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties5.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int9 = mongoProperties8.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int11 = mongoProperties10.getDEFAULT_PORT();
        mongoProperties10.setHost("hi!");
        mongoProperties10.host = "";
        mongoProperties10.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties19.gridFsDatabase = "hi!";
        char[] charArray26 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties19.setPassword(charArray26);
        mongoProperties18.setPassword(charArray26);
        mongoProperties10.setPassword(charArray26);
        mongoProperties8.password = charArray26;
        mongoProperties5.password = charArray26;
        mongoProperties0.setPassword(charArray26);
        java.lang.String str33 = mongoProperties0.database;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("10000000000000000000000100111000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000000100111000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        int int1 = java.lang.Integer.parseInt("22");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        int int2 = java.lang.Integer.parseUnsignedInt("27017", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2947841 + "'", int2 == 2947841);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        int int16 = mongoClientOptions12.getLocalThreshold();
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = mongoClientOptions12.getDbEncoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory17);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("65536", (-2147483336));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147483336 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions10.getLocalThreshold();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        boolean boolean23 = mongoClientOptions21.equals((java.lang.Object) (-2147483648));
        com.mongodb.ReadPreference readPreference24 = mongoClientOptions21.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder25 = builder17.readPreference(readPreference24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.toString();
        int int31 = mongoClientOptions29.getHeartbeatFrequency();
        int int32 = mongoClientOptions29.getMinConnectionsPerHost();
        boolean boolean33 = mongoClientOptions29.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference34 = mongoClientOptions29.getReadPreference();
        boolean boolean35 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder39 = builder38.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder43 = builder39.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.minConnectionsPerHost(11610);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        int int52 = mongoClientOptions51.getMaxConnectionLifeTime();
        int int53 = mongoClientOptions51.getMaxConnectionLifeTime();
        int int54 = mongoClientOptions51.getLocalThreshold();
        int int55 = mongoClientOptions51.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str56 = mongoClientOptions51.getRequiredReplicaSetName();
        int int57 = mongoClientOptions51.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory58 = mongoClientOptions51.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder47.dbDecoderFactory(dBDecoderFactory58);
        boolean boolean60 = mongoClientOptions29.equals((java.lang.Object) dBDecoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder61 = builder17.dbDecoderFactory(dBDecoderFactory58);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(readPreference24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5000 + "'", int31 == 5000);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1342177280 + "'", int32 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(readPreference34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 15 + "'", int54 == 15);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5000 + "'", int57 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder8 = builder7.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean18 = mongoClientOptions16.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory19 = mongoClientOptions16.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder8.socketFactory(socketFactory19);
        com.mongodb.MongoClientOptions.Builder builder21 = builder0.socketFactory(socketFactory19);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder25 = builder24.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean35 = mongoClientOptions33.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory36 = mongoClientOptions33.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder37 = builder25.socketFactory(socketFactory36);
        com.mongodb.MongoClientOptions.Builder builder38 = builder0.socketFactory(socketFactory36);
        com.mongodb.MongoClientOptions.Builder builder40 = builder0.description("16");
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.heartbeatConnectTimeout(872415232);
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.heartbeatConnectTimeout(105);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(socketFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(socketFactory36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        int int1 = java.lang.Integer.signum(17877217);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("13", 298319873);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 298319873 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        int int2 = java.lang.Integer.compare(298319873, 524288000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        int int2 = java.lang.Integer.sum(7, 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16777223 + "'", int2 == 16777223);
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(18, (-1577058304));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "18" + "'", str2, "18");
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.heartbeatSocketTimeout(32768000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        java.lang.Integer int1 = java.lang.Integer.getInteger("-2147483648");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.acceptableLatencyDifference(5);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectionsPerHost((-1140523008));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
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
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        int int2 = java.lang.Integer.divideUnsigned((int) '#', 6086926);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxConnectionIdleTime(402653184);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder9.socketFactory(socketFactory26);
        com.mongodb.MongoClientOptions.Builder builder29 = builder9.minConnectionsPerHost((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder33 = builder29.cursorFinalizerEnabled(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        int int16 = mongoClientOptions9.getConnectionsPerHost();
        java.lang.String str17 = mongoClientOptions9.getRequiredReplicaSetName();
        boolean boolean18 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int19 = mongoClientOptions9.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        java.lang.String str10 = mongoClientOptions9.toString();
        int int11 = mongoClientOptions9.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions9);
        int int13 = mongoClientOptions9.getConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions9.getSocketFactory();
        int int15 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        int int16 = mongoClientOptions9.getConnectionsPerHost();
        java.lang.String str17 = mongoClientOptions9.getRequiredReplicaSetName();
        boolean boolean18 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int19 = mongoClientOptions9.getAcceptableLatencyDifference();
        int int20 = mongoClientOptions9.getConnectionsPerHost();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "1100001";
        mongoProperties0.uri = "101";
        mongoProperties0.uri = "-1610612736";
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions18.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory21 = mongoClientOptions18.getSocketFactory();
        int int22 = mongoClientOptions18.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions18);
        java.lang.String str24 = mongoProperties0.getGridFsDatabase();
        java.lang.String str25 = mongoProperties0.database;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertNotNull(socketFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        int int18 = mongoClientOptions14.getHeartbeatFrequency();
        int int19 = mongoClientOptions14.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5000 + "'", int18 == 5000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        java.lang.String str2 = java.lang.Integer.toString(14680065, 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "frnpf" + "'", str2, "frnpf");
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        int int2 = java.lang.Integer.compareUnsigned((-2012020736), 327680000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("109051904", (-1033373947));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1033373947 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        int int2 = java.lang.Integer.compare((-1306525696), (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.uri = "7fffffff";
        java.lang.String str10 = mongoProperties0.authenticationDatabase;
        mongoProperties0.username = "";
        mongoProperties0.setGridFsDatabase("6");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        java.lang.String str9 = mongoProperties0.uri;
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions10.getLocalThreshold();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions10.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        boolean boolean23 = mongoClientOptions21.equals((java.lang.Object) (-2147483648));
        com.mongodb.ReadPreference readPreference24 = mongoClientOptions21.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder25 = builder17.readPreference(readPreference24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder30 = builder26.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder32 = builder26.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        int int45 = mongoClientOptions44.getMaxConnectionLifeTime();
        int int46 = mongoClientOptions44.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference47 = mongoClientOptions44.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory48 = mongoClientOptions44.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder49 = builder38.dbDecoderFactory(dBDecoderFactory48);
        com.mongodb.MongoClientOptions.Builder builder51 = builder38.heartbeatThreadCount(8402945);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int53 = mongoProperties52.getDEFAULT_PORT();
        mongoProperties52.setHost("hi!");
        mongoProperties52.host = "";
        com.mongodb.MongoClientOptions.Builder builder58 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions61 = builder58.build();
        java.lang.String str62 = mongoClientOptions61.toString();
        int int63 = mongoClientOptions61.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties52.builder(mongoClientOptions61);
        int int65 = mongoClientOptions61.getConnectTimeout();
        int int66 = mongoClientOptions61.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory67 = mongoClientOptions61.getDbEncoderFactory();
        java.lang.String str68 = mongoClientOptions61.getDescription();
        com.mongodb.WriteConcern writeConcern69 = mongoClientOptions61.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory70 = mongoClientOptions61.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder71 = builder38.dbEncoderFactory(dBEncoderFactory70);
        com.mongodb.MongoClientOptions.Builder builder72 = builder17.dbEncoderFactory(dBEncoderFactory70);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(readPreference24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 500 + "'", int46 == 500);
        org.junit.Assert.assertNotNull(readPreference47);
        org.junit.Assert.assertNotNull(dBDecoderFactory48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 27017 + "'", int53 == 27017);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(mongoClientOptions61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20000 + "'", int63 == 20000);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10000 + "'", int65 == 10000);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 120000 + "'", int66 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNotNull(writeConcern69);
        org.junit.Assert.assertNotNull(dBEncoderFactory70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getUri();
        char[] charArray8 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.socketTimeout(2147483647);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.requiredReplicaSetName("3");
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(53182464);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.acceptableLatencyDifference(536870912);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int12 = mongoProperties11.getDEFAULT_PORT();
        mongoProperties11.setHost("hi!");
        mongoProperties11.host = "";
        mongoProperties11.username = "100";
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        boolean boolean23 = mongoClientOptions22.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions22.getDbDecoderFactory();
        int int25 = mongoClientOptions22.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties11.builder(mongoClientOptions22);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties28.gridFsDatabase = "hi!";
        char[] charArray35 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties28.setPassword(charArray35);
        mongoProperties27.setPassword(charArray35);
        mongoProperties11.password = charArray35;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.host;
        mongoProperties39.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass43 = mongoProperties39.fieldNamingStrategy;
        java.lang.String str44 = mongoProperties39.getDatabase();
        java.lang.String str45 = mongoProperties39.getUsername();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        boolean boolean50 = mongoClientOptions49.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties52.gridFsDatabase = "hi!";
        char[] charArray59 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties52.setPassword(charArray59);
        mongoProperties51.setPassword(charArray59);
        boolean boolean62 = mongoClientOptions49.equals((java.lang.Object) mongoProperties51);
        com.mongodb.MongoClientOptions.Builder builder63 = mongoProperties39.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties11.builder(mongoClientOptions49);
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder67 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder67.build();
        int int71 = mongoClientOptions70.getMaxConnectionLifeTime();
        int int72 = mongoClientOptions70.getMaxConnectionLifeTime();
        int int73 = mongoClientOptions70.getLocalThreshold();
        int int74 = mongoClientOptions70.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str75 = mongoClientOptions70.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern76 = mongoClientOptions70.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder77 = builder64.writeConcern(writeConcern76);
        com.mongodb.MongoClientOptions.Builder builder78 = builder2.writeConcern(writeConcern76);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(wildcardClass43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 15 + "'", int73 == 15);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5 + "'", int74 == 5);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(writeConcern76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        java.lang.String str1 = java.lang.Integer.toOctalString(45);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "55" + "'", str1, "55");
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.getHost();
        mongoProperties0.setGridFsDatabase("test");
        mongoProperties0.database = "105";
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.host;
        mongoProperties12.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass16 = mongoProperties12.fieldNamingStrategy;
        mongoProperties12.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.getUri();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties19.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions24);
        mongoProperties0.gridFsDatabase = "-2012020608";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        java.lang.String str7 = mongoProperties0.username;
        java.lang.String str8 = mongoProperties0.database;
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.getUri();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties10.builder(mongoClientOptions15);
        int int18 = mongoClientOptions15.getMaxConnectionIdleTime();
        int int19 = mongoClientOptions15.getMinHeartbeatFrequency();
        int int20 = mongoClientOptions15.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions15);
        java.lang.String str22 = mongoClientOptions15.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions15.getWriteConcern();
        int int24 = mongoClientOptions15.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        java.lang.String str1 = java.lang.Integer.toHexString((-1577058304));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a2000000" + "'", str1, "a2000000");
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        int int1 = java.lang.Integer.lowestOneBit(90);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        int int1 = java.lang.Integer.signum(3648);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        int int1 = java.lang.Integer.reverse(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 536870912 + "'", int1 == 536870912);
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.uri = "2162000001";
        mongoProperties0.clearPassword();
        mongoProperties0.setUri("25");
        java.lang.Class<?> wildcardClass17 = mongoProperties0.getFieldNamingStrategy();
        boolean boolean18 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        int int29 = mongoClientOptions28.getMaxConnectionLifeTime();
        long long30 = mongoClientOptions28.getMaxAutoConnectRetryTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory31 = mongoClientOptions28.getDbEncoderFactory();
        int int32 = mongoClientOptions28.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.autoConnectRetry(true);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(dBEncoderFactory31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10000 + "'", int32 == 10000);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        int int1 = java.lang.Integer.signum(376832);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.maxAutoConnectRetryTime((long) 44);
        com.mongodb.MongoClientOptions.Builder builder15 = builder7.cursorFinalizerEnabled(true);
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
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("300000000", 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 132 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("33", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 33");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        int int2 = java.lang.Integer.compareUnsigned(1073741827, 805306368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("a2fe130");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a2fe130\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        int int1 = java.lang.Integer.parseUnsignedInt("90");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 90 + "'", int1 == 90);
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        boolean boolean10 = mongoClientOptions3.isSocketKeepAlive();
        int int11 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int7 = mongoProperties6.getDEFAULT_PORT();
        mongoProperties6.setHost("hi!");
        mongoProperties6.host = "";
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties6.builder(mongoClientOptions17);
        java.lang.String str19 = mongoProperties6.getHost();
        mongoProperties6.setUri("4e20");
        char[] charArray28 = new char[] { ' ', '#', '4', '4', '4', ' ' };
        mongoProperties6.setPassword(charArray28);
        mongoProperties0.password = charArray28;
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        java.lang.String str35 = mongoClientOptions34.toString();
        int int36 = mongoClientOptions34.getHeartbeatFrequency();
        int int37 = mongoClientOptions34.getMinConnectionsPerHost();
        boolean boolean38 = mongoClientOptions34.isAlwaysUseMBeans();
        boolean boolean39 = mongoClientOptions34.isAlwaysUseMBeans();
        boolean boolean40 = mongoClientOptions34.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties0.builder(mongoClientOptions34);
        com.mongodb.WriteConcern writeConcern42 = mongoClientOptions34.getWriteConcern();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " #444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " #444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , #, 4, 4, 4,  ]");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5000 + "'", int36 == 5000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1342177280 + "'", int37 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(writeConcern42);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        mongoProperties0.setHost("499100673");
        mongoProperties0.gridFsDatabase = "2e";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1176610106);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1176610106" + "'", str1, "1176610106");
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        int int1 = java.lang.Integer.highestOneBit((-804206261));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        int int2 = java.lang.Integer.divideUnsigned(436207638, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18965549 + "'", int2 == 18965549);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        int int2 = java.lang.Integer.compareUnsigned(0, 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        int int1 = java.lang.Integer.reverseBytes(122879488);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16667143 + "'", int1 == 16667143);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        java.lang.String str2 = java.lang.Integer.toString(16384, 44);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16384" + "'", str2, "16384");
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1388", 1087635456);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1087635456 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.heartbeatConnectTimeout(1140850688);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatSocketTimeout(4);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.threadsAllowedToBlockForConnectionMultiplier(8402945);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        com.mongodb.WriteConcern writeConcern8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder6.writeConcern(writeConcern8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        boolean boolean7 = mongoClientOptions6.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions6.getDbDecoderFactory();
        int int9 = mongoClientOptions6.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions6);
        char[] charArray11 = mongoProperties0.password;
        java.lang.Integer int12 = mongoProperties0.port;
        mongoProperties0.setDatabase("4000000");
        mongoProperties0.setUsername("21004600200");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        int int2 = java.lang.Integer.rotateRight(94000001, (-2145648383));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2100483648) + "'", int2 == (-2100483648));
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        java.lang.String str2 = java.lang.Integer.toString(49284096, 101);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "49284096" + "'", str2, "49284096");
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        boolean boolean11 = mongoClientOptions3.isCursorFinalizerEnabled();
        java.lang.String str12 = mongoClientOptions3.toString();
        int int13 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions3.isAutoConnectRetry();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        int int7 = mongoClientOptions3.getHeartbeatThreadCount();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int9 = mongoProperties8.getDEFAULT_PORT();
        mongoProperties8.setHost("hi!");
        mongoProperties8.host = "";
        mongoProperties8.setPort((java.lang.Integer) 0);
        java.lang.String str16 = mongoProperties8.getAuthenticationDatabase();
        java.lang.String str17 = mongoProperties8.getHost();
        int int18 = mongoProperties8.getDEFAULT_PORT();
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) mongoProperties8);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        int int1 = java.lang.Integer.bitCount(1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        int int2 = java.lang.Integer.min(12, (-1140785152));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1140785152) + "'", int2 == (-1140785152));
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        int int7 = mongoClientOptions3.getConnectionsPerHost();
        int int8 = mongoClientOptions3.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions3.getDbDecoderFactory();
        boolean boolean10 = mongoClientOptions3.isAutoConnectRetry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties15.builder(mongoClientOptions20);
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties8.builder(mongoClientOptions20);
        javax.net.SocketFactory socketFactory24 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxAutoConnectRetryTime((long) 500);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.threadsAllowedToBlockForConnectionMultiplier(65368);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(150994944);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "150994944" + "'", str1, "150994944");
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        int int1 = java.lang.Integer.numberOfLeadingZeros(420313426);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("11000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11000000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        int int1 = java.lang.Integer.signum(1610612736);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("3103274522", 1342177280);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1342177280 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        int int10 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int11 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int12 = mongoClientOptions3.getHeartbeatThreadCount();
        int int13 = mongoClientOptions3.getHeartbeatSocketTimeout();
        java.lang.String str14 = mongoClientOptions3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.getUri();
        char[] charArray8 = new char[] {};
        mongoProperties6.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        char[] charArray12 = mongoProperties0.password;
        org.springframework.core.env.Environment environment13 = null;
        int int14 = mongoProperties0.determinePort(environment13);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        int int1 = java.lang.Integer.bitCount(37289984);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-2078539520));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        int int2 = java.lang.Integer.compare(9, 1856);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        int int2 = java.lang.Integer.rotateLeft(92274688, 11010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 369098752 + "'", int2 == 369098752);
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        mongoProperties0.setUri("hi!");
        mongoProperties0.clearPassword();
        java.lang.String str10 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int14 = mongoProperties13.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int16 = mongoProperties15.getDEFAULT_PORT();
        mongoProperties15.setHost("hi!");
        mongoProperties15.host = "";
        mongoProperties15.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties24.gridFsDatabase = "hi!";
        char[] charArray31 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties24.setPassword(charArray31);
        mongoProperties23.setPassword(charArray31);
        mongoProperties15.setPassword(charArray31);
        mongoProperties13.password = charArray31;
        mongoProperties0.password = charArray31;
        java.lang.String str37 = mongoProperties0.host;
        boolean boolean38 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setPort((java.lang.Integer) 637534208);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        int int2 = java.lang.Integer.rotateRight(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        int int16 = mongoClientOptions12.getConnectTimeout();
        int int17 = mongoClientOptions12.getConnectTimeout();
        int int18 = mongoClientOptions12.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions12.getWriteConcern();
        long long20 = mongoClientOptions12.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatThreadCount((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxWaitTime(0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold((-2147478648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency(1100001);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions20.getLocalThreshold();
        int int24 = mongoClientOptions20.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str25 = mongoClientOptions20.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions20.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder27 = builder14.writeConcern(writeConcern26);
        com.mongodb.MongoClientOptions.Builder builder29 = builder14.maxAutoConnectRetryTime((long) 7);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(writeConcern26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties8.determinePort(environment10);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        boolean boolean16 = mongoClientOptions15.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions15.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties8.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        int int23 = mongoClientOptions22.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions22.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties8.builder(mongoClientOptions22);
        int int26 = mongoClientOptions22.getHeartbeatFrequency();
        boolean boolean27 = mongoClientOptions22.isCursorFinalizerEnabled();
        com.mongodb.ReadPreference readPreference28 = mongoClientOptions22.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder29 = builder7.readPreference(readPreference28);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.getUri();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        int int36 = mongoClientOptions35.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties30.builder(mongoClientOptions35);
        int int38 = mongoClientOptions35.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions35.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder29.dbEncoderFactory(dBEncoderFactory39);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5000 + "'", int26 == 5000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(readPreference28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        long long1 = java.lang.Integer.toUnsignedLong(1677721600);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1677721600L + "'", long1 == 1677721600L);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        int int10 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        int int1 = java.lang.Integer.signum((-2138682786));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        int int2 = java.lang.Integer.sum(110111100, 10032);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110121132 + "'", int2 == 110121132);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        int int2 = java.lang.Integer.compare(3, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setDatabase("17777777777");
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1100001" + "'", str9, "1100001");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(16);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.autoConnectRetry(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder20 = builder18.threadsAllowedToBlockForConnectionMultiplier((-804206261));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
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
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions14.getLocalThreshold();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str19 = mongoClientOptions14.getRequiredReplicaSetName();
        int int20 = mongoClientOptions14.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions14.getDbDecoderFactory();
        int int22 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean23 = mongoClientOptions14.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        int int35 = mongoClientOptions34.getMaxConnectionLifeTime();
        int int36 = mongoClientOptions34.getMaxConnectionLifeTime();
        java.lang.String str37 = mongoClientOptions34.getRequiredReplicaSetName();
        java.lang.String str38 = mongoClientOptions34.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties0.builder(mongoClientOptions34);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5000 + "'", int20 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        int int2 = java.lang.Integer.rotateLeft(10, 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 640 + "'", int2 == 640);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        long long1 = java.lang.Integer.toUnsignedLong((-2147363649));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147603647L + "'", long1 == 2147603647L);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        boolean boolean10 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int11 = mongoClientOptions9.getMaxConnectionIdleTime();
        int int12 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1100001 + "'", int12 == 1100001);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        mongoProperties0.username = "m1w";
        mongoProperties0.setUsername("-2146433022");
        mongoProperties0.username = "176";
        java.lang.String str11 = mongoProperties0.database;
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        int int2 = java.lang.Integer.min(9, 111);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        int int1 = java.lang.Integer.lowestOneBit(17210368);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1024 + "'", int1 == 1024);
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.toString();
        int int23 = mongoClientOptions21.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties12.builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getConnectTimeout();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions21.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder9.socketFactory(socketFactory26);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.connectionsPerHost(8402945);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxConnectionIdleTime(11);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder33 = builder29.minConnectionsPerHost((-2094296184));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatThreadCount(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.host;
        mongoProperties15.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass19 = mongoProperties15.fieldNamingStrategy;
        mongoProperties15.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.getUri();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties22.builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties15.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern32 = mongoClientOptions27.getWriteConcern();
        int int33 = mongoClientOptions27.getLocalThreshold();
        com.mongodb.ReadPreference readPreference34 = mongoClientOptions27.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder35 = builder14.readPreference(readPreference34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "mongodb://localhost/test" + "'", str23, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(writeConcern32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertNotNull(readPreference34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.getDatabase();
        mongoProperties0.port = 16777216;
        int int12 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str13 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(32, 1100100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        int int2 = java.lang.Integer.sum(0, 74579968);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74579968 + "'", int2 == 74579968);
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        char[] charArray4 = mongoProperties0.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.host;
        mongoProperties5.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties5.fieldNamingStrategy;
        mongoProperties5.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties5.builder(mongoClientOptions17);
        int int21 = mongoClientOptions17.getConnectTimeout();
        int int22 = mongoClientOptions17.getConnectTimeout();
        int int23 = mongoClientOptions17.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        char[] charArray25 = mongoProperties0.password;
        java.lang.Class<?> wildcardClass26 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.gridFsDatabase = "-1610612736";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(wildcardClass26);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean13 = mongoClientOptions11.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder15 = builder3.socketFactory(socketFactory14);
        com.mongodb.MongoClientOptions.Builder builder17 = builder3.socketTimeout(25);
        com.mongodb.MongoClientOptions.Builder builder19 = builder3.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder3.heartbeatSocketTimeout(102886528);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        java.lang.String str1 = java.lang.Integer.toOctalString(10010000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "46136620" + "'", str1, "46136620");
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        int int2 = java.lang.Integer.rotateRight(92274688, 4521984);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92274688 + "'", int2 == 92274688);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        java.lang.String str2 = java.lang.Integer.toString(1664, 14680065);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1664" + "'", str2, "1664");
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        int int1 = java.lang.Integer.signum(1359872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(58376, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "58376" + "'", str2, "58376");
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        char[] charArray13 = mongoProperties0.password;
        mongoProperties0.setPort((java.lang.Integer) (-47480831));
        java.lang.String str16 = mongoProperties0.host;
        java.lang.String str17 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int19 = mongoProperties18.getDEFAULT_PORT();
        mongoProperties18.setHost("hi!");
        mongoProperties18.host = "";
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        java.lang.String str28 = mongoClientOptions27.toString();
        int int29 = mongoClientOptions27.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties18.builder(mongoClientOptions27);
        int int31 = mongoClientOptions27.getConnectTimeout();
        javax.net.SocketFactory socketFactory32 = mongoClientOptions27.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory33 = mongoClientOptions27.getDbDecoderFactory();
        int int34 = mongoClientOptions27.getHeartbeatThreadCount();
        int int35 = mongoClientOptions27.getAcceptableLatencyDifference();
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions27.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory37 = mongoClientOptions27.getDbEncoderFactory();
        int int38 = mongoClientOptions27.getSocketTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient39 = mongoProperties0.createMongoClient(mongoClientOptions27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10000 + "'", int31 == 10000);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertNotNull(dBDecoderFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertNotNull(writeConcern36);
        org.junit.Assert.assertNotNull(dBEncoderFactory37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        int int2 = java.lang.Integer.divideUnsigned(7341045, 124911713);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions3.getReadPreference();
        boolean boolean9 = mongoClientOptions3.isAutoConnectRetry();
        int int10 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        int int2 = java.lang.Integer.rotateRight((int) ' ', 6144);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "";
        java.lang.String str5 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions9.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions9);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int15 = mongoProperties14.getDEFAULT_PORT();
        mongoProperties14.setHost("hi!");
        java.lang.String str18 = mongoProperties14.getUri();
        mongoProperties14.port = 20000;
        char[] charArray21 = null;
        mongoProperties14.setPassword(charArray21);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int24 = mongoProperties23.getDEFAULT_PORT();
        mongoProperties23.setHost("hi!");
        mongoProperties23.host = "";
        mongoProperties23.username = "100";
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        boolean boolean35 = mongoClientOptions34.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory36 = mongoClientOptions34.getDbDecoderFactory();
        int int37 = mongoClientOptions34.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties23.builder(mongoClientOptions34);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties40.gridFsDatabase = "hi!";
        char[] charArray47 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties40.setPassword(charArray47);
        mongoProperties39.setPassword(charArray47);
        mongoProperties23.password = charArray47;
        mongoProperties14.setPassword(charArray47);
        mongoProperties0.password = charArray47;
        java.lang.String str53 = mongoProperties0.username;
        java.lang.Class<?> wildcardClass54 = mongoProperties0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27017 + "'", int24 == 27017);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        mongoProperties0.setAuthenticationDatabase("100");
        mongoProperties0.uri = "mongodb://localhost/test";
        mongoProperties0.setAuthenticationDatabase("1111111111111111111111111111111");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        int int2 = java.lang.Integer.divideUnsigned(637534208, 1610612736);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        long long1 = java.lang.Integer.toUnsignedLong(1073741824);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1073741824L + "'", long1 == 1073741824L);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        java.lang.String str1 = java.lang.Integer.toString(2947841);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2947841" + "'", str1, "2947841");
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1610547200));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        int int23 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions18);
        java.lang.String str25 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.toString();
        int int31 = mongoClientOptions29.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions29);
        boolean boolean33 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.gridFsDatabase = "7fffffff";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str37 = mongoProperties36.host;
        org.springframework.core.env.Environment environment38 = null;
        int int39 = mongoProperties36.determinePort(environment38);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean44 = mongoClientOptions43.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions43.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties36.builder(mongoClientOptions43);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        int int51 = mongoClientOptions50.getMaxConnectionLifeTime();
        int int52 = mongoClientOptions50.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties36.builder(mongoClientOptions50);
        int int54 = mongoClientOptions50.getHeartbeatFrequency();
        boolean boolean55 = mongoClientOptions50.isCursorFinalizerEnabled();
        int int56 = mongoClientOptions50.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern57 = mongoClientOptions50.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties0.builder(mongoClientOptions50);
        mongoProperties0.gridFsDatabase = "-1610612736";
        java.lang.String str61 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 120000 + "'", int31 == 120000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27017 + "'", int39 == 27017);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5000 + "'", int54 == 5000);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1342177280 + "'", int56 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNull(str61);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        int int2 = java.lang.Integer.divideUnsigned(478150657, 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16487953 + "'", int2 == 16487953);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        int int1 = java.lang.Integer.numberOfLeadingZeros(107374182);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.clearPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        int int1 = java.lang.Integer.bitCount(1717986912);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        int int2 = java.lang.Integer.min((-1879048157), 65571);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1879048157) + "'", int2 == (-1879048157));
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        int int2 = java.lang.Integer.compareUnsigned(10000, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        int int2 = java.lang.Integer.divideUnsigned((int) (byte) 10, 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-2145648352));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        java.lang.String str1 = java.lang.Integer.toString(8192);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8192" + "'", str1, "8192");
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        int int1 = java.lang.Integer.lowestOneBit(500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        int int2 = java.lang.Integer.min((-1), 393216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder14 = mongoProperties7.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.connectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.description("26");
        com.mongodb.MongoClientOptions.Builder builder23 = builder15.maxConnectionLifeTime(1157627904);
        com.mongodb.MongoClientOptions.Builder builder25 = builder15.heartbeatConnectTimeout(2097152);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("7fffffff");
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        java.lang.String str10 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int12 = mongoProperties11.getDEFAULT_PORT();
        mongoProperties11.setHost("hi!");
        mongoProperties11.host = "";
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        java.lang.String str21 = mongoClientOptions20.toString();
        int int22 = mongoClientOptions20.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties11.builder(mongoClientOptions20);
        int int24 = mongoClientOptions20.getConnectTimeout();
        javax.net.SocketFactory socketFactory25 = mongoClientOptions20.getSocketFactory();
        int int26 = mongoClientOptions20.getSocketTimeout();
        boolean boolean27 = mongoClientOptions20.isSocketKeepAlive();
        java.lang.String str28 = mongoClientOptions20.getDescription();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        int int33 = mongoClientOptions32.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions32.getMaxConnectionLifeTime();
        int int35 = mongoClientOptions32.getLocalThreshold();
        boolean boolean36 = mongoClientOptions32.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory37 = mongoClientOptions32.getSocketFactory();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions32.getSocketFactory();
        int int39 = mongoClientOptions32.getSocketTimeout();
        int int40 = mongoClientOptions32.getSocketTimeout();
        boolean boolean41 = mongoClientOptions20.equals((java.lang.Object) mongoClientOptions32);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient42 = mongoProperties0.createMongoClient(mongoClientOptions32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7fffffff" + "'", str9, "7fffffff");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10000 + "'", int24 == 10000);
        org.junit.Assert.assertNotNull(socketFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(socketFactory37);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        int int2 = java.lang.Integer.compareUnsigned(805306368, 2200002);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(24584435, 27017);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "24584435" + "'", str2, "24584435");
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        java.lang.String str9 = mongoClientOptions3.getDescription();
        com.mongodb.WriteConcern writeConcern10 = mongoClientOptions3.getWriteConcern();
        java.lang.String str11 = mongoClientOptions3.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(writeConcern10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions3.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions3.getDbDecoderFactory();
        java.lang.String str12 = mongoClientOptions3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        java.lang.String str2 = java.lang.Integer.toString(17210368, 16777215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "17210368" + "'", str2, "17210368");
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        int int7 = mongoClientOptions3.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5000 + "'", int7 == 5000);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "637534208";
        mongoProperties0.setGridFsDatabase("jh000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        java.lang.String str1 = java.lang.Integer.toBinaryString(29);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11101" + "'", str1, "11101");
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        int int1 = java.lang.Integer.parseUnsignedInt("99");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectTimeout(803801);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        com.mongodb.MongoClientOptions.Builder builder16 = builder13.heartbeatSocketTimeout(640);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("16000000", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 16000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str9 = mongoProperties0.database;
        mongoProperties0.setGridFsDatabase("10000000001");
        java.lang.String str12 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        org.springframework.core.env.Environment environment13 = null;
        int int14 = mongoProperties0.determinePort(environment13);
        java.lang.String str15 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setHost("4294967167");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        int int1 = java.lang.Integer.parseInt("256");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.port;
        mongoProperties0.authenticationDatabase = "61";
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str8 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("17777777777", 82595524);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 82595524 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("2149318912", 132);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 132 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern8 = mongoClientOptions3.getWriteConcern();
        long long9 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        java.lang.String str11 = mongoClientOptions3.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(writeConcern8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        int int1 = java.lang.Integer.bitCount(128);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder2.heartbeatConnectRetryFrequency(24);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder31 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        boolean boolean41 = mongoClientOptions39.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory42 = mongoClientOptions39.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder43 = builder31.socketFactory(socketFactory42);
        com.mongodb.MongoClientOptions.Builder builder44 = builder23.socketFactory(socketFactory42);
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder48 = builder47.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder52 = builder48.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.build();
        boolean boolean58 = mongoClientOptions56.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory59 = mongoClientOptions56.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder60 = builder48.socketFactory(socketFactory59);
        com.mongodb.MongoClientOptions.Builder builder61 = builder23.socketFactory(socketFactory59);
        com.mongodb.MongoClientOptions.Builder builder62 = builder22.socketFactory(socketFactory59);
        com.mongodb.MongoClientOptions.Builder builder63 = builder13.socketFactory(socketFactory59);
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.maxAutoConnectRetryTime((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder67 = builder65.connectionsPerHost((-1140523008));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(socketFactory42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(socketFactory59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1a", 117440720);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 117440720 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        mongoProperties0.port = 1342177280;
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties0.determinePort(environment10);
        int int12 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1342177280 + "'", int11 == 1342177280);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference10 = mongoClientOptions3.getReadPreference();
        int int11 = mongoClientOptions3.getConnectTimeout();
        int int12 = mongoClientOptions3.getMaxWaitTime();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        java.lang.String str18 = mongoProperties13.getDatabase();
        boolean boolean19 = mongoProperties13.hasCustomCredentials();
        java.lang.String str20 = mongoProperties13.authenticationDatabase;
        mongoProperties13.setPort((java.lang.Integer) 27017);
        mongoProperties13.setDatabase("27017");
        boolean boolean25 = mongoClientOptions3.equals((java.lang.Object) mongoProperties13);
        int int26 = mongoClientOptions3.getMaxConnectionLifeTime();
        java.lang.String str27 = mongoClientOptions3.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertNotNull(readPreference10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 10000;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setGridFsDatabase("test");
        boolean boolean10 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        org.springframework.core.env.Environment environment13 = null;
        int int14 = mongoProperties0.determinePort(environment13);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties15.setHost("");
        mongoProperties15.username = "100";
        java.lang.String str20 = mongoProperties15.database;
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions24.getMaxConnectionLifeTime();
        int int27 = mongoClientOptions24.getLocalThreshold();
        boolean boolean28 = mongoClientOptions24.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions24.getSocketFactory();
        javax.net.SocketFactory socketFactory30 = mongoClientOptions24.getSocketFactory();
        int int31 = mongoClientOptions24.getSocketTimeout();
        int int32 = mongoClientOptions24.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties15.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder4.maxAutoConnectRetryTime(0L);
        com.mongodb.MongoClientOptions.Builder builder18 = builder4.localThreshold(2147483647);
        com.mongodb.MongoClientOptions.Builder builder19 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout(144);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder23 = builder19.heartbeatConnectRetryFrequency((-1306525534));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
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
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        java.lang.String str1 = java.lang.Integer.toHexString((-201261056));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "f4010000" + "'", str1, "f4010000");
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory9 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        boolean boolean18 = mongoClientOptions14.isAutoConnectRetry();
        boolean boolean19 = mongoClientOptions14.isAlwaysUseMBeans();
        boolean boolean20 = mongoClientOptions14.isAutoConnectRetry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        int int2 = java.lang.Integer.rotateRight(8, 27017);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67108864 + "'", int2 == 67108864);
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        int int2 = java.lang.Integer.divideUnsigned(805306368, 16810040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setHost("53182464");
        mongoProperties0.username = "33554432";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        mongoProperties0.setPort((java.lang.Integer) 10000);
        java.lang.String str11 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "369098752";
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAlwaysUseMBeans();
        int int20 = mongoClientOptions18.getAcceptableLatencyDifference();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        int int1 = java.lang.Integer.highestOneBit(1610612736);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions5.getMaxWaitTime();
        java.lang.Class<?> wildcardClass10 = mongoClientOptions5.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        int int2 = java.lang.Integer.rotateLeft(18, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.uri = "10";
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int12 = mongoProperties11.getDEFAULT_PORT();
        mongoProperties11.setGridFsDatabase("100");
        mongoProperties11.setGridFsDatabase("1");
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        java.lang.String str21 = mongoClientOptions20.toString();
        int int22 = mongoClientOptions20.getHeartbeatFrequency();
        int int23 = mongoClientOptions20.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions20.getDbEncoderFactory();
        com.mongodb.WriteConcern writeConcern25 = mongoClientOptions20.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties11.builder(mongoClientOptions20);
        org.springframework.core.env.Environment environment27 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions20, environment27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5000 + "'", int22 == 5000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(writeConcern25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties8.determinePort(environment10);
        mongoProperties8.setPort((java.lang.Integer) 27017);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties8.builder(mongoClientOptions23);
        int int26 = mongoClientOptions23.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxAutoConnectRetryTime(0L);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.minConnectionsPerHost(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        int int1 = java.lang.Integer.reverseBytes(99);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1660944384 + "'", int1 == 1660944384);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("10100000000000000000000000001000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100000000000000000000000001000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        java.lang.String str1 = java.lang.Integer.toHexString((-2012020736));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "88130000" + "'", str1, "88130000");
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        mongoProperties0.port = 53182464;
        mongoProperties0.authenticationDatabase = "2149318944";
        java.lang.String str8 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.host;
        org.springframework.core.env.Environment environment24 = null;
        int int25 = mongoProperties22.determinePort(environment24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory31 = mongoClientOptions29.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties22.builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        int int37 = mongoClientOptions36.getMaxConnectionLifeTime();
        int int38 = mongoClientOptions36.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties22.builder(mongoClientOptions36);
        int int40 = mongoClientOptions36.getHeartbeatFrequency();
        boolean boolean41 = mongoClientOptions36.isCursorFinalizerEnabled();
        int int42 = mongoClientOptions36.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern43 = mongoClientOptions36.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder44 = builder18.writeConcern(writeConcern43);
        java.lang.Class<?> wildcardClass45 = builder44.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass45;
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 27017 + "'", int25 == 27017);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5000 + "'", int40 == 5000);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1342177280 + "'", int42 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(105);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "105" + "'", str1, "105");
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        int int2 = java.lang.Integer.sum(100011, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100059 + "'", int2 == 100059);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("20000007100", 117440720);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 117440720 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "4e20";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        boolean boolean13 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.Integer int16 = mongoProperties0.port;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        java.lang.String str1 = java.lang.Integer.toString(6086926);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6086926" + "'", str1, "6086926");
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions14.getDbDecoderFactory();
        int int17 = mongoClientOptions14.getLocalThreshold();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        int int2 = java.lang.Integer.compare(40000, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        int int2 = java.lang.Integer.rotateLeft(100100034, (-2147480000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100100034 + "'", int2 == 100100034);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("11010", (-1346368000));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1346368000 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("2c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2c\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.getHost();
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties0.determinePort(environment10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxConnectionLifeTime((int) '4');
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        java.lang.String str24 = mongoClientOptions23.toString();
        int int25 = mongoClientOptions23.getHeartbeatFrequency();
        int int26 = mongoClientOptions23.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory27 = mongoClientOptions23.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder17.dbEncoderFactory(dBEncoderFactory27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder16.dbEncoderFactory(dBEncoderFactory27);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder36 = builder30.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder42 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder46 = builder42.localThreshold(35);
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.description("11610");
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder53 = builder49.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder55 = builder49.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder61 = builder57.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions67 = builder64.build();
        int int68 = mongoClientOptions67.getMaxConnectionLifeTime();
        int int69 = mongoClientOptions67.getMaxConnectionLifeTime();
        int int70 = mongoClientOptions67.getLocalThreshold();
        int int71 = mongoClientOptions67.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str72 = mongoClientOptions67.getRequiredReplicaSetName();
        int int73 = mongoClientOptions67.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference74 = mongoClientOptions67.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder75 = builder61.readPreference(readPreference74);
        com.mongodb.MongoClientOptions.Builder builder76 = builder48.readPreference(readPreference74);
        com.mongodb.MongoClientOptions.Builder builder77 = builder16.readPreference(readPreference74);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5000 + "'", int25 == 5000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
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
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(mongoClientOptions67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 15 + "'", int70 == 15);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 5 + "'", int71 == 5);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 5000 + "'", int73 == 5000);
        org.junit.Assert.assertNotNull(readPreference74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.maxAutoConnectRetryTime((long) 44);
        com.mongodb.MongoClientOptions.Builder builder15 = builder7.heartbeatThreadCount(7340545);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.connectionsPerHost(105906176);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder15.connectionsPerHost((-2012020736));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
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
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        int int1 = java.lang.Integer.highestOneBit((-2147483336));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectTimeout(2);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder0.build();
        boolean boolean6 = mongoClientOptions5.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        int int1 = java.lang.Integer.signum(50331648);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.connectionsPerHost((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionLifeTime(44);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionLifeTime(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.socketTimeout(16384);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime(170910000);
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
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions11.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder14 = builder7.dbEncoderFactory(dBEncoderFactory13);
        com.mongodb.MongoClientOptions.Builder builder16 = builder7.connectionsPerHost(10);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        int int18 = mongoClientOptions17.getMaxWaitTime();
        java.lang.String str19 = mongoClientOptions17.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120000 + "'", int18 == 120000);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        int int2 = java.lang.Integer.sum(214748374, (-2138682786));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1923934412) + "'", int2 == (-1923934412));
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        mongoProperties12.host = "";
        mongoProperties12.username = "100";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean24 = mongoClientOptions23.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions23.getDbDecoderFactory();
        int int26 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties12.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions23);
        java.lang.Class<?> wildcardClass29 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.core.env.Environment environment30 = null;
        int int31 = mongoProperties0.determinePort(environment30);
        char[] charArray32 = mongoProperties0.getPassword();
        java.lang.String str33 = mongoProperties0.getGridFsDatabase();
        java.lang.String str34 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 27017 + "'", int31 == 27017);
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions3.getDbDecoderFactory();
        int int11 = mongoClientOptions3.getLocalThreshold();
        int int12 = mongoClientOptions3.getMaxConnectionLifeTime();
        boolean boolean13 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions3.getWriteConcern();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(writeConcern14);
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        int int1 = java.lang.Integer.reverseBytes(139);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1962934272) + "'", int1 == (-1962934272));
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        mongoProperties6.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass10 = mongoProperties6.fieldNamingStrategy;
        mongoProperties6.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.getUri();
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties13.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties6.builder(mongoClientOptions18);
        int int22 = mongoClientOptions18.getConnectTimeout();
        int int23 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions18);
        java.lang.String str25 = mongoClientOptions18.getRequiredReplicaSetName();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties26.setHost("");
        java.lang.String str29 = mongoProperties26.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean34 = mongoClientOptions33.isAlwaysUseMBeans();
        int int35 = mongoClientOptions33.getLocalThreshold();
        int int36 = mongoClientOptions33.getSocketTimeout();
        int int37 = mongoClientOptions33.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties26.builder(mongoClientOptions33);
        java.lang.String str39 = mongoProperties26.getHost();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        java.lang.String str44 = mongoClientOptions43.toString();
        int int45 = mongoClientOptions43.getMaxWaitTime();
        int int46 = mongoClientOptions43.getMaxWaitTime();
        int int47 = mongoClientOptions43.getLocalThreshold();
        long long48 = mongoClientOptions43.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties26.builder(mongoClientOptions43);
        boolean boolean50 = mongoClientOptions18.equals((java.lang.Object) builder49);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10000 + "'", int23 == 10000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "test" + "'", str29, "test");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10000 + "'", int37 == 10000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 120000 + "'", int45 == 120000);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 120000 + "'", int46 == 120000);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("28", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 28");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        int int2 = java.lang.Integer.compare(0, 6250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        int int2 = java.lang.Integer.divideUnsigned(5000, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 217 + "'", int2 == 217);
    }
}

