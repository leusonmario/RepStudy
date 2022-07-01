import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
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
        com.mongodb.MongoClientOptions.Builder builder47 = builder8.socketKeepAlive(true);
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
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        int int2 = java.lang.Integer.compareUnsigned(24, 120000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(27017);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "27017" + "'", str1, "27017");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        int int2 = java.lang.Integer.compare(100011, (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        int int1 = java.lang.Integer.highestOneBit(15);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        int int2 = java.lang.Integer.max(33554432, 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33554432 + "'", int2 == 33554432);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("61a800");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"61a800\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        int int1 = java.lang.Integer.lowestOneBit(947912712);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        java.lang.String str2 = java.lang.Integer.toString(64, 167772160);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "64" + "'", str2, "64");
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        int int2 = java.lang.Integer.compare(100011, 10000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("1111111111111111111111111111111");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1111111111111111111111111111111\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        int int1 = java.lang.Integer.numberOfTrailingZeros(558701952);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("35");
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.socketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatSocketTimeout(15);
        com.mongodb.event.CommandListener commandListener12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder9.addCommandListener(commandListener12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
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
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
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
            com.mongodb.MongoClientOptions.Builder builder14 = builder10.addCommandListener(commandListener13);
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
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.lang.String str2 = java.lang.Integer.toString(1024, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1024" + "'", str2, "1024");
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold(16);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.connectTimeout(104857600);
        com.mongodb.WriteConcern writeConcern15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.writeConcern(writeConcern15);
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
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        int int1 = java.lang.Integer.parseUnsignedInt("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.lang.String str2 = java.lang.Integer.toString(78528512, 1261534);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "78528512" + "'", str2, "78528512");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        int int2 = java.lang.Integer.divideUnsigned(0, 16384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        int int2 = java.lang.Integer.max((-536870913), 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        int int1 = java.lang.Integer.lowestOneBit(22930800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        int int2 = java.lang.Integer.rotateLeft(12, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        int int1 = java.lang.Integer.lowestOneBit((-2147483644));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) '#');
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        int int1 = java.lang.Integer.bitCount(83886080);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        int int2 = java.lang.Integer.max(110100, (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110100 + "'", int2 == 110100);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str9 = mongoClientOptions6.getRequiredReplicaSetName();
        int int10 = mongoClientOptions6.getHeartbeatFrequency();
        com.mongodb.ReadConcern readConcern11 = mongoClientOptions6.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder12 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        com.mongodb.event.CommandListener commandListener13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.addCommandListener(commandListener13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertNotNull(readConcern11);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("10c944");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10c944\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(22930800);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "22930800" + "'", str1, "22930800");
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        int int1 = java.lang.Integer.reverse(17459436);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 924209280 + "'", int1 == 924209280);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        int int2 = java.lang.Integer.compareUnsigned(167772160, 167772160);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setPort((java.lang.Integer) 16);
        java.lang.String str9 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        int int2 = java.lang.Integer.parseInt("100011", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45435459 + "'", int2 == 45435459);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        int int1 = java.lang.Integer.parseUnsignedInt("64");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder43 = builder40.minConnectionsPerHost((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: minConnectionsPerHost must be >= 0");
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
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.maxConnectionLifeTime(1);
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        boolean boolean21 = mongoClientOptions20.isCursorFinalizerEnabled();
        int int22 = mongoClientOptions20.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions20.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = builder14.writeConcern(writeConcern23);
        com.mongodb.MongoClientOptions.Builder builder25 = builder0.writeConcern(writeConcern23);
        com.mongodb.event.CommandListener commandListener26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder27 = builder25.addCommandListener(commandListener26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
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
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.connectionsPerHost(35);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost(110100);
        com.mongodb.event.CommandListener commandListener20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder19.addCommandListener(commandListener20);
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        int int2 = java.lang.Integer.min((int) 'a', (-2147483648));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147483648) + "'", int2 == (-2147483648));
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        int int2 = java.lang.Integer.remainderUnsigned(16, 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-2147483644));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        java.lang.String str1 = java.lang.Integer.toBinaryString(26);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11010" + "'", str1, "11010");
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.description("test");
        com.mongodb.event.CommandListener commandListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.addCommandListener(commandListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
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
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseInt("2147510664");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147510664\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("30000", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 30000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1261534, 436207616);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1261534" + "'", str2, "1261534");
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.requiredReplicaSetName("-1");
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        java.lang.String str1 = java.lang.Integer.toString(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        long long1 = java.lang.Integer.toUnsignedLong(1100100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1100100L + "'", long1 == 1100100L);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        java.lang.String str1 = java.lang.Integer.toBinaryString(500);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111110100" + "'", str1, "111110100");
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        java.lang.String str1 = java.lang.Integer.toString(26);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "26" + "'", str1, "26");
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        java.lang.String str1 = java.lang.Integer.toBinaryString(32);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100000" + "'", str1, "100000");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder25 = builder2.connectionsPerHost((-2147456632));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectionPerHost must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder11.build();
        boolean boolean13 = mongoClientOptions12.isCursorFinalizerEnabled();
        int int14 = mongoClientOptions12.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern15 = mongoClientOptions12.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList16 = mongoClientOptions12.getCommandListeners();
        org.bson.codecs.configuration.CodecRegistry codecRegistry17 = mongoClientOptions12.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatFrequency(123);
        com.mongodb.MongoClientOptions.Builder builder21 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        int int23 = mongoClientOptions22.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory24 = mongoClientOptions22.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder20.dbEncoderFactory(dBEncoderFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = builder10.dbEncoderFactory(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertNotNull(writeConcern15);
        org.junit.Assert.assertNotNull(commandListenerList16);
        org.junit.Assert.assertNotNull(codecRegistry17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20000 + "'", int23 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        mongoProperties0.authenticationDatabase = "-1";
        mongoProperties0.setUsername("");
        java.lang.String str16 = mongoProperties0.username;
        mongoProperties0.username = "";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("61a800", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 61a800");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
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
        boolean boolean38 = mongoClientOptions28.isAlwaysUseMBeans();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList2 = mongoClientOptions1.getCommandListeners();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder3.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder13 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean15 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int16 = mongoClientOptions14.getHeartbeatConnectTimeout();
        int int17 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions14.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder19 = builder8.readPreference(readPreference18);
        boolean boolean20 = mongoClientOptions1.equals((java.lang.Object) builder19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(commandListenerList2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        int int2 = java.lang.Integer.rotateLeft(1100100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1100100 + "'", int2 == 1100100);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
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
        com.mongodb.event.CommandListener commandListener39 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder40 = builder38.addCommandListener(commandListener39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
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
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        int int2 = java.lang.Integer.divideUnsigned(67108864, 436207616);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        int int2 = java.lang.Integer.divideUnsigned(25600, (-536870913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
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
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.socketKeepAlive(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("1");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        int int1 = java.lang.Integer.reverseBytes((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1677721600 + "'", int1 == 1677721600);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        int int2 = java.lang.Integer.max(65536, 436207616);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 436207616 + "'", int2 == 436207616);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("16", 25600);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 25600 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1024);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        int int2 = java.lang.Integer.compareUnsigned(2, 6400000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-2147483648));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 31 + "'", int1 == 31);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
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
        int int13 = mongoClientOptions10.getMaxConnectionIdleTime();
        int int14 = mongoClientOptions10.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        int int1 = java.lang.Integer.reverse(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
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
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        boolean boolean14 = mongoClientOptions10.isSslEnabled();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("1", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 1");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
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
        com.mongodb.event.CommandListener commandListener11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.addCommandListener(commandListener11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
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
        boolean boolean35 = mongoClientOptions28.isSslEnabled();
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
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        int int2 = java.lang.Integer.rotateLeft(2147483647, (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        int int2 = java.lang.Integer.compare(947912705, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        int int7 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int8 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        int int9 = mongoClientOptions6.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 500 + "'", int7 == 500);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.sslEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.requiredReplicaSetName("16");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionIdleTime(3);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.requiredReplicaSetName("97");
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
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        int int2 = java.lang.Integer.compareUnsigned((-2147456632), 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        int int1 = java.lang.Integer.reverseBytes(6400000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11034880 + "'", int1 == 11034880);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        int int2 = java.lang.Integer.rotateRight(5, 11034880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        int int2 = java.lang.Integer.rotateLeft(1677721600, (-2147483644));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073741830 + "'", int2 == 1073741830);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        java.lang.String str1 = java.lang.Integer.toOctalString(268435456);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2000000000" + "'", str1, "2000000000");
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        int int1 = java.lang.Integer.lowestOneBit(268828672);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 131072 + "'", int1 == 131072);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        int int2 = java.lang.Integer.compareUnsigned(500, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("6400000", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 6400000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        int int1 = java.lang.Integer.lowestOneBit(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        int int2 = java.lang.Integer.divideUnsigned(1073741830, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20648881 + "'", int2 == 20648881);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10000110000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10000110000000000000000000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
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
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.sslInvalidHostNameAllowed(true);
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
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.localThreshold(9);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.serverSelectionTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder11 = builder3.minConnectionsPerHost(1261534);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("34");
        java.lang.String str7 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("23420000", 1024);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 1024 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        java.lang.String str1 = java.lang.Integer.toOctalString((-2147456632));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20000064610" + "'", str1, "20000064610");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        int int1 = java.lang.Integer.lowestOneBit(11034880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 256 + "'", int1 == 256);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("64", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 64");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        int int2 = java.lang.Integer.rotateRight(128, 1261534);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 512 + "'", int2 == 512);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
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
        com.mongodb.ReadPreference readPreference37 = mongoClientOptions27.getReadPreference();
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
        org.junit.Assert.assertNotNull(readPreference37);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        int int2 = java.lang.Integer.compareUnsigned((-1337982976), 134217728);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        int int2 = java.lang.Integer.sum((int) (byte) 100, 10000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10100 + "'", int2 == 10100);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        int int1 = java.lang.Integer.parseUnsignedInt("2147483652");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-2147483644) + "'", int1 == (-2147483644));
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
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
        com.mongodb.event.CommandListener commandListener15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.addCommandListener(commandListener15);
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
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        int int2 = java.lang.Integer.remainderUnsigned(40, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        java.lang.String str1 = java.lang.Integer.toOctalString(128);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "200" + "'", str1, "200");
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.socketTimeout((-2046820352));
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(525);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatSocketTimeout(947912712);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        int int2 = java.lang.Integer.rotateRight(45435459, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 808146084 + "'", int2 == 808146084);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(1024, 1342177280);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1024" + "'", str2, "1024");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        java.lang.String str1 = java.lang.Integer.toHexString(1342177280);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "50000000" + "'", str1, "50000000");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        java.lang.String str1 = java.lang.Integer.toHexString(25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "19" + "'", str1, "19");
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("2", 580061184);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 580061184 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        int int2 = java.lang.Integer.min(24, (-536870913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-536870913) + "'", int2 == (-536870913));
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
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
        java.lang.String str24 = mongoProperties0.getUsername();
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray16 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties9.password = charArray16;
        mongoProperties9.database = "";
        boolean boolean20 = mongoProperties9.hasCustomAddress();
        java.lang.String str21 = mongoProperties9.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder22 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder22.build();
        boolean boolean24 = mongoClientOptions23.isCursorFinalizerEnabled();
        int int25 = mongoClientOptions23.getHeartbeatConnectTimeout();
        boolean boolean26 = mongoClientOptions23.isSslEnabled();
        org.springframework.core.env.Environment environment27 = null;
        com.mongodb.MongoClient mongoClient28 = mongoProperties9.createMongoClient(mongoClientOptions23, environment27);
        com.mongodb.MongoClientOptions.Builder builder29 = mongoProperties0.builder(mongoClientOptions23);
        com.mongodb.event.CommandListener commandListener30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder31 = builder29.addCommandListener(commandListener30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatConnectTimeout((int) (byte) -1);
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionIdleTime((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.database;
        java.lang.String str30 = mongoProperties28.authenticationDatabase;
        java.lang.Class<?> wildcardClass31 = mongoProperties28.fieldNamingStrategy;
        mongoProperties28.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties28.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder41 = builder38.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        java.lang.String str45 = mongoClientOptions44.getDescription();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties28.builder(mongoClientOptions44);
        com.mongodb.ReadConcern readConcern47 = mongoClientOptions44.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder48 = builder27.readConcern(readConcern47);
        com.mongodb.MongoClientOptions.Builder builder49 = builder7.readConcern(readConcern47);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.maxWaitTime(16);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(readConcern47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.threadsAllowedToBlockForConnectionMultiplier(1552);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minConnectionsPerHost(52);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxConnectionIdleTime((-2147483644));
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(167772160);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.sslEnabled(false);
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
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        boolean boolean4 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("20000064610");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"20000064610\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        int int2 = java.lang.Integer.compareUnsigned((int) (short) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.divideUnsigned(34, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        java.lang.String str1 = java.lang.Integer.toBinaryString(20000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100111000100000" + "'", str1, "100111000100000");
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
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
        com.mongodb.MongoClientOptions.Builder builder17 = builder14.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        java.lang.String str25 = mongoClientOptions24.getDescription();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder30 = builder27.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        int int34 = mongoClientOptions33.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.description("");
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder42 = builder38.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder44 = builder38.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatConnectTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder47 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.description("");
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
        com.mongodb.DBDecoderFactory dBDecoderFactory62 = mongoClientOptions60.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder63 = builder49.dbDecoderFactory(dBDecoderFactory62);
        com.mongodb.MongoClientOptions.Builder builder64 = builder44.dbDecoderFactory(dBDecoderFactory62);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties65 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str66 = mongoProperties65.database;
        mongoProperties65.setHost("mongodb://localhost/test");
        java.lang.String str69 = mongoProperties65.getHost();
        com.mongodb.MongoClientOptions.Builder builder70 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions71 = builder70.build();
        int int72 = mongoClientOptions71.getHeartbeatConnectTimeout();
        int int73 = mongoClientOptions71.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder74 = mongoProperties65.builder(mongoClientOptions71);
        javax.net.SocketFactory socketFactory75 = mongoClientOptions71.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory76 = mongoClientOptions71.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder77 = builder44.dbEncoderFactory(dBEncoderFactory76);
        com.mongodb.MongoClientOptions.Builder builder79 = builder44.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder80 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions81 = builder80.build();
        int int82 = mongoClientOptions81.getHeartbeatConnectTimeout();
        int int83 = mongoClientOptions81.getConnectionsPerHost();
        int int84 = mongoClientOptions81.getLocalThreshold();
        javax.net.SocketFactory socketFactory85 = mongoClientOptions81.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder86 = builder79.socketFactory(socketFactory85);
        com.mongodb.MongoClientOptions.Builder builder87 = builder35.socketFactory(socketFactory85);
        com.mongodb.MongoClientOptions.Builder builder88 = builder26.socketFactory(socketFactory85);
        com.mongodb.MongoClientOptions.Builder builder89 = builder17.socketFactory(socketFactory85);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClient53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(mongoClientOptions60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(dBDecoderFactory62);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "mongodb://localhost/test" + "'", str69, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClientOptions71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 20000 + "'", int72 == 20000);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(socketFactory75);
        org.junit.Assert.assertNotNull(dBEncoderFactory76);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(mongoClientOptions81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 20000 + "'", int82 == 20000);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 100 + "'", int83 == 100);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 15 + "'", int84 == 15);
        org.junit.Assert.assertNotNull(socketFactory85);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder89);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(131072);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "131072" + "'", str1, "131072");
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        java.lang.String str1 = java.lang.Integer.toBinaryString((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111111111111111111111111111" + "'", str1, "11111111111111111111111111111111");
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        int int2 = java.lang.Integer.max((int) (byte) -1, 11034880);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11034880 + "'", int2 == 11034880);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        java.lang.String str1 = java.lang.Integer.toHexString(1200000123);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "47868c7b" + "'", str1, "47868c7b");
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        int int2 = java.lang.Integer.rotateRight((int) (short) 1, 67108864);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.gridFsDatabase;
        mongoProperties0.port = 2147483647;
        mongoProperties0.gridFsDatabase = "100";
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("100", (-536870913));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -536870913 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        int int2 = java.lang.Integer.compareUnsigned(212746240, (-536870913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.serverSelectionTimeout(8);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.clearPassword();
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
        int int19 = mongoClientOptions17.getLocalThreshold();
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties0.createMongoClient(mongoClientOptions17, environment20);
        java.lang.Class<?> wildcardClass22 = mongoClientOptions17.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(mongoClient10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        int int2 = java.lang.Integer.compareUnsigned(67108864, 1677721600);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        int int2 = java.lang.Integer.rotateLeft(0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        int int2 = java.lang.Integer.compare(35, 120);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
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
        java.lang.String str37 = mongoProperties0.getAuthenticationDatabase();
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
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        int int2 = java.lang.Integer.compare(65536, 16384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        int int2 = java.lang.Integer.min(25600, 1200000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25600 + "'", int2 == 25600);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(34, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "34" + "'", str2, "34");
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.decode("133fde");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"133fde\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
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
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.connectionsPerHost(110100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder13.threadsAllowedToBlockForConnectionMultiplier((-2147483644));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: threadsAllowedToBlockForConnectionMultiplier must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("34");
        int int7 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        int int2 = java.lang.Integer.compare(100011, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("133fde");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"133fde\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        int int1 = java.lang.Integer.numberOfTrailingZeros(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
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
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency(34);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList16 = mongoClientOptions15.getCommandListeners();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(commandListenerList16);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        int int1 = java.lang.Integer.reverseBytes(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        int int1 = java.lang.Integer.numberOfTrailingZeros(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        int int2 = java.lang.Integer.rotateLeft((int) ' ', (-1337982976));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
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
        mongoProperties0.setUsername("10000");
        java.lang.String str18 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        int int1 = java.lang.Integer.numberOfTrailingZeros(1073741830);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        int int2 = java.lang.Integer.sum((int) '#', 120000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 120035 + "'", int2 == 120035);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.heartbeatSocketTimeout(3);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("110100", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 110100");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
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
        int int11 = mongoClientOptions6.getHeartbeatConnectTimeout();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray19 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties12.password = charArray19;
        java.lang.Class<java.lang.Integer> intClass21 = java.lang.Integer.TYPE;
        mongoProperties12.fieldNamingStrategy = intClass21;
        java.lang.String str23 = mongoProperties12.username;
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties12.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionIdleTime(0);
        boolean boolean28 = mongoClientOptions6.equals((java.lang.Object) builder25);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(charArray4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(writeConcern9);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("47868c7b");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"47868c7b\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        int int2 = java.lang.Integer.min(32768, 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        int int2 = java.lang.Integer.remainderUnsigned(26, 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        int int1 = java.lang.Integer.reverse(78528512);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 161056 + "'", int1 == 161056);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        int int5 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        int int1 = java.lang.Integer.numberOfLeadingZeros(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int10 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions6.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
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
        com.mongodb.MongoClientOptions.Builder builder56 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions51);
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
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        java.lang.String str1 = java.lang.Integer.toOctalString(22930800);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "127362560" + "'", str1, "127362560");
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("27017");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.connectTimeout((int) ' ');
        java.lang.Class<?> wildcardClass14 = builder13.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder34 = builder2.connectionsPerHost((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: connectionPerHost must be > 0");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        int int2 = java.lang.Integer.parseInt("100000", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9765625 + "'", int2 == 9765625);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        int int1 = java.lang.Integer.parseUnsignedInt("100011");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100011 + "'", int1 == 100011);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        java.lang.Integer int1 = java.lang.Integer.getInteger("100111000100000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        int int2 = java.lang.Integer.min((-2147456632), 16384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147456632) + "'", int2 == (-2147456632));
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        int int2 = java.lang.Integer.compareUnsigned(1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("10", 4194304);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 4194304 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
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
        java.lang.String str20 = mongoProperties0.database;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        int int2 = java.lang.Integer.remainderUnsigned(27017, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        int int2 = java.lang.Integer.min(4, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.username = "23420000";
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        java.lang.String str1 = java.lang.Integer.toHexString((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        java.lang.String str2 = java.lang.Integer.toString(12, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "12" + "'", str2, "12");
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        java.lang.String str1 = java.lang.Integer.toBinaryString(30000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111010100110000" + "'", str1, "111010100110000");
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        int int2 = java.lang.Integer.min((int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        java.lang.String str1 = java.lang.Integer.toHexString(11034880);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a86100" + "'", str1, "a86100");
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        int int1 = java.lang.Integer.reverseBytes(141);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1929379840) + "'", int1 == (-1929379840));
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        java.lang.String str1 = java.lang.Integer.toHexString(15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "f" + "'", str1, "f");
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        int int2 = java.lang.Integer.compare(25600, 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        int int1 = java.lang.Integer.numberOfTrailingZeros(2147483647);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        int int2 = java.lang.Integer.compareUnsigned(1552, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
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
        java.lang.Class<?> wildcardClass29 = mongoProperties17.fieldNamingStrategy;
        com.mongodb.MongoClientOptions.Builder builder30 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.build();
        boolean boolean32 = mongoClientOptions31.isCursorFinalizerEnabled();
        boolean boolean33 = mongoClientOptions31.isAlwaysUseMBeans();
        org.springframework.core.env.Environment environment34 = null;
        com.mongodb.MongoClient mongoClient35 = mongoProperties17.createMongoClient(mongoClientOptions31, environment34);
        java.lang.String str36 = mongoProperties17.getHost();
        mongoProperties17.setAuthenticationDatabase("1111111111111111111111111111111");
        boolean boolean39 = mongoClientOptions10.equals((java.lang.Object) "1111111111111111111111111111111");
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(mongoClientOptions31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        int int2 = java.lang.Integer.remainderUnsigned(436207616, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("ffffffff", (-2147483648));
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix -2147483648 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("128", 580061184);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 580061184 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        int int2 = java.lang.Integer.compareUnsigned(558701952, 924209280);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        int int1 = java.lang.Integer.parseInt("5");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        int int2 = java.lang.Integer.compare(2, 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        mongoProperties0.username = "test";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray13 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties6.password = charArray13;
        java.lang.String str15 = mongoProperties6.database;
        char[] charArray16 = mongoProperties6.getPassword();
        mongoProperties0.password = charArray16;
        com.mongodb.MongoClientOptions mongoClientOptions18 = null;
        com.mongodb.MongoClientOptions.Builder builder19 = mongoProperties0.builder(mongoClientOptions18);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        int int2 = java.lang.Integer.divideUnsigned(1342177280, 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5242880 + "'", int2 == 5242880);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        int int1 = java.lang.Integer.parseUnsignedInt("120");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 120 + "'", int1 == 120);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("-1", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: -1");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.socketTimeout(167772160);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int7 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        int int2 = java.lang.Integer.sum((int) (short) -1, (-2147456632));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2147456633) + "'", int2 == (-2147456633));
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        java.lang.String str1 = java.lang.Integer.toString(12);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12" + "'", str1, "12");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.lang.String str2 = java.lang.Integer.toString(637534208, 27017);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "637534208" + "'", str2, "637534208");
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        java.lang.String str2 = java.lang.Integer.toString(25, 924209280);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "25" + "'", str2, "25");
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(141);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "141" + "'", str1, "141");
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("f");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: f");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
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
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder18 = builder15.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.build();
        java.lang.String str22 = mongoClientOptions21.getDescription();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        int int24 = mongoClientOptions21.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder25 = com.mongodb.MongoClientOptions.builder(mongoClientOptions21);
        int int26 = mongoClientOptions21.getMinHeartbeatFrequency();
        org.bson.codecs.configuration.CodecRegistry codecRegistry27 = mongoClientOptions21.getCodecRegistry();
        com.mongodb.MongoClientOptions.Builder builder28 = builder14.codecRegistry(codecRegistry27);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.sslEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder32 = builder28.heartbeatFrequency((-1929379840));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: heartbeatFrequency must be > 0");
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
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(mongoClientOptions21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 500 + "'", int24 == 500);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
        org.junit.Assert.assertNotNull(codecRegistry27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        int int1 = java.lang.Integer.signum((-536870913));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("100111000100000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100111000100000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        int int1 = java.lang.Integer.bitCount(80);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        int int2 = java.lang.Integer.compare(200, 17459436);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("100", 104857600);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 104857600 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("35", 141);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 141 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("10000110000000000000000000000000", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = java.lang.Integer.parseUnsignedInt("f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"f\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        int int1 = java.lang.Integer.bitCount(31);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
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
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
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
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout(83886080);
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
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        int int2 = java.lang.Integer.max(1261534, 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1261534 + "'", int2 == 1261534);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        int int1 = java.lang.Integer.lowestOneBit((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        int int1 = java.lang.Integer.parseInt("2");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        int int1 = java.lang.Integer.parseUnsignedInt("27017");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27017 + "'", int1 == 27017);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(11034880);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11034880" + "'", str1, "11034880");
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("a86100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a86100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        int int1 = java.lang.Integer.parseUnsignedInt("26");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        int int2 = java.lang.Integer.sum(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        mongoProperties0.username = "f";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost(120);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
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
        com.mongodb.MongoClientOptions.Builder builder32 = builder31.legacyDefaults();
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
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        int int1 = java.lang.Integer.lowestOneBit(161056);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        java.lang.Integer int1 = java.lang.Integer.getInteger("10000");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        int int1 = java.lang.Integer.numberOfLeadingZeros(10060000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        java.lang.Integer int1 = java.lang.Integer.getInteger("18");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("50000000", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 50000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("100011", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 100011");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.lang.String str1 = java.lang.Integer.toBinaryString(4);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        java.lang.String str1 = java.lang.Integer.toBinaryString(17459436);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1000010100110100011101100" + "'", str1, "1000010100110100011101100");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        int int1 = java.lang.Integer.reverseBytes(10060000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-528443136) + "'", int1 == (-528443136));
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.springframework.core.env.Environment environment2 = null;
        com.mongodb.MongoClient mongoClient3 = mongoProperties0.createMongoClient(mongoClientOptions1, environment2);
        java.lang.String str4 = mongoProperties0.getGridFsDatabase();
        boolean boolean5 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
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
        java.lang.Class<?> wildcardClass27 = mongoProperties0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        int int2 = java.lang.Integer.rotateLeft((-2046820352), (-528443136));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2046820352) + "'", int2 == (-2046820352));
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        java.lang.Integer int11 = mongoProperties0.getPort();
        java.lang.String str12 = mongoProperties0.uri;
        mongoProperties0.host = "";
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "mongodb://localhost/test" + "'", str12, "mongodb://localhost/test");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        int int2 = java.lang.Integer.rotateLeft((int) (short) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
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
        int int37 = mongoClientOptions28.getMinHeartbeatFrequency();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 500 + "'", int37 == 500);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
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
        com.mongodb.ReadPreference readPreference30 = mongoClientOptions23.getReadPreference();
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
        org.junit.Assert.assertNotNull(readPreference30);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        int int2 = java.lang.Integer.max(97, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("", 10000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 10000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        int int2 = java.lang.Integer.sum(25, 40);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("11034880");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 11034880");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        int int1 = java.lang.Integer.signum(500);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        int int5 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.setPort((java.lang.Integer) (-1));
        java.lang.String str8 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        int int2 = java.lang.Integer.rotateRight(20000, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10000 + "'", int2 == 10000);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        int int1 = java.lang.Integer.numberOfTrailingZeros(268435456);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        int int1 = java.lang.Integer.parseUnsignedInt("11010");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11010 + "'", int1 == 11010);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        int int2 = java.lang.Integer.remainderUnsigned(16, 123);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        int int1 = java.lang.Integer.signum(17459436);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        int int1 = java.lang.Integer.reverse((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        int int1 = java.lang.Integer.numberOfTrailingZeros(37748736);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 22 + "'", int1 == 22);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("19", 33554432);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 33554432 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        int int1 = java.lang.Integer.parseUnsignedInt("141");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 141 + "'", int1 == 141);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        int int1 = java.lang.Integer.bitCount(436207616);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
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
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minHeartbeatFrequency(4194304);
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
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        int int2 = java.lang.Integer.divideUnsigned((int) (byte) 100, 9765625);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.clearPassword();
        boolean boolean7 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        java.lang.Integer int1 = java.lang.Integer.getInteger("35");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        java.lang.String str8 = mongoProperties0.username;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        java.lang.String str1 = java.lang.Integer.toBinaryString(15);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111" + "'", str1, "1111");
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        int int1 = java.lang.Integer.signum(16384);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
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
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime((int) (short) 10);
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
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        int int2 = java.lang.Integer.max(161056, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161056 + "'", int2 == 161056);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.heartbeatSocketTimeout(22930800);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.maxConnectionLifeTime((-1337982976));
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
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        java.lang.String str1 = java.lang.Integer.toString(120035);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "120035" + "'", str1, "120035");
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        mongoProperties0.setDatabase("5");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        int int2 = java.lang.Integer.divideUnsigned(5000000, 10000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 500 + "'", int2 == 500);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
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
        boolean boolean21 = mongoProperties0.hasCustomCredentials();
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        mongoProperties0.database = "";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        java.lang.String str12 = mongoProperties0.getDatabase();
        mongoProperties0.host = "100";
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.description("");
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder25 = builder17.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder25.build();
        com.mongodb.MongoClientOptions.Builder builder27 = com.mongodb.MongoClientOptions.builder(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder28 = mongoProperties0.builder(mongoClientOptions26);
        int int29 = mongoClientOptions26.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.database;
        char[] charArray5 = mongoProperties0.password;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        long long1 = java.lang.Integer.toUnsignedLong(2147483647);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 2147483647L + "'", long1 == 2147483647L);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("111110100", 30000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 30000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
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
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
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
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
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
        mongoProperties0.setUri("11111111111111111111111111111111");
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
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        int int1 = java.lang.Integer.reverseBytes(134217728);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.port = 52;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.uri = "1";
        java.lang.String str10 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
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
        com.mongodb.MongoClientOptions.Builder builder35 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder38 = builder35.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions41 = builder38.build();
        int int42 = mongoClientOptions41.getMaxConnectionLifeTime();
        boolean boolean43 = mongoClientOptions41.isSslEnabled();
        com.mongodb.WriteConcern writeConcern44 = mongoClientOptions41.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder45 = builder34.writeConcern(writeConcern44);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.maxConnectionLifeTime(167772160);
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
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(mongoClientOptions41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(writeConcern44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        int int2 = java.lang.Integer.max(20648881, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20648881 + "'", int2 == 20648881);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        int int2 = java.lang.Integer.min(7, 65536);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        java.lang.Integer int1 = java.lang.Integer.getInteger("25");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
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
        com.mongodb.MongoClientOptions.Builder builder53 = builder32.connectTimeout(78528512);
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
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
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
        java.lang.Class<?> wildcardClass24 = mongoProperties0.getFieldNamingStrategy();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1200000000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        mongoProperties0.setUri("-1");
        java.lang.String str14 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setAuthenticationDatabase("11111111111111111111111111111111");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
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
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder40 = builder38.minConnectionsPerHost((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: state should be: minConnectionsPerHost must be >= 0");
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
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(100000, 5000000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100000" + "'", str2, "100000");
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        int int1 = java.lang.Integer.reverseBytes(65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1090519040 + "'", int1 == 1090519040);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("4e2000", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 4e2000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        int int1 = java.lang.Integer.reverseBytes(525);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 218234880 + "'", int1 == 218234880);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        int int7 = mongoClientOptions1.getLocalThreshold();
        int int8 = mongoClientOptions1.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        java.lang.String str2 = java.lang.Integer.toString(24, 200);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "24" + "'", str2, "24");
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.host = "hi!";
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectTimeout((int) 'a');
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
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
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.threadsAllowedToBlockForConnectionMultiplier(637534208);
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
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("2", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        java.lang.String str12 = mongoProperties0.getUsername();
        mongoProperties0.uri = "6400000";
        mongoProperties0.port = 20000;
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        int int2 = java.lang.Integer.sum(16384, 1200000123);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1200016507 + "'", int2 == 1200016507);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        int int1 = java.lang.Integer.lowestOneBit(218234880);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 131072 + "'", int1 == 131072);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        java.lang.String str1 = java.lang.Integer.toString(924209280);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "924209280" + "'", str1, "924209280");
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        int int2 = java.lang.Integer.remainderUnsigned(1090519040, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder10 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder11 = com.mongodb.MongoClientOptions.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        int int2 = java.lang.Integer.rotateRight((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("100000", 512);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 512 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("0", 268828672);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 268828672 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        int int1 = java.lang.Integer.parseInt("924209280");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 924209280 + "'", int1 == 924209280);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        int int1 = java.lang.Integer.signum((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        int int1 = java.lang.Integer.reverse(123);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-570425344) + "'", int1 == (-570425344));
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("47868c7b");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 47868c7b");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("2000000000", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 2000000000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        int int2 = java.lang.Integer.compare(83886080, 27017);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.maxWaitTime(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("1100100");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("34");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier(22);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        int int2 = java.lang.Integer.remainderUnsigned(16384, (-570425344));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16384 + "'", int2 == 16384);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.clearPassword();
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
        int int19 = mongoClientOptions17.getLocalThreshold();
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties0.createMongoClient(mongoClientOptions17, environment20);
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions17);
        int int23 = mongoClientOptions17.getMaxWaitTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNotNull(mongoClient10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 15 + "'", int19 == 15);
        org.junit.Assert.assertNotNull(mongoClient21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 120000 + "'", int23 == 120000);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
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
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.description("1100100");
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
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.heartbeatSocketTimeout((-2147483648));
        com.mongodb.MongoClientOptions.Builder builder9 = builder5.serverSelectionTimeout((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder11 = builder5.heartbeatSocketTimeout(64);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectTimeout(212746240);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
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
        int int19 = mongoClientOptions1.getHeartbeatSocketTimeout();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getUri();
        java.lang.String str5 = mongoProperties0.getDatabase();
        java.lang.String str6 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
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
        com.mongodb.event.CommandListener commandListener37 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder38 = builder36.addCommandListener(commandListener37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: commandListener can not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        java.lang.Integer int1 = java.lang.Integer.getInteger("mongodb://localhost/test");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        int int2 = java.lang.Integer.divideUnsigned((int) (short) 1, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        int int1 = java.lang.Integer.numberOfLeadingZeros(838860800);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        java.lang.String str1 = java.lang.Integer.toOctalString(141);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "215" + "'", str1, "215");
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1090519040);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("19", 111110100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 111110100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        int int1 = java.lang.Integer.reverse((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1342177280 + "'", int1 == 1342177280);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.heartbeatSocketTimeout(3);
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        int int2 = java.lang.Integer.sum(1073741830, 256);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1073742086 + "'", int2 == 1073742086);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Integer int3 = mongoProperties0.port;
        java.lang.String str4 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str5 = mongoProperties0.host;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("10000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 10000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
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
        boolean boolean20 = mongoClientOptions14.isAlwaysUseMBeans();
        com.mongodb.ReadConcern readConcern21 = mongoClientOptions14.getReadConcern();
        java.lang.Class<?> wildcardClass22 = mongoClientOptions14.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(readConcern21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        java.lang.String str1 = java.lang.Integer.toOctalString(525);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1015" + "'", str1, "1015");
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        int int2 = java.lang.Integer.sum((int) ' ', (-2046820352));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-2046820320) + "'", int2 == (-2046820320));
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setUri("hi!");
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        char[] charArray5 = mongoProperties0.getPassword();
        java.lang.String str6 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str8 = mongoProperties0.getDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray16 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties9.password = charArray16;
        java.lang.String str18 = mongoProperties9.database;
        char[] charArray19 = mongoProperties9.getPassword();
        mongoProperties9.database = "mongodb://localhost/test";
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
        int int35 = mongoClientOptions32.getMaxConnectionIdleTime();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList36 = mongoClientOptions32.getCommandListeners();
        boolean boolean37 = mongoClientOptions32.isSocketKeepAlive();
        com.mongodb.MongoClientOptions.Builder builder38 = mongoProperties9.builder(mongoClientOptions32);
        boolean boolean39 = mongoClientOptions32.isSocketKeepAlive();
        org.springframework.core.env.Environment environment40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient41 = mongoProperties0.createMongoClient(mongoClientOptions32, environment40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The connection string is invalid. Connection strings must start with 'mongodb://'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(commandListenerList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(commandListenerList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.sslEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(83886080);
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        long long1 = java.lang.Integer.toUnsignedLong(64);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 64L + "'", long1 == 64L);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        java.lang.String str2 = java.lang.Integer.toString(33554432, 2147483647);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "33554432" + "'", str2, "33554432");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray15 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties8.password = charArray15;
        mongoProperties8.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray26 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties19.password = charArray26;
        java.lang.String str28 = mongoProperties19.database;
        java.lang.String str29 = mongoProperties19.getHost();
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
        int int42 = mongoClientOptions40.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions40);
        java.lang.String str44 = mongoClientOptions40.getDescription();
        com.mongodb.MongoClientOptions.Builder builder45 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions40);
        org.springframework.core.env.Environment environment46 = null;
        com.mongodb.MongoClient mongoClient47 = mongoProperties19.createMongoClient(mongoClientOptions40, environment46);
        com.mongodb.MongoClientOptions.Builder builder48 = mongoProperties8.builder(mongoClientOptions40);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder48.build();
        int int50 = mongoClientOptions49.getMaxWaitTime();
        org.springframework.core.env.Environment environment51 = null;
        com.mongodb.MongoClient mongoClient52 = mongoProperties0.createMongoClient(mongoClientOptions49, environment51);
        int int53 = mongoClientOptions49.getConnectTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(mongoClient33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(mongoClient47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 120000 + "'", int50 == 120000);
        org.junit.Assert.assertNotNull(mongoClient52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10000 + "'", int53 == 10000);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.username;
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        int int2 = java.lang.Integer.divideUnsigned((int) '#', 33554432);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(525);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "525" + "'", str1, "525");
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
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
        int int23 = mongoClientOptions15.getMinConnectionsPerHost();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
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
        java.lang.String str21 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        int int1 = java.lang.Integer.signum(580061184);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.database;
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        char[] charArray5 = mongoProperties0.getPassword();
        int int6 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        java.lang.String str1 = java.lang.Integer.toString(947912705);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "947912705" + "'", str1, "947912705");
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        int int1 = java.lang.Integer.numberOfLeadingZeros(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = java.lang.Integer.valueOf("2147483652");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483652\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        int int1 = java.lang.Integer.highestOneBit(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray7 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties0.password = charArray7;
        java.lang.Class<java.lang.Integer> intClass9 = java.lang.Integer.TYPE;
        mongoProperties0.fieldNamingStrategy = intClass9;
        java.lang.String str11 = mongoProperties0.username;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        com.mongodb.MongoClientOptions.Builder builder13 = mongoProperties0.builder(mongoClientOptions12);
        java.lang.Class<?> wildcardClass14 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray15 = mongoProperties0.password;
        mongoProperties0.setUsername("19");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray15), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray15), "[#, a, #, a, 4,  ]");
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("a", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 97 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        int int1 = java.lang.Integer.parseInt("215");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 215 + "'", int1 == 215);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getMaxWaitTime();
        int int5 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.MongoClientOptions.Builder builder6 = com.mongodb.MongoClientOptions.builder(mongoClientOptions1);
        int int7 = mongoClientOptions1.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 120000 + "'", int4 == 120000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20000 + "'", int5 == 20000);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 15 + "'", int7 == 15);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        int int1 = java.lang.Integer.lowestOneBit(1677721600);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67108864 + "'", int1 == 67108864);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
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
        com.mongodb.event.CommandListener commandListener18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder17.addCommandListener(commandListener18);
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        int int2 = java.lang.Integer.remainderUnsigned(5000000, 10060000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5000000 + "'", int2 == 5000000);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("4e2000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4e2000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.uri;
        mongoProperties0.setPort((java.lang.Integer) 0);
        boolean boolean5 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setGridFsDatabase("15");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb://localhost/test" + "'", str2, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
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
        mongoProperties0.setPort((java.lang.Integer) 212746240);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str4 = mongoProperties0.host;
        java.lang.String str5 = mongoProperties0.gridFsDatabase;
        mongoProperties0.port = 2147483647;
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("111110100", 141);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 141 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        java.lang.String str2 = mongoClientOptions1.getRequiredReplicaSetName();
        int int3 = mongoClientOptions1.getServerSelectionTimeout();
        int int4 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        int int5 = mongoClientOptions1.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        int int1 = java.lang.Integer.reverse(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        int int2 = java.lang.Integer.remainderUnsigned(20000, 580061184);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        int int1 = java.lang.Integer.bitCount(120000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        int int2 = java.lang.Integer.divideUnsigned(52, 3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        java.lang.String str1 = java.lang.Integer.toOctalString(10000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23420" + "'", str1, "23420");
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        int int2 = java.lang.Integer.compareUnsigned((-570425344), 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "7" + "'", str1, "7");
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str4 = mongoProperties0.getHost();
        mongoProperties0.uri = "test";
        mongoProperties0.username = "25";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str4 = mongoProperties0.uri;
        char[] charArray5 = mongoProperties0.password;
        java.lang.String str6 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "test" + "'", str3, "test");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectTimeout((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder5 = builder2.legacyDefaults();
        javax.net.SocketFactory socketFactory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder7 = builder5.socketFactory(socketFactory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        com.mongodb.MongoClientOptions.Builder builder3 = mongoProperties0.builder(mongoClientOptions2);
        mongoProperties0.port = 1;
        mongoProperties0.username = "120";
        boolean boolean8 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        int int2 = java.lang.Integer.max((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("1000010100110100011101100", 141);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 141 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("1200000000", 120000);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 120000 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        java.lang.Integer int1 = java.lang.Integer.getInteger("19");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        int int2 = java.lang.Integer.min(256, 78528512);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 256 + "'", int2 == 256);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        java.lang.Integer int1 = java.lang.Integer.getInteger("33554432");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
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
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.description("");
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder24 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder24.build();
        boolean boolean26 = mongoClientOptions25.isCursorFinalizerEnabled();
        int int27 = mongoClientOptions25.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern28 = mongoClientOptions25.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.writeConcern(writeConcern28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder16.writeConcern(writeConcern28);
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
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
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
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
        boolean boolean30 = mongoClientOptions23.isSslInvalidHostNameAllowed();
        int int31 = mongoClientOptions23.getServerSelectionTimeout();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 30000 + "'", int31 == 30000);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        int int2 = java.lang.Integer.compareUnsigned(40, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        int int2 = java.lang.Integer.compareUnsigned((-2147456632), (-536870913));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        java.lang.Integer int1 = java.lang.Integer.getInteger("525");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("mongodb://localhost/test", 167772160);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 167772160 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        int int1 = java.lang.Integer.lowestOneBit(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        int int1 = java.lang.Integer.signum(215);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
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
        int int13 = mongoClientOptions10.getMinConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        boolean boolean15 = mongoClientOptions10.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.authenticationDatabase = "12";
        mongoProperties0.username = "97";
        char[] charArray5 = mongoProperties0.password;
        mongoProperties0.port = 100;
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        int int2 = java.lang.Integer.max(1, 215);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 215 + "'", int2 == 215);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        int int2 = java.lang.Integer.min(34, 100000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = new java.lang.Integer("2147483652");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"2147483652\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        java.lang.String str1 = java.lang.Integer.toString(134217728);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "134217728" + "'", str1, "134217728");
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        int int2 = java.lang.Integer.min(17459436, 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        int int1 = java.lang.Integer.signum(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        int int2 = java.lang.Integer.rotateLeft(17, 1552);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1114112 + "'", int2 == 1114112);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.String str3 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
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
        java.lang.String str17 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "test" + "'", str17, "test");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
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
        int int16 = mongoClientOptions10.getLocalThreshold();
        org.junit.Assert.assertNotNull(mongoClient3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(commandListenerList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        java.lang.String str2 = java.lang.Integer.toString(32768, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32768" + "'", str2, "32768");
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("100111000100000");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 100111000100000");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("2000000000", 111110100);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 111110100 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        int int2 = java.lang.Integer.remainderUnsigned((int) (byte) 1, 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxWaitTime(22);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        java.lang.String str2 = java.lang.Integer.toString(33554432, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "33554432" + "'", str2, "33554432");
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("f", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        long long1 = java.lang.Integer.toUnsignedLong(1073741826);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 1073741826L + "'", long1 == 1073741826L);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        int int1 = java.lang.Integer.numberOfLeadingZeros((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        long long1 = java.lang.Integer.toUnsignedLong(268828672);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 268828672L + "'", long1 == 268828672L);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
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
        com.mongodb.MongoClientOptions.Builder builder52 = builder51.legacyDefaults();
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
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("1024", 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 256 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        java.lang.String str1 = java.lang.Integer.toHexString(11010);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2b02" + "'", str1, "2b02");
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        int int2 = java.lang.Integer.compare(1200000123, 1261534);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        java.lang.String str1 = java.lang.Integer.toOctalString(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.connectTimeout(436207616);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        int int2 = java.lang.Integer.divideUnsigned(1200016507, 22);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54546204 + "'", int2 == 54546204);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("525");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 525");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
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
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions6.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20000 + "'", int7 == 20000);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatConnectTimeout((int) (byte) -1);
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
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxConnectionIdleTime((int) ' ');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties28 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str29 = mongoProperties28.database;
        java.lang.String str30 = mongoProperties28.authenticationDatabase;
        java.lang.Class<?> wildcardClass31 = mongoProperties28.fieldNamingStrategy;
        mongoProperties28.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties28.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties28.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder41 = builder38.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        java.lang.String str45 = mongoClientOptions44.getDescription();
        com.mongodb.MongoClientOptions.Builder builder46 = mongoProperties28.builder(mongoClientOptions44);
        com.mongodb.ReadConcern readConcern47 = mongoClientOptions44.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder48 = builder27.readConcern(readConcern47);
        com.mongodb.MongoClientOptions.Builder builder49 = builder7.readConcern(readConcern47);
        com.mongodb.MongoClientOptions.Builder builder51 = builder49.maxConnectionLifeTime(2);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str53 = mongoProperties52.database;
        java.lang.String str54 = mongoProperties52.authenticationDatabase;
        java.lang.String str55 = mongoProperties52.getMongoClientDatabase();
        java.lang.String str56 = mongoProperties52.database;
        java.lang.String str57 = mongoProperties52.getUsername();
        java.lang.String str58 = mongoProperties52.getMongoClientDatabase();
        java.lang.String str59 = mongoProperties52.uri;
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
        int int72 = mongoClientOptions70.getLocalThreshold();
        int int73 = mongoClientOptions70.getMaxConnectionIdleTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory74 = mongoClientOptions70.getDbEncoderFactory();
        com.mongodb.ReadConcern readConcern75 = mongoClientOptions70.getReadConcern();
        com.mongodb.MongoClientOptions.Builder builder76 = mongoProperties52.builder(mongoClientOptions70);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties77 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions78 = null;
        org.springframework.core.env.Environment environment79 = null;
        com.mongodb.MongoClient mongoClient80 = mongoProperties77.createMongoClient(mongoClientOptions78, environment79);
        com.mongodb.MongoClientOptions.Builder builder81 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder83 = builder81.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder84 = builder81.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder86 = builder84.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions87 = builder84.build();
        com.mongodb.MongoClientOptions.Builder builder88 = mongoProperties77.builder(mongoClientOptions87);
        com.mongodb.DBDecoderFactory dBDecoderFactory89 = mongoClientOptions87.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder90 = builder76.dbDecoderFactory(dBDecoderFactory89);
        com.mongodb.MongoClientOptions.Builder builder91 = builder51.dbDecoderFactory(dBDecoderFactory89);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray17), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray17), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(readConcern47);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "test" + "'", str55, "test");
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "test" + "'", str58, "test");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "mongodb://localhost/test" + "'", str59, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(mongoClient63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(mongoClientOptions70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 15 + "'", int72 == 15);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory74);
        org.junit.Assert.assertNotNull(readConcern75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoClient80);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(mongoClientOptions87);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(dBDecoderFactory89);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(builder91);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        int int2 = java.lang.Integer.compare(52, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
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
        mongoProperties0.port = 924209280;
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
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        int int2 = java.lang.Integer.rotateLeft(22930800, 50000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22930800 + "'", int2 == 22930800);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        int int2 = java.lang.Integer.rotateRight(9765625, 1200000000);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9765625 + "'", int2 == 9765625);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        int int2 = java.lang.Integer.max((int) (short) 100, 637534208);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 637534208 + "'", int2 == 637534208);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.sslInvalidHostNameAllowed(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        int int2 = java.lang.Integer.compare(6, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("33554432", 141);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 141 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        int int1 = java.lang.Integer.bitCount(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        int int2 = java.lang.Integer.compareUnsigned((-2147483644), 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.authenticationDatabase;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.username;
        mongoProperties0.username = "test";
        java.lang.Class<?> wildcardClass6 = mongoProperties0.getFieldNamingStrategy();
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
        boolean boolean23 = mongoProperties7.hasCustomCredentials();
        java.lang.String str24 = mongoProperties7.gridFsDatabase;
        char[] charArray25 = mongoProperties7.password;
        mongoProperties0.setPassword(charArray25);
        mongoProperties0.setUri("2");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray36 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties29.password = charArray36;
        java.lang.String str38 = mongoProperties29.database;
        java.lang.String str39 = mongoProperties29.getHost();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.springframework.core.env.Environment environment42 = null;
        com.mongodb.MongoClient mongoClient43 = mongoProperties40.createMongoClient(mongoClientOptions41, environment42);
        com.mongodb.MongoClientOptions.Builder builder44 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder47 = builder44.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties40.builder(mongoClientOptions50);
        int int52 = mongoClientOptions50.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder53 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions50);
        java.lang.String str54 = mongoClientOptions50.getDescription();
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions50);
        org.springframework.core.env.Environment environment56 = null;
        com.mongodb.MongoClient mongoClient57 = mongoProperties29.createMongoClient(mongoClientOptions50, environment56);
        java.lang.String str58 = mongoProperties29.username;
        char[] charArray59 = mongoProperties29.getPassword();
        mongoProperties0.password = charArray59;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[\000, \000, \000, \000, \000, \000]");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(mongoClient43);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(mongoClient57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[\000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
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
        boolean boolean37 = mongoClientOptions24.isSslEnabled();
        boolean boolean38 = mongoClientOptions24.isSslInvalidHostNameAllowed();
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        java.lang.String str1 = java.lang.Integer.toOctalString(67108864);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "400000000" + "'", str1, "400000000");
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        int int1 = java.lang.Integer.bitCount(17459436);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isSslEnabled();
        org.bson.codecs.configuration.CodecRegistry codecRegistry3 = mongoClientOptions1.getCodecRegistry();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList4 = mongoClientOptions1.getCommandListeners();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(codecRegistry3);
        org.junit.Assert.assertNotNull(commandListenerList4);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseInt("2000000000", 100011);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 100011 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.description("");
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.maxConnectionLifeTime(1);
        com.mongodb.MongoClientOptions.Builder builder19 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        boolean boolean21 = mongoClientOptions20.isCursorFinalizerEnabled();
        int int22 = mongoClientOptions20.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions20.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = builder14.writeConcern(writeConcern23);
        com.mongodb.MongoClientOptions.Builder builder25 = builder0.writeConcern(writeConcern23);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties26 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str27 = mongoProperties26.database;
        java.lang.String str28 = mongoProperties26.authenticationDatabase;
        java.lang.Class<?> wildcardClass29 = mongoProperties26.fieldNamingStrategy;
        mongoProperties26.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions32 = null;
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties26.builder(mongoClientOptions32);
        com.mongodb.MongoClientOptions mongoClientOptions34 = null;
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties26.builder(mongoClientOptions34);
        com.mongodb.MongoClientOptions.Builder builder36 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder39 = builder36.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions42 = builder39.build();
        java.lang.String str43 = mongoClientOptions42.getDescription();
        com.mongodb.MongoClientOptions.Builder builder44 = mongoProperties26.builder(mongoClientOptions42);
        com.mongodb.ReadConcern readConcern45 = mongoClientOptions42.getReadConcern();
        com.mongodb.WriteConcern writeConcern46 = mongoClientOptions42.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder47 = builder25.writeConcern(writeConcern46);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder51 = builder48.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder52 = builder51.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.maxWaitTime((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        com.mongodb.MongoClientOptions mongoClientOptions56 = null;
        org.springframework.core.env.Environment environment57 = null;
        com.mongodb.MongoClient mongoClient58 = mongoProperties55.createMongoClient(mongoClientOptions56, environment57);
        com.mongodb.MongoClientOptions.Builder builder59 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder62 = builder59.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions65 = builder62.build();
        com.mongodb.MongoClientOptions.Builder builder66 = mongoProperties55.builder(mongoClientOptions65);
        com.mongodb.DBDecoderFactory dBDecoderFactory67 = mongoClientOptions65.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder68 = builder54.dbDecoderFactory(dBDecoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder69 = builder25.dbDecoderFactory(dBDecoderFactory67);
        com.mongodb.MongoClientOptions.Builder builder71 = builder69.threadsAllowedToBlockForConnectionMultiplier(10060000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(mongoClientOptions42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(readConcern45);
        org.junit.Assert.assertNotNull(writeConcern46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(mongoClient58);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(mongoClientOptions65);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(dBDecoderFactory67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
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
        int int38 = mongoClientOptions28.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions28.getDbEncoderFactory();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        int int1 = java.lang.Integer.numberOfTrailingZeros(22);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass1 = java.lang.Class.forName("947912705");
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 947912705");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        int int1 = java.lang.Integer.bitCount(10060000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setUsername("0");
        java.lang.Integer int5 = mongoProperties0.port;
        java.lang.String str6 = mongoProperties0.uri;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        int int1 = java.lang.Integer.lowestOneBit(10000);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(80, 10000);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "80" + "'", str2, "80");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        int int1 = java.lang.Integer.numberOfTrailingZeros((-2046820352));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        int int1 = java.lang.Integer.reverseBytes((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1677721600 + "'", int1 == 1677721600);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        java.lang.String str2 = java.lang.Integer.toString(100000, 5242880);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100000" + "'", str2, "100000");
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        com.mongodb.MongoClientOptions.Builder builder2 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
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
        boolean boolean17 = mongoClientOptions10.isSocketKeepAlive();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList18 = mongoClientOptions10.getCommandListeners();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(commandListenerList18);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str1 = mongoProperties0.database;
        java.lang.String str2 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.port = (-1);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        com.mongodb.MongoClientOptions.Builder builder7 = mongoProperties0.builder(mongoClientOptions6);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.sslInvalidHostNameAllowed(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minConnectionsPerHost(4194304);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("80", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 0 less than Character.MIN_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
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
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.connectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.minHeartbeatFrequency(32);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.sslEnabled(false);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "test" + "'", str6, "test");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
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
        int int23 = mongoClientOptions21.getSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder24 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions21);
        int int25 = mongoClientOptions21.getHeartbeatFrequency();
        int int26 = mongoClientOptions21.getLocalThreshold();
        com.mongodb.ReadPreference readPreference27 = mongoClientOptions21.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder28 = builder10.readPreference(readPreference27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder28.legacyDefaults();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10000 + "'", int25 == 10000);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
        org.junit.Assert.assertNotNull(readPreference27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        java.lang.Integer int1 = java.lang.Integer.getInteger("-536870913");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        int int1 = java.lang.Integer.numberOfTrailingZeros(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("12", true, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 12");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = java.lang.Integer.valueOf("400000000", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 97 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        long long1 = java.lang.Integer.toUnsignedLong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        int int2 = java.lang.Integer.compare(1, (-2147456632));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        int int2 = java.lang.Integer.min(28, 16384);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        boolean boolean2 = mongoClientOptions1.isCursorFinalizerEnabled();
        int int3 = mongoClientOptions1.getHeartbeatConnectTimeout();
        com.mongodb.WriteConcern writeConcern4 = mongoClientOptions1.getWriteConcern();
        java.util.List<com.mongodb.event.CommandListener> commandListenerList5 = mongoClientOptions1.getCommandListeners();
        int int6 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int7 = mongoClientOptions1.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20000 + "'", int3 == 20000);
        org.junit.Assert.assertNotNull(writeConcern4);
        org.junit.Assert.assertNotNull(commandListenerList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20000 + "'", int6 == 20000);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
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
        java.util.List<com.mongodb.event.CommandListener> commandListenerList38 = mongoClientOptions30.getCommandListeners();
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
        org.junit.Assert.assertNotNull(commandListenerList38);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("64", 131072);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: radix 131072 greater than Character.MAX_RADIX");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        int int1 = java.lang.Integer.numberOfLeadingZeros(1261534);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        java.lang.String str1 = java.lang.Integer.toOctalString(6400000);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "30324000" + "'", str1, "30324000");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
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
        java.lang.String str24 = mongoProperties0.getUsername();
        mongoProperties0.authenticationDatabase = "10060000";
        java.lang.String str27 = mongoProperties0.database;
        java.lang.String str28 = mongoProperties0.database;
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10c944" + "'", str27, "10c944");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10c944" + "'", str28, "10c944");
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
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
        mongoProperties0.database = "133fde";
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
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
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
        com.mongodb.MongoClientOptions.Builder builder35 = builder22.dbEncoderFactory(dBEncoderFactory34);
        com.mongodb.MongoClientOptions.Builder builder37 = builder22.serverSelectionTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.socketKeepAlive(false);
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
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        int int2 = java.lang.Integer.max(7, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        java.lang.String str1 = java.lang.Integer.toBinaryString(7);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "111" + "'", str1, "111");
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Integer int1 = mongoProperties0.port;
        mongoProperties0.setAuthenticationDatabase("");
        mongoProperties0.setGridFsDatabase("30000");
        mongoProperties0.authenticationDatabase = "128";
        java.lang.Integer int8 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        com.mongodb.MongoClientOptions.Builder builder0 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = builder0.build();
        int int2 = mongoClientOptions1.getHeartbeatConnectTimeout();
        int int3 = mongoClientOptions1.getMaxConnectionIdleTime();
        int int4 = mongoClientOptions1.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int6 = mongoClientOptions1.getMinConnectionsPerHost();
        boolean boolean7 = mongoClientOptions1.isSslInvalidHostNameAllowed();
        int int8 = mongoClientOptions1.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int10 = mongoClientOptions1.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions1);
        int int12 = mongoClientOptions1.getMaxConnectionLifeTime();
        java.lang.Class<?> wildcardClass13 = mongoClientOptions1.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(mongoClientOptions1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20000 + "'", int2 == 20000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        int int1 = java.lang.Integer.bitCount((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        java.lang.ClassLoader classLoader2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = java.lang.Class.forName("25600", false, classLoader2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassNotFoundException; message: 25600");
        } catch (java.lang.ClassNotFoundException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        java.lang.Integer int1 = java.lang.Integer.getInteger("20000064610");
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = java.lang.Integer.parseUnsignedInt("-1", 30);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal leading minus sign on unsigned string -1.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        int int2 = java.lang.Integer.sum((int) 'a', 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
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
        java.lang.Class<?> wildcardClass49 = builder48.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        java.lang.String str2 = java.lang.Integer.toUnsignedString(0, 37748736);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
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
        mongoProperties0.setPort((java.lang.Integer) 525);
        mongoProperties0.setDatabase("19");
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        int int2 = java.lang.Integer.rotateRight(0, 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The connection string is invalid. Connection strings must start with 'mongodb://'");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.threadsAllowedToBlockForConnectionMultiplier(131072);
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
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.connectTimeout(20000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        char[] charArray18 = new char[] { '#', 'a', '#', 'a', '4', ' ' };
        mongoProperties11.password = charArray18;
        java.lang.Class<java.lang.Integer> intClass20 = java.lang.Integer.TYPE;
        mongoProperties11.fieldNamingStrategy = intClass20;
        java.lang.String str22 = mongoProperties11.username;
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        com.mongodb.MongoClientOptions.Builder builder24 = mongoProperties11.builder(mongoClientOptions23);
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        com.mongodb.MongoClientOptions.Builder builder26 = mongoProperties11.builder(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxConnectionIdleTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minConnectionsPerHost(24);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.threadsAllowedToBlockForConnectionMultiplier(20000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties33 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str34 = mongoProperties33.database;
        java.lang.String str35 = mongoProperties33.authenticationDatabase;
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        com.mongodb.MongoClientOptions.Builder builder37 = mongoProperties33.builder(mongoClientOptions36);
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxWaitTime((int) '4');
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.String str41 = mongoProperties40.database;
        mongoProperties40.setHost("mongodb://localhost/test");
        java.lang.String str44 = mongoProperties40.getHost();
        com.mongodb.MongoClientOptions.Builder builder45 = com.mongodb.MongoClientOptions.builder();
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder45.build();
        int int47 = mongoClientOptions46.getHeartbeatConnectTimeout();
        int int48 = mongoClientOptions46.getMaxConnectionIdleTime();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties40.builder(mongoClientOptions46);
        javax.net.SocketFactory socketFactory50 = mongoClientOptions46.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder51 = builder39.socketFactory(socketFactory50);
        com.mongodb.MongoClientOptions.Builder builder52 = builder28.socketFactory(socketFactory50);
        com.mongodb.MongoClientOptions.Builder builder53 = builder10.socketFactory(socketFactory50);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#a#a4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, a, #, a, 4,  ]");
        org.junit.Assert.assertNotNull(intClass20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "mongodb://localhost/test" + "'", str44, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20000 + "'", int47 == 20000);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(socketFactory50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        int int1 = java.lang.Integer.signum((-570425344));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxConnectionLifeTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.socketKeepAlive(false);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.build();
        java.lang.String str7 = mongoClientOptions6.getDescription();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder(mongoClientOptions6);
        int int9 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int10 = mongoClientOptions6.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions6.getMinConnectionsPerHost();
        int int12 = mongoClientOptions6.getServerSelectionTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30000 + "'", int12 == 30000);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        java.lang.String str1 = java.lang.Integer.toUnsignedString(34);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34" + "'", str1, "34");
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
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
        com.mongodb.MongoClientOptions.Builder builder59 = builder12.minHeartbeatFrequency(25600);
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
        org.junit.Assert.assertNotNull(builder59);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
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
        java.lang.String str22 = mongoProperties0.gridFsDatabase;
        mongoProperties0.gridFsDatabase = "64";
        java.lang.Integer int25 = mongoProperties0.port;
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        java.lang.String str2 = java.lang.Integer.toUnsignedString((int) (short) -1, 1261534);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4294967295" + "'", str2, "4294967295");
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        int int1 = java.lang.Integer.signum(32768);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatSocketTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.localThreshold((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(1552);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.sslInvalidHostNameAllowed(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }
}

