import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test06501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06501");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        mongoProperties0.uri = "11i71";
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime(176L);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder9.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions10);
        java.lang.String str13 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test06502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06502");
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
        java.lang.String str19 = mongoProperties0.getUri();
        java.lang.Class<?> wildcardClass20 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4e20" + "'", str19, "4e20");
        org.junit.Assert.assertNull(wildcardClass20);
    }

    @Test
    public void test06503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06503");
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
        java.lang.String str16 = mongoProperties0.username;
        mongoProperties0.authenticationDatabase = "a0000000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
    }

    @Test
    public void test06504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06504");
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
        int int14 = mongoClientOptions9.getMaxWaitTime();
        java.lang.String str15 = mongoClientOptions9.toString();
        java.lang.String str16 = mongoClientOptions9.getDescription();
        int int17 = mongoClientOptions9.getSocketTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test06505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06505");
        java.lang.String str1 = java.lang.Integer.toString(8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8" + "'", str1, "8");
    }

    @Test
    public void test06506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06506");
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
        com.mongodb.MongoClientOptions.Builder builder36 = builder30.heartbeatConnectRetryFrequency(7);
        com.mongodb.MongoClientOptions.Builder builder38 = builder30.localThreshold(49284096);
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
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test06507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06507");
        int int2 = java.lang.Integer.divideUnsigned(1100101, 100100070);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06508");
        int int2 = java.lang.Integer.rotateLeft(14500645, 1071013312);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14500645 + "'", int2 == 14500645);
    }

    @Test
    public void test06509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06509");
        java.lang.String str1 = java.lang.Integer.toString((-1509949440));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1509949440" + "'", str1, "-1509949440");
    }

    @Test
    public void test06510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06510");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions5.getMinHeartbeatFrequency();
        boolean boolean10 = mongoClientOptions5.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        java.lang.String str15 = mongoClientOptions14.toString();
        int int16 = mongoClientOptions14.getHeartbeatFrequency();
        int int17 = mongoClientOptions14.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions14.getDbEncoderFactory();
        boolean boolean19 = mongoClientOptions5.equals((java.lang.Object) mongoClientOptions14);
        int int20 = mongoClientOptions5.getMaxWaitTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5000 + "'", int16 == 5000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
    }

    @Test
    public void test06511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06511");
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
        int int18 = mongoClientOptions15.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder25 = builder19.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder27 = builder19.autoConnectRetry(false);
        boolean boolean28 = mongoClientOptions15.equals((java.lang.Object) false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test06512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06512");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder2.heartbeatThreadCount(324);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test06513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06513");
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
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.maxAutoConnectRetryTime((long) 436207638);
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
    }

    @Test
    public void test06514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06514");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(298319873);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatThreadCount(193135264);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatThreadCount((-804206260));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
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
    public void test06515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06515");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost((-1530789132));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
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
    public void test06516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06516");
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
        java.lang.String str18 = mongoClientOptions9.getDescription();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test06517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06517");
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
        boolean boolean16 = mongoClientOptions12.isAlwaysUseMBeans();
        int int17 = mongoClientOptions12.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions12.getDbDecoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
    }

    @Test
    public void test06518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06518");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        char[] charArray5 = mongoProperties0.password;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test06519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06519");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int4 = mongoProperties3.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        mongoProperties5.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties13.setPassword(charArray21);
        mongoProperties5.setPassword(charArray21);
        mongoProperties3.password = charArray21;
        mongoProperties0.password = charArray21;
        java.lang.String str27 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        boolean boolean32 = mongoClientOptions31.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory33 = mongoClientOptions31.getDbEncoderFactory();
        int int34 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        int int35 = mongoClientOptions31.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions31);
        int int37 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Integer int38 = mongoProperties0.port;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1342177280 + "'", int35 == 1342177280);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 27017 + "'", int37 == 27017);
        org.junit.Assert.assertNull(int38);
    }

    @Test
    public void test06520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06520");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass12 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test06521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06521");
        java.lang.String str2 = java.lang.Integer.toString(1798617563, (-534787520));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1798617563" + "'", str2, "1798617563");
    }

    @Test
    public void test06522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06522");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        long long11 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        java.lang.String str12 = mongoClientOptions10.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test06523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06523");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.connectTimeout(40000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int20 = mongoProperties19.getDEFAULT_PORT();
        mongoProperties19.setHost("hi!");
        mongoProperties19.host = "1100001";
        char[] charArray25 = mongoProperties19.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.host;
        mongoProperties26.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass30 = mongoProperties26.fieldNamingStrategy;
        mongoProperties26.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str34 = mongoProperties33.getUri();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        int int39 = mongoClientOptions38.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties33.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties26.builder(mongoClientOptions38);
        com.mongodb.WriteConcern writeConcern42 = mongoClientOptions38.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties19.builder(mongoClientOptions38);
        int int44 = mongoClientOptions38.getMinConnectionsPerHost();
        int int45 = mongoClientOptions38.getMaxConnectionIdleTime();
        int int46 = mongoClientOptions38.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern47 = mongoClientOptions38.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder48 = builder16.writeConcern(writeConcern47);
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
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "mongodb://localhost/test" + "'", str34, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(writeConcern42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1342177280 + "'", int44 == 1342177280);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 500 + "'", int46 == 500);
        org.junit.Assert.assertNotNull(writeConcern47);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test06524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06524");
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
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getMaxConnectionLifeTime();
        int int29 = mongoClientOptions27.getMaxConnectionLifeTime();
        int int30 = mongoClientOptions27.getLocalThreshold();
        boolean boolean31 = mongoClientOptions27.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory32 = mongoClientOptions27.getSocketFactory();
        javax.net.SocketFactory socketFactory33 = mongoClientOptions27.getSocketFactory();
        int int34 = mongoClientOptions27.getMaxConnectionIdleTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory35 = mongoClientOptions27.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder23.dbDecoderFactory(dBDecoderFactory35);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxConnectionIdleTime(100100070);
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertNotNull(socketFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test06525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06525");
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
        int int21 = mongoClientOptions12.getMinConnectionsPerHost();
        int int22 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions12.getReadPreference();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1342177280 + "'", int21 == 1342177280);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(readPreference23);
    }

    @Test
    public void test06526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06526");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1010");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06527");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        long long11 = mongoClientOptions9.getMaxAutoConnectRetryTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions9.getDbEncoderFactory();
        int int13 = mongoClientOptions9.getConnectTimeout();
        int int14 = mongoClientOptions9.getHeartbeatConnectTimeout();
        int int15 = mongoClientOptions9.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
    }

    @Test
    public void test06528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06528");
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
        char[] charArray20 = mongoProperties0.password;
        mongoProperties0.setUri("8402945");
        mongoProperties0.setPort((java.lang.Integer) 444);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(charArray20);
    }

    @Test
    public void test06529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06529");
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
        javax.net.SocketFactory socketFactory12 = mongoClientOptions7.getSocketFactory();
        int int13 = mongoClientOptions7.getMinHeartbeatFrequency();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(socketFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
    }

    @Test
    public void test06530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06530");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "20";
        char[] charArray11 = mongoProperties0.password;
        mongoProperties0.setDatabase("6989");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test06531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06531");
        int int1 = java.lang.Integer.parseInt("316197090");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 316197090 + "'", int1 == 316197090);
    }

    @Test
    public void test06532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06532");
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
        java.lang.Integer int23 = mongoProperties0.port;
        java.lang.String str24 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test06533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06533");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder4.maxAutoConnectRetryTime(0L);
        com.mongodb.MongoClientOptions.Builder builder18 = builder4.heartbeatConnectTimeout(1440351);
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
    public void test06534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06534");
        int int1 = java.lang.Integer.bitCount((-1989607424));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test06535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06535");
        int int1 = java.lang.Integer.reverseBytes(1081082373);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 84045888 + "'", int1 == 84045888);
    }

    @Test
    public void test06536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06536");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions6.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions6.getLocalThreshold();
        boolean boolean10 = mongoClientOptions6.isAlwaysUseMBeans();
        java.lang.String str11 = mongoClientOptions6.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern12 = mongoClientOptions6.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder13 = builder0.writeConcern(writeConcern12);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.heartbeatSocketTimeout(2200002);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.threadsAllowedToBlockForConnectionMultiplier((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minHeartbeatFrequency(37289984);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatThreadCount(469827712);
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getMaxConnectionLifeTime();
        int int29 = mongoClientOptions27.getMaxConnectionLifeTime();
        int int30 = mongoClientOptions27.getLocalThreshold();
        int int31 = mongoClientOptions27.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str32 = mongoClientOptions27.getRequiredReplicaSetName();
        int int33 = mongoClientOptions27.getHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference34 = mongoClientOptions27.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder35 = builder23.readPreference(readPreference34);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(writeConcern12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5000 + "'", int33 == 5000);
        org.junit.Assert.assertNotNull(readPreference34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test06537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06537");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatConnectRetryFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.minConnectionsPerHost((int) (byte) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test06538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06538");
        int int1 = java.lang.Integer.highestOneBit(11234);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8192 + "'", int1 == 8192);
    }

    @Test
    public void test06539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06539");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.gridFsDatabase = "1157627904";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test06540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06540");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1207959552", 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1207959552\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06541");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 97;
        mongoProperties0.setPort((java.lang.Integer) 298319873);
        java.lang.String str9 = mongoProperties0.host;
        char[] charArray10 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray10);
    }

    @Test
    public void test06542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06542");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11610";
        java.lang.String str15 = mongoProperties0.authenticationDatabase;
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.authenticationDatabase = "110121132";
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test06543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06543");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("", 41);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06544");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.alwaysUseMBeans(false);
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
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions33.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder20.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder39 = builder9.writeConcern(writeConcern37);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder41 = builder39.minHeartbeatFrequency((-1819798618));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
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
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test06545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06545");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10100110000000000000000000000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06546");
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
        mongoProperties0.uri = "21004600200";
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
    }

    @Test
    public void test06547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06547");
        int int1 = java.lang.Integer.reverseBytes(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 419430400 + "'", int1 == 419430400);
    }

    @Test
    public void test06548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06548");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        long long11 = mongoClientOptions9.getMaxAutoConnectRetryTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions9.getDbEncoderFactory();
        int int13 = mongoClientOptions9.getConnectTimeout();
        boolean boolean14 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean17 = mongoClientOptions9.equals((java.lang.Object) 22);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1100001 + "'", int15 == 1100001);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test06549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06549");
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
        int int14 = mongoClientOptions13.getAcceptableLatencyDifference();
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
    public void test06550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06550");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder0.acceptableLatencyDifference(792740645);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder11.threadsAllowedToBlockForConnectionMultiplier((-2146433022));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
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
    public void test06551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06551");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder2.threadsAllowedToBlockForConnectionMultiplier(20000);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxWaitTime(16384);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatFrequency(4096);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test06552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06552");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        int int12 = mongoClientOptions7.getMaxWaitTime();
        boolean boolean13 = mongoClientOptions7.isSocketKeepAlive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06553");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("27017");
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.threadsAllowedToBlockForConnectionMultiplier(500);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder10.build();
        com.mongodb.MongoClientOptions.Builder builder17 = builder10.connectTimeout(8000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test06554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06554");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectionsPerHost(16384);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test06555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("305ce10e");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 305ce10e");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06556");
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
        mongoProperties0.database = "";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
    }

    @Test
    public void test06557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06557");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.database = "10001000000100110000000010000000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
    }

    @Test
    public void test06558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06558");
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
        java.lang.String str30 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment31 = null;
        int int32 = mongoProperties0.determinePort(environment31);
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "mongodb://localhost/test" + "'", str30, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27017 + "'", int32 == 27017);
    }

    @Test
    public void test06559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06559");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        java.lang.String str9 = mongoClientOptions3.getDescription();
        int int10 = mongoClientOptions3.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test06560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06560");
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
        int int14 = mongoClientOptions9.getHeartbeatSocketTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.getUri();
        char[] charArray17 = mongoProperties15.password;
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        boolean boolean22 = mongoClientOptions21.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory23 = mongoClientOptions21.getDbDecoderFactory();
        int int24 = mongoClientOptions21.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties15.builder(mongoClientOptions21);
        java.lang.String str26 = mongoProperties15.database;
        boolean boolean27 = mongoClientOptions9.equals((java.lang.Object) str26);
        java.lang.String str28 = mongoClientOptions9.getDescription();
        int int29 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        int int30 = mongoClientOptions9.getMaxWaitTime();
        int int31 = mongoClientOptions9.getHeartbeatSocketTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 120000 + "'", int30 == 120000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
    }

    @Test
    public void test06561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06561");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str14 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06562");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(20480128);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20480128" + "'", str1, "20480128");
    }

    @Test
    public void test06563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("f4010000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"f4010000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06564");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions3.getDbDecoderFactory();
        int int9 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
    }

    @Test
    public void test06565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06565");
        int int2 = java.lang.Integer.rotateLeft(1795162112, (-2132030207));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-704643072) + "'", int2 == (-704643072));
    }

    @Test
    public void test06566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06566");
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
        com.mongodb.MongoClientOptions.Builder builder42 = builder38.requiredReplicaSetName("18");
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
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test06567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06567");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "";
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.Integer int7 = mongoProperties0.getPort();
        java.lang.String str8 = mongoProperties0.getHost();
        java.lang.Class<?> wildcardClass9 = mongoProperties0.fieldNamingStrategy;
        boolean boolean10 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test06568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06568");
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
        int int14 = mongoClientOptions9.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory15 = mongoClientOptions9.getDbEncoderFactory();
        java.lang.String str16 = mongoClientOptions9.getDescription();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions9.getWriteConcern();
        int int18 = mongoClientOptions9.getAcceptableLatencyDifference();
        int int19 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        int int20 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
    }

    @Test
    public void test06569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06569");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectTimeout(2);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.heartbeatConnectRetryFrequency(176);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions11.getLocalThreshold();
        boolean boolean15 = mongoClientOptions11.isAlwaysUseMBeans();
        int int16 = mongoClientOptions11.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions11.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder7.dbDecoderFactory(dBDecoderFactory17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectionsPerHost(6989);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06570");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06571");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.String str8 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06572");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        mongoProperties0.authenticationDatabase = "803801";
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "803801" + "'", str16, "803801");
    }

    @Test
    public void test06573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06573");
        int int1 = java.lang.Integer.parseUnsignedInt("16777216");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16777216 + "'", int1 == 16777216);
    }

    @Test
    public void test06574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06574");
        int int1 = java.lang.Integer.parseInt("6144");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6144 + "'", int1 == 6144);
    }

    @Test
    public void test06575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06575");
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
        mongoProperties0.setDatabase("69");
        java.lang.Class<?> wildcardClass25 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10000000001" + "'", str22, "10000000001");
        org.junit.Assert.assertNull(wildcardClass25);
    }

    @Test
    public void test06576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06576");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1100001", (-649917440));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -649917440 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06577");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        java.lang.String str10 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
    }

    @Test
    public void test06578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06578");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(42112);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "42112" + "'", str1, "42112");
    }

    @Test
    public void test06579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06579");
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
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.threadsAllowedToBlockForConnectionMultiplier(120000);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.requiredReplicaSetName("11i71");
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder30 = builder26.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.connectTimeout(30);
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
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test06580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06580");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int10 = mongoProperties9.getDEFAULT_PORT();
        mongoProperties9.setHost("hi!");
        java.lang.String str13 = mongoProperties9.getUri();
        mongoProperties9.port = 20000;
        char[] charArray16 = null;
        mongoProperties9.setPassword(charArray16);
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
        mongoProperties9.setPassword(charArray42);
        mongoProperties0.setPassword(charArray42);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
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
    }

    @Test
    public void test06581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06581");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("20000000434");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000000434\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06582");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
    }

    @Test
    public void test06583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06583");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions3.getReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertNotNull(readPreference9);
    }

    @Test
    public void test06584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06584");
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
        java.lang.String str25 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 536);
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
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test06585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06585");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime(10);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder21 = builder13.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxAutoConnectRetryTime((long) 5);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.heartbeatSocketTimeout(214748364);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean31 = mongoClientOptions29.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory32 = mongoClientOptions29.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory33 = mongoClientOptions29.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder21.dbDecoderFactory(dBDecoderFactory33);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str36 = mongoProperties35.getUri();
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        int int41 = mongoClientOptions40.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties35.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder46 = builder42.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder50 = builder49.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder54 = builder50.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions58 = builder55.build();
        boolean boolean60 = mongoClientOptions58.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory61 = mongoClientOptions58.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder62 = builder50.socketFactory(socketFactory61);
        com.mongodb.MongoClientOptions.Builder builder64 = builder50.socketTimeout(25);
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder67 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder67.build();
        int int71 = mongoClientOptions70.getMaxConnectionLifeTime();
        int int72 = mongoClientOptions70.getMaxConnectionLifeTime();
        int int73 = mongoClientOptions70.getLocalThreshold();
        int int74 = mongoClientOptions70.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str75 = mongoClientOptions70.getRequiredReplicaSetName();
        int int76 = mongoClientOptions70.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory77 = mongoClientOptions70.getDbDecoderFactory();
        int int78 = mongoClientOptions70.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean79 = mongoClientOptions70.isSocketKeepAlive();
        boolean boolean80 = mongoClientOptions70.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory81 = mongoClientOptions70.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder82 = builder66.socketFactory(socketFactory81);
        com.mongodb.MongoClientOptions.Builder builder83 = builder42.socketFactory(socketFactory81);
        com.mongodb.MongoClientOptions.Builder builder84 = builder34.socketFactory(socketFactory81);
        com.mongodb.MongoClientOptions.Builder builder85 = builder12.socketFactory(socketFactory81);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertNotNull(dBDecoderFactory33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "mongodb://localhost/test" + "'", str36, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(socketFactory61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 15 + "'", int73 == 15);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 5 + "'", int74 == 5);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 5000 + "'", int76 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 5 + "'", int78 == 5);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(socketFactory81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
    }

    @Test
    public void test06586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06586");
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
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxAutoConnectRetryTime((long) 67108864);
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
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test06587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06587");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference10 = mongoClientOptions3.getReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertNotNull(readPreference10);
    }

    @Test
    public void test06588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06588");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        mongoProperties0.clearPassword();
        mongoProperties0.uri = "200000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test06589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06589");
        int int2 = java.lang.Integer.remainderUnsigned(101101, (-2076036307));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101101 + "'", int2 == 101101);
    }

    @Test
    public void test06590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06590");
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
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatThreadCount(37289984);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        com.mongodb.DBEncoderFactory dBEncoderFactory37 = mongoClientOptions36.getDbEncoderFactory();
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
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(dBEncoderFactory37);
    }

    @Test
    public void test06591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06591");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        java.lang.String str5 = mongoClientOptions3.getDescription();
        long long6 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        int int7 = mongoClientOptions3.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test06592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06592");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.port = 27017;
        java.lang.String str11 = mongoProperties0.uri;
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
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder33 = builder32.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder36 = builder35.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder38 = builder35.heartbeatSocketTimeout(69);
        boolean boolean39 = mongoClientOptions24.equals((java.lang.Object) builder38);
        javax.net.SocketFactory socketFactory40 = mongoClientOptions24.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties0.builder(mongoClientOptions24);
        long long42 = mongoClientOptions24.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test06593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06593");
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
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions9.getWriteConcern();
        boolean boolean18 = mongoClientOptions9.isSocketKeepAlive();
        int int19 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
        javax.net.SocketFactory socketFactory20 = mongoClientOptions9.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions9.getDbDecoderFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 500 + "'", int19 == 500);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
    }

    @Test
    public void test06594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06594");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1342177280);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010000000000000000000000000000" + "'", str1, "1010000000000000000000000000000");
    }

    @Test
    public void test06595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06595");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setDatabase("578813952");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06596");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isCursorFinalizerEnabled();
        com.mongodb.MongoClient mongoClient13 = mongoProperties0.createMongoClient(mongoClientOptions11);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        boolean boolean18 = mongoClientOptions17.isAlwaysUseMBeans();
        int int19 = mongoClientOptions17.getLocalThreshold();
        int int20 = mongoClientOptions17.getSocketTimeout();
        int int21 = mongoClientOptions17.getConnectTimeout();
        javax.net.SocketFactory socketFactory22 = mongoClientOptions17.getSocketFactory();
        int int23 = mongoClientOptions17.getLocalThreshold();
        boolean boolean24 = mongoClientOptions17.isSocketKeepAlive();
        boolean boolean25 = mongoClientOptions17.isAlwaysUseMBeans();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions17.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions17);
        mongoProperties0.username = "-1";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(mongoClient13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10000 + "'", int21 == 10000);
        org.junit.Assert.assertNotNull(socketFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(writeConcern26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test06597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06597");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        java.lang.String str2 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str4 = mongoProperties3.host;
        java.lang.String str5 = mongoProperties3.host;
        java.lang.Integer int6 = mongoProperties3.getPort();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        boolean boolean12 = mongoClientOptions10.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties3.builder(mongoClientOptions10);
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        int int15 = mongoClientOptions10.getMaxWaitTime();
        int int16 = mongoClientOptions10.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions10.getDbDecoderFactory();
        int int18 = mongoClientOptions10.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions10);
        int int20 = mongoClientOptions10.getHeartbeatThreadCount();
        java.lang.String str21 = mongoClientOptions10.getDescription();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120000 + "'", int15 == 120000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 500 + "'", int16 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06598");
        int int1 = java.lang.Integer.numberOfLeadingZeros(109052914);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06599");
        int int1 = java.lang.Integer.lowestOneBit(6989);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06600");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getLocalThreshold();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getConnectTimeout();
        int int10 = mongoClientOptions3.getConnectionsPerHost();
        int int11 = mongoClientOptions3.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
    }

    @Test
    public void test06601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06601");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("111", (-1306525534));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1306525534 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06602");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("1b4d");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1b4d\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06603");
        int int2 = java.lang.Integer.rotateRight(19, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test06604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06604");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        java.lang.String str11 = mongoClientOptions10.toString();
        int int12 = mongoClientOptions10.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions10);
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
        int int29 = mongoClientOptions23.getHeartbeatConnectRetryFrequency();
        int int30 = mongoClientOptions23.getConnectionsPerHost();
        java.lang.String str31 = mongoClientOptions23.getRequiredReplicaSetName();
        int int32 = mongoClientOptions23.getMaxWaitTime();
        int int33 = mongoClientOptions23.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions23);
        boolean boolean35 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10000 + "'", int27 == 10000);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 500 + "'", int29 == 500);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 120000 + "'", int32 == 120000);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 500 + "'", int33 == 500);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test06605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06605");
        int int1 = java.lang.Integer.signum((-1811939327));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test06606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06606");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 65536);
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        java.lang.String str9 = mongoProperties0.username;
        char[] charArray10 = mongoProperties0.getPassword();
        java.lang.String str11 = mongoProperties0.uri;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
    }

    @Test
    public void test06607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06607");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 10, 107);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06608");
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
        int int11 = mongoClientOptions3.getConnectTimeout();
        com.mongodb.WriteConcern writeConcern12 = mongoClientOptions3.getWriteConcern();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertNotNull(writeConcern12);
    }

    @Test
    public void test06609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06609");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        mongoProperties0.port = (-2147483336);
        mongoProperties0.setGridFsDatabase("536870912");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
    }

    @Test
    public void test06610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06610");
        int int2 = java.lang.Integer.compare(4, 324);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06611");
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
        int int20 = mongoClientOptions19.getAcceptableLatencyDifference();
        java.lang.String str21 = mongoClientOptions19.getRequiredReplicaSetName();
        java.lang.String str22 = mongoClientOptions19.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions19.getWriteConcern();
        int int24 = mongoClientOptions19.getThreadsAllowedToBlockForConnectionMultiplier();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 738197504 + "'", int20 == 738197504);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "369098752" + "'", str21, "369098752");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "369098752" + "'", str22, "369098752");
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test06612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06612");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 10000;
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test06613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06613");
        int int1 = java.lang.Integer.numberOfTrailingZeros(939589760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test06614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06614");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions3.getDbEncoderFactory();
        int int9 = mongoClientOptions3.getSocketTimeout();
        int int10 = mongoClientOptions3.getHeartbeatFrequency();
        boolean boolean11 = mongoClientOptions3.isAlwaysUseMBeans();
        boolean boolean12 = mongoClientOptions3.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test06615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06615");
        int int1 = java.lang.Integer.parseUnsignedInt("48000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 48000000 + "'", int1 == 48000000);
    }

    @Test
    public void test06616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06616");
        int int2 = java.lang.Integer.sum(1126503424, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1126503424 + "'", int2 == 1126503424);
    }

    @Test
    public void test06617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06617");
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
        com.mongodb.MongoClientOptions.Builder builder25 = builder15.connectionsPerHost(19584512);
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
    public void test06618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06618");
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
        int int16 = mongoClientOptions9.getMaxWaitTime();
        int int17 = mongoClientOptions9.getMinHeartbeatFrequency();
        javax.net.SocketFactory socketFactory18 = mongoClientOptions9.getSocketFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 120000 + "'", int16 == 120000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertNotNull(socketFactory18);
    }

    @Test
    public void test06619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06619");
        int int2 = java.lang.Integer.rotateRight(65571, 58376);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 587202816 + "'", int2 == 587202816);
    }

    @Test
    public void test06620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06620");
        int int2 = java.lang.Integer.sum(1101, (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147482547) + "'", int2 == (-2147482547));
    }

    @Test
    public void test06621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06621");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        java.lang.String str11 = mongoProperties0.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int13 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.setHost("hi!");
        java.lang.String str16 = mongoProperties12.getUri();
        mongoProperties12.database = "mongodb://localhost/test";
        java.lang.String str19 = mongoProperties12.getMongoClientDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties21.gridFsDatabase = "hi!";
        char[] charArray28 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties21.setPassword(charArray28);
        mongoProperties20.setPassword(charArray28);
        mongoProperties12.password = charArray28;
        mongoProperties0.setPassword(charArray28);
        mongoProperties0.uri = "10000000000000000000000000";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, a, #, 4]");
    }

    @Test
    public void test06622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06622");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxConnectionLifeTime(500);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.socketKeepAlive(true);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getMinHeartbeatFrequency();
        java.lang.String str27 = mongoClientOptions25.toString();
        boolean boolean28 = mongoClientOptions25.isCursorFinalizerEnabled();
        int int29 = mongoClientOptions25.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1100001 + "'", int26 == 1100001);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test06623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06623");
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
        mongoProperties0.gridFsDatabase = "500";
        java.lang.String str22 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str23 = mongoProperties0.getGridFsDatabase();
        boolean boolean24 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "test" + "'", str22, "test");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "500" + "'", str23, "500");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06624");
        int int2 = java.lang.Integer.compareUnsigned(37289984, (-2145648383));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06625");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100001");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder15 = builder12.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder12.maxWaitTime(40000);
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
    public void test06626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06626");
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
        mongoProperties0.uri = "369098752";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        boolean boolean17 = mongoProperties14.hasCustomAddress();
        java.lang.String str18 = mongoProperties14.getMongoClientDatabase();
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
        int int32 = mongoClientOptions28.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties14.builder(mongoClientOptions28);
        boolean boolean34 = mongoClientOptions28.isAutoConnectRetry();
        int int35 = mongoClientOptions28.getHeartbeatThreadCount();
        int int36 = mongoClientOptions28.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        int int42 = mongoClientOptions41.getMaxConnectionLifeTime();
        int int43 = mongoClientOptions41.getMaxConnectionLifeTime();
        int int44 = mongoClientOptions41.getLocalThreshold();
        int int45 = mongoClientOptions41.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str46 = mongoClientOptions41.getRequiredReplicaSetName();
        int int47 = mongoClientOptions41.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory48 = mongoClientOptions41.getDbDecoderFactory();
        int int49 = mongoClientOptions41.getThreadsAllowedToBlockForConnectionMultiplier();
        int int50 = mongoClientOptions41.getLocalThreshold();
        com.mongodb.DBEncoderFactory dBEncoderFactory51 = mongoClientOptions41.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder52 = builder37.dbEncoderFactory(dBEncoderFactory51);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "test" + "'", str18, "test");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27017 + "'", int20 == 27017);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 500 + "'", int32 == 500);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 500 + "'", int36 == 500);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5000 + "'", int47 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 15 + "'", int50 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test06627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06627");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder7.build();
        java.lang.String str13 = mongoClientOptions12.getRequiredReplicaSetName();
        int int14 = mongoClientOptions12.getMaxConnectionLifeTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test06628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06628");
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
        java.lang.String str15 = mongoClientOptions9.toString();
        int int16 = mongoClientOptions9.getHeartbeatConnectRetryFrequency();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 500 + "'", int16 == 500);
    }

    @Test
    public void test06629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06629");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.username = "1100001";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        java.lang.String str16 = mongoProperties14.host;
        mongoProperties14.setPort((java.lang.Integer) 0);
        mongoProperties14.setDatabase("1100001");
        java.lang.String str21 = mongoProperties14.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str23 = mongoProperties22.host;
        java.lang.String str24 = mongoProperties22.host;
        java.lang.Integer int25 = mongoProperties22.getPort();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean31 = mongoClientOptions29.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties22.builder(mongoClientOptions29);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties33.gridFsDatabase = "hi!";
        char[] charArray40 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties33.setPassword(charArray40);
        mongoProperties22.setPassword(charArray40);
        mongoProperties14.password = charArray40;
        mongoProperties0.password = charArray40;
        java.lang.String str45 = mongoProperties0.gridFsDatabase;
        java.lang.String str46 = mongoProperties0.getUri();
        java.lang.String str47 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "mongodb://localhost/test" + "'", str46, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test06630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06630");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatConnectRetryFrequency(444);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.maxConnectionIdleTime(420313426);
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
    public void test06631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06631");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(100663296, 1879048192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100663296" + "'", str2, "100663296");
    }

    @Test
    public void test06632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06632");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setDatabase("17777777777");
        java.lang.String str12 = mongoProperties0.database;
        java.lang.String str13 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1100001" + "'", str9, "1100001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "17777777777" + "'", str12, "17777777777");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06633");
        int int2 = java.lang.Integer.sum(1607602, 1100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1608702 + "'", int2 == 1608702);
    }

    @Test
    public void test06634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06634");
        java.lang.String str1 = java.lang.Integer.toBinaryString(452984832);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11011000000000000000000000000" + "'", str1, "11011000000000000000000000000");
    }

    @Test
    public void test06635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06635");
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
        boolean boolean11 = mongoClientOptions5.isAutoConnectRetry();
        int int12 = mongoClientOptions5.getAcceptableLatencyDifference();
        int int13 = mongoClientOptions5.getConnectTimeout();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
    }

    @Test
    public void test06636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06636");
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
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxConnectionLifeTime(10110000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str44 = mongoProperties43.host;
        mongoProperties43.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass47 = mongoProperties43.fieldNamingStrategy;
        java.lang.String str48 = mongoProperties43.getDatabase();
        boolean boolean49 = mongoProperties43.hasCustomCredentials();
        java.lang.String str50 = mongoProperties43.username;
        java.lang.String str51 = mongoProperties43.database;
        java.lang.String str52 = mongoProperties43.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str54 = mongoProperties53.getUri();
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions58 = builder55.build();
        int int59 = mongoClientOptions58.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder60 = mongoProperties53.builder(mongoClientOptions58);
        int int61 = mongoClientOptions58.getMaxConnectionIdleTime();
        int int62 = mongoClientOptions58.getMinHeartbeatFrequency();
        int int63 = mongoClientOptions58.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder64 = mongoProperties43.builder(mongoClientOptions58);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties65 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str66 = mongoProperties65.host;
        java.lang.String str67 = mongoProperties65.host;
        java.lang.Integer int68 = mongoProperties65.getPort();
        mongoProperties65.setDatabase("11i71");
        mongoProperties65.port = 2147483647;
        mongoProperties65.port = 1342177280;
        mongoProperties65.username = "100";
        boolean boolean77 = mongoClientOptions58.equals((java.lang.Object) mongoProperties65);
        com.mongodb.WriteConcern writeConcern78 = mongoClientOptions58.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder79 = builder40.writeConcern(writeConcern78);
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
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(wildcardClass47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "mongodb://localhost/test" + "'", str54, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(mongoClientOptions58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 500 + "'", int62 == 500);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 5 + "'", int63 == 5);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(int68);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(writeConcern78);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test06637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06637");
        java.lang.String str1 = java.lang.Integer.toHexString((-1819798618));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "938813a6" + "'", str1, "938813a6");
    }

    @Test
    public void test06638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06638");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        java.lang.String str7 = mongoProperties0.username;
        java.lang.String str8 = mongoProperties0.database;
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str10 = mongoProperties0.host;
        java.lang.String str11 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test06639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06639");
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
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.threadsAllowedToBlockForConnectionMultiplier(985);
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
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test06640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06641");
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
        int int42 = mongoClientOptions34.getHeartbeatFrequency();
        boolean boolean43 = mongoClientOptions34.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5000 + "'", int42 == 5000);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test06642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06642");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("811393294", 1081082373);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1081082373 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06643");
        int int2 = java.lang.Integer.divideUnsigned(1000, 524288000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06644");
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
        java.lang.String str15 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test06645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06645");
        int int1 = java.lang.Integer.numberOfLeadingZeros(872415252);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test06646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06646");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMinConnectionsPerHost();
        java.lang.String str6 = mongoClientOptions3.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1342177280 + "'", int5 == 1342177280);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06647");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setGridFsDatabase("100");
        char[] charArray4 = mongoProperties0.password;
        java.lang.String str5 = mongoProperties0.database;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test06648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06648");
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
        int int13 = mongoClientOptions9.getMinHeartbeatFrequency();
        boolean boolean14 = mongoClientOptions9.isAlwaysUseMBeans();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions9.getDbDecoderFactory();
        int int16 = mongoClientOptions9.getMinConnectionsPerHost();
        int int17 = mongoClientOptions9.getMinConnectionsPerHost();
        int int18 = mongoClientOptions9.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1342177280 + "'", int16 == 1342177280);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1342177280 + "'", int17 == 1342177280);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test06649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06649");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        com.mongodb.MongoClientOptions.Builder builder20 = builder15.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder15.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder24 = builder15.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        int int29 = mongoClientOptions28.getMaxConnectionLifeTime();
        int int30 = mongoClientOptions28.getMaxConnectionLifeTime();
        int int31 = mongoClientOptions28.getLocalThreshold();
        int int32 = mongoClientOptions28.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str33 = mongoClientOptions28.getRequiredReplicaSetName();
        int int34 = mongoClientOptions28.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory35 = mongoClientOptions28.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder15.dbDecoderFactory(dBDecoderFactory35);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        boolean boolean41 = mongoClientOptions40.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory42 = mongoClientOptions40.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder43 = builder15.dbEncoderFactory(dBEncoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder44 = builder10.dbEncoderFactory(dBEncoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder46 = builder10.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder10.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5000 + "'", int34 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
    }

    @Test
    public void test06650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06650");
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
        java.lang.String str44 = mongoProperties0.getUri();
        mongoProperties0.setAuthenticationDatabase("8402945");
        java.lang.Integer int47 = mongoProperties0.port;
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "mongodb://localhost/test" + "'", str44, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int47);
    }

    @Test
    public void test06651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06651");
        int int2 = java.lang.Integer.compare(69, 11264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06652");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions5.getMaxWaitTime();
        int int10 = mongoClientOptions5.getHeartbeatFrequency();
        java.lang.String str11 = mongoClientOptions5.toString();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions5.getDbEncoderFactory();
        int int13 = mongoClientOptions5.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory14 = mongoClientOptions5.getDbDecoderFactory();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory14);
    }

    @Test
    public void test06653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06653");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getUsername();
        mongoProperties0.setUri("");
        java.lang.Class<?> wildcardClass12 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setHost("333311202213000");
        mongoProperties0.setGridFsDatabase("3154444288");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test06654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06654");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setAuthenticationDatabase("1a");
        org.springframework.core.env.Environment environment13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = mongoProperties0.determinePort(environment13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
    }

    @Test
    public void test06655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06655");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.build();
        java.lang.String str9 = mongoClientOptions8.toString();
        int int10 = mongoClientOptions8.getMaxWaitTime();
        int int11 = mongoClientOptions8.getConnectionsPerHost();
        int int12 = mongoClientOptions8.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions8.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.dbDecoderFactory(dBDecoderFactory13);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatThreadCount(8192);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatFrequency((-401866714));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test06656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06656");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatThreadCount((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatThreadCount(16777216);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int16 = mongoProperties15.getDEFAULT_PORT();
        mongoProperties15.setHost("hi!");
        mongoProperties15.host = "";
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        java.lang.String str25 = mongoClientOptions24.toString();
        int int26 = mongoClientOptions24.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties15.builder(mongoClientOptions24);
        int int28 = mongoClientOptions24.getConnectTimeout();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions24.getSocketFactory();
        int int30 = mongoClientOptions24.getMaxConnectionIdleTime();
        java.lang.String str31 = mongoClientOptions24.getDescription();
        com.mongodb.WriteConcern writeConcern32 = mongoClientOptions24.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder33 = builder12.writeConcern(writeConcern32);
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
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20000 + "'", int26 == 20000);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10000 + "'", int28 == 10000);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(writeConcern32);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test06657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06657");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.localThreshold(500);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketTimeout(10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.requiredReplicaSetName("25");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.connectTimeout(1100101);
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
    public void test06658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06658");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder10.build();
        java.lang.String str12 = mongoClientOptions11.getDescription();
        int int13 = mongoClientOptions11.getLocalThreshold();
        java.lang.String str14 = mongoClientOptions11.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test06659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06659");
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
        mongoProperties0.setHost("11i71");
        java.lang.String str22 = mongoProperties0.host;
        org.springframework.core.env.Environment environment23 = null;
        int int24 = mongoProperties0.determinePort(environment23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "11i71" + "'", str22, "11i71");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27017 + "'", int24 == 27017);
    }

    @Test
    public void test06660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06660");
        int int2 = java.lang.Integer.max(16384, 1610612736);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1610612736 + "'", int2 == 1610612736);
    }

    @Test
    public void test06661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06661");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(298319873);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int14 = mongoProperties13.getDEFAULT_PORT();
        mongoProperties13.setHost("hi!");
        mongoProperties13.host = "";
        mongoProperties13.username = "100";
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean25 = mongoClientOptions24.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory26 = mongoClientOptions24.getDbDecoderFactory();
        int int27 = mongoClientOptions24.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties13.builder(mongoClientOptions24);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties30.gridFsDatabase = "hi!";
        char[] charArray37 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties30.setPassword(charArray37);
        mongoProperties29.setPassword(charArray37);
        mongoProperties13.password = charArray37;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str42 = mongoProperties41.host;
        mongoProperties41.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass45 = mongoProperties41.fieldNamingStrategy;
        java.lang.String str46 = mongoProperties41.getDatabase();
        java.lang.String str47 = mongoProperties41.getUsername();
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        boolean boolean52 = mongoClientOptions51.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties54 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties54.gridFsDatabase = "hi!";
        char[] charArray61 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties54.setPassword(charArray61);
        mongoProperties53.setPassword(charArray61);
        boolean boolean64 = mongoClientOptions51.equals((java.lang.Object) mongoProperties53);
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties41.builder(mongoClientOptions51);
        com.mongodb.MongoClientOptions.Builder builder66 = mongoProperties13.builder(mongoClientOptions51);
        com.mongodb.DBDecoderFactory dBDecoderFactory67 = mongoClientOptions51.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder12.dbDecoderFactory(dBDecoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder70 = builder12.heartbeatSocketTimeout(24);
        com.mongodb.MongoClientOptions.Builder builder72 = builder12.requiredReplicaSetName("10c8e1");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder74 = builder72.maxConnectionLifeTime((-1306525534));
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(wildcardClass45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(dBDecoderFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
    }

    @Test
    public void test06662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06662");
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
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.socketTimeout(2200002);
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.socketKeepAlive(false);
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
    public void test06663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06663");
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
        com.mongodb.MongoClientOptions.Builder builder65 = builder61.maxConnectionLifeTime(0);
        com.mongodb.MongoClientOptions.Builder builder67 = builder61.minHeartbeatFrequency(11610);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder69 = builder67.heartbeatSocketTimeout((-268435456));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test06664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06664");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean9 = mongoClientOptions3.isSocketKeepAlive();
        boolean boolean10 = mongoClientOptions3.isAlwaysUseMBeans();
        int int11 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean12 = mongoClientOptions3.isSocketKeepAlive();
        int int13 = mongoClientOptions3.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
    }

    @Test
    public void test06665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06665");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
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
        javax.net.SocketFactory socketFactory23 = mongoClientOptions18.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder24 = builder0.socketFactory(socketFactory23);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatConnectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.heartbeatSocketTimeout(7);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.heartbeatSocketTimeout(500);
        com.mongodb.MongoClientOptions.Builder builder32 = builder24.description("");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxConnectionLifeTime((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertNotNull(socketFactory23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test06666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06666");
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
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.heartbeatThreadCount(578813952);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.requiredReplicaSetName("100000000000000000000000000");
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.heartbeatSocketTimeout(105906176);
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
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test06667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06667");
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
        mongoProperties0.setAuthenticationDatabase("116100000");
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
    }

    @Test
    public void test06668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06668");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int14 = mongoProperties0.getPort();
        char[] charArray15 = mongoProperties0.password;
        java.lang.String str16 = mongoProperties0.getHost();
        java.lang.String str17 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        int int22 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions21.getLocalThreshold();
        int int25 = mongoClientOptions21.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str26 = mongoClientOptions21.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder30 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        boolean boolean39 = mongoClientOptions38.isAlwaysUseMBeans();
        int int40 = mongoClientOptions38.getLocalThreshold();
        int int41 = mongoClientOptions38.getSocketTimeout();
        int int42 = mongoClientOptions38.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern43 = mongoClientOptions38.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder44 = builder34.writeConcern(writeConcern43);
        boolean boolean45 = mongoClientOptions21.equals((java.lang.Object) builder44);
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties0.builder(mongoClientOptions21);
        java.lang.String str47 = mongoClientOptions21.toString();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(writeConcern43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test06669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06669");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.port = 1073741825;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.String str7 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test06670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06670");
        java.lang.String str1 = java.lang.Integer.toHexString((-1140523008));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bc050000" + "'", str1, "bc050000");
    }

    @Test
    public void test06671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06671");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("100110100001111100011011001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100110100001111100011011001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06672");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions12.getLocalThreshold();
        int int16 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions12);
        int int18 = mongoClientOptions12.getAcceptableLatencyDifference();
        boolean boolean19 = mongoClientOptions12.isAlwaysUseMBeans();
        int int20 = mongoClientOptions12.getMaxWaitTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
    }

    @Test
    public void test06673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06673");
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
        java.lang.String str20 = mongoClientOptions3.getRequiredReplicaSetName();
        boolean boolean21 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions3.getWriteConcern();
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(writeConcern22);
    }

    @Test
    public void test06674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06674");
        int int2 = java.lang.Integer.min(832, 301);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 301 + "'", int2 == 301);
    }

    @Test
    public void test06675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06675");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.alwaysUseMBeans(false);
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
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions33.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder20.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder39 = builder9.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.acceptableLatencyDifference(1140850688);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder43 = builder39.heartbeatSocketTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
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
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test06676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06676");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("5");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.autoConnectRetry(true);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties17.setHost("");
        mongoProperties17.username = "100";
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold(27017);
        java.lang.Class<?> wildcardClass25 = builder24.getClass();
        mongoProperties17.fieldNamingStrategy = wildcardClass25;
        mongoProperties17.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int30 = mongoProperties29.getDEFAULT_PORT();
        mongoProperties29.setHost("hi!");
        mongoProperties29.host = "";
        mongoProperties29.username = "100";
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        boolean boolean41 = mongoClientOptions40.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions40.getDbDecoderFactory();
        int int43 = mongoClientOptions40.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties29.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties17.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.heartbeatThreadCount(67108864);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.maxWaitTime(214748364);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder51.build();
        int int53 = mongoClientOptions52.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory54 = mongoClientOptions52.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder55 = builder14.dbDecoderFactory(dBDecoderFactory54);
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.connectionsPerHost(82595524);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27017 + "'", int30 == 27017);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 67108864 + "'", int53 == 67108864);
        org.junit.Assert.assertNotNull(dBDecoderFactory54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test06677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06677");
        int int2 = java.lang.Integer.remainderUnsigned(1879311872, 1136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 944 + "'", int2 == 944);
    }

    @Test
    public void test06678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06678");
        int int2 = java.lang.Integer.compareUnsigned(10056, 4751360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06679");
        int int2 = java.lang.Integer.remainderUnsigned(65571, 40000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25571 + "'", int2 == 25571);
    }

    @Test
    public void test06680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06680");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.setHost("test");
        mongoProperties0.setAuthenticationDatabase("11i71");
        mongoProperties0.database = "100011";
        java.lang.Class<?> wildcardClass18 = mongoProperties0.fieldNamingStrategy;
        char[] charArray19 = mongoProperties0.getPassword();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, a, #, 4]");
    }

    @Test
    public void test06681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06681");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setHost("128");
        mongoProperties0.setPort((java.lang.Integer) 26);
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
        javax.net.SocketFactory socketFactory29 = mongoClientOptions25.getSocketFactory();
        int int30 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        boolean boolean31 = mongoClientOptions25.isAutoConnectRetry();
        int int32 = mongoClientOptions25.getAcceptableLatencyDifference();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.heartbeatFrequency(1073741824);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test06682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06682");
        int int1 = java.lang.Integer.bitCount(3648);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06683");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(2240, 1337982976);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2240" + "'", str2, "2240");
    }

    @Test
    public void test06684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06684");
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
        int int20 = mongoClientOptions19.getAcceptableLatencyDifference();
        java.lang.String str21 = mongoClientOptions19.getRequiredReplicaSetName();
        java.lang.String str22 = mongoClientOptions19.getRequiredReplicaSetName();
        int int23 = mongoClientOptions19.getConnectionsPerHost();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 738197504 + "'", int20 == 738197504);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "369098752" + "'", str21, "369098752");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "369098752" + "'", str22, "369098752");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test06685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06685");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 67108864);
        org.springframework.core.env.Environment environment9 = null;
        int int10 = mongoProperties0.determinePort(environment9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1100001" + "'", str6, "1100001");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 67108864 + "'", int10 == 67108864);
    }

    @Test
    public void test06686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06686");
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
        long long17 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        long long18 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        com.mongodb.ReadPreference readPreference19 = mongoClientOptions3.getReadPreference();
        javax.net.SocketFactory socketFactory20 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(readPreference19);
        org.junit.Assert.assertNotNull(socketFactory20);
    }

    @Test
    public void test06687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06687");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.heartbeatConnectTimeout(16777216);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions12.getLocalThreshold();
        int int16 = mongoClientOptions12.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str17 = mongoClientOptions12.getRequiredReplicaSetName();
        int int18 = mongoClientOptions12.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions12.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder0.dbDecoderFactory(dBDecoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder0.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.maxConnectionIdleTime(1100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5000 + "'", int18 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test06688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06688");
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
        int int13 = mongoClientOptions3.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
    }

    @Test
    public void test06689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06689");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.connectionsPerHost(61);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test06690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06690");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10110000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10110000000000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06691");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        int int7 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean9 = mongoClientOptions3.isAlwaysUseMBeans();
        int int10 = mongoClientOptions3.getHeartbeatThreadCount();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(socketFactory11);
    }

    @Test
    public void test06692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06692");
        int int2 = java.lang.Integer.divideUnsigned(605440, 1258290949);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06693");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getConnectionsPerHost();
        java.lang.String str7 = mongoClientOptions3.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxWaitTime((int) (byte) 10);
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
        com.mongodb.MongoClientOptions.Builder builder31 = builder11.socketFactory(socketFactory30);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.heartbeatConnectTimeout(16);
        boolean boolean34 = mongoClientOptions3.equals((java.lang.Object) builder31);
        com.mongodb.MongoClientOptions.Builder builder36 = builder31.connectTimeout(97);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
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
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test06694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06694");
        int int1 = java.lang.Integer.parseInt("176");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 176 + "'", int1 == 176);
    }

    @Test
    public void test06695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06695");
        java.lang.Integer int1 = java.lang.Integer.getInteger("bc050000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06696");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern26 = mongoClientOptions24.getWriteConcern();
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions24, environment27);
        java.lang.String str29 = mongoProperties0.getUsername();
        char[] charArray30 = mongoProperties0.getPassword();
        mongoProperties0.port = 1260000;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(writeConcern26);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(charArray30);
    }

    @Test
    public void test06697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06697");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("1000001101001110000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1000001101001110000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06698");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions3.getReadPreference();
        boolean boolean9 = mongoClientOptions3.isCursorFinalizerEnabled();
        int int10 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int11 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
    }

    @Test
    public void test06699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06699");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-1610547200), 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2684420096" + "'", str2, "2684420096");
    }

    @Test
    public void test06700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06700");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        java.lang.String str9 = mongoClientOptions3.getDescription();
        int int10 = mongoClientOptions3.getLocalThreshold();
        int int11 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test06701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06701");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.threadsAllowedToBlockForConnectionMultiplier(37);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxConnectionLifeTime(0);
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
    }

    @Test
    public void test06702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06702");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold(100);
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
    public void test06703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06703");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.maxConnectionIdleTime(61);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionIdleTime(29188);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.socketTimeout(534854);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test06704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4na000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4na000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06705");
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
        mongoProperties0.setDatabase("6b");
        mongoProperties0.uri = "20000011610";
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
    }

    @Test
    public void test06706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06706");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.setPort((java.lang.Integer) 27017);
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        java.lang.String str7 = mongoProperties0.username;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test06707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06707");
        int int1 = java.lang.Integer.signum(139);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06708");
        int int1 = java.lang.Integer.parseInt("469827712");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 469827712 + "'", int1 == 469827712);
    }

    @Test
    public void test06709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06709");
        int int1 = java.lang.Integer.signum((-741601280));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test06710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06710");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.minHeartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxConnectionLifeTime(11);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.connectionsPerHost(298319873);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.cursorFinalizerEnabled(true);
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
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test06711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06711");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        mongoProperties0.username = "m1w";
        mongoProperties0.setUsername("-2146433022");
        mongoProperties0.clearPassword();
    }

    @Test
    public void test06712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06712");
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
        java.lang.String str13 = mongoProperties0.username;
        java.lang.String str14 = mongoProperties0.gridFsDatabase;
        mongoProperties0.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.host;
        mongoProperties16.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass20 = mongoProperties16.fieldNamingStrategy;
        java.lang.String str21 = mongoProperties16.authenticationDatabase;
        java.lang.String str22 = mongoProperties16.host;
        mongoProperties16.port = 15;
        mongoProperties16.host = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str28 = mongoProperties27.host;
        mongoProperties27.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass31 = mongoProperties27.fieldNamingStrategy;
        mongoProperties27.setAuthenticationDatabase("20");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.getUri();
        mongoProperties34.setPort((java.lang.Integer) (-1));
        java.lang.String str38 = mongoProperties34.getDatabase();
        java.lang.String str39 = mongoProperties34.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.host;
        mongoProperties40.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass44 = mongoProperties40.fieldNamingStrategy;
        java.lang.String str45 = mongoProperties40.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str47 = mongoProperties46.getUri();
        char[] charArray48 = new char[] {};
        mongoProperties46.setPassword(charArray48);
        mongoProperties40.setPassword(charArray48);
        mongoProperties34.password = charArray48;
        mongoProperties27.password = charArray48;
        mongoProperties16.password = charArray48;
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder54.build();
        boolean boolean58 = mongoClientOptions57.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory59 = mongoClientOptions57.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder60 = mongoProperties16.builder(mongoClientOptions57);
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties0.builder(mongoClientOptions57);
        java.lang.Integer int62 = mongoProperties0.getPort();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "mongodb://localhost/test" + "'", str35, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "mongodb://localhost/test" + "'", str47, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[]");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(int62);
    }

    @Test
    public void test06713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("832b9388");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 832b9388");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06714");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("3ne53", 61000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 61000000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06715");
        int int1 = java.lang.Integer.reverseBytes(67108864);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06716");
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
        javax.net.SocketFactory socketFactory15 = mongoClientOptions6.getSocketFactory();
        java.lang.String str16 = mongoClientOptions6.toString();
        int int17 = mongoClientOptions6.getLocalThreshold();
        int int18 = mongoClientOptions6.getHeartbeatThreadCount();
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
        org.junit.Assert.assertNotNull(socketFactory15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test06717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06717");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        com.mongodb.ReadPreference readPreference5 = mongoClientOptions3.getReadPreference();
        int int6 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int7 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int8 = mongoClientOptions3.getHeartbeatSocketTimeout();
        java.lang.String str9 = mongoClientOptions3.getDescription();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        com.mongodb.MongoClientOptions.Builder builder17 = builder12.socketTimeout((int) (byte) 10);
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
        javax.net.SocketFactory socketFactory34 = mongoClientOptions30.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder35 = builder17.socketFactory(socketFactory34);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder35.build();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions36.getWriteConcern();
        boolean boolean38 = mongoClientOptions3.equals((java.lang.Object) mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(readPreference5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb://localhost/test" + "'", str26, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(socketFactory34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test06718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06718");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        mongoProperties0.setAuthenticationDatabase("0");
        mongoProperties0.uri = "1388";
        char[] charArray12 = mongoProperties0.getPassword();
        java.lang.String str13 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setDatabase("34");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test06719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06719");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.port = 27017;
        java.lang.String str11 = mongoProperties0.uri;
        java.lang.String str12 = mongoProperties0.database;
        int int13 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11i71" + "'", str12, "11i71");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
    }

    @Test
    public void test06720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06720");
        int int2 = java.lang.Integer.max(7050496, 150994944);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 150994944 + "'", int2 == 150994944);
    }

    @Test
    public void test06721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06721");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("16384", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 16384");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06722");
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
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder26.build();
        int int28 = mongoClientOptions27.getMinConnectionsPerHost();
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1342177280 + "'", int28 == 1342177280);
    }

    @Test
    public void test06723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06723");
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
        java.lang.String str20 = mongoProperties0.getDatabase();
        java.lang.String str21 = mongoProperties0.gridFsDatabase;
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test06724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06724");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.heartbeatConnectTimeout(402653184);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.threadsAllowedToBlockForConnectionMultiplier(11534336);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder0.maxConnectionLifeTime((-741601280));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
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
    public void test06725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06725");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        mongoProperties0.host = "10";
        java.lang.String str7 = mongoProperties0.host;
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions11.getDbDecoderFactory();
        int int14 = mongoClientOptions11.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder15 = mongoProperties0.builder(mongoClientOptions11);
        int int16 = mongoClientOptions11.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test06726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06726");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setPort((java.lang.Integer) 20000);
        java.lang.String str14 = mongoProperties0.database;
        mongoProperties0.gridFsDatabase = "45";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test06727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06727");
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
        java.lang.String str17 = mongoProperties0.getUsername();
        mongoProperties0.host = "333311202213000";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int21 = mongoProperties20.getDEFAULT_PORT();
        mongoProperties20.setHost("hi!");
        mongoProperties20.host = "";
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.toString();
        int int31 = mongoClientOptions29.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties20.builder(mongoClientOptions29);
        int int33 = mongoClientOptions29.getConnectTimeout();
        javax.net.SocketFactory socketFactory34 = mongoClientOptions29.getSocketFactory();
        int int35 = mongoClientOptions29.getHeartbeatConnectRetryFrequency();
        int int36 = mongoClientOptions29.getConnectionsPerHost();
        int int37 = mongoClientOptions29.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern38 = mongoClientOptions29.getWriteConcern();
        com.mongodb.DBDecoderFactory dBDecoderFactory39 = mongoClientOptions29.getDbDecoderFactory();
        int int40 = mongoClientOptions29.getAcceptableLatencyDifference();
        int int41 = mongoClientOptions29.getThreadsAllowedToBlockForConnectionMultiplier();
        int int42 = mongoClientOptions29.getConnectionsPerHost();
        int int43 = mongoClientOptions29.getHeartbeatThreadCount();
        org.springframework.core.env.Environment environment44 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient45 = mongoProperties0.createMongoClient(mongoClientOptions29, environment44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertNotNull(socketFactory34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 500 + "'", int35 == 500);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(writeConcern38);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test06728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06728");
        int int2 = java.lang.Integer.min(94000001, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06729");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
    }

    @Test
    public void test06730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06730");
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
        boolean boolean20 = mongoClientOptions3.isAlwaysUseMBeans();
        boolean boolean21 = mongoClientOptions3.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test06731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06731");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("-804206260", 9792256);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 9792256 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06732");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getAcceptableLatencyDifference();
        java.lang.String str6 = mongoClientOptions3.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test06733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06733");
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
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions9.getWriteConcern();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions9.getDbDecoderFactory();
        int int19 = mongoClientOptions9.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test06734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06734");
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
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions11.getReadPreference();
        int int17 = mongoClientOptions11.getMaxWaitTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120000 + "'", int17 == 120000);
    }

    @Test
    public void test06735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06735");
        int int1 = java.lang.Integer.parseUnsignedInt("14680065");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14680065 + "'", int1 == 14680065);
    }

    @Test
    public void test06736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06736");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        mongoProperties0.setUsername("1");
        mongoProperties0.setUri("2162000001");
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test06737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06737");
        int int2 = java.lang.Integer.max(1024, 107374278);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 107374278 + "'", int2 == 107374278);
    }

    @Test
    public void test06738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06738");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getMaxWaitTime();
        int int10 = mongoClientOptions3.getMaxWaitTime();
        int int11 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
    }

    @Test
    public void test06739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06739");
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
        java.lang.String str16 = mongoProperties0.username;
        mongoProperties0.username = "";
        boolean boolean19 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setPort((java.lang.Integer) 316197090);
        boolean boolean22 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test06740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06740");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100" + "'", str1, "1100");
    }

    @Test
    public void test06741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06741");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("11i71");
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        java.lang.String str16 = mongoClientOptions15.toString();
        int int17 = mongoClientOptions15.getMaxWaitTime();
        int int18 = mongoClientOptions15.getConnectionsPerHost();
        int int19 = mongoClientOptions15.getMaxConnectionIdleTime();
        int int20 = mongoClientOptions15.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions15);
        java.lang.String str22 = mongoClientOptions15.toString();
        int int23 = mongoClientOptions15.getHeartbeatSocketTimeout();
        java.lang.Class<?> wildcardClass24 = mongoClientOptions15.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120000 + "'", int17 == 120000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test06742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06742");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("100000000000000000001000000", (-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -1073741824 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06743");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions3.getReadPreference();
        int int10 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int12 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(readPreference9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test06744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06744");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        char[] charArray14 = mongoProperties12.password;
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions18.getDbDecoderFactory();
        int int21 = mongoClientOptions18.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties12.builder(mongoClientOptions18);
        int int23 = mongoClientOptions18.getLocalThreshold();
        int int24 = mongoClientOptions18.getMaxConnectionIdleTime();
        java.lang.String str25 = mongoClientOptions18.getDescription();
        org.springframework.core.env.Environment environment26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient27 = mongoProperties0.createMongoClient(mongoClientOptions18, environment26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test06745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06745");
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
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder27.build();
        boolean boolean29 = mongoClientOptions28.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions28);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test06746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06746");
        int int2 = java.lang.Integer.compare(162, 11264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06747");
        java.lang.String str1 = java.lang.Integer.toOctalString(1440351);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5375137" + "'", str1, "5375137");
    }

    @Test
    public void test06748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06748");
        int int2 = java.lang.Integer.compareUnsigned(29, 16777219);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06749");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str11 = mongoProperties10.host;
        mongoProperties10.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass14 = mongoProperties10.fieldNamingStrategy;
        mongoProperties10.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.getUri();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        int int23 = mongoClientOptions22.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties17.builder(mongoClientOptions22);
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties10.builder(mongoClientOptions22);
        int int26 = mongoClientOptions22.getConnectTimeout();
        int int27 = mongoClientOptions22.getConnectTimeout();
        int int28 = mongoClientOptions22.getConnectionsPerHost();
        com.mongodb.DBEncoderFactory dBEncoderFactory29 = mongoClientOptions22.getDbEncoderFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory30 = mongoClientOptions22.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder7.dbEncoderFactory(dBEncoderFactory30);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10000 + "'", int26 == 10000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10000 + "'", int27 == 10000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(dBEncoderFactory29);
        org.junit.Assert.assertNotNull(dBEncoderFactory30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test06750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06750");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getUri();
        mongoProperties0.setAuthenticationDatabase("10000000010111110001000110");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
    }

    @Test
    public void test06751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06751");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder18.maxConnectionIdleTime((-1330184161));
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
        org.junit.Assert.assertNotNull(mongoClientOptions19);
    }

    @Test
    public void test06752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06752");
        int int2 = java.lang.Integer.max(30, 536870880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 536870880 + "'", int2 == 536870880);
    }

    @Test
    public void test06753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06753");
        java.lang.String str2 = java.lang.Integer.toString(436207638, 316197090);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "436207638" + "'", str2, "436207638");
    }

    @Test
    public void test06754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06754");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int11 = mongoClientOptions9.getMaxConnectionLifeTime();
        java.lang.String str12 = mongoClientOptions9.getRequiredReplicaSetName();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions9.getDbDecoderFactory();
        int int14 = mongoClientOptions9.getLocalThreshold();
        int int15 = mongoClientOptions9.getConnectTimeout();
        int int16 = mongoClientOptions9.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
    }

    @Test
    public void test06755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06755");
        int int2 = java.lang.Integer.max((-704643072), 452984852);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 452984852 + "'", int2 == 452984852);
    }

    @Test
    public void test06756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06756");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder13 = builder2.cursorFinalizerEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder2.localThreshold((-1681772544));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
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
    }

    @Test
    public void test06757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06757");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions3.getDbEncoderFactory();
        int int9 = mongoClientOptions3.getSocketTimeout();
        int int10 = mongoClientOptions3.getHeartbeatFrequency();
        boolean boolean11 = mongoClientOptions3.isAlwaysUseMBeans();
        int int12 = mongoClientOptions3.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1342177280 + "'", int12 == 1342177280);
    }

    @Test
    public void test06758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06758");
        int int2 = java.lang.Integer.max((-1610612735), 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06759");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "4e20";
        java.lang.String str8 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
    }

    @Test
    public void test06760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06760");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((-1989607424), 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1gp4jw4" + "'", str2, "1gp4jw4");
    }

    @Test
    public void test06761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06761");
        int int2 = java.lang.Integer.compareUnsigned(124911713, 24584435);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test06762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06762");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str8 = mongoProperties0.getDatabase();
        mongoProperties0.authenticationDatabase = "1001000000000000000000000000";
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test06763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06763");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        mongoProperties0.setUri("hi!");
        mongoProperties0.clearPassword();
        java.lang.String str10 = mongoProperties0.uri;
        java.lang.String str11 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06764");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.gridFsDatabase = "803801";
        mongoProperties0.setGridFsDatabase("10000");
        mongoProperties0.setGridFsDatabase("637534208");
        boolean boolean11 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.port = 1100100;
        mongoProperties0.setPort((java.lang.Integer) (-2132030207));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06765");
        int int2 = java.lang.Integer.rotateLeft(1000, 100000007);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128000 + "'", int2 == 128000);
    }

    @Test
    public void test06766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06766");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getConnectionsPerHost();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        javax.net.SocketFactory socketFactory10 = mongoClientOptions3.getSocketFactory();
        int int11 = mongoClientOptions3.getConnectTimeout();
        int int12 = mongoClientOptions3.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test06767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06767");
        int int1 = java.lang.Integer.reverseBytes(8399619);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53182464 + "'", int1 == 53182464);
    }

    @Test
    public void test06768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06768");
        int int2 = java.lang.Integer.min(0, 39304);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06769");
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
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.localThreshold(100059);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.host;
        mongoProperties34.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass38 = mongoProperties34.fieldNamingStrategy;
        mongoProperties34.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties41 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str42 = mongoProperties41.getUri();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.build();
        int int47 = mongoClientOptions46.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties41.builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties34.builder(mongoClientOptions46);
        int int50 = mongoClientOptions46.getMaxConnectionLifeTime();
        int int51 = mongoClientOptions46.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory52 = mongoClientOptions46.getDbDecoderFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory53 = mongoClientOptions46.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder54 = builder33.dbEncoderFactory(dBEncoderFactory53);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "mongodb://localhost/test" + "'", str42, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 20000 + "'", int51 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory52);
        org.junit.Assert.assertNotNull(dBEncoderFactory53);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test06770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06770");
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
        mongoProperties0.setUsername("23");
        java.lang.Class<?> wildcardClass27 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str28 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNull(wildcardClass27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "23" + "'", str28, "23");
    }

    @Test
    public void test06771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06771");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int8 = mongoClientOptions3.getHeartbeatThreadCount();
        java.lang.String str9 = mongoClientOptions3.toString();
        boolean boolean10 = mongoClientOptions3.isSocketKeepAlive();
        int int11 = mongoClientOptions3.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions3.getReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 120000 + "'", int11 == 120000);
        org.junit.Assert.assertNotNull(readPreference12);
    }

    @Test
    public void test06772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06772");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout(6);
        com.mongodb.MongoClientOptions.Builder builder9 = builder8.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test06773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06773");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(11534336);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder22 = builder18.maxConnectionIdleTime((-2146433021));
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
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06774");
        long long1 = java.lang.Integer.toUnsignedLong(218103808);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 218103808L + "'", long1 == 218103808L);
    }

    @Test
    public void test06775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06775");
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
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions23.getLocalThreshold();
        boolean boolean27 = mongoClientOptions23.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory28 = mongoClientOptions23.getSocketFactory();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions23.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder18.socketFactory(socketFactory29);
        com.mongodb.MongoClientOptions.Builder builder32 = builder18.description("16");
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.maxWaitTime(0);
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test06776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06776");
        java.lang.String str1 = java.lang.Integer.toBinaryString(20480000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1001110001000000000000000" + "'", str1, "1001110001000000000000000");
    }

    @Test
    public void test06777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06777");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(97);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minHeartbeatFrequency(1795162112);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test06778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06778");
        java.lang.String str1 = java.lang.Integer.toString((-184324096));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-184324096" + "'", str1, "-184324096");
    }

    @Test
    public void test06779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06779");
        int int2 = java.lang.Integer.compareUnsigned(9, 11234);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06780");
        java.lang.String str1 = java.lang.Integer.toHexString(944);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "3b0" + "'", str1, "3b0");
    }

    @Test
    public void test06781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06781");
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
        boolean boolean29 = mongoClientOptions20.isSocketKeepAlive();
        java.lang.String str30 = mongoClientOptions20.toString();
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
    public void test06782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06782");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUsername("1101011");
        char[] charArray12 = mongoProperties0.password;
        boolean boolean13 = mongoProperties0.hasCustomCredentials();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        java.lang.String str18 = mongoClientOptions17.toString();
        int int19 = mongoClientOptions17.getMaxWaitTime();
        int int20 = mongoClientOptions17.getMaxWaitTime();
        int int21 = mongoClientOptions17.getLocalThreshold();
        java.lang.String str22 = mongoClientOptions17.getRequiredReplicaSetName();
        int int23 = mongoClientOptions17.getAcceptableLatencyDifference();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions17);
        mongoProperties0.setUsername("55");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120000 + "'", int19 == 120000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test06783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06783");
        int int2 = java.lang.Integer.compareUnsigned(11264, 1100100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06784");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.username = "1";
        java.lang.String str7 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06785");
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
        java.lang.String str13 = mongoProperties0.getAuthenticationDatabase();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test06786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06786");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.socketTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        int int13 = mongoClientOptions12.getHeartbeatConnectTimeout();
        long long14 = mongoClientOptions12.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test06787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06787");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("49284096", 216);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 216 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06788");
        int int1 = java.lang.Integer.reverseBytes(101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1694498816 + "'", int1 == 1694498816);
    }

    @Test
    public void test06789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06789");
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
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatSocketTimeout(45);
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
    }

    @Test
    public void test06790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06790");
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.connectionsPerHost(107);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.alwaysUseMBeans(false);
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
    }

    @Test
    public void test06791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06791");
        int int1 = java.lang.Integer.signum(110111100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06792");
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
        java.lang.String str13 = mongoProperties0.username;
        mongoProperties0.setUri("");
        mongoProperties0.clearPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test06793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06793");
        java.lang.String str2 = java.lang.Integer.toString(107, 1627389952);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "107" + "'", str2, "107");
    }

    @Test
    public void test06794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06794");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setDatabase("17777777777");
        java.lang.String str12 = mongoProperties0.database;
        boolean boolean13 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.host = "500";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1100001" + "'", str9, "1100001");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "17777777777" + "'", str12, "17777777777");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test06795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06795");
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
        long long11 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertNotNull(readPreference10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test06796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06796");
        int int2 = java.lang.Integer.max(1222, 47040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47040 + "'", int2 == 47040);
    }

    @Test
    public void test06797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06797");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.host = "2";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.database = "-1";
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(charArray9);
    }

    @Test
    public void test06798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06798");
        java.lang.String str1 = java.lang.Integer.toBinaryString(180841879);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010110001110110110110010111" + "'", str1, "1010110001110110110110010111");
    }

    @Test
    public void test06799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06799");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory6 = mongoClientOptions3.getSocketFactory();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        int int8 = mongoClientOptions3.getMinConnectionsPerHost();
        int int9 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int10 = mongoClientOptions3.getMinConnectionsPerHost();
        int int11 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(socketFactory6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1342177280 + "'", int8 == 1342177280);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1342177280 + "'", int10 == 1342177280);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
    }

    @Test
    public void test06800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06800");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.setUsername("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        java.lang.String str11 = mongoClientOptions10.toString();
        int int12 = mongoClientOptions10.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions10);
        boolean boolean14 = mongoClientOptions10.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions10.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions10.getMinConnectionsPerHost();
        int int17 = mongoClientOptions10.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5000 + "'", int12 == 5000);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1342177280 + "'", int16 == 1342177280);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test06801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06801");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.setUsername("");
        mongoProperties0.setAuthenticationDatabase("3");
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test06802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06802");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "22";
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getUsername();
        java.lang.String str9 = mongoProperties0.getHost();
        mongoProperties0.setDatabase("1359872");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test06803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06803");
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
        mongoProperties0.setUsername("c43d9");
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        java.lang.String str18 = mongoClientOptions17.toString();
        int int19 = mongoClientOptions17.getMaxWaitTime();
        int int20 = mongoClientOptions17.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions17);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int23 = mongoProperties22.getDEFAULT_PORT();
        mongoProperties22.setHost("hi!");
        mongoProperties22.host = "";
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        java.lang.String str32 = mongoClientOptions31.toString();
        int int33 = mongoClientOptions31.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties22.builder(mongoClientOptions31);
        int int35 = mongoClientOptions31.getConnectTimeout();
        int int36 = mongoClientOptions31.getHeartbeatSocketTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.getUri();
        char[] charArray39 = mongoProperties37.password;
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean44 = mongoClientOptions43.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions43.getDbDecoderFactory();
        int int46 = mongoClientOptions43.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties37.builder(mongoClientOptions43);
        java.lang.String str48 = mongoProperties37.database;
        boolean boolean49 = mongoClientOptions31.equals((java.lang.Object) str48);
        java.lang.String str50 = mongoClientOptions31.getDescription();
        int int51 = mongoClientOptions31.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions31);
        java.lang.String str53 = mongoProperties0.username;
        java.lang.String str54 = mongoProperties0.username;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120000 + "'", int19 == 120000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5000 + "'", int20 == 5000);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 27017 + "'", int23 == 27017);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10000 + "'", int35 == 10000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "c43d9" + "'", str53, "c43d9");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "c43d9" + "'", str54, "c43d9");
    }

    @Test
    public void test06804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06804");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.uri = "2162000001";
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        java.lang.Integer int15 = mongoProperties0.getPort();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test06805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06805");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        com.mongodb.ReadPreference readPreference5 = mongoClientOptions3.getReadPreference();
        int int6 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int7 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int8 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(readPreference5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test06806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06806");
        java.lang.String str2 = java.lang.Integer.toString((-741601280), 80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-741601280" + "'", str2, "-741601280");
    }

    @Test
    public void test06807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06807");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("afc00e00", 1744830464);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1744830464 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06808");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        int int11 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str12 = mongoProperties0.getHost();
        boolean boolean13 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setDatabase("-2147483648");
        mongoProperties0.gridFsDatabase = "111";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str19 = mongoProperties18.getUri();
        char[] charArray20 = mongoProperties18.password;
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean25 = mongoClientOptions24.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory26 = mongoClientOptions24.getDbDecoderFactory();
        int int27 = mongoClientOptions24.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties18.builder(mongoClientOptions24);
        boolean boolean29 = mongoClientOptions24.isAutoConnectRetry();
        com.mongodb.WriteConcern writeConcern30 = mongoClientOptions24.getWriteConcern();
        int int31 = mongoClientOptions24.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions24);
        mongoProperties0.uri = "938813a6";
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(writeConcern30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test06809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06809");
        int int1 = java.lang.Integer.highestOneBit(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test06810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06810");
        int int2 = java.lang.Integer.divideUnsigned(105, 1222);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06811");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties4.gridFsDatabase = "hi!";
        char[] charArray11 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties4.setPassword(charArray11);
        mongoProperties4.setDatabase("hi!");
        java.lang.String str15 = mongoProperties4.getMongoClientDatabase();
        java.lang.String str16 = mongoProperties4.host;
        java.lang.Class<?> wildcardClass17 = mongoProperties4.getFieldNamingStrategy();
        java.lang.String str18 = mongoProperties4.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int20 = mongoProperties19.getDEFAULT_PORT();
        mongoProperties19.setHost("hi!");
        java.lang.String str23 = mongoProperties19.host;
        java.lang.Integer int24 = mongoProperties19.port;
        java.lang.Integer int25 = mongoProperties19.port;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int27 = mongoProperties26.getDEFAULT_PORT();
        mongoProperties26.setHost("hi!");
        mongoProperties26.host = "";
        mongoProperties26.username = "100";
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        boolean boolean38 = mongoClientOptions37.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory39 = mongoClientOptions37.getDbDecoderFactory();
        int int40 = mongoClientOptions37.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties26.builder(mongoClientOptions37);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.host;
        java.lang.String str44 = mongoProperties42.host;
        java.lang.Integer int45 = mongoProperties42.getPort();
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        boolean boolean51 = mongoClientOptions49.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties42.builder(mongoClientOptions49);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties53 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties53.gridFsDatabase = "hi!";
        char[] charArray60 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties53.setPassword(charArray60);
        mongoProperties42.setPassword(charArray60);
        mongoProperties26.setPassword(charArray60);
        mongoProperties19.setPassword(charArray60);
        mongoProperties4.setPassword(charArray60);
        mongoProperties0.password = charArray60;
        java.lang.String str67 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray68 = mongoProperties0.password;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27017 + "'", int20 == 27017);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(int45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[a, a, #, 4]");
    }

    @Test
    public void test06812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06812");
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
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions12.getReadPreference();
        boolean boolean17 = mongoClientOptions12.isAlwaysUseMBeans();
        boolean boolean18 = mongoClientOptions12.isSocketKeepAlive();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06813");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(1157627904);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1157627904" + "'", str1, "1157627904");
    }

    @Test
    public void test06814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06814");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime(176L);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder15 = builder7.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        boolean boolean22 = mongoClientOptions21.isAlwaysUseMBeans();
        int int23 = mongoClientOptions21.getLocalThreshold();
        long long24 = mongoClientOptions21.getMaxAutoConnectRetryTime();
        int int25 = mongoClientOptions21.getHeartbeatConnectTimeout();
        int int26 = mongoClientOptions21.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.DBDecoderFactory dBDecoderFactory27 = mongoClientOptions21.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder17.dbDecoderFactory(dBDecoderFactory27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder2.dbDecoderFactory(dBDecoderFactory27);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minHeartbeatFrequency(132);
        com.mongodb.MongoClientOptions.Builder builder33 = builder29.localThreshold(100100034);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxWaitTime((-2143813376));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
        org.junit.Assert.assertNotNull(dBDecoderFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test06815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06815");
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
        boolean boolean29 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.getUri();
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        int int36 = mongoClientOptions35.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties30.builder(mongoClientOptions35);
        java.lang.Integer int38 = mongoProperties30.getPort();
        java.lang.String str39 = mongoProperties30.getHost();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean45 = mongoClientOptions43.equals((java.lang.Object) (-2147483648));
        int int46 = mongoClientOptions43.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory47 = mongoClientOptions43.getDbDecoderFactory();
        int int48 = mongoClientOptions43.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties30.builder(mongoClientOptions43);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties51.gridFsDatabase = "hi!";
        char[] charArray58 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties51.setPassword(charArray58);
        mongoProperties50.setPassword(charArray58);
        char[] charArray61 = mongoProperties50.getPassword();
        mongoProperties30.password = charArray61;
        mongoProperties0.setPassword(charArray61);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties64 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int65 = mongoProperties64.getDEFAULT_PORT();
        mongoProperties64.setHost("hi!");
        mongoProperties64.host = "";
        com.mongodb.MongoClientOptions.Builder builder70 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder70.build();
        java.lang.String str74 = mongoClientOptions73.toString();
        int int75 = mongoClientOptions73.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder76 = mongoProperties64.builder(mongoClientOptions73);
        com.mongodb.DBEncoderFactory dBEncoderFactory77 = mongoClientOptions73.getDbEncoderFactory();
        int int78 = mongoClientOptions73.getHeartbeatConnectTimeout();
        int int79 = mongoClientOptions73.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder80 = mongoProperties0.builder(mongoClientOptions73);
        com.mongodb.MongoClientOptions.Builder builder82 = builder80.cursorFinalizerEnabled(false);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "mongodb://localhost/test" + "'", str31, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 500 + "'", int48 == 500);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 27017 + "'", int65 == 27017);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 20000 + "'", int75 == 20000);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(dBEncoderFactory77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 20000 + "'", int78 == 20000);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test06816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06816");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-161061239));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("25402");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 25402");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06818");
        int int1 = java.lang.Integer.reverseBytes(68);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1140850688 + "'", int1 == 1140850688);
    }

    @Test
    public void test06819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06819");
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
        boolean boolean11 = mongoClientOptions5.isAutoConnectRetry();
        int int12 = mongoClientOptions5.getAcceptableLatencyDifference();
        int int13 = mongoClientOptions5.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
    }

    @Test
    public void test06820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06820");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str11 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setDatabase("637534208");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties0.setPassword(charArray21);
        java.lang.String str24 = mongoProperties0.getGridFsDatabase();
        boolean boolean25 = mongoProperties0.hasCustomAddress();
        mongoProperties0.port = 41014;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.getUri();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        int int34 = mongoClientOptions33.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions33);
        java.lang.Integer int36 = mongoProperties28.getPort();
        java.lang.String str37 = mongoProperties28.getHost();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        boolean boolean43 = mongoClientOptions41.equals((java.lang.Object) (-2147483648));
        int int44 = mongoClientOptions41.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions41.getDbDecoderFactory();
        int int46 = mongoClientOptions41.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties28.builder(mongoClientOptions41);
        int int48 = mongoClientOptions41.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties0.builder(mongoClientOptions41);
        char[] charArray50 = mongoProperties0.password;
        mongoProperties0.setUri("23460");
        java.lang.Class<?> wildcardClass53 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "mongodb://localhost/test" + "'", str29, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 500 + "'", int46 == 500);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10000 + "'", int48 == 10000);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[a, a, #, 4]");
        org.junit.Assert.assertNull(wildcardClass53);
    }

    @Test
    public void test06821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06821");
        int int2 = java.lang.Integer.remainderUnsigned(55, 536);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test06822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06822");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatConnectRetryFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder0.heartbeatSocketTimeout(44);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.connectionsPerHost(10110000);
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
    public void test06823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06823");
        long long1 = java.lang.Integer.toUnsignedLong(1660944384);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1660944384L + "'", long1 == 1660944384L);
    }

    @Test
    public void test06824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06824");
        java.lang.Integer int1 = java.lang.Integer.getInteger("-eb88j24");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06825");
        int int2 = java.lang.Integer.max(35, (-2147483336));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test06826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06826");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment9 = null;
        int int10 = mongoProperties0.determinePort(environment9);
        java.lang.Class<?> wildcardClass11 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = (-1006632951);
        mongoProperties0.clearPassword();
        mongoProperties0.uri = "65536";
        java.lang.String str17 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 214748364);
        java.lang.String str20 = mongoProperties0.getDatabase();
        org.springframework.core.env.Environment environment21 = null;
        int int22 = mongoProperties0.determinePort(environment21);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "11i71" + "'", str20, "11i71");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 214748364 + "'", int22 == 214748364);
    }

    @Test
    public void test06827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06827");
        int int2 = java.lang.Integer.min(600000000, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06828");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 10000;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        java.lang.Class<?> wildcardClass10 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertNull(wildcardClass10);
    }

    @Test
    public void test06829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06829");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder16.acceptableLatencyDifference(56);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        com.mongodb.MongoClientOptions.Builder builder43 = builder38.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.host;
        mongoProperties44.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass48 = mongoProperties44.fieldNamingStrategy;
        mongoProperties44.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties51 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str52 = mongoProperties51.getUri();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.build();
        int int57 = mongoClientOptions56.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder58 = mongoProperties51.builder(mongoClientOptions56);
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties44.builder(mongoClientOptions56);
        javax.net.SocketFactory socketFactory60 = mongoClientOptions56.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder61 = builder43.socketFactory(socketFactory60);
        com.mongodb.MongoClientOptions.Builder builder62 = builder33.socketFactory(socketFactory60);
        com.mongodb.MongoClientOptions.Builder builder64 = builder33.requiredReplicaSetName("1388");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties65 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties65.setHost("");
        mongoProperties65.username = "100";
        com.mongodb.MongoClientOptions.Builder builder70 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.localThreshold(27017);
        java.lang.Class<?> wildcardClass73 = builder72.getClass();
        mongoProperties65.fieldNamingStrategy = wildcardClass73;
        mongoProperties65.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties77 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int78 = mongoProperties77.getDEFAULT_PORT();
        mongoProperties77.setHost("hi!");
        mongoProperties77.host = "";
        mongoProperties77.username = "100";
        com.mongodb.MongoClientOptions.Builder builder85 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder87 = builder85.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions88 = builder85.build();
        boolean boolean89 = mongoClientOptions88.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory90 = mongoClientOptions88.getDbDecoderFactory();
        int int91 = mongoClientOptions88.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder92 = mongoProperties77.builder(mongoClientOptions88);
        com.mongodb.MongoClientOptions.Builder builder93 = mongoProperties65.builder(mongoClientOptions88);
        int int94 = mongoClientOptions88.getHeartbeatSocketTimeout();
        int int95 = mongoClientOptions88.getMinConnectionsPerHost();
        com.mongodb.DBDecoderFactory dBDecoderFactory96 = mongoClientOptions88.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder97 = builder64.dbDecoderFactory(dBDecoderFactory96);
        com.mongodb.MongoClientOptions.Builder builder98 = builder16.dbDecoderFactory(dBDecoderFactory96);
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
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(wildcardClass48);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "mongodb://localhost/test" + "'", str52, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(mongoClientOptions56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(socketFactory60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 27017 + "'", int78 == 27017);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(mongoClientOptions88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 15 + "'", int91 == 15);
        org.junit.Assert.assertNotNull(builder92);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 20000 + "'", int94 == 20000);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1342177280 + "'", int95 == 1342177280);
        org.junit.Assert.assertNotNull(dBDecoderFactory96);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test06830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06830");
        int int1 = java.lang.Integer.parseUnsignedInt("4138");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4138 + "'", int1 == 4138);
    }

    @Test
    public void test06831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06831");
        int int2 = java.lang.Integer.compare((-804206261), 738197504);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06832");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder0.acceptableLatencyDifference(792740645);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.socketKeepAlive(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.getUri();
        boolean boolean16 = mongoProperties14.hasCustomCredentials();
        mongoProperties14.setUri("10");
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        int int23 = mongoClientOptions22.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions22.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions22.getLocalThreshold();
        int int26 = mongoClientOptions22.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory27 = mongoClientOptions22.getDbEncoderFactory();
        int int28 = mongoClientOptions22.getSocketTimeout();
        int int29 = mongoClientOptions22.getHeartbeatFrequency();
        boolean boolean30 = mongoClientOptions22.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties14.builder(mongoClientOptions22);
        com.mongodb.ReadPreference readPreference32 = mongoClientOptions22.getReadPreference();
        int int33 = mongoClientOptions22.getHeartbeatConnectRetryFrequency();
        int int34 = mongoClientOptions22.getSocketTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory35 = mongoClientOptions22.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder13.dbDecoderFactory(dBDecoderFactory35);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.host;
        java.lang.String str39 = mongoProperties37.host;
        java.lang.Integer int40 = mongoProperties37.getPort();
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        boolean boolean46 = mongoClientOptions44.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties37.builder(mongoClientOptions44);
        int int48 = mongoClientOptions44.getThreadsAllowedToBlockForConnectionMultiplier();
        int int49 = mongoClientOptions44.getMaxWaitTime();
        int int50 = mongoClientOptions44.getMinHeartbeatFrequency();
        int int51 = mongoClientOptions44.getMaxConnectionLifeTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory52 = mongoClientOptions44.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder53 = builder13.dbDecoderFactory(dBDecoderFactory52);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5000 + "'", int29 == 5000);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(readPreference32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 500 + "'", int33 == 500);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(int40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 120000 + "'", int49 == 120000);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 500 + "'", int50 == 500);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory52);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test06833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06833");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str2 = mongoProperties0.getGridFsDatabase();
        java.lang.String str3 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06834");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUsername();
        mongoProperties0.gridFsDatabase = "mongodb://localhost/test";
        mongoProperties0.clearPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06835");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(3648, (-2138682786));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3648" + "'", str2, "3648");
    }

    @Test
    public void test06836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06836");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06837");
        int int2 = java.lang.Integer.rotateLeft(1073991849, 1222);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16001616 + "'", int2 == 16001616);
    }

    @Test
    public void test06838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06838");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder20 = builder19.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxConnectionLifeTime(1136);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        int int27 = mongoClientOptions26.getMaxConnectionLifeTime();
        int int28 = mongoClientOptions26.getMaxConnectionLifeTime();
        int int29 = mongoClientOptions26.getLocalThreshold();
        boolean boolean30 = mongoClientOptions26.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory31 = mongoClientOptions26.getSocketFactory();
        javax.net.SocketFactory socketFactory32 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder33 = builder20.socketFactory(socketFactory32);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.connectTimeout(486539264);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.heartbeatConnectRetryFrequency(12160);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder39 = builder35.socketTimeout((-1786380288));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(socketFactory31);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test06839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06839");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties8.gridFsDatabase = "hi!";
        char[] charArray15 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties8.setPassword(charArray15);
        mongoProperties7.setPassword(charArray15);
        java.lang.String str18 = mongoProperties7.getHost();
        java.lang.String str19 = mongoProperties7.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int21 = mongoProperties20.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int23 = mongoProperties22.getDEFAULT_PORT();
        mongoProperties22.setHost("hi!");
        mongoProperties22.host = "";
        mongoProperties22.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties31.gridFsDatabase = "hi!";
        char[] charArray38 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties31.setPassword(charArray38);
        mongoProperties30.setPassword(charArray38);
        mongoProperties22.setPassword(charArray38);
        mongoProperties20.password = charArray38;
        mongoProperties7.password = charArray38;
        mongoProperties0.password = charArray38;
        java.lang.String str45 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 27017 + "'", int23 == 27017);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test06840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06840");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("10011100010000", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10011100010000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06841");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean14 = mongoClientOptions13.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory15 = mongoClientOptions13.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder16 = builder9.dbEncoderFactory(dBEncoderFactory15);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder19 = builder18.legacyDefaults();
        java.lang.Class<?> wildcardClass20 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test06842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06842");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("11110110011001100110011010001001");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 11110110011001100110011010001001");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06843");
        java.lang.String str1 = java.lang.Integer.toString(120000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "120000" + "'", str1, "120000");
    }

    @Test
    public void test06844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06844");
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
        java.lang.String str37 = mongoProperties0.getHost();
        mongoProperties0.setHost("8000");
        mongoProperties0.clearPassword();
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
    }

    @Test
    public void test06845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06845");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.requiredReplicaSetName("7fffffff");
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.socketTimeout(10110000);
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
    public void test06846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06846");
        int int1 = java.lang.Integer.parseInt("1200");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1200 + "'", int1 == 1200);
    }

    @Test
    public void test06847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06847");
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
        mongoProperties0.database = "17";
        mongoProperties0.host = "402767888";
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
    }

    @Test
    public void test06848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06848");
        int int1 = java.lang.Integer.bitCount(2097152);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06849");
        java.lang.String str1 = java.lang.Integer.toString(1100001);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100001" + "'", str1, "1100001");
    }

    @Test
    public void test06850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06850");
        int int2 = java.lang.Integer.rotateLeft((-2146433021), 16810040);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 58724360 + "'", int2 == 58724360);
    }

    @Test
    public void test06851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06851");
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
        com.mongodb.MongoClientOptions.Builder builder18 = builder17.legacyDefaults();
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
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test06852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06852");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(444, 128);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444" + "'", str2, "444");
    }

    @Test
    public void test06853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06853");
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
        mongoProperties0.setPort((java.lang.Integer) 32768000);
        java.lang.String str27 = mongoProperties0.username;
        java.lang.String str28 = mongoProperties0.getAuthenticationDatabase();
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test06854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06854");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("tj4n6f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"tj4n6f\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06855");
        int int1 = java.lang.Integer.reverse(858811187);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-858387252) + "'", int1 == (-858387252));
    }

    @Test
    public void test06856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06856");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1100101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test06857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06857");
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
        java.lang.String str31 = mongoClientOptions23.getRequiredReplicaSetName();
        boolean boolean32 = mongoClientOptions23.isAutoConnectRetry();
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test06858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06858");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test06859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06859");
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
        org.springframework.core.env.Environment environment21 = null;
        int int22 = mongoProperties0.determinePort(environment21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder31 = builder23.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder37 = builder31.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder39 = builder31.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.requiredReplicaSetName("369098752");
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder41.build();
        com.mongodb.MongoClient mongoClient43 = mongoProperties0.createMongoClient(mongoClientOptions42);
        mongoProperties0.port = 84674746;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 25 + "'", int22 == 25);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertNotNull(mongoClient43);
    }

    @Test
    public void test06860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06860");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getAcceptableLatencyDifference();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder13.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder13.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minHeartbeatFrequency(1100001);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minHeartbeatFrequency(5);
        boolean boolean30 = mongoClientOptions3.equals((java.lang.Object) 5);
        int int31 = mongoClientOptions3.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10000 + "'", int6 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
    }

    @Test
    public void test06861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06861");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1p7082k", 3648);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 3648 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06862");
        int int2 = java.lang.Integer.max(939603072, 10566);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 939603072 + "'", int2 == 939603072);
    }

    @Test
    public void test06863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06863");
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
        mongoProperties0.gridFsDatabase = "500";
        java.lang.Class<?> wildcardClass22 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Class<?> wildcardClass23 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNull(wildcardClass23);
    }

    @Test
    public void test06864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06864");
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
        int int29 = mongoClientOptions20.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
    }

    @Test
    public void test06865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06865");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatThreadCount(74579968);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(35);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.description("16000000000");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectionsPerHost(1157627904);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.acceptableLatencyDifference((int) '#');
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.requiredReplicaSetName("94000001");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxConnectionLifeTime(10);
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
    public void test06866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06866");
        int int2 = java.lang.Integer.remainderUnsigned(2, 17877217);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06867");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str12 = mongoProperties0.uri;
        mongoProperties0.setPort((java.lang.Integer) 1664);
        java.lang.String str15 = mongoProperties0.getHost();
        java.lang.String str16 = mongoProperties0.username;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "test" + "'", str16, "test");
    }

    @Test
    public void test06868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06868");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder2.acceptableLatencyDifference(25);
        com.mongodb.MongoClientOptions.Builder builder11 = builder2.alwaysUseMBeans(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        int int20 = mongoClientOptions17.getMaxConnectionIdleTime();
        boolean boolean21 = mongoClientOptions17.isCursorFinalizerEnabled();
        boolean boolean22 = mongoClientOptions17.isSocketKeepAlive();
        javax.net.SocketFactory socketFactory23 = mongoClientOptions17.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder24 = builder2.socketFactory(socketFactory23);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder26 = builder2.maxConnectionIdleTime((-2146433021));
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(socketFactory23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test06869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06869");
        java.lang.String str1 = java.lang.Integer.toUnsignedString((-47480831));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4247486465" + "'", str1, "4247486465");
    }

    @Test
    public void test06870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06870");
        java.lang.String str1 = java.lang.Integer.toString((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "97" + "'", str1, "97");
    }

    @Test
    public void test06871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06871");
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
        mongoProperties0.setAuthenticationDatabase("4294967295");
        java.lang.String str20 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str21 = mongoProperties0.authenticationDatabase;
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "test" + "'", str20, "test");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4294967295" + "'", str21, "4294967295");
    }

    @Test
    public void test06872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06872");
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
        java.lang.String str23 = mongoProperties0.authenticationDatabase;
        mongoProperties0.host = "10100000000000000000000000001000";
        java.lang.String str26 = mongoProperties0.getDatabase();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "90" + "'", str26, "90");
    }

    @Test
    public void test06873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06873");
        java.lang.String str1 = java.lang.Integer.toString(90);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "90" + "'", str1, "90");
    }

    @Test
    public void test06874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06874");
        int int1 = java.lang.Integer.reverseBytes(14837485);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-312024576) + "'", int1 == (-312024576));
    }

    @Test
    public void test06875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06875");
        java.lang.Integer int1 = java.lang.Integer.getInteger("369098752");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06876");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions7.getDbDecoderFactory();
        int int16 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder20 = builder19.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder23.acceptableLatencyDifference(214748364);
        boolean boolean32 = mongoClientOptions7.equals((java.lang.Object) builder31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder31.minConnectionsPerHost(74);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.threadsAllowedToBlockForConnectionMultiplier(1167228935);
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.heartbeatConnectRetryFrequency((int) (byte) 1);
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
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test06877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06877");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.getUsername();
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.springframework.core.env.Environment environment6 = null;
        int int7 = mongoProperties0.determinePort(environment6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
    }

    @Test
    public void test06878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06878");
        int int1 = java.lang.Integer.reverseBytes(1342177280);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 80 + "'", int1 == 80);
    }

    @Test
    public void test06879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06879");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setGridFsDatabase("14152");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test06880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06880");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "22";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int8 = mongoProperties7.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int10 = mongoProperties9.getDEFAULT_PORT();
        mongoProperties9.setHost("hi!");
        mongoProperties9.host = "";
        mongoProperties9.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties18.gridFsDatabase = "hi!";
        char[] charArray25 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties18.setPassword(charArray25);
        mongoProperties17.setPassword(charArray25);
        mongoProperties9.setPassword(charArray25);
        mongoProperties7.password = charArray25;
        mongoProperties0.password = charArray25;
        java.lang.String str31 = mongoProperties0.authenticationDatabase;
        mongoProperties0.port = 738197504;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27017 + "'", int8 == 27017);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test06881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06881");
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
        mongoProperties0.setDatabase("100000000000000000000000000");
        java.lang.String str61 = mongoProperties0.getUsername();
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
    public void test06882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06882");
        int int2 = java.lang.Integer.rotateRight(102886528, (-1530789132));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 516423778 + "'", int2 == 516423778);
    }

    @Test
    public void test06883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06883");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("12", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 12");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06884");
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
        com.mongodb.MongoClientOptions.Builder builder40 = builder0.heartbeatFrequency(44);
        com.mongodb.MongoClientOptions.Builder builder42 = builder0.maxConnectionLifeTime(61);
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
    }

    @Test
    public void test06885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06885");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.host = "2";
        mongoProperties0.host = "mongodb://localhost/test";
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        java.lang.String str11 = mongoProperties0.username;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
    }

    @Test
    public void test06886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06886");
        java.lang.String str1 = java.lang.Integer.toOctalString(40);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "50" + "'", str1, "50");
    }

    @Test
    public void test06887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06887");
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
        java.lang.String str19 = mongoClientOptions14.getDescription();
        int int20 = mongoClientOptions14.getHeartbeatThreadCount();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test06888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06888");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = mongoClientOptions3.getDbDecoderFactory();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int9 = mongoClientOptions3.getHeartbeatFrequency();
        boolean boolean10 = mongoClientOptions3.isSocketKeepAlive();
        int int11 = mongoClientOptions3.getMinConnectionsPerHost();
        int int12 = mongoClientOptions3.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1342177280 + "'", int11 == 1342177280);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1342177280 + "'", int12 == 1342177280);
    }

    @Test
    public void test06889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06889");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory7 = mongoClientOptions3.getDbEncoderFactory();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test06890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06890");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean7 = mongoClientOptions3.isAutoConnectRetry();
        java.lang.String str8 = mongoClientOptions3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06891");
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
        mongoProperties0.setUsername("8b000000");
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
    }

    @Test
    public void test06892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06892");
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
        boolean boolean18 = mongoProperties0.hasCustomCredentials();
        boolean boolean19 = mongoProperties0.hasCustomCredentials();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test06893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06893");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("-eb88j24", 469762048);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 469762048 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06894");
        int int1 = java.lang.Integer.highestOneBit((-858387252));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test06895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06895");
        int int1 = java.lang.Integer.bitCount(792740645);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test06896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06896");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.acceptableLatencyDifference(214748364);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder6.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
    }

    @Test
    public void test06897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06897");
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
        java.lang.String str44 = mongoProperties0.getUri();
        java.lang.String str45 = mongoProperties0.getDatabase();
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
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "mongodb://localhost/test" + "'", str44, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test06898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06898");
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
        java.lang.String str23 = mongoProperties0.authenticationDatabase;
        java.lang.String str24 = mongoProperties0.uri;
        java.lang.String str25 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb://localhost/test" + "'", str24, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test06899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06899");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(644024574, 1717986912);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "644024574" + "'", str2, "644024574");
    }

    @Test
    public void test06900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06900");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) (-1));
        java.lang.String str4 = mongoProperties0.getDatabase();
        java.lang.String str5 = mongoProperties0.host;
        mongoProperties0.setAuthenticationDatabase("11010");
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test06901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06901");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(320000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "320000" + "'", str1, "320000");
    }

    @Test
    public void test06902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06902");
        int int1 = java.lang.Integer.numberOfLeadingZeros(137);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test06903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06903");
        java.lang.String str1 = java.lang.Integer.toString(1660944384);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1660944384" + "'", str1, "1660944384");
    }

    @Test
    public void test06904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06904");
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
        java.lang.String str26 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str28 = mongoProperties27.host;
        mongoProperties27.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass31 = mongoProperties27.fieldNamingStrategy;
        mongoProperties27.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties34 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str35 = mongoProperties34.getUri();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        int int40 = mongoClientOptions39.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties34.builder(mongoClientOptions39);
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties27.builder(mongoClientOptions39);
        javax.net.SocketFactory socketFactory43 = mongoClientOptions39.getSocketFactory();
        int int44 = mongoClientOptions39.getHeartbeatConnectRetryFrequency();
        boolean boolean45 = mongoClientOptions39.isAutoConnectRetry();
        int int46 = mongoClientOptions39.getAcceptableLatencyDifference();
        com.mongodb.DBEncoderFactory dBEncoderFactory47 = mongoClientOptions39.getDbEncoderFactory();
        org.springframework.core.env.Environment environment48 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient49 = mongoProperties0.createMongoClient(mongoClientOptions39, environment48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "mongodb://localhost/test" + "'", str35, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(socketFactory43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 500 + "'", int44 == 500);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 15 + "'", int46 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory47);
    }

    @Test
    public void test06905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06905");
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
        int int62 = mongoClientOptions3.getConnectionsPerHost();
        boolean boolean63 = mongoClientOptions3.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test06906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06906");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.connectionsPerHost(28);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatConnectRetryFrequency(53182464);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.localThreshold(500);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.socketTimeout(10);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        int int36 = mongoClientOptions35.getMaxConnectionLifeTime();
        int int37 = mongoClientOptions35.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference38 = mongoClientOptions35.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder39 = builder29.readPreference(readPreference38);
        com.mongodb.MongoClientOptions.Builder builder40 = builder0.readPreference(readPreference38);
        com.mongodb.MongoClientOptions.Builder builder42 = builder0.threadsAllowedToBlockForConnectionMultiplier(24);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.heartbeatConnectTimeout(20000);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.maxAutoConnectRetryTime((long) 1540128);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 500 + "'", int37 == 500);
        org.junit.Assert.assertNotNull(readPreference38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test06907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06907");
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
        java.lang.String str42 = mongoProperties0.uri;
        mongoProperties0.setGridFsDatabase("17210368");
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "mongodb://localhost/test" + "'", str42, "mongodb://localhost/test");
    }

    @Test
    public void test06908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06908");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10011011110000100011000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10011011110000100011000000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06909");
        java.lang.String str2 = java.lang.Integer.toString((-2145648384), 1000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2145648384" + "'", str2, "-2145648384");
    }

    @Test
    public void test06910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06910");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("11110100001010100101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11110100001010100101\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06911");
        int int1 = java.lang.Integer.parseInt("11610");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11610 + "'", int1 == 11610);
    }

    @Test
    public void test06912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06912");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1660944384, 16777215);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1660944384" + "'", str2, "1660944384");
    }

    @Test
    public void test06913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06913");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getLocalThreshold();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getConnectTimeout();
        int int10 = mongoClientOptions3.getConnectionsPerHost();
        java.lang.String str11 = mongoClientOptions3.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test06914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06914");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.Integer int6 = mongoProperties0.port;
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        java.lang.Integer int9 = mongoProperties0.port;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test06915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10001001101", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06916");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("18", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 18");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06917");
        int int1 = java.lang.Integer.bitCount(10010000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test06918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06918");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("7fffffff");
        mongoProperties0.authenticationDatabase = "7341045";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int12 = mongoProperties11.getDEFAULT_PORT();
        mongoProperties11.setHost("hi!");
        java.lang.String str15 = mongoProperties11.host;
        java.lang.Integer int16 = mongoProperties11.port;
        java.lang.Integer int17 = mongoProperties11.getPort();
        char[] charArray18 = mongoProperties11.password;
        mongoProperties11.setDatabase("100");
        mongoProperties11.setHost("2684354568");
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        boolean boolean28 = mongoClientOptions26.equals((java.lang.Object) (-2147483648));
        int int29 = mongoClientOptions26.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions26.getDbDecoderFactory();
        int int31 = mongoClientOptions26.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties11.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.socketKeepAlive(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(charArray18);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test06919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06919");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.database;
        boolean boolean12 = mongoProperties0.hasCustomAddress();
        java.lang.String str13 = mongoProperties0.getAuthenticationDatabase();
        int int14 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
    }

    @Test
    public void test06920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06920");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder25 = builder17.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.threadsAllowedToBlockForConnectionMultiplier(8);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder33 = builder32.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder37 = builder33.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        boolean boolean43 = mongoClientOptions41.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory44 = mongoClientOptions41.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder33.socketFactory(socketFactory44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder33.socketTimeout(25);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(7340545);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties50.setHost("");
        mongoProperties50.username = "100";
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.localThreshold(27017);
        java.lang.Class<?> wildcardClass58 = builder57.getClass();
        mongoProperties50.fieldNamingStrategy = wildcardClass58;
        mongoProperties50.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties62 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int63 = mongoProperties62.getDEFAULT_PORT();
        mongoProperties62.setHost("hi!");
        mongoProperties62.host = "";
        mongoProperties62.username = "100";
        com.mongodb.MongoClientOptions.Builder builder70 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder70.build();
        boolean boolean74 = mongoClientOptions73.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory75 = mongoClientOptions73.getDbDecoderFactory();
        int int76 = mongoClientOptions73.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder77 = mongoProperties62.builder(mongoClientOptions73);
        com.mongodb.MongoClientOptions.Builder builder78 = mongoProperties50.builder(mongoClientOptions73);
        int int79 = mongoClientOptions73.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory80 = mongoClientOptions73.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder81 = builder47.dbEncoderFactory(dBEncoderFactory80);
        com.mongodb.MongoClientOptions.Builder builder82 = builder25.dbEncoderFactory(dBEncoderFactory80);
        com.mongodb.MongoClientOptions.Builder builder83 = builder12.dbEncoderFactory(dBEncoderFactory80);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder85 = builder12.socketTimeout((-2146433022));
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
        org.junit.Assert.assertNotNull(builder15);
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
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(socketFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 27017 + "'", int63 == 27017);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 15 + "'", int76 == 15);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 20000 + "'", int79 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test06921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06921");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1795162112);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1101011000000000000000000000000" + "'", str1, "1101011000000000000000000000000");
    }

    @Test
    public void test06922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06922");
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
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.description("1388");
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.socketKeepAlive(true);
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
    }

    @Test
    public void test06923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06923");
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
        boolean boolean13 = mongoClientOptions11.equals((java.lang.Object) (-2147483648));
        int int14 = mongoClientOptions11.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions11.getDbDecoderFactory();
        int int16 = mongoClientOptions11.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        javax.net.SocketFactory socketFactory18 = mongoClientOptions11.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder19 = builder7.socketFactory(socketFactory18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(socketFactory18);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test06924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06924");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatThreadCount(74579968);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder11.connectionsPerHost(28);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int21 = mongoProperties20.getDEFAULT_PORT();
        mongoProperties20.setHost("hi!");
        mongoProperties20.host = "";
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        java.lang.String str30 = mongoClientOptions29.toString();
        int int31 = mongoClientOptions29.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties20.builder(mongoClientOptions29);
        int int33 = mongoClientOptions29.getConnectTimeout();
        javax.net.SocketFactory socketFactory34 = mongoClientOptions29.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder35 = builder11.socketFactory(socketFactory34);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        com.mongodb.MongoClientOptions.Builder builder43 = builder38.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder45 = builder38.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder47 = builder38.maxConnectionLifeTime(120000);
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
        com.mongodb.MongoClientOptions.Builder builder59 = builder38.dbDecoderFactory(dBDecoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder60 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder60.build();
        boolean boolean64 = mongoClientOptions63.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory65 = mongoClientOptions63.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder66 = builder38.dbEncoderFactory(dBEncoderFactory65);
        com.mongodb.MongoClientOptions.Builder builder67 = builder35.dbEncoderFactory(dBEncoderFactory65);
        com.mongodb.MongoClientOptions.Builder builder68 = builder0.dbEncoderFactory(dBEncoderFactory65);
        com.mongodb.MongoClientOptions.Builder builder70 = builder0.heartbeatSocketTimeout(69);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertNotNull(socketFactory34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
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
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
    }

    @Test
    public void test06925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06925");
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
        int int30 = mongoClientOptions23.getMaxWaitTime();
        boolean boolean31 = mongoClientOptions23.isCursorFinalizerEnabled();
        int int32 = mongoClientOptions23.getConnectionsPerHost();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 120000 + "'", int30 == 120000);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test06926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06926");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatSocketTimeout(67108864);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketTimeout(0);
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
    public void test06927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06927");
        int int1 = java.lang.Integer.numberOfLeadingZeros(16001616);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test06928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06928");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.username;
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test06929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06929");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        int int9 = mongoClientOptions3.getLocalThreshold();
        boolean boolean10 = mongoClientOptions3.isSocketKeepAlive();
        int int11 = mongoClientOptions3.getConnectTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str13 = mongoProperties12.getUri();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties12.builder(mongoClientOptions17);
        int int20 = mongoClientOptions17.getMaxConnectionIdleTime();
        int int21 = mongoClientOptions17.getMinHeartbeatFrequency();
        boolean boolean22 = mongoClientOptions3.equals((java.lang.Object) mongoClientOptions17);
        boolean boolean23 = mongoClientOptions3.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10000 + "'", int11 == 10000);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500 + "'", int21 == 500);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test06930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06930");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 738197504);
        char[] charArray8 = mongoProperties0.password;
        java.lang.String str9 = mongoProperties0.host;
        mongoProperties0.setDatabase("-1610547200");
        java.lang.String str12 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1610547200" + "'", str12, "-1610547200");
    }

    @Test
    public void test06931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06931");
        int int1 = java.lang.Integer.parseInt("10110000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10110000 + "'", int1 == 10110000);
    }

    @Test
    public void test06932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06932");
        int int2 = java.lang.Integer.min(5, 1311473413);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test06933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06933");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 33651782);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test06934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06934");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.String str8 = mongoProperties0.getHost();
        java.lang.String str9 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setDatabase("8001d4bf");
        mongoProperties0.uri = "32768000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }

    @Test
    public void test06935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06935");
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
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder17.build();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        int int31 = mongoClientOptions30.getMaxConnectionLifeTime();
        int int32 = mongoClientOptions30.getMaxConnectionLifeTime();
        int int33 = mongoClientOptions30.getLocalThreshold();
        boolean boolean34 = mongoClientOptions30.isAlwaysUseMBeans();
        java.lang.String str35 = mongoClientOptions30.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern36 = mongoClientOptions30.getWriteConcern();
        int int37 = mongoClientOptions30.getMinConnectionsPerHost();
        int int38 = mongoClientOptions30.getSocketTimeout();
        javax.net.SocketFactory socketFactory39 = mongoClientOptions30.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder17.socketFactory(socketFactory39);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder42 = builder40.acceptableLatencyDifference((-2055088961));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acceptableLatencyDifference must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(writeConcern36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1342177280 + "'", int37 == 1342177280);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test06936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06936");
        int int1 = java.lang.Integer.reverseBytes(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 503316480 + "'", int1 == 503316480);
    }

    @Test
    public void test06937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06937");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setGridFsDatabase("");
        mongoProperties0.database = "2d5a";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
    }

    @Test
    public void test06938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06938");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory8 = mongoClientOptions3.getDbEncoderFactory();
        int int9 = mongoClientOptions3.getHeartbeatSocketTimeout();
        javax.net.SocketFactory socketFactory10 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertNotNull(socketFactory10);
    }

    @Test
    public void test06939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06939");
        int int2 = java.lang.Integer.sum(0, 605440);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 605440 + "'", int2 == 605440);
    }

    @Test
    public void test06940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06940");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.requiredReplicaSetName("1388");
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.maxConnectionIdleTime(38);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        java.lang.String str23 = mongoClientOptions22.toString();
        int int24 = mongoClientOptions22.getHeartbeatFrequency();
        int int25 = mongoClientOptions22.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory26 = mongoClientOptions22.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder27 = builder18.dbEncoderFactory(dBEncoderFactory26);
        com.mongodb.MongoClientOptions.Builder builder29 = builder18.heartbeatConnectRetryFrequency(1879048192);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5000 + "'", int24 == 5000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test06941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06941");
        int int1 = java.lang.Integer.lowestOneBit(536);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test06942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06942");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int6 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
    }

    @Test
    public void test06943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06943");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.database = "4e20";
        mongoProperties0.port = (-1811939327);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean15 = mongoClientOptions13.equals((java.lang.Object) (-2147483648));
        java.lang.String str16 = mongoClientOptions13.getRequiredReplicaSetName();
        int int17 = mongoClientOptions13.getLocalThreshold();
        int int18 = mongoClientOptions13.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions13);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.acceptableLatencyDifference(10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.heartbeatSocketTimeout(55);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(8402945);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test06944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06944");
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
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatThreadCount(67108864);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime(214748364);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.heartbeatSocketTimeout(90);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxConnectionLifeTime(0);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test06945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06945");
        java.lang.String str1 = java.lang.Integer.toString(1856);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1856" + "'", str1, "1856");
    }

    @Test
    public void test06946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06946");
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
        com.mongodb.MongoClientOptions.Builder builder51 = builder47.heartbeatConnectRetryFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder53 = builder47.threadsAllowedToBlockForConnectionMultiplier(1100100);
        com.mongodb.MongoClientOptions.Builder builder55 = builder47.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions61 = builder58.build();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties62 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str63 = mongoProperties62.host;
        java.lang.String str64 = mongoProperties62.host;
        java.lang.Integer int65 = mongoProperties62.getPort();
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions69 = builder66.build();
        boolean boolean71 = mongoClientOptions69.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder72 = mongoProperties62.builder(mongoClientOptions69);
        int int73 = mongoClientOptions69.getThreadsAllowedToBlockForConnectionMultiplier();
        int int74 = mongoClientOptions69.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern75 = mongoClientOptions69.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder76 = builder58.writeConcern(writeConcern75);
        com.mongodb.MongoClientOptions.Builder builder77 = builder47.writeConcern(writeConcern75);
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
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(mongoClientOptions61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(int65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 5 + "'", int73 == 5);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 120000 + "'", int74 == 120000);
        org.junit.Assert.assertNotNull(writeConcern75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder77);
    }

    @Test
    public void test06947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06947");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.alwaysUseMBeans(false);
        javax.net.SocketFactory socketFactory21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder22 = builder20.socketFactory(socketFactory21);
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
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06948");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.threadsAllowedToBlockForConnectionMultiplier(120000);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.requiredReplicaSetName("536870912");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.heartbeatSocketTimeout(6989);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder30 = builder26.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        com.mongodb.MongoClientOptions.Builder builder46 = builder41.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.host;
        mongoProperties47.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass51 = mongoProperties47.fieldNamingStrategy;
        mongoProperties47.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties54 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str55 = mongoProperties54.getUri();
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions59 = builder56.build();
        int int60 = mongoClientOptions59.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties54.builder(mongoClientOptions59);
        com.mongodb.MongoClientOptions.Builder builder62 = mongoProperties47.builder(mongoClientOptions59);
        javax.net.SocketFactory socketFactory63 = mongoClientOptions59.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder64 = builder46.socketFactory(socketFactory63);
        com.mongodb.MongoClientOptions.Builder builder65 = builder36.socketFactory(socketFactory63);
        com.mongodb.MongoClientOptions.Builder builder67 = builder36.socketTimeout(947912705);
        com.mongodb.MongoClientOptions.Builder builder69 = builder36.threadsAllowedToBlockForConnectionMultiplier(805306368);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties70 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str71 = mongoProperties70.getUri();
        com.mongodb.MongoClientOptions.Builder builder72 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder74 = builder72.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions75 = builder72.build();
        int int76 = mongoClientOptions75.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder77 = mongoProperties70.builder(mongoClientOptions75);
        int int78 = mongoClientOptions75.getMaxConnectionIdleTime();
        int int79 = mongoClientOptions75.getMinHeartbeatFrequency();
        int int80 = mongoClientOptions75.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.WriteConcern writeConcern81 = mongoClientOptions75.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder82 = builder69.writeConcern(writeConcern81);
        com.mongodb.MongoClientOptions.Builder builder83 = builder23.writeConcern(writeConcern81);
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
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(wildcardClass51);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "mongodb://localhost/test" + "'", str55, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(mongoClientOptions59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(socketFactory63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "mongodb://localhost/test" + "'", str71, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(mongoClientOptions75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 500 + "'", int79 == 500);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 5 + "'", int80 == 5);
        org.junit.Assert.assertNotNull(writeConcern81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test06949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06949");
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
        boolean boolean31 = mongoClientOptions23.isCursorFinalizerEnabled();
        java.lang.String str32 = mongoClientOptions23.getRequiredReplicaSetName();
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test06950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06950");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        java.lang.String str4 = mongoProperties0.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str6 = mongoProperties5.getUri();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties5.builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions10);
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions10.getReadPreference();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(readPreference14);
    }

    @Test
    public void test06951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06951");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setHost("");
        mongoProperties0.setUsername("7fffffff");
        java.lang.String str11 = mongoProperties0.username;
        mongoProperties0.gridFsDatabase = "500";
        mongoProperties0.setUsername("20000");
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        boolean boolean21 = mongoClientOptions19.isAutoConnectRetry();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient22 = mongoProperties0.createMongoClient(mongoClientOptions19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7fffffff" + "'", str11, "7fffffff");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test06952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06952");
        int int1 = java.lang.Integer.signum((-649917440));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test06953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06953");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.maxAutoConnectRetryTime((long) 32);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatThreadCount((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.connectTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions19.getLocalThreshold();
        int int23 = mongoClientOptions19.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str24 = mongoClientOptions19.getRequiredReplicaSetName();
        int int25 = mongoClientOptions19.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory26 = mongoClientOptions19.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory27 = mongoClientOptions19.getDbDecoderFactory();
        int int28 = mongoClientOptions19.getMaxConnectionLifeTime();
        long long29 = mongoClientOptions19.getMaxAutoConnectRetryTime();
        java.lang.String str30 = mongoClientOptions19.toString();
        javax.net.SocketFactory socketFactory31 = mongoClientOptions19.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder32 = builder11.socketFactory(socketFactory31);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5000 + "'", int25 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory26);
        org.junit.Assert.assertNotNull(dBDecoderFactory27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(socketFactory31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test06954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06954");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int14 = mongoProperties0.getPort();
        char[] charArray15 = mongoProperties0.password;
        java.lang.String str16 = mongoProperties0.getHost();
        java.lang.String str17 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        int int22 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions21.getMaxConnectionLifeTime();
        int int24 = mongoClientOptions21.getLocalThreshold();
        int int25 = mongoClientOptions21.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str26 = mongoClientOptions21.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder30 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        boolean boolean39 = mongoClientOptions38.isAlwaysUseMBeans();
        int int40 = mongoClientOptions38.getLocalThreshold();
        int int41 = mongoClientOptions38.getSocketTimeout();
        int int42 = mongoClientOptions38.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern43 = mongoClientOptions38.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder44 = builder34.writeConcern(writeConcern43);
        boolean boolean45 = mongoClientOptions21.equals((java.lang.Object) builder44);
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties0.builder(mongoClientOptions21);
        char[] charArray47 = mongoProperties0.password;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(writeConcern43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, a, #, 4]");
    }

    @Test
    public void test06955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06955");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxWaitTime(15);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime(1071000000);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        long long18 = mongoClientOptions16.getMaxAutoConnectRetryTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions16.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder6.dbEncoderFactory(dBEncoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions24.getMaxConnectionLifeTime();
        boolean boolean27 = mongoClientOptions24.isCursorFinalizerEnabled();
        javax.net.SocketFactory socketFactory28 = mongoClientOptions24.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder29 = builder6.socketFactory(socketFactory28);
        com.mongodb.MongoClientOptions.Builder builder31 = builder6.minHeartbeatFrequency(1664);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test06956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06956");
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
        int int16 = mongoClientOptions9.getHeartbeatThreadCount();
        java.lang.String str17 = mongoClientOptions9.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test06957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("21004600200");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"21004600200\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06958");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("2");
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test06959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06959");
        java.lang.String str1 = java.lang.Integer.toHexString(441108803);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1a4ac943" + "'", str1, "1a4ac943");
    }

    @Test
    public void test06960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06960");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionIdleTime(0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.description("1207959552");
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
    public void test06961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06961");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.uri = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int4 = mongoProperties3.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int6 = mongoProperties5.getDEFAULT_PORT();
        mongoProperties5.setHost("hi!");
        mongoProperties5.host = "";
        mongoProperties5.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.gridFsDatabase = "hi!";
        char[] charArray21 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties14.setPassword(charArray21);
        mongoProperties13.setPassword(charArray21);
        mongoProperties5.setPassword(charArray21);
        mongoProperties3.password = charArray21;
        mongoProperties0.password = charArray21;
        java.lang.String str27 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        boolean boolean32 = mongoClientOptions31.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory33 = mongoClientOptions31.getDbEncoderFactory();
        int int34 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        int int35 = mongoClientOptions31.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions31);
        int int37 = mongoClientOptions31.getMaxConnectionIdleTime();
        int int38 = mongoClientOptions31.getLocalThreshold();
        com.mongodb.ReadPreference readPreference39 = mongoClientOptions31.getReadPreference();
        com.mongodb.WriteConcern writeConcern40 = mongoClientOptions31.getWriteConcern();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1342177280 + "'", int35 == 1342177280);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(readPreference39);
        org.junit.Assert.assertNotNull(writeConcern40);
    }

    @Test
    public void test06962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06962");
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
        java.lang.Integer int22 = mongoProperties0.port;
        mongoProperties0.setDatabase("");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test06963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06963");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        char[] charArray10 = new char[] { '4', '4' };
        mongoProperties0.password = charArray10;
        char[] charArray12 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4]");
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, 4]");
    }

    @Test
    public void test06964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06964");
        int int2 = java.lang.Integer.compareUnsigned(301, 13312);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06965");
        int int1 = java.lang.Integer.parseUnsignedInt("1100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1100 + "'", int1 == 1100);
    }

    @Test
    public void test06966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06966");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties13.setHost("");
        mongoProperties13.username = "100";
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold(27017);
        java.lang.Class<?> wildcardClass21 = builder20.getClass();
        mongoProperties13.fieldNamingStrategy = wildcardClass21;
        mongoProperties13.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int26 = mongoProperties25.getDEFAULT_PORT();
        mongoProperties25.setHost("hi!");
        mongoProperties25.host = "";
        mongoProperties25.username = "100";
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        boolean boolean37 = mongoClientOptions36.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory38 = mongoClientOptions36.getDbDecoderFactory();
        int int39 = mongoClientOptions36.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties25.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties13.builder(mongoClientOptions36);
        com.mongodb.WriteConcern writeConcern42 = mongoClientOptions36.getWriteConcern();
        int int43 = mongoClientOptions36.getAcceptableLatencyDifference();
        boolean boolean44 = mongoClientOptions36.isSocketKeepAlive();
        com.mongodb.ReadPreference readPreference45 = mongoClientOptions36.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory46 = mongoClientOptions36.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder47 = builder10.dbDecoderFactory(dBDecoderFactory46);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minHeartbeatFrequency(162);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 27017 + "'", int26 == 27017);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(writeConcern42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(readPreference45);
        org.junit.Assert.assertNotNull(dBDecoderFactory46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test06967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06967");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("11010111001010100000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"11010111001010100000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06968");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        int int20 = mongoClientOptions18.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions18.getLocalThreshold();
        boolean boolean22 = mongoClientOptions18.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory23 = mongoClientOptions18.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder24 = builder12.socketFactory(socketFactory23);
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.socketFactory(socketFactory23);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder7.build();
        int int27 = mongoClientOptions26.getLocalThreshold();
        java.lang.String str28 = mongoClientOptions26.toString();
        int int29 = mongoClientOptions26.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(socketFactory23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test06969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06969");
        java.lang.Integer int1 = java.lang.Integer.getInteger("2947841");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test06970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06970");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUsername("");
        char[] charArray9 = mongoProperties0.password;
        mongoProperties0.setUri("16000000000");
        java.lang.String str12 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test06971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06971");
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
        java.lang.String str22 = mongoProperties0.authenticationDatabase;
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test06972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06972");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        int int8 = mongoClientOptions5.getMaxConnectionIdleTime();
        int int9 = mongoClientOptions5.getMinHeartbeatFrequency();
        int int10 = mongoClientOptions5.getSocketTimeout();
        int int11 = mongoClientOptions5.getHeartbeatFrequency();
        int int12 = mongoClientOptions5.getMaxConnectionIdleTime();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5000 + "'", int11 == 5000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test06973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06973");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getMaxConnectionLifeTime();
        boolean boolean13 = mongoClientOptions11.isAutoConnectRetry();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions11.getSocketFactory();
        int int15 = mongoClientOptions11.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions11);
        com.mongodb.ReadPreference readPreference17 = mongoClientOptions11.getReadPreference();
        boolean boolean18 = mongoClientOptions11.isCursorFinalizerEnabled();
        java.lang.String str19 = mongoClientOptions11.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(readPreference17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test06974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06974");
        int int2 = java.lang.Integer.rotateRight(1081082373, 1176610106);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 469795152 + "'", int2 == 469795152);
    }

    @Test
    public void test06975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06975");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int14 = mongoProperties0.getPort();
        java.lang.String str15 = mongoProperties0.getHost();
        java.lang.String str16 = mongoProperties0.database;
        mongoProperties0.setDatabase("10000000001");
        org.springframework.core.env.Environment environment19 = null;
        int int20 = mongoProperties0.determinePort(environment19);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27017 + "'", int20 == 27017);
    }

    @Test
    public void test06976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06976");
        java.lang.String str1 = java.lang.Integer.toString(469762048);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "469762048" + "'", str1, "469762048");
    }

    @Test
    public void test06977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06977");
        int int2 = java.lang.Integer.min(441108803, 1879048192);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 441108803 + "'", int2 == 441108803);
    }

    @Test
    public void test06978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06978");
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
        int int33 = mongoClientOptions27.getSocketTimeout();
        java.lang.String str34 = mongoClientOptions27.getDescription();
        int int35 = mongoClientOptions27.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean36 = mongoClientOptions27.isSocketKeepAlive();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient37 = mongoProperties0.createMongoClient(mongoClientOptions27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10000 + "'", int31 == 10000);
        org.junit.Assert.assertNotNull(socketFactory32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test06979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06979");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder10 = mongoProperties0.builder(mongoClientOptions7);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties11.gridFsDatabase = "hi!";
        char[] charArray18 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties11.setPassword(charArray18);
        mongoProperties0.setPassword(charArray18);
        mongoProperties0.clearPassword();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getMaxConnectionLifeTime();
        int int27 = mongoClientOptions25.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions25);
        java.lang.Class<?> wildcardClass29 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(wildcardClass29);
    }

    @Test
    public void test06980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06980");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatThreadCount(74579968);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder0.heartbeatThreadCount(1073741825);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(23);
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
    public void test06981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06981");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("41014", 931422209);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 931422209 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06982");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        com.mongodb.MongoClientOptions.Builder builder9 = mongoProperties0.builder(mongoClientOptions8);
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test06983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06983");
        int int2 = java.lang.Integer.rotateLeft(2947841, (-2146433021));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23582728 + "'", int2 == 23582728);
    }

    @Test
    public void test06984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06984");
        int int2 = java.lang.Integer.remainderUnsigned(40000, 24576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15424 + "'", int2 == 15424);
    }

    @Test
    public void test06985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06985");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        boolean boolean10 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int11 = mongoClientOptions9.getMaxConnectionIdleTime();
        com.mongodb.DBDecoderFactory dBDecoderFactory12 = mongoClientOptions9.getDbDecoderFactory();
        java.lang.String str13 = mongoClientOptions9.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
    }

    @Test
    public void test06986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06986");
        int int1 = java.lang.Integer.numberOfTrailingZeros(104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test06987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06987");
        java.lang.String str2 = java.lang.Integer.toString(26225410, 65536);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "26225410" + "'", str2, "26225410");
    }

    @Test
    public void test06988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06988");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions7.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions7.getDbDecoderFactory();
        boolean boolean17 = mongoClientOptions7.isSocketKeepAlive();
        com.mongodb.DBDecoderFactory dBDecoderFactory18 = mongoClientOptions7.getDbDecoderFactory();
        long long19 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int20 = mongoClientOptions7.getHeartbeatSocketTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int22 = mongoProperties21.getDEFAULT_PORT();
        mongoProperties21.setHost("hi!");
        mongoProperties21.host = "";
        org.springframework.core.env.Environment environment27 = null;
        int int28 = mongoProperties21.determinePort(environment27);
        mongoProperties21.setAuthenticationDatabase("0");
        mongoProperties21.setUri("11i71");
        boolean boolean33 = mongoClientOptions7.equals((java.lang.Object) "11i71");
        int int34 = mongoClientOptions7.getConnectionsPerHost();
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
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 27017 + "'", int28 == 27017);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test06989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06989");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.autoConnectRetry(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test06990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06990");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.uri = "10";
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        int int14 = mongoClientOptions13.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions13.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference16 = mongoClientOptions13.getReadPreference();
        int int17 = mongoClientOptions13.getSocketTimeout();
        int int18 = mongoClientOptions13.getHeartbeatThreadCount();
        int int19 = mongoClientOptions13.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties0.builder(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(readPreference16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test06991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06991");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        javax.net.SocketFactory socketFactory9 = mongoClientOptions3.getSocketFactory();
        int int10 = mongoClientOptions3.getSocketTimeout();
        int int11 = mongoClientOptions3.getConnectionsPerHost();
        int int12 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int13 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions3.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions3.getWriteConcern();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(writeConcern15);
    }

    @Test
    public void test06992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10000000000000000000000100111000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10000000000000000000000100111000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06993");
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
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.heartbeatThreadCount(67108864);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxWaitTime(214748364);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder34.build();
        com.mongodb.MongoClientOptions.Builder builder37 = builder34.connectTimeout(6250);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.autoConnectRetry(false);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.host;
        java.lang.String str42 = mongoProperties40.host;
        java.lang.Integer int43 = mongoProperties40.getPort();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        boolean boolean49 = mongoClientOptions47.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder50 = mongoProperties40.builder(mongoClientOptions47);
        boolean boolean51 = mongoClientOptions47.isSocketKeepAlive();
        int int52 = mongoClientOptions47.getLocalThreshold();
        int int53 = mongoClientOptions47.getLocalThreshold();
        int int54 = mongoClientOptions47.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory55 = mongoClientOptions47.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory56 = mongoClientOptions47.getDbDecoderFactory();
        boolean boolean57 = mongoClientOptions47.isSocketKeepAlive();
        com.mongodb.DBDecoderFactory dBDecoderFactory58 = mongoClientOptions47.getDbDecoderFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory59 = mongoClientOptions47.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder60 = builder39.dbDecoderFactory(dBDecoderFactory59);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(int43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 15 + "'", int52 == 15);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 15 + "'", int53 == 15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 500 + "'", int54 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory55);
        org.junit.Assert.assertNotNull(dBDecoderFactory56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory58);
        org.junit.Assert.assertNotNull(dBDecoderFactory59);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test06994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06994");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 65536);
        mongoProperties0.setUsername("11001000011010111100101010010");
        java.lang.Class<?> wildcardClass10 = mongoProperties0.fieldNamingStrategy;
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
        int int27 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int28 = mongoClientOptions23.getMaxWaitTime();
        int int29 = mongoClientOptions23.getLocalThreshold();
        boolean boolean30 = mongoClientOptions23.isCursorFinalizerEnabled();
        org.springframework.core.env.Environment environment31 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient32 = mongoProperties0.createMongoClient(mongoClientOptions23, environment31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 120000 + "'", int28 == 120000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test06995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06995");
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
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minHeartbeatFrequency(14152);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.host;
        mongoProperties26.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass30 = mongoProperties26.fieldNamingStrategy;
        mongoProperties26.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str34 = mongoProperties33.getUri();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        int int39 = mongoClientOptions38.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties33.builder(mongoClientOptions38);
        com.mongodb.MongoClientOptions.Builder builder41 = mongoProperties26.builder(mongoClientOptions38);
        int int42 = mongoClientOptions38.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern43 = mongoClientOptions38.getWriteConcern();
        int int44 = mongoClientOptions38.getLocalThreshold();
        com.mongodb.ReadPreference readPreference45 = mongoClientOptions38.getReadPreference();
        long long46 = mongoClientOptions38.getMaxAutoConnectRetryTime();
        com.mongodb.ReadPreference readPreference47 = mongoClientOptions38.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory48 = mongoClientOptions38.getDbDecoderFactory();
        int int49 = mongoClientOptions38.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory50 = mongoClientOptions38.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder51 = builder25.dbEncoderFactory(dBEncoderFactory50);
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "mongodb://localhost/test" + "'", str34, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(writeConcern43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 15 + "'", int44 == 15);
        org.junit.Assert.assertNotNull(readPreference45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(readPreference47);
        org.junit.Assert.assertNotNull(dBDecoderFactory48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20000 + "'", int49 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test06996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06996");
        int int2 = java.lang.Integer.rotateRight(524288, 20480000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 524288 + "'", int2 == 524288);
    }

    @Test
    public void test06997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06997");
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
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.heartbeatConnectRetryFrequency(1540128);
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.requiredReplicaSetName("5000");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder58 = builder54.heartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test06998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06998");
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
        java.lang.String str41 = mongoClientOptions36.getDescription();
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
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test06999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test06999");
        int int1 = java.lang.Integer.highestOneBit(2048);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2048 + "'", int1 == 2048);
    }

    @Test
    public void test07000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test07000");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        java.lang.Integer int3 = mongoProperties0.getPort();
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        boolean boolean5 = mongoProperties0.hasCustomCredentials();
        java.lang.String str6 = mongoProperties0.host;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }
}

