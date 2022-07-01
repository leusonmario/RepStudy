import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.ServerAddress serverAddress1 = null;
        com.mongodb.MongoOptions mongoOptions2 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo3 = new com.mongodb.Mongo(serverAddress0, serverAddress1, mongoOptions2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((-1L));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException1 = slurper0.new SlurperException();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.mongodb.ServerAddress[] serverAddressArray0 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList1 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList1, serverAddressArray0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext4 = null;
        org.elasticsearch.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper6 = new org.elasticsearch.river.mongodb.Slurper((java.util.List<com.mongodb.ServerAddress>) serverAddressList1, mongoDBRiverDefinition3, sharedContext4, client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverAddressArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.MongoOptions mongoOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo2 = new com.mongodb.Mongo(serverAddress0, mongoOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: serverAddress can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.mongodb.MongoOptions mongoOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("hi!", mongoOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_SOCKET_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult4 = mongo2.fsync(false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONNECT_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30000 + "'", int0 == 30000);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("localhost");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.mongodb.ServerAddress[] serverAddressArray0 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList1 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList1, serverAddressArray0);
        com.mongodb.MongoOptions mongoOptions3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo4 = new com.mongodb.Mongo((java.util.List<com.mongodb.ServerAddress>) serverAddressList1, mongoOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverAddressArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
        float float2 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
        java.util.function.LongUnaryOperator longUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = atomicLong1.getAndUpdate(longUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult3 = mongo2.fsyncAndLock();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("", (-1));
        mongo2.addOption((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult6 = mongo2.fsync(false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("collection", (int) (byte) 100);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.Map map0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(map0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.elasticsearch.common.collect.ImmutableList<org.bson.BasicBSONObject> basicBSONObjectList0 = org.elasticsearch.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(basicBSONObjectList0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long1 = atomicLong0.getAndIncrement();
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong0.getAndAccumulate((long) 100, longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        int int11 = numberList9.indexOf((java.lang.Object) "hi!");
        org.elasticsearch.common.collect.UnmodifiableListIterator<java.lang.Number> numberItor12 = numberList9.listIterator();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList15 = numberList9.subList((int) (short) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (-1) must not be negative");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(numberItor12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.mongodb.ServerAddress[] serverAddressArray0 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList1 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList1, serverAddressArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo3 = new com.mongodb.Mongo((java.util.List<com.mongodb.ServerAddress>) serverAddressList1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hosts list may not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverAddressArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("", (-1));
        mongo2.addOption((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = mongo2.isLocked();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int0 = com.mongodb.Mongo.getMajorVersion();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj4 = basicDBObject1.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject1.markAsPartialObject();
        boolean boolean7 = basicDBObject1.getBoolean("servers");
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        java.lang.String str2 = basicDBObject0.getString("script");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.mongodb.ServerAddress serverAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo1 = new com.mongodb.Mongo(serverAddress0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: serverAddress can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 30000);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("include_collection");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        int int11 = numberList9.indexOf((java.lang.Object) "hi!");
        org.elasticsearch.common.collect.UnmodifiableListIterator<java.lang.Number> numberItor12 = numberList9.listIterator();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong();
        long long16 = atomicLong15.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong18 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long20 = atomicLong18.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray21 = new java.lang.Number[] { (byte) 1, (short) 0, long16, atomicLong18 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList22 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray21);
        int int24 = numberList22.indexOf((java.lang.Object) "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = numberList9.removeAll((java.util.Collection<java.lang.Number>) numberList22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(numberItor12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(numberArray21);
        org.junit.Assert.assertNotNull(numberList22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        java.util.stream.Stream<java.lang.Number> numberStream51 = numberList49.parallelStream();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
        org.junit.Assert.assertNotNull(numberStream51);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.mongodb.MongoOptions mongoOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("collection", mongoOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long2 = atomicLong1.getAndIncrement();
        short short3 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.AUTH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "auth" + "'", str0, "auth");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        java.lang.Object obj6 = basicDBObject2.replace("localhost", (java.lang.Object) '4');
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.ServerAddress serverAddress1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo2 = new com.mongodb.Mongo(serverAddress0, serverAddress1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("servers");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.util.List<com.mongodb.ServerAddress> serverAddressList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo1 = new com.mongodb.Mongo(serverAddressList0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: serverAddresses can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("script");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.getAndAccumulate((long) ' ', longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int0 = com.mongodb.Mongo.MAJOR_VERSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        boolean boolean5 = basicDBObject2.containsField("script_type");
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        int int6 = basicDBObject2.getInt("hi!", (int) (short) 10);
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.mongodb.DBAddress dBAddress0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.DB dB1 = com.mongodb.Mongo.connect(dBAddress0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: serverAddress can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList5 = org.elasticsearch.common.collect.ImmutableList.of((java.lang.Number) 1.0d, (java.lang.Number) (short) 0, (java.lang.Number) 60000, (java.lang.Number) (byte) 1, (java.lang.Number) 10);
        org.junit.Assert.assertNotNull(numberList5);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("", (-1));
        mongo2.addOption((int) (byte) 0);
        mongo2.resetOptions();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = numberList19.add((java.lang.Number) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(strMapList0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        boolean boolean4 = basicDBObject1.containsKey((java.lang.Object) "throttle_size");
        java.util.Date date6 = basicDBObject1.getDate("password");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(date6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean52 = numberList39.add((java.lang.Number) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        // The following exception was thrown during execution in test generation
        try {
            dB2.resetError();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet33 = basicDBObject32.entrySet();
        com.mongodb.BasicDBObject basicDBObject36 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet37 = basicDBObject36.entrySet();
        java.lang.Object obj38 = basicDBObject18.getOrDefault((java.lang.Object) basicDBObject32, (java.lang.Object) basicDBObject36);
        java.util.Date date40 = basicDBObject18.getDate("password");
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertNotNull(strEntrySet33);
        org.junit.Assert.assertNotNull(strEntrySet37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{ \"\" : 100.0}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{ \"\" : 100.0}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{ \"\" : 100.0}");
        org.junit.Assert.assertNull(date40);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("store_statistics");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet6 = basicDBObject5.entrySet();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean12 = basicDBObject9.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject15 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean18 = basicDBObject15.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject21 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj24 = basicDBObject21.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject21.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject28 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean31 = basicDBObject28.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList32 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject5, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject9, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject15, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject19, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject21, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject28);
        long long35 = basicDBObject9.getLong("script", (long) 'a');
        com.mongodb.ReadPreference readPreference37 = null;
        com.mongodb.DBEncoder dBEncoder38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult39 = dB2.command((com.mongodb.DBObject) basicDBObject9, (int) ' ', readPreference37, dBEncoder38);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(strEntrySet6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strMapList32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject3);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject4);
        boolean boolean7 = basicDBObject4.containsKey((java.lang.Object) "throttle_size");
        org.elasticsearch.common.collect.ImmutableList<org.bson.BasicBSONObject> basicBSONObjectList8 = org.elasticsearch.common.collect.ImmutableList.of((org.bson.BasicBSONObject) basicDBObject4);
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo("", (-1));
        com.mongodb.ReadPreference readPreference12 = mongo11.getReadPreference();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult13 = dB2.command((com.mongodb.DBObject) basicDBObject4, readPreference12);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(basicBSONObjectList8);
        org.junit.Assert.assertNotNull(readPreference12);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        int int1 = mongo0.getOptions();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult3 = dB2.getStats();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        org.elasticsearch.common.collect.UnmodifiableListIterator<java.lang.Number> numberItor52 = numberList29.listIterator(1);
        java.util.stream.Stream<java.lang.Number> numberStream53 = numberList29.stream();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
        org.junit.Assert.assertNotNull(numberItor52);
        org.junit.Assert.assertNotNull(numberStream53);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        float float2 = atomicLong1.floatValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        // The following exception was thrown during execution in test generation
        try {
            dB2.dropDatabase();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("throttle_size");
        java.lang.String str2 = mongo1.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult4 = mongo1.fsync(false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj4 = basicDBObject1.replace("script_type", (java.lang.Object) "socket_timeout");
        java.util.Set<java.lang.String> strSet5 = basicDBObject1.keySet();
        int int6 = basicDBObject1.size();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet33 = basicDBObject32.entrySet();
        com.mongodb.BasicDBObject basicDBObject36 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet37 = basicDBObject36.entrySet();
        java.lang.Object obj38 = basicDBObject18.getOrDefault((java.lang.Object) basicDBObject32, (java.lang.Object) basicDBObject36);
        com.mongodb.BasicDBObject basicDBObject39 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject18);
        java.lang.String str42 = basicDBObject39.getString("drop_collection", "");
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertNotNull(strEntrySet33);
        org.junit.Assert.assertNotNull(strEntrySet37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertEquals(obj38.toString(), "{ \"\" : 100.0}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj38), "{ \"\" : 100.0}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj38), "{ \"\" : 100.0}");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        boolean boolean30 = basicDBObject18.isPartialObject();
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("password", "servers", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        java.lang.String[] strArray52 = new java.lang.String[] { "script" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String>[] strComparableArray53 = numberList9.toArray((java.lang.Comparable<java.lang.String>[]) strArray52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: null");
        } catch (java.lang.ArrayStoreException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
        org.junit.Assert.assertNotNull(strArray52);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("disable_index_refresh");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        org.elasticsearch.common.collect.UnmodifiableListIterator<java.lang.Number> numberItor10 = numberList9.listIterator();
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList11 = numberList9.reverse();
        boolean boolean12 = numberList11.isEmpty();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertNotNull(numberItor10);
        org.junit.Assert.assertNotNull(numberList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        boolean boolean4 = basicDBObject1.containsKey("concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long3 = atomicLong1.getAndSet((long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet2 = basicDBObject1.entrySet();
        org.junit.Assert.assertNotNull(strEntrySet2);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        org.elasticsearch.common.collect.UnmodifiableListIterator<java.lang.Number> numberItor52 = numberList29.listIterator(1);
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList53 = numberList29.asList();
        java.lang.String str54 = numberList53.toString();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
        org.junit.Assert.assertNotNull(numberItor52);
        org.junit.Assert.assertNotNull(numberList53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "[1, 0, 0, 1]" + "'", str54, "[1, 0, 0, 1]");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("store_statistics");
        mongo1.setOptions((int) (byte) -1);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        basicDBObject10.clear();
        com.mongodb.Mongo mongo14 = new com.mongodb.Mongo("", (-1));
        com.mongodb.ReadPreference readPreference15 = mongo14.getReadPreference();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List list16 = dBCollection5.distinct("password", (com.mongodb.DBObject) basicDBObject10, readPreference15);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(readPreference15);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.util.Date date6 = null;
        java.util.Date date7 = basicDBObject4.getDate("script", date6);
        java.lang.Object obj9 = basicDBObject4.get("include_collection");
        com.mongodb.DBEncoder dBEncoder11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult12 = dB2.command((com.mongodb.DBObject) basicDBObject4, (int) '#', dBEncoder11);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNull(date7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        java.util.stream.Stream<java.lang.Number> numberStream51 = numberList19.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number53 = numberList19.remove((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
        org.junit.Assert.assertNotNull(numberStream51);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject32 = basicDBObject25.append("ssl_verify_certificate", (java.lang.Object) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong();
        long long36 = atomicLong35.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong38 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long40 = atomicLong38.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray41 = new java.lang.Number[] { (byte) 1, (short) 0, long36, atomicLong38 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList42 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray41);
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong();
        long long46 = atomicLong45.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong48 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long50 = atomicLong48.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray51 = new java.lang.Number[] { (byte) 1, (short) 0, long46, atomicLong48 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList52 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray51);
        java.util.concurrent.atomic.AtomicLong atomicLong55 = new java.util.concurrent.atomic.AtomicLong();
        long long56 = atomicLong55.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong58 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long60 = atomicLong58.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray61 = new java.lang.Number[] { (byte) 1, (short) 0, long56, atomicLong58 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList62 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray61);
        java.util.concurrent.atomic.AtomicLong atomicLong65 = new java.util.concurrent.atomic.AtomicLong();
        long long66 = atomicLong65.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong68 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long70 = atomicLong68.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray71 = new java.lang.Number[] { (byte) 1, (short) 0, long66, atomicLong68 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList72 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray71);
        java.util.concurrent.atomic.AtomicLong atomicLong75 = new java.util.concurrent.atomic.AtomicLong();
        long long76 = atomicLong75.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong78 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long80 = atomicLong78.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray81 = new java.lang.Number[] { (byte) 1, (short) 0, long76, atomicLong78 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList82 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray81);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList83 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList42, (java.util.RandomAccess) numberList52, (java.util.RandomAccess) numberList62, (java.util.RandomAccess) numberList72, (java.util.RandomAccess) numberList82);
        java.lang.Object obj84 = basicDBObject32.remove((java.lang.Object) numberList42);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean86 = numberList42.add((java.lang.Number) 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertNotNull(numberArray41);
        org.junit.Assert.assertNotNull(numberList42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertNotNull(numberArray51);
        org.junit.Assert.assertNotNull(numberList52);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 0L + "'", long60 == 0L);
        org.junit.Assert.assertNotNull(numberArray61);
        org.junit.Assert.assertNotNull(numberList62);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 0L + "'", long66 == 0L);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertNotNull(numberArray71);
        org.junit.Assert.assertNotNull(numberList72);
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + 0L + "'", long76 == 0L);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 0L + "'", long80 == 0L);
        org.junit.Assert.assertNotNull(numberArray81);
        org.junit.Assert.assertNotNull(numberList82);
        org.junit.Assert.assertNotNull(randomAccessList83);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        basicDBObject9.clear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dBCollection5.getCount((com.mongodb.DBObject) basicDBObject9);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult7 = dB2.getLastError((int) '#', (int) (byte) 0, false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet9 = basicDBObject8.entrySet();
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean21 = basicDBObject18.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject22 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject24 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj27 = basicDBObject24.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject24.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean34 = basicDBObject31.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList35 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject8, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject22, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject24, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject31);
        com.mongodb.BasicDBObject basicDBObject38 = basicDBObject31.append("ssl_verify_certificate", (java.lang.Object) 0);
        // The following exception was thrown during execution in test generation
        try {
            dBCollection5.ensureIndex((com.mongodb.DBObject) basicDBObject31, "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting for a server that matches AnyServerSelector{} after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertNotNull(strEntrySet9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strMapList35);
        org.junit.Assert.assertNotNull(basicDBObject38);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject30 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject12);
        java.lang.Object obj32 = basicDBObject12.get("localhost");
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.elasticsearch.common.collect.ImmutableList<java.util.concurrent.atomic.AtomicLong> atomicLongList0 = org.elasticsearch.common.collect.ImmutableList.of();
        org.junit.Assert.assertNotNull(atomicLongList0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        org.bson.types.ObjectId objectId31 = null;
        org.bson.types.ObjectId objectId32 = basicDBObject16.getObjectId("port", objectId31);
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertNull(objectId32);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long3 = atomicLong1.getAndSet((long) (short) 1);
        boolean boolean6 = atomicLong1.compareAndSet(10L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet10 = basicDBObject9.entrySet();
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean16 = basicDBObject13.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean22 = basicDBObject19.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject23 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj28 = basicDBObject25.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject25.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean35 = basicDBObject32.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList36 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject9, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject13, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject19, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject23, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject37 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject19);
        com.mongodb.BasicDBObject basicDBObject40 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet41 = basicDBObject40.entrySet();
        com.mongodb.BasicDBObject basicDBObject44 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean47 = basicDBObject44.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject50 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean53 = basicDBObject50.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject54 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject56 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj59 = basicDBObject56.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject56.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject63 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean66 = basicDBObject63.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList67 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject40, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject44, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject50, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject54, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject56, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject63);
        com.mongodb.BasicDBObject basicDBObject70 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet71 = basicDBObject70.entrySet();
        com.mongodb.BasicDBObject basicDBObject74 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet75 = basicDBObject74.entrySet();
        java.lang.Object obj76 = basicDBObject56.getOrDefault((java.lang.Object) basicDBObject70, (java.lang.Object) basicDBObject74);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.WriteResult writeResult77 = dBCollection5.update((com.mongodb.DBObject) basicDBObject37, (com.mongodb.DBObject) basicDBObject74);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting for a server that matches AnyServerSelector{} after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMapList36);
        org.junit.Assert.assertNotNull(strEntrySet41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strMapList67);
        org.junit.Assert.assertNotNull(strEntrySet71);
        org.junit.Assert.assertNotNull(strEntrySet75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertEquals(obj76.toString(), "{ \"\" : 100.0}");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj76), "{ \"\" : 100.0}");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj76), "{ \"\" : 100.0}");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECT_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("", (-1));
        com.mongodb.ReadPreference readPreference3 = mongo2.getReadPreference();
        // The following exception was thrown during execution in test generation
        try {
            mongo2.dropDatabase("throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(readPreference3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("throttle_size");
        com.mongodb.WriteConcern writeConcern2 = null;
        mongo1.setWriteConcern(writeConcern2);
        java.lang.String str4 = mongo1.toString();
        mongo1.resetOptions();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        int int11 = numberList9.indexOf((java.lang.Object) "hi!");
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList12 = numberList9.asList();
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList13 = numberList9.asList();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(numberList12);
        org.junit.Assert.assertNotNull(numberList13);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("store_statistics");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult3 = mongo1.fsync(true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dBCollection5.getCount();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        org.junit.Assert.assertNotNull(byteSizeValue0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject3);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject4);
        int int6 = basicDBObject4.size();
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject4);
        com.mongodb.ReadPreference readPreference8 = null;
        com.mongodb.DBEncoder dBEncoder9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult10 = dB2.command((com.mongodb.DBObject) basicDBObject4, readPreference8, dBEncoder9);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        java.lang.String str30 = com.mongodb.DBCollection.genIndexName((com.mongodb.DBObject) basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject18);
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("concurrent_bulk_requests");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj4 = basicDBObject1.replace("script_type", (java.lang.Object) "socket_timeout");
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet10 = basicDBObject9.entrySet();
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean16 = basicDBObject13.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean22 = basicDBObject19.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject23 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj28 = basicDBObject25.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject25.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean35 = basicDBObject32.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList36 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject9, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject13, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject19, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject23, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject39 = basicDBObject32.append("ssl_verify_certificate", (java.lang.Object) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        java.util.concurrent.atomic.AtomicLong atomicLong52 = new java.util.concurrent.atomic.AtomicLong();
        long long53 = atomicLong52.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong55 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long57 = atomicLong55.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (byte) 1, (short) 0, long53, atomicLong55 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList59 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray58);
        java.util.concurrent.atomic.AtomicLong atomicLong62 = new java.util.concurrent.atomic.AtomicLong();
        long long63 = atomicLong62.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong65 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long67 = atomicLong65.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (byte) 1, (short) 0, long63, atomicLong65 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList69 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray68);
        java.util.concurrent.atomic.AtomicLong atomicLong72 = new java.util.concurrent.atomic.AtomicLong();
        long long73 = atomicLong72.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong75 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long77 = atomicLong75.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray78 = new java.lang.Number[] { (byte) 1, (short) 0, long73, atomicLong75 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList79 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray78);
        java.util.concurrent.atomic.AtomicLong atomicLong82 = new java.util.concurrent.atomic.AtomicLong();
        long long83 = atomicLong82.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong85 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long87 = atomicLong85.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray88 = new java.lang.Number[] { (byte) 1, (short) 0, long83, atomicLong85 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList89 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray88);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList90 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList49, (java.util.RandomAccess) numberList59, (java.util.RandomAccess) numberList69, (java.util.RandomAccess) numberList79, (java.util.RandomAccess) numberList89);
        java.lang.Object obj91 = basicDBObject39.remove((java.lang.Object) numberList49);
        java.lang.Object obj93 = dBCollection5.apply((com.mongodb.DBObject) basicDBObject39, true);
        // The following exception was thrown during execution in test generation
        try {
            dBCollection5.dropIndex("");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMapList36);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(numberList59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(numberArray68);
        org.junit.Assert.assertNotNull(numberList69);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(numberArray78);
        org.junit.Assert.assertNotNull(numberList79);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(numberArray88);
        org.junit.Assert.assertNotNull(numberList89);
        org.junit.Assert.assertNotNull(randomAccessList90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(obj93);
// flaky:         org.junit.Assert.assertEquals(obj93.toString(), "61810d680c0ae12f12b6ad32");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "61810d680c0ae12f12b6ad32");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "61810d680c0ae12f12b6ad32");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet10 = basicDBObject9.entrySet();
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean16 = basicDBObject13.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean22 = basicDBObject19.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject23 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj28 = basicDBObject25.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject25.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean35 = basicDBObject32.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList36 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject9, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject13, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject19, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject23, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject39 = basicDBObject32.append("ssl_verify_certificate", (java.lang.Object) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        java.util.concurrent.atomic.AtomicLong atomicLong52 = new java.util.concurrent.atomic.AtomicLong();
        long long53 = atomicLong52.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong55 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long57 = atomicLong55.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (byte) 1, (short) 0, long53, atomicLong55 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList59 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray58);
        java.util.concurrent.atomic.AtomicLong atomicLong62 = new java.util.concurrent.atomic.AtomicLong();
        long long63 = atomicLong62.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong65 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long67 = atomicLong65.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (byte) 1, (short) 0, long63, atomicLong65 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList69 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray68);
        java.util.concurrent.atomic.AtomicLong atomicLong72 = new java.util.concurrent.atomic.AtomicLong();
        long long73 = atomicLong72.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong75 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long77 = atomicLong75.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray78 = new java.lang.Number[] { (byte) 1, (short) 0, long73, atomicLong75 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList79 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray78);
        java.util.concurrent.atomic.AtomicLong atomicLong82 = new java.util.concurrent.atomic.AtomicLong();
        long long83 = atomicLong82.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong85 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long87 = atomicLong85.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray88 = new java.lang.Number[] { (byte) 1, (short) 0, long83, atomicLong85 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList89 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray88);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList90 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList49, (java.util.RandomAccess) numberList59, (java.util.RandomAccess) numberList69, (java.util.RandomAccess) numberList79, (java.util.RandomAccess) numberList89);
        java.lang.Object obj91 = basicDBObject39.remove((java.lang.Object) numberList49);
        java.lang.Object obj93 = dBCollection5.apply((com.mongodb.DBObject) basicDBObject39, true);
        java.lang.Class class94 = null;
        dBCollection5.setObjectClass(class94);
        com.mongodb.DBCollection dBCollection97 = dBCollection5.getCollection("include_collection");
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMapList36);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(numberList59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(numberArray68);
        org.junit.Assert.assertNotNull(numberList69);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(numberArray78);
        org.junit.Assert.assertNotNull(numberList79);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(numberArray88);
        org.junit.Assert.assertNotNull(numberList89);
        org.junit.Assert.assertNotNull(randomAccessList90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(obj93);
// flaky:         org.junit.Assert.assertEquals(obj93.toString(), "61810d720c0ae12f12b6ad34");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "61810d720c0ae12f12b6ad34");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "61810d720c0ae12f12b6ad34");
        org.junit.Assert.assertNotNull(dBCollection97);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject30 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject12);
        java.util.Set<java.lang.String> strSet31 = basicDBObject30.keySet();
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertNotNull(strSet31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.DBObject dBObject7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dBCollection5.ensureIndex(dBObject7, "auth", false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong();
        long long4 = atomicLong3.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong6 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long8 = atomicLong6.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray9 = new java.lang.Number[] { (byte) 1, (short) 0, long4, atomicLong6 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList10 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray9);
        java.util.concurrent.atomic.AtomicLong atomicLong13 = new java.util.concurrent.atomic.AtomicLong();
        long long14 = atomicLong13.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong16 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long18 = atomicLong16.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray19 = new java.lang.Number[] { (byte) 1, (short) 0, long14, atomicLong16 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList20 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray19);
        java.util.concurrent.atomic.AtomicLong atomicLong23 = new java.util.concurrent.atomic.AtomicLong();
        long long24 = atomicLong23.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong26 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long28 = atomicLong26.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray29 = new java.lang.Number[] { (byte) 1, (short) 0, long24, atomicLong26 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList30 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray29);
        java.util.concurrent.atomic.AtomicLong atomicLong33 = new java.util.concurrent.atomic.AtomicLong();
        long long34 = atomicLong33.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong36 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long38 = atomicLong36.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray39 = new java.lang.Number[] { (byte) 1, (short) 0, long34, atomicLong36 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList40 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray39);
        java.util.concurrent.atomic.AtomicLong atomicLong43 = new java.util.concurrent.atomic.AtomicLong();
        long long44 = atomicLong43.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong46 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long48 = atomicLong46.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray49 = new java.lang.Number[] { (byte) 1, (short) 0, long44, atomicLong46 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList50 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray49);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList51 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList10, (java.util.RandomAccess) numberList20, (java.util.RandomAccess) numberList30, (java.util.RandomAccess) numberList40, (java.util.RandomAccess) numberList50);
        org.elasticsearch.common.collect.UnmodifiableListIterator<java.lang.Number> numberItor53 = numberList30.listIterator(1);
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList54 = numberList30.asList();
        org.elasticsearch.common.collect.ImmutableList<java.io.Serializable> serializableList55 = org.elasticsearch.common.collect.ImmutableList.of((java.io.Serializable) "servers", (java.io.Serializable) numberList30);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(numberArray9);
        org.junit.Assert.assertNotNull(numberList10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(numberArray19);
        org.junit.Assert.assertNotNull(numberList20);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(numberArray29);
        org.junit.Assert.assertNotNull(numberList30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(numberArray39);
        org.junit.Assert.assertNotNull(numberList40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(numberArray49);
        org.junit.Assert.assertNotNull(numberList50);
        org.junit.Assert.assertNotNull(randomAccessList51);
        org.junit.Assert.assertNotNull(numberItor53);
        org.junit.Assert.assertNotNull(numberList54);
        org.junit.Assert.assertNotNull(serializableList55);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        int int4 = dB2.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            dB2.resetError();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        java.lang.Object obj4 = basicDBObject2.get((java.lang.Object) 30000);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj4 = basicDBObject1.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject1.markAsPartialObject();
        java.lang.Object obj7 = basicDBObject1.get((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("store_statistics");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.DB dB3 = mongo1.getDB("[1, 0, 0, 1]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid database name format. Database name is either empty or it contains spaces.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((-1L));
        java.util.concurrent.atomic.AtomicLong atomicLong3 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long5 = atomicLong3.getAndSet((long) (short) 1);
        boolean boolean8 = atomicLong3.compareAndSet(10L, (long) (short) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong10 = new java.util.concurrent.atomic.AtomicLong((-1L));
        java.lang.Number[] numberArray11 = new java.lang.Number[] { atomicLong1, 10L, atomicLong10 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList12 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray11);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(numberArray11);
        org.junit.Assert.assertNotNull(numberList12);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        com.mongodb.Mongo mongo7 = new com.mongodb.Mongo();
        com.mongodb.DB dB9 = mongo7.getDB("ssl_verify_certificate");
        com.mongodb.Mongo mongo12 = new com.mongodb.Mongo("", (-1));
        com.mongodb.ReadPreference readPreference13 = mongo12.getReadPreference();
        mongo7.setReadPreference(readPreference13);
        mongo6.setReadPreference(readPreference13);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult16 = dB2.command("drop_collection", readPreference13);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dB9);
        org.junit.Assert.assertNotNull(readPreference13);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong();
        long long3 = atomicLong2.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong5 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long7 = atomicLong5.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray8 = new java.lang.Number[] { (byte) 1, (short) 0, long3, atomicLong5 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList9 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray8);
        java.util.concurrent.atomic.AtomicLong atomicLong12 = new java.util.concurrent.atomic.AtomicLong();
        long long13 = atomicLong12.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong15 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long17 = atomicLong15.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray18 = new java.lang.Number[] { (byte) 1, (short) 0, long13, atomicLong15 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList19 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray18);
        java.util.concurrent.atomic.AtomicLong atomicLong22 = new java.util.concurrent.atomic.AtomicLong();
        long long23 = atomicLong22.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong25 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long27 = atomicLong25.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray28 = new java.lang.Number[] { (byte) 1, (short) 0, long23, atomicLong25 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList29 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray28);
        java.util.concurrent.atomic.AtomicLong atomicLong32 = new java.util.concurrent.atomic.AtomicLong();
        long long33 = atomicLong32.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong35 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long37 = atomicLong35.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray38 = new java.lang.Number[] { (byte) 1, (short) 0, long33, atomicLong35 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList39 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray38);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList50 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList9, (java.util.RandomAccess) numberList19, (java.util.RandomAccess) numberList29, (java.util.RandomAccess) numberList39, (java.util.RandomAccess) numberList49);
        java.util.stream.Stream<java.lang.Number> numberStream51 = numberList19.stream();
        org.elasticsearch.common.collect.UnmodifiableIterator<java.lang.Number> numberItor52 = numberList19.iterator();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(numberArray8);
        org.junit.Assert.assertNotNull(numberList9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(numberArray18);
        org.junit.Assert.assertNotNull(numberList19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertNotNull(numberArray28);
        org.junit.Assert.assertNotNull(numberList29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(numberArray38);
        org.junit.Assert.assertNotNull(numberList39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertNotNull(randomAccessList50);
        org.junit.Assert.assertNotNull(numberStream51);
        org.junit.Assert.assertNotNull(numberItor52);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        char[] charArray7 = new char[] { ' ', '4' };
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.WriteResult writeResult9 = dB2.addUser("import_all_collections", charArray7, false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting for a server that matches AnyServerSelector{} after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , 4]");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        java.lang.String str4 = dB2.getName();
        com.mongodb.WriteConcern writeConcern5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult6 = dB2.getLastError(writeConcern5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ssl_verify_certificate" + "'", str4, "ssl_verify_certificate");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet10 = basicDBObject9.entrySet();
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean16 = basicDBObject13.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean22 = basicDBObject19.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject23 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj28 = basicDBObject25.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject25.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean35 = basicDBObject32.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList36 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject9, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject13, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject19, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject23, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject32);
        // The following exception was thrown during execution in test generation
        try {
            dBCollection5.ensureIndex((com.mongodb.DBObject) basicDBObject13, "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting for a server that matches AnyServerSelector{} after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMapList36);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean4 = basicDBObject2.containsKey((java.lang.Object) "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        java.lang.String str4 = dB2.getName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = dB2.collectionExists("ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ssl_verify_certificate" + "'", str4, "ssl_verify_certificate");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        char[] charArray10 = new char[] { '#', 'a', 'a', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = dB2.authenticate("script_type", charArray10);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting for a server that matches AnyServerSelector{} after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "#aa #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "#aa #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#, a, a,  , #]");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        // The following exception was thrown during execution in test generation
        try {
            dB2.forceError();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        org.elasticsearch.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList2 = org.elasticsearch.common.collect.ImmutableList.copyOf(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceList2);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet10 = basicDBObject9.entrySet();
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean16 = basicDBObject13.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean22 = basicDBObject19.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject23 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj28 = basicDBObject25.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject25.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean35 = basicDBObject32.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList36 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject9, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject13, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject19, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject23, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject39 = basicDBObject32.append("ssl_verify_certificate", (java.lang.Object) 0);
        java.util.concurrent.atomic.AtomicLong atomicLong42 = new java.util.concurrent.atomic.AtomicLong();
        long long43 = atomicLong42.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong45 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long47 = atomicLong45.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray48 = new java.lang.Number[] { (byte) 1, (short) 0, long43, atomicLong45 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList49 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray48);
        java.util.concurrent.atomic.AtomicLong atomicLong52 = new java.util.concurrent.atomic.AtomicLong();
        long long53 = atomicLong52.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong55 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long57 = atomicLong55.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray58 = new java.lang.Number[] { (byte) 1, (short) 0, long53, atomicLong55 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList59 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray58);
        java.util.concurrent.atomic.AtomicLong atomicLong62 = new java.util.concurrent.atomic.AtomicLong();
        long long63 = atomicLong62.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong65 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long67 = atomicLong65.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray68 = new java.lang.Number[] { (byte) 1, (short) 0, long63, atomicLong65 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList69 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray68);
        java.util.concurrent.atomic.AtomicLong atomicLong72 = new java.util.concurrent.atomic.AtomicLong();
        long long73 = atomicLong72.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong75 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long77 = atomicLong75.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray78 = new java.lang.Number[] { (byte) 1, (short) 0, long73, atomicLong75 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList79 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray78);
        java.util.concurrent.atomic.AtomicLong atomicLong82 = new java.util.concurrent.atomic.AtomicLong();
        long long83 = atomicLong82.getAndIncrement();
        java.util.concurrent.atomic.AtomicLong atomicLong85 = new java.util.concurrent.atomic.AtomicLong(0L);
        long long87 = atomicLong85.getAndSet((long) (short) 1);
        java.lang.Number[] numberArray88 = new java.lang.Number[] { (byte) 1, (short) 0, long83, atomicLong85 };
        org.elasticsearch.common.collect.ImmutableList<java.lang.Number> numberList89 = org.elasticsearch.common.collect.ImmutableList.copyOf(numberArray88);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList90 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) numberList49, (java.util.RandomAccess) numberList59, (java.util.RandomAccess) numberList69, (java.util.RandomAccess) numberList79, (java.util.RandomAccess) numberList89);
        java.lang.Object obj91 = basicDBObject39.remove((java.lang.Object) numberList49);
        java.lang.Object obj93 = dBCollection5.apply((com.mongodb.DBObject) basicDBObject39, true);
        boolean boolean95 = basicDBObject39.getBoolean("concurrent_bulk_requests");
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strEntrySet10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMapList36);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertNotNull(numberArray48);
        org.junit.Assert.assertNotNull(numberList49);
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + 0L + "'", long53 == 0L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 0L + "'", long57 == 0L);
        org.junit.Assert.assertNotNull(numberArray58);
        org.junit.Assert.assertNotNull(numberList59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 0L + "'", long67 == 0L);
        org.junit.Assert.assertNotNull(numberArray68);
        org.junit.Assert.assertNotNull(numberList69);
        org.junit.Assert.assertTrue("'" + long73 + "' != '" + 0L + "'", long73 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 0L + "'", long77 == 0L);
        org.junit.Assert.assertNotNull(numberArray78);
        org.junit.Assert.assertNotNull(numberList79);
        org.junit.Assert.assertTrue("'" + long83 + "' != '" + 0L + "'", long83 == 0L);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 0L + "'", long87 == 0L);
        org.junit.Assert.assertNotNull(numberArray88);
        org.junit.Assert.assertNotNull(numberList89);
        org.junit.Assert.assertNotNull(randomAccessList90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(obj93);
// flaky:         org.junit.Assert.assertEquals(obj93.toString(), "61810db80c0ae12f12b6ad35");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj93), "61810db80c0ae12f12b6ad35");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj93), "61810db80c0ae12f12b6ad35");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (byte) 100);
        int int2 = basicDBObject1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("", (-1));
        java.lang.String str3 = mongo2.toString();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet3 = basicDBObject2.entrySet();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean9 = basicDBObject6.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean15 = basicDBObject12.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.lang.Object obj21 = basicDBObject18.replace("script_type", (java.lang.Object) "socket_timeout");
        basicDBObject18.markAsPartialObject();
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("", (java.lang.Object) 100.0f);
        boolean boolean28 = basicDBObject25.remove((java.lang.Object) (byte) 100, (java.lang.Object) 100.0d);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList29 = org.elasticsearch.common.collect.ImmutableList.of((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject6, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject16, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject32 = basicDBObject25.append("ssl_verify_certificate", (java.lang.Object) 0);
        java.lang.String str33 = basicDBObject32.toString();
        org.junit.Assert.assertNotNull(strEntrySet3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMapList29);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "{ \"\" : 100.0 , \"ssl_verify_certificate\" : 0}" + "'", str33, "{ \"\" : 100.0 , \"ssl_verify_certificate\" : 0}");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (byte) 100);
        long long2 = atomicLong1.getAndDecrement();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.Mongo mongo9 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        com.mongodb.Mongo mongo10 = new com.mongodb.Mongo();
        com.mongodb.DB dB12 = mongo10.getDB("ssl_verify_certificate");
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo("", (-1));
        com.mongodb.ReadPreference readPreference16 = mongo15.getReadPreference();
        mongo10.setReadPreference(readPreference16);
        mongo9.setReadPreference(readPreference16);
        dBCollection5.setReadPreference(readPreference16);
        dBCollection5.resetIndexCache();
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dB12);
        org.junit.Assert.assertNotNull(readPreference16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        com.mongodb.DBCollection dBCollection5 = dB2.getCollection("servers");
        int int6 = dBCollection5.getOptions();
        com.mongodb.Mongo mongo9 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        com.mongodb.Mongo mongo10 = new com.mongodb.Mongo();
        com.mongodb.DB dB12 = mongo10.getDB("ssl_verify_certificate");
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo("", (-1));
        com.mongodb.ReadPreference readPreference16 = mongo15.getReadPreference();
        mongo10.setReadPreference(readPreference16);
        mongo9.setReadPreference(readPreference16);
        dBCollection5.setReadPreference(readPreference16);
        com.mongodb.DBDecoderFactory dBDecoderFactory20 = null;
        dBCollection5.setDBDecoderFactory(dBDecoderFactory20);
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertNotNull(dBCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dB12);
        org.junit.Assert.assertNotNull(readPreference16);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) 60000);
        short short2 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -5536 + "'", short2 == (short) -5536);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("flush_interval");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.mongodb.MongoURI mongoURI0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo1 = new com.mongodb.Mongo(mongoURI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -5536);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult6 = dB2.command("filter", 0);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
        long long2 = atomicLong1.getAndDecrement();
        java.lang.Class<?> wildcardClass3 = atomicLong1.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.DB dB2 = mongo0.getDB("ssl_verify_certificate");
        dB2.resetOptions();
        int int4 = dB2.getOptions();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (byte) 100);
        java.util.Date date8 = null;
        java.util.Date date9 = basicDBObject6.getDate("script", date8);
        java.lang.Object obj11 = basicDBObject6.get("include_collection");
        com.mongodb.Mongo mongo13 = new com.mongodb.Mongo();
        com.mongodb.DB dB15 = mongo13.getDB("ssl_verify_certificate");
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo("", (-1));
        com.mongodb.ReadPreference readPreference19 = mongo18.getReadPreference();
        mongo13.setReadPreference(readPreference19);
        com.mongodb.DBEncoder dBEncoder21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult22 = dB2.command((com.mongodb.DBObject) basicDBObject6, (int) '#', readPreference19, dBEncoder21);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out while waiting to connect after 10000 ms");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dB2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(date9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(dB15);
        org.junit.Assert.assertNotNull(readPreference19);
    }
}
