import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05001");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.uri;
        java.lang.String str13 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05002");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(11);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05003");
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
        com.mongodb.MongoClientOptions.Builder builder85 = builder12.maxWaitTime(1388);
        com.mongodb.MongoClientOptions.Builder builder86 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder88 = builder86.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions89 = builder86.build();
        java.lang.String str90 = mongoClientOptions89.toString();
        int int91 = mongoClientOptions89.getMaxWaitTime();
        int int92 = mongoClientOptions89.getConnectionsPerHost();
        int int93 = mongoClientOptions89.getConnectionsPerHost();
        int int94 = mongoClientOptions89.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory95 = mongoClientOptions89.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder96 = builder12.dbDecoderFactory(dBDecoderFactory95);
        com.mongodb.MongoClientOptions.Builder builder98 = builder96.heartbeatConnectTimeout(1717986912);
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
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(mongoClientOptions89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 120000 + "'", int91 == 120000);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 100 + "'", int92 == 100);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 100 + "'", int93 == 100);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 500 + "'", int94 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05004");
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
        mongoProperties5.setPort((java.lang.Integer) 144);
        mongoProperties5.port = 6144;
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        boolean boolean39 = mongoClientOptions37.equals((java.lang.Object) (-2147483648));
        javax.net.SocketFactory socketFactory40 = mongoClientOptions37.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory41 = mongoClientOptions37.getDbDecoderFactory();
        int int42 = mongoClientOptions37.getMaxWaitTime();
        int int43 = mongoClientOptions37.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties5.builder(mongoClientOptions37);
        boolean boolean45 = mongoProperties5.hasCustomAddress();
        java.lang.String str46 = mongoProperties5.getHost();
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
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(socketFactory40);
        org.junit.Assert.assertNotNull(dBDecoderFactory41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 120000 + "'", int42 == 120000);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 500 + "'", int43 == 500);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05005");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        boolean boolean16 = mongoClientOptions15.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = mongoClientOptions15.getDbEncoderFactory();
        int int18 = mongoClientOptions15.getAcceptableLatencyDifference();
        javax.net.SocketFactory socketFactory19 = mongoClientOptions15.getSocketFactory();
        java.lang.String str20 = mongoClientOptions15.toString();
        java.lang.String str21 = mongoClientOptions15.toString();
        com.mongodb.MongoClientOptions.Builder builder22 = mongoProperties0.builder(mongoClientOptions15);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        java.lang.String str27 = mongoClientOptions26.toString();
        int int28 = mongoClientOptions26.getHeartbeatFrequency();
        int int29 = mongoClientOptions26.getSocketTimeout();
        boolean boolean30 = mongoClientOptions26.isAutoConnectRetry();
        boolean boolean31 = mongoClientOptions26.isCursorFinalizerEnabled();
        boolean boolean32 = mongoClientOptions26.isAlwaysUseMBeans();
        java.lang.String str33 = mongoClientOptions26.getDescription();
        int int34 = mongoClientOptions26.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties0.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.requiredReplicaSetName("67108864");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertNotNull(socketFactory19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5000 + "'", int28 == 5000);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1342177280 + "'", int34 == 1342177280);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05006");
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
        com.mongodb.ReadPreference readPreference11 = mongoClientOptions3.getReadPreference();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions3.getReadPreference();
        boolean boolean13 = mongoClientOptions3.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(readPreference11);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05007");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.localThreshold(500);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int18 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.setHost("hi!");
        mongoProperties17.host = "";
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties17.builder(mongoClientOptions28);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxConnectionIdleTime(5);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        java.lang.String str36 = mongoClientOptions35.toString();
        int int37 = mongoClientOptions35.getHeartbeatFrequency();
        int int38 = mongoClientOptions35.getSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions35.getDbEncoderFactory();
        com.mongodb.WriteConcern writeConcern40 = mongoClientOptions35.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder41 = builder31.writeConcern(writeConcern40);
        com.mongodb.MongoClientOptions.Builder builder42 = builder16.writeConcern(writeConcern40);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.connectTimeout(45);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatConnectRetryFrequency((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5000 + "'", int37 == 5000);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertNotNull(writeConcern40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05008");
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
        mongoProperties0.setUsername("");
        java.lang.Integer int69 = mongoProperties0.getPort();
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
        org.junit.Assert.assertNull(int69);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05009");
        java.lang.String str1 = java.lang.Integer.toOctalString(939589760);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7000200200" + "'", str1, "7000200200");
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05010");
        int int1 = java.lang.Integer.lowestOneBit((-1033373947));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05011");
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
        mongoProperties0.setGridFsDatabase("803801");
        java.lang.String str21 = mongoProperties0.getMongoClientDatabase();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "test" + "'", str21, "test");
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05012");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11610";
        char[] charArray15 = mongoProperties0.password;
        char[] charArray16 = mongoProperties0.password;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05013");
        int int2 = java.lang.Integer.rotateRight(486539264, 376832);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 486539264 + "'", int2 == 486539264);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05014");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getSocketTimeout();
        boolean boolean7 = mongoClientOptions3.isAutoConnectRetry();
        boolean boolean8 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean9 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str10 = mongoClientOptions3.getDescription();
        int int11 = mongoClientOptions3.getMinConnectionsPerHost();
        java.lang.String str12 = mongoClientOptions3.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1342177280 + "'", int11 == 1342177280);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05015");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectTimeout(803801);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(1717986912);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.requiredReplicaSetName("17204400");
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxConnectionIdleTime(369098778);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05016");
        int int2 = java.lang.Integer.min((-1006632951), 67108864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1006632951) + "'", int2 == (-1006632951));
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05017");
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
        mongoProperties0.gridFsDatabase = "46";
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
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05018");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str8 = mongoProperties0.getDatabase();
        boolean boolean9 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUri("4e20");
        boolean boolean12 = mongoProperties0.hasCustomAddress();
        java.lang.String str13 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05019");
        java.lang.String str1 = java.lang.Integer.toString(1073741828);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1073741828" + "'", str1, "1073741828");
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05020");
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
        java.lang.Integer int13 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("1100001");
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder19 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        int int35 = mongoClientOptions34.getMaxConnectionLifeTime();
        int int36 = mongoClientOptions34.getMaxConnectionLifeTime();
        int int37 = mongoClientOptions34.getLocalThreshold();
        boolean boolean38 = mongoClientOptions34.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory39 = mongoClientOptions34.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder28.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder23.socketFactory(socketFactory39);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder23.build();
        int int43 = mongoClientOptions42.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties0.builder(mongoClientOptions42);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatThreadCount((-531988736));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(socketFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05021");
        int int1 = java.lang.Integer.highestOneBit((-2145648383));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05022");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime(176L);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder0.dbDecoderFactory(dBDecoderFactory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05023");
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
        int int18 = mongoClientOptions15.getSocketTimeout();
        boolean boolean19 = mongoClientOptions15.isAlwaysUseMBeans();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05024");
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
        java.lang.String str46 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str47 = mongoProperties0.database;
        mongoProperties0.port = (-2100483648);
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
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05025");
        int int1 = java.lang.Integer.highestOneBit(1798617563);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05026");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.threadsAllowedToBlockForConnectionMultiplier(176);
        com.mongodb.MongoClientOptions.Builder builder22 = builder14.requiredReplicaSetName("803801");
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatConnectRetryFrequency(33554432);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.threadsAllowedToBlockForConnectionMultiplier(13);
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
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05027");
        int int2 = java.lang.Integer.compare(0, (-973078528));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05028");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.heartbeatThreadCount(29);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05029");
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
        java.lang.String str15 = mongoClientOptions9.getRequiredReplicaSetName();
        int int16 = mongoClientOptions9.getConnectionsPerHost();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05030");
        int int1 = java.lang.Integer.lowestOneBit((-1140785152));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65536 + "'", int1 == 65536);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05031");
        int int2 = java.lang.Integer.rotateLeft(114610, 1879310336);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 114610 + "'", int2 == 114610);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05032");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.gridFsDatabase = "803801";
        mongoProperties0.setGridFsDatabase("10000");
        mongoProperties0.setGridFsDatabase("637534208");
        boolean boolean11 = mongoProperties0.hasCustomCredentials();
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
        int int27 = mongoClientOptions21.getSocketTimeout();
        boolean boolean28 = mongoClientOptions21.isAlwaysUseMBeans();
        int int29 = mongoClientOptions21.getHeartbeatConnectTimeout();
        int int30 = mongoClientOptions21.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties0.builder(mongoClientOptions21);
        com.mongodb.MongoClientOptions.Builder builder32 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        java.lang.String str36 = mongoClientOptions35.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient37 = mongoProperties0.createMongoClient(mongoClientOptions35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1342177280 + "'", int30 == 1342177280);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05033");
        int int2 = java.lang.Integer.rotateRight((-531988736), 26);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 312459320 + "'", int2 == 312459320);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05034");
        java.lang.String str1 = java.lang.Integer.toHexString(811393294);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "305ce10e" + "'", str1, "305ce10e");
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05035");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        javax.net.SocketFactory socketFactory9 = mongoClientOptions3.getSocketFactory();
        int int10 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05036");
        int int2 = java.lang.Integer.min(132, 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05037");
        int int2 = java.lang.Integer.remainderUnsigned(10010000, (-1417281280));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10010000 + "'", int2 == 10010000);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05038");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        long long6 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        com.mongodb.WriteConcern writeConcern7 = mongoClientOptions3.getWriteConcern();
        boolean boolean8 = mongoClientOptions3.isAutoConnectRetry();
        boolean boolean9 = mongoClientOptions3.isAlwaysUseMBeans();
        java.lang.String str10 = mongoClientOptions3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(writeConcern7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05039");
        int int2 = java.lang.Integer.sum(124911713, 316197090);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 441108803 + "'", int2 == 441108803);
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05040");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.setHost("");
        mongoProperties14.username = "100";
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(27017);
        java.lang.Class<?> wildcardClass22 = builder21.getClass();
        mongoProperties14.fieldNamingStrategy = wildcardClass22;
        mongoProperties14.setGridFsDatabase("");
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
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties14.builder(mongoClientOptions37);
        int int43 = mongoClientOptions37.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties0.builder(mongoClientOptions37);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minHeartbeatFrequency(12);
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.minHeartbeatFrequency(500);
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
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05041");
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
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.minConnectionsPerHost(811393294);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatFrequency(16487953);
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
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05042");
        int int2 = java.lang.Integer.rotateLeft((-1610612736), 327680030);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 671088640 + "'", int2 == 671088640);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05043");
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
        org.springframework.core.env.Environment environment22 = null;
        int int23 = mongoProperties0.determinePort(environment22);
        java.lang.String str24 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setUsername("8");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str28 = mongoProperties27.host;
        org.springframework.core.env.Environment environment29 = null;
        int int30 = mongoProperties27.determinePort(environment29);
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        boolean boolean35 = mongoClientOptions34.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory36 = mongoClientOptions34.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties27.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        int int42 = mongoClientOptions41.getMaxConnectionLifeTime();
        int int43 = mongoClientOptions41.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties27.builder(mongoClientOptions41);
        mongoProperties27.setPort((java.lang.Integer) 4);
        mongoProperties27.setUsername("90");
        java.lang.String str49 = mongoProperties27.uri;
        char[] charArray50 = mongoProperties27.password;
        char[] charArray51 = mongoProperties27.getPassword();
        com.mongodb.MongoClientOptions.Builder builder52 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder56 = builder52.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions61 = builder58.build();
        boolean boolean62 = mongoClientOptions61.isCursorFinalizerEnabled();
        int int63 = mongoClientOptions61.getMaxConnectionIdleTime();
        int int64 = mongoClientOptions61.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties27.builder(mongoClientOptions61);
        org.springframework.core.env.Environment environment66 = null;
        com.mongodb.MongoClient mongoClient67 = mongoProperties0.createMongoClient(mongoClientOptions61, environment66);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 27017 + "'", int23 == 27017);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27017 + "'", int30 == 27017);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "mongodb://localhost/test" + "'", str49, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray50);
        org.junit.Assert.assertNull(charArray51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(mongoClientOptions61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(mongoClient67);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05044");
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
        int int11 = mongoClientOptions6.getLocalThreshold();
        java.lang.String str12 = mongoClientOptions6.toString();
        java.lang.String str13 = mongoClientOptions6.getRequiredReplicaSetName();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05045");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(true);
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
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05046");
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
        long long28 = mongoClientOptions18.getMaxAutoConnectRetryTime();
        int int29 = mongoClientOptions18.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 120000 + "'", int29 == 120000);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05047");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05048");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatConnectRetryFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatThreadCount(5);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder25 = builder19.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder27 = builder19.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatThreadCount(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str31 = mongoProperties30.host;
        org.springframework.core.env.Environment environment32 = null;
        int int33 = mongoProperties30.determinePort(environment32);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        boolean boolean38 = mongoClientOptions37.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory39 = mongoClientOptions37.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties30.builder(mongoClientOptions37);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        int int45 = mongoClientOptions44.getMaxConnectionLifeTime();
        int int46 = mongoClientOptions44.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties30.builder(mongoClientOptions44);
        int int48 = mongoClientOptions44.getHeartbeatFrequency();
        boolean boolean49 = mongoClientOptions44.isCursorFinalizerEnabled();
        com.mongodb.ReadPreference readPreference50 = mongoClientOptions44.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder51 = builder27.readPreference(readPreference50);
        com.mongodb.MongoClientOptions.Builder builder52 = builder14.readPreference(readPreference50);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 27017 + "'", int33 == 27017);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5000 + "'", int48 == 5000);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05049");
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.maxConnectionIdleTime(86);
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.connectionsPerHost(38);
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
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05050");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        mongoProperties0.username = "m1w";
        mongoProperties0.setUsername("-2146433022");
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray10 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str12 = mongoProperties11.host;
        org.springframework.core.env.Environment environment13 = null;
        int int14 = mongoProperties11.determinePort(environment13);
        java.lang.Class<?> wildcardClass15 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.port = 10000;
        boolean boolean18 = mongoProperties11.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder22 = builder21.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder25 = builder24.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder28 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder25.minConnectionsPerHost(35);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        int int32 = mongoClientOptions31.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties11.builder(mongoClientOptions31);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient34 = mongoProperties0.createMongoClient(mongoClientOptions31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10000 + "'", int32 == 10000);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05051");
        java.lang.String str2 = java.lang.Integer.toString(416, 872415252);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "416" + "'", str2, "416");
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05052");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.setGridFsDatabase("803801");
        mongoProperties0.uri = "116100000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05053");
        int int2 = java.lang.Integer.compare(402767888, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05054");
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
        int int11 = mongoClientOptions3.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05055");
        int int1 = java.lang.Integer.lowestOneBit(1140850688);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05056");
        int int1 = java.lang.Integer.highestOneBit(1073745416);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1073741824 + "'", int1 == 1073741824);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05057");
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
        int int36 = mongoClientOptions35.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory37 = mongoClientOptions35.getDbDecoderFactory();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.getUri();
        boolean boolean40 = mongoProperties38.hasCustomCredentials();
        mongoProperties38.database = "";
        java.lang.String str43 = mongoProperties38.getHost();
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        int int48 = mongoClientOptions47.getMaxConnectionLifeTime();
        int int49 = mongoClientOptions47.getMaxConnectionLifeTime();
        int int50 = mongoClientOptions47.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties38.builder(mongoClientOptions47);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.minConnectionsPerHost(29);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.alwaysUseMBeans(false);
        boolean boolean56 = mongoClientOptions35.equals((java.lang.Object) false);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 67108864 + "'", int36 == 67108864);
        org.junit.Assert.assertNotNull(dBDecoderFactory37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "mongodb://localhost/test" + "'", str39, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 15 + "'", int50 == 15);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05058");
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
        int int19 = mongoClientOptions12.getSocketTimeout();
        com.mongodb.ReadPreference readPreference20 = mongoClientOptions12.getReadPreference();
        int int21 = mongoClientOptions12.getAcceptableLatencyDifference();
        boolean boolean22 = mongoClientOptions12.isAutoConnectRetry();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(readPreference20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05059");
        int int2 = java.lang.Integer.rotateRight((-1811939327), 792740645);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 211812352 + "'", int2 == 211812352);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05060");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = mongoClientOptions9.getDbEncoderFactory();
        int int18 = mongoClientOptions9.getMinConnectionsPerHost();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(dBEncoderFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1342177280 + "'", int18 == 1342177280);
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05061");
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
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean25 = mongoClientOptions24.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory26 = mongoClientOptions24.getDbDecoderFactory();
        int int27 = mongoClientOptions24.getLocalThreshold();
        boolean boolean28 = mongoClientOptions24.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions24);
        java.lang.String str30 = mongoProperties0.host;
        java.lang.String str31 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05062");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "52" + "'", str1, "52");
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05063");
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
        java.lang.Class<?> wildcardClass26 = builder23.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05064");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        java.lang.String str3 = mongoProperties0.getUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb://localhost/test" + "'", str3, "mongodb://localhost/test");
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05065");
        int int2 = java.lang.Integer.remainderUnsigned(270991360, 20480000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4751360 + "'", int2 == 4751360);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05066");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = new char[] {};
        mongoProperties0.setPassword(charArray2);
        mongoProperties0.setHost("11111111111111111111111111111111");
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05067");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxConnectionIdleTime(578813952);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05068");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int7 = mongoClientOptions3.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05069");
        int int1 = java.lang.Integer.parseInt("60076865");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 60076865 + "'", int1 == 60076865);
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05070");
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
        int int11 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean12 = mongoClientOptions3.isSocketKeepAlive();
        boolean boolean13 = mongoClientOptions3.isAlwaysUseMBeans();
        int int14 = mongoClientOptions3.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory15 = mongoClientOptions3.getDbEncoderFactory();
        int int16 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05071");
        int int2 = java.lang.Integer.max(3407872, 916455424);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 916455424 + "'", int2 == 916455424);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05072");
        int int2 = java.lang.Integer.rotateRight(262144, 416);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262144 + "'", int2 == 262144);
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05073");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("305ce10e", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 305ce10e");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05074");
        int int1 = java.lang.Integer.parseInt("-2147478648");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147478648) + "'", int1 == (-2147478648));
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05075");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("b");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"b\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05077");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05078");
        int int1 = java.lang.Integer.highestOneBit(216);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 128 + "'", int1 == 128);
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05079");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("90", 536870912);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 536870912 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05080");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment9 = null;
        int int10 = mongoProperties0.determinePort(environment9);
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        boolean boolean12 = mongoProperties0.hasCustomCredentials();
        char[] charArray13 = mongoProperties0.password;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11i71" + "'", str11, "11i71");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(charArray13);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05081");
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
        int int14 = mongoClientOptions9.getHeartbeatSocketTimeout();
        int int15 = mongoClientOptions9.getHeartbeatSocketTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05082");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment9 = null;
        int int10 = mongoProperties0.determinePort(environment9);
        java.lang.String str11 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05083");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        boolean boolean5 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.uri = "149159936";
        java.lang.String str8 = mongoProperties0.username;
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
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions21);
        com.mongodb.DBDecoderFactory dBDecoderFactory33 = mongoClientOptions21.getDbDecoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(dBDecoderFactory33);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05084");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int8 = mongoClientOptions3.getConnectTimeout();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        boolean boolean10 = mongoClientOptions3.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10000 + "'", int8 == 10000);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05085");
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
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions31.getReadPreference();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.host;
        org.springframework.core.env.Environment environment40 = null;
        int int41 = mongoProperties38.determinePort(environment40);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.build();
        boolean boolean46 = mongoClientOptions45.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory47 = mongoClientOptions45.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties38.builder(mongoClientOptions45);
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        int int53 = mongoClientOptions52.getMaxConnectionLifeTime();
        int int54 = mongoClientOptions52.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties38.builder(mongoClientOptions52);
        int int56 = mongoClientOptions52.getHeartbeatFrequency();
        boolean boolean57 = mongoClientOptions52.isCursorFinalizerEnabled();
        int int58 = mongoClientOptions52.getMinConnectionsPerHost();
        boolean boolean59 = mongoClientOptions31.equals((java.lang.Object) mongoClientOptions52);
        int int60 = mongoClientOptions52.getHeartbeatThreadCount();
        java.lang.Class<?> wildcardClass61 = mongoClientOptions52.getClass();
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
        org.junit.Assert.assertNotNull(readPreference37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 27017 + "'", int41 == 27017);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5000 + "'", int56 == 5000);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1342177280 + "'", int58 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05086");
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
        boolean boolean19 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions14.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions14.getWriteConcern();
        boolean boolean22 = mongoClientOptions14.isAlwaysUseMBeans();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1342177280 + "'", int20 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05087");
        int int2 = java.lang.Integer.compareUnsigned(1100100, 41014);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05088");
        int int2 = java.lang.Integer.sum(10110000, 1258290949);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1268400949 + "'", int2 == 1268400949);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05089");
        int int1 = java.lang.Integer.bitCount(39304);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05090");
        int int2 = java.lang.Integer.remainderUnsigned(271581190, (-2146433021));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 271581190 + "'", int2 == 271581190);
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05091");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.setDatabase("hi!");
        java.lang.String str11 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str12 = mongoProperties0.getGridFsDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str14 = mongoProperties13.host;
        java.lang.String str15 = mongoProperties13.host;
        java.lang.Integer int16 = mongoProperties13.getPort();
        mongoProperties13.setDatabase("11i71");
        mongoProperties13.port = 2147483647;
        mongoProperties13.port = 1342177280;
        mongoProperties13.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties25 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str26 = mongoProperties25.getUri();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        int int31 = mongoClientOptions30.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties25.builder(mongoClientOptions30);
        java.lang.Integer int33 = mongoProperties25.getPort();
        java.lang.String str34 = mongoProperties25.getHost();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder35.build();
        boolean boolean40 = mongoClientOptions38.equals((java.lang.Object) (-2147483648));
        int int41 = mongoClientOptions38.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions38.getDbDecoderFactory();
        int int43 = mongoClientOptions38.getHeartbeatConnectRetryFrequency();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties25.builder(mongoClientOptions38);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties45 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties46 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties46.gridFsDatabase = "hi!";
        char[] charArray53 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties46.setPassword(charArray53);
        mongoProperties45.setPassword(charArray53);
        char[] charArray56 = mongoProperties45.getPassword();
        mongoProperties25.password = charArray56;
        mongoProperties13.password = charArray56;
        mongoProperties0.setPassword(charArray56);
        java.lang.Class<?> wildcardClass60 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb://localhost/test" + "'", str26, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(int33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoClientOptions38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 500 + "'", int43 == 500);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[a, a, #, 4]");
        org.junit.Assert.assertNull(wildcardClass60);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05092");
        int int2 = java.lang.Integer.min(1879048193, 72);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05093");
        int int2 = java.lang.Integer.min(1664, (-2132030207));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2132030207) + "'", int2 == (-2132030207));
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05094");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectTimeout(180814862);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder14.heartbeatFrequency((-2132030207));
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
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05095");
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
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.alwaysUseMBeans(false);
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
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05096");
        int int2 = java.lang.Integer.max(18965549, 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18965549 + "'", int2 == 18965549);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05097");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "1";
        java.lang.String str3 = mongoProperties0.host;
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        boolean boolean5 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05098");
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
        int int19 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05099");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder29 = builder27.heartbeatThreadCount((-161061274));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("80864a5e");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"80864a5e\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10462210000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10462210000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05102");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("29188", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 29188");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05103");
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
        boolean boolean25 = mongoClientOptions17.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05104");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("20", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 20");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05105");
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
        int int17 = mongoClientOptions11.getAcceptableLatencyDifference();
        int int18 = mongoClientOptions11.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05106");
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
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.cursorFinalizerEnabled(false);
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
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05107");
        int int2 = java.lang.Integer.min(402653184, (-1306525534));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1306525534) + "'", int2 == (-1306525534));
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05108");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.host = "2";
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        char[] charArray9 = mongoProperties0.getPassword();
        boolean boolean10 = mongoProperties0.hasCustomCredentials();
        java.lang.String str11 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05109");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMinConnectionsPerHost();
        long long12 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        int int13 = mongoClientOptions10.getMaxConnectionLifeTime();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions10.getSocketFactory();
        int int15 = mongoClientOptions10.getHeartbeatFrequency();
        int int16 = mongoClientOptions10.getConnectionsPerHost();
        int int17 = mongoClientOptions10.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10000 + "'", int17 == 10000);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05110");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout(28);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        int int19 = mongoClientOptions18.getMaxConnectionLifeTime();
        int int20 = mongoClientOptions18.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference21 = mongoClientOptions18.getReadPreference();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions18.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder23 = builder12.dbDecoderFactory(dBDecoderFactory22);
        com.mongodb.MongoClientOptions.Builder builder25 = builder12.heartbeatThreadCount(8402945);
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
        int int40 = mongoClientOptions35.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory41 = mongoClientOptions35.getDbEncoderFactory();
        java.lang.String str42 = mongoClientOptions35.getDescription();
        com.mongodb.WriteConcern writeConcern43 = mongoClientOptions35.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory44 = mongoClientOptions35.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder45 = builder12.dbEncoderFactory(dBEncoderFactory44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.maxAutoConnectRetryTime(0L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(readPreference21);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 20000 + "'", int37 == 20000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10000 + "'", int39 == 10000);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 120000 + "'", int40 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(writeConcern43);
        org.junit.Assert.assertNotNull(dBEncoderFactory44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05111");
        java.lang.String str2 = java.lang.Integer.toString(545266689, 32768);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "545266689" + "'", str2, "545266689");
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05112");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.threadsAllowedToBlockForConnectionMultiplier(6);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.acceptableLatencyDifference(38);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatConnectTimeout(37);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatConnectTimeout((-1306525696));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatConnectTimeout must be greater than or equal to 0");
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05113");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.host = "20407000400";
        int int6 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.uri = "149159936";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05114");
        java.lang.String str1 = java.lang.Integer.toBinaryString(1081082373);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000000011100000000001000000101" + "'", str1, "1000000011100000000001000000101");
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05115");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder10.legacyDefaults();
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
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05116");
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
        com.mongodb.MongoClientOptions.Builder builder90 = builder88.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder92 = builder88.alwaysUseMBeans(true);
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
        org.junit.Assert.assertNotNull(builder92);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05117");
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
        java.lang.String str20 = mongoProperties0.host;
        char[] charArray21 = new char[] {};
        mongoProperties0.password = charArray21;
        mongoProperties0.database = "144";
        java.lang.String str25 = mongoProperties0.getDatabase();
        java.lang.String str26 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str27 = mongoProperties0.getHost();
        mongoProperties0.setDatabase("a2fe130");
        java.lang.String str30 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str31 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "144" + "'", str25, "144");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05118");
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
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minHeartbeatFrequency(11);
        com.mongodb.MongoClientOptions.Builder builder42 = builder38.maxConnectionLifeTime(101);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.localThreshold(61);
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
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05119");
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
        int int18 = mongoClientOptions15.getAcceptableLatencyDifference();
        int int19 = mongoClientOptions15.getAcceptableLatencyDifference();
        java.lang.String str20 = mongoClientOptions15.getDescription();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27017 + "'", int19 == 27017);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05120");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str15 = mongoProperties14.host;
        mongoProperties14.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass18 = mongoProperties14.fieldNamingStrategy;
        java.lang.String str19 = mongoProperties14.getDatabase();
        boolean boolean20 = mongoProperties14.hasCustomCredentials();
        java.lang.String str21 = mongoProperties14.authenticationDatabase;
        mongoProperties14.setPort((java.lang.Integer) 27017);
        mongoProperties14.setDatabase("27017");
        char[] charArray26 = mongoProperties14.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int28 = mongoProperties27.getDEFAULT_PORT();
        mongoProperties27.setHost("hi!");
        mongoProperties27.host = "";
        mongoProperties27.setPort((java.lang.Integer) 0);
        java.lang.String str35 = mongoProperties27.getAuthenticationDatabase();
        java.lang.String str36 = mongoProperties27.getHost();
        java.lang.String str37 = mongoProperties27.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.host;
        mongoProperties38.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass42 = mongoProperties38.fieldNamingStrategy;
        java.lang.String str43 = mongoProperties38.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties44 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str45 = mongoProperties44.getUri();
        char[] charArray46 = new char[] {};
        mongoProperties44.setPassword(charArray46);
        mongoProperties38.setPassword(charArray46);
        mongoProperties27.setPassword(charArray46);
        mongoProperties14.password = charArray46;
        mongoProperties0.setPassword(charArray46);
        mongoProperties0.uri = "1";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(charArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 27017 + "'", int28 == 27017);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "mongodb://localhost/test" + "'", str45, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[]");
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05121");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int32 = mongoProperties31.getDEFAULT_PORT();
        mongoProperties31.setHost("hi!");
        mongoProperties31.host = "";
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        java.lang.String str41 = mongoClientOptions40.toString();
        int int42 = mongoClientOptions40.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties31.builder(mongoClientOptions40);
        int int44 = mongoClientOptions40.getConnectTimeout();
        javax.net.SocketFactory socketFactory45 = mongoClientOptions40.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory46 = mongoClientOptions40.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder47 = builder30.dbDecoderFactory(dBDecoderFactory46);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties48 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str49 = mongoProperties48.host;
        org.springframework.core.env.Environment environment50 = null;
        int int51 = mongoProperties48.determinePort(environment50);
        mongoProperties48.setPort((java.lang.Integer) 27017);
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder58 = builder54.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder62 = builder60.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder60.build();
        int int64 = mongoClientOptions63.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder65 = mongoProperties48.builder(mongoClientOptions63);
        com.mongodb.WriteConcern writeConcern66 = mongoClientOptions63.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder67 = builder30.writeConcern(writeConcern66);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27017 + "'", int32 == 27017);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10000 + "'", int44 == 10000);
        org.junit.Assert.assertNotNull(socketFactory45);
        org.junit.Assert.assertNotNull(dBDecoderFactory46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 27017 + "'", int51 == 27017);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(mongoClientOptions63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(writeConcern66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05122");
        int int1 = java.lang.Integer.signum(74579968);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05123");
        java.lang.String str1 = java.lang.Integer.toBinaryString(30);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11110" + "'", str1, "11110");
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05124");
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
        char[] charArray29 = mongoProperties0.getPassword();
        mongoProperties0.host = "11111111111111111111111111111111";
        java.lang.String str32 = mongoProperties0.uri;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str34 = mongoProperties33.host;
        org.springframework.core.env.Environment environment35 = null;
        int int36 = mongoProperties33.determinePort(environment35);
        mongoProperties33.setPort((java.lang.Integer) 27017);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties40.gridFsDatabase = "hi!";
        char[] charArray47 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties40.setPassword(charArray47);
        mongoProperties39.setPassword(charArray47);
        java.lang.String str50 = mongoProperties39.getHost();
        java.lang.String str51 = mongoProperties39.getUsername();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int53 = mongoProperties52.getDEFAULT_PORT();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties54 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int55 = mongoProperties54.getDEFAULT_PORT();
        mongoProperties54.setHost("hi!");
        mongoProperties54.host = "";
        mongoProperties54.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties62 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties63 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties63.gridFsDatabase = "hi!";
        char[] charArray70 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties63.setPassword(charArray70);
        mongoProperties62.setPassword(charArray70);
        mongoProperties54.setPassword(charArray70);
        mongoProperties52.password = charArray70;
        mongoProperties39.password = charArray70;
        mongoProperties33.password = charArray70;
        mongoProperties0.setPassword(charArray70);
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
        org.junit.Assert.assertNull(charArray29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "mongodb://localhost/test" + "'", str32, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27017 + "'", int36 == 27017);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 27017 + "'", int53 == 27017);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 27017 + "'", int55 == 27017);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[a, a, #, 4]");
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05125");
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
        java.lang.String str28 = mongoProperties0.authenticationDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str30 = mongoProperties29.host;
        mongoProperties29.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass33 = mongoProperties29.fieldNamingStrategy;
        mongoProperties29.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties36 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str37 = mongoProperties36.getUri();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        int int42 = mongoClientOptions41.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties36.builder(mongoClientOptions41);
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties29.builder(mongoClientOptions41);
        javax.net.SocketFactory socketFactory45 = mongoClientOptions41.getSocketFactory();
        int int46 = mongoClientOptions41.getHeartbeatConnectRetryFrequency();
        boolean boolean47 = mongoClientOptions41.isAutoConnectRetry();
        int int48 = mongoClientOptions41.getAcceptableLatencyDifference();
        java.lang.String str49 = mongoClientOptions41.getRequiredReplicaSetName();
        int int50 = mongoClientOptions41.getMinHeartbeatFrequency();
        int int51 = mongoClientOptions41.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions41);
        mongoProperties0.setPort((java.lang.Integer) 33554432);
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "mongodb://localhost/test" + "'", str37, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(socketFactory45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 500 + "'", int46 == 500);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 15 + "'", int48 == 15);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 500 + "'", int50 == 500);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10000000001");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10000000001");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05127");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        mongoProperties0.uri = "22";
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        com.mongodb.MongoClientOptions.Builder builder11 = mongoProperties0.builder(mongoClientOptions10);
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
        int int28 = mongoClientOptions24.getConnectionsPerHost();
        boolean boolean29 = mongoClientOptions24.isAutoConnectRetry();
        int int30 = mongoClientOptions24.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties0.builder(mongoClientOptions24);
        mongoProperties0.setDatabase("469827712");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 500 + "'", int30 == 500);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05128");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory8 = mongoClientOptions3.getDbDecoderFactory();
        int int9 = mongoClientOptions3.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05129");
        int int1 = java.lang.Integer.parseUnsignedInt("4000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4000 + "'", int1 == 4000);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05130");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAlwaysUseMBeans();
        int int13 = mongoClientOptions11.getLocalThreshold();
        int int14 = mongoClientOptions11.getSocketTimeout();
        int int15 = mongoClientOptions11.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder17 = builder7.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder7.minConnectionsPerHost((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder7.maxConnectionIdleTime((-2094296184));
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05131");
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
        mongoProperties0.authenticationDatabase = "20007000401";
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
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05132");
        int int2 = java.lang.Integer.compareUnsigned(3648, 1048576);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05133");
        int int1 = java.lang.Integer.highestOneBit((-1962934272));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483648) + "'", int1 == (-2147483648));
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05134");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(112);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "112" + "'", str1, "112");
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05135");
        int int1 = java.lang.Integer.highestOneBit(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05136");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        boolean boolean12 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.username = "27017";
        mongoProperties0.setPort((java.lang.Integer) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.host;
        mongoProperties17.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass21 = mongoProperties17.fieldNamingStrategy;
        mongoProperties17.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str25 = mongoProperties24.getUri();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties24.builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties17.builder(mongoClientOptions29);
        int int33 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions29.getHeartbeatConnectTimeout();
        int int35 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int36 = mongoClientOptions29.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties0.builder(mongoClientOptions29);
        int int38 = mongoClientOptions29.getMinHeartbeatFrequency();
        java.lang.String str39 = mongoClientOptions29.toString();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongodb://localhost/test" + "'", str25, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 120000 + "'", int36 == 120000);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 500 + "'", int38 == 500);
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05137");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.username;
        java.lang.String str13 = mongoProperties0.getDatabase();
        mongoProperties0.setGridFsDatabase("1");
        java.lang.String str16 = mongoProperties0.host;
        java.lang.String str17 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int18 = mongoProperties0.port;
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05138");
        int int2 = java.lang.Integer.compareUnsigned(327680030, 1617323622);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05139");
        int int2 = java.lang.Integer.compare(1073741824, 1268400949);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05140");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        boolean boolean6 = mongoProperties0.hasCustomCredentials();
        char[] charArray7 = mongoProperties0.password;
        mongoProperties0.username = "-2139080703";
        mongoProperties0.database = "46";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05141");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        java.lang.String str9 = mongoClientOptions3.getDescription();
        com.mongodb.DBEncoderFactory dBEncoderFactory10 = mongoClientOptions3.getDbEncoderFactory();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertNotNull(socketFactory11);
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05142");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("110010100000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"110010100000000000000000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05143");
        int int2 = java.lang.Integer.remainderUnsigned(83996672, 1136);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 832 + "'", int2 == 832);
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05144");
        int int1 = java.lang.Integer.numberOfTrailingZeros(6989);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05145");
        int int1 = java.lang.Integer.reverse(25001);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1786380288) + "'", int1 == (-1786380288));
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05146");
        int int1 = java.lang.Integer.numberOfLeadingZeros(176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05147");
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
        mongoProperties0.gridFsDatabase = "11010";
        int int21 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.uri = "176";
        mongoProperties0.gridFsDatabase = "65536";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "test" + "'", str5, "test");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05148");
        int int1 = java.lang.Integer.reverse(217);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1694498816) + "'", int1 == (-1694498816));
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05149");
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
        int int22 = mongoProperties0.getDEFAULT_PORT();
        java.lang.Class<?> wildcardClass23 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertNull(wildcardClass23);
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05150");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatSocketTimeout(74579968);
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.threadsAllowedToBlockForConnectionMultiplier(7);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getMaxConnectionLifeTime();
        int int18 = mongoClientOptions16.getMaxConnectionLifeTime();
        int int19 = mongoClientOptions16.getLocalThreshold();
        boolean boolean20 = mongoClientOptions16.isAlwaysUseMBeans();
        java.lang.String str21 = mongoClientOptions16.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions16.getWriteConcern();
        int int23 = mongoClientOptions16.getMinConnectionsPerHost();
        int int24 = mongoClientOptions16.getSocketTimeout();
        javax.net.SocketFactory socketFactory25 = mongoClientOptions16.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder26 = builder0.socketFactory(socketFactory25);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxAutoConnectRetryTime((long) 536870912);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.description("40");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1342177280 + "'", int23 == 1342177280);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(socketFactory25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05151");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        int int9 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("-1", 4456448);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 4456448 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05153");
        java.lang.String str2 = java.lang.Integer.toString((int) (short) 100, (-1879048157));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05154");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        mongoProperties0.uri = "";
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setGridFsDatabase("65536");
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
        java.lang.String str31 = mongoClientOptions25.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions25);
        mongoProperties0.setGridFsDatabase("1101");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05155");
        int int1 = java.lang.Integer.signum(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05156");
        int int2 = java.lang.Integer.divideUnsigned(316197090, (-2094296184));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05157");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        boolean boolean5 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.uri = "149159936";
        java.lang.String str8 = mongoProperties0.username;
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
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions21);
        java.lang.String str33 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "149159936" + "'", str33, "149159936");
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05158");
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
        boolean boolean25 = mongoClientOptions18.isCursorFinalizerEnabled();
        int int26 = mongoClientOptions18.getHeartbeatConnectRetryFrequency();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05159");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions3.getReadPreference();
        int int10 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int11 = mongoClientOptions3.getHeartbeatThreadCount();
        int int12 = mongoClientOptions3.getAcceptableLatencyDifference();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions3.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(readPreference9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05160");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getMaxConnectionIdleTime();
        int int8 = mongoClientOptions3.getLocalThreshold();
        int int9 = mongoClientOptions3.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05161");
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
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder25 = builder19.acceptableLatencyDifference(5);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.requiredReplicaSetName("8");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.host;
        mongoProperties28.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass32 = mongoProperties28.fieldNamingStrategy;
        java.lang.String str33 = mongoProperties28.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        com.mongodb.MongoClientOptions.Builder builder41 = builder36.socketTimeout((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties42 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str43 = mongoProperties42.host;
        mongoProperties42.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass46 = mongoProperties42.fieldNamingStrategy;
        mongoProperties42.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties49 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str50 = mongoProperties49.getUri();
        com.mongodb.MongoClientOptions.Builder builder51 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder51.build();
        int int55 = mongoClientOptions54.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties49.builder(mongoClientOptions54);
        com.mongodb.MongoClientOptions.Builder builder57 = mongoProperties42.builder(mongoClientOptions54);
        javax.net.SocketFactory socketFactory58 = mongoClientOptions54.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder41.socketFactory(socketFactory58);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder59.build();
        com.mongodb.MongoClientOptions.Builder builder61 = mongoProperties28.builder(mongoClientOptions60);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties62 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str63 = mongoProperties62.host;
        org.springframework.core.env.Environment environment64 = null;
        int int65 = mongoProperties62.determinePort(environment64);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions69 = builder66.build();
        boolean boolean70 = mongoClientOptions69.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory71 = mongoClientOptions69.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder72 = mongoProperties62.builder(mongoClientOptions69);
        com.mongodb.MongoClientOptions.Builder builder73 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder75 = builder73.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions76 = builder73.build();
        int int77 = mongoClientOptions76.getMaxConnectionLifeTime();
        int int78 = mongoClientOptions76.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder79 = mongoProperties62.builder(mongoClientOptions76);
        int int80 = mongoClientOptions76.getHeartbeatFrequency();
        boolean boolean81 = mongoClientOptions76.isCursorFinalizerEnabled();
        int int82 = mongoClientOptions76.getMinConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern83 = mongoClientOptions76.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder84 = builder61.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder85 = builder25.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder86 = builder12.writeConcern(writeConcern83);
        com.mongodb.MongoClientOptions.Builder builder88 = builder12.connectionsPerHost(61);
        java.lang.Class<?> wildcardClass89 = builder88.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "mongodb://localhost/test" + "'", str50, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(mongoClientOptions54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(socketFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 27017 + "'", int65 == 27017);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(mongoClientOptions69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(mongoClientOptions76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 5000 + "'", int80 == 5000);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 1342177280 + "'", int82 == 1342177280);
        org.junit.Assert.assertNotNull(writeConcern83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05162");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        mongoProperties0.port = 1342177280;
        java.lang.String str10 = mongoProperties0.getGridFsDatabase();
        int int11 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.gridFsDatabase = "2162000001";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05163");
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
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder0.build();
        int int14 = mongoClientOptions13.getHeartbeatConnectTimeout();
        boolean boolean15 = mongoClientOptions13.isSocketKeepAlive();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05164");
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
        int int16 = mongoClientOptions3.getSocketTimeout();
        int int17 = mongoClientOptions3.getHeartbeatThreadCount();
        int int18 = mongoClientOptions3.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05165");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        char[] charArray6 = mongoProperties0.getPassword();
        mongoProperties0.setGridFsDatabase("7fffffff");
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
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
        int int26 = mongoClientOptions22.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions22.getWriteConcern();
        int int28 = mongoClientOptions22.getLocalThreshold();
        com.mongodb.ReadPreference readPreference29 = mongoClientOptions22.getReadPreference();
        long long30 = mongoClientOptions22.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder31 = mongoProperties0.builder(mongoClientOptions22);
        int int32 = mongoClientOptions22.getAcceptableLatencyDifference();
        int int33 = mongoClientOptions22.getHeartbeatFrequency();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7fffffff" + "'", str9, "7fffffff");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertNotNull(readPreference29);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5000 + "'", int33 == 5000);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05166");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        mongoProperties0.setUri("hi!");
        mongoProperties0.clearPassword();
        java.lang.String str10 = mongoProperties0.uri;
        mongoProperties0.host = "5000";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("5000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 5000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05168");
        int int1 = java.lang.Integer.numberOfLeadingZeros(60000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05169");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions3.getReadPreference();
        int int10 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int11 = mongoClientOptions3.getHeartbeatThreadCount();
        int int12 = mongoClientOptions3.getMinConnectionsPerHost();
        int int13 = mongoClientOptions3.getMaxConnectionIdleTime();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions3.getSocketFactory();
        int int15 = mongoClientOptions3.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(readPreference9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1342177280 + "'", int12 == 1342177280);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("177530");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 177530");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05171");
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
        int int13 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int14 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str16 = mongoClientOptions7.getDescription();
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions7.getDbDecoderFactory();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05172");
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
        int int18 = mongoClientOptions12.getAcceptableLatencyDifference();
        java.lang.String str19 = mongoClientOptions12.getRequiredReplicaSetName();
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05173");
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
        int int12 = mongoClientOptions5.getHeartbeatThreadCount();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05174");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties45 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str46 = mongoProperties45.host;
        mongoProperties45.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass49 = mongoProperties45.fieldNamingStrategy;
        mongoProperties45.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str53 = mongoProperties52.getUri();
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder54.build();
        int int58 = mongoClientOptions57.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder59 = mongoProperties52.builder(mongoClientOptions57);
        com.mongodb.MongoClientOptions.Builder builder60 = mongoProperties45.builder(mongoClientOptions57);
        int int61 = mongoClientOptions57.getConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory62 = mongoClientOptions57.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder63 = builder44.dbEncoderFactory(dBEncoderFactory62);
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.minConnectionsPerHost(2200002);
        com.mongodb.MongoClientOptions.Builder builder67 = builder63.threadsAllowedToBlockForConnectionMultiplier(385875968);
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
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(wildcardClass49);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "mongodb://localhost/test" + "'", str53, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10000 + "'", int61 == 10000);
        org.junit.Assert.assertNotNull(dBEncoderFactory62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05175");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("637534208", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 637534208");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("3ne53");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3ne53\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05177");
        int int2 = java.lang.Integer.max(22, 1260000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1260000 + "'", int2 == 1260000);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05178");
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
        int int29 = mongoClientOptions23.getHeartbeatSocketTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory30 = mongoClientOptions23.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder38 = builder33.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder40 = builder33.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder42 = builder33.maxConnectionLifeTime(120000);
        boolean boolean43 = mongoClientOptions23.equals((java.lang.Object) builder42);
        boolean boolean44 = mongoClientOptions23.isAutoConnectRetry();
        java.lang.String str45 = mongoClientOptions23.getDescription();
        int int46 = mongoClientOptions23.getHeartbeatThreadCount();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05179");
        int int1 = java.lang.Integer.numberOfTrailingZeros(320000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05180");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        boolean boolean5 = mongoClientOptions3.isAutoConnectRetry();
        int int6 = mongoClientOptions3.getHeartbeatThreadCount();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern8 = mongoClientOptions3.getWriteConcern();
        int int9 = mongoClientOptions3.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(writeConcern8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05181");
        int int1 = java.lang.Integer.signum(144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05182");
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
        com.mongodb.MongoClientOptions.Builder builder64 = builder51.acceptableLatencyDifference(20000);
        com.mongodb.MongoClientOptions.Builder builder66 = builder51.minConnectionsPerHost(137);
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
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05183");
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
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        boolean boolean19 = mongoClientOptions18.isAlwaysUseMBeans();
        int int20 = mongoClientOptions18.getLocalThreshold();
        boolean boolean21 = mongoClientOptions18.isCursorFinalizerEnabled();
        org.springframework.core.env.Environment environment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient23 = mongoProperties0.createMongoClient(mongoClientOptions18, environment22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05184");
        int int2 = java.lang.Integer.max(1359872, (-47480831));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1359872 + "'", int2 == 1359872);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05185");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int7 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int8 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int9 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05186");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("16777215", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 256 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05187");
        int int1 = java.lang.Integer.signum(26);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05188");
        int int1 = java.lang.Integer.parseInt("4720000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4720000 + "'", int1 == 4720000);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05189");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getHost();
        java.lang.String str5 = mongoProperties0.getHost();
        mongoProperties0.setUsername("9792256");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05190");
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
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.alwaysUseMBeans(false);
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
        com.mongodb.WriteConcern writeConcern51 = mongoClientOptions47.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder52 = builder34.writeConcern(writeConcern51);
        com.mongodb.MongoClientOptions.Builder builder53 = builder23.writeConcern(writeConcern51);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.connectionsPerHost(99);
        com.mongodb.MongoClientOptions.Builder builder57 = builder53.maxConnectionLifeTime(32);
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "mongodb://localhost/test" + "'", str43, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(writeConcern51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05191");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.database = "3";
        mongoProperties0.setHost("25");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        java.lang.String str18 = mongoProperties9.getGridFsDatabase();
        java.lang.Integer int19 = mongoProperties9.getPort();
        char[] charArray20 = mongoProperties9.getPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties22.gridFsDatabase = "hi!";
        char[] charArray29 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties22.setPassword(charArray29);
        mongoProperties21.setPassword(charArray29);
        java.lang.String str32 = mongoProperties21.getHost();
        mongoProperties21.setHost("test");
        java.lang.String str35 = mongoProperties21.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        boolean boolean41 = mongoClientOptions39.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties21.builder(mongoClientOptions39);
        int int43 = mongoClientOptions39.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties9.builder(mongoClientOptions39);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient45 = mongoProperties0.createMongoClient(mongoClientOptions39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[a, a, #, 4]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05192");
        java.lang.String str2 = java.lang.Integer.toString(1101, 1832910848);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1101" + "'", str2, "1101");
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("2f800000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2f800000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05194");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        char[] charArray14 = new char[] { '#', 'a', '#', '4', 'a', ' ' };
        mongoProperties0.password = charArray14;
        mongoProperties0.username = "8001d4bf";
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions18, environment19);
        java.lang.String str21 = mongoProperties0.username;
        mongoProperties0.host = "19";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8001d4bf" + "'", str21, "8001d4bf");
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("24");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 24");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05196");
        java.lang.Integer int1 = java.lang.Integer.getInteger("12000000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05197");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties31 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int32 = mongoProperties31.getDEFAULT_PORT();
        mongoProperties31.setHost("hi!");
        mongoProperties31.host = "";
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        java.lang.String str41 = mongoClientOptions40.toString();
        int int42 = mongoClientOptions40.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder43 = mongoProperties31.builder(mongoClientOptions40);
        int int44 = mongoClientOptions40.getConnectTimeout();
        javax.net.SocketFactory socketFactory45 = mongoClientOptions40.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory46 = mongoClientOptions40.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder47 = builder30.dbDecoderFactory(dBDecoderFactory46);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.build();
        int int52 = mongoClientOptions51.getMaxConnectionLifeTime();
        boolean boolean53 = mongoClientOptions51.isAutoConnectRetry();
        javax.net.SocketFactory socketFactory54 = mongoClientOptions51.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder55 = builder47.socketFactory(socketFactory54);
        com.mongodb.MongoClientOptions.Builder builder57 = builder47.heartbeatFrequency(29);
        com.mongodb.MongoClientOptions.Builder builder58 = builder47.legacyDefaults();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 27017 + "'", int32 == 27017);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 20000 + "'", int42 == 20000);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10000 + "'", int44 == 10000);
        org.junit.Assert.assertNotNull(socketFactory45);
        org.junit.Assert.assertNotNull(dBDecoderFactory46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(mongoClientOptions51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(socketFactory54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05198");
        int int1 = java.lang.Integer.numberOfLeadingZeros((-1306525534));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05199");
        int int2 = java.lang.Integer.compareUnsigned(1073741825, 74);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05200");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        mongoProperties0.username = "1100001";
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        java.lang.String str18 = mongoClientOptions17.toString();
        int int19 = mongoClientOptions17.getMaxWaitTime();
        int int20 = mongoClientOptions17.getConnectionsPerHost();
        int int21 = mongoClientOptions17.getConnectionsPerHost();
        int int22 = mongoClientOptions17.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory23 = mongoClientOptions17.getDbDecoderFactory();
        int int24 = mongoClientOptions17.getHeartbeatThreadCount();
        org.springframework.core.env.Environment environment25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient26 = mongoProperties0.createMongoClient(mongoClientOptions17, environment25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120000 + "'", int19 == 120000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05201");
        int int1 = java.lang.Integer.parseInt("25");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05202");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.connectTimeout(1140850688);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatConnectTimeout(0);
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
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05203");
        int int1 = java.lang.Integer.reverse(1306597376);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1607602 + "'", int1 == 1607602);
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05204");
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
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minHeartbeatFrequency(1966071808);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties37 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str38 = mongoProperties37.getUri();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        int int43 = mongoClientOptions42.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties37.builder(mongoClientOptions42);
        int int45 = mongoClientOptions42.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory46 = mongoClientOptions42.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder47 = builder34.dbEncoderFactory(dBEncoderFactory46);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "mongodb://localhost/test" + "'", str38, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05205");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.host;
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("2147483960");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483960\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05207");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        mongoProperties0.clearPassword();
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05208");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout(2200002);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties8.gridFsDatabase = "hi!";
        char[] charArray15 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties8.setPassword(charArray15);
        mongoProperties7.setPassword(charArray15);
        java.lang.String str18 = mongoProperties7.getHost();
        mongoProperties7.setHost("test");
        java.lang.String str21 = mongoProperties7.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        boolean boolean27 = mongoClientOptions25.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties7.builder(mongoClientOptions25);
        com.mongodb.WriteConcern writeConcern29 = mongoClientOptions25.getWriteConcern();
        com.mongodb.ReadPreference readPreference30 = mongoClientOptions25.getReadPreference();
        int int31 = mongoClientOptions25.getMinHeartbeatFrequency();
        int int32 = mongoClientOptions25.getMinHeartbeatFrequency();
        java.lang.String str33 = mongoClientOptions25.getRequiredReplicaSetName();
        int int34 = mongoClientOptions25.getSocketTimeout();
        javax.net.SocketFactory socketFactory35 = mongoClientOptions25.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = builder6.socketFactory(socketFactory35);
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.socketKeepAlive(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(writeConcern29);
        org.junit.Assert.assertNotNull(readPreference30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 500 + "'", int31 == 500);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 500 + "'", int32 == 500);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(socketFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05209");
        java.lang.String str1 = java.lang.Integer.toBinaryString((-2145648384));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10000000000111000000000100000000" + "'", str1, "10000000000111000000000100000000");
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05210");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        java.lang.String str8 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Class<?> wildcardClass9 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertNotNull(mongoClient11);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05211");
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
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.heartbeatSocketTimeout(67108864);
        com.mongodb.MongoClientOptions.Builder builder55 = builder51.requiredReplicaSetName("2149318913");
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.minHeartbeatFrequency(7341045);
        com.mongodb.MongoClientOptions.Builder builder59 = builder55.autoConnectRetry(true);
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
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05212");
        int int2 = java.lang.Integer.rotateLeft(1664, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13312 + "'", int2 == 13312);
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05213");
        int int2 = java.lang.Integer.sum(26214400, 605440);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26819840 + "'", int2 == 26819840);
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05214");
        int int2 = java.lang.Integer.compareUnsigned(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05215");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.port;
        mongoProperties0.authenticationDatabase = "61";
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05216");
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
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        com.mongodb.MongoClientOptions.Builder builder25 = builder20.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder20.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties30 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int31 = mongoProperties30.getDEFAULT_PORT();
        mongoProperties30.setHost("hi!");
        mongoProperties30.host = "";
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.build();
        java.lang.String str40 = mongoClientOptions39.toString();
        int int41 = mongoClientOptions39.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties30.builder(mongoClientOptions39);
        int int43 = mongoClientOptions39.getConnectTimeout();
        javax.net.SocketFactory socketFactory44 = mongoClientOptions39.getSocketFactory();
        com.mongodb.DBDecoderFactory dBDecoderFactory45 = mongoClientOptions39.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder46 = builder29.dbDecoderFactory(dBDecoderFactory45);
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.acceptableLatencyDifference(578813952);
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder53 = builder49.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder55 = builder53.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder58 = builder56.heartbeatSocketTimeout(20480000);
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        int int63 = mongoClientOptions62.getMaxConnectionLifeTime();
        int int64 = mongoClientOptions62.getMaxConnectionLifeTime();
        int int65 = mongoClientOptions62.getLocalThreshold();
        boolean boolean66 = mongoClientOptions62.isAlwaysUseMBeans();
        java.lang.String str67 = mongoClientOptions62.getRequiredReplicaSetName();
        com.mongodb.WriteConcern writeConcern68 = mongoClientOptions62.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder69 = builder56.writeConcern(writeConcern68);
        com.mongodb.MongoClientOptions.Builder builder70 = builder55.writeConcern(writeConcern68);
        com.mongodb.MongoClientOptions.Builder builder71 = builder48.writeConcern(writeConcern68);
        com.mongodb.MongoClientOptions.Builder builder72 = builder17.writeConcern(writeConcern68);
        com.mongodb.MongoClientOptions.Builder builder74 = builder17.localThreshold(1100001);
        com.mongodb.MongoClientOptions.Builder builder76 = builder74.localThreshold(196);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 27017 + "'", int31 == 27017);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(mongoClientOptions39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10000 + "'", int43 == 10000);
        org.junit.Assert.assertNotNull(socketFactory44);
        org.junit.Assert.assertNotNull(dBDecoderFactory45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 15 + "'", int65 == 15);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(writeConcern68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05217");
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
        mongoProperties0.database = "144";
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
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05218");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.getUri();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05219");
        long long1 = java.lang.Integer.toUnsignedLong(2240);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2240L + "'", long1 == 2240L);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05220");
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
        mongoProperties0.authenticationDatabase = "34";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties16 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str17 = mongoProperties16.getUri();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        int int22 = mongoClientOptions21.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties16.builder(mongoClientOptions21);
        int int24 = mongoClientOptions21.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory25 = mongoClientOptions21.getDbEncoderFactory();
        int int26 = mongoClientOptions21.getConnectionsPerHost();
        int int27 = mongoClientOptions21.getConnectTimeout();
        int int28 = mongoClientOptions21.getHeartbeatConnectRetryFrequency();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient29 = mongoProperties0.createMongoClient(mongoClientOptions21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10000 + "'", int27 == 10000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 500 + "'", int28 == 500);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05221");
        int int2 = java.lang.Integer.rotateRight(0, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05222");
        int int2 = java.lang.Integer.compareUnsigned(24, 10010000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05223");
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
        mongoProperties0.port = 1798517552;
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
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05224");
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
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        boolean boolean28 = mongoClientOptions26.equals((java.lang.Object) (-2147483648));
        int int29 = mongoClientOptions26.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions26.getDbDecoderFactory();
        int int31 = mongoClientOptions26.getMaxConnectionLifeTime();
        int int32 = mongoClientOptions26.getMaxConnectionIdleTime();
        int int33 = mongoClientOptions26.getConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder34 = mongoProperties0.builder(mongoClientOptions26);
        int int35 = mongoClientOptions26.getConnectionsPerHost();
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05225");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) (-1));
        java.lang.String str4 = mongoProperties0.getDatabase();
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
        int int20 = mongoClientOptions14.getMinConnectionsPerHost();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1342177280 + "'", int20 == 1342177280);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05226");
        int int2 = java.lang.Integer.rotateRight((-2139070703), 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33651782 + "'", int2 == 33651782);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("-2147480000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: -2147480000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05228");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "1100001";
        mongoProperties0.uri = "101";
        mongoProperties0.uri = "18";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05229");
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
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.acceptableLatencyDifference((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder41 = builder35.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.connectTimeout(764);
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
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05230");
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
        int int42 = mongoClientOptions24.getLocalThreshold();
        com.mongodb.DBEncoderFactory dBEncoderFactory43 = mongoClientOptions24.getDbEncoderFactory();
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 15 + "'", int42 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory43);
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05231");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        java.lang.String str8 = mongoProperties0.getHost();
        java.lang.String str9 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05232");
        int int2 = java.lang.Integer.min((-741601280), 16777216);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-741601280) + "'", int2 == (-741601280));
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05233");
        int int1 = java.lang.Integer.lowestOneBit(107374182);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05234");
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
        mongoProperties0.setPort((java.lang.Integer) 15);
        java.lang.String str16 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass17 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str18 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "test" + "'", str18, "test");
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05235");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        java.lang.String str3 = mongoProperties0.getGridFsDatabase();
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
        int int20 = mongoClientOptions16.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions16.getWriteConcern();
        int int22 = mongoClientOptions16.getLocalThreshold();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions16.getReadPreference();
        long long24 = mongoClientOptions16.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties0.builder(mongoClientOptions16);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties0.builder(mongoClientOptions26);
        java.lang.Class<?> wildcardClass28 = mongoProperties0.fieldNamingStrategy;
        int int29 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(writeConcern21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertNotNull(readPreference23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 27017 + "'", int29 == 27017);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05236");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        char[] charArray11 = mongoProperties0.password;
        java.lang.String str12 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        boolean boolean18 = mongoClientOptions16.equals((java.lang.Object) (-2147483648));
        int int19 = mongoClientOptions16.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions16.getDbDecoderFactory();
        int int21 = mongoClientOptions16.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions16.getMinConnectionsPerHost();
        org.springframework.core.env.Environment environment23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient24 = mongoProperties0.createMongoClient(mongoClientOptions16, environment23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1100001" + "'", str12, "1100001");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1342177280 + "'", int22 == 1342177280);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05237");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier(10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.connectionsPerHost(2200002);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout(2048);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime(35);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05238");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(1100100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.cursorFinalizerEnabled(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05239");
        int int1 = java.lang.Integer.numberOfLeadingZeros(132);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05240");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.clearPassword();
        mongoProperties0.setHost("13");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "test" + "'", str9, "test");
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05241");
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
        int int29 = mongoClientOptions9.getMaxConnectionLifeTime();
        int int30 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05242");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getUri();
        java.lang.String str6 = mongoProperties0.host;
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11101101111111010110000000001";
        int int10 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str11 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray12 = mongoProperties0.password;
        boolean boolean13 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05243");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(764);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05244");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1010, 402767888);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1010" + "'", str2, "1010");
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05245");
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
        java.lang.String str16 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "22";
        mongoProperties0.authenticationDatabase = "17204400";
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions24.getMaxConnectionLifeTime();
        int int27 = mongoClientOptions24.getLocalThreshold();
        boolean boolean28 = mongoClientOptions24.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions24.getSocketFactory();
        javax.net.SocketFactory socketFactory30 = mongoClientOptions24.getSocketFactory();
        int int31 = mongoClientOptions24.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory32 = mongoClientOptions24.getDbEncoderFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient33 = mongoProperties0.createMongoClient(mongoClientOptions24);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(socketFactory29);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory32);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05246");
        java.lang.String str1 = java.lang.Integer.toHexString(1207959552);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "48000000" + "'", str1, "48000000");
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05247");
        int int2 = java.lang.Integer.divideUnsigned((int) (byte) 100, (-2055088961));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05248");
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
        java.lang.Class<?> wildcardClass24 = mongoProperties0.fieldNamingStrategy;
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
        org.junit.Assert.assertNull(wildcardClass24);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05249");
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
        int int18 = mongoClientOptions12.getHeartbeatConnectTimeout();
        boolean boolean19 = mongoClientOptions12.isCursorFinalizerEnabled();
        com.mongodb.WriteConcern writeConcern20 = mongoClientOptions12.getWriteConcern();
        java.lang.String str21 = mongoClientOptions12.getDescription();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20000 + "'", int18 == 20000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(writeConcern20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05250");
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
        java.lang.String str23 = mongoProperties0.authenticationDatabase;
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05251");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder25 = builder17.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int31 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int32 = mongoClientOptions29.getLocalThreshold();
        boolean boolean33 = mongoClientOptions29.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory34 = mongoClientOptions29.getSocketFactory();
        javax.net.SocketFactory socketFactory35 = mongoClientOptions29.getSocketFactory();
        com.mongodb.ReadPreference readPreference36 = mongoClientOptions29.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder37 = builder17.readPreference(readPreference36);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder41 = builder40.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.minConnectionsPerHost(11610);
        com.mongodb.MongoClientOptions.Builder builder50 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder50.build();
        int int54 = mongoClientOptions53.getMaxConnectionLifeTime();
        int int55 = mongoClientOptions53.getMaxConnectionLifeTime();
        int int56 = mongoClientOptions53.getLocalThreshold();
        int int57 = mongoClientOptions53.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str58 = mongoClientOptions53.getRequiredReplicaSetName();
        int int59 = mongoClientOptions53.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory60 = mongoClientOptions53.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder61 = builder49.dbDecoderFactory(dBDecoderFactory60);
        com.mongodb.MongoClientOptions.Builder builder62 = builder37.dbDecoderFactory(dBDecoderFactory60);
        com.mongodb.MongoClientOptions.Builder builder63 = builder14.dbDecoderFactory(dBDecoderFactory60);
        com.mongodb.MongoClientOptions.Builder builder65 = builder14.requiredReplicaSetName("a0000000");
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.localThreshold(20);
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
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(socketFactory34);
        org.junit.Assert.assertNotNull(socketFactory35);
        org.junit.Assert.assertNotNull(readPreference36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 15 + "'", int56 == 15);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5000 + "'", int59 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05252");
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
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.threadsAllowedToBlockForConnectionMultiplier(2947841);
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
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05253");
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
        char[] charArray25 = mongoProperties14.password;
        java.lang.Integer int26 = mongoProperties14.port;
        java.lang.String str27 = mongoProperties14.getUsername();
        mongoProperties14.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int30 = mongoProperties29.getDEFAULT_PORT();
        mongoProperties29.setHost("hi!");
        mongoProperties29.setDatabase("1100001");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int36 = mongoProperties35.getDEFAULT_PORT();
        mongoProperties35.setHost("hi!");
        mongoProperties35.host = "";
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        java.lang.String str45 = mongoClientOptions44.toString();
        int int46 = mongoClientOptions44.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder47 = mongoProperties35.builder(mongoClientOptions44);
        int int48 = mongoClientOptions44.getConnectTimeout();
        javax.net.SocketFactory socketFactory49 = mongoClientOptions44.getSocketFactory();
        int int50 = mongoClientOptions44.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties29.builder(mongoClientOptions44);
        int int52 = mongoClientOptions44.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder53 = mongoProperties14.builder(mongoClientOptions44);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient54 = mongoProperties0.createMongoClient(mongoClientOptions44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5000 + "'", int12 == 5000);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(charArray25);
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 27017 + "'", int30 == 27017);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27017 + "'", int36 == 27017);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 20000 + "'", int46 == 20000);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10000 + "'", int48 == 10000);
        org.junit.Assert.assertNotNull(socketFactory49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05254");
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
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        int int24 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int25 = mongoClientOptions23.getMaxConnectionLifeTime();
        int int26 = mongoClientOptions23.getLocalThreshold();
        int int27 = mongoClientOptions23.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str28 = mongoClientOptions23.getRequiredReplicaSetName();
        int int29 = mongoClientOptions23.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions23.getDbDecoderFactory();
        int int31 = mongoClientOptions23.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean32 = mongoClientOptions23.isSocketKeepAlive();
        boolean boolean33 = mongoClientOptions23.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory34 = mongoClientOptions23.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder35 = builder19.socketFactory(socketFactory34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.localThreshold(82595524);
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5000 + "'", int29 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(socketFactory34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05255");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("2", 807862272);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 807862272 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05256");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        mongoProperties0.setDatabase("100011");
        java.lang.String str7 = mongoProperties0.database;
        mongoProperties0.setUri("8192");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100011" + "'", str7, "100011");
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05257");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.setDatabase("46136620");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05258");
        int int2 = java.lang.Integer.sum(60000, 60000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 60060000 + "'", int2 == 60060000);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05259");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.acceptableLatencyDifference(5);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder14.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.description("69");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder17.minHeartbeatFrequency((-1306525534));
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05260");
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
        java.lang.String str27 = mongoProperties0.getMongoClientDatabase();
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "test" + "'", str27, "test");
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05261");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str11 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setHost("c43d9");
        mongoProperties0.setHost("2e");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05262");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.remainderUnsigned(17204400, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05263");
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
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        boolean boolean18 = mongoClientOptions17.isAlwaysUseMBeans();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties20.gridFsDatabase = "hi!";
        char[] charArray27 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties20.setPassword(charArray27);
        mongoProperties19.setPassword(charArray27);
        boolean boolean30 = mongoClientOptions17.equals((java.lang.Object) mongoProperties19);
        mongoProperties19.authenticationDatabase = "30";
        char[] charArray33 = mongoProperties19.getPassword();
        mongoProperties0.password = charArray33;
        java.lang.String str35 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "11i71" + "'", str35, "11i71");
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05264");
        java.lang.String str1 = java.lang.Integer.toHexString(41014);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a036" + "'", str1, "a036");
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05265");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(499100673, 100011);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "499100673" + "'", str2, "499100673");
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05266");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionLifeTime(9);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatConnectTimeout((-1610612728));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatConnectTimeout must be greater than or equal to 0");
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05267");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = mongoClientOptions3.getDbDecoderFactory();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        long long8 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        java.lang.String str9 = mongoClientOptions3.getDescription();
        com.mongodb.DBDecoderFactory dBDecoderFactory10 = mongoClientOptions3.getDbDecoderFactory();
        int int11 = mongoClientOptions3.getLocalThreshold();
        int int12 = mongoClientOptions3.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(dBDecoderFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05268");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("33", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05269");
        int int2 = java.lang.Integer.remainderUnsigned(214748374, 44);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05270");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory17 = mongoClientOptions9.getDbDecoderFactory();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(dBDecoderFactory17);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05271");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.port = 74579968;
        java.lang.String str13 = mongoProperties0.username;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05272");
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
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.requiredReplicaSetName("5");
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        boolean boolean30 = mongoClientOptions29.isAlwaysUseMBeans();
        int int31 = mongoClientOptions29.getLocalThreshold();
        int int32 = mongoClientOptions29.getSocketTimeout();
        int int33 = mongoClientOptions29.getConnectTimeout();
        javax.net.SocketFactory socketFactory34 = mongoClientOptions29.getSocketFactory();
        com.mongodb.ReadPreference readPreference35 = mongoClientOptions29.getReadPreference();
        int int36 = mongoClientOptions29.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory37 = mongoClientOptions29.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder38 = builder23.dbDecoderFactory(dBDecoderFactory37);
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        java.lang.String str43 = mongoClientOptions42.toString();
        int int44 = mongoClientOptions42.getMaxWaitTime();
        int int45 = mongoClientOptions42.getConnectionsPerHost();
        int int46 = mongoClientOptions42.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.DBDecoderFactory dBDecoderFactory47 = mongoClientOptions42.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder48 = builder23.dbDecoderFactory(dBDecoderFactory47);
        com.mongodb.MongoClientOptions.Builder builder50 = builder23.threadsAllowedToBlockForConnectionMultiplier(100011);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.socketTimeout(107);
        com.mongodb.MongoClientOptions.Builder builder54 = builder50.minHeartbeatFrequency(4521984);
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.maxConnectionLifeTime((int) ' ');
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 15 + "'", int31 == 15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10000 + "'", int33 == 10000);
        org.junit.Assert.assertNotNull(socketFactory34);
        org.junit.Assert.assertNotNull(readPreference35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 120000 + "'", int44 == 120000);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertNotNull(dBDecoderFactory47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05273");
        int int2 = java.lang.Integer.rotateLeft((int) '#', (-1923934412));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 36700160 + "'", int2 == 36700160);
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05274");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("3760179776");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3760179776\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05275");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder21.legacyDefaults();
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
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05276");
        int int2 = java.lang.Integer.compareUnsigned(1073741825, 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05277");
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
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.description("12000000000");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.socketKeepAlive(false);
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
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05278");
        java.lang.String str1 = java.lang.Integer.toHexString(832);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "340" + "'", str1, "340");
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05279");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties3 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties4 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties4.gridFsDatabase = "hi!";
        char[] charArray11 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties4.setPassword(charArray11);
        mongoProperties3.setPassword(charArray11);
        java.lang.String str14 = mongoProperties3.getHost();
        boolean boolean15 = mongoProperties3.hasCustomCredentials();
        mongoProperties3.username = "27017";
        mongoProperties3.authenticationDatabase = "4294967295";
        java.lang.String str20 = mongoProperties3.getHost();
        char[] charArray21 = mongoProperties3.getPassword();
        mongoProperties0.setPassword(charArray21);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[a, a, #, 4]");
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05280");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010" + "'", str1, "1010");
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05281");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.threadsAllowedToBlockForConnectionMultiplier(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("100001100110011010011");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100001100110011010011\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05283");
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
        mongoProperties0.username = "-1610547200";
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
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05284");
        int int2 = java.lang.Integer.min((int) 'a', 4751360);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05285");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) (-1));
        java.lang.String str4 = mongoProperties0.getDatabase();
        java.lang.String str5 = mongoProperties0.host;
        mongoProperties0.setAuthenticationDatabase("11010");
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05286");
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
        boolean boolean25 = mongoClientOptions18.isCursorFinalizerEnabled();
        int int26 = mongoClientOptions18.getMinHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05287");
        int int2 = java.lang.Integer.divideUnsigned(0, 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05288");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray3 = null;
        mongoProperties0.password = charArray3;
        mongoProperties0.username = "8001d4bf";
        mongoProperties0.setGridFsDatabase("1157627904");
        java.lang.String str9 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05289");
        int int2 = java.lang.Integer.rotateLeft((-536870901), 14680065);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1073741801) + "'", int2 == (-1073741801));
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05290");
        int int1 = java.lang.Integer.reverse(3407872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11264 + "'", int1 == 11264);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05291");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        mongoProperties0.port = 2147483647;
        mongoProperties0.port = 1342177280;
        java.lang.String str10 = mongoProperties0.getGridFsDatabase();
        int int11 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setUsername("1c000000");
        mongoProperties0.host = "27017";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05292");
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
        java.lang.String str11 = mongoClientOptions3.getRequiredReplicaSetName();
        java.lang.Class<?> wildcardClass12 = mongoClientOptions3.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05293");
        int int2 = java.lang.Integer.compareUnsigned(27017, (-401866714));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05294");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        int int11 = mongoClientOptions10.getMinConnectionsPerHost();
        long long12 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        int int13 = mongoClientOptions10.getMaxConnectionLifeTime();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions10.getSocketFactory();
        int int15 = mongoClientOptions10.getHeartbeatFrequency();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions10.getSocketFactory();
        int int17 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int18 = mongoClientOptions10.getMaxConnectionIdleTime();
        int int19 = mongoClientOptions10.getMaxConnectionIdleTime();
        int int20 = mongoClientOptions10.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 20000 + "'", int20 == 20000);
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05295");
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
        java.lang.String str19 = mongoClientOptions9.toString();
        java.lang.String str20 = mongoClientOptions9.toString();
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
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05296");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        java.lang.Class<?> wildcardClass8 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05297");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(416, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "416" + "'", str2, "416");
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05298");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        char[] charArray14 = new char[] { '#', 'a', '#', '4', 'a', ' ' };
        mongoProperties0.password = charArray14;
        java.lang.Class<?> wildcardClass16 = mongoProperties0.fieldNamingStrategy;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str18 = mongoProperties17.host;
        java.lang.String str19 = mongoProperties17.host;
        java.lang.Integer int20 = mongoProperties17.getPort();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean26 = mongoClientOptions24.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder27 = mongoProperties17.builder(mongoClientOptions24);
        boolean boolean28 = mongoClientOptions24.isSocketKeepAlive();
        int int29 = mongoClientOptions24.getLocalThreshold();
        int int30 = mongoClientOptions24.getLocalThreshold();
        int int31 = mongoClientOptions24.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory32 = mongoClientOptions24.getDbDecoderFactory();
        java.lang.Class<?> wildcardClass33 = dBDecoderFactory32.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass33;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, 4, a,  ]");
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 15 + "'", int30 == 15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 500 + "'", int31 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05299");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        mongoProperties0.host = "27017";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05300");
        int int1 = java.lang.Integer.reverse(11101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1160511488) + "'", int1 == (-1160511488));
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05301");
        int int1 = java.lang.Integer.reverseBytes(637534208);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05302");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        boolean boolean8 = mongoClientOptions3.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern9 = mongoClientOptions3.getWriteConcern();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(writeConcern9);
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05303");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions3.getReadPreference();
        int int10 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        int int11 = mongoClientOptions3.getHeartbeatThreadCount();
        int int12 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int13 = mongoClientOptions3.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(readPreference9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5000 + "'", int13 == 5000);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05304");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.Integer int5 = mongoProperties0.port;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str7 = mongoProperties6.host;
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties6.determinePort(environment8);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        boolean boolean14 = mongoClientOptions13.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = mongoClientOptions13.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties6.builder(mongoClientOptions13);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        int int21 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions20.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties6.builder(mongoClientOptions20);
        boolean boolean24 = mongoClientOptions20.isAutoConnectRetry();
        boolean boolean25 = mongoClientOptions20.isAlwaysUseMBeans();
        int int26 = mongoClientOptions20.getMaxConnectionLifeTime();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient27 = mongoProperties0.createMongoClient(mongoClientOptions20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05305");
        int int1 = java.lang.Integer.parseUnsignedInt("176");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 176 + "'", int1 == 176);
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05306");
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
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        int int41 = mongoClientOptions40.getMaxConnectionLifeTime();
        int int42 = mongoClientOptions40.getMaxConnectionLifeTime();
        int int43 = mongoClientOptions40.getLocalThreshold();
        boolean boolean44 = mongoClientOptions40.isAlwaysUseMBeans();
        int int45 = mongoClientOptions40.getLocalThreshold();
        com.mongodb.DBDecoderFactory dBDecoderFactory46 = mongoClientOptions40.getDbDecoderFactory();
        int int47 = mongoClientOptions40.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties0.builder(mongoClientOptions40);
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
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 15 + "'", int43 == 15);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 15 + "'", int45 == 15);
        org.junit.Assert.assertNotNull(dBDecoderFactory46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05307");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties14.setHost("");
        mongoProperties14.username = "100";
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(27017);
        java.lang.Class<?> wildcardClass22 = builder21.getClass();
        mongoProperties14.fieldNamingStrategy = wildcardClass22;
        mongoProperties14.setGridFsDatabase("");
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
        com.mongodb.MongoClientOptions.Builder builder42 = mongoProperties14.builder(mongoClientOptions37);
        int int43 = mongoClientOptions37.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties0.builder(mongoClientOptions37);
        int int45 = mongoClientOptions37.getConnectionsPerHost();
        int int46 = mongoClientOptions37.getHeartbeatFrequency();
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
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 27017 + "'", int27 == 27017);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20000 + "'", int43 == 20000);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5000 + "'", int46 == 5000);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05308");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder16 = builder15.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.heartbeatSocketTimeout(53182464);
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder28.build();
        int int32 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int33 = mongoClientOptions31.getMaxConnectionLifeTime();
        int int34 = mongoClientOptions31.getLocalThreshold();
        boolean boolean35 = mongoClientOptions31.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory36 = mongoClientOptions31.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder37 = builder25.socketFactory(socketFactory36);
        com.mongodb.MongoClientOptions.Builder builder38 = builder20.socketFactory(socketFactory36);
        com.mongodb.MongoClientOptions.Builder builder39 = builder12.socketFactory(socketFactory36);
        com.mongodb.MongoClientOptions.Builder builder41 = builder12.connectTimeout(2200002);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(socketFactory36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05309");
        int int2 = java.lang.Integer.sum(41, 100100034);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100100075 + "'", int2 == 100100075);
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05310");
        java.lang.String str2 = java.lang.Integer.toString((-2139080703), 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2s0p6a3" + "'", str2, "-2s0p6a3");
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05311");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder2.heartbeatThreadCount(90);
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.heartbeatSocketTimeout(1048576);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05312");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        int int8 = mongoClientOptions3.getLocalThreshold();
        int int9 = mongoClientOptions3.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05313");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-1417281280));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05314");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.username = "100";
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Integer int6 = mongoProperties0.getPort();
        mongoProperties0.username = "test";
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        java.lang.String str11 = mongoProperties0.database;
        java.lang.String str12 = mongoProperties0.uri;
        java.lang.String str13 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05315");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(52);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        int int12 = mongoClientOptions11.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("e408", (-2143813376));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2143813376 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05317");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        boolean boolean12 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.username = "27017";
        mongoProperties0.authenticationDatabase = "4294967295";
        char[] charArray17 = mongoProperties0.getPassword();
        java.lang.String str18 = mongoProperties0.username;
        mongoProperties0.database = "1000101";
        mongoProperties0.setDatabase("");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[a, a, #, 4]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "27017" + "'", str18, "27017");
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05318");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getConnectTimeout();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions3.getSocketFactory();
        com.mongodb.ReadPreference readPreference9 = mongoClientOptions3.getReadPreference();
        int int10 = mongoClientOptions3.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions3.getDbDecoderFactory();
        int int12 = mongoClientOptions3.getMinHeartbeatFrequency();
        com.mongodb.ReadPreference readPreference13 = mongoClientOptions3.getReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10000 + "'", int7 == 10000);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(readPreference9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 500 + "'", int12 == 500);
        org.junit.Assert.assertNotNull(readPreference13);
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05319");
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
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        boolean boolean37 = mongoClientOptions36.isAlwaysUseMBeans();
        int int38 = mongoClientOptions36.getLocalThreshold();
        int int39 = mongoClientOptions36.getSocketTimeout();
        int int40 = mongoClientOptions36.getConnectTimeout();
        int int41 = mongoClientOptions36.getHeartbeatConnectTimeout();
        int int42 = mongoClientOptions36.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.ReadPreference readPreference43 = mongoClientOptions36.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder44 = builder30.readPreference(readPreference43);
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
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10000 + "'", int40 == 10000);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 20000 + "'", int41 == 20000);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05320");
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
        boolean boolean33 = mongoProperties0.hasCustomCredentials();
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05321");
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
        mongoProperties0.setPort((java.lang.Integer) 15);
        java.lang.String str16 = mongoProperties0.getUsername();
        mongoProperties0.uri = "132";
        char[] charArray19 = mongoProperties0.getPassword();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(charArray19);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05322");
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
        int int16 = mongoProperties0.getDEFAULT_PORT();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        java.lang.String str21 = mongoClientOptions20.toString();
        int int22 = mongoClientOptions20.getMaxWaitTime();
        int int23 = mongoClientOptions20.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties0.builder(mongoClientOptions20);
        java.lang.Class<?> wildcardClass25 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 120000 + "'", int22 == 120000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(wildcardClass25);
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05323");
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
        java.lang.String str16 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.database = "4294967167";
        java.lang.String str20 = mongoProperties0.host;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05324");
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
        mongoProperties0.database = "305ce10e";
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
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05325");
        java.lang.String str1 = java.lang.Integer.toHexString(312459320);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "129fc038" + "'", str1, "129fc038");
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05326");
        java.lang.String str1 = java.lang.Integer.toOctalString(102886528);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "610366200" + "'", str1, "610366200");
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05327");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean3 = mongoProperties0.hasCustomAddress();
        mongoProperties0.database = "27017";
        mongoProperties0.clearPassword();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str8 = mongoProperties7.host;
        org.springframework.core.env.Environment environment9 = null;
        int int10 = mongoProperties7.determinePort(environment9);
        boolean boolean11 = mongoProperties7.hasCustomAddress();
        org.springframework.core.env.Environment environment12 = null;
        int int13 = mongoProperties7.determinePort(environment12);
        mongoProperties7.setUsername("");
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions19.getMaxConnectionLifeTime();
        int int22 = mongoClientOptions19.getLocalThreshold();
        int int23 = mongoClientOptions19.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties7.builder(mongoClientOptions19);
        int int25 = mongoClientOptions19.getAcceptableLatencyDifference();
        int int26 = mongoClientOptions19.getConnectionsPerHost();
        java.lang.String str27 = mongoClientOptions19.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 15 + "'", int25 == 15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05328");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("3103274522", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 3103274522");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05329");
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
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.autoConnectRetry(false);
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
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05330");
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
        com.mongodb.ReadPreference readPreference11 = mongoClientOptions3.getReadPreference();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions3.getReadPreference();
        boolean boolean13 = mongoClientOptions3.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(readPreference11);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05331");
        int int2 = java.lang.Integer.min((-805306361), 109051904);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-805306361) + "'", int2 == (-805306361));
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05332");
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
        com.mongodb.MongoClientOptions.Builder builder15 = builder12.minHeartbeatFrequency(393216);
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
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05333");
        java.lang.String str1 = java.lang.Integer.toHexString(1154027520);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44c91000" + "'", str1, "44c91000");
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05334");
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
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minConnectionsPerHost(3);
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder47 = builder41.description("4096");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder49 = builder41.minHeartbeatFrequency(0);
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
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05335");
        java.lang.Integer int1 = java.lang.Integer.getInteger("578813952");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05336");
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
        java.lang.String str20 = mongoProperties0.host;
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05337");
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
        int int14 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions3.getHeartbeatConnectTimeout();
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05338");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatFrequency();
        int int6 = mongoClientOptions3.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions3.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions3.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions3.getDbEncoderFactory();
        int int10 = mongoClientOptions3.getMaxWaitTime();
        boolean boolean11 = mongoClientOptions3.isAlwaysUseMBeans();
        long long12 = mongoClientOptions3.getMaxAutoConnectRetryTime();
        int int13 = mongoClientOptions3.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5000 + "'", int5 == 5000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1342177280 + "'", int6 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1342177280 + "'", int13 == 1342177280);
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05339");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getMinConnectionsPerHost();
        int int8 = mongoClientOptions3.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1342177280 + "'", int7 == 1342177280);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05340");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("10000000000000000000000100111000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10000000000000000000000100111000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05341");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        mongoProperties0.uri = "11i71";
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        java.lang.String str11 = mongoClientOptions10.toString();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions10.getReadPreference();
        int int13 = mongoClientOptions10.getHeartbeatConnectRetryFrequency();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient15 = mongoProperties0.createMongoClient(mongoClientOptions10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05342");
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
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        com.mongodb.MongoClientOptions.Builder builder37 = builder32.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        boolean boolean44 = mongoClientOptions43.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory45 = mongoClientOptions43.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder46 = builder39.dbEncoderFactory(dBEncoderFactory45);
        com.mongodb.MongoClientOptions.Builder builder47 = builder27.dbEncoderFactory(dBEncoderFactory45);
        com.mongodb.MongoClientOptions.Builder builder49 = builder27.maxWaitTime(10);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.threadsAllowedToBlockForConnectionMultiplier(100059);
        com.mongodb.MongoClientOptions.Builder builder52 = builder49.legacyDefaults();
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05343");
        int int2 = java.lang.Integer.compareUnsigned(48, (-401866714));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05344");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Integer int3 = mongoProperties0.getPort();
        mongoProperties0.setDatabase("11i71");
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.clearPassword();
        mongoProperties0.database = "144";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties12.gridFsDatabase = "hi!";
        char[] charArray19 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties12.setPassword(charArray19);
        mongoProperties11.setPassword(charArray19);
        java.lang.String str22 = mongoProperties11.getHost();
        boolean boolean23 = mongoProperties11.hasCustomCredentials();
        mongoProperties11.username = "27017";
        mongoProperties11.authenticationDatabase = "4294967295";
        char[] charArray28 = mongoProperties11.getPassword();
        mongoProperties0.setPassword(charArray28);
        mongoProperties0.host = "34";
        java.lang.Integer int32 = mongoProperties0.port;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[a, a, #, 4]");
        org.junit.Assert.assertNull(int32);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05345");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.port = 20000;
        char[] charArray7 = null;
        mongoProperties0.setPassword(charArray7);
        mongoProperties0.uri = "1100001";
        mongoProperties0.uri = "101";
        mongoProperties0.setUsername("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str16 = mongoProperties15.host;
        mongoProperties15.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass19 = mongoProperties15.fieldNamingStrategy;
        java.lang.String str20 = mongoProperties15.getDatabase();
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
        boolean boolean36 = mongoClientOptions30.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties15.builder(mongoClientOptions30);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.connectionsPerHost(180814862);
        java.lang.Class<?> wildcardClass42 = builder41.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass42;
        mongoProperties0.username = "90";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10000 + "'", int34 == 10000);
        org.junit.Assert.assertNotNull(socketFactory35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05346");
        int int2 = java.lang.Integer.max(139, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 139 + "'", int2 == 139);
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05347");
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
        int int35 = mongoClientOptions30.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder39 = builder38.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder42 = builder41.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder44 = builder41.heartbeatSocketTimeout(69);
        boolean boolean45 = mongoClientOptions30.equals((java.lang.Object) builder44);
        com.mongodb.ReadPreference readPreference46 = mongoClientOptions30.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder47 = builder15.readPreference(readPreference46);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 20000 + "'", int35 == 20000);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(readPreference46);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05348");
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
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder37 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxWaitTime((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.host;
        mongoProperties40.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass44 = mongoProperties40.fieldNamingStrategy;
        mongoProperties40.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.getUri();
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        int int53 = mongoClientOptions52.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties47.builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties40.builder(mongoClientOptions52);
        javax.net.SocketFactory socketFactory56 = mongoClientOptions52.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder57 = builder37.socketFactory(socketFactory56);
        com.mongodb.MongoClientOptions.Builder builder58 = builder33.socketFactory(socketFactory56);
        com.mongodb.MongoClientOptions.Builder builder60 = builder33.connectTimeout(9792256);
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
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "mongodb://localhost/test" + "'", str48, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(socketFactory56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05349");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("402653184", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 402653184");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05350");
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
        java.lang.String str18 = mongoProperties0.getDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05351");
        int int2 = java.lang.Integer.sum(13312, 1071000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1071013312 + "'", int2 == 1071013312);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05352");
        java.lang.String str2 = java.lang.Integer.toString((-2147483648), 16487953);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-2147483648" + "'", str2, "-2147483648");
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05353");
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
        char[] charArray42 = mongoProperties0.getPassword();
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
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " #444 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " #444 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , #, 4, 4, 4,  ]");
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05354");
        java.lang.String str2 = java.lang.Integer.toString(11, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11" + "'", str2, "11");
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05355");
        int int2 = java.lang.Integer.rotateLeft((-1577058304), 11264);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1577058304) + "'", int2 == (-1577058304));
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05356");
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
        int int12 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int14 = mongoClientOptions3.getSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05357");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        int int6 = mongoClientOptions5.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions5);
        java.lang.Integer int8 = mongoProperties0.getPort();
        org.springframework.core.env.Environment environment9 = null;
        int int10 = mongoProperties0.determinePort(environment9);
        java.lang.Integer int11 = mongoProperties0.getPort();
        java.lang.String str12 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05358");
        int int1 = java.lang.Integer.highestOneBit(80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05359");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("1100100");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.acceptableLatencyDifference(5);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder12.connectionsPerHost((-1610612735));
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
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05360");
        int int1 = java.lang.Integer.numberOfTrailingZeros(110111100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05361");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        int int4 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int5 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        int int7 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int8 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int9 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        int int10 = mongoClientOptions3.getMinConnectionsPerHost();
        int int11 = mongoClientOptions3.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1342177280 + "'", int10 == 1342177280);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05362");
        int int2 = java.lang.Integer.compareUnsigned((int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05363");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.getHost();
        java.lang.String str10 = mongoProperties0.getUsername();
        mongoProperties0.host = "16000000";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05364");
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
        int int56 = mongoClientOptions38.getThreadsAllowedToBlockForConnectionMultiplier();
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05365");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray3 = null;
        mongoProperties0.password = charArray3;
        java.lang.String str5 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05366");
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
        int int15 = mongoClientOptions9.getMaxWaitTime();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120000 + "'", int15 == 120000);
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05367");
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
        int int17 = mongoClientOptions12.getMinHeartbeatFrequency();
        int int18 = mongoClientOptions12.getMaxConnectionIdleTime();
        com.mongodb.WriteConcern writeConcern19 = mongoClientOptions12.getWriteConcern();
        int int20 = mongoClientOptions12.getMinConnectionsPerHost();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(writeConcern19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1342177280 + "'", int20 == 1342177280);
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05368");
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
        int int12 = mongoClientOptions3.getHeartbeatSocketTimeout();
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
        com.mongodb.WriteConcern writeConcern29 = mongoClientOptions25.getWriteConcern();
        boolean boolean30 = mongoClientOptions3.equals((java.lang.Object) mongoClientOptions25);
        int int31 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        int int32 = mongoClientOptions25.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(writeConcern29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 500 + "'", int31 == 500);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("98bd90");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"98bd90\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05370");
        int int1 = java.lang.Integer.numberOfTrailingZeros(13312);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05371");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.requiredReplicaSetName("c43d9");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.maxWaitTime(100);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.acceptableLatencyDifference(27017);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.requiredReplicaSetName("10010000");
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
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05372");
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
        boolean boolean30 = mongoClientOptions26.isAlwaysUseMBeans();
        int int31 = mongoClientOptions26.getHeartbeatConnectTimeout();
        int int32 = mongoClientOptions26.getMinConnectionsPerHost();
        com.mongodb.DBDecoderFactory dBDecoderFactory33 = mongoClientOptions26.getDbDecoderFactory();
        org.springframework.core.env.Environment environment34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient35 = mongoProperties0.createMongoClient(mongoClientOptions26, environment34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "mongodb://localhost/test" + "'", str22, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 20000 + "'", int31 == 20000);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1342177280 + "'", int32 == 1342177280);
        org.junit.Assert.assertNotNull(dBDecoderFactory33);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05373");
        int int2 = java.lang.Integer.sum(26214400, 11010);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26225410 + "'", int2 == 26225410);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05374");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("41014", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 41014");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05375");
        long long1 = java.lang.Integer.toUnsignedLong((-161061239));
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 4133906057L + "'", long1 == 4133906057L);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05376");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getLocalThreshold();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int10 = mongoClientOptions3.getHeartbeatConnectTimeout();
        java.lang.String str11 = mongoClientOptions3.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05377");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(805306368, 14500645);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "805306368" + "'", str2, "805306368");
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05378");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        boolean boolean2 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setUsername("");
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 65536);
        mongoProperties0.setUsername("11001000011010111100101010010");
        java.lang.Class<?> wildcardClass10 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setPort((java.lang.Integer) 101100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass10);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05379");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        mongoProperties0.gridFsDatabase = "11100100000000000000000000001";
        mongoProperties0.uri = "4764";
        mongoProperties0.authenticationDatabase = "2d5a";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05380");
        int int2 = java.lang.Integer.rotateRight((-2012020736), 100663296);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2012020736) + "'", int2 == (-2012020736));
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05381");
        int int2 = java.lang.Integer.compareUnsigned(6989, 858811187);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05382");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getAcceptableLatencyDifference();
        javax.net.SocketFactory socketFactory7 = mongoClientOptions3.getSocketFactory();
        java.lang.String str8 = mongoClientOptions3.toString();
        int int9 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int10 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(socketFactory7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05383");
        int int1 = java.lang.Integer.highestOneBit(105906176);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05384");
        java.lang.String str1 = java.lang.Integer.toOctalString(16810040);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100070" + "'", str1, "100100070");
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05385");
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
        int int20 = mongoClientOptions14.getHeartbeatConnectRetryFrequency();
        int int21 = mongoClientOptions14.getMinConnectionsPerHost();
        boolean boolean22 = mongoClientOptions14.isAutoConnectRetry();
        int int23 = mongoClientOptions14.getSocketTimeout();
        int int24 = mongoClientOptions14.getSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1342177280 + "'", int21 == 1342177280);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05386");
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
        mongoProperties0.port = 4720000;
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05387");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAlwaysUseMBeans();
        int int5 = mongoClientOptions3.getLocalThreshold();
        int int6 = mongoClientOptions3.getSocketTimeout();
        int int7 = mongoClientOptions3.getAcceptableLatencyDifference();
        int int8 = mongoClientOptions3.getMaxWaitTime();
        int int9 = mongoClientOptions3.getMaxConnectionLifeTime();
        int int10 = mongoClientOptions3.getLocalThreshold();
        int int11 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 120000 + "'", int8 == 120000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05388");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAlwaysUseMBeans();
        int int13 = mongoClientOptions11.getLocalThreshold();
        int int14 = mongoClientOptions11.getSocketTimeout();
        int int15 = mongoClientOptions11.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder17 = builder7.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder20.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder26 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        int int37 = mongoClientOptions36.getMaxConnectionLifeTime();
        int int38 = mongoClientOptions36.getMaxConnectionLifeTime();
        java.lang.String str39 = mongoClientOptions36.getRequiredReplicaSetName();
        java.lang.String str40 = mongoClientOptions36.getRequiredReplicaSetName();
        com.mongodb.ReadPreference readPreference41 = mongoClientOptions36.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory42 = mongoClientOptions36.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder43 = builder25.dbEncoderFactory(dBEncoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder44 = builder17.dbEncoderFactory(dBEncoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatSocketTimeout(16777215);
        java.lang.Class<?> wildcardClass47 = builder46.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(readPreference41);
        org.junit.Assert.assertNotNull(dBEncoderFactory42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05389");
        int int2 = java.lang.Integer.compareUnsigned(14680065, 26225410);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05390");
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
        int int57 = mongoClientOptions38.getMaxConnectionIdleTime();
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05391");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        char[] charArray14 = new char[] { '#', 'a', '#', '4', 'a', ' ' };
        mongoProperties0.password = charArray14;
        mongoProperties0.username = "8001d4bf";
        java.lang.Class<?> wildcardClass18 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.authenticationDatabase = "c43d9";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, 4, a,  ]");
        org.junit.Assert.assertNull(wildcardClass18);
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05392");
        int int2 = java.lang.Integer.compare(9485312, (-1594890685));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05393");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int16 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int17 = mongoClientOptions14.getLocalThreshold();
        int int18 = mongoClientOptions14.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions14.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder8.dbEncoderFactory(dBEncoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder8.socketTimeout(176);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05394");
        int int1 = java.lang.Integer.reverseBytes(1879311872);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 394352 + "'", int1 == 394352);
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05395");
        java.lang.String str2 = java.lang.Integer.toString(385875968, 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "385875968" + "'", str2, "385875968");
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05396");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions12.getMaxConnectionLifeTime();
        int int15 = mongoClientOptions12.getLocalThreshold();
        int int16 = mongoClientOptions12.getLocalThreshold();
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = mongoClientOptions12.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder6.dbEncoderFactory(dBEncoderFactory17);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str20 = mongoProperties19.host;
        mongoProperties19.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass23 = mongoProperties19.fieldNamingStrategy;
        mongoProperties19.port = 97;
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int31 = mongoClientOptions29.getMaxConnectionLifeTime();
        int int32 = mongoClientOptions29.getLocalThreshold();
        int int33 = mongoClientOptions29.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str34 = mongoClientOptions29.getRequiredReplicaSetName();
        javax.net.SocketFactory socketFactory35 = mongoClientOptions29.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties19.builder(mongoClientOptions29);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        int int41 = mongoClientOptions40.getMaxConnectionLifeTime();
        int int42 = mongoClientOptions40.getHeartbeatConnectRetryFrequency();
        com.mongodb.ReadPreference readPreference43 = mongoClientOptions40.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder44 = builder36.readPreference(readPreference43);
        com.mongodb.MongoClientOptions.Builder builder45 = builder6.readPreference(readPreference43);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.description("-2139080703");
        com.mongodb.MongoClientOptions.Builder builder49 = builder45.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertNotNull(dBEncoderFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(socketFactory35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 500 + "'", int42 == 500);
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05397");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int6 = mongoProperties0.port;
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05398");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionIdleTime(32);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.build();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder10.heartbeatFrequency((-1417281280));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
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
        org.junit.Assert.assertNotNull(mongoClientOptions13);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05399");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        boolean boolean10 = mongoClientOptions9.isCursorFinalizerEnabled();
        int int11 = mongoClientOptions9.getMaxConnectionIdleTime();
        int int12 = mongoClientOptions9.getMinConnectionsPerHost();
        int int13 = mongoClientOptions9.getSocketTimeout();
        com.mongodb.ReadPreference readPreference14 = mongoClientOptions9.getReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(readPreference14);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05400");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        com.mongodb.MongoClientOptions.Builder builder6 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        com.mongodb.MongoClientOptions.Builder builder12 = mongoProperties0.builder(mongoClientOptions11);
        java.lang.String str13 = mongoProperties0.getDatabase();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05401");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.maxConnectionIdleTime(16);
        java.lang.Class<?> wildcardClass12 = builder11.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05402");
        int int2 = java.lang.Integer.compare(1048576, 420313426);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05403");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        mongoProperties0.setPort((java.lang.Integer) 27017);
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        boolean boolean12 = mongoClientOptions10.equals((java.lang.Object) (-2147483648));
        int int13 = mongoClientOptions10.getHeartbeatThreadCount();
        com.mongodb.DBDecoderFactory dBDecoderFactory14 = mongoClientOptions10.getDbDecoderFactory();
        int int15 = mongoClientOptions10.getHeartbeatConnectRetryFrequency();
        int int16 = mongoClientOptions10.getHeartbeatFrequency();
        boolean boolean17 = mongoClientOptions10.isSocketKeepAlive();
        int int18 = mongoClientOptions10.getConnectTimeout();
        boolean boolean19 = mongoClientOptions10.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties0.builder(mongoClientOptions10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dBDecoderFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5000 + "'", int16 == 5000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05404");
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
        java.lang.String str19 = mongoProperties0.authenticationDatabase;
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05405");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "1100001";
        char[] charArray6 = mongoProperties0.getPassword();
        char[] charArray7 = mongoProperties0.password;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05406");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getLocalThreshold();
        javax.net.SocketFactory socketFactory7 = mongoClientOptions3.getSocketFactory();
        int int8 = mongoClientOptions3.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertNotNull(socketFactory7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05407");
        java.lang.String str1 = java.lang.Integer.toString(1071013312);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1071013312" + "'", str1, "1071013312");
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05408");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.autoConnectRetry(true);
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
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05409");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        boolean boolean12 = mongoClientOptions11.isAlwaysUseMBeans();
        int int13 = mongoClientOptions11.getLocalThreshold();
        int int14 = mongoClientOptions11.getSocketTimeout();
        int int15 = mongoClientOptions11.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions11.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder17 = builder7.writeConcern(writeConcern16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder20.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder26 = builder25.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder31 = builder27.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.threadsAllowedToBlockForConnectionMultiplier(1100001);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        int int37 = mongoClientOptions36.getMaxConnectionLifeTime();
        int int38 = mongoClientOptions36.getMaxConnectionLifeTime();
        java.lang.String str39 = mongoClientOptions36.getRequiredReplicaSetName();
        java.lang.String str40 = mongoClientOptions36.getRequiredReplicaSetName();
        com.mongodb.ReadPreference readPreference41 = mongoClientOptions36.getReadPreference();
        com.mongodb.DBEncoderFactory dBEncoderFactory42 = mongoClientOptions36.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder43 = builder25.dbEncoderFactory(dBEncoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder44 = builder17.dbEncoderFactory(dBEncoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatSocketTimeout(16777215);
        com.mongodb.MongoClientOptions.Builder builder48 = builder44.maxWaitTime(916455424);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(readPreference41);
        org.junit.Assert.assertNotNull(dBEncoderFactory42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05410");
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
        long long28 = mongoClientOptions18.getMaxAutoConnectRetryTime();
        int int29 = mongoClientOptions18.getMinHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 500 + "'", int29 == 500);
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05411");
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
        java.lang.String str15 = mongoProperties0.getGridFsDatabase();
        java.lang.String str16 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.gridFsDatabase = "a036";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "803801" + "'", str15, "803801");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05412");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.acceptableLatencyDifference(80803801);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.heartbeatSocketTimeout(162);
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
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05413");
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
        boolean boolean11 = mongoClientOptions3.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(writeConcern8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05414");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatConnectRetryFrequency(10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatSocketTimeout(67108864);
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder25 = builder17.maxAutoConnectRetryTime((long) 25);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.threadsAllowedToBlockForConnectionMultiplier((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder30 = builder29.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder31 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder33.build();
        com.mongodb.MongoClientOptions.Builder builder38 = builder33.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder40 = builder33.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.socketTimeout((int) (short) 100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties43 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int44 = mongoProperties43.getDEFAULT_PORT();
        mongoProperties43.setHost("hi!");
        mongoProperties43.host = "";
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        java.lang.String str53 = mongoClientOptions52.toString();
        int int54 = mongoClientOptions52.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties43.builder(mongoClientOptions52);
        int int56 = mongoClientOptions52.getConnectTimeout();
        javax.net.SocketFactory socketFactory57 = mongoClientOptions52.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder58 = builder40.socketFactory(socketFactory57);
        com.mongodb.MongoClientOptions.Builder builder60 = builder58.connectionsPerHost(8402945);
        com.mongodb.MongoClientOptions.Builder builder61 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions66 = builder63.build();
        com.mongodb.MongoClientOptions.Builder builder68 = builder63.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder71 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder73 = builder71.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions74 = builder71.build();
        boolean boolean75 = mongoClientOptions74.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory76 = mongoClientOptions74.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder77 = builder70.dbEncoderFactory(dBEncoderFactory76);
        com.mongodb.MongoClientOptions.Builder builder78 = builder58.dbEncoderFactory(dBEncoderFactory76);
        com.mongodb.MongoClientOptions.Builder builder79 = builder29.dbEncoderFactory(dBEncoderFactory76);
        com.mongodb.MongoClientOptions.Builder builder80 = builder12.dbEncoderFactory(dBEncoderFactory76);
        java.lang.Class<?> wildcardClass81 = dBEncoderFactory76.getClass();
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
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoClientOptions36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 27017 + "'", int44 == 27017);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 20000 + "'", int54 == 20000);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10000 + "'", int56 == 10000);
        org.junit.Assert.assertNotNull(socketFactory57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(mongoClientOptions66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(mongoClientOptions74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05415");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1744830464", 1981743104);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1981743104 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05416");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.host = "";
        mongoProperties0.username = "100";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.gridFsDatabase = "hi!";
        char[] charArray16 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties9.setPassword(charArray16);
        mongoProperties8.setPassword(charArray16);
        mongoProperties0.setPassword(charArray16);
        java.lang.String str20 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        java.lang.String str25 = mongoClientOptions24.toString();
        int int26 = mongoClientOptions24.getMaxWaitTime();
        int int27 = mongoClientOptions24.getMaxWaitTime();
        int int28 = mongoClientOptions24.getLocalThreshold();
        long long29 = mongoClientOptions24.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties0.builder(mongoClientOptions24);
        mongoProperties0.username = "1";
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 120000 + "'", int26 == 120000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 120000 + "'", int27 == 120000);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05417");
        int int2 = java.lang.Integer.rotateLeft(376832, 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 376832 + "'", int2 == 376832);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05418");
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
        boolean boolean19 = mongoProperties0.hasCustomAddress();
        java.lang.String str20 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        boolean boolean25 = mongoClientOptions24.isAlwaysUseMBeans();
        int int26 = mongoClientOptions24.getLocalThreshold();
        int int27 = mongoClientOptions24.getSocketTimeout();
        int int28 = mongoClientOptions24.getConnectTimeout();
        javax.net.SocketFactory socketFactory29 = mongoClientOptions24.getSocketFactory();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient30 = mongoProperties0.createMongoClient(mongoClientOptions24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10000 + "'", int28 == 10000);
        org.junit.Assert.assertNotNull(socketFactory29);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05419");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder3 = builder2.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder5.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("2");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime(4000000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder6.threadsAllowedToBlockForConnectionMultiplier((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05420");
        long long1 = java.lang.Integer.toUnsignedLong(17);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 17L + "'", long1 == 17L);
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05421");
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
        boolean boolean26 = mongoProperties0.hasCustomAddress();
        java.lang.Class<?> wildcardClass27 = mongoProperties0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05422");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.username;
        mongoProperties0.uri = "";
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setGridFsDatabase("65536");
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
        java.lang.String str31 = mongoClientOptions25.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05423");
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
        java.lang.String str25 = mongoProperties0.getUsername();
        java.lang.String str26 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        int int31 = mongoClientOptions30.getMaxConnectionLifeTime();
        int int32 = mongoClientOptions30.getMaxConnectionLifeTime();
        int int33 = mongoClientOptions30.getLocalThreshold();
        int int34 = mongoClientOptions30.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str35 = mongoClientOptions30.getRequiredReplicaSetName();
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder39 = builder38.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder43 = builder39.heartbeatSocketTimeout(1100001);
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        boolean boolean48 = mongoClientOptions47.isAlwaysUseMBeans();
        int int49 = mongoClientOptions47.getLocalThreshold();
        int int50 = mongoClientOptions47.getSocketTimeout();
        int int51 = mongoClientOptions47.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern52 = mongoClientOptions47.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder53 = builder43.writeConcern(writeConcern52);
        boolean boolean54 = mongoClientOptions30.equals((java.lang.Object) builder53);
        int int55 = mongoClientOptions30.getThreadsAllowedToBlockForConnectionMultiplier();
        int int56 = mongoClientOptions30.getMaxConnectionLifeTime();
        org.springframework.core.env.Environment environment57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient58 = mongoProperties0.createMongoClient(mongoClientOptions30, environment57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb://localhost/test" + "'", str26, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 15 + "'", int33 == 15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(writeConcern52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 5 + "'", int55 == 5);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05424");
        int int1 = java.lang.Integer.reverseBytes(16487953);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 295107328 + "'", int1 == 295107328);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05425");
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
        int int38 = mongoClientOptions31.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean39 = mongoClientOptions31.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 5 + "'", int38 == 5);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05426");
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
        int int17 = mongoClientOptions9.getMaxConnectionIdleTime();
        int int18 = mongoClientOptions9.getConnectTimeout();
        int int19 = mongoClientOptions9.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str20 = mongoClientOptions9.getDescription();
        int int21 = mongoClientOptions9.getHeartbeatSocketTimeout();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10000 + "'", int18 == 10000);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 20000 + "'", int21 == 20000);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05427");
        int int1 = java.lang.Integer.numberOfTrailingZeros(6250);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05428");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 738197504);
        java.lang.String str8 = mongoProperties0.getMongoClientDatabase();
        boolean boolean9 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05429");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("2147483647", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2147483647");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05430");
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
        char[] charArray16 = mongoProperties0.password;
        mongoProperties0.setUri("37");
        mongoProperties0.setDatabase("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(charArray16);
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05431");
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder22.heartbeatConnectRetryFrequency(8388608);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.description("100663296");
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
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05432");
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
        int int28 = mongoClientOptions26.getHeartbeatThreadCount();
        int int29 = mongoClientOptions26.getHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5000 + "'", int29 == 5000);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05433");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("");
        mongoProperties0.uri = "11i71";
        mongoProperties0.host = "101";
        java.lang.String str9 = mongoProperties0.database;
        java.lang.String str10 = mongoProperties0.uri;
        java.lang.String str11 = mongoProperties0.uri;
        mongoProperties0.setHost("4e20");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "11i71" + "'", str10, "11i71");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11i71" + "'", str11, "11i71");
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05434");
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
        com.mongodb.MongoClientOptions.Builder builder32 = builder25.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder34 = builder25.threadsAllowedToBlockForConnectionMultiplier(150994944);
        com.mongodb.MongoClientOptions.Builder builder36 = builder25.connectionsPerHost(7050496);
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
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05435");
        int int1 = java.lang.Integer.parseUnsignedInt("298319873");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 298319873 + "'", int1 == 298319873);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05436");
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
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.maxConnectionLifeTime(72);
        com.mongodb.MongoClientOptions.Builder builder38 = builder34.requiredReplicaSetName("12");
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.connectionsPerHost(6989);
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
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05437");
        int int2 = java.lang.Integer.min(402767888, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05438");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions3.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(writeConcern10);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05439");
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
        java.lang.String str25 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("162010");
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
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05440");
        int int2 = java.lang.Integer.compareUnsigned((int) (short) -1, 32768);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05441");
        java.lang.String str1 = java.lang.Integer.toHexString(10000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2710" + "'", str1, "2710");
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05442");
        int int1 = java.lang.Integer.bitCount(1075773440);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05443");
        int int2 = java.lang.Integer.min((-1962934272), 88130000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1962934272) + "'", int2 == (-1962934272));
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("29188");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 29188");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05445");
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
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.acceptableLatencyDifference((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder41 = builder35.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder43 = builder35.maxWaitTime((-1033373947));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05446");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("40", 792740645);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 792740645 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05447");
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
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.heartbeatFrequency(939589760);
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
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05448");
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
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.localThreshold(27017);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.localThreshold(1);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        com.mongodb.MongoClientOptions.Builder builder31 = builder26.socketTimeout((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.acceptableLatencyDifference(500);
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        boolean boolean38 = mongoClientOptions37.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions37.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder33.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder23.dbEncoderFactory(dBEncoderFactory39);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder41.build();
        boolean boolean43 = mongoClientOptions42.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05449");
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
        java.lang.String str20 = mongoProperties0.host;
        char[] charArray21 = new char[] {};
        mongoProperties0.password = charArray21;
        mongoProperties0.setPort((java.lang.Integer) 94000001);
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
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[]");
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05450");
        int int2 = java.lang.Integer.divideUnsigned(640, (-2023194737));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05451");
        java.lang.Integer int1 = java.lang.Integer.getInteger("1dbfac01");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05452");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        java.lang.String str4 = mongoProperties0.getUri();
        mongoProperties0.database = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        java.lang.String str10 = mongoProperties0.getDatabase();
        java.lang.String str11 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "mongodb://localhost/test" + "'", str10, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05453");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1677721600, 92274688);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1677721600" + "'", str2, "1677721600");
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05454");
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
        javax.net.SocketFactory socketFactory36 = mongoClientOptions31.getSocketFactory();
        int int37 = mongoClientOptions31.getSocketTimeout();
        boolean boolean38 = mongoClientOptions31.isAlwaysUseMBeans();
        int int39 = mongoClientOptions31.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions31);
        java.lang.String str41 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 27017 + "'", int23 == 27017);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 20000 + "'", int33 == 20000);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10000 + "'", int35 == 10000);
        org.junit.Assert.assertNotNull(socketFactory36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 20000 + "'", int39 == 20000);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05455");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        java.lang.String str4 = mongoClientOptions3.toString();
        int int5 = mongoClientOptions3.getMaxWaitTime();
        int int6 = mongoClientOptions3.getMaxWaitTime();
        int int7 = mongoClientOptions3.getLocalThreshold();
        java.lang.String str8 = mongoClientOptions3.getRequiredReplicaSetName();
        int int9 = mongoClientOptions3.getHeartbeatThreadCount();
        javax.net.SocketFactory socketFactory10 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 120000 + "'", int5 == 120000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 120000 + "'", int6 == 120000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(socketFactory10);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05456");
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
        mongoProperties0.setDatabase("-804206260");
        java.lang.String str16 = mongoProperties0.host;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("10001000000100110000000010000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10001000000100110000000010000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05458");
        int int1 = java.lang.Integer.numberOfLeadingZeros(37289984);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05459");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectTimeout(2);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder0.build();
        int int6 = mongoClientOptions5.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05460");
        java.lang.String str2 = java.lang.Integer.toString(352256, 1664);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "352256" + "'", str2, "352256");
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05461");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int1 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setHost("hi!");
        mongoProperties0.setDatabase("1100001");
        java.lang.String str6 = mongoProperties0.host;
        mongoProperties0.port = 100059;
        mongoProperties0.port = 17877217;
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05462");
        int int1 = java.lang.Integer.signum((-1610612735));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05463");
        int int1 = java.lang.Integer.parseInt("45");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 45 + "'", int1 == 45);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05464");
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
        java.lang.String str11 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass12 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setPort((java.lang.Integer) 469763033);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(wildcardClass12);
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05465");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(6144);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "6144" + "'", str1, "6144");
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05466");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10462210000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05467");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean5 = mongoClientOptions3.equals((java.lang.Object) (-2147483648));
        java.lang.String str6 = mongoClientOptions3.getRequiredReplicaSetName();
        int int7 = mongoClientOptions3.getLocalThreshold();
        int int8 = mongoClientOptions3.getHeartbeatConnectTimeout();
        int int9 = mongoClientOptions3.getHeartbeatSocketTimeout();
        int int10 = mongoClientOptions3.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20000 + "'", int9 == 20000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05468");
        int int2 = java.lang.Integer.sum(262144, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262144 + "'", int2 == 262144);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05469");
        int int2 = java.lang.Integer.min(4096, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05470");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str5 = mongoProperties0.getDatabase();
        mongoProperties0.setPort((java.lang.Integer) 738197504);
        char[] charArray8 = mongoProperties0.password;
        mongoProperties0.authenticationDatabase = "11001000011010111100101010010";
        java.lang.String str11 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05471");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("2");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxConnectionLifeTime(578813952);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05472");
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
        javax.net.SocketFactory socketFactory54 = mongoClientOptions38.getSocketFactory();
        java.lang.String str55 = mongoClientOptions38.getRequiredReplicaSetName();
        java.lang.Class<?> wildcardClass56 = mongoClientOptions38.getClass();
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
        org.junit.Assert.assertNotNull(socketFactory54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05473");
        java.lang.Integer int1 = java.lang.Integer.getInteger("600000000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05474");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        java.lang.String str2 = mongoProperties0.host;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.setDatabase("1100001");
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setUri("2");
        java.lang.String str10 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setAuthenticationDatabase("1a");
        java.lang.String str13 = mongoProperties0.authenticationDatabase;
        java.lang.String str14 = mongoProperties0.database;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a" + "'", str13, "1a");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1100001" + "'", str14, "1100001");
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05475");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions3.getDbEncoderFactory();
        boolean boolean12 = mongoClientOptions3.isCursorFinalizerEnabled();
        boolean boolean13 = mongoClientOptions3.isCursorFinalizerEnabled();
        javax.net.SocketFactory socketFactory14 = mongoClientOptions3.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(socketFactory9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(socketFactory14);
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05476");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.getUri();
        char[] charArray2 = mongoProperties0.password;
        char[] charArray3 = mongoProperties0.password;
        java.lang.String str4 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str5 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass6 = mongoProperties0.fieldNamingStrategy;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        java.lang.String str11 = mongoClientOptions10.toString();
        int int12 = mongoClientOptions10.getHeartbeatFrequency();
        int int13 = mongoClientOptions10.getMinConnectionsPerHost();
        int int14 = mongoClientOptions10.getMaxConnectionIdleTime();
        int int15 = mongoClientOptions10.getHeartbeatThreadCount();
        org.springframework.core.env.Environment environment16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient17 = mongoProperties0.createMongoClient(mongoClientOptions10, environment16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: maxSize >= minSize");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb://localhost/test" + "'", str1, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "test" + "'", str4, "test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5000 + "'", int12 == 5000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1342177280 + "'", int13 == 1342177280);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05477");
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
        mongoProperties0.username = "1000";
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
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05478");
        int int1 = java.lang.Integer.numberOfTrailingZeros(756);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05479");
        int int2 = java.lang.Integer.min(61000000, 803801);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 803801 + "'", int2 == 803801);
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05480");
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
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.threadsAllowedToBlockForConnectionMultiplier(12);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.host;
        mongoProperties28.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass32 = mongoProperties28.fieldNamingStrategy;
        java.lang.String str33 = mongoProperties28.getDatabase();
        boolean boolean34 = mongoProperties28.hasCustomCredentials();
        java.lang.String str35 = mongoProperties28.username;
        java.lang.String str36 = mongoProperties28.database;
        java.lang.String str37 = mongoProperties28.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str39 = mongoProperties38.getUri();
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions43 = builder40.build();
        int int44 = mongoClientOptions43.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder45 = mongoProperties38.builder(mongoClientOptions43);
        int int46 = mongoClientOptions43.getMaxConnectionIdleTime();
        int int47 = mongoClientOptions43.getMinHeartbeatFrequency();
        int int48 = mongoClientOptions43.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties28.builder(mongoClientOptions43);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties50 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str51 = mongoProperties50.host;
        java.lang.String str52 = mongoProperties50.host;
        java.lang.Integer int53 = mongoProperties50.getPort();
        com.mongodb.MongoClientOptions.Builder builder54 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder56 = builder54.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions57 = builder54.build();
        boolean boolean59 = mongoClientOptions57.equals((java.lang.Object) (-2147483648));
        com.mongodb.MongoClientOptions.Builder builder60 = mongoProperties50.builder(mongoClientOptions57);
        int int61 = mongoClientOptions57.getThreadsAllowedToBlockForConnectionMultiplier();
        int int62 = mongoClientOptions57.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern63 = mongoClientOptions57.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder64 = builder49.writeConcern(writeConcern63);
        com.mongodb.MongoClientOptions.Builder builder65 = builder27.writeConcern(writeConcern63);
        com.mongodb.MongoClientOptions.Builder builder67 = builder27.connectionsPerHost(11010);
        com.mongodb.MongoClientOptions.Builder builder69 = builder67.heartbeatFrequency(436207638);
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
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "mongodb://localhost/test" + "'", str39, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(mongoClientOptions43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 500 + "'", int47 == 500);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(int53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(mongoClientOptions57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 5 + "'", int61 == 5);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 120000 + "'", int62 == 120000);
        org.junit.Assert.assertNotNull(writeConcern63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05481");
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
        mongoProperties0.setPort((java.lang.Integer) 32);
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
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05482");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("28", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 28");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05483");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.build();
        boolean boolean4 = mongoClientOptions3.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory5 = mongoClientOptions3.getDbEncoderFactory();
        int int6 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        boolean boolean7 = mongoClientOptions3.isSocketKeepAlive();
        int int8 = mongoClientOptions3.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 500 + "'", int6 == 500);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05484");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "hi!";
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        boolean boolean5 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.uri = "149159936";
        java.lang.String str8 = mongoProperties0.username;
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
        com.mongodb.MongoClientOptions.Builder builder32 = mongoProperties0.builder(mongoClientOptions21);
        mongoProperties0.setPort((java.lang.Integer) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
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
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05485");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("32768000", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 32768000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05486");
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
        com.mongodb.MongoClientOptions.Builder builder34 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder37 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxWaitTime((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.host;
        mongoProperties40.authenticationDatabase = "hi!";
        java.lang.Class<?> wildcardClass44 = mongoProperties40.fieldNamingStrategy;
        mongoProperties40.port = 97;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties47 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str48 = mongoProperties47.getUri();
        com.mongodb.MongoClientOptions.Builder builder49 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions52 = builder49.build();
        int int53 = mongoClientOptions52.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder54 = mongoProperties47.builder(mongoClientOptions52);
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties40.builder(mongoClientOptions52);
        javax.net.SocketFactory socketFactory56 = mongoClientOptions52.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder57 = builder37.socketFactory(socketFactory56);
        com.mongodb.MongoClientOptions.Builder builder58 = builder33.socketFactory(socketFactory56);
        com.mongodb.MongoClientOptions.Builder builder60 = builder33.maxConnectionIdleTime(6);
        com.mongodb.MongoClientOptions.Builder builder62 = builder33.minConnectionsPerHost(10010000);
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
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(wildcardClass44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "mongodb://localhost/test" + "'", str48, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(mongoClientOptions52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(socketFactory56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05487");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.localThreshold(738197504);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxConnectionLifeTime(120000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionIdleTime(1342177280);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.maxAutoConnectRetryTime((long) 11610);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        boolean boolean20 = mongoClientOptions19.isCursorFinalizerEnabled();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05488");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.host;
        org.springframework.core.env.Environment environment2 = null;
        int int3 = mongoProperties0.determinePort(environment2);
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = 10000;
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        char[] charArray8 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties9.setHost("");
        mongoProperties9.username = "100";
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold(27017);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        mongoProperties9.fieldNamingStrategy = wildcardClass17;
        mongoProperties9.setGridFsDatabase("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int22 = mongoProperties21.getDEFAULT_PORT();
        mongoProperties21.setHost("hi!");
        mongoProperties21.host = "";
        mongoProperties21.username = "100";
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        boolean boolean33 = mongoClientOptions32.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory34 = mongoClientOptions32.getDbDecoderFactory();
        int int35 = mongoClientOptions32.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties21.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties9.builder(mongoClientOptions32);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int39 = mongoProperties38.getDEFAULT_PORT();
        mongoProperties38.setHost("hi!");
        mongoProperties38.host = "";
        mongoProperties38.username = "100";
        char[] charArray52 = new char[] { '#', 'a', '#', '4', 'a', ' ' };
        mongoProperties38.password = charArray52;
        mongoProperties9.setPassword(charArray52);
        mongoProperties0.setPassword(charArray52);
        mongoProperties0.setAuthenticationDatabase("578813952");
        java.lang.String str58 = mongoProperties0.username;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27017 + "'", int3 == 27017);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27017 + "'", int22 == 27017);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 15 + "'", int35 == 15);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27017 + "'", int39 == 27017);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "#a#4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "#a#4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, a, #, 4, a,  ]");
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05489");
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
        boolean boolean16 = mongoClientOptions9.isAutoConnectRetry();
        int int17 = mongoClientOptions9.getMaxConnectionIdleTime();
        int int18 = mongoClientOptions9.getHeartbeatFrequency();
        java.lang.String str19 = mongoClientOptions9.getDescription();
        int int20 = mongoClientOptions9.getHeartbeatThreadCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertNotNull(socketFactory14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5000 + "'", int18 == 5000);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05490");
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
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        int int25 = mongoProperties24.getDEFAULT_PORT();
        mongoProperties24.setHost("hi!");
        mongoProperties24.host = "";
        char[] charArray30 = mongoProperties24.getPassword();
        mongoProperties24.setGridFsDatabase("7fffffff");
        java.lang.String str33 = mongoProperties24.getGridFsDatabase();
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
        int int50 = mongoClientOptions46.getConnectionsPerHost();
        com.mongodb.WriteConcern writeConcern51 = mongoClientOptions46.getWriteConcern();
        int int52 = mongoClientOptions46.getLocalThreshold();
        com.mongodb.ReadPreference readPreference53 = mongoClientOptions46.getReadPreference();
        long long54 = mongoClientOptions46.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder55 = mongoProperties24.builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder56 = mongoProperties0.builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions mongoClientOptions60 = builder57.build();
        java.lang.String str61 = mongoClientOptions60.toString();
        int int62 = mongoClientOptions60.getMaxWaitTime();
        int int63 = mongoClientOptions60.getLocalThreshold();
        int int64 = mongoClientOptions60.getHeartbeatConnectRetryFrequency();
        org.springframework.core.env.Environment environment65 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient66 = mongoProperties0.createMongoClient(mongoClientOptions60, environment65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1100001" + "'", str10, "1100001");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[\000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 27017 + "'", int25 == 27017);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "7fffffff" + "'", str33, "7fffffff");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(wildcardClass38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "mongodb://localhost/test" + "'", str42, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertNotNull(writeConcern51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 15 + "'", int52 == 15);
        org.junit.Assert.assertNotNull(readPreference53);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 0L + "'", long54 == 0L);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 120000 + "'", int62 == 120000);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 15 + "'", int63 == 15);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 500 + "'", int64 == 500);
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05491");
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
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.minConnectionsPerHost(1342177280);
        com.mongodb.MongoClientOptions.Builder builder28 = builder24.heartbeatThreadCount(97);
        com.mongodb.MongoClientOptions.Builder builder30 = builder24.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.connectionsPerHost(11);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.alwaysUseMBeans(false);
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
        com.mongodb.WriteConcern writeConcern51 = mongoClientOptions47.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder52 = builder34.writeConcern(writeConcern51);
        com.mongodb.MongoClientOptions.Builder builder53 = builder23.writeConcern(writeConcern51);
        com.mongodb.MongoClientOptions.Builder builder55 = builder23.connectionsPerHost(132);
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
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "mongodb://localhost/test" + "'", str43, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(writeConcern51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05492");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1100100000000000000000000", 1154027520);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1154027520 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05493");
        java.lang.String str1 = java.lang.Integer.toOctalString(22);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "26" + "'", str1, "26");
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05494");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder26 = builder24.heartbeatSocketTimeout((-1073741824));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05495");
        int int1 = java.lang.Integer.numberOfTrailingZeros(536);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05496");
        int int1 = java.lang.Integer.bitCount(469762048);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05497");
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
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.heartbeatConnectRetryFrequency(58376);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.requiredReplicaSetName("11101101111111010110000000001");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder26 = builder24.maxWaitTime((-1417281280));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05498");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties1 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties1.gridFsDatabase = "hi!";
        char[] charArray8 = new char[] { 'a', 'a', '#', '4' };
        mongoProperties1.setPassword(charArray8);
        mongoProperties0.setPassword(charArray8);
        java.lang.String str11 = mongoProperties0.getHost();
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.uri = "11610";
        mongoProperties0.setAuthenticationDatabase("500");
        mongoProperties0.setHost("100000000000000000000000000");
        mongoProperties0.setGridFsDatabase("7fffffff");
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa#4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, 4]");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05499");
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
        int int18 = mongoClientOptions11.getThreadsAllowedToBlockForConnectionMultiplier();
        int int19 = mongoClientOptions11.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test05500");
        int int1 = java.lang.Integer.bitCount(14152);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }
}

