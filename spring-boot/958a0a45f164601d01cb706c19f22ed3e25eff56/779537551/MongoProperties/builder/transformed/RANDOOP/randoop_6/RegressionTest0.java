import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int int0 = org.springframework.boot.autoconfigure.mongo.MongoProperties.DEFAULT_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        javax.net.SocketFactory socketFactory1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder2 = builder0.socketFactory(socketFactory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.DBDecoderFactory dBDecoderFactory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.dbDecoderFactory(dBDecoderFactory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.WriteConcern writeConcern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.writeConcern(writeConcern5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.acceptableLatencyDifference((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acceptableLatencyDifference must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.WriteConcern writeConcern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder4 = builder2.writeConcern(writeConcern3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        javax.net.SocketFactory socketFactory3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder4 = builder0.socketFactory(socketFactory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder4.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder7 = builder4.heartbeatThreadCount(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        javax.net.SocketFactory socketFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketFactory(socketFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder2.minHeartbeatFrequency((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder0.minConnectionsPerHost((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder4 = builder2.heartbeatFrequency((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.WriteConcern writeConcern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder2.writeConcern(writeConcern9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder5.heartbeatConnectRetryFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.WriteConcern writeConcern3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder4 = builder0.writeConcern(writeConcern3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.WriteConcern writeConcern7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder2.writeConcern(writeConcern7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder2.heartbeatThreadCount((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.minHeartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(true);
        com.mongodb.WriteConcern writeConcern9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.writeConcern(writeConcern9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.autoConnectRetry(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxConnectionLifeTime((int) (short) -1);
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder0.maxConnectionIdleTime((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.dbDecoderFactory(dBDecoderFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.ReadPreference readPreference5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.readPreference(readPreference5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.socketKeepAlive(true);
        com.mongodb.DBEncoderFactory dBEncoderFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.dbEncoderFactory(dBEncoderFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketTimeout(27017);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        javax.net.SocketFactory socketFactory5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder2.socketFactory(socketFactory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.alwaysUseMBeans(true);
        javax.net.SocketFactory socketFactory9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder4.socketFactory(socketFactory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.localThreshold((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.alwaysUseMBeans(true);
        com.mongodb.ReadPreference readPreference9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder4.readPreference(readPreference9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.DBEncoderFactory dBEncoderFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder0.dbEncoderFactory(dBEncoderFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        javax.net.SocketFactory socketFactory8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder7.socketFactory(socketFactory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.requiredReplicaSetName("");
        com.mongodb.DBDecoderFactory dBDecoderFactory7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.dbDecoderFactory(dBDecoderFactory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder4.connectTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.acceptableLatencyDifference((int) (short) 1);
        com.mongodb.DBDecoderFactory dBDecoderFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.dbDecoderFactory(dBDecoderFactory15);
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
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.autoConnectRetry(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.minHeartbeatFrequency((int) (short) 0);
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.requiredReplicaSetName("");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder2.threadsAllowedToBlockForConnectionMultiplier(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.acceptableLatencyDifference((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime((int) (byte) -1);
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(5000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder5 = builder3.connectionsPerHost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.host = "test";
        java.lang.String str6 = mongoProperties0.getUsername();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.maxConnectionIdleTime((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder6.maxWaitTime((int) (short) -1);
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
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionLifeTime((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectionsPerHost((int) (short) 0);
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxAutoConnectRetryTime((-1L));
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatFrequency(100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.threadsAllowedToBlockForConnectionMultiplier((-1));
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray3 = mongoProperties0.getPassword();
        mongoProperties0.host = "hi!";
        mongoProperties0.port = 5;
        java.lang.String str8 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass9 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory17 = mongoClientOptions14.getSocketFactory();
        int int18 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int19 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties0.builder(mongoClientOptions14);
        int int21 = mongoClientOptions14.getLocalThreshold();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        long long8 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int9 = mongoClientOptions7.getMinConnectionsPerHost();
        java.lang.Class<?> wildcardClass10 = mongoClientOptions7.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatConnectTimeout(100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder12.heartbeatConnectRetryFrequency((int) (byte) -1);
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
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatConnectRetryFrequency(20000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.minConnectionsPerHost((int) (short) -1);
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder4.connectionsPerHost((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectionsPerHost((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        com.mongodb.ReadPreference readPreference17 = mongoClientOptions16.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder18 = builder6.readPreference(readPreference17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder6.minConnectionsPerHost(10000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(readPreference17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.heartbeatThreadCount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder6.maxConnectionLifeTime((int) (short) -1);
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
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        javax.net.SocketFactory socketFactory15 = mongoClientOptions14.getSocketFactory();
        long long16 = mongoClientOptions14.getMaxAutoConnectRetryTime();
        int int17 = mongoClientOptions14.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions14.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions14.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder4.dbEncoderFactory(dBEncoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxConnectionIdleTime((int) (byte) 100);
        javax.net.SocketFactory socketFactory23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder24 = builder22.socketFactory(socketFactory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(socketFactory15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder4.maxWaitTime((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.getDatabase();
        mongoProperties0.setHost("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder18.build();
        int int20 = mongoClientOptions19.getMinHeartbeatFrequency();
        int int21 = mongoClientOptions19.getMaxWaitTime();
        org.springframework.core.env.Environment environment22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient23 = mongoProperties0.createMongoClient(mongoClientOptions19, environment22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: can't specify port in construct and via host");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120000 + "'", int21 == 120000);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.fieldNamingStrategy;
        int int7 = mongoProperties0.getDEFAULT_PORT();
        char[] charArray8 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(charArray8);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.heartbeatFrequency(120000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder9.minHeartbeatFrequency((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.Class<?> wildcardClass5 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str6 = mongoProperties0.getUri();
        mongoProperties0.authenticationDatabase = "hi!";
        mongoProperties0.port = 0;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.database = "";
        java.lang.String str7 = mongoProperties0.getMongoClientDatabase();
        char[] charArray8 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(charArray8);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.connectTimeout((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder5.maxConnectionLifeTime((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.minHeartbeatFrequency((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass19 = mongoProperties18.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass20 = mongoProperties18.getFieldNamingStrategy();
        mongoProperties18.port = 10;
        mongoProperties18.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions25 = null;
        com.mongodb.MongoClient mongoClient26 = mongoProperties18.createMongoClient(mongoClientOptions25);
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        org.springframework.core.env.Environment environment35 = null;
        com.mongodb.MongoClient mongoClient36 = mongoProperties18.createMongoClient(mongoClientOptions34, environment35);
        com.mongodb.DBEncoderFactory dBEncoderFactory37 = mongoClientOptions34.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder38 = builder11.dbEncoderFactory(dBEncoderFactory37);
        com.mongodb.MongoClientOptions.Builder builder39 = builder2.dbEncoderFactory(dBEncoderFactory37);
        java.lang.Class<?> wildcardClass40 = builder39.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNotNull(mongoClient26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(mongoClient36);
        org.junit.Assert.assertNotNull(dBEncoderFactory37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatFrequency((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.description("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        java.lang.String str5 = mongoProperties0.uri;
        mongoProperties0.uri = "test";
        mongoProperties0.username = "";
        mongoProperties0.gridFsDatabase = "hi!";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions16.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.socketFactory(socketFactory17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold(1);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.description("");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        com.mongodb.ReadPreference readPreference38 = mongoClientOptions37.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder39 = builder27.readPreference(readPreference38);
        com.mongodb.MongoClientOptions.Builder builder40 = builder18.readPreference(readPreference38);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder42 = builder40.threadsAllowedToBlockForConnectionMultiplier((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(readPreference38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions7.getSocketFactory();
        int int11 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions7.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.acceptableLatencyDifference((int) ' ');
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass17;
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        mongoProperties0.setPort((java.lang.Integer) 27017);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionLifeTime((-1));
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.acceptableLatencyDifference((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.threadsAllowedToBlockForConnectionMultiplier((int) (byte) 0);
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.heartbeatThreadCount((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        java.lang.String str6 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions14.isSocketKeepAlive();
        int int17 = mongoClientOptions14.getHeartbeatThreadCount();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions14, environment19);
        java.lang.Class<?> wildcardClass21 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int22 = mongoProperties0.getPort();
        mongoProperties0.authenticationDatabase = "hi!";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionIdleTime(27017);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency((int) (byte) -1);
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
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.acceptableLatencyDifference((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatConnectRetryFrequency((int) (byte) -1);
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
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((-1L));
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.uri;
        mongoProperties0.setHost("");
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.username = "hi!";
        mongoProperties0.gridFsDatabase = "";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb://localhost/test" + "'", str3, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatConnectTimeout(5000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder4.maxWaitTime((int) (short) -1);
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.heartbeatConnectTimeout((int) ' ');
        com.mongodb.DBDecoderFactory dBDecoderFactory12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder6.dbDecoderFactory(dBDecoderFactory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        javax.net.SocketFactory socketFactory28 = mongoClientOptions27.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder29 = builder19.socketFactory(socketFactory28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder10.socketFactory(socketFactory28);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder32 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass15 = mongoProperties14.fieldNamingStrategy;
        boolean boolean16 = mongoProperties14.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        com.mongodb.MongoClient mongoClient25 = mongoProperties14.createMongoClient(mongoClientOptions24);
        int int26 = mongoClientOptions24.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions24.getWriteConcern();
        com.mongodb.ReadPreference readPreference28 = mongoClientOptions24.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder29 = builder13.readPreference(readPreference28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder8.readPreference(readPreference28);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder32 = builder30.heartbeatFrequency((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(writeConcern27);
        org.junit.Assert.assertNotNull(readPreference28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minHeartbeatFrequency((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass10 = mongoProperties9.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass11 = mongoProperties9.getFieldNamingStrategy();
        mongoProperties9.port = 10;
        mongoProperties9.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions16 = null;
        com.mongodb.MongoClient mongoClient17 = mongoProperties9.createMongoClient(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        org.springframework.core.env.Environment environment26 = null;
        com.mongodb.MongoClient mongoClient27 = mongoProperties9.createMongoClient(mongoClientOptions25, environment26);
        com.mongodb.DBEncoderFactory dBEncoderFactory28 = mongoClientOptions25.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder29 = builder2.dbEncoderFactory(dBEncoderFactory28);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder31 = builder29.socketTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(dBEncoderFactory28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.username;
        java.lang.String str3 = mongoProperties0.host;
        mongoProperties0.clearPassword();
        mongoProperties0.setHost("hi!");
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        org.springframework.core.env.Environment environment8 = null;
        int int9 = mongoProperties0.determinePort(environment8);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        boolean boolean5 = mongoProperties0.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass7 = mongoProperties6.fieldNamingStrategy;
        boolean boolean8 = mongoProperties6.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        com.mongodb.MongoClient mongoClient17 = mongoProperties6.createMongoClient(mongoClientOptions16);
        int int18 = mongoClientOptions16.getMaxWaitTime();
        java.lang.String str19 = mongoClientOptions16.toString();
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions16);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.connectTimeout(97);
        java.lang.Class<?> wildcardClass30 = builder29.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass30;
        char[] charArray32 = mongoProperties0.password;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120000 + "'", int18 == 120000);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNull(charArray32);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        java.lang.String str6 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions14.isSocketKeepAlive();
        int int17 = mongoClientOptions14.getHeartbeatThreadCount();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions14, environment19);
        java.lang.String str21 = mongoClientOptions14.getRequiredReplicaSetName();
        java.lang.String str22 = mongoClientOptions14.getRequiredReplicaSetName();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.acceptableLatencyDifference((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime(27017);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatThreadCount((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getLocalThreshold();
        int int9 = mongoClientOptions7.getMaxWaitTime();
        int int10 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int11 = mongoClientOptions7.getMaxWaitTime();
        int int12 = mongoClientOptions7.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 120000 + "'", int11 == 120000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5000 + "'", int12 == 5000);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str7 = mongoProperties0.getDatabase();
        mongoProperties0.setGridFsDatabase("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectTimeout((int) '4');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minHeartbeatFrequency(15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketTimeout(20000);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatThreadCount((int) '4');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.heartbeatConnectTimeout((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder13 = builder11.heartbeatConnectRetryFrequency((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        mongoProperties0.setPort((java.lang.Integer) 97);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost(500);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        int int13 = mongoClientOptions7.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.minHeartbeatFrequency((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatConnectRetryFrequency((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions12.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder14 = builder0.socketFactory(socketFactory13);
        com.mongodb.MongoClientOptions.Builder builder16 = builder0.minConnectionsPerHost((int) '#');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.acceptableLatencyDifference(10000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder2.maxAutoConnectRetryTime((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int9 = mongoClientOptions7.getMaxWaitTime();
        int int10 = mongoClientOptions7.getHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions7.getDbDecoderFactory();
        int int12 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory17 = mongoClientOptions14.getSocketFactory();
        int int18 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int19 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.String str21 = mongoProperties0.getUri();
        mongoProperties0.username = "";
        java.lang.Integer int24 = mongoProperties0.port;
        java.lang.Integer int25 = mongoProperties0.getPort();
        mongoProperties0.database = "";
        java.lang.String str28 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb://localhost/test" + "'", str21, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.autoConnectRetry(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxAutoConnectRetryTime((long) (byte) -1);
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
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("hi!");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxAutoConnectRetryTime((long) 27017);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.acceptableLatencyDifference((-1));
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
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.acceptableLatencyDifference((int) ' ');
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass17;
        java.lang.String str19 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.username = "hi!";
        mongoProperties0.uri = "test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatThreadCount(500);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder19 = builder16.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties22 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass23 = mongoProperties22.fieldNamingStrategy;
        boolean boolean24 = mongoProperties22.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder25 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.build();
        com.mongodb.MongoClient mongoClient33 = mongoProperties22.createMongoClient(mongoClientOptions32);
        int int34 = mongoClientOptions32.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern35 = mongoClientOptions32.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder36 = builder19.writeConcern(writeConcern35);
        com.mongodb.MongoClientOptions.Builder builder37 = builder13.writeConcern(writeConcern35);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties38 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass39 = mongoProperties38.fieldNamingStrategy;
        boolean boolean40 = mongoProperties38.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.build();
        com.mongodb.MongoClient mongoClient49 = mongoProperties38.createMongoClient(mongoClientOptions48);
        int int50 = mongoClientOptions48.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern51 = mongoClientOptions48.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder52 = builder37.writeConcern(writeConcern51);
        com.mongodb.MongoClientOptions.Builder builder53 = builder4.writeConcern(writeConcern51);
        com.mongodb.MongoClientOptions.Builder builder55 = builder4.minConnectionsPerHost((int) 'a');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(mongoClient33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(writeConcern35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertNotNull(mongoClient49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(writeConcern51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder6.threadsAllowedToBlockForConnectionMultiplier((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getHeartbeatSocketTimeout();
        int int16 = mongoClientOptions14.getHeartbeatFrequency();
        boolean boolean17 = mongoClientOptions14.isSocketKeepAlive();
        int int18 = mongoClientOptions14.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions14.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder26.build();
        int int28 = mongoClientOptions27.getMinHeartbeatFrequency();
        int int29 = mongoClientOptions27.getConnectTimeout();
        boolean boolean30 = mongoClientOptions14.equals((java.lang.Object) mongoClientOptions27);
        org.springframework.core.env.Environment environment31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties0.createMongoClient(mongoClientOptions14, environment31);
        java.lang.String str33 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5000 + "'", int16 == 5000);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 120000 + "'", int18 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 500 + "'", int28 == 500);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10000 + "'", int29 == 10000);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mongoClient32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.maxAutoConnectRetryTime((long) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (-1));
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatThreadCount((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions16.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.socketFactory(socketFactory17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatSocketTimeout((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder22 = builder18.maxConnectionIdleTime((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions7.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions7.getDbEncoderFactory();
        long long10 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str12 = mongoClientOptions7.getRequiredReplicaSetName();
        boolean boolean13 = mongoClientOptions7.isAutoConnectRetry();
        com.mongodb.DBEncoderFactory dBEncoderFactory14 = mongoClientOptions7.getDbEncoderFactory();
        java.lang.String str15 = mongoClientOptions7.toString();
        int int16 = mongoClientOptions7.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dBEncoderFactory14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.database;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        javax.net.SocketFactory socketFactory15 = mongoClientOptions14.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory16 = mongoClientOptions14.getDbEncoderFactory();
        int int17 = mongoClientOptions14.getAcceptableLatencyDifference();
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions14);
        long long19 = mongoClientOptions14.getMaxAutoConnectRetryTime();
        int int20 = mongoClientOptions14.getMinConnectionsPerHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(socketFactory15);
        org.junit.Assert.assertNotNull(dBEncoderFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatThreadCount();
        int int10 = mongoClientOptions7.getHeartbeatThreadCount();
        boolean boolean12 = mongoClientOptions7.equals((java.lang.Object) 100L);
        int int13 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int14 = mongoClientOptions7.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions12.getSocketFactory();
        long long14 = mongoClientOptions12.getMaxAutoConnectRetryTime();
        int int15 = mongoClientOptions12.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern16 = mongoClientOptions12.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory17 = mongoClientOptions12.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder4.dbEncoderFactory(dBEncoderFactory17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder4.heartbeatConnectRetryFrequency(100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(writeConcern16);
        org.junit.Assert.assertNotNull(dBEncoderFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder13 = builder6.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.description("mongodb://localhost/test");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatConnectTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatConnectTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        char[] charArray12 = mongoProperties0.getPassword();
        mongoProperties0.setUsername("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxWaitTime((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder4.connectionsPerHost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        long long8 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int9 = mongoClientOptions7.getMinConnectionsPerHost();
        int int10 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int11 = mongoClientOptions7.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getLocalThreshold();
        boolean boolean14 = mongoClientOptions12.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions12.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions12.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = builder2.dbDecoderFactory(dBDecoderFactory16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minConnectionsPerHost((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder21 = builder17.socketTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.cursorFinalizerEnabled(true);
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.dbEncoderFactory(dBEncoderFactory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxWaitTime((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.maxConnectionIdleTime(0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder8.threadsAllowedToBlockForConnectionMultiplier((-1));
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        java.lang.String str9 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setPort((java.lang.Integer) 5);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder12.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder12.heartbeatThreadCount(0);
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
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxWaitTime(20000);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.connectTimeout((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatFrequency((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxAutoConnectRetryTime((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.threadsAllowedToBlockForConnectionMultiplier((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions7.getDbEncoderFactory();
        long long10 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str12 = mongoClientOptions7.getRequiredReplicaSetName();
        boolean boolean13 = mongoClientOptions7.isAutoConnectRetry();
        int int14 = mongoClientOptions7.getMaxWaitTime();
        int int15 = mongoClientOptions7.getConnectionsPerHost();
        java.lang.String str16 = mongoClientOptions7.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        int int12 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        int int13 = mongoClientOptions7.getHeartbeatThreadCount();
        java.lang.String str14 = mongoClientOptions7.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.threadsAllowedToBlockForConnectionMultiplier((int) (short) -1);
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions10.getSocketFactory();
        org.springframework.core.env.Environment environment12 = null;
        com.mongodb.MongoClient mongoClient13 = mongoProperties0.createMongoClient(mongoClientOptions10, environment12);
        char[] charArray14 = mongoProperties0.password;
        java.lang.String str15 = mongoProperties0.getHost();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertNotNull(mongoClient13);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatFrequency((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatSocketTimeout(10000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        mongoProperties0.setPort((java.lang.Integer) 10000);
        mongoProperties0.setPort((java.lang.Integer) 500);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        javax.net.SocketFactory socketFactory28 = mongoClientOptions27.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder29 = builder19.socketFactory(socketFactory28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder10.socketFactory(socketFactory28);
        com.mongodb.MongoClientOptions.Builder builder32 = builder10.maxWaitTime((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder34 = builder10.connectionsPerHost((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
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
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        java.lang.String str6 = mongoProperties0.getUsername();
        mongoProperties0.port = 0;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(true);
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.dbEncoderFactory(dBEncoderFactory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions15.getSocketFactory();
        int int17 = mongoClientOptions15.getLocalThreshold();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions15, environment18);
        java.lang.String str20 = mongoProperties0.getUsername();
        java.lang.Class<?> wildcardClass21 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getLocalThreshold();
        boolean boolean16 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions14.getReadPreference();
        com.mongodb.ReadPreference readPreference19 = mongoClientOptions14.getReadPreference();
        int int20 = mongoClientOptions14.getAcceptableLatencyDifference();
        int int21 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertNotNull(readPreference19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.description("");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder17 = builder9.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder19 = builder9.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder20.minConnectionsPerHost((int) (byte) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass28 = mongoProperties27.fieldNamingStrategy;
        boolean boolean29 = mongoProperties27.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        com.mongodb.MongoClient mongoClient38 = mongoProperties27.createMongoClient(mongoClientOptions37);
        com.mongodb.DBDecoderFactory dBDecoderFactory39 = mongoClientOptions37.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder20.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder19.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder6.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder44 = builder6.acceptableLatencyDifference(5);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(mongoClient38);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        java.lang.String str12 = mongoClientOptions10.getDescription();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions10.getSocketFactory();
        boolean boolean14 = mongoClientOptions10.isSocketKeepAlive();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions15.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = builder7.socketFactory(socketFactory16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder7.maxConnectionLifeTime(15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray3 = mongoProperties0.getPassword();
        mongoProperties0.host = "hi!";
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getHost();
        java.lang.String str8 = mongoProperties0.authenticationDatabase;
        mongoProperties0.host = "";
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.database = "";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setHost("mongodb://localhost/test");
        mongoProperties0.username = "";
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass12 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.host = "hi!";
        int int15 = mongoProperties11.getDEFAULT_PORT();
        mongoProperties11.host = "";
        java.lang.String str18 = mongoProperties11.uri;
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder27 = builder21.connectTimeout((int) (short) 1);
        java.lang.Class<?> wildcardClass28 = builder27.getClass();
        mongoProperties11.fieldNamingStrategy = wildcardClass28;
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        int int38 = mongoClientOptions37.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.description("");
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.autoConnectRetry(false);
        boolean boolean46 = mongoClientOptions37.equals((java.lang.Object) false);
        java.lang.String str47 = mongoClientOptions37.getDescription();
        int int48 = mongoClientOptions37.getMinHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder49 = mongoProperties11.builder(mongoClientOptions37);
        int int50 = mongoClientOptions37.getHeartbeatConnectTimeout();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient51 = mongoProperties0.createMongoClient(mongoClientOptions37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: can't specify port in construct and via host");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 20000 + "'", int38 == 20000);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 500 + "'", int48 == 500);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20000 + "'", int50 == 20000);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.minConnectionsPerHost((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatConnectTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatConnectTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.getDatabase();
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.core.env.Environment environment11 = null;
        int int12 = mongoProperties0.determinePort(environment11);
        mongoProperties0.setUri("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getLocalThreshold();
        boolean boolean16 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        boolean boolean18 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int19 = mongoClientOptions14.getLocalThreshold();
        boolean boolean20 = mongoClientOptions14.isCursorFinalizerEnabled();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        java.lang.String str9 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setGridFsDatabase("mongodb://localhost/test");
        mongoProperties0.setUri("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.minHeartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.description("");
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder30 = builder26.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder32 = builder26.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder41 = builder35.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder42 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions49 = builder46.build();
        javax.net.SocketFactory socketFactory50 = mongoClientOptions49.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder51 = builder41.socketFactory(socketFactory50);
        com.mongodb.MongoClientOptions.Builder builder52 = builder32.socketFactory(socketFactory50);
        com.mongodb.MongoClientOptions.Builder builder53 = builder21.socketFactory(socketFactory50);
        com.mongodb.MongoClientOptions.Builder builder54 = builder0.socketFactory(socketFactory50);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder56 = builder0.socketTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(mongoClientOptions49);
        org.junit.Assert.assertNotNull(socketFactory50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory17 = mongoClientOptions14.getSocketFactory();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14, environment18);
        mongoProperties0.uri = "mongodb://localhost/test";
        java.lang.Integer int22 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        int int13 = mongoClientOptions10.getAcceptableLatencyDifference();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.uri;
        mongoProperties0.setPort((java.lang.Integer) 20000);
        char[] charArray12 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray12);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.getHost();
        mongoProperties0.setUsername("test");
        java.lang.String str10 = mongoProperties0.getHost();
        java.lang.String str11 = mongoProperties0.uri;
        mongoProperties0.setUri("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        boolean boolean9 = mongoClientOptions7.isSocketKeepAlive();
        int int10 = mongoClientOptions7.getHeartbeatThreadCount();
        int int11 = mongoClientOptions7.getMaxConnectionLifeTime();
        boolean boolean12 = mongoClientOptions7.isAutoConnectRetry();
        int int13 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int14 = mongoClientOptions7.getConnectTimeout();
        int int15 = mongoClientOptions7.getMaxWaitTime();
        int int16 = mongoClientOptions7.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120000 + "'", int15 == 120000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20000 + "'", int16 == 20000);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.minConnectionsPerHost(5);
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.connectionsPerHost(97);
        com.mongodb.MongoClientOptions.Builder builder12 = builder4.heartbeatFrequency(500);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxAutoConnectRetryTime((long) (short) 10);
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.setDatabase("");
        mongoProperties0.database = "mongodb://localhost/test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions7.getSocketFactory();
        int int11 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions7.getMaxConnectionLifeTime();
        com.mongodb.WriteConcern writeConcern13 = mongoClientOptions7.getWriteConcern();
        int int14 = mongoClientOptions7.getSocketTimeout();
        int int15 = mongoClientOptions7.getHeartbeatSocketTimeout();
        int int16 = mongoClientOptions7.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(writeConcern13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10000 + "'", int16 == 10000);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.socketTimeout((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxWaitTime((-1));
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
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions7.getSocketFactory();
        int int12 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        int int13 = mongoClientOptions7.getMaxWaitTime();
        boolean boolean14 = mongoClientOptions7.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 500 + "'", int12 == 500);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.maxAutoConnectRetryTime((long) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime(97);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        java.lang.String str6 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions14.isSocketKeepAlive();
        int int17 = mongoClientOptions14.getHeartbeatThreadCount();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions14, environment19);
        java.lang.Class<?> wildcardClass21 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int22 = mongoProperties0.getPort();
        mongoProperties0.host = "";
        java.lang.Integer int25 = mongoProperties0.port;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.heartbeatFrequency(100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.acceptableLatencyDifference((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatThreadCount((-1));
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
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        mongoProperties0.setUri("test");
        int int9 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.maxConnectionLifeTime(27017);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.minHeartbeatFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.heartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.socketKeepAlive(true);
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray3 = mongoProperties0.getPassword();
        mongoProperties0.host = "hi!";
        java.lang.String str6 = mongoProperties0.gridFsDatabase;
        java.lang.String str7 = mongoProperties0.getUri();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass9 = mongoProperties8.fieldNamingStrategy;
        boolean boolean10 = mongoProperties8.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder15.build();
        com.mongodb.MongoClient mongoClient19 = mongoProperties8.createMongoClient(mongoClientOptions18);
        org.springframework.core.env.Environment environment20 = null;
        com.mongodb.MongoClient mongoClient21 = mongoProperties0.createMongoClient(mongoClientOptions18, environment20);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(mongoClientOptions18);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(mongoClient21);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime(1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder4.connectionsPerHost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.minConnectionsPerHost((int) (byte) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass8 = mongoProperties7.fieldNamingStrategy;
        boolean boolean9 = mongoProperties7.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        com.mongodb.MongoClient mongoClient18 = mongoProperties7.createMongoClient(mongoClientOptions17);
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder0.dbDecoderFactory(dBDecoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.description("");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        com.mongodb.ReadPreference readPreference38 = mongoClientOptions37.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder39 = builder27.readPreference(readPreference38);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder46 = builder44.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder44.build();
        javax.net.SocketFactory socketFactory48 = mongoClientOptions47.getSocketFactory();
        long long49 = mongoClientOptions47.getMaxAutoConnectRetryTime();
        int int50 = mongoClientOptions47.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory51 = mongoClientOptions47.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder52 = builder39.dbDecoderFactory(dBDecoderFactory51);
        com.mongodb.MongoClientOptions.Builder builder53 = builder0.dbDecoderFactory(dBDecoderFactory51);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(readPreference38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertNotNull(socketFactory48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 10L + "'", long49 == 10L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 20000 + "'", int50 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.heartbeatConnectTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxConnectionIdleTime(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatSocketTimeout((int) (short) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions7.getSocketFactory();
        int int12 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        int int13 = mongoClientOptions7.getMaxWaitTime();
        int int14 = mongoClientOptions7.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 500 + "'", int12 == 500);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 120000 + "'", int13 == 120000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions16.getSocketFactory();
        long long18 = mongoClientOptions16.getMaxAutoConnectRetryTime();
        int int19 = mongoClientOptions16.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory20 = mongoClientOptions16.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder21 = builder8.dbEncoderFactory(dBEncoderFactory20);
        com.mongodb.MongoClientOptions.Builder builder23 = builder8.heartbeatConnectTimeout(15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 20000 + "'", int19 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass6 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str7 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions7.getDbEncoderFactory();
        long long10 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int11 = mongoClientOptions7.getConnectionsPerHost();
        int int12 = mongoClientOptions7.getConnectionsPerHost();
        int int13 = mongoClientOptions7.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.autoConnectRetry(false);
        boolean boolean16 = mongoClientOptions7.equals((java.lang.Object) false);
        int int17 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions7.getWriteConcern();
        int int19 = mongoClientOptions7.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 500 + "'", int17 == 500);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        int int13 = mongoClientOptions10.getMinHeartbeatFrequency();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getLocalThreshold();
        boolean boolean9 = mongoClientOptions7.isCursorFinalizerEnabled();
        java.lang.String str10 = mongoClientOptions7.getRequiredReplicaSetName();
        boolean boolean11 = mongoClientOptions7.isAlwaysUseMBeans();
        int int12 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.heartbeatConnectRetryFrequency((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder20.build();
        javax.net.SocketFactory socketFactory24 = mongoClientOptions23.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder11.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions.Builder builder26 = builder6.socketFactory(socketFactory24);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder28 = builder6.connectionsPerHost((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(mongoClientOptions23);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray8 = new char[] { '#', 'a' };
        mongoProperties0.password = charArray8;
        mongoProperties0.setUri("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout((int) (short) -1);
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatFrequency((int) (byte) 1);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder8.build();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder15 = builder8.maxConnectionLifeTime((int) (short) -1);
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
        org.junit.Assert.assertNotNull(mongoClientOptions13);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        java.lang.String str6 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions14.isSocketKeepAlive();
        int int17 = mongoClientOptions14.getHeartbeatThreadCount();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions14, environment19);
        java.lang.Class<?> wildcardClass21 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Integer int22 = mongoProperties0.getPort();
        mongoProperties0.host = "";
        mongoProperties0.setGridFsDatabase("hi!");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.setDatabase("");
        java.lang.String str9 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime((long) 500);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        int int17 = mongoClientOptions16.getHeartbeatSocketTimeout();
        int int18 = mongoClientOptions16.getHeartbeatFrequency();
        boolean boolean19 = mongoClientOptions16.isSocketKeepAlive();
        int int20 = mongoClientOptions16.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions16.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder22 = builder2.writeConcern(writeConcern21);
        com.mongodb.MongoClientOptions.Builder builder24 = builder2.minConnectionsPerHost((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5000 + "'", int18 == 5000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 120000 + "'", int20 == 120000);
        org.junit.Assert.assertNotNull(writeConcern21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getLocalThreshold();
        boolean boolean19 = mongoClientOptions17.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions17.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder7.dbDecoderFactory(dBDecoderFactory21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder29.build();
        int int31 = mongoClientOptions30.getSocketTimeout();
        int int32 = mongoClientOptions30.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference33 = mongoClientOptions30.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder34 = builder22.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder0.readPreference(readPreference33);
        java.lang.Class<?> wildcardClass36 = readPreference33.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(readPreference33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxAutoConnectRetryTime((long) ' ');
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.maxAutoConnectRetryTime((long) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketTimeout((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.uri;
        mongoProperties0.setHost("");
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.username = "hi!";
        java.lang.Class<?> wildcardClass9 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str10 = mongoProperties0.host;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb://localhost/test" + "'", str3, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        org.springframework.core.env.Environment environment15 = null;
        com.mongodb.MongoClient mongoClient16 = mongoProperties0.createMongoClient(mongoClientOptions14, environment15);
        java.lang.String str17 = mongoClientOptions14.toString();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions22.getReadPreference();
        boolean boolean24 = mongoClientOptions14.equals((java.lang.Object) mongoClientOptions22);
        java.lang.String str25 = mongoClientOptions22.getDescription();
        int int26 = mongoClientOptions22.getHeartbeatSocketTimeout();
        boolean boolean27 = mongoClientOptions22.isCursorFinalizerEnabled();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(readPreference23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20000 + "'", int26 == 20000);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getLocalThreshold();
        boolean boolean9 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int10 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions7.getDbDecoderFactory();
        int int12 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions7.getSocketTimeout();
        boolean boolean14 = mongoClientOptions7.isAutoConnectRetry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.minConnectionsPerHost((int) (byte) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass21 = mongoProperties20.fieldNamingStrategy;
        boolean boolean22 = mongoProperties20.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        com.mongodb.MongoClient mongoClient31 = mongoProperties20.createMongoClient(mongoClientOptions30);
        com.mongodb.DBDecoderFactory dBDecoderFactory32 = mongoClientOptions30.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder33 = builder13.dbDecoderFactory(dBDecoderFactory32);
        com.mongodb.MongoClientOptions.Builder builder34 = builder12.dbDecoderFactory(dBDecoderFactory32);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder36 = builder34.threadsAllowedToBlockForConnectionMultiplier(0);
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
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(mongoClient31);
        org.junit.Assert.assertNotNull(dBDecoderFactory32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        boolean boolean9 = mongoClientOptions7.isSocketKeepAlive();
        int int10 = mongoClientOptions7.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10000 + "'", int10 == 10000);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.getHost();
        mongoProperties0.clearPassword();
        java.lang.String str8 = mongoProperties0.getUri();
        java.lang.Class<?> wildcardClass9 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.localThreshold((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatConnectRetryFrequency((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        int int13 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions7.getMinConnectionsPerHost();
        int int15 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int16 = mongoClientOptions7.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.minHeartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder12 = builder0.heartbeatConnectTimeout(5000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder0.heartbeatThreadCount((int) (short) 0);
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
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int9 = mongoClientOptions7.getMaxWaitTime();
        boolean boolean10 = mongoClientOptions7.isAutoConnectRetry();
        int int11 = mongoClientOptions7.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int9 = mongoClientOptions7.getConnectTimeout();
        int int10 = mongoClientOptions7.getMaxWaitTime();
        int int11 = mongoClientOptions7.getHeartbeatThreadCount();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        java.lang.String str13 = mongoClientOptions7.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10000 + "'", int9 == 10000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        int int13 = mongoClientOptions7.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory14 = mongoClientOptions7.getDbEncoderFactory();
        boolean boolean15 = mongoClientOptions7.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions7.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.host = "test";
        java.lang.String str6 = mongoProperties0.uri;
        mongoProperties0.setGridFsDatabase("test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray3 = mongoProperties0.getPassword();
        mongoProperties0.setDatabase("test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(charArray3);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions19);
        mongoProperties0.gridFsDatabase = "mongodb://localhost/test";
        mongoProperties0.setHost("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.getDatabase();
        mongoProperties0.setHost("mongodb://localhost/test");
        java.lang.String str12 = mongoProperties0.getMongoClientDatabase();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.build();
        boolean boolean21 = mongoClientOptions20.isSocketKeepAlive();
        boolean boolean22 = mongoClientOptions20.isSocketKeepAlive();
        int int23 = mongoClientOptions20.getHeartbeatThreadCount();
        int int24 = mongoClientOptions20.getMaxConnectionLifeTime();
        boolean boolean25 = mongoClientOptions20.isAutoConnectRetry();
        int int26 = mongoClientOptions20.getHeartbeatConnectRetryFrequency();
        int int27 = mongoClientOptions20.getMaxConnectionLifeTime();
        int int28 = mongoClientOptions20.getMinHeartbeatFrequency();
        int int29 = mongoClientOptions20.getMinConnectionsPerHost();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient30 = mongoProperties0.createMongoClient(mongoClientOptions20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: can't specify port in construct and via host");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 500 + "'", int28 == 500);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.socketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder15 = builder6.legacyDefaults();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder9.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatFrequency((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.description("");
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.description("");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder27 = builder23.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder23.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder36 = builder32.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder38 = builder32.minHeartbeatFrequency((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties39 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass40 = mongoProperties39.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass41 = mongoProperties39.getFieldNamingStrategy();
        mongoProperties39.port = 10;
        mongoProperties39.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        com.mongodb.MongoClient mongoClient47 = mongoProperties39.createMongoClient(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions55 = builder52.build();
        org.springframework.core.env.Environment environment56 = null;
        com.mongodb.MongoClient mongoClient57 = mongoProperties39.createMongoClient(mongoClientOptions55, environment56);
        com.mongodb.DBEncoderFactory dBEncoderFactory58 = mongoClientOptions55.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder32.dbEncoderFactory(dBEncoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder60 = builder23.dbEncoderFactory(dBEncoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder61 = builder12.dbEncoderFactory(dBEncoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder62 = builder6.dbEncoderFactory(dBEncoderFactory58);
        com.mongodb.MongoClientOptions.Builder builder64 = builder62.autoConnectRetry(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder66 = builder64.connectTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
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
        org.junit.Assert.assertNull(wildcardClass40);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertNotNull(mongoClient47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(mongoClientOptions55);
        org.junit.Assert.assertNotNull(mongoClient57);
        org.junit.Assert.assertNotNull(dBEncoderFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.socketTimeout(120000);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxAutoConnectRetryTime((long) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency(35);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.uri;
        mongoProperties0.setHost("");
        java.lang.String str6 = mongoProperties0.getHost();
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.port = 20000;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass11 = mongoProperties10.fieldNamingStrategy;
        mongoProperties10.host = "hi!";
        mongoProperties10.authenticationDatabase = "";
        java.lang.String str16 = mongoProperties10.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.description("");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.autoConnectRetry(false);
        boolean boolean33 = mongoClientOptions24.equals((java.lang.Object) false);
        int int34 = mongoClientOptions24.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties10.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        javax.net.SocketFactory socketFactory45 = mongoClientOptions44.getSocketFactory();
        long long46 = mongoClientOptions44.getMaxAutoConnectRetryTime();
        int int47 = mongoClientOptions44.getHeartbeatConnectTimeout();
        boolean boolean48 = mongoClientOptions24.equals((java.lang.Object) mongoClientOptions44);
        int int49 = mongoClientOptions44.getLocalThreshold();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb://localhost/test" + "'", str3, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNotNull(socketFactory45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20000 + "'", int47 == 20000);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.username;
        java.lang.String str3 = mongoProperties0.host;
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold(100);
        java.lang.Class<?> wildcardClass10 = builder7.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass10;
        mongoProperties0.port = 500;
        mongoProperties0.authenticationDatabase = "mongodb://localhost/test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        mongoProperties0.setHost("mongodb://localhost/test");
        mongoProperties0.setAuthenticationDatabase("mongodb://localhost/test");
        java.lang.String str10 = mongoProperties0.getUsername();
        java.lang.String str11 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern13 = mongoClientOptions10.getWriteConcern();
        int int14 = mongoClientOptions10.getMaxWaitTime();
        int int15 = mongoClientOptions10.getConnectTimeout();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(writeConcern13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10000 + "'", int15 == 10000);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.autoConnectRetry(true);
        javax.net.SocketFactory socketFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder10.socketFactory(socketFactory15);
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
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        java.lang.String str7 = mongoProperties0.uri;
        mongoProperties0.host = "";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.heartbeatConnectTimeout((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectionsPerHost((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.acceptableLatencyDifference(5000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime(100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.description("mongodb://localhost/test");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.threadsAllowedToBlockForConnectionMultiplier(0);
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder6 = builder0.heartbeatConnectRetryFrequency((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatThreadCount(5000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatFrequency((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.threadsAllowedToBlockForConnectionMultiplier(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass10 = mongoProperties9.fieldNamingStrategy;
        boolean boolean11 = mongoProperties9.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        com.mongodb.MongoClient mongoClient20 = mongoProperties9.createMongoClient(mongoClientOptions19);
        int int21 = mongoClientOptions19.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions19.getWriteConcern();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions19.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = builder8.writeConcern(writeConcern23);
        com.mongodb.MongoClientOptions.Builder builder26 = builder8.socketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder28 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder28.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder31 = builder28.maxConnectionLifeTime((int) ' ');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        boolean boolean9 = mongoClientOptions7.isSocketKeepAlive();
        int int10 = mongoClientOptions7.getHeartbeatThreadCount();
        long long11 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setHost("");
        mongoProperties0.setUri("hi!");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.autoConnectRetry(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        com.mongodb.ReadPreference readPreference17 = mongoClientOptions16.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder18 = builder6.readPreference(readPreference17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder6.maxConnectionLifeTime(500);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder22 = builder20.minHeartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(readPreference17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions7.getSocketFactory();
        boolean boolean11 = mongoClientOptions7.isCursorFinalizerEnabled();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions7.getReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(readPreference12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setDatabase("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions7.getSocketFactory();
        boolean boolean11 = mongoClientOptions7.isCursorFinalizerEnabled();
        boolean boolean12 = mongoClientOptions7.isAutoConnectRetry();
        int int13 = mongoClientOptions7.getHeartbeatThreadCount();
        boolean boolean14 = mongoClientOptions7.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.String str7 = mongoProperties0.database;
        mongoProperties0.host = "mongodb://localhost/test";
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        javax.net.SocketFactory socketFactory18 = mongoClientOptions17.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory19 = mongoClientOptions17.getDbEncoderFactory();
        long long20 = mongoClientOptions17.getMaxAutoConnectRetryTime();
        int int21 = mongoClientOptions17.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str22 = mongoClientOptions17.getRequiredReplicaSetName();
        boolean boolean23 = mongoClientOptions17.isAutoConnectRetry();
        int int24 = mongoClientOptions17.getHeartbeatSocketTimeout();
        int int25 = mongoClientOptions17.getHeartbeatConnectTimeout();
        boolean boolean26 = mongoClientOptions17.isSocketKeepAlive();
        com.mongodb.WriteConcern writeConcern27 = mongoClientOptions17.getWriteConcern();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions17);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoException; message: host and port should be specified in host:port format");
        } catch (com.mongodb.MongoException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(socketFactory18);
        org.junit.Assert.assertNotNull(dBEncoderFactory19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 20000 + "'", int24 == 20000);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(writeConcern27);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxWaitTime(52);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        int int13 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int15 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions7.getSocketFactory();
        java.lang.String str17 = mongoClientOptions7.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder22 = builder12.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.acceptableLatencyDifference((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.heartbeatConnectTimeout((int) (short) 10);
        boolean boolean27 = mongoClientOptions7.equals((java.lang.Object) builder26);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder26.heartbeatThreadCount((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder34 = builder32.minConnectionsPerHost((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray3 = mongoProperties0.getPassword();
        java.lang.String str4 = mongoProperties0.getDatabase();
        char[] charArray5 = mongoProperties0.password;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(charArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(charArray5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions7.getDbEncoderFactory();
        long long10 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        java.lang.String str11 = mongoClientOptions7.toString();
        int int12 = mongoClientOptions7.getMaxWaitTime();
        int int13 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        mongoProperties0.username = "";
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getSocketTimeout();
        int int17 = mongoClientOptions15.getHeartbeatThreadCount();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions15, environment18);
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = mongoClientOptions15.getDbDecoderFactory();
        int int21 = mongoClientOptions15.getMaxWaitTime();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(dBDecoderFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120000 + "'", int21 == 120000);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatConnectRetryFrequency(20000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.threadsAllowedToBlockForConnectionMultiplier(120000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getLocalThreshold();
        boolean boolean9 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int10 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions7.getDbDecoderFactory();
        int int12 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int14 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions15.getSocketFactory();
        int int17 = mongoClientOptions15.getLocalThreshold();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions15, environment18);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder29 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.description("");
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder35 = builder31.autoConnectRetry(false);
        boolean boolean36 = mongoClientOptions27.equals((java.lang.Object) false);
        java.lang.String str37 = mongoClientOptions27.getDescription();
        int int38 = mongoClientOptions27.getLocalThreshold();
        int int39 = mongoClientOptions27.getConnectionsPerHost();
        com.mongodb.MongoClientOptions.Builder builder40 = mongoProperties0.builder(mongoClientOptions27);
        java.lang.Class<?> wildcardClass41 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 20000 + "'", int28 == 20000);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(wildcardClass41);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        mongoProperties0.username = "";
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        java.lang.String str8 = mongoProperties0.getDatabase();
        java.lang.String str9 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder17 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder19 = builder13.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        javax.net.SocketFactory socketFactory28 = mongoClientOptions27.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder29 = builder19.socketFactory(socketFactory28);
        com.mongodb.MongoClientOptions.Builder builder30 = builder10.socketFactory(socketFactory28);
        com.mongodb.MongoClientOptions.Builder builder32 = builder10.maxWaitTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.description("");
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder39 = builder35.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder41 = builder35.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder43 = builder35.maxConnectionLifeTime(27017);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxWaitTime((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder46 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder48 = builder46.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder52 = builder50.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder50.build();
        javax.net.SocketFactory socketFactory54 = mongoClientOptions53.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory55 = mongoClientOptions53.getDbEncoderFactory();
        long long56 = mongoClientOptions53.getMaxAutoConnectRetryTime();
        boolean boolean57 = mongoClientOptions53.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory58 = mongoClientOptions53.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder59 = builder45.dbDecoderFactory(dBDecoderFactory58);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties60 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass61 = mongoProperties60.fieldNamingStrategy;
        mongoProperties60.host = "hi!";
        mongoProperties60.setUri("mongodb://localhost/test");
        mongoProperties60.authenticationDatabase = "test";
        mongoProperties60.setGridFsDatabase("test");
        com.mongodb.MongoClientOptions.Builder builder70 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder74 = builder72.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder76 = builder72.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions77 = builder76.build();
        boolean boolean79 = mongoClientOptions77.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory80 = mongoClientOptions77.getSocketFactory();
        int int81 = mongoClientOptions77.getMaxConnectionLifeTime();
        org.springframework.core.env.Environment environment82 = null;
        com.mongodb.MongoClient mongoClient83 = mongoProperties60.createMongoClient(mongoClientOptions77, environment82);
        com.mongodb.DBDecoderFactory dBDecoderFactory84 = mongoClientOptions77.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder85 = builder59.dbDecoderFactory(dBDecoderFactory84);
        com.mongodb.MongoClientOptions.Builder builder86 = builder10.dbDecoderFactory(dBDecoderFactory84);
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
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(socketFactory28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(mongoClientOptions53);
        org.junit.Assert.assertNotNull(socketFactory54);
        org.junit.Assert.assertNotNull(dBEncoderFactory55);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 10L + "'", long56 == 10L);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory58);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNull(wildcardClass61);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(mongoClientOptions77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(socketFactory80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(mongoClient83);
        org.junit.Assert.assertNotNull(dBDecoderFactory84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions7.getDbEncoderFactory();
        long long10 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str12 = mongoClientOptions7.getRequiredReplicaSetName();
        boolean boolean13 = mongoClientOptions7.isAutoConnectRetry();
        int int14 = mongoClientOptions7.getLocalThreshold();
        int int15 = mongoClientOptions7.getHeartbeatFrequency();
        boolean boolean16 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int17 = mongoClientOptions7.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5000 + "'", int15 == 5000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions7.getReadPreference();
        int int9 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        int int10 = mongoClientOptions7.getSocketTimeout();
        int int11 = mongoClientOptions7.getLocalThreshold();
        long long12 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int13 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.description("");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder17 = builder9.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder19 = builder9.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder20.minConnectionsPerHost((int) (byte) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass28 = mongoProperties27.fieldNamingStrategy;
        boolean boolean29 = mongoProperties27.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        com.mongodb.MongoClient mongoClient38 = mongoProperties27.createMongoClient(mongoClientOptions37);
        com.mongodb.DBDecoderFactory dBDecoderFactory39 = mongoClientOptions37.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder40 = builder20.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder41 = builder19.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder42 = builder6.dbDecoderFactory(dBDecoderFactory39);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.autoConnectRetry(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder46 = builder44.heartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(mongoClient38);
        org.junit.Assert.assertNotNull(dBDecoderFactory39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.minConnectionsPerHost(20000);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatThreadCount((int) '#');
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.description("");
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder23 = builder19.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder25 = builder19.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder27 = builder19.maxConnectionLifeTime(27017);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxWaitTime((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions37.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory39 = mongoClientOptions37.getDbEncoderFactory();
        long long40 = mongoClientOptions37.getMaxAutoConnectRetryTime();
        boolean boolean41 = mongoClientOptions37.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory42 = mongoClientOptions37.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder43 = builder29.dbDecoderFactory(dBDecoderFactory42);
        com.mongodb.MongoClientOptions.Builder builder44 = builder16.dbDecoderFactory(dBDecoderFactory42);
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
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertNotNull(dBEncoderFactory39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 10L + "'", long40 == 10L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.maxConnectionIdleTime(10);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.heartbeatConnectTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder26.build();
        boolean boolean29 = mongoClientOptions27.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory30 = mongoClientOptions27.getSocketFactory();
        int int31 = mongoClientOptions27.getConnectionsPerHost();
        int int32 = mongoClientOptions27.getHeartbeatSocketTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory33 = mongoClientOptions27.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder34 = builder17.dbDecoderFactory(dBDecoderFactory33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder8.dbDecoderFactory(dBDecoderFactory33);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(socketFactory30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20000 + "'", int32 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.heartbeatConnectTimeout(5000);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.autoConnectRetry(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference10 = mongoClientOptions7.getReadPreference();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions7.getSocketFactory();
        int int12 = mongoClientOptions7.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions7.getDbEncoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(readPreference10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.acceptableLatencyDifference(5000);
        com.mongodb.DBEncoderFactory dBEncoderFactory15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.dbEncoderFactory(dBEncoderFactory15);
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
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        java.lang.String str4 = mongoProperties0.authenticationDatabase;
        mongoProperties0.uri = "test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        java.lang.String str13 = mongoClientOptions10.toString();
        com.mongodb.WriteConcern writeConcern14 = mongoClientOptions10.getWriteConcern();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertNotNull(writeConcern14);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        java.lang.String str9 = mongoClientOptions7.getRequiredReplicaSetName();
        int int10 = mongoClientOptions7.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions7.getDbEncoderFactory();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions7.getReadPreference();
        int int13 = mongoClientOptions7.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.authenticationDatabase = "test";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        boolean boolean16 = mongoClientOptions15.isSocketKeepAlive();
        boolean boolean17 = mongoClientOptions15.isSocketKeepAlive();
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions15);
        boolean boolean19 = mongoProperties0.hasCustomCredentials();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder26.build();
        int int28 = mongoClientOptions27.getSocketTimeout();
        int int29 = mongoClientOptions27.getHeartbeatThreadCount();
        int int30 = mongoClientOptions27.getHeartbeatFrequency();
        int int31 = mongoClientOptions27.getHeartbeatConnectRetryFrequency();
        long long32 = mongoClientOptions27.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder33 = mongoProperties0.builder(mongoClientOptions27);
        int int34 = mongoClientOptions27.getAcceptableLatencyDifference();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5000 + "'", int30 == 5000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 500 + "'", int31 == 500);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 15 + "'", int34 == 15);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.authenticationDatabase = "test";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass12 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.host = "hi!";
        mongoProperties11.authenticationDatabase = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass18 = mongoProperties17.fieldNamingStrategy;
        mongoProperties17.host = "hi!";
        int int21 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.host = "";
        mongoProperties17.setHost("hi!");
        char[] charArray30 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties17.setPassword(charArray30);
        char[] charArray32 = mongoProperties17.password;
        mongoProperties11.setPassword(charArray32);
        mongoProperties0.password = charArray32;
        mongoProperties0.setUri("");
        char[] charArray37 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder44.build();
        int int46 = mongoClientOptions45.getSocketTimeout();
        int int47 = mongoClientOptions45.getHeartbeatThreadCount();
        java.lang.String str48 = mongoClientOptions45.getRequiredReplicaSetName();
        com.mongodb.MongoClient mongoClient49 = mongoProperties0.createMongoClient(mongoClientOptions45);
        mongoProperties0.uri = "hi!";
        java.lang.String str52 = mongoProperties0.uri;
        mongoProperties0.setUri("test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass56 = mongoProperties55.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass57 = mongoProperties55.getFieldNamingStrategy();
        mongoProperties55.port = 10;
        mongoProperties55.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions62 = null;
        com.mongodb.MongoClient mongoClient63 = mongoProperties55.createMongoClient(mongoClientOptions62);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions71 = builder68.build();
        org.springframework.core.env.Environment environment72 = null;
        com.mongodb.MongoClient mongoClient73 = mongoProperties55.createMongoClient(mongoClientOptions71, environment72);
        java.lang.String str74 = mongoProperties55.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder75 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder77 = builder75.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder79 = builder77.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder81 = builder77.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions82 = builder81.build();
        com.mongodb.MongoClient mongoClient83 = mongoProperties55.createMongoClient(mongoClientOptions82);
        com.mongodb.MongoClientOptions.Builder builder84 = mongoProperties0.builder(mongoClientOptions82);
        mongoProperties0.clearPassword();
        java.lang.Class<?> wildcardClass86 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(mongoClient49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(wildcardClass56);
        org.junit.Assert.assertNull(wildcardClass57);
        org.junit.Assert.assertNotNull(mongoClient63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClientOptions71);
        org.junit.Assert.assertNotNull(mongoClient73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoClientOptions82);
        org.junit.Assert.assertNotNull(mongoClient83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minHeartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        javax.net.SocketFactory socketFactory17 = mongoClientOptions16.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.socketFactory(socketFactory17);
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.heartbeatSocketTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder22 = builder18.heartbeatFrequency(52);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        com.mongodb.ReadPreference readPreference31 = mongoClientOptions30.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder32 = builder22.readPreference(readPreference31);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.autoConnectRetry(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(readPreference31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        java.lang.Class<?> wildcardClass7 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str8 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUsername("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatThreadCount();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.description("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder18 = builder12.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder20 = builder12.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder22 = builder12.threadsAllowedToBlockForConnectionMultiplier(27017);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.acceptableLatencyDifference((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.heartbeatConnectTimeout((int) (short) 10);
        boolean boolean27 = mongoClientOptions7.equals((java.lang.Object) builder26);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder30 = builder26.heartbeatThreadCount((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder34 = builder30.heartbeatConnectRetryFrequency((int) '4');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.Class<?> wildcardClass5 = mongoProperties0.fieldNamingStrategy;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.String str7 = mongoProperties0.getDatabase();
        mongoProperties0.host = "";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(10);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionLifeTime(1);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder17.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        javax.net.SocketFactory socketFactory27 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder18.socketFactory(socketFactory27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder8.socketFactory(socketFactory27);
        com.mongodb.MongoClientOptions.Builder builder31 = builder8.acceptableLatencyDifference(35);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder33 = builder8.heartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
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
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.minHeartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.maxAutoConnectRetryTime((long) 500);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getHeartbeatSocketTimeout();
        int int27 = mongoClientOptions25.getHeartbeatFrequency();
        boolean boolean28 = mongoClientOptions25.isSocketKeepAlive();
        int int29 = mongoClientOptions25.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern30 = mongoClientOptions25.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder31 = builder11.writeConcern(writeConcern30);
        com.mongodb.MongoClientOptions.Builder builder32 = builder8.writeConcern(writeConcern30);
        com.mongodb.MongoClientOptions.Builder builder34 = builder8.alwaysUseMBeans(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder36 = builder8.heartbeatSocketTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatSocketTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 20000 + "'", int26 == 20000);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5000 + "'", int27 == 5000);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 120000 + "'", int29 == 120000);
        org.junit.Assert.assertNotNull(writeConcern30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(5000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.acceptableLatencyDifference((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: acceptableLatencyDifference must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.heartbeatFrequency((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder2.heartbeatConnectRetryFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions7.getDbEncoderFactory();
        boolean boolean12 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int13 = mongoClientOptions7.getMinConnectionsPerHost();
        int int14 = mongoClientOptions7.getMinHeartbeatFrequency();
        javax.net.SocketFactory socketFactory15 = mongoClientOptions7.getSocketFactory();
        int int16 = mongoClientOptions7.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertNotNull(socketFactory15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setPort((java.lang.Integer) 100);
        mongoProperties0.gridFsDatabase = "hi!";
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        mongoProperties0.setAuthenticationDatabase("");
        java.lang.String str10 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass6 = mongoProperties5.fieldNamingStrategy;
        boolean boolean7 = mongoProperties5.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        com.mongodb.MongoClient mongoClient16 = mongoProperties5.createMongoClient(mongoClientOptions15);
        int int17 = mongoClientOptions15.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions15.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder19 = builder0.writeConcern(writeConcern18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionIdleTime(27017);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatConnectRetryFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.requiredReplicaSetName("");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatThreadCount((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass10 = mongoProperties9.fieldNamingStrategy;
        mongoProperties9.host = "hi!";
        java.lang.String str13 = mongoProperties9.uri;
        org.springframework.core.env.Environment environment14 = null;
        int int15 = mongoProperties9.determinePort(environment14);
        java.lang.String str16 = mongoProperties9.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass18 = mongoProperties17.fieldNamingStrategy;
        mongoProperties17.host = "hi!";
        int int21 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.host = "";
        mongoProperties17.setHost("hi!");
        char[] charArray30 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties17.setPassword(charArray30);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties32 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass33 = mongoProperties32.fieldNamingStrategy;
        mongoProperties32.host = "hi!";
        int int36 = mongoProperties32.getDEFAULT_PORT();
        mongoProperties32.host = "";
        mongoProperties32.setHost("hi!");
        char[] charArray45 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties32.setPassword(charArray45);
        mongoProperties17.password = charArray45;
        mongoProperties9.setPassword(charArray45);
        mongoProperties0.setPassword(charArray45);
        mongoProperties0.setUsername("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb://localhost/test" + "'", str13, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), " aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), " aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[ , a, a, 4]");
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 27017 + "'", int36 == 27017);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), " aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), " aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[ , a, a, 4]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.host = "test";
        mongoProperties0.setAuthenticationDatabase("hi!");
        mongoProperties0.gridFsDatabase = "mongodb://localhost/test";
        mongoProperties0.setAuthenticationDatabase("mongodb://localhost/test");
        mongoProperties0.authenticationDatabase = "hi!";
        mongoProperties0.setDatabase("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getLocalThreshold();
        int int9 = mongoClientOptions7.getMaxWaitTime();
        int int10 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int11 = mongoClientOptions7.getHeartbeatFrequency();
        int int12 = mongoClientOptions7.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5000 + "'", int11 == 5000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions7.getSocketFactory();
        int int11 = mongoClientOptions7.getConnectionsPerHost();
        int int12 = mongoClientOptions7.getConnectTimeout();
        int int13 = mongoClientOptions7.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10000 + "'", int12 == 10000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 15 + "'", int13 == 15);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.threadsAllowedToBlockForConnectionMultiplier(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties9 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass10 = mongoProperties9.fieldNamingStrategy;
        boolean boolean11 = mongoProperties9.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        com.mongodb.MongoClient mongoClient20 = mongoProperties9.createMongoClient(mongoClientOptions19);
        int int21 = mongoClientOptions19.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern22 = mongoClientOptions19.getWriteConcern();
        com.mongodb.WriteConcern writeConcern23 = mongoClientOptions19.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder24 = builder8.writeConcern(writeConcern23);
        com.mongodb.MongoClientOptions.Builder builder26 = builder8.socketTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder28 = builder8.description("");
        com.mongodb.MongoClientOptions.Builder builder29 = builder28.legacyDefaults();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder31 = builder28.localThreshold((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(writeConcern22);
        org.junit.Assert.assertNotNull(writeConcern23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        java.lang.String str12 = mongoClientOptions10.getDescription();
        com.mongodb.ReadPreference readPreference13 = mongoClientOptions10.getReadPreference();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(readPreference13);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.uri;
        mongoProperties0.database = "test";
        mongoProperties0.setDatabase("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb://localhost/test" + "'", str9, "mongodb://localhost/test");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.setDatabase("hi!");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getUsername();
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setPort((java.lang.Integer) 10);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions10.getSocketFactory();
        org.springframework.core.env.Environment environment12 = null;
        com.mongodb.MongoClient mongoClient13 = mongoProperties0.createMongoClient(mongoClientOptions10, environment12);
        java.lang.String str14 = mongoProperties0.uri;
        java.lang.Integer int15 = mongoProperties0.port;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertNotNull(mongoClient13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.connectionsPerHost((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatSocketTimeout((int) (short) -1);
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
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions7.getSocketFactory();
        boolean boolean11 = mongoClientOptions7.isCursorFinalizerEnabled();
        long long12 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory9 = mongoClientOptions7.getDbEncoderFactory();
        long long10 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        long long12 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getSocketTimeout();
        int int22 = mongoClientOptions20.getHeartbeatThreadCount();
        int int23 = mongoClientOptions20.getHeartbeatThreadCount();
        boolean boolean25 = mongoClientOptions20.equals((java.lang.Object) 100L);
        int int26 = mongoClientOptions20.getMinHeartbeatFrequency();
        boolean boolean27 = mongoClientOptions7.equals((java.lang.Object) mongoClientOptions20);
        boolean boolean28 = mongoClientOptions7.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertNotNull(dBEncoderFactory9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 500 + "'", int26 == 500);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        java.lang.String str9 = mongoProperties0.authenticationDatabase;
        char[] charArray10 = mongoProperties0.getPassword();
        mongoProperties0.setPort((java.lang.Integer) 10000);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass14 = mongoProperties13.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass15 = mongoProperties13.getFieldNamingStrategy();
        mongoProperties13.port = 10;
        mongoProperties13.database = "hi!";
        java.lang.String str20 = mongoProperties13.getUri();
        boolean boolean21 = mongoProperties13.hasCustomCredentials();
        mongoProperties13.setHost("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass25 = mongoProperties24.fieldNamingStrategy;
        mongoProperties24.host = "hi!";
        int int28 = mongoProperties24.getDEFAULT_PORT();
        mongoProperties24.host = "";
        mongoProperties24.setHost("hi!");
        char[] charArray37 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties24.setPassword(charArray37);
        mongoProperties13.setPassword(charArray37);
        mongoProperties0.setPassword(charArray37);
        java.lang.String str41 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb://localhost/test" + "'", str20, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 27017 + "'", int28 == 27017);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), " aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), " aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[ , a, a, 4]");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.maxConnectionIdleTime((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.minHeartbeatFrequency(0);
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
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.maxWaitTime((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.heartbeatFrequency((int) (byte) 1);
        com.mongodb.DBEncoderFactory dBEncoderFactory6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder7 = builder3.dbEncoderFactory(dBEncoderFactory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int9 = mongoClientOptions7.getMaxWaitTime();
        java.lang.String str10 = mongoClientOptions7.getDescription();
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.heartbeatConnectRetryFrequency((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxAutoConnectRetryTime((long) 5);
        boolean boolean18 = mongoClientOptions7.equals((java.lang.Object) 5);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder13 = builder6.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder15.heartbeatConnectRetryFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        int int4 = mongoProperties0.getDEFAULT_PORT();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.autoConnectRetry(false);
        boolean boolean21 = mongoClientOptions12.equals((java.lang.Object) false);
        int int22 = mongoClientOptions12.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.maxAutoConnectRetryTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder29 = builder25.maxAutoConnectRetryTime((long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.minConnectionsPerHost(500);
        com.mongodb.MongoClientOptions.Builder builder18 = builder8.maxConnectionIdleTime(0);
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions16, environment17);
        java.lang.String str19 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.gridFsDatabase = "";
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions29 = builder26.build();
        int int30 = mongoClientOptions29.getHeartbeatSocketTimeout();
        int int31 = mongoClientOptions29.getHeartbeatFrequency();
        boolean boolean33 = mongoClientOptions29.equals((java.lang.Object) "");
        int int34 = mongoClientOptions29.getHeartbeatConnectTimeout();
        boolean boolean35 = mongoClientOptions29.isAlwaysUseMBeans();
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions29);
        int int37 = mongoClientOptions29.getMaxConnectionIdleTime();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(mongoClientOptions29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 20000 + "'", int30 == 20000);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5000 + "'", int31 == 5000);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20000 + "'", int34 == 20000);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.database = "";
        java.lang.String str7 = mongoProperties0.getAuthenticationDatabase();
        java.lang.Class<?> wildcardClass8 = mongoProperties0.fieldNamingStrategy;
        char[] charArray9 = mongoProperties0.password;
        mongoProperties0.username = "test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertNull(charArray9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.maxConnectionLifeTime(27017);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxWaitTime((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.minHeartbeatFrequency(5000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatConnectRetryFrequency((-1));
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
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxAutoConnectRetryTime((long) (byte) -1);
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        java.lang.String str7 = mongoProperties0.uri;
        char[] charArray8 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        long long17 = mongoClientOptions16.getMaxAutoConnectRetryTime();
        int int18 = mongoClientOptions16.getMinConnectionsPerHost();
        int int19 = mongoClientOptions16.getAcceptableLatencyDifference();
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions16);
        int int21 = mongoClientOptions16.getMaxWaitTime();
        boolean boolean22 = mongoClientOptions16.isCursorFinalizerEnabled();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(charArray8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120000 + "'", int21 == 120000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder8.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        long long20 = mongoClientOptions19.getMaxAutoConnectRetryTime();
        com.mongodb.WriteConcern writeConcern21 = mongoClientOptions19.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder22 = builder11.writeConcern(writeConcern21);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertNotNull(writeConcern21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.getGridFsDatabase();
        com.mongodb.MongoClientOptions.Builder builder4 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.build();
        javax.net.SocketFactory socketFactory12 = mongoClientOptions11.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions11.getDbEncoderFactory();
        long long14 = mongoClientOptions11.getMaxAutoConnectRetryTime();
        boolean boolean15 = mongoClientOptions11.isAutoConnectRetry();
        com.mongodb.MongoClientOptions.Builder builder16 = mongoProperties0.builder(mongoClientOptions11);
        int int17 = mongoClientOptions11.getMinConnectionsPerHost();
        long long18 = mongoClientOptions11.getMaxAutoConnectRetryTime();
        int int19 = mongoClientOptions11.getHeartbeatFrequency();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(socketFactory12);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5000 + "'", int19 == 5000);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        char[] charArray7 = mongoProperties0.getPassword();
        java.lang.Integer int8 = mongoProperties0.getPort();
        mongoProperties0.uri = "test";
        boolean boolean11 = mongoProperties0.hasCustomAddress();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(charArray7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxConnectionIdleTime(5000);
        com.mongodb.MongoClientOptions.Builder builder7 = builder3.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder9 = builder3.minHeartbeatFrequency(15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.gridFsDatabase = "hi!";
        mongoProperties0.setDatabase("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.username;
        mongoProperties0.setAuthenticationDatabase("test");
        mongoProperties0.username = "mongodb://localhost/test";
        mongoProperties0.setUri("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.description("");
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.heartbeatSocketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.threadsAllowedToBlockForConnectionMultiplier(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass25 = mongoProperties24.fieldNamingStrategy;
        boolean boolean26 = mongoProperties24.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        com.mongodb.MongoClient mongoClient35 = mongoProperties24.createMongoClient(mongoClientOptions34);
        int int36 = mongoClientOptions34.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions34.getWriteConcern();
        com.mongodb.WriteConcern writeConcern38 = mongoClientOptions34.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder39 = builder23.writeConcern(writeConcern38);
        com.mongodb.MongoClientOptions.Builder builder40 = builder14.writeConcern(writeConcern38);
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
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(writeConcern38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.acceptableLatencyDifference((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime(27017);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder14 = builder6.maxAutoConnectRetryTime(10L);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        java.lang.String str10 = mongoClientOptions7.getRequiredReplicaSetName();
        int int11 = mongoClientOptions7.getLocalThreshold();
        java.lang.String str12 = mongoClientOptions7.getRequiredReplicaSetName();
        int int13 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        int int14 = mongoClientOptions7.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions7.getAcceptableLatencyDifference();
        com.mongodb.WriteConcern writeConcern10 = mongoClientOptions7.getWriteConcern();
        int int11 = mongoClientOptions7.getConnectionsPerHost();
        java.lang.String str12 = mongoClientOptions7.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(writeConcern10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder12.connectTimeout((int) (byte) -1);
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
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.autoConnectRetry(false);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder12.build();
        int int14 = mongoClientOptions13.getMinConnectionsPerHost();
        int int15 = mongoClientOptions13.getMinHeartbeatFrequency();
        boolean boolean16 = mongoClientOptions13.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(mongoClientOptions13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions10.getSocketFactory();
        int int14 = mongoClientOptions10.getLocalThreshold();
        boolean boolean15 = mongoClientOptions10.isAlwaysUseMBeans();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.username;
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.username = "mongodb://localhost/test";
        boolean boolean10 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        org.springframework.core.env.Environment environment15 = null;
        com.mongodb.MongoClient mongoClient16 = mongoProperties0.createMongoClient(mongoClientOptions14, environment15);
        java.lang.String str17 = mongoClientOptions14.toString();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder21.build();
        com.mongodb.ReadPreference readPreference23 = mongoClientOptions22.getReadPreference();
        boolean boolean24 = mongoClientOptions14.equals((java.lang.Object) mongoClientOptions22);
        int int25 = mongoClientOptions14.getHeartbeatSocketTimeout();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(readPreference23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.database;
        java.lang.String str4 = mongoProperties0.host;
        boolean boolean5 = mongoProperties0.hasCustomAddress();
        int int6 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str2 = mongoProperties0.host;
        java.lang.Class<?> wildcardClass3 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(wildcardClass3);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.threadsAllowedToBlockForConnectionMultiplier(5);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatThreadCount((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.socketTimeout((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.acceptableLatencyDifference((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.heartbeatSocketTimeout((int) (short) 100);
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        java.lang.String str8 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str9 = mongoProperties0.username;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectTimeout((int) (short) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties6 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass7 = mongoProperties6.fieldNamingStrategy;
        boolean boolean8 = mongoProperties6.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        com.mongodb.MongoClient mongoClient17 = mongoProperties6.createMongoClient(mongoClientOptions16);
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions16.getDbEncoderFactory();
        int int19 = mongoClientOptions16.getConnectTimeout();
        int int20 = mongoClientOptions16.getMinHeartbeatFrequency();
        boolean boolean21 = mongoClientOptions16.isAutoConnectRetry();
        com.mongodb.MongoClient mongoClient22 = mongoProperties0.createMongoClient(mongoClientOptions16);
        int int23 = mongoClientOptions16.getSocketTimeout();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(mongoClient17);
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10000 + "'", int19 == 10000);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(mongoClient22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        java.lang.String str5 = mongoProperties0.uri;
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        java.lang.String str7 = mongoProperties0.getUsername();
        java.lang.String str8 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.clearPassword();
        mongoProperties0.setPort((java.lang.Integer) 0);
        mongoProperties0.database = "test";
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        long long17 = mongoClientOptions16.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder26 = builder20.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.connectionsPerHost((int) (byte) 100);
        boolean boolean29 = mongoClientOptions16.equals((java.lang.Object) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClient mongoClient30 = mongoProperties0.createMongoClient(mongoClientOptions16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: spring.data.mongodb.port=0 and no local mongo port configuration is available");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int11 = mongoClientOptions7.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory12 = mongoClientOptions7.getDbDecoderFactory();
        int int13 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.username;
        java.lang.Class<?> wildcardClass7 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setPort((java.lang.Integer) 100);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(wildcardClass7);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        mongoProperties0.username = "";
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getSocketTimeout();
        int int17 = mongoClientOptions15.getHeartbeatThreadCount();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions15, environment18);
        boolean boolean20 = mongoClientOptions15.isAlwaysUseMBeans();
        boolean boolean21 = mongoClientOptions15.isAlwaysUseMBeans();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.description("");
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getLocalThreshold();
        boolean boolean21 = mongoClientOptions19.isCursorFinalizerEnabled();
        int int22 = mongoClientOptions19.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory23 = mongoClientOptions19.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder24 = builder9.dbDecoderFactory(dBDecoderFactory23);
        com.mongodb.MongoClientOptions.Builder builder25 = builder6.dbDecoderFactory(dBDecoderFactory23);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatConnectTimeout((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.description("test");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 500 + "'", int22 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory23);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.getHost();
        mongoProperties0.setUsername("test");
        java.lang.String str10 = mongoProperties0.getHost();
        mongoProperties0.setPort((java.lang.Integer) 27017);
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatFrequency();
        boolean boolean10 = mongoClientOptions7.isSocketKeepAlive();
        int int11 = mongoClientOptions7.getHeartbeatSocketTimeout();
        javax.net.SocketFactory socketFactory12 = mongoClientOptions7.getSocketFactory();
        int int13 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int14 = mongoClientOptions7.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNotNull(socketFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.Class<?> wildcardClass5 = mongoProperties0.fieldNamingStrategy;
        boolean boolean6 = mongoProperties0.hasCustomAddress();
        java.lang.String str7 = mongoProperties0.getDatabase();
        java.lang.Integer int8 = mongoProperties0.getPort();
        mongoProperties0.setPort((java.lang.Integer) 1);
        mongoProperties0.uri = "test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder4.threadsAllowedToBlockForConnectionMultiplier((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.username;
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.setPort((java.lang.Integer) 15);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray8 = new char[] { '#', 'a' };
        mongoProperties0.password = charArray8;
        mongoProperties0.authenticationDatabase = "";
        mongoProperties0.setPort((java.lang.Integer) 5000);
        java.lang.String str14 = mongoProperties0.database;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties15 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass16 = mongoProperties15.fieldNamingStrategy;
        java.lang.String str17 = mongoProperties15.username;
        java.lang.String str18 = mongoProperties15.host;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass20 = mongoProperties19.fieldNamingStrategy;
        java.lang.String str21 = mongoProperties19.getAuthenticationDatabase();
        boolean boolean22 = mongoProperties19.hasCustomCredentials();
        boolean boolean23 = mongoProperties19.hasCustomAddress();
        java.lang.String str24 = mongoProperties19.uri;
        mongoProperties19.setDatabase("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass28 = mongoProperties27.fieldNamingStrategy;
        java.lang.String str29 = mongoProperties27.getAuthenticationDatabase();
        char[] charArray30 = mongoProperties27.getPassword();
        mongoProperties27.host = "hi!";
        mongoProperties27.setUsername("hi!");
        char[] charArray36 = new char[] { '4' };
        mongoProperties27.password = charArray36;
        mongoProperties19.setPassword(charArray36);
        mongoProperties15.setPassword(charArray36);
        mongoProperties0.setPassword(charArray36);
        mongoProperties0.username = "test";
        java.lang.Class<?> wildcardClass43 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardClass16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb://localhost/test" + "'", str24, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(charArray30);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4]");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.getHost();
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties8 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass9 = mongoProperties8.fieldNamingStrategy;
        mongoProperties8.host = "hi!";
        int int12 = mongoProperties8.getDEFAULT_PORT();
        mongoProperties8.host = "";
        mongoProperties8.setHost("hi!");
        java.lang.String str17 = mongoProperties8.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass19 = mongoProperties18.fieldNamingStrategy;
        mongoProperties18.host = "hi!";
        mongoProperties18.setUri("mongodb://localhost/test");
        mongoProperties18.authenticationDatabase = "test";
        mongoProperties18.authenticationDatabase = "";
        java.lang.String str28 = mongoProperties18.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties29 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass30 = mongoProperties29.fieldNamingStrategy;
        mongoProperties29.host = "hi!";
        mongoProperties29.authenticationDatabase = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties35 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass36 = mongoProperties35.fieldNamingStrategy;
        mongoProperties35.host = "hi!";
        int int39 = mongoProperties35.getDEFAULT_PORT();
        mongoProperties35.host = "";
        mongoProperties35.setHost("hi!");
        char[] charArray48 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties35.setPassword(charArray48);
        char[] charArray50 = mongoProperties35.password;
        mongoProperties29.setPassword(charArray50);
        mongoProperties18.password = charArray50;
        mongoProperties8.password = charArray50;
        mongoProperties0.setPassword(charArray50);
        com.mongodb.MongoClientOptions.Builder builder55 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder57 = builder55.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions62 = builder59.build();
        boolean boolean63 = mongoClientOptions62.isSocketKeepAlive();
        boolean boolean64 = mongoClientOptions62.isSocketKeepAlive();
        int int65 = mongoClientOptions62.getHeartbeatThreadCount();
        int int66 = mongoClientOptions62.getMaxConnectionLifeTime();
        org.springframework.core.env.Environment environment67 = null;
        com.mongodb.MongoClient mongoClient68 = mongoProperties0.createMongoClient(mongoClientOptions62, environment67);
        int int69 = mongoClientOptions62.getMinConnectionsPerHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27017 + "'", int12 == 27017);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(wildcardClass30);
        org.junit.Assert.assertNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 27017 + "'", int39 == 27017);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(mongoClientOptions62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(mongoClient68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.setGridFsDatabase("hi!");
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        char[] charArray9 = mongoProperties0.getPassword();
        mongoProperties0.setHost("mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(charArray9);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatFrequency();
        boolean boolean10 = mongoClientOptions7.isSocketKeepAlive();
        int int11 = mongoClientOptions7.getMaxWaitTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder19.build();
        int int21 = mongoClientOptions20.getMinHeartbeatFrequency();
        int int22 = mongoClientOptions20.getConnectTimeout();
        boolean boolean23 = mongoClientOptions7.equals((java.lang.Object) mongoClientOptions20);
        int int24 = mongoClientOptions20.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5000 + "'", int9 == 5000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 120000 + "'", int11 == 120000);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 500 + "'", int21 == 500);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10000 + "'", int22 == 10000);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 120000 + "'", int24 == 120000);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getLocalThreshold();
        boolean boolean19 = mongoClientOptions17.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions17.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder7.dbDecoderFactory(dBDecoderFactory21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder29.build();
        int int31 = mongoClientOptions30.getSocketTimeout();
        int int32 = mongoClientOptions30.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference33 = mongoClientOptions30.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder34 = builder22.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder0.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.connectTimeout((int) (byte) 10);
        javax.net.SocketFactory socketFactory38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder39 = builder37.socketFactory(socketFactory38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(readPreference33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties0.determinePort(environment10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass13 = mongoProperties12.fieldNamingStrategy;
        mongoProperties12.host = "hi!";
        int int16 = mongoProperties12.getDEFAULT_PORT();
        mongoProperties12.database = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties19 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass20 = mongoProperties19.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass21 = mongoProperties19.getFieldNamingStrategy();
        mongoProperties19.port = 10;
        mongoProperties19.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        com.mongodb.MongoClient mongoClient27 = mongoProperties19.createMongoClient(mongoClientOptions26);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.build();
        org.springframework.core.env.Environment environment36 = null;
        com.mongodb.MongoClient mongoClient37 = mongoProperties19.createMongoClient(mongoClientOptions35, environment36);
        java.lang.String str38 = mongoProperties19.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder39 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder45 = builder41.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder45.build();
        com.mongodb.MongoClient mongoClient47 = mongoProperties19.createMongoClient(mongoClientOptions46);
        com.mongodb.MongoClient mongoClient48 = mongoProperties12.createMongoClient(mongoClientOptions46);
        int int49 = mongoClientOptions46.getAcceptableLatencyDifference();
        int int50 = mongoClientOptions46.getHeartbeatFrequency();
        com.mongodb.MongoClientOptions.Builder builder51 = mongoProperties0.builder(mongoClientOptions46);
        com.mongodb.MongoClientOptions.Builder builder53 = builder51.connectTimeout((int) 'a');
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertNull(wildcardClass20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNotNull(mongoClient27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(mongoClient37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(mongoClientOptions46);
        org.junit.Assert.assertNotNull(mongoClient47);
        org.junit.Assert.assertNotNull(mongoClient48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 15 + "'", int49 == 15);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5000 + "'", int50 == 5000);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        mongoProperties0.setUsername("test");
        mongoProperties0.uri = "mongodb://localhost/test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setHost("hi!");
        java.lang.String str6 = mongoProperties0.uri;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb://localhost/test" + "'", str6, "mongodb://localhost/test");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        int int13 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int14 = mongoClientOptions10.getMaxWaitTime();
        int int15 = mongoClientOptions10.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory16 = mongoClientOptions10.getDbEncoderFactory();
        int int17 = mongoClientOptions10.getMaxWaitTime();
        int int18 = mongoClientOptions10.getHeartbeatConnectRetryFrequency();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 120000 + "'", int14 == 120000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120000 + "'", int17 == 120000);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setPort((java.lang.Integer) 35);
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        int int16 = mongoClientOptions15.getLocalThreshold();
        boolean boolean17 = mongoClientOptions15.isCursorFinalizerEnabled();
        int int18 = mongoClientOptions15.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions15.getDbDecoderFactory();
        int int20 = mongoClientOptions15.getMaxConnectionLifeTime();
        int int21 = mongoClientOptions15.getAcceptableLatencyDifference();
        com.mongodb.DBEncoderFactory dBEncoderFactory22 = mongoClientOptions15.getDbEncoderFactory();
        com.mongodb.MongoClient mongoClient23 = mongoProperties0.createMongoClient(mongoClientOptions15);
        char[] charArray24 = mongoProperties0.password;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 500 + "'", int18 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(dBEncoderFactory22);
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNull(charArray24);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.authenticationDatabase = "test";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass12 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.host = "hi!";
        mongoProperties11.authenticationDatabase = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass18 = mongoProperties17.fieldNamingStrategy;
        mongoProperties17.host = "hi!";
        int int21 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.host = "";
        mongoProperties17.setHost("hi!");
        char[] charArray30 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties17.setPassword(charArray30);
        char[] charArray32 = mongoProperties17.password;
        mongoProperties11.setPassword(charArray32);
        mongoProperties0.password = charArray32;
        mongoProperties0.setUri("");
        char[] charArray37 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder44.build();
        int int46 = mongoClientOptions45.getSocketTimeout();
        int int47 = mongoClientOptions45.getHeartbeatThreadCount();
        java.lang.String str48 = mongoClientOptions45.getRequiredReplicaSetName();
        com.mongodb.MongoClient mongoClient49 = mongoProperties0.createMongoClient(mongoClientOptions45);
        mongoProperties0.uri = "hi!";
        java.lang.String str52 = mongoProperties0.uri;
        mongoProperties0.setUri("test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties55 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass56 = mongoProperties55.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass57 = mongoProperties55.getFieldNamingStrategy();
        mongoProperties55.port = 10;
        mongoProperties55.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions62 = null;
        com.mongodb.MongoClient mongoClient63 = mongoProperties55.createMongoClient(mongoClientOptions62);
        com.mongodb.MongoClientOptions.Builder builder64 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder66 = builder64.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions71 = builder68.build();
        org.springframework.core.env.Environment environment72 = null;
        com.mongodb.MongoClient mongoClient73 = mongoProperties55.createMongoClient(mongoClientOptions71, environment72);
        java.lang.String str74 = mongoProperties55.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder75 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder77 = builder75.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder79 = builder77.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder81 = builder77.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions82 = builder81.build();
        com.mongodb.MongoClient mongoClient83 = mongoProperties55.createMongoClient(mongoClientOptions82);
        com.mongodb.MongoClientOptions.Builder builder84 = mongoProperties0.builder(mongoClientOptions82);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str85 = mongoProperties0.getMongoClientDatabase();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: uri needs to start with mongodb://");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(mongoClient49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(wildcardClass56);
        org.junit.Assert.assertNull(wildcardClass57);
        org.junit.Assert.assertNotNull(mongoClient63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(mongoClientOptions71);
        org.junit.Assert.assertNotNull(mongoClient73);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(mongoClientOptions82);
        org.junit.Assert.assertNotNull(mongoClient83);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.database;
        mongoProperties0.clearPassword();
        java.lang.String str5 = mongoProperties0.username;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.cursorFinalizerEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder12.maxAutoConnectRetryTime((-1L));
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
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getHeartbeatConnectTimeout();
        com.mongodb.ReadPreference readPreference11 = mongoClientOptions7.getReadPreference();
        boolean boolean12 = mongoClientOptions7.isCursorFinalizerEnabled();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(readPreference11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        boolean boolean9 = mongoClientOptions7.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory10 = mongoClientOptions7.getSocketFactory();
        int int11 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions7.getMaxConnectionLifeTime();
        com.mongodb.DBEncoderFactory dBEncoderFactory13 = mongoClientOptions7.getDbEncoderFactory();
        boolean boolean14 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions7.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(socketFactory10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dBEncoderFactory13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxWaitTime((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder6.minHeartbeatFrequency((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        long long8 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int9 = mongoClientOptions7.getMinConnectionsPerHost();
        boolean boolean10 = mongoClientOptions7.isAlwaysUseMBeans();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions7.getDbDecoderFactory();
        long long12 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int13 = mongoClientOptions7.getHeartbeatThreadCount();
        int int14 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int15 = mongoClientOptions7.getConnectionsPerHost();
        java.lang.String str16 = mongoClientOptions7.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.build();
        int int20 = mongoClientOptions19.getLocalThreshold();
        com.mongodb.MongoClientOptions.Builder builder21 = mongoProperties0.builder(mongoClientOptions19);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.cursorFinalizerEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder25 = builder23.heartbeatConnectRetryFrequency((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        int int13 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int15 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions7.getDbDecoderFactory();
        boolean boolean17 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int18 = mongoClientOptions7.getLocalThreshold();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.minHeartbeatFrequency((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxWaitTime((int) (byte) -1);
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str11 = mongoProperties0.getUsername();
        mongoProperties0.setHost("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        int int4 = mongoProperties0.getDEFAULT_PORT();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.autoConnectRetry(false);
        boolean boolean21 = mongoClientOptions12.equals((java.lang.Object) false);
        int int22 = mongoClientOptions12.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder23.legacyDefaults();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxAutoConnectRetryTime((long) 27017);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.acceptableLatencyDifference(1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder20 = builder18.connectionsPerHost(0);
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        java.lang.String str7 = mongoProperties0.uri;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions7.getDbEncoderFactory();
        int int13 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int14 = mongoClientOptions7.getMinConnectionsPerHost();
        int int15 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int16 = mongoClientOptions7.getLocalThreshold();
        com.mongodb.WriteConcern writeConcern17 = mongoClientOptions7.getWriteConcern();
        boolean boolean18 = mongoClientOptions7.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(writeConcern17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.String str7 = mongoProperties0.host;
        java.lang.String str8 = mongoProperties0.getUri();
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        char[] charArray10 = mongoProperties0.password;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb://localhost/test" + "'", str8, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray10);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.socketKeepAlive(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.maxConnectionLifeTime((int) (byte) -1);
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
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.Integer int7 = mongoProperties0.port;
        java.lang.Integer int8 = mongoProperties0.getPort();
        java.lang.Integer int9 = mongoProperties0.getPort();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.authenticationDatabase = "test";
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        boolean boolean16 = mongoClientOptions15.isSocketKeepAlive();
        boolean boolean17 = mongoClientOptions15.isSocketKeepAlive();
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions15);
        java.lang.String str19 = mongoProperties0.getDatabase();
        java.lang.String str20 = mongoProperties0.username;
        java.lang.Integer int21 = mongoProperties0.getPort();
        java.lang.Class<?> wildcardClass22 = mongoProperties0.getFieldNamingStrategy();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertNull(wildcardClass22);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder3 = builder0.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder5 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder0.heartbeatThreadCount(10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder9 = builder7.heartbeatConnectTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatConnectTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        java.lang.String str9 = mongoProperties0.authenticationDatabase;
        char[] charArray10 = mongoProperties0.getPassword();
        mongoProperties0.setPort((java.lang.Integer) 10000);
        boolean boolean13 = mongoProperties0.hasCustomAddress();
        java.lang.String str14 = mongoProperties0.getDatabase();
        java.lang.String str15 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(charArray10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        boolean boolean9 = mongoClientOptions7.isSocketKeepAlive();
        int int10 = mongoClientOptions7.getHeartbeatSocketTimeout();
        boolean boolean11 = mongoClientOptions7.isAutoConnectRetry();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties12 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass13 = mongoProperties12.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass14 = mongoProperties12.getFieldNamingStrategy();
        mongoProperties12.port = 10;
        mongoProperties12.database = "hi!";
        java.lang.String str19 = mongoProperties12.getUri();
        boolean boolean20 = mongoProperties12.hasCustomCredentials();
        java.lang.String str21 = mongoProperties12.authenticationDatabase;
        char[] charArray22 = mongoProperties12.getPassword();
        mongoProperties12.setPort((java.lang.Integer) 10000);
        boolean boolean25 = mongoClientOptions7.equals((java.lang.Object) 10000);
        javax.net.SocketFactory socketFactory26 = mongoClientOptions7.getSocketFactory();
        int int27 = mongoClientOptions7.getAcceptableLatencyDifference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "mongodb://localhost/test" + "'", str19, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(socketFactory26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder12 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.description("");
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.connectionsPerHost((int) (byte) 1);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass18 = mongoProperties17.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass19 = mongoProperties17.getFieldNamingStrategy();
        mongoProperties17.port = 10;
        mongoProperties17.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        com.mongodb.MongoClient mongoClient25 = mongoProperties17.createMongoClient(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        org.springframework.core.env.Environment environment34 = null;
        com.mongodb.MongoClient mongoClient35 = mongoProperties17.createMongoClient(mongoClientOptions33, environment34);
        java.lang.String str36 = mongoClientOptions33.getRequiredReplicaSetName();
        com.mongodb.DBDecoderFactory dBDecoderFactory37 = mongoClientOptions33.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder38 = builder16.dbDecoderFactory(dBDecoderFactory37);
        com.mongodb.MongoClientOptions.Builder builder39 = builder6.dbDecoderFactory(dBDecoderFactory37);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNotNull(mongoClient25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(dBDecoderFactory37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.maxAutoConnectRetryTime((long) 'a');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.requiredReplicaSetName("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxAutoConnectRetryTime((long) (short) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.acceptableLatencyDifference((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.maxConnectionLifeTime(5000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.Integer int7 = mongoProperties0.port;
        java.lang.Integer int8 = mongoProperties0.getPort();
        java.lang.Integer int9 = mongoProperties0.port;
        char[] charArray10 = null;
        mongoProperties0.setPassword(charArray10);
        mongoProperties0.setDatabase("test");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        mongoProperties0.setPort((java.lang.Integer) 10);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties5 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass6 = mongoProperties5.fieldNamingStrategy;
        boolean boolean7 = mongoProperties5.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        com.mongodb.MongoClient mongoClient16 = mongoProperties5.createMongoClient(mongoClientOptions15);
        int int17 = mongoClientOptions15.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern18 = mongoClientOptions15.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder19 = builder0.writeConcern(writeConcern18);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxConnectionIdleTime(27017);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.heartbeatConnectRetryFrequency(5000);
        com.mongodb.MongoClientOptions.Builder builder25 = builder21.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder27 = builder21.heartbeatSocketTimeout((int) '4');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(writeConcern18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        com.mongodb.WriteConcern writeConcern12 = mongoClientOptions10.getWriteConcern();
        int int13 = mongoClientOptions10.getMinHeartbeatFrequency();
        int int14 = mongoClientOptions10.getConnectionsPerHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNotNull(writeConcern12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int9 = mongoClientOptions7.getMaxConnectionIdleTime();
        boolean boolean10 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int11 = mongoClientOptions7.getMaxConnectionLifeTime();
        boolean boolean12 = mongoClientOptions7.isSocketKeepAlive();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 500 + "'", int8 == 500);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions15.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = builder7.socketFactory(socketFactory16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder7.maxConnectionIdleTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold(5);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.minConnectionsPerHost(20000);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.heartbeatThreadCount((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder16.heartbeatFrequency(0);
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        mongoProperties0.host = "hi!";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        java.lang.String str6 = mongoProperties0.authenticationDatabase;
        java.lang.String str7 = mongoProperties0.host;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.maxConnectionIdleTime(120000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        org.springframework.core.env.Environment environment15 = null;
        com.mongodb.MongoClient mongoClient16 = mongoProperties0.createMongoClient(mongoClientOptions14, environment15);
        java.lang.String str17 = mongoClientOptions14.toString();
        com.mongodb.DBEncoderFactory dBEncoderFactory18 = mongoClientOptions14.getDbEncoderFactory();
        int int19 = mongoClientOptions14.getMaxWaitTime();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(mongoClient16);
        org.junit.Assert.assertNotNull(dBEncoderFactory18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 120000 + "'", int19 == 120000);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.core.env.Environment environment10 = null;
        int int11 = mongoProperties0.determinePort(environment10);
        java.lang.String str12 = mongoProperties0.username;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.maxAutoConnectRetryTime((long) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxWaitTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.heartbeatSocketTimeout((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder12.heartbeatSocketTimeout((int) (short) -1);
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
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getLocalThreshold();
        boolean boolean14 = mongoClientOptions12.isCursorFinalizerEnabled();
        int int15 = mongoClientOptions12.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory16 = mongoClientOptions12.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = builder2.dbDecoderFactory(dBDecoderFactory16);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder24 = builder20.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder24.build();
        int int26 = mongoClientOptions25.getSocketTimeout();
        int int27 = mongoClientOptions25.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference28 = mongoClientOptions25.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder29 = builder17.readPreference(readPreference28);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder33 = builder29.heartbeatThreadCount((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatThreadCount must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 500 + "'", int15 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(readPreference28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.host = "mongodb://localhost/test";
        java.lang.String str7 = mongoProperties0.getHost();
        java.lang.Integer int8 = mongoProperties0.port;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.String str8 = mongoProperties0.host;
        java.lang.Integer int9 = mongoProperties0.port;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.Class<?> wildcardClass5 = mongoProperties0.fieldNamingStrategy;
        char[] charArray6 = mongoProperties0.password;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions14.isSocketKeepAlive();
        int int17 = mongoClientOptions14.getHeartbeatSocketTimeout();
        boolean boolean18 = mongoClientOptions14.isAutoConnectRetry();
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14);
        int int20 = mongoClientOptions14.getConnectTimeout();
        int int21 = mongoClientOptions14.getHeartbeatFrequency();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(charArray6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20000 + "'", int17 == 20000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10000 + "'", int20 == 10000);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5000 + "'", int21 == 5000);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getLocalThreshold();
        boolean boolean19 = mongoClientOptions17.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions17.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder7.dbDecoderFactory(dBDecoderFactory21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder29.build();
        int int31 = mongoClientOptions30.getSocketTimeout();
        int int32 = mongoClientOptions30.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference33 = mongoClientOptions30.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder34 = builder22.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder0.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.connectTimeout((int) (byte) 10);
        java.lang.Class<?> wildcardClass38 = builder37.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(readPreference33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        com.mongodb.MongoClientOptions.Builder builder7 = builder2.maxAutoConnectRetryTime((long) '#');
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(10);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxConnectionLifeTime(1);
        com.mongodb.MongoClientOptions.Builder builder11 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.description("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder17.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        javax.net.SocketFactory socketFactory27 = mongoClientOptions26.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder28 = builder18.socketFactory(socketFactory27);
        com.mongodb.MongoClientOptions.Builder builder29 = builder8.socketFactory(socketFactory27);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.maxWaitTime((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.description("test");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.username;
        java.lang.String str3 = mongoProperties0.uri;
        java.lang.String str4 = mongoProperties0.gridFsDatabase;
        java.lang.String str5 = mongoProperties0.getAuthenticationDatabase();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb://localhost/test" + "'", str3, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        mongoProperties0.authenticationDatabase = "hi!";
        mongoProperties0.clearPassword();
        char[] charArray12 = mongoProperties0.getPassword();
        java.lang.String str13 = mongoProperties0.getHost();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(charArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        java.lang.String str6 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions14.isSocketKeepAlive();
        int int17 = mongoClientOptions14.getHeartbeatThreadCount();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions14, environment19);
        java.lang.Class<?> wildcardClass21 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray22 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass24 = mongoProperties23.fieldNamingStrategy;
        boolean boolean25 = mongoProperties23.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        com.mongodb.MongoClient mongoClient34 = mongoProperties23.createMongoClient(mongoClientOptions33);
        int int35 = mongoClientOptions33.getMaxWaitTime();
        int int36 = mongoClientOptions33.getHeartbeatConnectTimeout();
        int int37 = mongoClientOptions33.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference38 = mongoClientOptions33.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties0.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder46 = builder42.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder46.build();
        int int48 = mongoClientOptions47.getSocketTimeout();
        int int49 = mongoClientOptions47.getHeartbeatThreadCount();
        java.lang.String str50 = mongoClientOptions47.getRequiredReplicaSetName();
        java.lang.String str51 = mongoClientOptions47.toString();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions47);
        int int53 = mongoClientOptions47.getMinHeartbeatFrequency();
        boolean boolean54 = mongoClientOptions47.isCursorFinalizerEnabled();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000 + "'", int35 == 120000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 120000 + "'", int37 == 120000);
        org.junit.Assert.assertNotNull(readPreference38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 500 + "'", int53 == 500);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions16, environment17);
        java.lang.String str19 = mongoProperties0.host;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.maxWaitTime((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.socketTimeout(1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions16, environment17);
        java.lang.String str19 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder26.build();
        com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions27);
        int int29 = mongoClientOptions27.getHeartbeatSocketTimeout();
        java.lang.String str30 = mongoClientOptions27.toString();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.heartbeatFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.description("");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder19 = builder15.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder21 = builder15.maxAutoConnectRetryTime(100L);
        com.mongodb.MongoClientOptions.Builder builder23 = builder15.maxConnectionLifeTime(27017);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxWaitTime((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        javax.net.SocketFactory socketFactory34 = mongoClientOptions33.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory35 = mongoClientOptions33.getDbEncoderFactory();
        long long36 = mongoClientOptions33.getMaxAutoConnectRetryTime();
        boolean boolean37 = mongoClientOptions33.isAutoConnectRetry();
        com.mongodb.DBDecoderFactory dBDecoderFactory38 = mongoClientOptions33.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder39 = builder25.dbDecoderFactory(dBDecoderFactory38);
        com.mongodb.MongoClientOptions.Builder builder40 = builder8.dbDecoderFactory(dBDecoderFactory38);
        com.mongodb.MongoClientOptions.Builder builder41 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder47 = builder43.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder47.build();
        int int49 = mongoClientOptions48.getSocketTimeout();
        int int50 = mongoClientOptions48.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference51 = mongoClientOptions48.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder52 = builder8.readPreference(readPreference51);
        com.mongodb.MongoClientOptions.Builder builder54 = builder52.maxConnectionIdleTime(5000);
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
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(socketFactory34);
        org.junit.Assert.assertNotNull(dBEncoderFactory35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 10L + "'", long36 == 10L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dBDecoderFactory38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(mongoClientOptions48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(readPreference51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        java.lang.String str6 = mongoProperties0.getHost();
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory17 = mongoClientOptions14.getSocketFactory();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions14, environment18);
        int int20 = mongoClientOptions14.getMinHeartbeatFrequency();
        int int21 = mongoClientOptions14.getSocketTimeout();
        int int22 = mongoClientOptions14.getHeartbeatSocketTimeout();
        java.lang.String str23 = mongoClientOptions14.getRequiredReplicaSetName();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions10.getSocketFactory();
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions10.getDbEncoderFactory();
        long long13 = mongoClientOptions10.getMaxAutoConnectRetryTime();
        int int14 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        java.lang.String str15 = mongoClientOptions10.getRequiredReplicaSetName();
        boolean boolean16 = mongoClientOptions10.isAutoConnectRetry();
        int int17 = mongoClientOptions10.getMaxWaitTime();
        com.mongodb.MongoClientOptions.Builder builder18 = mongoProperties0.builder(mongoClientOptions10);
        java.lang.String str19 = mongoProperties0.getDatabase();
        mongoProperties0.authenticationDatabase = "hi!";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 120000 + "'", int17 == 120000);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        mongoProperties0.setUsername("mongodb://localhost/test");
        java.lang.String str11 = mongoProperties0.getUri();
        org.springframework.core.env.Environment environment12 = null;
        int int13 = mongoProperties0.determinePort(environment12);
        mongoProperties0.database = "test";
        java.lang.String str16 = mongoProperties0.getUsername();
        mongoProperties0.port = 1;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb://localhost/test" + "'", str16, "mongodb://localhost/test");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        long long8 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int9 = mongoClientOptions7.getMinConnectionsPerHost();
        int int10 = mongoClientOptions7.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        java.lang.String str9 = mongoClientOptions7.getRequiredReplicaSetName();
        int int10 = mongoClientOptions7.getMaxWaitTime();
        int int11 = mongoClientOptions7.getHeartbeatSocketTimeout();
        java.lang.String str12 = mongoClientOptions7.getRequiredReplicaSetName();
        int int13 = mongoClientOptions7.getMinHeartbeatFrequency();
        int int14 = mongoClientOptions7.getHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 500 + "'", int13 == 500);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5000 + "'", int14 == 5000);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        mongoProperties0.setUsername("mongodb://localhost/test");
        java.lang.String str11 = mongoProperties0.getUri();
        org.springframework.core.env.Environment environment12 = null;
        int int13 = mongoProperties0.determinePort(environment12);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties14 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass15 = mongoProperties14.fieldNamingStrategy;
        mongoProperties14.host = "hi!";
        java.lang.String str18 = mongoProperties14.uri;
        boolean boolean19 = mongoProperties14.hasCustomAddress();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties20 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass21 = mongoProperties20.fieldNamingStrategy;
        boolean boolean22 = mongoProperties20.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.build();
        com.mongodb.MongoClient mongoClient31 = mongoProperties20.createMongoClient(mongoClientOptions30);
        int int32 = mongoClientOptions30.getMaxWaitTime();
        java.lang.String str33 = mongoClientOptions30.toString();
        com.mongodb.MongoClient mongoClient34 = mongoProperties14.createMongoClient(mongoClientOptions30);
        com.mongodb.MongoClient mongoClient35 = mongoProperties0.createMongoClient(mongoClientOptions30);
        java.lang.String str36 = mongoProperties0.getUsername();
        mongoProperties0.setUsername("hi!");
        java.lang.String str39 = mongoProperties0.database;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb://localhost/test" + "'", str11, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(mongoClient31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 120000 + "'", int32 == 120000);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "mongodb://localhost/test" + "'", str36, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean12 = mongoClientOptions7.isAlwaysUseMBeans();
        int int13 = mongoClientOptions7.getHeartbeatThreadCount();
        int int14 = mongoClientOptions7.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        java.lang.String str9 = mongoClientOptions7.getRequiredReplicaSetName();
        int int10 = mongoClientOptions7.getMaxWaitTime();
        boolean boolean11 = mongoClientOptions7.isAlwaysUseMBeans();
        java.lang.String str12 = mongoClientOptions7.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 120000 + "'", int10 == 120000);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.acceptableLatencyDifference((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxWaitTime(27017);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.requiredReplicaSetName("hi!");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties13 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass14 = mongoProperties13.fieldNamingStrategy;
        mongoProperties13.host = "hi!";
        java.lang.String str17 = mongoProperties13.uri;
        mongoProperties13.setDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder26 = builder24.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.build();
        int int28 = mongoClientOptions27.getLocalThreshold();
        boolean boolean29 = mongoClientOptions27.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder30 = mongoProperties13.builder(mongoClientOptions27);
        com.mongodb.ReadPreference readPreference31 = mongoClientOptions27.getReadPreference();
        com.mongodb.ReadPreference readPreference32 = mongoClientOptions27.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder33 = builder12.readPreference(readPreference32);
        com.mongodb.MongoClientOptions.Builder builder35 = builder12.maxAutoConnectRetryTime((long) 500);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb://localhost/test" + "'", str17, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(readPreference31);
        org.junit.Assert.assertNotNull(readPreference32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        int int13 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int14 = mongoClientOptions10.getMinConnectionsPerHost();
        boolean boolean15 = mongoClientOptions10.isAlwaysUseMBeans();
        boolean boolean16 = mongoClientOptions10.isAutoConnectRetry();
        int int17 = mongoClientOptions10.getMaxConnectionIdleTime();
        boolean boolean18 = mongoClientOptions10.isAlwaysUseMBeans();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        com.mongodb.DBEncoderFactory dBEncoderFactory12 = mongoClientOptions10.getDbEncoderFactory();
        int int13 = mongoClientOptions10.getConnectTimeout();
        int int14 = mongoClientOptions10.getMinHeartbeatFrequency();
        int int15 = mongoClientOptions10.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertNotNull(dBEncoderFactory12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10000 + "'", int13 == 10000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 500 + "'", int14 == 500);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20000 + "'", int15 == 20000);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.connectTimeout(100);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.socketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.minHeartbeatFrequency(97);
        com.mongodb.MongoClientOptions.Builder builder13 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.description("");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.build();
        int int26 = mongoClientOptions25.getLocalThreshold();
        boolean boolean27 = mongoClientOptions25.isCursorFinalizerEnabled();
        int int28 = mongoClientOptions25.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory29 = mongoClientOptions25.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder30 = builder15.dbDecoderFactory(dBDecoderFactory29);
        com.mongodb.MongoClientOptions.Builder builder31 = builder12.dbDecoderFactory(dBDecoderFactory29);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(mongoClientOptions25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 500 + "'", int28 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions7.getReadPreference();
        int int9 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int10 = mongoClientOptions7.getHeartbeatThreadCount();
        int int11 = mongoClientOptions7.getHeartbeatSocketTimeout();
        int int12 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int13 = mongoClientOptions7.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20000 + "'", int11 == 20000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        java.lang.Integer int7 = mongoProperties0.port;
        java.lang.Integer int8 = mongoProperties0.getPort();
        char[] charArray9 = mongoProperties0.getPassword();
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        mongoProperties0.database = "test";
        mongoProperties0.setHost("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(charArray9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getLocalThreshold();
        boolean boolean19 = mongoClientOptions17.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions17.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder7.dbDecoderFactory(dBDecoderFactory21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder29.build();
        int int31 = mongoClientOptions30.getSocketTimeout();
        int int32 = mongoClientOptions30.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference33 = mongoClientOptions30.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder34 = builder22.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder0.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.connectTimeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder39 = builder35.heartbeatConnectRetryFrequency((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(readPreference33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass11 = mongoProperties10.fieldNamingStrategy;
        java.lang.String str12 = mongoProperties10.getAuthenticationDatabase();
        boolean boolean13 = mongoProperties10.hasCustomCredentials();
        boolean boolean14 = mongoProperties10.hasCustomAddress();
        java.lang.String str15 = mongoProperties10.uri;
        mongoProperties10.setDatabase("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties18 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass19 = mongoProperties18.fieldNamingStrategy;
        java.lang.String str20 = mongoProperties18.getAuthenticationDatabase();
        char[] charArray21 = mongoProperties18.getPassword();
        mongoProperties18.host = "hi!";
        mongoProperties18.setUsername("hi!");
        char[] charArray27 = new char[] { '4' };
        mongoProperties18.password = charArray27;
        mongoProperties10.setPassword(charArray27);
        mongoProperties0.setPassword(charArray27);
        java.lang.Class<?> wildcardClass31 = mongoProperties0.getFieldNamingStrategy();
        java.lang.Class<?> wildcardClass32 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb://localhost/test" + "'", str15, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(charArray21);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[4]");
        org.junit.Assert.assertNull(wildcardClass31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder9 = builder6.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder11 = builder6.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder13 = builder6.heartbeatSocketTimeout(0);
        com.mongodb.MongoClientOptions.Builder builder15 = builder6.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.alwaysUseMBeans(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder19 = builder15.connectionsPerHost((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.localThreshold((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.socketTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatConnectRetryFrequency((int) '4');
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.build();
        int int23 = mongoClientOptions22.getLocalThreshold();
        javax.net.SocketFactory socketFactory24 = mongoClientOptions22.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder25 = builder14.socketFactory(socketFactory24);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.build();
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
        org.junit.Assert.assertNotNull(mongoClientOptions22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(socketFactory24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(mongoClientOptions28);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder7 = builder6.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions15.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder17 = builder7.socketFactory(socketFactory16);
        com.mongodb.MongoClientOptions.Builder builder19 = builder7.maxConnectionIdleTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder7.maxConnectionLifeTime((int) '#');
        com.mongodb.MongoClientOptions.Builder builder23 = builder7.minHeartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder25 = builder7.autoConnectRetry(false);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder27 = builder7.minHeartbeatFrequency(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: minHeartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions7.getAcceptableLatencyDifference();
        com.mongodb.WriteConcern writeConcern10 = mongoClientOptions7.getWriteConcern();
        int int11 = mongoClientOptions7.getMinConnectionsPerHost();
        com.mongodb.ReadPreference readPreference12 = mongoClientOptions7.getReadPreference();
        int int13 = mongoClientOptions7.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(writeConcern10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(readPreference12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.build();
        boolean boolean6 = mongoClientOptions5.isAutoConnectRetry();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.Class<?> wildcardClass4 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass5 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setPort((java.lang.Integer) 35);
        java.lang.String str8 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(wildcardClass5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder5 = builder4.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder7.connectionsPerHost(120000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setAuthenticationDatabase("hi!");
        char[] charArray11 = mongoProperties0.getPassword();
        java.lang.String str12 = mongoProperties0.authenticationDatabase;
        java.lang.Class<?> wildcardClass13 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(charArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getUsername();
        java.lang.String str10 = mongoProperties0.host;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime((long) 500);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.heartbeatConnectRetryFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.maxConnectionLifeTime(10000);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder16 = builder14.minHeartbeatFrequency((int) (byte) -1);
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
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.minConnectionsPerHost((int) (byte) 0);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties7 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass8 = mongoProperties7.fieldNamingStrategy;
        boolean boolean9 = mongoProperties7.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        com.mongodb.MongoClient mongoClient18 = mongoProperties7.createMongoClient(mongoClientOptions17);
        com.mongodb.DBDecoderFactory dBDecoderFactory19 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder20 = builder0.dbDecoderFactory(dBDecoderFactory19);
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.minConnectionsPerHost((int) (short) 0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNotNull(dBDecoderFactory19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        java.lang.String str9 = mongoClientOptions7.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.minConnectionsPerHost(15);
        com.mongodb.MongoClientOptions.Builder builder12 = builder6.heartbeatConnectTimeout((int) (byte) 10);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        mongoProperties0.setHost("mongodb://localhost/test");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass12 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.host = "hi!";
        int int15 = mongoProperties11.getDEFAULT_PORT();
        mongoProperties11.host = "";
        mongoProperties11.setHost("hi!");
        char[] charArray24 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties11.setPassword(charArray24);
        mongoProperties0.setPassword(charArray24);
        mongoProperties0.setDatabase("");
        java.lang.String str29 = mongoProperties0.getDatabase();
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder33 = builder30.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.localThreshold(100);
        java.lang.Class<?> wildcardClass36 = builder33.getClass();
        mongoProperties0.fieldNamingStrategy = wildcardClass36;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), " aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), " aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[ , a, a, 4]");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        boolean boolean9 = mongoClientOptions7.isSocketKeepAlive();
        int int10 = mongoClientOptions7.getHeartbeatThreadCount();
        int int11 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int12 = mongoClientOptions7.getLocalThreshold();
        java.lang.String str13 = mongoClientOptions7.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.maxAutoConnectRetryTime((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.heartbeatFrequency((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatFrequency must be greater than 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getHeartbeatConnectTimeout();
        com.mongodb.DBEncoderFactory dBEncoderFactory11 = mongoClientOptions7.getDbEncoderFactory();
        boolean boolean12 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int13 = mongoClientOptions7.getMinConnectionsPerHost();
        java.lang.String str14 = mongoClientOptions7.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertNotNull(dBEncoderFactory11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        mongoProperties0.username = "";
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getSocketTimeout();
        int int17 = mongoClientOptions15.getHeartbeatThreadCount();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions15, environment18);
        boolean boolean20 = mongoClientOptions15.isAlwaysUseMBeans();
        int int21 = mongoClientOptions15.getSocketTimeout();
        boolean boolean22 = mongoClientOptions15.isAutoConnectRetry();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxAutoConnectRetryTime((long) ' ');
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.build();
        int int10 = mongoClientOptions9.getMaxConnectionLifeTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxAutoConnectRetryTime((long) 500);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.heartbeatConnectRetryFrequency((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder2.maxWaitTime((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder2.connectionsPerHost((int) (byte) -1);
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
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatThreadCount();
        int int10 = mongoClientOptions7.getHeartbeatFrequency();
        int int11 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        int int12 = mongoClientOptions7.getHeartbeatThreadCount();
        int int13 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        int int14 = mongoClientOptions7.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5000 + "'", int10 == 5000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 500 + "'", int11 == 500);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.getGridFsDatabase();
        java.lang.Class<?> wildcardClass4 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str5 = mongoProperties0.getDatabase();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(wildcardClass4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setPort((java.lang.Integer) 20000);
        mongoProperties0.clearPassword();
        mongoProperties0.setUri("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.getDatabase();
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.core.env.Environment environment11 = null;
        int int12 = mongoProperties0.determinePort(environment11);
        char[] charArray13 = mongoProperties0.password;
        java.lang.String str14 = mongoProperties0.getUri();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb://localhost/test" + "'", str14, "mongodb://localhost/test");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions16, environment17);
        java.lang.String str19 = mongoProperties0.getGridFsDatabase();
        java.lang.String str20 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.connectionsPerHost((int) (short) 1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.authenticationDatabase = "test";
        mongoProperties0.setGridFsDatabase("test");
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder16.build();
        boolean boolean19 = mongoClientOptions17.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory20 = mongoClientOptions17.getSocketFactory();
        int int21 = mongoClientOptions17.getMaxConnectionLifeTime();
        org.springframework.core.env.Environment environment22 = null;
        com.mongodb.MongoClient mongoClient23 = mongoProperties0.createMongoClient(mongoClientOptions17, environment22);
        com.mongodb.DBDecoderFactory dBDecoderFactory24 = mongoClientOptions17.getDbDecoderFactory();
        int int25 = mongoClientOptions17.getMaxWaitTime();
        boolean boolean26 = mongoClientOptions17.isCursorFinalizerEnabled();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(socketFactory20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(mongoClient23);
        org.junit.Assert.assertNotNull(dBDecoderFactory24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 120000 + "'", int25 == 120000);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        mongoProperties0.setHost("");
        java.lang.String str10 = mongoProperties0.gridFsDatabase;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.setPort((java.lang.Integer) 100);
        mongoProperties0.gridFsDatabase = "hi!";
        char[] charArray7 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(charArray7);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.connectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold(5000);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.minHeartbeatFrequency(15);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout((-1));
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions7.getSocketFactory();
        int int12 = mongoClientOptions7.getConnectTimeout();
        int int13 = mongoClientOptions7.getHeartbeatThreadCount();
        boolean boolean14 = mongoClientOptions7.isAlwaysUseMBeans();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10000 + "'", int12 == 10000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        org.springframework.core.env.Environment environment5 = null;
        int int6 = mongoProperties0.determinePort(environment5);
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.build();
        boolean boolean16 = mongoClientOptions14.equals((java.lang.Object) (short) 0);
        javax.net.SocketFactory socketFactory17 = mongoClientOptions14.getSocketFactory();
        int int18 = mongoClientOptions14.getMaxConnectionLifeTime();
        int int19 = mongoClientOptions14.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder20 = mongoProperties0.builder(mongoClientOptions14);
        java.lang.String str21 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder22 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder25 = builder22.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.heartbeatFrequency((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder28 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.description("");
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.description("");
        com.mongodb.MongoClientOptions.Builder builder38 = builder36.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder40 = builder36.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder42 = builder36.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder49 = builder45.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder51 = builder45.minHeartbeatFrequency((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties52 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass53 = mongoProperties52.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass54 = mongoProperties52.getFieldNamingStrategy();
        mongoProperties52.port = 10;
        mongoProperties52.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions59 = null;
        com.mongodb.MongoClient mongoClient60 = mongoProperties52.createMongoClient(mongoClientOptions59);
        com.mongodb.MongoClientOptions.Builder builder61 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder63 = builder61.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder65 = builder63.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder67 = builder65.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions68 = builder65.build();
        org.springframework.core.env.Environment environment69 = null;
        com.mongodb.MongoClient mongoClient70 = mongoProperties52.createMongoClient(mongoClientOptions68, environment69);
        com.mongodb.DBEncoderFactory dBEncoderFactory71 = mongoClientOptions68.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder72 = builder45.dbEncoderFactory(dBEncoderFactory71);
        com.mongodb.MongoClientOptions.Builder builder73 = builder36.dbEncoderFactory(dBEncoderFactory71);
        com.mongodb.MongoClientOptions.Builder builder74 = builder25.dbEncoderFactory(dBEncoderFactory71);
        com.mongodb.MongoClientOptions mongoClientOptions75 = builder25.build();
        int int76 = mongoClientOptions75.getMaxConnectionIdleTime();
        org.springframework.core.env.Environment environment77 = null;
        com.mongodb.MongoClient mongoClient78 = mongoProperties0.createMongoClient(mongoClientOptions75, environment77);
        mongoProperties0.setUri("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(socketFactory17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(wildcardClass53);
        org.junit.Assert.assertNull(wildcardClass54);
        org.junit.Assert.assertNotNull(mongoClient60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(mongoClientOptions68);
        org.junit.Assert.assertNotNull(mongoClient70);
        org.junit.Assert.assertNotNull(dBEncoderFactory71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(mongoClientOptions75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(mongoClient78);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        javax.net.SocketFactory socketFactory13 = mongoClientOptions10.getSocketFactory();
        int int14 = mongoClientOptions10.getHeartbeatSocketTimeout();
        int int15 = mongoClientOptions10.getHeartbeatThreadCount();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertNotNull(socketFactory13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20000 + "'", int14 == 20000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        java.lang.String str3 = mongoProperties0.uri;
        mongoProperties0.setHost("");
        java.lang.String str6 = mongoProperties0.getHost();
        java.lang.String str7 = mongoProperties0.getUsername();
        mongoProperties0.port = 20000;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass11 = mongoProperties10.fieldNamingStrategy;
        mongoProperties10.host = "hi!";
        mongoProperties10.authenticationDatabase = "";
        java.lang.String str16 = mongoProperties10.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder17 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.build();
        int int25 = mongoClientOptions24.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.description("");
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder32 = builder28.autoConnectRetry(false);
        boolean boolean33 = mongoClientOptions24.equals((java.lang.Object) false);
        int int34 = mongoClientOptions24.getMaxConnectionLifeTime();
        com.mongodb.MongoClientOptions.Builder builder35 = mongoProperties10.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder36 = mongoProperties0.builder(mongoClientOptions24);
        com.mongodb.MongoClientOptions.Builder builder37 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder41 = builder39.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder43 = builder41.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder41.build();
        javax.net.SocketFactory socketFactory45 = mongoClientOptions44.getSocketFactory();
        long long46 = mongoClientOptions44.getMaxAutoConnectRetryTime();
        int int47 = mongoClientOptions44.getHeartbeatConnectTimeout();
        boolean boolean48 = mongoClientOptions24.equals((java.lang.Object) mongoClientOptions44);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties49 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass50 = mongoProperties49.fieldNamingStrategy;
        java.lang.String str51 = mongoProperties49.getAuthenticationDatabase();
        boolean boolean52 = mongoProperties49.hasCustomCredentials();
        boolean boolean53 = mongoProperties49.hasCustomAddress();
        java.lang.String str54 = mongoProperties49.uri;
        java.lang.String str55 = mongoProperties49.authenticationDatabase;
        boolean boolean56 = mongoClientOptions24.equals((java.lang.Object) str55);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb://localhost/test" + "'", str3, "mongodb://localhost/test");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(mongoClientOptions24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 20000 + "'", int25 == 20000);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(mongoClientOptions44);
        org.junit.Assert.assertNotNull(socketFactory45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 20000 + "'", int47 == 20000);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "mongodb://localhost/test" + "'", str54, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.localThreshold((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier(52);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder12.threadsAllowedToBlockForConnectionMultiplier(100);
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(10);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.maxWaitTime((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder12 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        boolean boolean8 = mongoClientOptions7.isSocketKeepAlive();
        boolean boolean9 = mongoClientOptions7.isSocketKeepAlive();
        int int10 = mongoClientOptions7.getHeartbeatThreadCount();
        int int11 = mongoClientOptions7.getMaxConnectionLifeTime();
        boolean boolean12 = mongoClientOptions7.isAutoConnectRetry();
        int int13 = mongoClientOptions7.getAcceptableLatencyDifference();
        int int14 = mongoClientOptions7.getConnectTimeout();
        int int15 = mongoClientOptions7.getMaxWaitTime();
        boolean boolean16 = mongoClientOptions7.isAlwaysUseMBeans();
        int int17 = mongoClientOptions7.getMaxConnectionIdleTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10000 + "'", int14 == 10000);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 120000 + "'", int15 == 120000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getLocalThreshold();
        boolean boolean16 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        boolean boolean18 = mongoClientOptions14.isCursorFinalizerEnabled();
        boolean boolean19 = mongoClientOptions14.isAutoConnectRetry();
        long long20 = mongoClientOptions14.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        long long8 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.connectionsPerHost((int) (byte) 100);
        boolean boolean20 = mongoClientOptions7.equals((java.lang.Object) (byte) 100);
        int int21 = mongoClientOptions7.getMinConnectionsPerHost();
        int int22 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int23 = mongoClientOptions7.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference24 = mongoClientOptions7.getReadPreference();
        boolean boolean25 = mongoClientOptions7.isAlwaysUseMBeans();
        javax.net.SocketFactory socketFactory26 = mongoClientOptions7.getSocketFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 120000 + "'", int23 == 120000);
        org.junit.Assert.assertNotNull(readPreference24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(socketFactory26);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder10 = builder2.description("mongodb://localhost/test");
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder10.minHeartbeatFrequency(0);
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
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str6 = mongoProperties0.database;
        java.lang.String str7 = mongoProperties0.gridFsDatabase;
        java.lang.String str8 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setGridFsDatabase("hi!");
        char[] charArray11 = mongoProperties0.password;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "test" + "'", str8, "test");
        org.junit.Assert.assertNull(charArray11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getLocalThreshold();
        int int9 = mongoClientOptions7.getMaxWaitTime();
        int int10 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int11 = mongoClientOptions7.getHeartbeatFrequency();
        int int12 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions7.getDbDecoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 15 + "'", int8 == 15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 120000 + "'", int9 == 120000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5000 + "'", int11 == 5000);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 500 + "'", int12 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.database;
        int int4 = mongoProperties0.getDEFAULT_PORT();
        java.lang.String str5 = mongoProperties0.authenticationDatabase;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.database;
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.username = "mongodb://localhost/test";
        mongoProperties0.username = "";
        mongoProperties0.setDatabase("mongodb://localhost/test");
        int int11 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27017 + "'", int11 == 27017);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatSocketTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.heartbeatThreadCount((int) '4');
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectTimeout(0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectionsPerHost((int) (short) 0);
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getLocalThreshold();
        boolean boolean16 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        boolean boolean18 = mongoClientOptions14.isCursorFinalizerEnabled();
        int int19 = mongoClientOptions14.getLocalThreshold();
        int int20 = mongoClientOptions14.getHeartbeatFrequency();
        javax.net.SocketFactory socketFactory21 = mongoClientOptions14.getSocketFactory();
        int int22 = mongoClientOptions14.getHeartbeatThreadCount();
        javax.net.SocketFactory socketFactory23 = mongoClientOptions14.getSocketFactory();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5000 + "'", int20 == 5000);
        org.junit.Assert.assertNotNull(socketFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(socketFactory23);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) 100);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.maxWaitTime(5);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        com.mongodb.ReadPreference readPreference17 = mongoClientOptions16.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder18 = builder6.readPreference(readPreference17);
        com.mongodb.MongoClientOptions.Builder builder19 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder21 = builder19.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.build();
        javax.net.SocketFactory socketFactory27 = mongoClientOptions26.getSocketFactory();
        long long28 = mongoClientOptions26.getMaxAutoConnectRetryTime();
        int int29 = mongoClientOptions26.getHeartbeatConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory30 = mongoClientOptions26.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder31 = builder18.dbDecoderFactory(dBDecoderFactory30);
        com.mongodb.MongoClientOptions.Builder builder33 = builder18.minConnectionsPerHost((int) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder35 = builder18.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder37 = builder18.localThreshold((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder39 = builder18.maxAutoConnectRetryTime((long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(readPreference17);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(socketFactory27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 20000 + "'", int29 == 20000);
        org.junit.Assert.assertNotNull(dBDecoderFactory30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        mongoProperties0.setDatabase("mongodb://localhost/test");
        org.springframework.core.env.Environment environment14 = null;
        int int15 = mongoProperties0.determinePort(environment14);
        java.lang.String str16 = mongoProperties0.getGridFsDatabase();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference10 = mongoClientOptions7.getReadPreference();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions7.getSocketFactory();
        int int12 = mongoClientOptions7.getMinConnectionsPerHost();
        java.lang.String str13 = mongoClientOptions7.getRequiredReplicaSetName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(readPreference10);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.getDatabase();
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.core.env.Environment environment11 = null;
        int int12 = mongoProperties0.determinePort(environment11);
        char[] charArray13 = mongoProperties0.password;
        java.lang.String str14 = mongoProperties0.getMongoClientDatabase();
        mongoProperties0.setDatabase("");
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(charArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        int int4 = mongoProperties0.getDEFAULT_PORT();
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.build();
        int int13 = mongoClientOptions12.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.description("");
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder16.autoConnectRetry(false);
        boolean boolean21 = mongoClientOptions12.equals((java.lang.Object) false);
        int int22 = mongoClientOptions12.getHeartbeatSocketTimeout();
        com.mongodb.MongoClientOptions.Builder builder23 = mongoProperties0.builder(mongoClientOptions12);
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxConnectionIdleTime(0);
        com.mongodb.DBEncoderFactory dBEncoderFactory26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder27 = builder23.dbEncoderFactory(dBEncoderFactory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null is not a legal value");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 20000 + "'", int22 == 20000);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        mongoProperties0.setUri("mongodb://localhost/test");
        mongoProperties0.authenticationDatabase = "test";
        mongoProperties0.authenticationDatabase = "";
        java.lang.String str10 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass12 = mongoProperties11.fieldNamingStrategy;
        mongoProperties11.host = "hi!";
        mongoProperties11.authenticationDatabase = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties17 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass18 = mongoProperties17.fieldNamingStrategy;
        mongoProperties17.host = "hi!";
        int int21 = mongoProperties17.getDEFAULT_PORT();
        mongoProperties17.host = "";
        mongoProperties17.setHost("hi!");
        char[] charArray30 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties17.setPassword(charArray30);
        char[] charArray32 = mongoProperties17.password;
        mongoProperties11.setPassword(charArray32);
        mongoProperties0.password = charArray32;
        mongoProperties0.setUri("");
        char[] charArray37 = mongoProperties0.getPassword();
        com.mongodb.MongoClientOptions.Builder builder38 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder40 = builder38.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder44 = builder40.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder44.build();
        int int46 = mongoClientOptions45.getSocketTimeout();
        int int47 = mongoClientOptions45.getHeartbeatThreadCount();
        java.lang.String str48 = mongoClientOptions45.getRequiredReplicaSetName();
        com.mongodb.MongoClient mongoClient49 = mongoProperties0.createMongoClient(mongoClientOptions45);
        mongoProperties0.uri = "hi!";
        java.lang.String str52 = mongoProperties0.uri;
        mongoProperties0.setUri("test");
        java.lang.Class<?> wildcardClass55 = mongoProperties0.getClass();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[\000, \000, \000, \000]");
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(mongoClientOptions45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(mongoClient49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        java.lang.String str3 = mongoProperties0.database;
        java.lang.String str4 = mongoProperties0.host;
        mongoProperties0.username = "mongodb://localhost/test";
        mongoProperties0.username = "";
        boolean boolean9 = mongoProperties0.hasCustomCredentials();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.minConnectionsPerHost(0);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.alwaysUseMBeans(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        mongoProperties0.setHost("hi!");
        mongoProperties0.database = "test";
        int int5 = mongoProperties0.getDEFAULT_PORT();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions.Builder builder15 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder21 = builder17.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder23 = builder17.minHeartbeatFrequency((int) (byte) 10);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass25 = mongoProperties24.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass26 = mongoProperties24.getFieldNamingStrategy();
        mongoProperties24.port = 10;
        mongoProperties24.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        com.mongodb.MongoClient mongoClient32 = mongoProperties24.createMongoClient(mongoClientOptions31);
        com.mongodb.MongoClientOptions.Builder builder33 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder35 = builder33.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder39 = builder37.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions40 = builder37.build();
        org.springframework.core.env.Environment environment41 = null;
        com.mongodb.MongoClient mongoClient42 = mongoProperties24.createMongoClient(mongoClientOptions40, environment41);
        com.mongodb.DBEncoderFactory dBEncoderFactory43 = mongoClientOptions40.getDbEncoderFactory();
        com.mongodb.MongoClientOptions.Builder builder44 = builder17.dbEncoderFactory(dBEncoderFactory43);
        com.mongodb.MongoClientOptions.Builder builder45 = builder8.dbEncoderFactory(dBEncoderFactory43);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder49 = builder45.autoConnectRetry(false);
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
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertNull(wildcardClass26);
        org.junit.Assert.assertNotNull(mongoClient32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(mongoClientOptions40);
        org.junit.Assert.assertNotNull(mongoClient42);
        org.junit.Assert.assertNotNull(dBEncoderFactory43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.maxConnectionIdleTime(10);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.heartbeatConnectTimeout(1);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.connectTimeout(10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder14 = builder8.minConnectionsPerHost((int) (byte) -1);
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
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getHeartbeatConnectTimeout();
        int int11 = mongoClientOptions7.getThreadsAllowedToBlockForConnectionMultiplier();
        boolean boolean12 = mongoClientOptions7.isAutoConnectRetry();
        int int13 = mongoClientOptions7.getConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20000 + "'", int10 == 20000);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.autoConnectRetry(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxConnectionLifeTime((int) (short) 100);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder16 = builder10.heartbeatConnectRetryFrequency((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder18 = builder10.heartbeatConnectRetryFrequency((-1));
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
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.localThreshold((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder8 = builder6.localThreshold((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: localThreshold must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.connectionsPerHost(100);
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.maxAutoConnectRetryTime((long) (byte) 1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxConnectionIdleTime((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        long long8 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder15 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder11.connectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder19 = builder17.connectionsPerHost((int) (byte) 100);
        boolean boolean20 = mongoClientOptions7.equals((java.lang.Object) (byte) 100);
        int int21 = mongoClientOptions7.getAcceptableLatencyDifference();
        com.mongodb.DBDecoderFactory dBDecoderFactory22 = mongoClientOptions7.getDbDecoderFactory();
        int int23 = mongoClientOptions7.getMinHeartbeatFrequency();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(dBDecoderFactory22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 500 + "'", int23 == 500);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxAutoConnectRetryTime((long) 5);
        com.mongodb.MongoClientOptions.Builder builder18 = builder16.connectTimeout((int) (byte) 10);
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.acceptableLatencyDifference((int) '4');
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.heartbeatThreadCount(1);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder10 = builder6.maxConnectionLifeTime(20000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        int int9 = mongoClientOptions7.getSocketTimeout();
        boolean boolean10 = mongoClientOptions7.isCursorFinalizerEnabled();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties11 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass12 = mongoProperties11.fieldNamingStrategy;
        java.lang.String str13 = mongoProperties11.getAuthenticationDatabase();
        char[] charArray14 = mongoProperties11.getPassword();
        mongoProperties11.host = "hi!";
        java.lang.String str17 = mongoProperties11.gridFsDatabase;
        java.lang.String str18 = mongoProperties11.getUri();
        boolean boolean19 = mongoClientOptions7.equals((java.lang.Object) mongoProperties11);
        com.mongodb.WriteConcern writeConcern20 = mongoClientOptions7.getWriteConcern();
        int int21 = mongoClientOptions7.getMaxWaitTime();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(charArray14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "mongodb://localhost/test" + "'", str18, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(writeConcern20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 120000 + "'", int21 == 120000);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        org.springframework.core.env.Environment environment4 = null;
        int int5 = mongoProperties0.determinePort(environment4);
        java.lang.String str6 = mongoProperties0.username;
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        boolean boolean15 = mongoClientOptions14.isSocketKeepAlive();
        boolean boolean16 = mongoClientOptions14.isSocketKeepAlive();
        int int17 = mongoClientOptions14.getHeartbeatThreadCount();
        int int18 = mongoClientOptions14.getThreadsAllowedToBlockForConnectionMultiplier();
        org.springframework.core.env.Environment environment19 = null;
        com.mongodb.MongoClient mongoClient20 = mongoProperties0.createMongoClient(mongoClientOptions14, environment19);
        java.lang.Class<?> wildcardClass21 = mongoProperties0.getFieldNamingStrategy();
        char[] charArray22 = mongoProperties0.password;
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties23 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass24 = mongoProperties23.fieldNamingStrategy;
        boolean boolean25 = mongoProperties23.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder26 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder28 = builder26.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder30 = builder28.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder30.build();
        com.mongodb.MongoClient mongoClient34 = mongoProperties23.createMongoClient(mongoClientOptions33);
        int int35 = mongoClientOptions33.getMaxWaitTime();
        int int36 = mongoClientOptions33.getHeartbeatConnectTimeout();
        int int37 = mongoClientOptions33.getMaxWaitTime();
        com.mongodb.ReadPreference readPreference38 = mongoClientOptions33.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder39 = mongoProperties0.builder(mongoClientOptions33);
        com.mongodb.MongoClientOptions.Builder builder40 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder42 = builder40.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder44 = builder42.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder46 = builder42.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder46.build();
        int int48 = mongoClientOptions47.getSocketTimeout();
        int int49 = mongoClientOptions47.getHeartbeatThreadCount();
        java.lang.String str50 = mongoClientOptions47.getRequiredReplicaSetName();
        java.lang.String str51 = mongoClientOptions47.toString();
        com.mongodb.MongoClientOptions.Builder builder52 = mongoProperties0.builder(mongoClientOptions47);
        int int53 = mongoClientOptions47.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern54 = mongoClientOptions47.getWriteConcern();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(mongoClient20);
        org.junit.Assert.assertNull(wildcardClass21);
        org.junit.Assert.assertNull(charArray22);
        org.junit.Assert.assertNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoClientOptions33);
        org.junit.Assert.assertNotNull(mongoClient34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 120000 + "'", int35 == 120000);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 20000 + "'", int36 == 20000);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 120000 + "'", int37 == 120000);
        org.junit.Assert.assertNotNull(readPreference38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(mongoClientOptions47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 500 + "'", int53 == 500);
        org.junit.Assert.assertNotNull(writeConcern54);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder6.build();
        int int8 = mongoClientOptions7.getSocketTimeout();
        int int9 = mongoClientOptions7.getHeartbeatThreadCount();
        int int10 = mongoClientOptions7.getHeartbeatThreadCount();
        int int11 = mongoClientOptions7.getSocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern11 = mongoClientOptions7.getWriteConcern();
        int int12 = mongoClientOptions7.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(writeConcern11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.build();
        javax.net.SocketFactory socketFactory16 = mongoClientOptions15.getSocketFactory();
        int int17 = mongoClientOptions15.getLocalThreshold();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions15, environment18);
        char[] charArray20 = mongoProperties0.getPassword();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(socketFactory16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertNull(charArray20);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        com.mongodb.ReadPreference readPreference8 = mongoClientOptions7.getReadPreference();
        int int9 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        int int10 = mongoClientOptions7.getSocketTimeout();
        int int11 = mongoClientOptions7.getMinConnectionsPerHost();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(readPreference8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 500 + "'", int9 == 500);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.maxAutoConnectRetryTime((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder10 = builder8.connectionsPerHost(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum value is 1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getHeartbeatSocketTimeout();
        int int9 = mongoClientOptions7.getAcceptableLatencyDifference();
        com.mongodb.WriteConcern writeConcern10 = mongoClientOptions7.getWriteConcern();
        int int11 = mongoClientOptions7.getMinConnectionsPerHost();
        int int12 = mongoClientOptions7.getHeartbeatConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20000 + "'", int8 == 20000);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(writeConcern10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20000 + "'", int12 == 20000);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        int int8 = mongoClientOptions7.getLocalThreshold();
        boolean boolean9 = mongoClientOptions7.isCursorFinalizerEnabled();
        int int10 = mongoClientOptions7.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory11 = mongoClientOptions7.getDbDecoderFactory();
        int int12 = mongoClientOptions7.getMaxConnectionLifeTime();
        int int13 = mongoClientOptions7.getMaxConnectionIdleTime();
        int int14 = mongoClientOptions7.getHeartbeatThreadCount();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        mongoProperties0.setAuthenticationDatabase("hi!");
        java.lang.String str9 = mongoProperties0.getDatabase();
        mongoProperties0.setHost("mongodb://localhost/test");
        mongoProperties0.clearPassword();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.build();
        javax.net.SocketFactory socketFactory8 = mongoClientOptions7.getSocketFactory();
        long long9 = mongoClientOptions7.getMaxAutoConnectRetryTime();
        int int10 = mongoClientOptions7.getMinHeartbeatFrequency();
        javax.net.SocketFactory socketFactory11 = mongoClientOptions7.getSocketFactory();
        int int12 = mongoClientOptions7.getConnectTimeout();
        com.mongodb.DBDecoderFactory dBDecoderFactory13 = mongoClientOptions7.getDbDecoderFactory();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(socketFactory8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 500 + "'", int10 == 500);
        org.junit.Assert.assertNotNull(socketFactory11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10000 + "'", int12 == 10000);
        org.junit.Assert.assertNotNull(dBDecoderFactory13);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        int int13 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int14 = mongoClientOptions10.getMinConnectionsPerHost();
        java.lang.String str15 = mongoClientOptions10.toString();
        int int16 = mongoClientOptions10.getMaxWaitTime();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 120000 + "'", int16 == 120000);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.requiredReplicaSetName("");
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.heartbeatThreadCount(15);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder8.build();
        int int16 = mongoClientOptions15.getLocalThreshold();
        java.lang.String str17 = mongoClientOptions15.getDescription();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder5 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.description("");
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.minConnectionsPerHost((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getLocalThreshold();
        boolean boolean19 = mongoClientOptions17.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions17.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions17.getDbDecoderFactory();
        com.mongodb.MongoClientOptions.Builder builder22 = builder7.dbDecoderFactory(dBDecoderFactory21);
        com.mongodb.MongoClientOptions.Builder builder23 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder29 = builder25.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder29.build();
        int int31 = mongoClientOptions30.getSocketTimeout();
        int int32 = mongoClientOptions30.getHeartbeatThreadCount();
        com.mongodb.ReadPreference readPreference33 = mongoClientOptions30.getReadPreference();
        com.mongodb.MongoClientOptions.Builder builder34 = builder22.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder35 = builder0.readPreference(readPreference33);
        com.mongodb.MongoClientOptions.Builder builder37 = builder35.connectTimeout((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.MongoClientOptions.Builder builder39 = builder35.heartbeatConnectTimeout((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: heartbeatConnectTimeout must be greater than or equal to 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(mongoClientOptions30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(readPreference33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        mongoProperties0.username = "";
        boolean boolean7 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder8 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder14 = builder10.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder14.build();
        int int16 = mongoClientOptions15.getSocketTimeout();
        int int17 = mongoClientOptions15.getHeartbeatThreadCount();
        org.springframework.core.env.Environment environment18 = null;
        com.mongodb.MongoClient mongoClient19 = mongoProperties0.createMongoClient(mongoClientOptions15, environment18);
        boolean boolean20 = mongoClientOptions15.isAlwaysUseMBeans();
        com.mongodb.ReadPreference readPreference21 = mongoClientOptions15.getReadPreference();
        int int22 = mongoClientOptions15.getThreadsAllowedToBlockForConnectionMultiplier();
        long long23 = mongoClientOptions15.getMaxAutoConnectRetryTime();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(mongoClient19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(readPreference21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder2.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder8 = builder2.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder13 = builder9.description("");
        com.mongodb.MongoClientOptions.Builder builder15 = builder9.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder17 = builder15.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder18 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder20 = builder18.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder21 = builder18.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.localThreshold(100);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties24 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass25 = mongoProperties24.fieldNamingStrategy;
        boolean boolean26 = mongoProperties24.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder27 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder31 = builder29.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder33 = builder31.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder31.build();
        com.mongodb.MongoClient mongoClient35 = mongoProperties24.createMongoClient(mongoClientOptions34);
        int int36 = mongoClientOptions34.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern37 = mongoClientOptions34.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder38 = builder21.writeConcern(writeConcern37);
        com.mongodb.MongoClientOptions.Builder builder39 = builder15.writeConcern(writeConcern37);
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties40 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass41 = mongoProperties40.fieldNamingStrategy;
        boolean boolean42 = mongoProperties40.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder43 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder45 = builder43.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder47 = builder45.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder49 = builder47.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder47.build();
        com.mongodb.MongoClient mongoClient51 = mongoProperties40.createMongoClient(mongoClientOptions50);
        int int52 = mongoClientOptions50.getSocketTimeout();
        com.mongodb.WriteConcern writeConcern53 = mongoClientOptions50.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder54 = builder39.writeConcern(writeConcern53);
        com.mongodb.MongoClientOptions.Builder builder55 = builder2.writeConcern(writeConcern53);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(mongoClientOptions34);
        org.junit.Assert.assertNotNull(mongoClient35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(writeConcern37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(mongoClientOptions50);
        org.junit.Assert.assertNotNull(mongoClient51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(writeConcern53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder4 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder6 = builder0.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder0.maxAutoConnectRetryTime((long) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder10 = builder0.maxWaitTime((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold(0);
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.maxConnectionIdleTime(500);
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
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        java.lang.String str7 = mongoProperties0.getUri();
        boolean boolean8 = mongoProperties0.hasCustomCredentials();
        java.lang.String str9 = mongoProperties0.authenticationDatabase;
        com.mongodb.MongoClientOptions.Builder builder10 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder12 = builder10.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder14 = builder12.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.build();
        int int18 = mongoClientOptions17.getLocalThreshold();
        boolean boolean19 = mongoClientOptions17.isCursorFinalizerEnabled();
        int int20 = mongoClientOptions17.getHeartbeatConnectRetryFrequency();
        com.mongodb.DBDecoderFactory dBDecoderFactory21 = mongoClientOptions17.getDbDecoderFactory();
        int int22 = mongoClientOptions17.getMaxConnectionLifeTime();
        int int23 = mongoClientOptions17.getSocketTimeout();
        int int24 = mongoClientOptions17.getThreadsAllowedToBlockForConnectionMultiplier();
        com.mongodb.MongoClientOptions.Builder builder25 = mongoProperties0.builder(mongoClientOptions17);
        java.lang.String str26 = mongoProperties0.host;
        mongoProperties0.authenticationDatabase = "mongodb://localhost/test";
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb://localhost/test" + "'", str7, "mongodb://localhost/test");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 500 + "'", int20 == 500);
        org.junit.Assert.assertNotNull(dBDecoderFactory21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        int int4 = mongoProperties0.getDEFAULT_PORT();
        mongoProperties0.host = "";
        mongoProperties0.setHost("hi!");
        java.lang.String str9 = mongoProperties0.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties10 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass11 = mongoProperties10.fieldNamingStrategy;
        mongoProperties10.host = "hi!";
        mongoProperties10.setUri("mongodb://localhost/test");
        mongoProperties10.authenticationDatabase = "test";
        mongoProperties10.authenticationDatabase = "";
        java.lang.String str20 = mongoProperties10.getAuthenticationDatabase();
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties21 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass22 = mongoProperties21.fieldNamingStrategy;
        mongoProperties21.host = "hi!";
        mongoProperties21.authenticationDatabase = "";
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties27 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass28 = mongoProperties27.fieldNamingStrategy;
        mongoProperties27.host = "hi!";
        int int31 = mongoProperties27.getDEFAULT_PORT();
        mongoProperties27.host = "";
        mongoProperties27.setHost("hi!");
        char[] charArray40 = new char[] { ' ', 'a', 'a', '4' };
        mongoProperties27.setPassword(charArray40);
        char[] charArray42 = mongoProperties27.password;
        mongoProperties21.setPassword(charArray42);
        mongoProperties10.password = charArray42;
        mongoProperties0.password = charArray42;
        java.lang.String str46 = mongoProperties0.getMongoClientDatabase();
        java.lang.String str47 = mongoProperties0.getMongoClientDatabase();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27017 + "'", int4 == 27017);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardClass11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(wildcardClass22);
        org.junit.Assert.assertNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 27017 + "'", int31 == 27017);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , a, a, 4]");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), " aa4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), " aa4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[ , a, a, 4]");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "test" + "'", str46, "test");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "test" + "'", str47, "test");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.heartbeatConnectTimeout((int) '#');
        com.mongodb.MongoClientOptions.Builder builder8 = builder6.description("");
        com.mongodb.MongoClientOptions.Builder builder10 = builder8.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder12 = builder8.cursorFinalizerEnabled(false);
        com.mongodb.MongoClientOptions.Builder builder14 = builder8.autoConnectRetry(false);
        com.mongodb.MongoClientOptions.Builder builder16 = builder8.heartbeatConnectTimeout(120000);
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
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.mongodb.MongoClientOptions.Builder builder0 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder2 = builder0.description("");
        com.mongodb.MongoClientOptions.Builder builder4 = builder2.minHeartbeatFrequency((int) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder6 = builder4.cursorFinalizerEnabled(true);
        com.mongodb.MongoClientOptions.Builder builder8 = builder4.heartbeatConnectTimeout((int) ' ');
        com.mongodb.MongoClientOptions.Builder builder10 = builder4.socketKeepAlive(true);
        com.mongodb.MongoClientOptions.Builder builder11 = builder10.legacyDefaults();
        com.mongodb.MongoClientOptions.Builder builder13 = builder10.maxConnectionLifeTime(35);
        com.mongodb.MongoClientOptions.Builder builder14 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder16 = builder14.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder18 = builder14.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder20 = builder14.minConnectionsPerHost((int) (byte) 0);
        com.mongodb.MongoClientOptions.Builder builder21 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder23 = builder21.description("");
        com.mongodb.MongoClientOptions.Builder builder25 = builder23.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder27 = builder25.socketTimeout(27017);
        com.mongodb.MongoClientOptions.Builder builder29 = builder27.requiredReplicaSetName("hi!");
        com.mongodb.MongoClientOptions.Builder builder30 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder32 = builder30.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder34 = builder32.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder36 = builder34.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.build();
        javax.net.SocketFactory socketFactory38 = mongoClientOptions37.getSocketFactory();
        long long39 = mongoClientOptions37.getMaxAutoConnectRetryTime();
        int int40 = mongoClientOptions37.getMinHeartbeatFrequency();
        com.mongodb.WriteConcern writeConcern41 = mongoClientOptions37.getWriteConcern();
        com.mongodb.DBEncoderFactory dBEncoderFactory42 = mongoClientOptions37.getDbEncoderFactory();
        int int43 = mongoClientOptions37.getMaxConnectionLifeTime();
        int int44 = mongoClientOptions37.getAcceptableLatencyDifference();
        int int45 = mongoClientOptions37.getHeartbeatConnectRetryFrequency();
        javax.net.SocketFactory socketFactory46 = mongoClientOptions37.getSocketFactory();
        com.mongodb.MongoClientOptions.Builder builder47 = builder29.socketFactory(socketFactory46);
        com.mongodb.MongoClientOptions.Builder builder48 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder50 = builder48.alwaysUseMBeans(false);
        com.mongodb.MongoClientOptions.Builder builder52 = builder48.heartbeatFrequency((int) (byte) 10);
        com.mongodb.MongoClientOptions.Builder builder54 = builder48.description("hi!");
        com.mongodb.MongoClientOptions.Builder builder56 = builder48.minHeartbeatFrequency((int) (byte) 100);
        com.mongodb.MongoClientOptions.Builder builder57 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder59 = builder57.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder61 = builder59.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder63 = builder59.localThreshold((int) (short) 0);
        com.mongodb.MongoClientOptions.Builder builder65 = builder59.maxAutoConnectRetryTime((long) 500);
        com.mongodb.MongoClientOptions.Builder builder66 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder68 = builder66.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder70 = builder68.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder72 = builder70.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions73 = builder70.build();
        int int74 = mongoClientOptions73.getHeartbeatSocketTimeout();
        int int75 = mongoClientOptions73.getHeartbeatFrequency();
        boolean boolean76 = mongoClientOptions73.isSocketKeepAlive();
        int int77 = mongoClientOptions73.getMaxWaitTime();
        com.mongodb.WriteConcern writeConcern78 = mongoClientOptions73.getWriteConcern();
        com.mongodb.MongoClientOptions.Builder builder79 = builder59.writeConcern(writeConcern78);
        com.mongodb.MongoClientOptions.Builder builder80 = builder56.writeConcern(writeConcern78);
        com.mongodb.MongoClientOptions.Builder builder81 = builder29.writeConcern(writeConcern78);
        com.mongodb.MongoClientOptions.Builder builder82 = builder20.writeConcern(writeConcern78);
        com.mongodb.MongoClientOptions.Builder builder83 = builder13.writeConcern(writeConcern78);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(socketFactory38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 10L + "'", long39 == 10L);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 500 + "'", int40 == 500);
        org.junit.Assert.assertNotNull(writeConcern41);
        org.junit.Assert.assertNotNull(dBEncoderFactory42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 500 + "'", int45 == 500);
        org.junit.Assert.assertNotNull(socketFactory46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(mongoClientOptions73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 20000 + "'", int74 == 20000);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 5000 + "'", int75 == 5000);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 120000 + "'", int77 == 120000);
        org.junit.Assert.assertNotNull(writeConcern78);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.String str2 = mongoProperties0.getAuthenticationDatabase();
        boolean boolean3 = mongoProperties0.hasCustomCredentials();
        boolean boolean4 = mongoProperties0.hasCustomAddress();
        java.lang.String str5 = mongoProperties0.uri;
        mongoProperties0.uri = "test";
        mongoProperties0.username = "";
        mongoProperties0.setGridFsDatabase("hi!");
        mongoProperties0.setGridFsDatabase("hi!");
        java.lang.Class<?> wildcardClass14 = mongoProperties0.fieldNamingStrategy;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb://localhost/test" + "'", str5, "mongodb://localhost/test");
        org.junit.Assert.assertNull(wildcardClass14);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.clearPassword();
        java.lang.String str6 = mongoProperties0.getUsername();
        java.lang.String str7 = mongoProperties0.getGridFsDatabase();
        java.lang.String str8 = mongoProperties0.authenticationDatabase;
        mongoProperties0.username = "";
        mongoProperties0.uri = "hi!";
        org.springframework.core.env.Environment environment13 = null;
        int int14 = mongoProperties0.determinePort(environment13);
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27017 + "'", int14 == 27017);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        java.lang.Class<?> wildcardClass2 = mongoProperties0.getFieldNamingStrategy();
        mongoProperties0.port = 10;
        mongoProperties0.database = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        com.mongodb.MongoClient mongoClient8 = mongoProperties0.createMongoClient(mongoClientOptions7);
        com.mongodb.MongoClientOptions.Builder builder9 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder15 = builder13.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.build();
        org.springframework.core.env.Environment environment17 = null;
        com.mongodb.MongoClient mongoClient18 = mongoProperties0.createMongoClient(mongoClientOptions16, environment17);
        java.lang.String str19 = mongoProperties0.getAuthenticationDatabase();
        com.mongodb.MongoClientOptions.Builder builder20 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder22 = builder20.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder24 = builder22.threadsAllowedToBlockForConnectionMultiplier((int) (short) 1);
        com.mongodb.MongoClientOptions.Builder builder26 = builder22.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder26.build();
        com.mongodb.MongoClient mongoClient28 = mongoProperties0.createMongoClient(mongoClientOptions27);
        mongoProperties0.database = "";
        char[] charArray31 = mongoProperties0.password;
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertNull(wildcardClass2);
        org.junit.Assert.assertNotNull(mongoClient8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(mongoClient18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(mongoClient28);
        org.junit.Assert.assertNull(charArray31);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        boolean boolean2 = mongoProperties0.hasCustomAddress();
        com.mongodb.MongoClientOptions.Builder builder3 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder5 = builder3.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder7 = builder5.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.build();
        com.mongodb.MongoClient mongoClient11 = mongoProperties0.createMongoClient(mongoClientOptions10);
        int int12 = mongoClientOptions10.getMaxWaitTime();
        int int13 = mongoClientOptions10.getHeartbeatConnectTimeout();
        int int14 = mongoClientOptions10.getMinConnectionsPerHost();
        int int15 = mongoClientOptions10.getThreadsAllowedToBlockForConnectionMultiplier();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(mongoClient11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 120000 + "'", int12 == 120000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20000 + "'", int13 == 20000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.springframework.boot.autoconfigure.mongo.MongoProperties mongoProperties0 = new org.springframework.boot.autoconfigure.mongo.MongoProperties();
        java.lang.Class<?> wildcardClass1 = mongoProperties0.fieldNamingStrategy;
        mongoProperties0.host = "hi!";
        java.lang.String str4 = mongoProperties0.uri;
        mongoProperties0.setDatabase("hi!");
        com.mongodb.MongoClientOptions.Builder builder7 = new com.mongodb.MongoClientOptions.Builder();
        com.mongodb.MongoClientOptions.Builder builder9 = builder7.maxAutoConnectRetryTime((long) (short) 10);
        com.mongodb.MongoClientOptions.Builder builder11 = builder9.localThreshold((int) 'a');
        com.mongodb.MongoClientOptions.Builder builder13 = builder11.alwaysUseMBeans(true);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.build();
        int int15 = mongoClientOptions14.getLocalThreshold();
        boolean boolean16 = mongoClientOptions14.isCursorFinalizerEnabled();
        com.mongodb.MongoClientOptions.Builder builder17 = mongoProperties0.builder(mongoClientOptions14);
        com.mongodb.ReadPreference readPreference18 = mongoClientOptions14.getReadPreference();
        com.mongodb.ReadPreference readPreference19 = mongoClientOptions14.getReadPreference();
        int int20 = mongoClientOptions14.getAcceptableLatencyDifference();
        int int21 = mongoClientOptions14.getMaxConnectionIdleTime();
        boolean boolean22 = mongoClientOptions14.isAutoConnectRetry();
        org.junit.Assert.assertNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb://localhost/test" + "'", str4, "mongodb://localhost/test");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(readPreference18);
        org.junit.Assert.assertNotNull(readPreference19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }
}

