import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        int int2 = java.lang.Integer.max(1000, 17210368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17210368 + "'", int2 == 17210368);
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.uri;
        mongoProperties0.uri = "mongodb://localhost/test";
        char[] charArray12 = mongoProperties0.getPassword();
        mongoProperties0.port = 105;
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions18.getDbDecoderFactory();
        int int21 = mongoClientOptions18.getLocalThreshold();
        boolean boolean22 = mongoClientOptions18.isAlwaysUseMBeans();
        long long23 = mongoClientOptions18.getMaxAutoConnectRetryTime();
        boolean boolean24 = mongoClientOptions18.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions18.getDbEncoderFactory();
        int int26 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions18);
        mongoProperties0.gridFsDatabase = "128";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions12.getDbDecoderFactory();
        int int19 = mongoClientOptions12.getConnectTimeout();
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
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        int int1 = java.lang.Integer.reverse(16667143);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-531988736) + "'", int1 == (-531988736));
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.acceptableLatencyDifference(327680000);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.autoConnectRetry(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("11111111111111111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11111111111111111111111111111111\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        int int2 = java.lang.Integer.compare(1100, 24584435);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        int int2 = java.lang.Integer.sum(38, 61000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 61000038 + "'", int2 == 61000038);
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        int int1 = java.lang.Integer.signum((-804206261));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.connectionsPerHost((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionLifeTime(44);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.connectionsPerHost(100663114);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectRetryFrequency(4096);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.heartbeatFrequency(53182464);
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
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        int int2 = java.lang.Integer.min(32768, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        boolean boolean13 = mongoClientOptions12.isAlwaysUseMBeans();
        int int14 = mongoClientOptions12.getLocalThreshold();
        int int15 = mongoClientOptions12.getSocketTimeout();
        int int16 = mongoClientOptions12.getConnectTimeout();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions12.getSocketFactory();
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions12.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder19 = builder8.readPreference(readPreference18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionIdleTime(80803801);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.description("1359872");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        int int2 = java.lang.Integer.rotateRight(3, 53182464);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("333311202213000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 333311202213000 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        mongoProperties0.setPort((java.lang.Integer) 10000);
        java.lang.String str11 = mongoProperties0.uri;
        mongoProperties0.host = "2147483960";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.String str7 = mongoProperties0.getHost();
        char[] charArray8 = mongoProperties0.password;
        mongoProperties0.authenticationDatabase = "2c";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.gridFsDatabase = "hi!";
        char[] charArray19 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties12.setPassword(charArray19);
        mongoProperties11.setPassword(charArray19);
        java.lang.String str22 = mongoProperties11.getHost();
        mongoProperties11.setHost("test");
        java.lang.String str25 = mongoProperties11.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean31 = mongoClientOptions29.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties11.builder(mongoClientOptions29);
        org.springframework.core.env.Environment environment33 = null;
        int int34 = mongoProperties11.determinePort(environment33);
        char[] charArray35 = mongoProperties11.password;
        mongoProperties0.password = charArray35;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 27017 + "'", int34 == 27017);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, a, #, 4]");
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        int int1 = java.lang.Integer.highestOneBit(16810012);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        int int2 = java.lang.Integer.compare(41014, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getConnectionsPerHost();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions3.getLocalThreshold();
        int int10 = mongoClientOptions3.getMinConnectionsPerHost();
        int int11 = mongoClientOptions3.getConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions3.getDbEncoderFactory();
        long long13 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1342177280 + "'", int10 == 1342177280);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        java.lang.String str1 = java.lang.Integer.toOctalString(74);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "112" + "'", str1, "112");
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        java.lang.String str9 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
        java.lang.String str11 = mongoProperties0.getGridFsDatabase();
        boolean boolean12 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        int int2 = java.lang.Integer.remainderUnsigned(524288000, (-2100483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 524288000 + "'", int2 == 524288000);
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        int int2 = java.lang.Integer.divideUnsigned(162, 60076865);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setGridFsDatabase("-1");
        java.lang.String str11 = mongoProperties0.getDatabase();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.host = "2";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        boolean boolean13 = mongoClientOptions12.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory14 = mongoClientOptions12.getDbEncoderFactory();
        int int15 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        int int16 = mongoClientOptions12.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(30);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.minConnectionsPerHost(6144);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatFrequency(30);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        int int1 = java.lang.Integer.reverseBytes(29);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 486539264 + "'", int1 == 486539264);
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
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
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.acceptableLatencyDifference((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder38 = builder32.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder40 = builder32.description("90");
        com.mongodb.MongoClientOptions.Builder builder42 = builder32.maxWaitTime(65368);
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
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("1100", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1100");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        boolean boolean9 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions3.getDbEncoderFactory();
        int int11 = mongoClientOptions3.getConnectTimeout();
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties29.gridFsDatabase = "hi!";
        char[] charArray36 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties29.setPassword(charArray36);
        mongoProperties28.setPassword(charArray36);
        mongoProperties12.password = charArray36;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.host;
        mongoProperties40.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass44 = mongoProperties40.fieldNamingStrategy;
        java.lang.String str45 = mongoProperties40.getDatabase();
        java.lang.String str46 = mongoProperties40.getUsername();
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        boolean boolean51 = mongoClientOptions50.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties53.gridFsDatabase = "hi!";
        char[] charArray60 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties53.setPassword(charArray60);
        mongoProperties52.setPassword(charArray60);
        boolean boolean63 = mongoClientOptions50.equals((java.lang.Object) mongoProperties52);
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties40.builder(mongoClientOptions50);
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties12.builder(mongoClientOptions50);
        com.mongodb.DBDecoderFactory dBDecoderFactory66 = mongoClientOptions50.getDbDecoderFactory();
        boolean boolean67 = mongoClientOptions3.equals((java.lang.Object) dBDecoderFactory66);
        int int68 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int69 = mongoClientOptions3.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(dBDecoderFactory66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 5 + "'", int68 == 5);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 15 + "'", int69 == 15);
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        int int2 = java.lang.Integer.min(0, 6250);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        java.lang.String str1 = java.lang.Integer.toBinaryString(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11100" + "'", str1, "11100");
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        java.lang.String str2 = java.lang.Integer.toString(327680030, (-1346368000));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "327680030" + "'", str2, "327680030");
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        int int2 = java.lang.Integer.compareUnsigned(7340545, 50331648);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getDatabase();
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.clearPassword();
        java.lang.Integer int11 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        int int1 = java.lang.Integer.signum(24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        int int1 = java.lang.Integer.bitCount(10032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
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
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.socketTimeout(110121132);
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
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        int int2 = java.lang.Integer.rotateLeft(5, 96);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        int int2 = java.lang.Integer.compare(931422209, (-1140523008));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder20 = builder15.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.host;
        mongoProperties21.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass25 = mongoProperties21.fieldNamingStrategy;
        mongoProperties21.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.getUri();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions33);
        javax.net.SocketFactory socketFactory37 = mongoClientOptions33.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder38 = builder20.socketFactory(socketFactory37);
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        boolean boolean43 = mongoClientOptions42.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory44 = mongoClientOptions42.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder38.dbEncoderFactory(dBEncoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder10.dbEncoderFactory(dBEncoderFactory44);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties47.setHost("");
        mongoProperties47.username = "100";
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.localThreshold(27017);
        java.lang.Class<?> wildcardClass55 = builder54.getClass();
        mongoProperties47.fieldNamingStrategy = wildcardClass55;
        mongoProperties47.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int60 = mongoProperties59.getDEFAULT_PORT();
        mongoProperties59.setHost("hi!");
        mongoProperties59.host = "";
        mongoProperties59.username = "100";
        com.mongodb.MongoClientOptions.Builder builder67 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder67.build();
        boolean boolean71 = mongoClientOptions70.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory72 = mongoClientOptions70.getDbDecoderFactory();
        int int73 = mongoClientOptions70.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties59.builder(mongoClientOptions70);
        com.mongodb.MongoClientOptions.Builder builder75 = mongoProperties47.builder(mongoClientOptions70);
        int int76 = mongoClientOptions70.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory77 = mongoClientOptions70.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder78 = builder10.dbEncoderFactory(dBEncoderFactory77);
        com.mongodb.MongoClientOptions.Builder builder79 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder81 = builder79.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions82 = builder79.build();
        boolean boolean83 = mongoClientOptions82.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory84 = mongoClientOptions82.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory85 = mongoClientOptions82.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder86 = builder78.socketFactory(socketFactory85);
        com.mongodb.MongoClientOptions.Builder builder88 = builder78.heartbeatConnectTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder90 = builder78.heartbeatSocketTimeout(1879048193);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "mongodb://localhost/test" + "'", str29, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(socketFactory37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 27017 + "'", int60 == 27017);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 15 + "'", int73 == 15);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 20000 + "'", int76 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoClientOptions82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory84);
        org.junit.Assert.assertNotNull(socketFactory85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        java.lang.String str1 = java.lang.Integer.toOctalString(35);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "43" + "'", str1, "43");
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder11.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatSocketTimeout(1100001);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int18 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.setHost("hi!");
        mongoProperties17.host = "";
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        java.lang.String str27 = mongoClientOptions26.toString();
        int int28 = mongoClientOptions26.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties17.builder(mongoClientOptions26);
        int int30 = mongoClientOptions26.getConnectTimeout();
        javax.net.SocketFactory socketFactory31 = mongoClientOptions26.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory32 = mongoClientOptions26.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder33 = builder12.dbDecoderFactory(dBDecoderFactory32);
        com.mongodb.MongoClientOptions.Builder builder34 = builder8.dbDecoderFactory(dBDecoderFactory32);
        com.mongodb.MongoClientOptions.Builder builder36 = builder8.heartbeatFrequency(170910000);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.connectTimeout(2);
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.acceptableLatencyDifference(40000);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.localThreshold(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10000 + "'", int30 == 10000);
        org.junit.Assert.assertNotNull(socketFactory31);
        org.junit.Assert.assertNotNull(dBDecoderFactory32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        int int2 = java.lang.Integer.sum(807862272, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 807862272 + "'", int2 == 807862272);
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        int int2 = java.lang.Integer.compare(34, 102886528);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("3648");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 3648");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        int int1 = java.lang.Integer.reverseBytes((-2147483364));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 469827712 + "'", int1 == 469827712);
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("27017");
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.threadsAllowedToBlockForConnectionMultiplier(500);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder10.build();
        int int16 = mongoClientOptions15.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5000 + "'", int16 == 5000);
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        int int1 = java.lang.Integer.signum(67108928);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
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
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatConnectRetryFrequency(1100001);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder32 = builder28.threadsAllowedToBlockForConnectionMultiplier(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.requiredReplicaSetName("7fffffff");
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder23 = builder15.heartbeatConnectTimeout(402653184);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties25.gridFsDatabase = "hi!";
        char[] charArray32 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties25.setPassword(charArray32);
        mongoProperties24.setPassword(charArray32);
        java.lang.String str35 = mongoProperties24.getHost();
        mongoProperties24.setHost("test");
        java.lang.String str38 = mongoProperties24.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        boolean boolean44 = mongoClientOptions42.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties24.builder(mongoClientOptions42);
        com.mongodb.WriteConcern writeConcern46 = mongoClientOptions42.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder47 = builder23.writeConcern(writeConcern46);
        com.mongodb.MongoClientOptions.Builder builder48 = builder14.writeConcern(writeConcern46);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.heartbeatFrequency(86);
        com.mongodb.MongoClientOptions.Builder builder52 = builder48.socketTimeout(100663114);
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
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(writeConcern46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10100110000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10100110000000000000000000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        long long1 = java.lang.Integer.toUnsignedLong(1101011);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1101011L + "'", long1 == 1101011L);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        long long1 = java.lang.Integer.toUnsignedLong(469762048);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 469762048L + "'", long1 == 469762048L);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("33", 49284096);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 49284096 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        int int2 = java.lang.Integer.min((-201261056), 369098778);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-201261056) + "'", int2 == (-201261056));
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4240000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4240000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1100001000000000000000000000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties0.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        java.lang.String str15 = mongoProperties13.host;
        java.lang.Integer int16 = mongoProperties13.getPort();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean22 = mongoClientOptions20.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties13.builder(mongoClientOptions20);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties24.gridFsDatabase = "hi!";
        char[] charArray31 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties24.setPassword(charArray31);
        mongoProperties13.setPassword(charArray31);
        mongoProperties0.setPassword(charArray31);
        boolean boolean35 = mongoProperties0.hasCustomAddress();
        java.lang.String str36 = mongoProperties0.getUsername();
        java.lang.String str37 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatSocketTimeout(74579968);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectRetryFrequency((-2145648384));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
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
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("10000000001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-534787520));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3760179776" + "'", str1, "3760179776");
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
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
        mongoProperties0.username = "11100100000000000000000000001";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertNotNull(socketFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        int int2 = java.lang.Integer.max(8000, 671088640);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 671088640 + "'", int2 == 671088640);
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
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
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
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
        java.lang.Integer int27 = mongoProperties0.port;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.host;
        mongoProperties28.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass32 = mongoProperties28.fieldNamingStrategy;
        mongoProperties28.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str36 = mongoProperties35.getUri();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        int int41 = mongoClientOptions40.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties35.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties28.builder(mongoClientOptions40);
        int int44 = mongoClientOptions40.getConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory45 = mongoClientOptions40.getDbEncoderFactory();
        int int46 = mongoClientOptions40.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties0.builder(mongoClientOptions40);
        mongoProperties0.setHost("16513760000");
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
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "mongodb://localhost/test" + "'", str36, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10000 + "'", int44 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("65571", (-47480831));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -47480831 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("2e");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2e\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.gridFsDatabase = "hi!";
        boolean boolean15 = mongoProperties12.hasCustomAddress();
        java.lang.String str16 = mongoProperties12.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int18 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.setHost("hi!");
        mongoProperties17.host = "";
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        java.lang.String str27 = mongoClientOptions26.toString();
        int int28 = mongoClientOptions26.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties17.builder(mongoClientOptions26);
        int int30 = mongoClientOptions26.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties12.builder(mongoClientOptions26);
        java.lang.String str32 = mongoProperties12.host;
        char[] charArray33 = new char[] {};
        mongoProperties12.password = charArray33;
        mongoProperties0.password = charArray33;
        mongoProperties0.setPort((java.lang.Integer) 600000000);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "test" + "'", str16, "test");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        int int1 = java.lang.Integer.numberOfLeadingZeros(385875968);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        java.lang.String str1 = java.lang.Integer.toBinaryString(105906176);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "110010100000000000000000000" + "'", str1, "110010100000000000000000000");
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int6 = mongoProperties0.getPort();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        int int2 = java.lang.Integer.max(162, 16777215);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16777215 + "'", int2 == 16777215);
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
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
        mongoProperties0.setHost("25");
        mongoProperties0.setUsername("34");
        char[] charArray22 = mongoProperties0.password;
        mongoProperties0.gridFsDatabase = "-804206260";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(charArray22);
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
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
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        int int32 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int33 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions31.getLocalThreshold();
        int int35 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str36 = mongoClientOptions31.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions31.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder27.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatConnectRetryFrequency((int) '#');
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.build();
        com.mongodb.MongoClientOptions.Builder builder48 = builder43.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder50 = builder43.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int54 = mongoProperties53.getDEFAULT_PORT();
        mongoProperties53.setHost("hi!");
        mongoProperties53.host = "";
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        java.lang.String str63 = mongoClientOptions62.toString();
        int int64 = mongoClientOptions62.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties53.builder(mongoClientOptions62);
        int int66 = mongoClientOptions62.getConnectTimeout();
        javax.net.SocketFactory socketFactory67 = mongoClientOptions62.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder50.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder69 = builder38.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.maxConnectionLifeTime(32768);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 27017 + "'", int54 == 27017);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 20000 + "'", int64 == 20000);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10000 + "'", int66 == 10000);
        org.junit.Assert.assertNotNull(socketFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
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
        boolean boolean59 = mongoClientOptions50.isAutoConnectRetry();
        boolean boolean60 = mongoClientOptions50.isAlwaysUseMBeans();
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.String str6 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        boolean boolean11 = mongoClientOptions10.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.gridFsDatabase = "hi!";
        char[] charArray20 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties13.setPassword(charArray20);
        mongoProperties12.setPassword(charArray20);
        boolean boolean23 = mongoClientOptions10.equals((java.lang.Object) mongoProperties12);
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.DBDecoderFactory dBDecoderFactory25 = mongoClientOptions10.getDbDecoderFactory();
        int int26 = mongoClientOptions10.getConnectTimeout();
        com.mongodb.ReadPreference readPreference27 = mongoClientOptions10.getReadPreference();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(readPreference27);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
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
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.localThreshold(35);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.description("11610");
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder37 = builder31.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder43 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        int int50 = mongoClientOptions49.getMaxConnectionLifeTime();
        int int51 = mongoClientOptions49.getMaxConnectionLifeTime();
        int int52 = mongoClientOptions49.getLocalThreshold();
        int int53 = mongoClientOptions49.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str54 = mongoClientOptions49.getRequiredReplicaSetName();
        int int55 = mongoClientOptions49.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference56 = mongoClientOptions49.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder57 = builder43.readPreference(readPreference56);
        com.mongodb.MongoClientOptions.Builder builder58 = builder30.readPreference(readPreference56);
        boolean boolean59 = mongoClientOptions3.equals((java.lang.Object) readPreference56);
        int int60 = mongoClientOptions3.getMaxConnectionIdleTime();
        java.lang.String str61 = mongoClientOptions3.toString();
        int int62 = mongoClientOptions3.getMaxWaitTime();
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
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
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 15 + "'", int52 == 15);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5000 + "'", int55 == 5000);
        org.junit.Assert.assertNotNull(readPreference56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 120000 + "'", int62 == 120000);
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
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
        java.lang.String str13 = mongoProperties0.getUsername();
        mongoProperties0.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int16 = mongoProperties15.getDEFAULT_PORT();
        mongoProperties15.setHost("hi!");
        mongoProperties15.setDatabase("1100001");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int22 = mongoProperties21.getDEFAULT_PORT();
        mongoProperties21.setHost("hi!");
        mongoProperties21.host = "";
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        java.lang.String str31 = mongoClientOptions30.toString();
        int int32 = mongoClientOptions30.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties21.builder(mongoClientOptions30);
        int int34 = mongoClientOptions30.getConnectTimeout();
        javax.net.SocketFactory socketFactory35 = mongoClientOptions30.getSocketFactory();
        int int36 = mongoClientOptions30.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties15.builder(mongoClientOptions30);
        int int38 = mongoClientOptions30.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties0.builder(mongoClientOptions30);
        boolean boolean40 = mongoProperties0.hasCustomCredentials();
        java.lang.String str41 = mongoProperties0.authenticationDatabase;
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10000 + "'", int34 == 10000);
        org.junit.Assert.assertNotNull(socketFactory35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
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
        boolean boolean22 = mongoProperties0.hasCustomAddress();
        java.lang.String str23 = mongoProperties0.getHost();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        java.lang.String str1 = java.lang.Integer.toHexString(796917760);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2f800000" + "'", str1, "2f800000");
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        int int2 = java.lang.Integer.compareUnsigned(947912705, 1071000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        int int2 = java.lang.Integer.rotateLeft(41014, 100011);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83996672 + "'", int2 == 83996672);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: ");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        mongoProperties0.setPort((java.lang.Integer) 298319873);
        boolean boolean9 = mongoProperties0.hasCustomAddress();
        char[] charArray10 = mongoProperties0.password;
        char[] charArray11 = mongoProperties0.password;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        int int2 = java.lang.Integer.compare(18965549, (-2139070703));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        int int2 = java.lang.Integer.compareUnsigned(27, 9485312);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        int int2 = java.lang.Integer.rotateRight(282, (-201261056));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 282 + "'", int2 == 282);
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getUsername();
        boolean boolean10 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatConnectTimeout(105);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.description("10000000000100000000100000000011");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectRetryFrequency((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder31 = builder23.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        com.mongodb.MongoClientOptions.Builder builder39 = builder34.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        boolean boolean46 = mongoClientOptions45.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory47 = mongoClientOptions45.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder48 = builder41.dbEncoderFactory(dBEncoderFactory47);
        com.mongodb.MongoClientOptions.Builder builder49 = builder23.dbEncoderFactory(dBEncoderFactory47);
        com.mongodb.MongoClientOptions.Builder builder50 = builder20.dbEncoderFactory(dBEncoderFactory47);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.connectionsPerHost(1176610106);
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.build();
        int int57 = mongoClientOptions56.getMaxConnectionLifeTime();
        int int58 = mongoClientOptions56.getMaxConnectionLifeTime();
        int int59 = mongoClientOptions56.getLocalThreshold();
        int int60 = mongoClientOptions56.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str61 = mongoClientOptions56.getRequiredReplicaSetName();
        int int62 = mongoClientOptions56.getHeartbeatFrequency();
        int int63 = mongoClientOptions56.getHeartbeatConnectTimeout();
        int int64 = mongoClientOptions56.getMaxConnectionIdleTime();
        boolean boolean65 = mongoClientOptions56.isCursorFinalizerEnabled();
        javax.net.SocketFactory socketFactory66 = mongoClientOptions56.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder67 = builder50.socketFactory(socketFactory66);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 15 + "'", int59 == 15);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 5 + "'", int60 == 5);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 5000 + "'", int62 == 5000);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 20000 + "'", int63 == 20000);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(socketFactory66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("8");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatConnectRetryFrequency(270991360);
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory54 = mongoClientOptions38.getDbDecoderFactory();
        java.lang.String str55 = mongoClientOptions38.toString();
        int int56 = mongoClientOptions38.getSocketTimeout();
        int int57 = mongoClientOptions38.getMinHeartbeatFrequency();
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
        org.junit.Assert.assertNotNull(dBDecoderFactory54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 500 + "'", int57 == 500);
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
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
        javax.net.SocketFactory socketFactory26 = mongoClientOptions18.getSocketFactory();
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
        org.junit.Assert.assertNotNull(socketFactory26);
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
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
        java.lang.String str13 = mongoProperties0.getUsername();
        boolean boolean14 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setGridFsDatabase("1001110001000");
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.minHeartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatFrequency(105906176);
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
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUri("10");
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.build();
        int int9 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int10 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions8.getLocalThreshold();
        int int12 = mongoClientOptions8.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions8.getDbEncoderFactory();
        int int14 = mongoClientOptions8.getSocketTimeout();
        int int15 = mongoClientOptions8.getHeartbeatFrequency();
        boolean boolean16 = mongoClientOptions8.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions8);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.host;
        mongoProperties18.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass22 = mongoProperties18.fieldNamingStrategy;
        mongoProperties18.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str26 = mongoProperties25.getUri();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        int int31 = mongoClientOptions30.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties25.builder(mongoClientOptions30);
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties18.builder(mongoClientOptions30);
        boolean boolean34 = mongoClientOptions30.isAlwaysUseMBeans();
        int int35 = mongoClientOptions30.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions30);
        java.lang.Class<?> wildcardClass37 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str38 = mongoProperties0.database;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb://localhost/test" + "'", str26, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10000 + "'", int35 == 10000);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(wildcardClass37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        int int8 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str9 = mongoProperties0.username;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        int int2 = java.lang.Integer.max(1660944384, 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1660944384 + "'", int2 == 1660944384);
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1073741824);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int10 = mongoClientOptions3.getConnectTimeout();
        int int11 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern12 = mongoClientOptions3.getWriteConcern();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 120000 + "'", int11 == 120000);
        org.junit.Assert.assertNotNull(writeConcern12);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("27017");
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.threadsAllowedToBlockForConnectionMultiplier(500);
        com.mongodb.MongoClientOptions.Builder builder15 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder17 = builder10.minConnectionsPerHost(939589760);
        com.mongodb.MongoClientOptions.Builder builder19 = builder10.heartbeatConnectRetryFrequency(536870912);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder10.connectionsPerHost((-1140523008));
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties35.gridFsDatabase = "hi!";
        char[] charArray42 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties35.setPassword(charArray42);
        mongoProperties34.setPassword(charArray42);
        java.lang.String str45 = mongoProperties34.getHost();
        mongoProperties34.setHost("test");
        mongoProperties34.setAuthenticationDatabase("11i71");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str51 = mongoProperties50.getUri();
        char[] charArray52 = mongoProperties50.password;
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.build();
        boolean boolean57 = mongoClientOptions56.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory58 = mongoClientOptions56.getDbDecoderFactory();
        int int59 = mongoClientOptions56.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder60 = mongoProperties50.builder(mongoClientOptions56);
        int int61 = mongoClientOptions56.getLocalThreshold();
        int int62 = mongoClientOptions56.getMaxConnectionIdleTime();
        int int63 = mongoClientOptions56.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties34.builder(mongoClientOptions56);
        com.mongodb.DBDecoderFactory dBDecoderFactory65 = mongoClientOptions56.getDbDecoderFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient66 = mongoProperties0.createMongoClient(mongoClientOptions56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "mongodb://localhost/test" + "'", str51, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 15 + "'", int59 == 15);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 15 + "'", int61 == 15);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(dBDecoderFactory65);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.database;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1100001" + "'", str6, "1100001");
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.maxAutoConnectRetryTime((long) 44);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.localThreshold(86);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.minConnectionsPerHost(34);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder23 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder28 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.connectionsPerHost(5000);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.heartbeatSocketTimeout(61);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder39 = builder33.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder41 = builder33.connectionsPerHost(28);
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
        com.mongodb.MongoClientOptions.Builder builder57 = builder33.socketFactory(socketFactory56);
        com.mongodb.MongoClientOptions.Builder builder58 = builder28.socketFactory(socketFactory56);
        com.mongodb.MongoClientOptions.Builder builder59 = builder13.socketFactory(socketFactory56);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
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
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.minConnectionsPerHost(35);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        com.mongodb.MongoClientOptions.Builder builder14 = builder11.minHeartbeatFrequency(8402945);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder11.build();
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.heartbeatConnectTimeout(117440720);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        java.lang.Integer int1 = java.lang.Integer.getInteger("218103808");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
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
        java.lang.String str16 = mongoClientOptions9.toString();
        java.lang.String str17 = mongoClientOptions9.toString();
        boolean boolean18 = mongoClientOptions9.isCursorFinalizerEnabled();
        boolean boolean19 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions9.getConnectTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("20000007100");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
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
        int int13 = mongoClientOptions3.getHeartbeatFrequency();
        java.lang.String str14 = mongoClientOptions3.getRequiredReplicaSetName();
        int int15 = mongoClientOptions3.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5000 + "'", int13 == 5000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120000 + "'", int15 == 120000);
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = builder7.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder7.maxWaitTime((-536870901));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        int int1 = java.lang.Integer.highestOneBit((-2094296184));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "11100100000000000000000000001";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
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
        int int13 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int14 = mongoClientOptions7.getMinConnectionsPerHost();
        int int15 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int16 = mongoClientOptions7.getMinHeartbeatFrequency();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1342177280 + "'", int14 == 1342177280);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 500 + "'", int16 == 500);
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("110121132", 270991360);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 270991360 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        java.lang.String str1 = java.lang.Integer.toOctalString(352256);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1260000" + "'", str1, "1260000");
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.Integer int8 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions12.getHeartbeatConnectRetryFrequency();
        int int15 = mongoClientOptions12.getConnectTimeout();
        int int16 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        int int17 = mongoClientOptions12.getConnectTimeout();
        org.springframework.core.env.Environment environment18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions12, environment18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        int int2 = java.lang.Integer.rotateRight((-2145648352), 1000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 545266689 + "'", int2 == 545266689);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        java.lang.String str2 = java.lang.Integer.toString(578813952, 1717986912);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "578813952" + "'", str2, "578813952");
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.getDatabase();
        java.lang.String str10 = mongoProperties0.username;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int12 = mongoProperties11.getDEFAULT_PORT();
        mongoProperties11.setHost("hi!");
        mongoProperties11.host = "";
        char[] charArray17 = mongoProperties11.getPassword();
        mongoProperties11.setGridFsDatabase("7fffffff");
        java.lang.String str20 = mongoProperties11.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.host;
        mongoProperties21.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass25 = mongoProperties21.fieldNamingStrategy;
        mongoProperties21.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.getUri();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions33);
        int int37 = mongoClientOptions33.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern38 = mongoClientOptions33.getWriteConcern();
        int int39 = mongoClientOptions33.getLocalThreshold();
        com.mongodb.ReadPreference readPreference40 = mongoClientOptions33.getReadPreference();
        long long41 = mongoClientOptions33.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties11.builder(mongoClientOptions33);
        boolean boolean43 = mongoClientOptions33.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties0.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minHeartbeatFrequency(364);
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.heartbeatFrequency((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "7fffffff" + "'", str20, "7fffffff");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "mongodb://localhost/test" + "'", str29, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(writeConcern38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertNotNull(readPreference40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 0L + "'", long41 == 0L);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = builder7.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(5000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout(61);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatConnectRetryFrequency(20480000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.host;
        mongoProperties21.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass25 = mongoProperties21.fieldNamingStrategy;
        mongoProperties21.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.getUri();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions33);
        int int37 = mongoClientOptions33.getConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory38 = mongoClientOptions33.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder39 = builder18.dbEncoderFactory(dBEncoderFactory38);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder18.build();
        int int41 = mongoClientOptions40.getHeartbeatConnectRetryFrequency();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "mongodb://localhost/test" + "'", str29, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10000 + "'", int37 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("8000", 6086926);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 6086926 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
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
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionIdleTime(369098752);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.requiredReplicaSetName("10000000000000000000000000000000");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatThreadCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        int int9 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        int int2 = java.lang.Integer.min(27017, 1101011);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27017 + "'", int2 == 27017);
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
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
        int int13 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions11.getLocalThreshold();
        int int15 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str16 = mongoClientOptions11.getRequiredReplicaSetName();
        int int17 = mongoClientOptions11.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions11);
        mongoProperties0.username = "69";
        mongoProperties0.setDatabase("1388");
        char[] charArray23 = null;
        mongoProperties0.password = charArray23;
        java.lang.String str25 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongodb://localhost/test" + "'", str25, "mongodb://localhost/test");
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        int int1 = java.lang.Integer.numberOfTrailingZeros(545266689);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions6.getLocalThreshold();
        boolean boolean10 = mongoClientOptions6.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions6.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketFactory(socketFactory11);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        int int2 = java.lang.Integer.compareUnsigned(6989, 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
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
        javax.net.SocketFactory socketFactory22 = mongoClientOptions18.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder3.socketFactory(socketFactory22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxWaitTime(500);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.acceptableLatencyDifference(0);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.heartbeatConnectRetryFrequency(364);
        com.mongodb.MongoClientOptions.Builder builder31 = builder25.requiredReplicaSetName("27017");
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.threadsAllowedToBlockForConnectionMultiplier(14152);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(socketFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "";
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.Integer int7 = mongoProperties0.getPort();
        java.lang.String str8 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        boolean boolean13 = mongoClientOptions12.isAlwaysUseMBeans();
        int int14 = mongoClientOptions12.getLocalThreshold();
        int int15 = mongoClientOptions12.getSocketTimeout();
        int int16 = mongoClientOptions12.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout((-2145648384));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(5);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("20000007100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000007100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        java.lang.String str1 = java.lang.Integer.toBinaryString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010" + "'", str1, "1010");
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 100, 1437335554);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        int int1 = java.lang.Integer.lowestOneBit((-1811939327));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        long long1 = java.lang.Integer.toUnsignedLong(1744830464);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1744830464L + "'", long1 == 1744830464L);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        java.lang.String str2 = java.lang.Integer.toString(524288, 376832);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "524288" + "'", str2, "524288");
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        boolean boolean8 = mongoClientOptions3.isAlwaysUseMBeans();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        long long1 = java.lang.Integer.toUnsignedLong(7341045);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7341045L + "'", long1 == 7341045L);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("100663296", 385875968);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 385875968 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        int int1 = java.lang.Integer.reverse(16777215);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-256) + "'", int1 == (-256));
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        int int2 = java.lang.Integer.remainderUnsigned(792740645, 20480000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14500645 + "'", int2 == 14500645);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        long long1 = java.lang.Integer.toUnsignedLong(872415232);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 872415232L + "'", long1 == 872415232L);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder26 = builder24.maxAutoConnectRetryTime((long) (-2093492383));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.connectionsPerHost((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionLifeTime(44);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.connectionsPerHost(100663114);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout(170910000);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder34 = builder33.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder41 = builder37.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder43 = builder37.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder50 = builder44.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder52 = builder44.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder54 = builder44.heartbeatConnectRetryFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder56 = builder44.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder61 = builder57.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder63 = builder57.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder69 = builder65.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder73 = builder69.localThreshold(500);
        com.mongodb.MongoClientOptions.Builder builder75 = builder73.socketTimeout(10);
        com.mongodb.MongoClientOptions.Builder builder76 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder78 = builder76.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions79 = builder76.build();
        int int80 = mongoClientOptions79.getMaxConnectionLifeTime();
        int int81 = mongoClientOptions79.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference82 = mongoClientOptions79.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder83 = builder73.readPreference(readPreference82);
        com.mongodb.MongoClientOptions.Builder builder84 = builder44.readPreference(readPreference82);
        com.mongodb.MongoClientOptions.Builder builder85 = builder37.readPreference(readPreference82);
        com.mongodb.MongoClientOptions.Builder builder86 = builder34.readPreference(readPreference82);
        com.mongodb.MongoClientOptions.Builder builder87 = builder22.readPreference(readPreference82);
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
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
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(mongoClientOptions79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 500 + "'", int81 == 500);
        org.junit.Assert.assertNotNull(readPreference82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.clearPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
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
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.heartbeatFrequency(99);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.alwaysUseMBeans(false);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1000, 170910000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1000" + "'", str2, "1000");
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        java.lang.String str6 = mongoClientOptions3.toString();
        boolean boolean7 = mongoClientOptions3.isAutoConnectRetry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setHost("");
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        char[] charArray14 = new char[] { '#', 'a', '#', '4', 'a', ' ' };
        mongoProperties0.password = charArray14;
        java.lang.Class<?> wildcardClass16 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str17 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, 4, a,  ]");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions9.getWriteConcern();
        java.lang.String str12 = mongoClientOptions9.getDescription();
        int int13 = mongoClientOptions9.getAcceptableLatencyDifference();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions9.getReadPreference();
        boolean boolean15 = mongoClientOptions9.isAutoConnectRetry();
        int int16 = mongoClientOptions9.getMaxWaitTime();
        int int17 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        int int18 = mongoClientOptions9.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 120000 + "'", int16 == 120000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1100001 + "'", int17 == 1100001);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.maxConnectionLifeTime(1744830464);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectionsPerHost((-2147363649));
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
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        long long1 = java.lang.Integer.toUnsignedLong(9485312);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 9485312L + "'", long1 == 9485312L);
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionIdleTime();
        boolean boolean9 = mongoClientOptions5.isSocketKeepAlive();
        int int10 = mongoClientOptions5.getMinHeartbeatFrequency();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("110121132", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.heartbeatConnectTimeout(53248);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "";
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.Integer int7 = mongoProperties0.getPort();
        java.lang.String str8 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        boolean boolean13 = mongoClientOptions12.isAlwaysUseMBeans();
        int int14 = mongoClientOptions12.getLocalThreshold();
        int int15 = mongoClientOptions12.getSocketTimeout();
        int int16 = mongoClientOptions12.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatFrequency(1388);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatThreadCount(3648);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime(65368L);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.database = "";
        java.lang.String str5 = mongoProperties0.getHost();
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("11000110000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11000110000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("16777216", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"16777216\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10001001101");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
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
        char[] charArray18 = mongoProperties0.getPassword();
        java.lang.String str19 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment20 = null;
        int int21 = mongoProperties0.determinePort(environment20);
        mongoProperties0.username = "149159936";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        java.lang.String str7 = mongoClientOptions3.getDescription();
        java.lang.String str8 = mongoClientOptions3.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        java.lang.String str18 = mongoProperties13.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.host;
        mongoProperties19.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass23 = mongoProperties19.fieldNamingStrategy;
        mongoProperties19.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.getUri();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        int int32 = mongoClientOptions31.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties26.builder(mongoClientOptions31);
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties19.builder(mongoClientOptions31);
        int int35 = mongoClientOptions31.getConnectTimeout();
        int int36 = mongoClientOptions31.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties13.builder(mongoClientOptions31);
        java.lang.String str38 = mongoProperties13.database;
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        java.lang.String str43 = mongoClientOptions42.toString();
        int int44 = mongoClientOptions42.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties13.builder(mongoClientOptions42);
        int int46 = mongoClientOptions42.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties0.builder(mongoClientOptions42);
        java.lang.String str48 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.username = "116100000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb://localhost/test" + "'", str27, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10000 + "'", int35 == 10000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10000 + "'", int36 == 10000);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 120000 + "'", int44 == 120000);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20000 + "'", int46 == 20000);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "test" + "'", str48, "test");
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        mongoProperties0.setPassword(charArray16);
        java.lang.String str19 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions23.getLocalThreshold();
        int int27 = mongoClientOptions23.getMaxConnectionIdleTime();
        int int28 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        mongoProperties0.setDatabase("2149318912");
        java.lang.String str32 = mongoProperties0.username;
        mongoProperties0.port = 811393294;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.uri;
        mongoProperties0.uri = "mongodb://localhost/test";
        char[] charArray12 = mongoProperties0.getPassword();
        mongoProperties0.port = 105;
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions18.getDbDecoderFactory();
        int int21 = mongoClientOptions18.getLocalThreshold();
        boolean boolean22 = mongoClientOptions18.isAlwaysUseMBeans();
        long long23 = mongoClientOptions18.getMaxAutoConnectRetryTime();
        boolean boolean24 = mongoClientOptions18.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions18.getDbEncoderFactory();
        int int26 = mongoClientOptions18.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions18);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder30 = builder27.legacyDefaults();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(256);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "256" + "'", str1, "256");
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        int int1 = java.lang.Integer.signum(13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        int int2 = java.lang.Integer.rotateLeft(9792256, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19584512 + "'", int2 == 19584512);
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.authenticationDatabase = "22";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1100001" + "'", str9, "1100001");
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        int int2 = java.lang.Integer.sum(298319873, 17877217);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 316197090 + "'", int2 == 316197090);
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("1010101101011000000000000000010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1010101101011000000000000000010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("16384");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 16384");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        int int2 = java.lang.Integer.divideUnsigned(80804057, 10032);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8054 + "'", int2 == 8054);
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions20.getLocalThreshold();
        int int24 = mongoClientOptions20.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions20.getDbEncoderFactory();
        int int26 = mongoClientOptions20.getSocketTimeout();
        int int27 = mongoClientOptions20.getHeartbeatFrequency();
        boolean boolean28 = mongoClientOptions20.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions20.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder16.socketFactory(socketFactory29);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5000 + "'", int27 == 5000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.toString();
        int int8 = mongoClientOptions6.getHeartbeatFrequency();
        int int9 = mongoClientOptions6.getConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions6.getDbDecoderFactory();
        int int11 = mongoClientOptions6.getAcceptableLatencyDifference();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions6);
        java.lang.String str13 = mongoProperties0.getDatabase();
        int int14 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5000 + "'", int8 == 5000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("8b000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"8b000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.port;
        mongoProperties0.setUsername("10010000");
        mongoProperties0.authenticationDatabase = "100011";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.port;
        boolean boolean7 = mongoProperties0.hasCustomAddress();
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
        boolean boolean26 = mongoClientOptions22.isAutoConnectRetry();
        boolean boolean27 = mongoClientOptions22.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions22);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.host;
        java.lang.String str31 = mongoProperties29.host;
        java.lang.Integer int32 = mongoProperties29.getPort();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        boolean boolean38 = mongoClientOptions36.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties29.builder(mongoClientOptions36);
        int int40 = mongoClientOptions36.getThreadsAllowedToBlockForConnectionMultiplier();
        int int41 = mongoClientOptions36.getMaxWaitTime();
        java.lang.String str42 = mongoClientOptions36.toString();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties0.builder(mongoClientOptions36);
        int int44 = mongoClientOptions36.getLocalThreshold();
        javax.net.SocketFactory socketFactory45 = mongoClientOptions36.getSocketFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 120000 + "'", int41 == 120000);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertNotNull(socketFactory45);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("16", 100100034);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100100034 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        long long1 = java.lang.Integer.toUnsignedLong(7168);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 7168L + "'", long1 == 7168L);
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
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
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.connectTimeout(282);
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
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        int int1 = java.lang.Integer.lowestOneBit(11534336);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1048576 + "'", int1 == 1048576);
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        java.lang.String str1 = java.lang.Integer.toOctalString(65368);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "177530" + "'", str1, "177530");
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getConnectTimeout();
        long long9 = mongoClientOptions5.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions5.getMinConnectionsPerHost();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10000 + "'", int8 == 10000);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1342177280 + "'", int10 == 1342177280);
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        int int1 = java.lang.Integer.signum(1306597376);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionIdleTime(578813952);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxConnectionIdleTime(1388);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketTimeout((-1346368000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.threadsAllowedToBlockForConnectionMultiplier((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder12.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        com.mongodb.MongoClientOptions.Builder builder21 = builder16.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder16.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int27 = mongoProperties26.getDEFAULT_PORT();
        mongoProperties26.setHost("hi!");
        mongoProperties26.host = "";
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        java.lang.String str36 = mongoClientOptions35.toString();
        int int37 = mongoClientOptions35.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties26.builder(mongoClientOptions35);
        int int39 = mongoClientOptions35.getConnectTimeout();
        javax.net.SocketFactory socketFactory40 = mongoClientOptions35.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = builder23.socketFactory(socketFactory40);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.connectionsPerHost(8402945);
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        com.mongodb.MongoClientOptions.Builder builder51 = builder46.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder54.build();
        boolean boolean58 = mongoClientOptions57.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory59 = mongoClientOptions57.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder60 = builder53.dbEncoderFactory(dBEncoderFactory59);
        com.mongodb.MongoClientOptions.Builder builder61 = builder41.dbEncoderFactory(dBEncoderFactory59);
        com.mongodb.MongoClientOptions.Builder builder62 = builder12.dbEncoderFactory(dBEncoderFactory59);
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.heartbeatThreadCount(262144);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20000 + "'", int37 == 20000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10000 + "'", int39 == 10000);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
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
        int int19 = mongoClientOptions18.getLocalThreshold();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("7fffffff");
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int11 = mongoProperties10.getDEFAULT_PORT();
        mongoProperties10.setHost("hi!");
        mongoProperties10.host = "";
        mongoProperties10.username = "100";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        boolean boolean22 = mongoClientOptions21.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory23 = mongoClientOptions21.getDbDecoderFactory();
        int int24 = mongoClientOptions21.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties10.builder(mongoClientOptions21);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.host;
        java.lang.String str28 = mongoProperties26.host;
        java.lang.Integer int29 = mongoProperties26.getPort();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean35 = mongoClientOptions33.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties26.builder(mongoClientOptions33);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties37.gridFsDatabase = "hi!";
        char[] charArray44 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties37.setPassword(charArray44);
        mongoProperties26.setPassword(charArray44);
        mongoProperties10.setPassword(charArray44);
        mongoProperties0.setPassword(charArray44);
        mongoProperties0.setAuthenticationDatabase("mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7fffffff" + "'", str9, "7fffffff");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[a, a, #, 4]");
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions3.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.host;
        org.springframework.core.env.Environment environment28 = null;
        int int29 = mongoProperties26.determinePort(environment28);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        boolean boolean34 = mongoClientOptions33.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory35 = mongoClientOptions33.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties26.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        int int41 = mongoClientOptions40.getMaxConnectionLifeTime();
        int int42 = mongoClientOptions40.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties26.builder(mongoClientOptions40);
        int int44 = mongoClientOptions40.getHeartbeatFrequency();
        boolean boolean45 = mongoClientOptions40.isCursorFinalizerEnabled();
        com.mongodb.ReadPreference readPreference46 = mongoClientOptions40.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder47 = builder14.readPreference(readPreference46);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.requiredReplicaSetName("2162000001");
        com.mongodb.MongoClientOptions.Builder builder51 = builder47.description("8");
        com.mongodb.MongoClientOptions.Builder builder53 = builder47.heartbeatSocketTimeout(0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties54 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int55 = mongoProperties54.getDEFAULT_PORT();
        mongoProperties54.setHost("hi!");
        mongoProperties54.host = "";
        com.mongodb.MongoClientOptions.Builder builder60 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder60.build();
        java.lang.String str64 = mongoClientOptions63.toString();
        int int65 = mongoClientOptions63.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder66 = mongoProperties54.builder(mongoClientOptions63);
        int int67 = mongoClientOptions63.getConnectTimeout();
        javax.net.SocketFactory socketFactory68 = mongoClientOptions63.getSocketFactory();
        int int69 = mongoClientOptions63.getSocketTimeout();
        com.mongodb.ReadPreference readPreference70 = mongoClientOptions63.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder71 = builder47.readPreference(readPreference70);
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 27017 + "'", int29 == 27017);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5000 + "'", int44 == 5000);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(readPreference46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 27017 + "'", int55 == 27017);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 20000 + "'", int65 == 20000);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10000 + "'", int67 == 10000);
        org.junit.Assert.assertNotNull(socketFactory68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(readPreference70);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions11.getLocalThreshold();
        int int15 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions11);
        mongoProperties0.setDatabase("1000111001000000000000000000");
        mongoProperties0.setAuthenticationDatabase("5000");
        boolean boolean21 = mongoProperties0.hasCustomAddress();
        java.lang.String str22 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) 4764);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.String str7 = mongoProperties0.getHost();
        char[] charArray8 = mongoProperties0.password;
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        int int14 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions13.getLocalThreshold();
        boolean boolean17 = mongoClientOptions13.isAlwaysUseMBeans();
        java.lang.String str18 = mongoClientOptions13.getRequiredReplicaSetName();
        java.lang.String str19 = mongoClientOptions13.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
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
        java.lang.String str25 = mongoClientOptions17.getRequiredReplicaSetName();
        java.lang.String str26 = mongoClientOptions17.getRequiredReplicaSetName();
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "22";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties7.setHost("");
        java.lang.String str10 = mongoProperties7.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isAlwaysUseMBeans();
        int int16 = mongoClientOptions14.getLocalThreshold();
        int int17 = mongoClientOptions14.getSocketTimeout();
        int int18 = mongoClientOptions14.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties7.builder(mongoClientOptions14);
        long long20 = mongoClientOptions14.getMaxAutoConnectRetryTime();
        int int21 = mongoClientOptions14.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference22 = mongoClientOptions14.getReadPreference();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient23 = mongoProperties0.createMongoClient(mongoClientOptions14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "test" + "'", str10, "test");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(readPreference22);
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        long long1 = java.lang.Integer.toUnsignedLong(3648);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3648L + "'", long1 == 3648L);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
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
        int int19 = mongoClientOptions9.getMaxConnectionIdleTime();
        int int20 = mongoClientOptions9.getAcceptableLatencyDifference();
        int int21 = mongoClientOptions9.getMinHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500 + "'", int21 == 500);
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        int int7 = mongoClientOptions3.getSocketTimeout();
        int int8 = mongoClientOptions3.getHeartbeatThreadCount();
        int int9 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        java.lang.String str2 = java.lang.Integer.toString(1856, (-161061274));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1856" + "'", str2, "1856");
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(128, 8054);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "128" + "'", str2, "128");
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        int int2 = java.lang.Integer.compareUnsigned(49284096, 524288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.clearPassword();
        java.lang.String str7 = mongoProperties0.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        java.lang.String str10 = mongoProperties8.host;
        java.lang.Integer int11 = mongoProperties8.getPort();
        mongoProperties8.setDatabase("11i71");
        java.lang.String str14 = mongoProperties8.username;
        java.lang.String str15 = mongoProperties8.getGridFsDatabase();
        mongoProperties8.clearPassword();
        mongoProperties8.database = "144";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties20.gridFsDatabase = "hi!";
        char[] charArray27 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties20.setPassword(charArray27);
        mongoProperties19.setPassword(charArray27);
        java.lang.String str30 = mongoProperties19.getHost();
        boolean boolean31 = mongoProperties19.hasCustomCredentials();
        mongoProperties19.username = "27017";
        mongoProperties19.authenticationDatabase = "4294967295";
        char[] charArray36 = mongoProperties19.getPassword();
        mongoProperties8.setPassword(charArray36);
        mongoProperties0.setPassword(charArray36);
        mongoProperties0.setGridFsDatabase("102886528");
        mongoProperties0.uri = "10000011001010111001001110001000";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[a, a, #, 4]");
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.threadsAllowedToBlockForConnectionMultiplier(8);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder20 = builder19.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        boolean boolean30 = mongoClientOptions28.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory31 = mongoClientOptions28.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder20.socketFactory(socketFactory31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder20.socketTimeout(25);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(7340545);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties37.setHost("");
        mongoProperties37.username = "100";
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.localThreshold(27017);
        java.lang.Class<?> wildcardClass45 = builder44.getClass();
        mongoProperties37.fieldNamingStrategy = wildcardClass45;
        mongoProperties37.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties49 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int50 = mongoProperties49.getDEFAULT_PORT();
        mongoProperties49.setHost("hi!");
        mongoProperties49.host = "";
        mongoProperties49.username = "100";
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        boolean boolean61 = mongoClientOptions60.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory62 = mongoClientOptions60.getDbDecoderFactory();
        int int63 = mongoClientOptions60.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties49.builder(mongoClientOptions60);
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties37.builder(mongoClientOptions60);
        int int66 = mongoClientOptions60.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory67 = mongoClientOptions60.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder34.dbEncoderFactory(dBEncoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder69 = builder12.dbEncoderFactory(dBEncoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.connectTimeout(10010000);
        com.mongodb.MongoClientOptions.Builder builder73 = builder69.minHeartbeatFrequency(33);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(socketFactory31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 27017 + "'", int50 == 27017);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 15 + "'", int63 == 15);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 20000 + "'", int66 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        int int2 = java.lang.Integer.rotateLeft((-2145648384), 1140850688);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2145648384) + "'", int2 == (-2145648384));
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
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
        com.mongodb.MongoClientOptions.Builder builder23 = builder2.dbDecoderFactory(dBDecoderFactory22);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        boolean boolean28 = mongoClientOptions27.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory29 = mongoClientOptions27.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder2.dbEncoderFactory(dBEncoderFactory29);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder43 = builder39.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxWaitTime(4);
        com.mongodb.MongoClientOptions.Builder builder47 = builder43.minConnectionsPerHost(20480000);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder52 = builder48.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder56 = builder55.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder60 = builder56.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder61 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions64 = builder61.build();
        boolean boolean66 = mongoClientOptions64.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory67 = mongoClientOptions64.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder56.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder69 = builder48.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder70 = builder47.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder71 = builder32.socketFactory(socketFactory67);
        com.mongodb.MongoClientOptions.Builder builder73 = builder71.localThreshold(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(mongoClientOptions64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(socketFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-2139080703));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str10 = mongoProperties9.host;
        org.springframework.core.env.Environment environment11 = null;
        int int12 = mongoProperties9.determinePort(environment11);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean17 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions16.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties9.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties9.builder(mongoClientOptions23);
        int int27 = mongoClientOptions23.getHeartbeatFrequency();
        boolean boolean28 = mongoClientOptions23.isCursorFinalizerEnabled();
        int int29 = mongoClientOptions23.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern30 = mongoClientOptions23.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder31 = builder8.writeConcern(writeConcern30);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.threadsAllowedToBlockForConnectionMultiplier(69);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.connectTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.acceptableLatencyDifference(135135296);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5000 + "'", int27 == 5000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1342177280 + "'", int29 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1136);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
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
        java.lang.String str16 = mongoClientOptions9.getDescription();
        long long17 = mongoClientOptions9.getMaxAutoConnectRetryTime();
        int int18 = mongoClientOptions9.getAcceptableLatencyDifference();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
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
        java.lang.String str18 = mongoProperties0.authenticationDatabase;
        java.lang.String str19 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100" + "'", str18, "100");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int6 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int7 = mongoClientOptions3.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
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
        mongoProperties0.setHost("1000111001000000000000000000");
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        boolean boolean29 = mongoClientOptions28.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory30 = mongoClientOptions28.getDbEncoderFactory();
        int int31 = mongoClientOptions28.getAcceptableLatencyDifference();
        javax.net.SocketFactory socketFactory32 = mongoClientOptions28.getSocketFactory();
        java.lang.String str33 = mongoClientOptions28.getDescription();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient34 = mongoProperties0.createMongoClient(mongoClientOptions28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        int int1 = java.lang.Integer.highestOneBit(14500645);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8388608 + "'", int1 == 8388608);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        boolean boolean9 = mongoClientOptions3.isAutoConnectRetry();
        int int10 = mongoClientOptions3.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionIdleTime();
        boolean boolean9 = mongoClientOptions5.isSocketKeepAlive();
        java.lang.String str10 = mongoClientOptions5.getRequiredReplicaSetName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.acceptableLatencyDifference(2200002);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketTimeout((int) '4');
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
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
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
        mongoProperties0.setDatabase("90");
        java.lang.String str22 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str23 = mongoProperties0.host;
        mongoProperties0.setHost("11100100000000000000000000001");
        int int26 = mongoProperties0.getDEFAULT_PORT();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "90" + "'", str22, "90");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27017 + "'", int26 == 27017);
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str9 = mongoProperties0.getHost();
        java.lang.Class<?> wildcardClass10 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(wildcardClass10);
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("1157627904");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1157627904");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("20000000434");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000000434\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        mongoProperties0.setUsername("37777777777");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(7340545);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties20.setHost("");
        mongoProperties20.username = "100";
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold(27017);
        java.lang.Class<?> wildcardClass28 = builder27.getClass();
        mongoProperties20.fieldNamingStrategy = wildcardClass28;
        mongoProperties20.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int33 = mongoProperties32.getDEFAULT_PORT();
        mongoProperties32.setHost("hi!");
        mongoProperties32.host = "";
        mongoProperties32.username = "100";
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean44 = mongoClientOptions43.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions43.getDbDecoderFactory();
        int int46 = mongoClientOptions43.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties32.builder(mongoClientOptions43);
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties20.builder(mongoClientOptions43);
        int int49 = mongoClientOptions43.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory50 = mongoClientOptions43.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder51 = builder17.dbEncoderFactory(dBEncoderFactory50);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str53 = mongoProperties52.getUri();
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder54.build();
        int int58 = mongoClientOptions57.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties52.builder(mongoClientOptions57);
        int int60 = mongoClientOptions57.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory61 = mongoClientOptions57.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder62 = builder51.dbEncoderFactory(dBEncoderFactory61);
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.alwaysUseMBeans(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder66 = builder64.heartbeatConnectRetryFrequency((-2093492383));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27017 + "'", int33 == 27017);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20000 + "'", int49 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "mongodb://localhost/test" + "'", str53, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        java.lang.String str1 = java.lang.Integer.toOctalString(4000000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "17204400" + "'", str1, "17204400");
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getMaxWaitTime();
        int int9 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int10 = mongoClientOptions3.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 120000 + "'", int8 == 120000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.gridFsDatabase = "hi!";
        boolean boolean15 = mongoProperties12.hasCustomAddress();
        java.lang.String str16 = mongoProperties12.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int18 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.setHost("hi!");
        mongoProperties17.host = "";
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        java.lang.String str27 = mongoClientOptions26.toString();
        int int28 = mongoClientOptions26.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties17.builder(mongoClientOptions26);
        int int30 = mongoClientOptions26.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties12.builder(mongoClientOptions26);
        java.lang.String str32 = mongoProperties12.host;
        char[] charArray33 = new char[] {};
        mongoProperties12.password = charArray33;
        mongoProperties0.password = charArray33;
        mongoProperties0.port = 86;
        java.lang.String str38 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "test" + "'", str16, "test");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[]");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern7 = mongoClientOptions3.getWriteConcern();
        int int8 = mongoClientOptions3.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertNotNull(writeConcern7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 120000 + "'", int8 == 120000);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
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
        int int16 = mongoClientOptions9.getConnectTimeout();
        java.lang.String str17 = mongoClientOptions9.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        java.lang.String str1 = java.lang.Integer.toOctalString(58376);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "162010" + "'", str1, "162010");
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("16384");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 16384");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties0.getHost();
        java.lang.String str13 = mongoProperties0.gridFsDatabase;
        int int14 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        int int2 = java.lang.Integer.remainderUnsigned(6257, 1832910848);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6257 + "'", int2 == 6257);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean17 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions16.getDbDecoderFactory();
        int int19 = mongoClientOptions16.getLocalThreshold();
        int int20 = mongoClientOptions16.getConnectionsPerHost();
        int int21 = mongoClientOptions16.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions16.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder23 = builder10.writeConcern(writeConcern22);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder25 = builder10.heartbeatSocketTimeout((-2147480000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
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
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        int int32 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int33 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions31.getLocalThreshold();
        int int35 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str36 = mongoClientOptions31.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions31.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder27.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder27.minHeartbeatFrequency(1100001);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder47 = builder41.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder49 = builder41.connectionsPerHost(28);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int51 = mongoProperties50.getDEFAULT_PORT();
        mongoProperties50.setHost("hi!");
        mongoProperties50.host = "";
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions59 = builder56.build();
        java.lang.String str60 = mongoClientOptions59.toString();
        int int61 = mongoClientOptions59.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties50.builder(mongoClientOptions59);
        int int63 = mongoClientOptions59.getConnectTimeout();
        javax.net.SocketFactory socketFactory64 = mongoClientOptions59.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder65 = builder41.socketFactory(socketFactory64);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions71 = builder68.build();
        com.mongodb.MongoClientOptions.Builder builder73 = builder68.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder75 = builder68.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder77 = builder68.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder78 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder80 = builder78.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions81 = builder78.build();
        int int82 = mongoClientOptions81.getMaxConnectionLifeTime();
        int int83 = mongoClientOptions81.getMaxConnectionLifeTime();
        int int84 = mongoClientOptions81.getLocalThreshold();
        int int85 = mongoClientOptions81.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str86 = mongoClientOptions81.getRequiredReplicaSetName();
        int int87 = mongoClientOptions81.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory88 = mongoClientOptions81.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder89 = builder68.dbDecoderFactory(dBDecoderFactory88);
        com.mongodb.MongoClientOptions.Builder builder90 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder92 = builder90.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions93 = builder90.build();
        boolean boolean94 = mongoClientOptions93.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory95 = mongoClientOptions93.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder96 = builder68.dbEncoderFactory(dBEncoderFactory95);
        com.mongodb.MongoClientOptions.Builder builder97 = builder65.dbEncoderFactory(dBEncoderFactory95);
        com.mongodb.MongoClientOptions.Builder builder98 = builder27.dbEncoderFactory(dBEncoderFactory95);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 27017 + "'", int51 == 27017);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClientOptions59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20000 + "'", int61 == 20000);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10000 + "'", int63 == 10000);
        org.junit.Assert.assertNotNull(socketFactory64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClientOptions71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(mongoClientOptions81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 15 + "'", int84 == 15);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5 + "'", int85 == 5);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 5000 + "'", int87 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory88);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(mongoClientOptions93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        mongoProperties0.setAuthenticationDatabase("0");
        mongoProperties0.uri = "1388";
        char[] charArray12 = mongoProperties0.getPassword();
        java.lang.String str13 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "";
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.Integer int7 = mongoProperties0.getPort();
        java.lang.Integer int8 = mongoProperties0.port;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("2147483648");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483648\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        boolean boolean10 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int11 = mongoClientOptions9.getConnectTimeout();
        int int12 = mongoClientOptions9.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("63", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 63");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int9 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int10 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int11 = mongoClientOptions3.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        java.lang.String str1 = java.lang.Integer.toOctalString(11010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "25402" + "'", str1, "25402");
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
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
        int int12 = mongoClientOptions6.getHeartbeatThreadCount();
        int int13 = mongoClientOptions6.getMaxWaitTime();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int15 = mongoProperties14.getDEFAULT_PORT();
        mongoProperties14.setHost("hi!");
        mongoProperties14.host = "";
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        java.lang.String str24 = mongoClientOptions23.toString();
        int int25 = mongoClientOptions23.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties14.builder(mongoClientOptions23);
        int int27 = mongoClientOptions23.getConnectTimeout();
        javax.net.SocketFactory socketFactory28 = mongoClientOptions23.getSocketFactory();
        int int29 = mongoClientOptions23.getSocketTimeout();
        java.lang.String str30 = mongoClientOptions23.getDescription();
        java.lang.String str31 = mongoClientOptions23.toString();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int33 = mongoProperties32.getDEFAULT_PORT();
        mongoProperties32.setHost("hi!");
        mongoProperties32.host = "";
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        java.lang.String str42 = mongoClientOptions41.toString();
        int int43 = mongoClientOptions41.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties32.builder(mongoClientOptions41);
        int int45 = mongoClientOptions41.getConnectTimeout();
        javax.net.SocketFactory socketFactory46 = mongoClientOptions41.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory47 = mongoClientOptions41.getDbDecoderFactory();
        int int48 = mongoClientOptions41.getHeartbeatThreadCount();
        int int49 = mongoClientOptions41.getAcceptableLatencyDifference();
        javax.net.SocketFactory socketFactory50 = mongoClientOptions41.getSocketFactory();
        boolean boolean51 = mongoClientOptions23.equals((java.lang.Object) socketFactory50);
        boolean boolean52 = mongoClientOptions6.equals((java.lang.Object) mongoClientOptions23);
        boolean boolean53 = mongoClientOptions23.isSocketKeepAlive();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10000 + "'", int27 == 10000);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27017 + "'", int33 == 27017);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10000 + "'", int45 == 10000);
        org.junit.Assert.assertNotNull(socketFactory46);
        org.junit.Assert.assertNotNull(dBDecoderFactory47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertNotNull(socketFactory50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
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
        int int13 = mongoClientOptions7.getLocalThreshold();
        int int14 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int15 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions7.getDbDecoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setGridFsDatabase("805306368");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        int int2 = java.lang.Integer.remainderUnsigned(72, (-2139070703));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "22";
        java.lang.String str7 = mongoProperties0.username;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.setHost("test");
        mongoProperties0.setAuthenticationDatabase("11i71");
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        boolean boolean20 = mongoClientOptions19.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory21 = mongoClientOptions19.getDbEncoderFactory();
        int int22 = mongoClientOptions19.getThreadsAllowedToBlockForConnectionMultiplier();
        int int23 = mongoClientOptions19.getAcceptableLatencyDifference();
        int int24 = mongoClientOptions19.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties0.builder(mongoClientOptions19);
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions19.getWriteConcern();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(writeConcern26);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        long long1 = java.lang.Integer.toUnsignedLong((-2006327552));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2288639744L + "'", long1 == 2288639744L);
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int8 = mongoClientOptions3.getLocalThreshold();
        int int9 = mongoClientOptions3.getMinConnectionsPerHost();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1342177280 + "'", int9 == 1342177280);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "20";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.getUri();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties11.builder(mongoClientOptions16);
        java.lang.String str19 = mongoProperties11.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        boolean boolean25 = mongoClientOptions23.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory26 = mongoClientOptions23.getSocketFactory();
        boolean boolean27 = mongoClientOptions23.isSocketKeepAlive();
        java.lang.Class<?> wildcardClass28 = mongoClientOptions23.getClass();
        mongoProperties11.fieldNamingStrategy = wildcardClass28;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties30.gridFsDatabase = "hi!";
        char[] charArray37 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties30.setPassword(charArray37);
        mongoProperties11.password = charArray37;
        mongoProperties0.setPassword(charArray37);
        org.springframework.core.env.Environment environment41 = null;
        int int42 = mongoProperties0.determinePort(environment41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        int int2 = java.lang.Integer.max(105, 1207959552);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1207959552 + "'", int2 == 1207959552);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
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
        int int17 = mongoClientOptions12.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        int int19 = mongoClientOptions12.getHeartbeatSocketTimeout();
        int int20 = mongoClientOptions12.getLocalThreshold();
        boolean boolean21 = mongoClientOptions12.isSocketKeepAlive();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.host;
        mongoProperties22.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass26 = mongoProperties22.fieldNamingStrategy;
        mongoProperties22.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.getUri();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        int int35 = mongoClientOptions34.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties29.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties22.builder(mongoClientOptions34);
        boolean boolean38 = mongoClientOptions34.isAlwaysUseMBeans();
        int int39 = mongoClientOptions34.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder43 = builder42.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder46 = builder45.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder48 = builder45.heartbeatSocketTimeout(69);
        boolean boolean49 = mongoClientOptions34.equals((java.lang.Object) builder48);
        javax.net.SocketFactory socketFactory50 = mongoClientOptions34.getSocketFactory();
        int int51 = mongoClientOptions34.getLocalThreshold();
        boolean boolean52 = mongoClientOptions12.equals((java.lang.Object) int51);
        javax.net.SocketFactory socketFactory53 = mongoClientOptions12.getSocketFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "mongodb://localhost/test" + "'", str30, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20000 + "'", int39 == 20000);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(socketFactory50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 15 + "'", int51 == 15);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(socketFactory53);
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
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
        mongoProperties0.setGridFsDatabase("803801");
        org.springframework.core.env.Environment environment32 = null;
        int int33 = mongoProperties0.determinePort(environment32);
        java.lang.String str34 = mongoProperties0.uri;
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27017 + "'", int33 == 27017);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "mongodb://localhost/test" + "'", str34, "mongodb://localhost/test");
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        int int2 = java.lang.Integer.compareUnsigned(80000, 268435472);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11101101111111010110000000001";
        int int10 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str11 = mongoProperties0.authenticationDatabase;
        java.lang.String str12 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.String str6 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        boolean boolean11 = mongoClientOptions10.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.gridFsDatabase = "hi!";
        char[] charArray20 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties13.setPassword(charArray20);
        mongoProperties12.setPassword(charArray20);
        boolean boolean23 = mongoClientOptions10.equals((java.lang.Object) mongoProperties12);
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.acceptableLatencyDifference(52);
        com.mongodb.MongoClientOptions.Builder builder27 = builder26.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatThreadCount(436207638);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setPort((java.lang.Integer) 796917760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) 5);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout(214748364);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean18 = mongoClientOptions16.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory19 = mongoClientOptions16.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions16.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder21 = builder8.dbDecoderFactory(dBDecoderFactory20);
        com.mongodb.MongoClientOptions.Builder builder23 = builder8.heartbeatConnectRetryFrequency(103872);
        com.mongodb.MongoClientOptions.Builder builder25 = builder8.minConnectionsPerHost(1879310336);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(socketFactory19);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
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
        mongoProperties0.setDatabase("90");
        java.lang.String str22 = mongoProperties0.getMongoClientDatabase();
        char[] charArray23 = mongoProperties0.password;
        boolean boolean24 = mongoProperties0.hasCustomCredentials();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "90" + "'", str22, "90");
        org.junit.Assert.assertNull(charArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
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
        com.mongodb.MongoClientOptions.Builder builder30 = builder25.heartbeatThreadCount(214748364);
        com.mongodb.MongoClientOptions.Builder builder32 = builder25.connectTimeout(1856);
        com.mongodb.ReadPreference readPreference33 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder34 = builder32.readPreference(readPreference33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
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
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("5000", (-2147363649));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147363649 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        long long1 = java.lang.Integer.toUnsignedLong((-1417281280));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2877686016L + "'", long1 == 2877686016L);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        int int11 = mongoClientOptions7.getLocalThreshold();
        int int12 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean13 = mongoClientOptions7.isAutoConnectRetry();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("524288", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 524288");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        mongoProperties0.setPassword(charArray16);
        mongoProperties0.setUri("1100001");
        java.lang.String str21 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions6.getLocalThreshold();
        boolean boolean10 = mongoClientOptions6.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions6.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketFactory(socketFactory11);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxConnectionIdleTime(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.username = "1";
        java.lang.Integer int7 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.setHost("test");
        mongoProperties0.setAuthenticationDatabase("11i71");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.getUri();
        char[] charArray18 = mongoProperties16.password;
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        boolean boolean23 = mongoClientOptions22.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions22.getDbDecoderFactory();
        int int25 = mongoClientOptions22.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties16.builder(mongoClientOptions22);
        int int27 = mongoClientOptions22.getLocalThreshold();
        int int28 = mongoClientOptions22.getMaxConnectionIdleTime();
        int int29 = mongoClientOptions22.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions22);
        boolean boolean31 = mongoClientOptions22.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
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
        java.lang.String str29 = mongoProperties0.getHost();
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        int int1 = java.lang.Integer.reverse(352256);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 434176 + "'", int1 == 434176);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
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
        boolean boolean16 = mongoClientOptions9.isAlwaysUseMBeans();
        int int17 = mongoClientOptions9.getHeartbeatConnectTimeout();
        long long18 = mongoClientOptions9.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
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
        boolean boolean16 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment17 = null;
        int int18 = mongoProperties0.determinePort(environment17);
        java.lang.String str19 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
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
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minHeartbeatFrequency(22);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxConnectionLifeTime(39304);
        com.mongodb.MongoClientOptions.Builder builder41 = builder37.acceptableLatencyDifference(52);
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
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        mongoProperties8.setPassword(charArray16);
        mongoProperties0.password = charArray16;
        java.lang.String str20 = mongoProperties0.getUri();
        java.lang.String str21 = mongoProperties0.getDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
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
        int int14 = mongoClientOptions9.getAcceptableLatencyDifference();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(524288);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "524288" + "'", str1, "524288");
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        java.lang.String str8 = mongoProperties0.database;
        java.lang.String str9 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1100001" + "'", str8, "1100001");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        int int2 = java.lang.Integer.remainderUnsigned(14, (-1610612736));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        java.lang.Integer int3 = mongoProperties0.getPort();
        char[] charArray4 = mongoProperties0.getPassword();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(charArray4);
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.port = 15;
        mongoProperties0.host = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.host;
        mongoProperties11.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass15 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.setAuthenticationDatabase("20");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.getUri();
        mongoProperties18.setPort((java.lang.Integer) (-1));
        java.lang.String str22 = mongoProperties18.getDatabase();
        java.lang.String str23 = mongoProperties18.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.host;
        mongoProperties24.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass28 = mongoProperties24.fieldNamingStrategy;
        java.lang.String str29 = mongoProperties24.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.getUri();
        char[] charArray32 = new char[] {};
        mongoProperties30.setPassword(charArray32);
        mongoProperties24.setPassword(charArray32);
        mongoProperties18.password = charArray32;
        mongoProperties11.password = charArray32;
        mongoProperties0.password = charArray32;
        java.lang.String str38 = mongoProperties0.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        int int43 = mongoClientOptions42.getMaxConnectionLifeTime();
        int int44 = mongoClientOptions42.getMaxConnectionLifeTime();
        int int45 = mongoClientOptions42.getLocalThreshold();
        boolean boolean46 = mongoClientOptions42.isAlwaysUseMBeans();
        java.lang.String str47 = mongoClientOptions42.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern48 = mongoClientOptions42.getWriteConcern();
        int int49 = mongoClientOptions42.getHeartbeatThreadCount();
        java.lang.String str50 = mongoClientOptions42.toString();
        int int51 = mongoClientOptions42.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions42);
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder56 = builder55.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder60 = builder56.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder64 = builder60.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder65 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder68 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions71 = builder68.build();
        int int72 = mongoClientOptions71.getMaxConnectionLifeTime();
        int int73 = mongoClientOptions71.getMaxConnectionLifeTime();
        int int74 = mongoClientOptions71.getLocalThreshold();
        boolean boolean75 = mongoClientOptions71.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory76 = mongoClientOptions71.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder77 = builder65.socketFactory(socketFactory76);
        com.mongodb.MongoClientOptions.Builder builder78 = builder60.socketFactory(socketFactory76);
        com.mongodb.MongoClientOptions.Builder builder79 = builder52.socketFactory(socketFactory76);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(writeConcern48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 500 + "'", int51 == 500);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClientOptions71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 15 + "'", int74 == 15);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(socketFactory76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties8.setHost("");
        mongoProperties8.username = "100";
        java.lang.String str13 = mongoProperties8.database;
        java.lang.Integer int14 = mongoProperties8.getPort();
        boolean boolean15 = mongoClientOptions3.equals((java.lang.Object) mongoProperties8);
        mongoProperties8.setUri("4000000");
        java.lang.String str18 = mongoProperties8.getGridFsDatabase();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        int int7 = mongoClientOptions3.getHeartbeatSocketTimeout();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        int int9 = mongoClientOptions3.getConnectTimeout();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(socketFactory11);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("298319873", 1100100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1100100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.host;
        mongoProperties18.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass22 = mongoProperties18.fieldNamingStrategy;
        java.lang.String str23 = mongoProperties18.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        com.mongodb.MongoClientOptions.Builder builder31 = builder26.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str33 = mongoProperties32.host;
        mongoProperties32.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass36 = mongoProperties32.fieldNamingStrategy;
        mongoProperties32.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str40 = mongoProperties39.getUri();
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        int int45 = mongoClientOptions44.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties39.builder(mongoClientOptions44);
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties32.builder(mongoClientOptions44);
        javax.net.SocketFactory socketFactory48 = mongoClientOptions44.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder49 = builder31.socketFactory(socketFactory48);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder49.build();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties18.builder(mongoClientOptions50);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str53 = mongoProperties52.host;
        org.springframework.core.env.Environment environment54 = null;
        int int55 = mongoProperties52.determinePort(environment54);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions59 = builder56.build();
        boolean boolean60 = mongoClientOptions59.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory61 = mongoClientOptions59.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties52.builder(mongoClientOptions59);
        com.mongodb.MongoClientOptions.Builder builder63 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions66 = builder63.build();
        int int67 = mongoClientOptions66.getMaxConnectionLifeTime();
        int int68 = mongoClientOptions66.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder69 = mongoProperties52.builder(mongoClientOptions66);
        int int70 = mongoClientOptions66.getHeartbeatFrequency();
        boolean boolean71 = mongoClientOptions66.isCursorFinalizerEnabled();
        int int72 = mongoClientOptions66.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern73 = mongoClientOptions66.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder74 = builder51.writeConcern(writeConcern73);
        com.mongodb.MongoClientOptions.Builder builder76 = builder51.acceptableLatencyDifference(1024);
        com.mongodb.MongoClientOptions.Builder builder77 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder79 = builder77.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions80 = builder77.build();
        int int81 = mongoClientOptions80.getMaxConnectionLifeTime();
        boolean boolean82 = mongoClientOptions80.isAutoConnectRetry();
        int int83 = mongoClientOptions80.getHeartbeatThreadCount();
        boolean boolean84 = mongoClientOptions80.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern85 = mongoClientOptions80.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder86 = builder51.writeConcern(writeConcern85);
        boolean boolean87 = mongoClientOptions15.equals((java.lang.Object) writeConcern85);
        com.mongodb.DBEncoderFactory dBEncoderFactory88 = mongoClientOptions15.getDbEncoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(wildcardClass36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "mongodb://localhost/test" + "'", str40, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(socketFactory48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 27017 + "'", int55 == 27017);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClientOptions59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(mongoClientOptions66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 5000 + "'", int70 == 5000);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1342177280 + "'", int72 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(mongoClientOptions80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(writeConcern85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory88);
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
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
        mongoProperties0.setHost("10c8e1");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.springframework.core.env.Environment environment10 = null;
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions9, environment10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(mongoClient11);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectTimeout(35);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        java.lang.String str16 = mongoClientOptions15.getDescription();
        int int17 = mongoClientOptions15.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 738197504 + "'", int17 == 738197504);
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        int int2 = java.lang.Integer.max(536870912, (-2147363649));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 536870912 + "'", int2 == 536870912);
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.getUri();
        char[] charArray9 = mongoProperties7.password;
        char[] charArray10 = mongoProperties7.password;
        char[] charArray11 = mongoProperties7.getPassword();
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
        int int28 = mongoClientOptions24.getConnectTimeout();
        int int29 = mongoClientOptions24.getConnectTimeout();
        int int30 = mongoClientOptions24.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties7.builder(mongoClientOptions24);
        char[] charArray32 = mongoProperties7.password;
        mongoProperties7.setAuthenticationDatabase("1100100");
        java.lang.String str35 = mongoProperties7.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str37 = mongoProperties36.host;
        java.lang.String str38 = mongoProperties36.host;
        java.lang.Integer int39 = mongoProperties36.getPort();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean45 = mongoClientOptions43.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties36.builder(mongoClientOptions43);
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties7.builder(mongoClientOptions43);
        java.lang.String str48 = mongoClientOptions43.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties0.builder(mongoClientOptions43);
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder50.build();
        boolean boolean54 = mongoClientOptions53.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory55 = mongoClientOptions53.getDbDecoderFactory();
        int int56 = mongoClientOptions53.getLocalThreshold();
        int int57 = mongoClientOptions53.getConnectionsPerHost();
        int int58 = mongoClientOptions53.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference59 = mongoClientOptions53.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder60 = builder49.readPreference(readPreference59);
        com.mongodb.DBDecoderFactory dBDecoderFactory61 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder62 = builder60.dbDecoderFactory(dBDecoderFactory61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10000 + "'", int28 == 10000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(charArray32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1100100" + "'", str35, "1100100");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 15 + "'", int56 == 15);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(readPreference59);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean9 = mongoClientOptions3.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        java.lang.String str1 = java.lang.Integer.toString(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "32" + "'", str1, "32");
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("109051904", 82595940);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 82595940 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("32004144513");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: String value 32004144513 exceeds range of unsigned int.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        int int2 = java.lang.Integer.sum(1388, 2048);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3436 + "'", int2 == 3436);
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.uri = "2162000001";
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        char[] charArray15 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.host;
        mongoProperties16.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass20 = mongoProperties16.fieldNamingStrategy;
        mongoProperties16.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str24 = mongoProperties23.getUri();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        int int29 = mongoClientOptions28.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties23.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties16.builder(mongoClientOptions28);
        int int32 = mongoClientOptions28.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern33 = mongoClientOptions28.getWriteConcern();
        int int34 = mongoClientOptions28.getLocalThreshold();
        com.mongodb.ReadPreference readPreference35 = mongoClientOptions28.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions28);
        java.lang.String str37 = mongoProperties0.getUri();
        java.lang.String str38 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb://localhost/test" + "'", str24, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(writeConcern33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(readPreference35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2162000001" + "'", str37, "2162000001");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.Integer int4 = mongoProperties0.getPort();
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setUri("20000007100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
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
        int int13 = mongoClientOptions3.getHeartbeatThreadCount();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder0.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
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
        int int13 = mongoClientOptions6.getHeartbeatThreadCount();
        int int14 = mongoClientOptions6.getHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5000 + "'", int14 == 5000);
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        long long1 = java.lang.Integer.toUnsignedLong((-649917440));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3645049856L + "'", long1 == 3645049856L);
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
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
        int int19 = mongoClientOptions9.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = builder7.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(5000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout(61);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.description("11610");
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.heartbeatThreadCount((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) 53182464);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int19 = mongoProperties18.getDEFAULT_PORT();
        mongoProperties18.setHost("hi!");
        mongoProperties18.host = "";
        mongoProperties18.username = "100";
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory31 = mongoClientOptions29.getDbDecoderFactory();
        int int32 = mongoClientOptions29.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties18.builder(mongoClientOptions29);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties35.gridFsDatabase = "hi!";
        char[] charArray42 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties35.setPassword(charArray42);
        mongoProperties34.setPassword(charArray42);
        mongoProperties18.password = charArray42;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str47 = mongoProperties46.host;
        mongoProperties46.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass50 = mongoProperties46.fieldNamingStrategy;
        java.lang.String str51 = mongoProperties46.getDatabase();
        java.lang.String str52 = mongoProperties46.getUsername();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.build();
        boolean boolean57 = mongoClientOptions56.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties58 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties59.gridFsDatabase = "hi!";
        char[] charArray66 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties59.setPassword(charArray66);
        mongoProperties58.setPassword(charArray66);
        boolean boolean69 = mongoClientOptions56.equals((java.lang.Object) mongoProperties58);
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties46.builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions.Builder builder71 = mongoProperties18.builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions.Builder builder73 = builder71.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder74 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder76 = builder74.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions77 = builder74.build();
        int int78 = mongoClientOptions77.getMaxConnectionLifeTime();
        int int79 = mongoClientOptions77.getMaxConnectionLifeTime();
        int int80 = mongoClientOptions77.getLocalThreshold();
        int int81 = mongoClientOptions77.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str82 = mongoClientOptions77.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern83 = mongoClientOptions77.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder84 = builder71.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder85 = builder17.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder87 = builder17.heartbeatThreadCount(947912705);
        com.mongodb.MongoClientOptions.Builder builder89 = builder87.cursorFinalizerEnabled(true);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoClientOptions77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 15 + "'", int80 == 15);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(writeConcern83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        long long1 = java.lang.Integer.toUnsignedLong(2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        java.lang.String str2 = java.lang.Integer.toString(2097152, 916455424);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2097152" + "'", str2, "2097152");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        boolean boolean10 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int11 = mongoClientOptions9.getConnectTimeout();
        int int12 = mongoClientOptions9.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        com.mongodb.MongoClientOptions.Builder builder6 = mongoProperties0.builder(mongoClientOptions5);
        mongoProperties0.setDatabase("");
        mongoProperties0.setHost("-129");
        boolean boolean11 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10010100000000000000000000000001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10010100000000000000000000000001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
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
        com.mongodb.MongoClientOptions.Builder builder25 = builder15.minConnectionsPerHost(20480000);
        com.mongodb.MongoClientOptions.Builder builder27 = builder15.description("");
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
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setUri("8");
        mongoProperties0.uri = "2162000001";
        java.lang.String str9 = mongoProperties0.getUri();
        java.lang.Class<?> wildcardClass10 = mongoProperties0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2162000001" + "'", str9, "2162000001");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.requiredReplicaSetName("369098752");
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        boolean boolean20 = mongoClientOptions19.isSocketKeepAlive();
        int int21 = mongoClientOptions19.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 105);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.dbEncoderFactory(dBEncoderFactory11);
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
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getHost();
        mongoProperties0.setGridFsDatabase("11610");
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("32004144513", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 32004144513");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("100000000000000000000000000", 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 97 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
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
        int int13 = mongoClientOptions7.getLocalThreshold();
        int int14 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int15 = mongoClientOptions7.getMaxConnectionLifeTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.connectTimeout(1100001);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
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
        int int17 = mongoClientOptions12.getAcceptableLatencyDifference();
        java.lang.String str18 = mongoClientOptions12.getDescription();
        int int19 = mongoClientOptions12.getMaxConnectionLifeTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        java.lang.String str4 = mongoProperties0.database;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.String str7 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.heartbeatThreadCount(107374182);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int16 = mongoProperties15.getDEFAULT_PORT();
        mongoProperties15.setHost("hi!");
        mongoProperties15.host = "";
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties15.builder(mongoClientOptions26);
        java.lang.String str28 = mongoProperties15.getHost();
        mongoProperties15.setUri("4e20");
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        int int35 = mongoClientOptions34.getMaxConnectionLifeTime();
        int int36 = mongoClientOptions34.getMaxConnectionLifeTime();
        boolean boolean37 = mongoClientOptions34.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties15.builder(mongoClientOptions34);
        int int39 = mongoClientOptions34.getMaxConnectionLifeTime();
        javax.net.SocketFactory socketFactory40 = mongoClientOptions34.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = builder14.socketFactory(socketFactory40);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.connectionsPerHost(65536);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.heartbeatFrequency(40);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatConnectRetryFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime(4);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.minConnectionsPerHost(20480000);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.minConnectionsPerHost(20);
        com.mongodb.MongoClientOptions.Builder builder18 = builder10.localThreshold(80804057);
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder20 = builder10.dbEncoderFactory(dBEncoderFactory19);
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
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
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
        boolean boolean11 = mongoProperties0.hasCustomCredentials();
        java.lang.String str12 = mongoProperties0.host;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties4.setHost("");
        mongoProperties4.username = "100";
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(27017);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        mongoProperties4.fieldNamingStrategy = wildcardClass12;
        mongoProperties0.fieldNamingStrategy = wildcardClass12;
        java.lang.String str15 = mongoProperties0.getHost();
        java.lang.Integer int16 = mongoProperties0.port;
        boolean boolean17 = mongoProperties0.hasCustomAddress();
        mongoProperties0.port = 49284096;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        java.lang.String str2 = java.lang.Integer.toString(1966071808, 1306597376);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1966071808" + "'", str2, "1966071808");
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-161061239));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11110110011001100110011010001001" + "'", str1, "11110110011001100110011010001001");
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        int int2 = java.lang.Integer.compare(11101, (-268435456));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties34.setHost("");
        java.lang.String str37 = mongoProperties34.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        boolean boolean42 = mongoClientOptions41.isAlwaysUseMBeans();
        int int43 = mongoClientOptions41.getLocalThreshold();
        int int44 = mongoClientOptions41.getSocketTimeout();
        int int45 = mongoClientOptions41.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties34.builder(mongoClientOptions41);
        long long47 = mongoClientOptions41.getMaxAutoConnectRetryTime();
        int int48 = mongoClientOptions41.getThreadsAllowedToBlockForConnectionMultiplier();
        int int49 = mongoClientOptions41.getThreadsAllowedToBlockForConnectionMultiplier();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient50 = mongoProperties0.createMongoClient(mongoClientOptions41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "test" + "'", str37, "test");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10000 + "'", int45 == 10000);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
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
        int int13 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions11.getLocalThreshold();
        int int15 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str16 = mongoClientOptions11.getRequiredReplicaSetName();
        int int17 = mongoClientOptions11.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.String str19 = mongoClientOptions11.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(4096, 58376);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4096" + "'", str2, "4096");
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        char[] charArray7 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions11.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        int int15 = mongoClientOptions11.getHeartbeatSocketTimeout();
        long long16 = mongoClientOptions11.getMaxAutoConnectRetryTime();
        int int17 = mongoClientOptions11.getSocketTimeout();
        int int18 = mongoClientOptions11.getMinHeartbeatFrequency();
        int int19 = mongoClientOptions11.getConnectionsPerHost();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        boolean boolean9 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions3.getDbEncoderFactory();
        int int11 = mongoClientOptions3.getConnectTimeout();
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties29.gridFsDatabase = "hi!";
        char[] charArray36 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties29.setPassword(charArray36);
        mongoProperties28.setPassword(charArray36);
        mongoProperties12.password = charArray36;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.host;
        mongoProperties40.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass44 = mongoProperties40.fieldNamingStrategy;
        java.lang.String str45 = mongoProperties40.getDatabase();
        java.lang.String str46 = mongoProperties40.getUsername();
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        boolean boolean51 = mongoClientOptions50.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties53.gridFsDatabase = "hi!";
        char[] charArray60 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties53.setPassword(charArray60);
        mongoProperties52.setPassword(charArray60);
        boolean boolean63 = mongoClientOptions50.equals((java.lang.Object) mongoProperties52);
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties40.builder(mongoClientOptions50);
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties12.builder(mongoClientOptions50);
        com.mongodb.DBDecoderFactory dBDecoderFactory66 = mongoClientOptions50.getDbDecoderFactory();
        boolean boolean67 = mongoClientOptions3.equals((java.lang.Object) dBDecoderFactory66);
        boolean boolean68 = mongoClientOptions3.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(dBDecoderFactory66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("3ne53", 1617323622);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1617323622 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(29188);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "29188" + "'", str1, "29188");
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        boolean boolean18 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions16.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.writeConcern(writeConcern19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatSocketTimeout(1388);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.connectionsPerHost(114610);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.requiredReplicaSetName("13");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
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
        boolean boolean17 = mongoClientOptions12.isSocketKeepAlive();
        int int18 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str19 = mongoClientOptions12.getRequiredReplicaSetName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
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
        int int12 = mongoClientOptions3.getMinConnectionsPerHost();
        int int13 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1342177280 + "'", int12 == 1342177280);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.getPort();
        char[] charArray7 = mongoProperties0.password;
        mongoProperties0.authenticationDatabase = "10010000";
        java.lang.String str10 = mongoProperties0.getUri();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        int int2 = java.lang.Integer.compare((-2012020736), 67108928);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder18 = builder10.maxAutoConnectRetryTime((long) 105);
        boolean boolean19 = mongoClientOptions3.equals((java.lang.Object) builder18);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder18.heartbeatThreadCount((-2139080703));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        int int2 = java.lang.Integer.divideUnsigned(1101, 16667143);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        int int2 = java.lang.Integer.rotateLeft(100668276, 803801);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-401866714) + "'", int2 == (-401866714));
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference6 = mongoClientOptions3.getReadPreference();
        int int7 = mongoClientOptions3.getSocketTimeout();
        boolean boolean8 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int9 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int10 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 500 + "'", int5 == 500);
        org.junit.Assert.assertNotNull(readPreference6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("frnpf", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: frnpf");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        int int2 = java.lang.Integer.max(1260000, 11610);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1260000 + "'", int2 == 1260000);
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
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
        mongoProperties0.setUri("16777216");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        org.springframework.core.env.Environment environment15 = null;
        int int16 = mongoProperties13.determinePort(environment15);
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.getUri();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties18.builder(mongoClientOptions23);
        java.lang.String str26 = mongoProperties18.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        boolean boolean32 = mongoClientOptions30.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory33 = mongoClientOptions30.getSocketFactory();
        boolean boolean34 = mongoClientOptions30.isSocketKeepAlive();
        java.lang.Class<?> wildcardClass35 = mongoClientOptions30.getClass();
        mongoProperties18.fieldNamingStrategy = wildcardClass35;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties37.gridFsDatabase = "hi!";
        char[] charArray44 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties37.setPassword(charArray44);
        mongoProperties18.password = charArray44;
        mongoProperties13.password = charArray44;
        mongoProperties0.password = charArray44;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(socketFactory33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[a, a, #, 4]");
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        int int1 = java.lang.Integer.highestOneBit((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        int int2 = java.lang.Integer.rotateLeft(0, 600000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
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
        mongoProperties0.authenticationDatabase = "test";
        boolean boolean20 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.clearPassword();
        mongoProperties0.port = (-1610612736);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("101100", 32768);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 32768 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.host;
        mongoProperties34.uri = "11100100000000000000000000001";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.host;
        mongoProperties38.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass42 = mongoProperties38.fieldNamingStrategy;
        java.lang.String str43 = mongoProperties38.getDatabase();
        mongoProperties38.port = 15;
        mongoProperties38.setUsername("27017");
        java.lang.String str48 = mongoProperties38.getUri();
        mongoProperties38.setUri("80803801");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int52 = mongoProperties51.getDEFAULT_PORT();
        mongoProperties51.setHost("hi!");
        java.lang.String str55 = mongoProperties51.getUri();
        mongoProperties51.database = "mongodb://localhost/test";
        java.lang.String str58 = mongoProperties51.getMongoClientDatabase();
        java.lang.String str59 = mongoProperties51.gridFsDatabase;
        java.lang.String str60 = mongoProperties51.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties61 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties61.gridFsDatabase = "hi!";
        boolean boolean64 = mongoProperties61.hasCustomAddress();
        java.lang.String str65 = mongoProperties61.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties66 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties66.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties69 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int70 = mongoProperties69.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties71 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int72 = mongoProperties71.getDEFAULT_PORT();
        mongoProperties71.setHost("hi!");
        mongoProperties71.host = "";
        mongoProperties71.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties79 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties80 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties80.gridFsDatabase = "hi!";
        char[] charArray87 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties80.setPassword(charArray87);
        mongoProperties79.setPassword(charArray87);
        mongoProperties71.setPassword(charArray87);
        mongoProperties69.password = charArray87;
        mongoProperties66.password = charArray87;
        mongoProperties61.setPassword(charArray87);
        mongoProperties51.setPassword(charArray87);
        mongoProperties38.password = charArray87;
        mongoProperties34.setPassword(charArray87);
        mongoProperties0.password = charArray87;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "mongodb://localhost/test" + "'", str48, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 27017 + "'", int52 == 27017);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "mongodb://localhost/test" + "'", str55, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "mongodb://localhost/test" + "'", str58, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "test" + "'", str65, "test");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 27017 + "'", int70 == 27017);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 27017 + "'", int72 == 27017);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[a, a, #, 4]");
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties4.setHost("");
        mongoProperties4.username = "100";
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(27017);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        mongoProperties4.fieldNamingStrategy = wildcardClass12;
        mongoProperties0.fieldNamingStrategy = wildcardClass12;
        java.lang.String str15 = mongoProperties0.getHost();
        java.lang.Integer int16 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("109051904");
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        boolean boolean23 = mongoClientOptions22.isAlwaysUseMBeans();
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions22.getDbDecoderFactory();
        boolean boolean25 = mongoClientOptions22.isCursorFinalizerEnabled();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions22.getWriteConcern();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient27 = mongoProperties0.createMongoClient(mongoClientOptions22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(writeConcern26);
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setHost("");
        mongoProperties0.setUsername("7fffffff");
        mongoProperties0.username = "499100673";
        java.lang.String str13 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("20000007100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000007100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("65571");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 65571");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int19 = mongoProperties18.getDEFAULT_PORT();
        mongoProperties18.setHost("hi!");
        mongoProperties18.host = "";
        mongoProperties18.username = "100";
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory31 = mongoClientOptions29.getDbDecoderFactory();
        int int32 = mongoClientOptions29.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties18.builder(mongoClientOptions29);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties35.gridFsDatabase = "hi!";
        char[] charArray42 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties35.setPassword(charArray42);
        mongoProperties34.setPassword(charArray42);
        mongoProperties18.password = charArray42;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str47 = mongoProperties46.host;
        mongoProperties46.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass50 = mongoProperties46.fieldNamingStrategy;
        java.lang.String str51 = mongoProperties46.getDatabase();
        java.lang.String str52 = mongoProperties46.getUsername();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.build();
        boolean boolean57 = mongoClientOptions56.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties58 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties59.gridFsDatabase = "hi!";
        char[] charArray66 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties59.setPassword(charArray66);
        mongoProperties58.setPassword(charArray66);
        boolean boolean69 = mongoClientOptions56.equals((java.lang.Object) mongoProperties58);
        com.mongodb.MongoClientOptions.Builder builder70 = mongoProperties46.builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions.Builder builder71 = mongoProperties18.builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions.Builder builder73 = builder71.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder74 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder76 = builder74.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions77 = builder74.build();
        int int78 = mongoClientOptions77.getMaxConnectionLifeTime();
        int int79 = mongoClientOptions77.getMaxConnectionLifeTime();
        int int80 = mongoClientOptions77.getLocalThreshold();
        int int81 = mongoClientOptions77.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str82 = mongoClientOptions77.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern83 = mongoClientOptions77.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder84 = builder71.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder85 = builder17.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder87 = builder17.heartbeatThreadCount(947912705);
        com.mongodb.MongoClientOptions.Builder builder88 = builder17.legacyDefaults();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoClientOptions77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 15 + "'", int80 == 15);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 5 + "'", int81 == 5);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(writeConcern83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("58376", 20000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 20000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatSocketTimeout(4);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.build();
        int int9 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int10 = mongoClientOptions8.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions8.getLocalThreshold();
        int int12 = mongoClientOptions8.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str13 = mongoClientOptions8.getRequiredReplicaSetName();
        int int14 = mongoClientOptions8.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions8.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions8.getDbDecoderFactory();
        int int17 = mongoClientOptions8.getMaxConnectionLifeTime();
        long long18 = mongoClientOptions8.getMaxAutoConnectRetryTime();
        java.lang.String str19 = mongoClientOptions8.toString();
        javax.net.SocketFactory socketFactory20 = mongoClientOptions8.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder21 = builder0.socketFactory(socketFactory20);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5000 + "'", int14 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
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
        mongoProperties0.database = "1c000000";
        java.lang.String str33 = mongoProperties0.username;
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getHost();
        mongoProperties0.setGridFsDatabase("11610");
        mongoProperties0.port = (-805306361);
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
        mongoProperties0.setPassword(charArray27);
        mongoProperties0.gridFsDatabase = "105";
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
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
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold(27017);
        java.lang.Class<?> wildcardClass8 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass8;
        mongoProperties0.setDatabase("");
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder4.maxAutoConnectRetryTime(0L);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minHeartbeatFrequency(107);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minHeartbeatFrequency(605440);
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
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(19584512);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "19584512" + "'", str1, "19584512");
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        mongoProperties13.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass17 = mongoProperties13.fieldNamingStrategy;
        java.lang.String str18 = mongoProperties13.getDatabase();
        boolean boolean19 = mongoProperties13.hasCustomCredentials();
        boolean boolean20 = mongoProperties13.hasCustomAddress();
        char[] charArray23 = new char[] { '4', '4' };
        mongoProperties13.password = charArray23;
        mongoProperties0.password = charArray23;
        java.lang.String str26 = mongoProperties0.getDatabase();
        int int27 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str28 = mongoProperties0.getMongoClientDatabase();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[4, 4]");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "test" + "'", str28, "test");
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("23", (-2147363649));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147363649 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        int int5 = mongoClientOptions3.getAcceptableLatencyDifference();
        com.mongodb.DBDecoderFactory dBDecoderFactory6 = mongoClientOptions3.getDbDecoderFactory();
        int int7 = mongoClientOptions3.getMinHeartbeatFrequency();
        int int8 = mongoClientOptions3.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 738197504);
        mongoProperties0.authenticationDatabase = "5";
        java.lang.Class<?> wildcardClass10 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.uri = "3";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass10);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        int int2 = java.lang.Integer.sum((-2139080703), 7050496);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2132030207) + "'", int2 == (-2132030207));
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setGridFsDatabase("100");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str5 = mongoProperties4.host;
        mongoProperties4.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass8 = mongoProperties4.fieldNamingStrategy;
        mongoProperties4.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.getUri();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties11.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties4.builder(mongoClientOptions16);
        int int20 = mongoClientOptions16.getConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions16.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions16);
        java.lang.Integer int23 = mongoProperties0.getPort();
        java.lang.String str24 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
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
        java.lang.String str14 = mongoProperties0.getAuthenticationDatabase();
        int int15 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str16 = mongoProperties0.getUsername();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        mongoProperties0.port = 1342177280;
        mongoProperties0.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        java.lang.Integer int20 = mongoProperties12.getPort();
        java.lang.String str21 = mongoProperties12.getHost();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        boolean boolean27 = mongoClientOptions25.equals((java.lang.Object) (-2147483648));
        int int28 = mongoClientOptions25.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory29 = mongoClientOptions25.getDbDecoderFactory();
        int int30 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties12.builder(mongoClientOptions25);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties33.gridFsDatabase = "hi!";
        char[] charArray40 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties33.setPassword(charArray40);
        mongoProperties32.setPassword(charArray40);
        char[] charArray43 = mongoProperties32.getPassword();
        mongoProperties12.password = charArray43;
        mongoProperties0.password = charArray43;
        mongoProperties0.setDatabase("6");
        java.lang.String str48 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "mongodb://localhost/test" + "'", str48, "mongodb://localhost/test");
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        int int2 = java.lang.Integer.divideUnsigned(1176610106, (-2145648384));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getDatabase();
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.setHost("-1610612736");
        mongoProperties0.uri = "10000";
        java.lang.Integer int14 = mongoProperties0.getPort();
        char[] charArray15 = mongoProperties0.password;
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(charArray15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean9 = mongoClientOptions3.isSocketKeepAlive();
        int int10 = mongoClientOptions3.getMinConnectionsPerHost();
        java.lang.String str11 = mongoClientOptions3.getRequiredReplicaSetName();
        java.lang.String str12 = mongoClientOptions3.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1342177280 + "'", int10 == 1342177280);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern8 = mongoClientOptions3.getWriteConcern();
        boolean boolean9 = mongoClientOptions3.isAutoConnectRetry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(writeConcern8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10c8e1");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        int int2 = java.lang.Integer.rotateRight(1798517552, 88130000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 858811187 + "'", int2 == 858811187);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        int int2 = java.lang.Integer.compare(42112, (-2147483336));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        char[] charArray8 = mongoProperties0.getPassword();
        java.lang.String str9 = mongoProperties0.host;
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions3.getDbEncoderFactory();
        int int9 = mongoClientOptions3.getHeartbeatSocketTimeout();
        boolean boolean10 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int11 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
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
        int int55 = mongoClientOptions38.getMinHeartbeatFrequency();
        int int56 = mongoClientOptions38.getMinConnectionsPerHost();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 500 + "'", int55 == 500);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1342177280 + "'", int56 == 1342177280);
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
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
        java.lang.String str25 = mongoProperties0.database;
        java.lang.Integer int26 = mongoProperties0.port;
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(116100000, 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4na000" + "'", str2, "4na000");
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
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
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.localThreshold(35);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.description("11610");
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder37 = builder31.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder43 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        int int50 = mongoClientOptions49.getMaxConnectionLifeTime();
        int int51 = mongoClientOptions49.getMaxConnectionLifeTime();
        int int52 = mongoClientOptions49.getLocalThreshold();
        int int53 = mongoClientOptions49.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str54 = mongoClientOptions49.getRequiredReplicaSetName();
        int int55 = mongoClientOptions49.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference56 = mongoClientOptions49.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder57 = builder43.readPreference(readPreference56);
        com.mongodb.MongoClientOptions.Builder builder58 = builder30.readPreference(readPreference56);
        boolean boolean59 = mongoClientOptions3.equals((java.lang.Object) readPreference56);
        int int60 = mongoClientOptions3.getConnectTimeout();
        int int61 = mongoClientOptions3.getConnectTimeout();
        int int62 = mongoClientOptions3.getMaxWaitTime();
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
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
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 15 + "'", int52 == 15);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5000 + "'", int55 == 5000);
        org.junit.Assert.assertNotNull(readPreference56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 10000 + "'", int60 == 10000);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10000 + "'", int61 == 10000);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 120000 + "'", int62 == 120000);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("98bd90", 170910000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 170910000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties0.getHost();
        mongoProperties0.setPort((java.lang.Integer) 11534336);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("12000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"12000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("4000000000", 452984832);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 452984832 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        java.lang.String str2 = java.lang.Integer.toString(8054, 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16f8" + "'", str2, "16f8");
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.uri = "10";
        char[] charArray10 = mongoProperties0.getPassword();
        mongoProperties0.gridFsDatabase = "1c";
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean17 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions16.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory19 = mongoClientOptions16.getSocketFactory();
        int int20 = mongoClientOptions16.getHeartbeatSocketTimeout();
        org.springframework.core.env.Environment environment21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient22 = mongoProperties0.createMongoClient(mongoClientOptions16, environment21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertNotNull(socketFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean9 = mongoClientOptions3.isSocketKeepAlive();
        int int10 = mongoClientOptions3.getMinConnectionsPerHost();
        java.lang.String str11 = mongoClientOptions3.getRequiredReplicaSetName();
        int int12 = mongoClientOptions3.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1342177280 + "'", int10 == 1342177280);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        int int2 = java.lang.Integer.min((int) (short) -1, 6257);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        int int2 = java.lang.Integer.compare(29364232, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("4521984", 1140850688);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1140850688 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        int int1 = java.lang.Integer.parseInt("1359872");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1359872 + "'", int1 == 1359872);
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("26", 65368);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 65368 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
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
        mongoProperties0.setUri("10000000001");
        mongoProperties0.authenticationDatabase = "69";
        java.lang.String str22 = mongoProperties0.uri;
        java.lang.String str23 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10000000001" + "'", str22, "10000000001");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1010101101011000000000000000010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1010101101011000000000000000010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.port = 15;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str10 = mongoProperties9.host;
        java.lang.String str11 = mongoProperties9.host;
        java.lang.Integer int12 = mongoProperties9.getPort();
        mongoProperties9.setDatabase("11i71");
        mongoProperties9.port = 2147483647;
        mongoProperties9.port = 1342177280;
        mongoProperties9.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.getUri();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        int int27 = mongoClientOptions26.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties21.builder(mongoClientOptions26);
        java.lang.Integer int29 = mongoProperties21.getPort();
        java.lang.String str30 = mongoProperties21.getHost();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        boolean boolean36 = mongoClientOptions34.equals((java.lang.Object) (-2147483648));
        int int37 = mongoClientOptions34.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory38 = mongoClientOptions34.getDbDecoderFactory();
        int int39 = mongoClientOptions34.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties21.builder(mongoClientOptions34);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties42.gridFsDatabase = "hi!";
        char[] charArray49 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties42.setPassword(charArray49);
        mongoProperties41.setPassword(charArray49);
        char[] charArray52 = mongoProperties41.getPassword();
        mongoProperties21.password = charArray52;
        mongoProperties9.password = charArray52;
        mongoProperties0.password = charArray52;
        char[] charArray56 = mongoProperties0.password;
        java.lang.String str57 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(int29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 500 + "'", int39 == 500);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(97);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getHeartbeatConnectRetryFrequency();
        int int17 = mongoClientOptions14.getConnectTimeout();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str19 = mongoClientOptions14.getDescription();
        com.mongodb.DBEncoderFactory dBEncoderFactory20 = mongoClientOptions14.getDbEncoderFactory();
        int int21 = mongoClientOptions14.getAcceptableLatencyDifference();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions14.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder8.dbDecoderFactory(dBDecoderFactory22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder8.minConnectionsPerHost(369098752);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 500 + "'", int16 == 500);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(dBEncoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        java.lang.String str9 = mongoProperties0.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.host;
        java.lang.String str12 = mongoProperties10.host;
        java.lang.String str13 = mongoProperties10.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        mongoProperties14.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass18 = mongoProperties14.fieldNamingStrategy;
        java.lang.String str19 = mongoProperties14.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str21 = mongoProperties20.getUri();
        char[] charArray22 = new char[] {};
        mongoProperties20.setPassword(charArray22);
        mongoProperties14.setPassword(charArray22);
        mongoProperties10.setPassword(charArray22);
        mongoProperties0.password = charArray22;
        java.lang.String str27 = mongoProperties0.getUri();
        mongoProperties0.database = "8";
        java.lang.String str30 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[]");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb://localhost/test" + "'", str27, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
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
        int int30 = mongoClientOptions23.getAcceptableLatencyDifference();
        boolean boolean31 = mongoClientOptions23.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference32 = mongoClientOptions23.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory33 = mongoClientOptions23.getDbDecoderFactory();
        java.lang.String str34 = mongoClientOptions23.getDescription();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(readPreference32);
        org.junit.Assert.assertNotNull(dBDecoderFactory33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        java.lang.String str1 = java.lang.Integer.toString((-2147480000));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-2147480000" + "'", str1, "-2147480000");
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        java.lang.String str2 = java.lang.Integer.toString(41014, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "41014" + "'", str2, "41014");
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.host;
        java.lang.String str24 = mongoProperties22.host;
        java.lang.Integer int25 = mongoProperties22.getPort();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean31 = mongoClientOptions29.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties22.builder(mongoClientOptions29);
        int int33 = mongoClientOptions29.getThreadsAllowedToBlockForConnectionMultiplier();
        int int34 = mongoClientOptions29.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern35 = mongoClientOptions29.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder36 = builder21.writeConcern(writeConcern35);
        com.mongodb.MongoClientOptions.Builder builder38 = builder21.heartbeatFrequency(1071000000);
        com.mongodb.MongoClientOptions.Builder builder40 = builder21.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.socketKeepAlive(false);
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
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 120000 + "'", int34 == 120000);
        org.junit.Assert.assertNotNull(writeConcern35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties6.gridFsDatabase = "hi!";
        char[] charArray13 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties6.setPassword(charArray13);
        mongoProperties5.setPassword(charArray13);
        boolean boolean16 = mongoClientOptions3.equals((java.lang.Object) mongoProperties5);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions20.getLocalThreshold();
        int int24 = mongoClientOptions20.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str25 = mongoClientOptions20.getRequiredReplicaSetName();
        int int26 = mongoClientOptions20.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference27 = mongoClientOptions20.getReadPreference();
        int int28 = mongoClientOptions20.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties5.builder(mongoClientOptions20);
        java.lang.String str30 = mongoProperties5.getGridFsDatabase();
        mongoProperties5.setDatabase("478150657");
        mongoProperties5.authenticationDatabase = "27017";
        java.lang.String str35 = mongoProperties5.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5000 + "'", int26 == 5000);
        org.junit.Assert.assertNotNull(readPreference27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10000 + "'", int28 == 10000);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "478150657" + "'", str35, "478150657");
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        long long1 = java.lang.Integer.toUnsignedLong((-1073741824));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 3221225472L + "'", long1 == 3221225472L);
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
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
        com.mongodb.MongoClientOptions.Builder builder23 = builder2.dbDecoderFactory(dBDecoderFactory22);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        boolean boolean28 = mongoClientOptions27.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory29 = mongoClientOptions27.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder2.dbEncoderFactory(dBEncoderFactory29);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.threadsAllowedToBlockForConnectionMultiplier(6086926);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.maxWaitTime(1100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder38 = builder34.heartbeatConnectRetryFrequency((-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        int int2 = java.lang.Integer.divideUnsigned((-2147480000), (-1140523008));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(41, (-2100483648));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "41" + "'", str2, "41");
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        int int2 = java.lang.Integer.rotateLeft((-1033373947), 67108864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1033373947) + "'", int2 == (-1033373947));
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        int int2 = java.lang.Integer.sum(100011, 1798517552);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1798617563 + "'", int2 == 1798617563);
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(97);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.minHeartbeatFrequency(1744830464);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder11.heartbeatConnectTimeout(16777216);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder26 = builder20.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder28 = builder20.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        int int35 = mongoClientOptions34.getMaxConnectionLifeTime();
        int int36 = mongoClientOptions34.getMaxConnectionLifeTime();
        int int37 = mongoClientOptions34.getLocalThreshold();
        int int38 = mongoClientOptions34.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions34.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder28.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder11.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder6.dbEncoderFactory(dBEncoderFactory39);
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
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
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
        mongoProperties0.setGridFsDatabase("803801");
        java.lang.String str32 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "100" + "'", str32, "100");
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.database;
        java.lang.String str12 = mongoProperties0.host;
        int int13 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        java.lang.String str1 = java.lang.Integer.toBinaryString(67108928);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000000000000000001000000" + "'", str1, "100000000000000000001000000");
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.Class<?> wildcardClass13 = mongoClientOptions11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder13 = builder8.socketTimeout((int) (byte) 10);
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
        javax.net.SocketFactory socketFactory30 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder13.socketFactory(socketFactory30);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.acceptableLatencyDifference(74579968);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.heartbeatSocketTimeout(300000000);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        java.lang.String str1 = java.lang.Integer.toString(60076865);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "60076865" + "'", str1, "60076865");
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.alwaysUseMBeans(false);
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
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.setUri("11010");
        java.lang.String str9 = mongoProperties0.username;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.description("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder20 = builder15.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str22 = mongoProperties21.host;
        mongoProperties21.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass25 = mongoProperties21.fieldNamingStrategy;
        mongoProperties21.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.getUri();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions33);
        javax.net.SocketFactory socketFactory37 = mongoClientOptions33.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder38 = builder20.socketFactory(socketFactory37);
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        boolean boolean43 = mongoClientOptions42.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory44 = mongoClientOptions42.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder38.dbEncoderFactory(dBEncoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder46 = builder10.dbEncoderFactory(dBEncoderFactory44);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties47.setHost("");
        mongoProperties47.username = "100";
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.localThreshold(27017);
        java.lang.Class<?> wildcardClass55 = builder54.getClass();
        mongoProperties47.fieldNamingStrategy = wildcardClass55;
        mongoProperties47.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties59 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int60 = mongoProperties59.getDEFAULT_PORT();
        mongoProperties59.setHost("hi!");
        mongoProperties59.host = "";
        mongoProperties59.username = "100";
        com.mongodb.MongoClientOptions.Builder builder67 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder67.build();
        boolean boolean71 = mongoClientOptions70.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory72 = mongoClientOptions70.getDbDecoderFactory();
        int int73 = mongoClientOptions70.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties59.builder(mongoClientOptions70);
        com.mongodb.MongoClientOptions.Builder builder75 = mongoProperties47.builder(mongoClientOptions70);
        int int76 = mongoClientOptions70.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory77 = mongoClientOptions70.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder78 = builder10.dbEncoderFactory(dBEncoderFactory77);
        com.mongodb.MongoClientOptions.Builder builder79 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder81 = builder79.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions82 = builder79.build();
        boolean boolean83 = mongoClientOptions82.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory84 = mongoClientOptions82.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory85 = mongoClientOptions82.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder86 = builder78.socketFactory(socketFactory85);
        com.mongodb.MongoClientOptions.Builder builder88 = builder86.heartbeatConnectRetryFrequency(107);
        com.mongodb.MongoClientOptions.Builder builder90 = builder86.maxConnectionLifeTime(69);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "mongodb://localhost/test" + "'", str29, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(socketFactory37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 27017 + "'", int60 == 27017);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 15 + "'", int73 == 15);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 20000 + "'", int76 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoClientOptions82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory84);
        org.junit.Assert.assertNotNull(socketFactory85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("111", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 111");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        int int2 = java.lang.Integer.rotateRight(109051904, 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1610612735) + "'", int2 == (-1610612735));
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder20.build();
        int int22 = mongoClientOptions21.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 120000 + "'", int22 == 120000);
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        mongoProperties0.setUri("hi!");
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray10 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions14.getLocalThreshold();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str19 = mongoClientOptions14.getRequiredReplicaSetName();
        int int20 = mongoClientOptions14.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference21 = mongoClientOptions14.getReadPreference();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions14.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions14);
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5000 + "'", int20 == 5000);
        org.junit.Assert.assertNotNull(readPreference21);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        long long1 = java.lang.Integer.toUnsignedLong(6257);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 6257L + "'", long1 == 6257L);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        long long1 = java.lang.Integer.toUnsignedLong(102886528);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 102886528L + "'", long1 == 102886528L);
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        boolean boolean8 = mongoClientOptions3.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        int int2 = java.lang.Integer.min(11101, (-2145648384));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2145648384) + "'", int2 == (-2145648384));
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) 5);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout(214748364);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean17 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder28 = builder22.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder30 = builder22.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.heartbeatThreadCount(100);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatThreadCount(637534208);
        java.lang.Class<?> wildcardClass35 = builder30.getClass();
        boolean boolean36 = mongoClientOptions16.equals((java.lang.Object) wildcardClass35);
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions16.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder38 = builder8.readPreference(readPreference37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxAutoConnectRetryTime(3489660935L);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder40.build();
        boolean boolean42 = mongoClientOptions41.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        int int1 = java.lang.Integer.signum(6086926);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        int int1 = java.lang.Integer.bitCount(55);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.host;
        java.lang.String str31 = mongoProperties29.host;
        java.lang.Integer int32 = mongoProperties29.getPort();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        boolean boolean38 = mongoClientOptions36.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties29.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions36);
        java.lang.Class<?> wildcardClass41 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str42 = mongoProperties0.getDatabase();
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
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        int int1 = java.lang.Integer.numberOfTrailingZeros(524288000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
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
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder41 = builder35.minConnectionsPerHost(11010);
        com.mongodb.MongoClientOptions.Builder builder43 = builder35.requiredReplicaSetName("20007000401");
        com.mongodb.MongoClientOptions.Builder builder45 = builder35.maxConnectionLifeTime(6086926);
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
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("3648", 100011);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100011 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        int int1 = java.lang.Integer.numberOfLeadingZeros(5000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(486539264);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "486539264" + "'", str1, "486539264");
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        int int2 = java.lang.Integer.remainderUnsigned(764, (-1811939327));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 764 + "'", int2 == 764);
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("17204400", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 17204400");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        int int2 = java.lang.Integer.min(1073741828, 268435456);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 268435456 + "'", int2 == 268435456);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.acceptableLatencyDifference(214748364);
        com.mongodb.MongoClientOptions.Builder builder16 = builder6.heartbeatConnectTimeout(15);
        com.mongodb.MongoClientOptions.Builder builder18 = builder6.autoConnectRetry(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(1100001);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxConnectionIdleTime(811393294);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(writeConcern14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        int int11 = mongoClientOptions7.getLocalThreshold();
        int int12 = mongoClientOptions7.getConnectionsPerHost();
        int int13 = mongoClientOptions7.getHeartbeatConnectTimeout();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions7.getSocketFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(socketFactory14);
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        int int1 = java.lang.Integer.bitCount(1100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties6.gridFsDatabase = "hi!";
        char[] charArray13 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties6.setPassword(charArray13);
        mongoProperties5.setPassword(charArray13);
        boolean boolean16 = mongoClientOptions3.equals((java.lang.Object) mongoProperties5);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions20.getLocalThreshold();
        int int24 = mongoClientOptions20.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str25 = mongoClientOptions20.getRequiredReplicaSetName();
        int int26 = mongoClientOptions20.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference27 = mongoClientOptions20.getReadPreference();
        int int28 = mongoClientOptions20.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties5.builder(mongoClientOptions20);
        java.lang.String str30 = mongoProperties5.getGridFsDatabase();
        java.lang.Class<?> wildcardClass31 = mongoProperties5.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5000 + "'", int26 == 5000);
        org.junit.Assert.assertNotNull(readPreference27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10000 + "'", int28 == 10000);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions5.getMaxWaitTime();
        int int10 = mongoClientOptions5.getAcceptableLatencyDifference();
        int int11 = mongoClientOptions5.getMinConnectionsPerHost();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1342177280 + "'", int11 == 1342177280);
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.getHost();
        char[] charArray10 = mongoProperties0.password;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(charArray10);
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        char[] charArray14 = new char[] { '#', 'a', '#', '4', 'a', ' ' };
        mongoProperties0.password = charArray14;
        java.lang.Class<?> wildcardClass16 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setDatabase("107");
        mongoProperties0.uri = "2d5a";
        java.lang.String str21 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, 4, a,  ]");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        mongoProperties0.setUri("10");
        java.lang.Integer int7 = mongoProperties0.getPort();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str9 = mongoProperties8.host;
        mongoProperties8.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass12 = mongoProperties8.fieldNamingStrategy;
        java.lang.String str13 = mongoProperties8.getDatabase();
        boolean boolean14 = mongoProperties8.hasCustomCredentials();
        boolean boolean15 = mongoProperties8.hasCustomAddress();
        char[] charArray18 = new char[] { '4', '4' };
        mongoProperties8.password = charArray18;
        mongoProperties0.password = charArray18;
        java.lang.String str21 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[4, 4]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100" + "'", str21, "100");
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        int int2 = java.lang.Integer.remainderUnsigned(1087635456, 478150657);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 131334142 + "'", int2 == 131334142);
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.port;
        boolean boolean7 = mongoProperties0.hasCustomAddress();
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
        boolean boolean26 = mongoClientOptions22.isAutoConnectRetry();
        boolean boolean27 = mongoClientOptions22.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions22);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.host;
        java.lang.String str31 = mongoProperties29.host;
        java.lang.Integer int32 = mongoProperties29.getPort();
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        boolean boolean38 = mongoClientOptions36.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties29.builder(mongoClientOptions36);
        int int40 = mongoClientOptions36.getThreadsAllowedToBlockForConnectionMultiplier();
        int int41 = mongoClientOptions36.getMaxWaitTime();
        java.lang.String str42 = mongoClientOptions36.toString();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties0.builder(mongoClientOptions36);
        int int44 = mongoClientOptions36.getLocalThreshold();
        boolean boolean45 = mongoClientOptions36.isAutoConnectRetry();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 5 + "'", int40 == 5);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 120000 + "'", int41 == 120000);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        com.mongodb.MongoClientOptions.Builder builder6 = mongoProperties0.builder(mongoClientOptions5);
        mongoProperties0.setAuthenticationDatabase("60076865");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
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
        int int17 = mongoClientOptions9.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions9.getWriteConcern();
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions9.getDbDecoderFactory();
        int int20 = mongoClientOptions9.getAcceptableLatencyDifference();
        int int21 = mongoClientOptions9.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        int int2 = java.lang.Integer.compare((-2147483364), (-973078528));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        int int2 = java.lang.Integer.min(114610, (-534787520));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-534787520) + "'", int2 == (-534787520));
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        java.lang.Integer int1 = java.lang.Integer.getInteger("376832");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        int int2 = java.lang.Integer.min(99, 524288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.host = "2";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str9 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.getUri();
        mongoProperties0.setGridFsDatabase("");
        mongoProperties0.gridFsDatabase = "107";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.getUri();
        char[] charArray12 = mongoProperties10.password;
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean17 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions16.getDbDecoderFactory();
        int int19 = mongoClientOptions16.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties10.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions16);
        java.lang.String str22 = mongoClientOptions16.toString();
        int int23 = mongoClientOptions16.getMinHeartbeatFrequency();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 500 + "'", int23 == 500);
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        boolean boolean9 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int10 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int11 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        boolean boolean12 = mongoClientOptions3.isAutoConnectRetry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("220", 444);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 444 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.setPort((java.lang.Integer) 0);
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        mongoProperties0.setPassword(charArray16);
        java.lang.String str19 = mongoProperties0.getUsername();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions23.getLocalThreshold();
        int int27 = mongoClientOptions23.getMaxConnectionIdleTime();
        int int28 = mongoClientOptions23.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxAutoConnectRetryTime(0L);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder31.build();
        com.mongodb.MongoClientOptions.Builder builder34 = builder31.maxConnectionLifeTime(1610612736);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
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
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions23.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder28 = builder10.writeConcern(writeConcern27);
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder33 = builder29.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder37 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder41 = builder37.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        boolean boolean47 = mongoClientOptions45.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory48 = mongoClientOptions45.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder49 = builder37.socketFactory(socketFactory48);
        com.mongodb.MongoClientOptions.Builder builder50 = builder29.socketFactory(socketFactory48);
        com.mongodb.MongoClientOptions.Builder builder51 = builder10.socketFactory(socketFactory48);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.cursorFinalizerEnabled(true);
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
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(socketFactory48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        int int2 = java.lang.Integer.rotateLeft(218103808, 282);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3407872 + "'", int2 == 3407872);
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.getUri();
        mongoProperties0.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int9 = mongoProperties8.getDEFAULT_PORT();
        mongoProperties8.setHost("hi!");
        mongoProperties8.host = "1100001";
        char[] charArray14 = mongoProperties8.getPassword();
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
        com.mongodb.WriteConcern writeConcern31 = mongoClientOptions27.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties8.builder(mongoClientOptions27);
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions27);
        mongoProperties0.clearPassword();
        java.lang.Integer int35 = mongoProperties0.getPort();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "mongodb://localhost/test" + "'", str23, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(writeConcern31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(int35);
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        int int10 = mongoClientOptions3.getMinConnectionsPerHost();
        int int11 = mongoClientOptions3.getSocketTimeout();
        javax.net.SocketFactory socketFactory12 = mongoClientOptions3.getSocketFactory();
        int int13 = mongoClientOptions3.getMinHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions3.getReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1342177280 + "'", int10 == 1342177280);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(socketFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertNotNull(readPreference14);
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("a0000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        int int2 = java.lang.Integer.remainderUnsigned(103872, (-1346368000));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103872 + "'", int2 == 103872);
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("8");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout(7340545);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("10462210000", 536);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 536 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.String str7 = mongoProperties0.getHost();
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("7fffffff");
        mongoProperties0.setUsername("11000100000000000000000000001001");
        mongoProperties0.setPort((java.lang.Integer) 24584435);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
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
        java.lang.String str14 = mongoProperties0.getAuthenticationDatabase();
        int int15 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.port = (-1610612736);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder20.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder23.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.heartbeatThreadCount((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder30 = builder26.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient32 = mongoProperties0.createMongoClient(mongoClientOptions31);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        int int1 = java.lang.Integer.parseUnsignedInt("20480000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20480000 + "'", int1 == 20480000);
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        java.lang.String str1 = java.lang.Integer.toString(416);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "416" + "'", str1, "416");
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.acceptableLatencyDifference(5);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatConnectRetryFrequency(524288000);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatConnectTimeout(256);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectTimeout(100);
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
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) (-1));
        java.lang.String str4 = mongoProperties0.getDatabase();
        java.lang.String str5 = mongoProperties0.host;
        java.lang.String str6 = mongoProperties0.getDatabase();
        char[] charArray7 = mongoProperties0.password;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.connectTimeout(2);
        java.lang.Class<?> wildcardClass9 = builder4.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass9;
        mongoProperties0.gridFsDatabase = "8001d4bf";
        boolean boolean13 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.getUri();
        char[] charArray16 = mongoProperties14.password;
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean21 = mongoClientOptions20.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions20.getDbDecoderFactory();
        int int23 = mongoClientOptions20.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties14.builder(mongoClientOptions20);
        boolean boolean25 = mongoClientOptions20.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions20.getWriteConcern();
        int int27 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions20);
        boolean boolean29 = mongoClientOptions20.isAutoConnectRetry();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(writeConcern26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(162, 807862272);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "162" + "'", str2, "162");
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("20000011610");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000011610\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
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
        mongoProperties0.authenticationDatabase = "1c";
        java.lang.String str39 = mongoProperties0.getHost();
        java.lang.String str40 = mongoProperties0.authenticationDatabase;
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
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1c" + "'", str40, "1c");
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        java.lang.String str12 = mongoClientOptions9.getRequiredReplicaSetName();
        java.lang.String str13 = mongoClientOptions9.getRequiredReplicaSetName();
        int int14 = mongoClientOptions9.getMinConnectionsPerHost();
        java.lang.String str15 = mongoClientOptions9.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 65536);
        java.lang.String str8 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str9 = mongoProperties0.getUri();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        java.lang.String str1 = java.lang.Integer.toOctalString(38);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "46" + "'", str1, "46");
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
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
        boolean boolean11 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.connectionsPerHost(10000);
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.heartbeatSocketTimeout(144);
        boolean boolean21 = mongoClientOptions3.equals((java.lang.Object) builder20);
        int int22 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 67108864);
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
        int int25 = mongoClientOptions21.getConnectTimeout();
        int int26 = mongoClientOptions21.getConnectTimeout();
        int int27 = mongoClientOptions21.getConnectionsPerHost();
        long long28 = mongoClientOptions21.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions21);
        org.springframework.core.env.Environment environment30 = null;
        int int31 = mongoProperties0.determinePort(environment30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1100001" + "'", str6, "1100001");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 67108864 + "'", int31 == 67108864);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.port = 15;
        mongoProperties0.host = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.host;
        mongoProperties11.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass15 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.setAuthenticationDatabase("20");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.getUri();
        mongoProperties18.setPort((java.lang.Integer) (-1));
        java.lang.String str22 = mongoProperties18.getDatabase();
        java.lang.String str23 = mongoProperties18.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.host;
        mongoProperties24.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass28 = mongoProperties24.fieldNamingStrategy;
        java.lang.String str29 = mongoProperties24.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.getUri();
        char[] charArray32 = new char[] {};
        mongoProperties30.setPassword(charArray32);
        mongoProperties24.setPassword(charArray32);
        mongoProperties18.password = charArray32;
        mongoProperties11.password = charArray32;
        mongoProperties0.password = charArray32;
        java.lang.String str38 = mongoProperties0.gridFsDatabase;
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        int int43 = mongoClientOptions42.getMaxConnectionLifeTime();
        int int44 = mongoClientOptions42.getMaxConnectionLifeTime();
        int int45 = mongoClientOptions42.getLocalThreshold();
        boolean boolean46 = mongoClientOptions42.isAlwaysUseMBeans();
        java.lang.String str47 = mongoClientOptions42.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern48 = mongoClientOptions42.getWriteConcern();
        int int49 = mongoClientOptions42.getHeartbeatThreadCount();
        java.lang.String str50 = mongoClientOptions42.toString();
        int int51 = mongoClientOptions42.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions42);
        int int53 = mongoClientOptions42.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(writeConcern48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 500 + "'", int51 == 500);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 500 + "'", int53 == 500);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        int int2 = java.lang.Integer.compareUnsigned((-2146433022), 327680000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("11i71", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 11i71");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
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
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int31 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int32 = mongoClientOptions29.getLocalThreshold();
        int int33 = mongoClientOptions29.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str34 = mongoClientOptions29.getRequiredReplicaSetName();
        int int35 = mongoClientOptions29.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference36 = mongoClientOptions29.getReadPreference();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions29.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder7.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.heartbeatFrequency(131334142);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5000 + "'", int35 == 5000);
        org.junit.Assert.assertNotNull(readPreference36);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }
}

