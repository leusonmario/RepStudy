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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
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
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECT_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        int int4 = basicDBObject1.getInt("hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_SOCKET_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            mongo0.dropDatabase("password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("32");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_ACTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        org.bson.types.ObjectId objectId3 = null;
        org.bson.types.ObjectId objectId4 = basicDBObject1.getObjectId("local", objectId3);
        java.lang.Object obj7 = null;
        boolean boolean8 = basicDBObject1.replace("", (java.lang.Object) 0.0f, obj7);
        org.junit.Assert.assertNull(objectId4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        com.mongodb.DB[] dBArray2 = new com.mongodb.DB[] {};
        java.util.ArrayList<com.mongodb.DB> dBList3 = new java.util.ArrayList<com.mongodb.DB>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<com.mongodb.DB>) dBList3, dBArray2);
        java.util.Collection<com.mongodb.DB> dBCollection5 = null;
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection7 = mongo6.getUsedDatabases();
        java.util.stream.Stream<com.mongodb.DB> dBStream8 = dBCollection7.stream();
        com.mongodb.Mongo mongo9 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection10 = mongo9.getUsedDatabases();
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.util.stream.Stream<com.mongodb.DB> dBStream13 = dBCollection12.stream();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.collect.ImmutableList<java.util.Collection<com.mongodb.DB>> dBCollectionList14 = org.elasticsearch.common.collect.ImmutableList.of(dBCollection1, (java.util.Collection<com.mongodb.DB>) dBList3, dBCollection5, dBCollection7, dBCollection10, dBCollection12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 2");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(dBArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dBCollection7);
        org.junit.Assert.assertNotNull(dBStream8);
        org.junit.Assert.assertNotNull(dBCollection10);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertNotNull(dBStream13);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mongo0.getConnectPoint();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        short short1 = atomicLong0.shortValue();
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.mongodb.MongoOptions mongoOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("local", mongoOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        // The following exception was thrown during execution in test generation
        try {
            strMapList0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.util.function.LongBinaryOperator longBinaryOperator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = atomicLong1.getAndAccumulate((long) '#', longBinaryOperator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.mongodb.ServerAddress[] serverAddressArray0 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList1 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList1, serverAddressArray0);
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo();
        int int4 = mongo3.getOptions();
        com.mongodb.MongoOptions mongoOptions5 = mongo3.getMongoOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo6 = new com.mongodb.Mongo((java.util.List<com.mongodb.ServerAddress>) serverAddressList1, mongoOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hosts list may not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(serverAddressArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mongoOptions5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = strMapList0.subList(0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (100) must not be greater than size (0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.ServerAddress serverAddress1 = null;
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo();
        int int3 = mongo2.getOptions();
        com.mongodb.MongoOptions mongoOptions4 = mongo2.getMongoOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo5 = new com.mongodb.Mongo(serverAddress0, serverAddress1, mongoOptions4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mongoOptions4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) '#');
        long long3 = atomicLong1.getAndSet((long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndSet((long) '#');
        long long5 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 35L + "'", long5 == 35L);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.util.AbstractMap<java.lang.String, java.lang.Object> strMap0 = null;
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject3);
        java.lang.Object obj6 = basicDBObject3.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject10 = basicDBObject3.append("local", (java.lang.Object) basicDBObject9);
        com.mongodb.BasicDBObject basicDBObject11 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject11);
        java.lang.Object obj14 = basicDBObject11.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject17 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject18 = basicDBObject11.append("local", (java.lang.Object) basicDBObject17);
        java.util.AbstractMap<java.lang.String, java.lang.Object> strMap19 = null;
        com.mongodb.BasicDBObject basicDBObject21 = new com.mongodb.BasicDBObject(60000);
        com.mongodb.BasicDBObject basicDBObject22 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject23 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject22);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList24 = org.elasticsearch.common.collect.ImmutableList.of(strMap0, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject10, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject17, strMap19, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject21, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(basicDBObject18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference1 = null;
        mongo0.setReadPreference(readPreference1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mongo0.getConnectPoint();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        java.lang.Object obj4 = basicDBObject1.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject("import_all_collections", (java.lang.Object) "hi!");
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.ServerAddress serverAddress1 = null;
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo();
        int int4 = mongo3.getOptions();
        com.mongodb.MongoOptions mongoOptions5 = mongo3.getMongoOptions();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("connect_timeout", mongoOptions5);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo7 = new com.mongodb.Mongo(serverAddress0, serverAddress1, mongoOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mongoOptions5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject8);
        java.lang.Object obj11 = basicDBObject8.removeField("hi!");
        java.util.Date date13 = basicDBObject8.getDate("");
        com.mongodb.BasicDBObject basicDBObject14 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject15 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject17 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject16);
        int int20 = basicDBObject17.getInt("hi!", (int) (byte) 100);
        com.mongodb.BasicDBObject basicDBObject21 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject22 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject21);
        java.lang.Object obj24 = basicDBObject21.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject27 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject28 = basicDBObject21.append("local", (java.lang.Object) basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject29 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject30 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject29);
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject31);
        java.lang.Object obj34 = basicDBObject31.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject37 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject38 = basicDBObject31.append("local", (java.lang.Object) basicDBObject37);
        com.mongodb.BasicDBObject basicDBObject39 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject40 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject39);
        java.lang.Object obj42 = basicDBObject39.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject45 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject46 = basicDBObject39.append("local", (java.lang.Object) basicDBObject45);
        com.mongodb.BasicDBObject basicDBObject48 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject49 = new com.mongodb.BasicDBObject();
        boolean boolean51 = basicDBObject49.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject52 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject53 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject52);
        java.lang.Object obj55 = basicDBObject52.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject58 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject59 = basicDBObject52.append("local", (java.lang.Object) basicDBObject58);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet60 = basicDBObject58.entrySet();
        com.mongodb.BasicDBObject basicDBObject61 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject62 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject61);
        java.lang.Object obj64 = basicDBObject61.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject67 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject68 = basicDBObject61.append("local", (java.lang.Object) basicDBObject67);
        com.mongodb.BasicDBObject basicDBObject69 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject70 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject69);
        com.mongodb.BasicDBObject basicDBObject71 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject72 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject71);
        org.bson.types.ObjectId objectId74 = null;
        org.bson.types.ObjectId objectId75 = basicDBObject72.getObjectId("local", objectId74);
        java.lang.Object obj78 = null;
        boolean boolean79 = basicDBObject72.replace("", (java.lang.Object) 0.0f, obj78);
        java.util.ArrayList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList80 = new java.util.ArrayList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>();
        boolean boolean81 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject0);
        boolean boolean82 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject8);
        boolean boolean83 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject14);
        boolean boolean84 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject17);
        boolean boolean85 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject27);
        boolean boolean86 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject30);
        boolean boolean87 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject31);
        boolean boolean88 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject46);
        boolean boolean89 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject48);
        boolean boolean90 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject49);
        boolean boolean91 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject58);
        boolean boolean92 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject67);
        boolean boolean93 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject70);
        boolean boolean94 = strMapList80.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject72);
        int int95 = strMapList80.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(basicDBObject46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(basicDBObject59);
        org.junit.Assert.assertNotNull(strEntrySet60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(basicDBObject68);
        org.junit.Assert.assertNull(objectId75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 14 + "'", int95 == 14);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("drop_collection");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        org.bson.types.ObjectId objectId4 = null;
        org.bson.types.ObjectId objectId5 = basicDBObject2.getObjectId("local", objectId4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strMapList0.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertNull(objectId5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        mongo0.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList4 = mongo0.getDatabaseNames();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(dBTCPConnector3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(129);
        boolean boolean4 = basicDBObject1.remove((java.lang.Object) (short) 1, (java.lang.Object) "import_all_collections");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet8 = basicDBObject6.entrySet();
        java.lang.Object obj10 = basicDBObject6.get("");
        basicDBObject6.markAsPartialObject();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(strEntrySet8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList4 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj5 = null;
        boolean boolean6 = strMapList4.contains(obj5);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList7 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj8 = null;
        boolean boolean9 = strMapList7.contains(obj8);
        int int10 = strMapList4.lastIndexOf((java.lang.Object) strMapList7);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList11 = org.elasticsearch.common.collect.ImmutableList.of();
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList12 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj13 = null;
        boolean boolean14 = strMapList12.contains(obj13);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.collect.ImmutableList<org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>> strMapListList16 = org.elasticsearch.common.collect.ImmutableList.of(strMapList0, strMapList3, strMapList4, strMapList11, strMapList12, strMapList15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 5");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertNotNull(strMapList4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMapList7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strMapList11);
        org.junit.Assert.assertNotNull(strMapList12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        int int6 = strMapList0.lastIndexOf((java.lang.Object) strMapList3);
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject();
        boolean boolean10 = basicDBObject8.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject11 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject8);
        // The following exception was thrown during execution in test generation
        try {
            strMapList0.add((int) '4', (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(132L);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("ssl");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("2.12.4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        int int2 = mongo1.getOptions();
        com.mongodb.MongoOptions mongoOptions3 = mongo1.getMongoOptions();
        com.mongodb.Mongo mongo4 = new com.mongodb.Mongo("connect_timeout", mongoOptions3);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult5 = mongo4.fsyncAndLock();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=connect_timeout:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.UnknownHostException: connect_timeout}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(mongoOptions3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject();
        boolean boolean4 = basicDBObject2.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject2);
        java.util.Collection<java.lang.Object> objCollection6 = basicDBObject5.values();
        // The following exception was thrown during execution in test generation
        try {
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> strMap7 = strMapList0.set((int) (short) -1, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(objCollection6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection2 = mongo1.getUsedDatabases();
        mongo1.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector4 = mongo1.getConnector();
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject("ssl_verify_certificate", (java.lang.Object) mongo1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongo1.getServerAddressList();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection2);
        org.junit.Assert.assertNotNull(dBTCPConnector4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int int0 = com.mongodb.Mongo.getMajorVersion();
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        mongo0.addOption(0);
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strMapList0.remove((java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.concurrent.atomic.AtomicLong atomicLong0 = new java.util.concurrent.atomic.AtomicLong();
        long long2 = atomicLong0.getAndSet((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongo0.getServerAddressList();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        org.bson.types.ObjectId objectId3 = null;
        org.bson.types.ObjectId objectId4 = basicDBObject1.getObjectId("local", objectId3);
        java.lang.Object obj5 = basicDBObject1.clone();
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject7);
        org.bson.types.ObjectId objectId10 = null;
        org.bson.types.ObjectId objectId11 = basicDBObject8.getObjectId("local", objectId10);
        java.lang.Object obj12 = basicDBObject8.clone();
        java.lang.Object obj13 = basicDBObject1.replace("include_fields", (java.lang.Object) basicDBObject8);
        org.junit.Assert.assertNull(objectId4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "{ }");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "{ }");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "{ }");
        org.junit.Assert.assertNull(objectId11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "{ }");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "{ }");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "{ }");
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference1 = null;
        mongo0.setReadPreference(readPreference1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = mongo0.isLocked();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        int int6 = strMapList0.lastIndexOf((java.lang.Object) strMapList3);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject7);
        java.lang.Object obj10 = basicDBObject7.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject14 = basicDBObject7.append("local", (java.lang.Object) basicDBObject13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = strMapList3.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(basicDBObject14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        int int2 = mongo1.getOptions();
        com.mongodb.MongoOptions mongoOptions3 = mongo1.getMongoOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo4 = new com.mongodb.Mongo(serverAddress0, mongoOptions3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: serverAddress can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(mongoOptions3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk" + "'", str0, "bulk");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        mongo0.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        java.util.Collection<com.mongodb.DB> dBCollection4 = mongo0.getUsedDatabases();
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
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
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.ReplicaSetStatus replicaSetStatus2 = mongo0.getReplicaSetStatus();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference1 = null;
        mongo0.setReadPreference(readPreference1);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.ReplicaSetStatus replicaSetStatus3 = mongo0.getReplicaSetStatus();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection2 = mongo1.getUsedDatabases();
        mongo1.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector4 = mongo1.getConnector();
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject("ssl_verify_certificate", (java.lang.Object) mongo1);
        java.lang.Object obj7 = basicDBObject5.get((java.lang.Object) '#');
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject8);
        java.lang.Object obj11 = basicDBObject8.removeField("hi!");
        java.util.Date date13 = basicDBObject8.getDate("");
        java.util.Collection<java.lang.Object> objCollection14 = basicDBObject8.values();
        com.mongodb.BasicDBObject basicDBObject15 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject8);
        java.lang.Object obj16 = basicDBObject5.get((java.lang.Object) basicDBObject15);
        org.junit.Assert.assertNotNull(dBCollection2);
        org.junit.Assert.assertNotNull(dBTCPConnector4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(date13);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongo0.getAllAddress();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext4 = null;
        org.elasticsearch.client.Client client5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper6 = new org.elasticsearch.river.mongodb.Slurper(serverAddressList2, mongoDBRiverDefinition3, sharedContext4, client5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(serverAddressList2);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("connect_timeout");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 100);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet8 = basicDBObject6.entrySet();
        java.lang.Object obj10 = basicDBObject6.get("");
        int int11 = basicDBObject6.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(strEntrySet8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        int int1 = mongo0.getOptions();
        com.mongodb.DBTCPConnector dBTCPConnector2 = mongo0.getConnector();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.DBObject dBObject3 = mongo0.unlock();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dBTCPConnector2);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.mongodb.MongoOptions mongoOptions0 = null;
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        int int2 = mongo1.getOptions();
        com.mongodb.MongoOptions mongoOptions3 = mongo1.getMongoOptions();
        com.mongodb.Mongo mongo5 = new com.mongodb.Mongo();
        int int6 = mongo5.getOptions();
        com.mongodb.MongoOptions mongoOptions7 = mongo5.getMongoOptions();
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("connect_timeout", mongoOptions7);
        com.mongodb.Mongo mongo9 = new com.mongodb.Mongo();
        int int10 = mongo9.getOptions();
        com.mongodb.MongoOptions mongoOptions11 = mongo9.getMongoOptions();
        com.mongodb.Mongo mongo12 = new com.mongodb.Mongo();
        int int13 = mongo12.getOptions();
        com.mongodb.MongoOptions mongoOptions14 = mongo12.getMongoOptions();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.MongoOptions mongoOptions24 = mongo22.getMongoOptions();
        com.mongodb.Mongo mongo25 = new com.mongodb.Mongo();
        int int26 = mongo25.getOptions();
        com.mongodb.MongoOptions mongoOptions27 = mongo25.getMongoOptions();
        com.mongodb.Mongo mongo28 = new com.mongodb.Mongo();
        int int29 = mongo28.getOptions();
        com.mongodb.MongoOptions mongoOptions30 = mongo28.getMongoOptions();
        com.mongodb.MongoOptions mongoOptions31 = null;
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo();
        int int34 = mongo33.getOptions();
        com.mongodb.MongoOptions mongoOptions35 = mongo33.getMongoOptions();
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo("connect_timeout", mongoOptions35);
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.collect.ImmutableList<com.mongodb.MongoOptions> mongoOptionsList37 = org.elasticsearch.common.collect.ImmutableList.of(mongoOptions0, mongoOptions3, mongoOptions7, mongoOptions11, mongoOptions14, mongoOptions20, mongoOptions24, mongoOptions27, mongoOptions30, mongoOptions31, mongoOptions35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: at index 0");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(mongoOptions3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(mongoOptions7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mongoOptions11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(mongoOptions14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(mongoOptions24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(mongoOptions27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(mongoOptions30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(mongoOptions35);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str2 = atomicLong1.toString();
        long long4 = atomicLong1.addAndGet((long) (byte) 100);
        short short5 = atomicLong1.shortValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 132L + "'", long4 == 132L);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 132 + "'", short5 == (short) 132);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        boolean boolean4 = strMapList0.contains((java.lang.Object) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> strMap6 = strMapList0.get(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (0) must be less than size (0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject2);
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject();
        boolean boolean6 = basicDBObject4.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj11 = basicDBObject4.putIfAbsent("local", (java.lang.Object) 129);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject14 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject13);
        org.bson.types.ObjectId objectId16 = null;
        org.bson.types.ObjectId objectId17 = basicDBObject14.getObjectId("local", objectId16);
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) "local");
        java.util.concurrent.atomic.AtomicLong atomicLong21 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str22 = atomicLong21.toString();
        long long24 = atomicLong21.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong21);
        com.mongodb.BasicDBObject basicDBObject27 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str28 = basicDBObject27.toString();
        boolean boolean30 = basicDBObject27.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject33 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject32);
        java.lang.Object obj35 = basicDBObject32.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject38 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject39 = basicDBObject32.append("local", (java.lang.Object) basicDBObject38);
        boolean boolean40 = basicDBObject39.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject43 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject44 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject43);
        org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList45 = org.elasticsearch.common.collect.ImmutableList.of((java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject1, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject4, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject27, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject39, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject44);
        boolean boolean47 = basicDBObject1.containsField("socket_timeout");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objectId17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32" + "'", str22, "32");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{ }" + "'", str28, "{ }");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMapList45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
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
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongo0.getAllAddress();
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo();
        int int4 = mongo3.getOptions();
        com.mongodb.MongoOptions mongoOptions5 = mongo3.getMongoOptions();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo(serverAddressList2, mongoOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext8 = null;
        org.elasticsearch.client.Client client9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper10 = new org.elasticsearch.river.mongodb.Slurper(serverAddressList2, mongoDBRiverDefinition7, sharedContext8, client9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mongoOptions5);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) 10);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        long long3 = atomicLong1.getAndSet((-1L));
        long long4 = atomicLong1.getAndIncrement();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        long long0 = org.elasticsearch.river.mongodb.Slurper.SlurperException.serialVersionUID;
        org.junit.Assert.assertTrue("'" + long0 + "' != '" + 1L + "'", long0 == 1L);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("");
        mongo1.addOption((-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = mongo1.isLocked();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        java.util.Date date5 = basicDBObject0.getDate("");
        java.lang.Object obj8 = basicDBObject0.putIfAbsent("skip_initial_import", (java.lang.Object) 100);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList6 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMapList6.contains(obj7);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList9 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) strMapList0, (java.util.RandomAccess) strMapList3, (java.util.RandomAccess) strMapList6);
        // The following exception was thrown during execution in test generation
        try {
            strMapList3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMapList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(randomAccessList9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        long long2 = atomicLong1.longValue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndAdd((long) 'a');
        long long6 = atomicLong1.getAndAdd((long) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 129L + "'", long6 == 129L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("gridfs");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        boolean boolean4 = strMapList0.contains((java.lang.Object) 0L);
        java.util.function.UnaryOperator<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapUnaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strMapList0.replaceAll(strMapUnaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList6 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMapList6.contains(obj7);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList9 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) strMapList0, (java.util.RandomAccess) strMapList3, (java.util.RandomAccess) strMapList6);
        java.lang.Object[] objArray10 = strMapList6.toArray();
        int int12 = strMapList6.lastIndexOf((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMapList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(randomAccessList9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        mongo0.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult4 = mongo0.fsyncAndLock();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(dBTCPConnector3);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference1 = null;
        mongo0.setReadPreference(readPreference1);
        java.lang.String str3 = mongo0.getVersion();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2.12.4" + "'", str3, "2.12.4");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        boolean boolean8 = basicDBObject7.isPartialObject();
        java.lang.Object obj10 = basicDBObject7.removeField("gridfs");
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) 10);
        java.util.function.LongUnaryOperator longUnaryOperator2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = atomicLong1.updateAndGet(longUnaryOperator2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject5);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject();
        boolean boolean9 = basicDBObject7.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject7);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj14 = basicDBObject7.putIfAbsent("local", (java.lang.Object) 129);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject17 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject16);
        org.bson.types.ObjectId objectId19 = null;
        org.bson.types.ObjectId objectId20 = basicDBObject17.getObjectId("local", objectId19);
        com.mongodb.BasicDBObject basicDBObject21 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) "local");
        java.util.concurrent.atomic.AtomicLong atomicLong24 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str25 = atomicLong24.toString();
        long long27 = atomicLong24.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject28 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong24);
        com.mongodb.BasicDBObject basicDBObject30 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str31 = basicDBObject30.toString();
        boolean boolean33 = basicDBObject30.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject34 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject30);
        com.mongodb.BasicDBObject basicDBObject35 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject36 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject35);
        java.lang.Object obj38 = basicDBObject35.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject41 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject42 = basicDBObject35.append("local", (java.lang.Object) basicDBObject41);
        boolean boolean43 = basicDBObject42.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject46 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject47 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject46);
        org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList48 = org.elasticsearch.common.collect.ImmutableList.of((java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject4, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject5, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject7, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject21, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject28, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject30, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject42, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject47);
        java.lang.Object obj49 = null;
        boolean boolean50 = basicDBObject1.replace("socket_timeout", (java.lang.Object) strMapList48, obj49);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(objectId20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "32" + "'", str25, "32");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32L + "'", long27 == 32L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "{ }" + "'", str31, "{ }");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strMapList48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.elasticsearch.common.logging.ESLogger eSLogger0 = org.elasticsearch.river.mongodb.Slurper.logger;
        org.junit.Assert.assertNotNull(eSLogger0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("store_statistics", 10);
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection4 = mongo3.getUsedDatabases();
        java.lang.String str5 = mongo3.getVersion();
        com.mongodb.ReadPreference readPreference6 = mongo3.getReadPreference();
        mongo2.setReadPreference(readPreference6);
        org.junit.Assert.assertNotNull(dBCollection4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2.12.4" + "'", str5, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference6);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("secondary_read_preference");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult2 = mongo1.fsyncAndLock();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=secondary_read_preference:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.UnknownHostException: secondary_read_preference}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.DB dB3 = mongo0.getDB("{ }");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid database name format. Database name is either empty or it contains spaces.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> strMap4 = strMapList0.get(129);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (129) must be less than size (0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo();
        int int3 = mongo2.getOptions();
        com.mongodb.MongoOptions mongoOptions4 = mongo2.getMongoOptions();
        com.mongodb.Mongo mongo5 = new com.mongodb.Mongo("connect_timeout", mongoOptions4);
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection7 = mongo6.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongo6.getAllAddress();
        com.mongodb.Mongo mongo9 = new com.mongodb.Mongo();
        int int10 = mongo9.getOptions();
        com.mongodb.MongoOptions mongoOptions11 = mongo9.getMongoOptions();
        com.mongodb.Mongo mongo12 = new com.mongodb.Mongo(serverAddressList8, mongoOptions11);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.MongoOptions> mongoOptionsList13 = org.elasticsearch.common.collect.ImmutableList.of(mongoOptions4, mongoOptions11);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo14 = new com.mongodb.Mongo(serverAddress0, mongoOptions11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: serverAddress can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mongoOptions4);
        org.junit.Assert.assertNotNull(dBCollection7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mongoOptions11);
        org.junit.Assert.assertNotNull(mongoOptionsList13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) (short) -1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("throttle_size");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection2 = mongo1.getUsedDatabases();
        mongo1.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector4 = mongo1.getConnector();
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject("ssl_verify_certificate", (java.lang.Object) mongo1);
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject5);
        org.junit.Assert.assertNotNull(dBCollection2);
        org.junit.Assert.assertNotNull(dBTCPConnector4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("index");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("localhost");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        java.util.Date date5 = basicDBObject0.getDate("");
        java.util.Collection<java.lang.Object> objCollection6 = basicDBObject0.values();
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.util.Map map8 = basicDBObject7.toMap();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndAdd((long) 'a');
        int int5 = atomicLong1.intValue();
        long long7 = atomicLong1.addAndGet((long) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 129 + "'", int5 == 129);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 229L + "'", long7 == 229L);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(0L);
        byte byte2 = atomicLong1.byteValue();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        long long3 = atomicLong1.getAndSet((-1L));
        java.util.function.LongUnaryOperator longUnaryOperator4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = atomicLong1.getAndUpdate(longUnaryOperator4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str2 = basicDBObject1.toString();
        boolean boolean4 = basicDBObject1.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{ }" + "'", str2, "{ }");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        org.bson.types.ObjectId objectId3 = null;
        org.bson.types.ObjectId objectId4 = basicDBObject1.getObjectId("local", objectId3);
        org.bson.types.ObjectId objectId6 = null;
        org.bson.types.ObjectId objectId7 = basicDBObject1.getObjectId("filter", objectId6);
        boolean boolean8 = basicDBObject1.isPartialObject();
        java.lang.Object obj10 = basicDBObject1.remove((java.lang.Object) "include_fields");
        org.junit.Assert.assertNull(objectId4);
        org.junit.Assert.assertNull(objectId7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList6 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMapList6.contains(obj7);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList9 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) strMapList0, (java.util.RandomAccess) strMapList3, (java.util.RandomAccess) strMapList6);
        com.mongodb.BasicDBObject basicDBObject11 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject11);
        org.elasticsearch.common.collect.ImmutableList<java.io.Serializable> serializableList13 = org.elasticsearch.common.collect.ImmutableList.of((java.io.Serializable) basicDBObject12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> strMap14 = strMapList6.set(4, (java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMapList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(randomAccessList9);
        org.junit.Assert.assertNotNull(serializableList13);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        int int2 = mongo1.getOptions();
        com.mongodb.MongoOptions mongoOptions3 = mongo1.getMongoOptions();
        com.mongodb.Mongo mongo4 = new com.mongodb.Mongo("connect_timeout", mongoOptions3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList5 = mongo4.getDatabaseNames();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=connect_timeout:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.UnknownHostException: connect_timeout}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(mongoOptions3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        int int6 = strMapList0.lastIndexOf((java.lang.Object) strMapList3);
        // The following exception was thrown during execution in test generation
        try {
            strMapList3.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj3 = basicDBObject1.get("advanced_transformation");
        java.lang.Object obj5 = basicDBObject1.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("concurrent_requests");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        long long3 = atomicLong1.getAndSet((-1L));
        java.util.function.LongBinaryOperator longBinaryOperator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = atomicLong1.getAndAccumulate((long) 1000, longBinaryOperator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        int int6 = strMapList0.lastIndexOf((java.lang.Object) strMapList3);
        com.mongodb.Mongo mongo7 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection8 = mongo7.getUsedDatabases();
        java.util.stream.Stream<com.mongodb.DB> dBStream9 = dBCollection8.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strMapList0.remove((java.lang.Object) dBCollection8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(dBCollection8);
        org.junit.Assert.assertNotNull(dBStream9);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        org.bson.types.ObjectId objectId3 = null;
        org.bson.types.ObjectId objectId4 = basicDBObject1.getObjectId("local", objectId3);
        org.bson.types.ObjectId objectId6 = null;
        org.bson.types.ObjectId objectId7 = basicDBObject1.getObjectId("filter", objectId6);
        boolean boolean8 = basicDBObject1.isPartialObject();
        boolean boolean10 = basicDBObject1.getBoolean("parent_types");
        org.junit.Assert.assertNull(objectId4);
        org.junit.Assert.assertNull(objectId7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList6 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMapList6.contains(obj7);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList9 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) strMapList0, (java.util.RandomAccess) strMapList3, (java.util.RandomAccess) strMapList6);
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        int int12 = mongo11.getOptions();
        com.mongodb.MongoOptions mongoOptions13 = mongo11.getMongoOptions();
        com.mongodb.Mongo mongo14 = new com.mongodb.Mongo("connect_timeout", mongoOptions13);
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.MongoOptions> mongoOptionsList22 = org.elasticsearch.common.collect.ImmutableList.of(mongoOptions13, mongoOptions20);
        int int23 = strMapList0.lastIndexOf((java.lang.Object) mongoOptionsList22);
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMapList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(randomAccessList9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(mongoOptions13);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertNotNull(mongoOptionsList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.util.stream.Stream<com.mongodb.DB> dBStream2 = dBCollection1.stream();
        java.util.stream.Stream<com.mongodb.DB> dBStream3 = dBCollection1.stream();
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(dBStream2);
        org.junit.Assert.assertNotNull(dBStream3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject2);
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject();
        boolean boolean6 = basicDBObject4.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj11 = basicDBObject4.putIfAbsent("local", (java.lang.Object) 129);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject14 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject13);
        org.bson.types.ObjectId objectId16 = null;
        org.bson.types.ObjectId objectId17 = basicDBObject14.getObjectId("local", objectId16);
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) "local");
        java.util.concurrent.atomic.AtomicLong atomicLong21 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str22 = atomicLong21.toString();
        long long24 = atomicLong21.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong21);
        com.mongodb.BasicDBObject basicDBObject27 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str28 = basicDBObject27.toString();
        boolean boolean30 = basicDBObject27.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject33 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject32);
        java.lang.Object obj35 = basicDBObject32.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject38 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject39 = basicDBObject32.append("local", (java.lang.Object) basicDBObject38);
        boolean boolean40 = basicDBObject39.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject43 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject44 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject43);
        org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList45 = org.elasticsearch.common.collect.ImmutableList.of((java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject1, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject4, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject27, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject39, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject44);
        java.util.Date date47 = null;
        java.util.Date date48 = basicDBObject25.getDate("size", date47);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objectId17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32" + "'", str22, "32");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{ }" + "'", str28, "{ }");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMapList45);
        org.junit.Assert.assertNull(date48);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        boolean boolean2 = basicDBObject0.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        boolean boolean4 = basicDBObject0.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject5);
        java.lang.Object obj8 = basicDBObject5.removeField("hi!");
        java.util.Date date10 = basicDBObject5.getDate("");
        java.util.Collection<java.lang.Object> objCollection11 = basicDBObject5.values();
        com.mongodb.BasicDBObject basicDBObject12 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject5);
        boolean boolean13 = basicDBObject0.containsValue((java.lang.Object) basicDBObject5);
        java.lang.Object obj14 = basicDBObject5.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(date10);
        org.junit.Assert.assertNotNull(objCollection11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "{ }");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "{ }");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "{ }");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        double double10 = basicDBObject6.getDouble("gridfs", (double) 129);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 129.0d + "'", double10 == 129.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList6 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMapList6.contains(obj7);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList9 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) strMapList0, (java.util.RandomAccess) strMapList3, (java.util.RandomAccess) strMapList6);
        int int10 = strMapList3.size();
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMapList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(randomAccessList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str2 = atomicLong1.toString();
        long long4 = atomicLong1.getAndAdd((long) '4');
        long long5 = atomicLong1.get();
        java.util.function.LongUnaryOperator longUnaryOperator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = atomicLong1.updateAndGet(longUnaryOperator6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 84L + "'", long5 == 84L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.util.List<com.mongodb.ServerAddress> serverAddressList0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext2 = null;
        org.elasticsearch.client.Client client3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper4 = new org.elasticsearch.river.mongodb.Slurper(serverAddressList0, mongoDBRiverDefinition1, sharedContext2, client3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        org.bson.types.ObjectId objectId4 = null;
        org.bson.types.ObjectId objectId5 = basicDBObject2.getObjectId("local", objectId4);
        org.bson.types.ObjectId objectId7 = null;
        org.bson.types.ObjectId objectId8 = basicDBObject2.getObjectId("filter", objectId7);
        boolean boolean9 = basicDBObject2.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject("type", (java.lang.Object) boolean9);
        org.junit.Assert.assertNull(objectId5);
        org.junit.Assert.assertNull(objectId8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "bulk", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        char[] charArray52 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.WriteResult writeResult54 = dB49.addUser("index", charArray52, false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting for a server that matches AnyServerSelector{}. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[ ]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.WriteResult writeResult51 = dB49.removeUser("import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting for a server that matches AnyServerSelector{}. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject2);
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject();
        boolean boolean6 = basicDBObject4.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj11 = basicDBObject4.putIfAbsent("local", (java.lang.Object) 129);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject14 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject13);
        org.bson.types.ObjectId objectId16 = null;
        org.bson.types.ObjectId objectId17 = basicDBObject14.getObjectId("local", objectId16);
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) "local");
        java.util.concurrent.atomic.AtomicLong atomicLong21 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str22 = atomicLong21.toString();
        long long24 = atomicLong21.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong21);
        com.mongodb.BasicDBObject basicDBObject27 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str28 = basicDBObject27.toString();
        boolean boolean30 = basicDBObject27.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject33 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject32);
        java.lang.Object obj35 = basicDBObject32.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject38 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject39 = basicDBObject32.append("local", (java.lang.Object) basicDBObject38);
        boolean boolean40 = basicDBObject39.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject43 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject44 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject43);
        org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList45 = org.elasticsearch.common.collect.ImmutableList.of((java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject1, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject4, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject27, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject39, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject44);
        java.lang.Object obj48 = basicDBObject27.putIfAbsent("", (java.lang.Object) "32");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objectId17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32" + "'", str22, "32");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{ }" + "'", str28, "{ }");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMapList45);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        int int1 = basicDBObject0.size();
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject2);
        org.elasticsearch.common.collect.ImmutableList<java.io.Serializable> serializableList4 = org.elasticsearch.common.collect.ImmutableList.of((java.io.Serializable) basicDBObject3);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject3);
        basicDBObject0.putAll((org.bson.BSONObject) basicDBObject5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(serializableList4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.WriteConcern writeConcern50 = null;
        // The following exception was thrown during execution in test generation
        try {
            dB49.setWriteConcern(writeConcern50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        java.util.Date date5 = basicDBObject0.getDate("");
        java.util.Collection<java.lang.Object> objCollection6 = basicDBObject0.values();
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        boolean boolean8 = basicDBObject7.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] {};
        org.elasticsearch.common.collect.ImmutableList<java.lang.CharSequence> charSequenceList13 = org.elasticsearch.common.collect.ImmutableList.of((java.lang.CharSequence) "index", (java.lang.CharSequence) "32", (java.lang.CharSequence) "ssl_verify_certificate", (java.lang.CharSequence) "local", (java.lang.CharSequence) "concurrent_bulk_requests", (java.lang.CharSequence) "{ }", (java.lang.CharSequence) "ssl", (java.lang.CharSequence) "filter", (java.lang.CharSequence) "type", (java.lang.CharSequence) "2.12.4", (java.lang.CharSequence) "include_collection", (java.lang.CharSequence) "ssl_verify_certificate", charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceList13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        // The following exception was thrown during execution in test generation
        try {
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> strMap2 = strMapList0.get(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: index (60000) must be less than size (0)");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        java.util.Date date5 = basicDBObject0.getDate("");
        java.util.Collection<java.lang.Object> objCollection6 = basicDBObject0.values();
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj8 = basicDBObject7.copy();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(date5);
        org.junit.Assert.assertNotNull(objCollection6);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "{ }");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "{ }");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "{ }");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        int int0 = com.mongodb.Mongo.MINOR_VERSION;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("size");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet8 = basicDBObject6.entrySet();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject6);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(strEntrySet8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("credentials");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongo0.getAllAddress();
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo();
        int int4 = mongo3.getOptions();
        com.mongodb.MongoOptions mongoOptions5 = mongo3.getMongoOptions();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo(serverAddressList2, mongoOptions5);
        com.mongodb.Mongo mongo7 = new com.mongodb.Mongo(serverAddressList2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext9 = null;
        org.elasticsearch.client.Client client10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper11 = new org.elasticsearch.river.mongodb.Slurper(serverAddressList2, mongoDBRiverDefinition8, sharedContext9, client10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mongoOptions5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection2 = mongo1.getUsedDatabases();
        java.lang.String str3 = mongo1.getVersion();
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject("store_statistics", (java.lang.Object) str3);
        org.junit.Assert.assertNotNull(dBCollection2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2.12.4" + "'", str3, "2.12.4");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.mongodb.MongoOptions mongoOptions1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo2 = new com.mongodb.Mongo("size", mongoOptions1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(129);
        java.lang.String str2 = basicDBObject1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{ }" + "'", str2, "{ }");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        org.junit.Assert.assertNotNull(byteSizeValue0);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("connect_timeout");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = mongo1.getMaxBsonObjectSize();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=connect_timeout:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.UnknownHostException: connect_timeout}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        boolean boolean2 = basicDBObject0.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj5 = basicDBObject0.get("");
        java.lang.Object obj7 = basicDBObject0.get("throttle_size");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(10L);
        boolean boolean4 = atomicLong1.compareAndSet((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str50 = mongo11.debugString();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult54 = dB49.getLastError(10, (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult50 = mongo11.fsyncAndLock();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection2 = mongo1.getUsedDatabases();
        mongo1.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector4 = mongo1.getConnector();
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject("ssl_verify_certificate", (java.lang.Object) mongo1);
        java.lang.Object obj7 = basicDBObject5.get((java.lang.Object) '#');
        java.util.concurrent.atomic.AtomicLong atomicLong9 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject11 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject10);
        org.bson.types.ObjectId objectId13 = null;
        org.bson.types.ObjectId objectId14 = basicDBObject11.getObjectId("local", objectId13);
        java.lang.Object obj15 = basicDBObject5.getOrDefault((java.lang.Object) atomicLong9, (java.lang.Object) "local");
        org.junit.Assert.assertNotNull(dBCollection2);
        org.junit.Assert.assertNotNull(dBTCPConnector4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(objectId14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "local" + "'", obj15, "local");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        long long3 = atomicLong1.getAndSet((-1L));
        atomicLong1.lazySet(229L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        com.mongodb.BasicDBObject basicDBObject52 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject53 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject52);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult54 = dB49.command((com.mongodb.DBObject) basicDBObject53);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        com.mongodb.BasicDBObject basicDBObject51 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject52 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject51);
        org.elasticsearch.common.collect.ImmutableList<java.io.Serializable> serializableList53 = org.elasticsearch.common.collect.ImmutableList.of((java.io.Serializable) basicDBObject52);
        com.mongodb.Mongo mongo54 = new com.mongodb.Mongo();
        int int55 = mongo54.getOptions();
        com.mongodb.ReadPreference readPreference56 = mongo54.getReadPreference();
        com.mongodb.DBEncoder dBEncoder57 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult58 = dB49.command((com.mongodb.DBObject) basicDBObject52, readPreference56, dBEncoder57);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(serializableList53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(readPreference56);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = strMapList0.add((java.util.LinkedHashMap<java.lang.String, java.lang.Object>) basicDBObject2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMapList0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.BasicDBObject basicDBObject50 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject51 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject50);
        org.bson.types.ObjectId objectId53 = null;
        org.bson.types.ObjectId objectId54 = basicDBObject51.getObjectId("local", objectId53);
        java.lang.Object obj55 = basicDBObject51.clone();
        java.util.Date date57 = null;
        java.util.Date date58 = basicDBObject51.getDate("import_all_collections", date57);
        com.mongodb.DBEncoder dBEncoder60 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult61 = dB49.command((com.mongodb.DBObject) basicDBObject51, (int) '4', dBEncoder60);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNull(objectId54);
        org.junit.Assert.assertNotNull(obj55);
        org.junit.Assert.assertEquals(obj55.toString(), "{ }");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj55), "{ }");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj55), "{ }");
        org.junit.Assert.assertNull(date58);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.mongodb.DB[] dBArray0 = new com.mongodb.DB[] {};
        java.util.ArrayList<com.mongodb.DB> dBList1 = new java.util.ArrayList<com.mongodb.DB>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.mongodb.DB>) dBList1, dBArray0);
        java.util.stream.Stream<com.mongodb.DB> dBStream3 = dBList1.parallelStream();
        java.util.stream.Stream<com.mongodb.DB> dBStream4 = dBList1.parallelStream();
        org.junit.Assert.assertNotNull(dBArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dBStream3);
        org.junit.Assert.assertNotNull(dBStream4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) 1);
        long long4 = basicDBObject1.getLong("secondary_read_preference", (long) 4);
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection7 = mongo6.getUsedDatabases();
        java.util.stream.Stream<com.mongodb.DB> dBStream8 = dBCollection7.stream();
        com.mongodb.BasicDBObject basicDBObject9 = basicDBObject1.append("concurrent_bulk_requests", (java.lang.Object) dBCollection7);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 4L + "'", long4 == 4L);
        org.junit.Assert.assertNotNull(dBCollection7);
        org.junit.Assert.assertNotNull(dBStream8);
        org.junit.Assert.assertNotNull(basicDBObject9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str2 = basicDBObject1.toString();
        boolean boolean4 = basicDBObject1.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject();
        boolean boolean12 = basicDBObject10.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject10);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj17 = basicDBObject10.putIfAbsent("local", (java.lang.Object) 129);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject20 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject19);
        org.bson.types.ObjectId objectId22 = null;
        org.bson.types.ObjectId objectId23 = basicDBObject20.getObjectId("local", objectId22);
        com.mongodb.BasicDBObject basicDBObject24 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) "local");
        java.util.concurrent.atomic.AtomicLong atomicLong27 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str28 = atomicLong27.toString();
        long long30 = atomicLong27.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong27);
        com.mongodb.BasicDBObject basicDBObject33 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str34 = basicDBObject33.toString();
        boolean boolean36 = basicDBObject33.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject37 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject33);
        com.mongodb.BasicDBObject basicDBObject38 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject39 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject38);
        java.lang.Object obj41 = basicDBObject38.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject44 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject45 = basicDBObject38.append("local", (java.lang.Object) basicDBObject44);
        boolean boolean46 = basicDBObject45.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject49 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject50 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject49);
        org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList51 = org.elasticsearch.common.collect.ImmutableList.of((java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject7, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject8, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject10, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject24, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject31, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject33, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject45, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject50);
        boolean boolean52 = basicDBObject5.containsValue((java.lang.Object) basicDBObject7);
        com.mongodb.BasicDBObject basicDBObject54 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject55 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject54);
        java.lang.Object obj57 = basicDBObject54.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject60 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject61 = basicDBObject54.append("local", (java.lang.Object) basicDBObject60);
        com.mongodb.BasicDBObject basicDBObject62 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject63 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject62);
        java.lang.Object obj65 = basicDBObject62.removeField("hi!");
        boolean boolean66 = basicDBObject5.replace("concurrent_bulk_requests", (java.lang.Object) "local", obj65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{ }" + "'", str2, "{ }");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(objectId23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "32" + "'", str28, "32");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{ }" + "'", str34, "{ }");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMapList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(basicDBObject61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str3 = atomicLong2.toString();
        long long5 = atomicLong2.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong2);
        long long8 = atomicLong2.getAndSet((long) 4);
        boolean boolean11 = atomicLong2.compareAndSet((long) (-1), (long) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32" + "'", str3, "32");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 84L + "'", long8 == 84L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.mongodb.Mongo mongo1 = new com.mongodb.Mongo("connect_timeout");
        com.mongodb.WriteConcern writeConcern2 = mongo1.getWriteConcern();
        org.junit.Assert.assertNotNull(writeConcern2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        float float2 = atomicLong1.floatValue();
        long long4 = atomicLong1.getAndAdd((long) 'a');
        short short5 = atomicLong1.shortValue();
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 129 + "'", short5 == (short) 129);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.elasticsearch.river.mongodb.Slurper slurper0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper.SlurperException slurperException2 = slurper0.new SlurperException("ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: reflection call to org.elasticsearch.river.mongodb.Slurper$SlurperException with null for superclass argument");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.util.concurrent.atomic.AtomicLong atomicLong2 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject("filter", (java.lang.Object) ' ');
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.mongodb.Mongo mongo2 = new com.mongodb.Mongo();
        int int3 = mongo2.getOptions();
        com.mongodb.MongoOptions mongoOptions4 = mongo2.getMongoOptions();
        com.mongodb.Mongo mongo5 = new com.mongodb.Mongo("connect_timeout", mongoOptions4);
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection7 = mongo6.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongo6.getAllAddress();
        com.mongodb.Mongo mongo9 = new com.mongodb.Mongo();
        int int10 = mongo9.getOptions();
        com.mongodb.MongoOptions mongoOptions11 = mongo9.getMongoOptions();
        com.mongodb.Mongo mongo12 = new com.mongodb.Mongo(serverAddressList8, mongoOptions11);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.MongoOptions> mongoOptionsList13 = org.elasticsearch.common.collect.ImmutableList.of(mongoOptions4, mongoOptions11);
        com.mongodb.Mongo mongo14 = new com.mongodb.Mongo("import_all_collections", mongoOptions4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(mongoOptions4);
        org.junit.Assert.assertNotNull(dBCollection7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(mongoOptions11);
        org.junit.Assert.assertNotNull(mongoOptionsList13);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongo0.getAllAddress();
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo(serverAddressList2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext5 = null;
        org.elasticsearch.client.Client client6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper7 = new org.elasticsearch.river.mongodb.Slurper(serverAddressList2, mongoDBRiverDefinition4, sharedContext5, client6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(serverAddressList2);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) '4');
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongo0.getAllAddress();
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo(serverAddressList2);
        com.mongodb.Mongo mongo4 = new com.mongodb.Mongo(serverAddressList2);
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(serverAddressList2);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "{ }", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult51 = dB49.command("secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.elasticsearch.common.collect.ImmutableList.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>> strMapListBuilder0 = org.elasticsearch.common.collect.ImmutableList.builder();
        org.elasticsearch.common.collect.ImmutableList.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>> strMapListBuilder1 = org.elasticsearch.common.collect.ImmutableList.builder();
        org.elasticsearch.common.collect.ImmutableList.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>> strMapListBuilder2 = org.elasticsearch.common.collect.ImmutableList.builder();
        org.elasticsearch.common.collect.ImmutableList.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>> strMapListBuilder3 = org.elasticsearch.common.collect.ImmutableList.builder();
        org.elasticsearch.common.collect.ImmutableList.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>> strMapListBuilder4 = org.elasticsearch.common.collect.ImmutableList.builder();
        org.elasticsearch.common.collect.ImmutableList.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>> strMapListBuilder5 = org.elasticsearch.common.collect.ImmutableList.builder();
        org.elasticsearch.common.collect.ImmutableList<org.elasticsearch.common.collect.ImmutableCollection.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>>> mapListBuilderList6 = org.elasticsearch.common.collect.ImmutableList.of((org.elasticsearch.common.collect.ImmutableCollection.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>>) strMapListBuilder0, (org.elasticsearch.common.collect.ImmutableCollection.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>>) strMapListBuilder1, (org.elasticsearch.common.collect.ImmutableCollection.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>>) strMapListBuilder2, (org.elasticsearch.common.collect.ImmutableCollection.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>>) strMapListBuilder3, (org.elasticsearch.common.collect.ImmutableCollection.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>>) strMapListBuilder4, (org.elasticsearch.common.collect.ImmutableCollection.Builder<java.util.List<java.util.LinkedHashMap<java.lang.String, java.lang.Object>>>) strMapListBuilder5);
        org.junit.Assert.assertNotNull(strMapListBuilder0);
        org.junit.Assert.assertNotNull(strMapListBuilder1);
        org.junit.Assert.assertNotNull(strMapListBuilder2);
        org.junit.Assert.assertNotNull(strMapListBuilder3);
        org.junit.Assert.assertNotNull(strMapListBuilder4);
        org.junit.Assert.assertNotNull(strMapListBuilder5);
        org.junit.Assert.assertNotNull(mapListBuilderList6);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        java.util.Map map8 = basicDBObject0.toMap();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList6 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMapList6.contains(obj7);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList9 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) strMapList0, (java.util.RandomAccess) strMapList3, (java.util.RandomAccess) strMapList6);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject();
        boolean boolean12 = basicDBObject10.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject10);
        java.util.Collection<java.lang.Object> objCollection14 = basicDBObject13.values();
        boolean boolean15 = strMapList6.contains((java.lang.Object) objCollection14);
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMapList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(randomAccessList9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objCollection14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        com.mongodb.DBCollection dBCollection52 = dB49.getCollectionFromString("{ }");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult53 = dBCollection52.getStats();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(dBCollection52);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        dB49.setOptions(129);
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        java.lang.Object obj3 = basicDBObject0.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject6 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject7 = basicDBObject0.append("local", (java.lang.Object) basicDBObject6);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet8 = basicDBObject6.entrySet();
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject(1000);
        boolean boolean11 = basicDBObject6.containsValue((java.lang.Object) basicDBObject10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(strEntrySet8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList0 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj1 = null;
        boolean boolean2 = strMapList0.contains(obj1);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList3 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj4 = null;
        boolean boolean5 = strMapList3.contains(obj4);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList6 = org.elasticsearch.common.collect.ImmutableList.of();
        java.lang.Object obj7 = null;
        boolean boolean8 = strMapList6.contains(obj7);
        org.elasticsearch.common.collect.ImmutableList<java.util.RandomAccess> randomAccessList9 = org.elasticsearch.common.collect.ImmutableList.of((java.util.RandomAccess) strMapList0, (java.util.RandomAccess) strMapList3, (java.util.RandomAccess) strMapList6);
        org.elasticsearch.common.collect.ImmutableList<java.util.LinkedHashMap<java.lang.String, java.lang.Object>> strMapList10 = strMapList3.reverse();
        org.junit.Assert.assertNotNull(strMapList0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strMapList3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMapList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(randomAccessList9);
        org.junit.Assert.assertNotNull(strMapList10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(10L);
        long long3 = atomicLong1.getAndSet((long) (byte) 10);
        int int4 = atomicLong1.intValue();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        dB49.slaveOk();
        com.mongodb.Mongo mongo53 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection54 = mongo53.getUsedDatabases();
        java.util.stream.Stream<com.mongodb.DB> dBStream55 = dBCollection54.stream();
        java.util.stream.Stream<com.mongodb.DB> dBStream56 = dBCollection54.stream();
        java.util.stream.Stream[] streamArray58 = new java.util.stream.Stream[1];
        @SuppressWarnings("unchecked")
        java.util.stream.Stream<com.mongodb.DB>[] dBStreamArray59 = (java.util.stream.Stream<com.mongodb.DB>[]) streamArray58;
        dBStreamArray59[0] = dBStream56;
        org.elasticsearch.common.collect.ImmutableList<java.util.stream.Stream<com.mongodb.DB>> dBStreamList62 = org.elasticsearch.common.collect.ImmutableList.copyOf(dBStreamArray59);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.CommandResult commandResult63 = dB49.doEval("password", (java.lang.Object[]) dBStreamArray59);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(dBCollection54);
        org.junit.Assert.assertNotNull(dBStream55);
        org.junit.Assert.assertNotNull(dBStream56);
        org.junit.Assert.assertNotNull(streamArray58);
        org.junit.Assert.assertNotNull(dBStreamArray59);
        org.junit.Assert.assertNotNull(dBStreamList62);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject3 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject2);
        com.mongodb.BasicDBObject basicDBObject4 = new com.mongodb.BasicDBObject();
        boolean boolean6 = basicDBObject4.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj11 = basicDBObject4.putIfAbsent("local", (java.lang.Object) 129);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject14 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject13);
        org.bson.types.ObjectId objectId16 = null;
        org.bson.types.ObjectId objectId17 = basicDBObject14.getObjectId("local", objectId16);
        com.mongodb.BasicDBObject basicDBObject18 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) "local");
        java.util.concurrent.atomic.AtomicLong atomicLong21 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str22 = atomicLong21.toString();
        long long24 = atomicLong21.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject25 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong21);
        com.mongodb.BasicDBObject basicDBObject27 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str28 = basicDBObject27.toString();
        boolean boolean30 = basicDBObject27.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject32 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject33 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject32);
        java.lang.Object obj35 = basicDBObject32.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject38 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject39 = basicDBObject32.append("local", (java.lang.Object) basicDBObject38);
        boolean boolean40 = basicDBObject39.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject43 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject44 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject43);
        org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList45 = org.elasticsearch.common.collect.ImmutableList.of((java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject1, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject2, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject4, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject18, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject27, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject39, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject44);
        com.mongodb.BasicDBObject basicDBObject46 = new com.mongodb.BasicDBObject();
        boolean boolean48 = basicDBObject46.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject49 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject46);
        com.mongodb.BasicDBObject basicDBObject52 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj53 = basicDBObject46.putIfAbsent("local", (java.lang.Object) 129);
        org.elasticsearch.common.collect.ImmutableList<java.util.Map<java.lang.String, java.lang.Object>> strMapList54 = org.elasticsearch.common.collect.ImmutableList.of((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject46);
        java.lang.Object obj57 = basicDBObject25.put("hi!", (java.lang.Object) (short) 132);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = basicDBObject25.getInt("ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: no value for: ssl_verify_certificate");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(objectId17);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32" + "'", str22, "32");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 32L + "'", long24 == 32L);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{ }" + "'", str28, "{ }");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strMapList45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(strMapList54);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.mongodb.BasicDBObject basicDBObject0 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject0);
        org.bson.types.ObjectId objectId3 = null;
        org.bson.types.ObjectId objectId4 = basicDBObject1.getObjectId("local", objectId3);
        long long7 = basicDBObject1.getLong("", (long) 12);
        boolean boolean9 = basicDBObject1.getBoolean("ssl");
        org.junit.Assert.assertNull(objectId4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 12L + "'", long7 == 12L);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.mongodb.ServerAddress serverAddress0 = null;
        com.mongodb.ServerAddress serverAddress1 = null;
        com.mongodb.Mongo mongo3 = new com.mongodb.Mongo();
        int int4 = mongo3.getOptions();
        com.mongodb.MongoOptions mongoOptions5 = mongo3.getMongoOptions();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("connect_timeout", mongoOptions5);
        com.mongodb.Mongo mongo7 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection8 = mongo7.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongo7.getAllAddress();
        com.mongodb.Mongo mongo10 = new com.mongodb.Mongo();
        int int11 = mongo10.getOptions();
        com.mongodb.MongoOptions mongoOptions12 = mongo10.getMongoOptions();
        com.mongodb.Mongo mongo13 = new com.mongodb.Mongo(serverAddressList9, mongoOptions12);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.MongoOptions> mongoOptionsList14 = org.elasticsearch.common.collect.ImmutableList.of(mongoOptions5, mongoOptions12);
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.Mongo mongo15 = new com.mongodb.Mongo(serverAddress0, serverAddress1, mongoOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(mongoOptions5);
        org.junit.Assert.assertNotNull(dBCollection8);
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mongoOptions12);
        org.junit.Assert.assertNotNull(mongoOptionsList14);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(100L);
        long long2 = atomicLong1.getAndIncrement();
        long long4 = atomicLong1.getAndAdd(84L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 101L + "'", long4 == 101L);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        mongo0.slaveOk();
        com.mongodb.ReadPreference readPreference3 = mongo0.getReadPreference();
        // The following exception was thrown during execution in test generation
        try {
            mongo0.dropDatabase("socket_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertNotNull(readPreference3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal initial capacity: -1");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        java.util.List<com.mongodb.ServerAddress> serverAddressList48 = mongo22.getAllAddress();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = null;
        org.elasticsearch.river.mongodb.SharedContext sharedContext50 = null;
        org.elasticsearch.client.Client client51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Slurper slurper52 = new org.elasticsearch.river.mongodb.Slurper(serverAddressList48, mongoDBRiverDefinition49, sharedContext50, client51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(serverAddressList48);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong(129L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.util.concurrent.atomic.AtomicLong atomicLong1 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        long long3 = atomicLong1.getAndSet((-1L));
        long long4 = atomicLong1.decrementAndGet();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-2L) + "'", long4 == (-2L));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject2 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        boolean boolean4 = basicDBObject2.getBoolean("skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str2 = basicDBObject1.toString();
        boolean boolean4 = basicDBObject1.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject5 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject1);
        com.mongodb.BasicDBObject basicDBObject7 = new com.mongodb.BasicDBObject(1000);
        com.mongodb.BasicDBObject basicDBObject8 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject9 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = new com.mongodb.BasicDBObject();
        boolean boolean12 = basicDBObject10.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject13 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject10);
        com.mongodb.BasicDBObject basicDBObject16 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj17 = basicDBObject10.putIfAbsent("local", (java.lang.Object) 129);
        com.mongodb.BasicDBObject basicDBObject19 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject20 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject19);
        org.bson.types.ObjectId objectId22 = null;
        org.bson.types.ObjectId objectId23 = basicDBObject20.getObjectId("local", objectId22);
        com.mongodb.BasicDBObject basicDBObject24 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) "local");
        java.util.concurrent.atomic.AtomicLong atomicLong27 = new java.util.concurrent.atomic.AtomicLong((long) ' ');
        java.lang.String str28 = atomicLong27.toString();
        long long30 = atomicLong27.getAndAdd((long) '4');
        com.mongodb.BasicDBObject basicDBObject31 = new com.mongodb.BasicDBObject("include_fields", (java.lang.Object) atomicLong27);
        com.mongodb.BasicDBObject basicDBObject33 = new com.mongodb.BasicDBObject((int) (short) 1);
        java.lang.String str34 = basicDBObject33.toString();
        boolean boolean36 = basicDBObject33.containsKey((java.lang.Object) 14);
        com.mongodb.BasicDBObject basicDBObject37 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject33);
        com.mongodb.BasicDBObject basicDBObject38 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject39 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject38);
        java.lang.Object obj41 = basicDBObject38.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject44 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject45 = basicDBObject38.append("local", (java.lang.Object) basicDBObject44);
        boolean boolean46 = basicDBObject45.isPartialObject();
        com.mongodb.BasicDBObject basicDBObject49 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject50 = new com.mongodb.BasicDBObject("32", (java.lang.Object) basicDBObject49);
        org.elasticsearch.common.collect.ImmutableList<java.util.AbstractMap<java.lang.String, java.lang.Object>> strMapList51 = org.elasticsearch.common.collect.ImmutableList.of((java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject7, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject8, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject10, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject24, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject31, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject33, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject45, (java.util.AbstractMap<java.lang.String, java.lang.Object>) basicDBObject50);
        boolean boolean52 = basicDBObject5.containsValue((java.lang.Object) basicDBObject7);
        boolean boolean54 = basicDBObject5.containsKey((java.lang.Object) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{ }" + "'", str2, "{ }");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(objectId23);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "32" + "'", str28, "32");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 32L + "'", long30 == 32L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "{ }" + "'", str34, "{ }");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strMapList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        dB49.resetOptions();
        java.lang.String str52 = dB49.getName();
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "secondary_read_preference" + "'", str52, "secondary_read_preference");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        com.mongodb.DBCollection dBCollection52 = dB49.getCollectionFromString("{ }");
        com.mongodb.BasicDBObject basicDBObject54 = new com.mongodb.BasicDBObject((int) (byte) 1);
        boolean boolean55 = dBCollection52.equals((java.lang.Object) (byte) 1);
        com.mongodb.BulkWriteOperation bulkWriteOperation56 = dBCollection52.initializeUnorderedBulkOperation();
        com.mongodb.Mongo mongo58 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection59 = mongo58.getUsedDatabases();
        mongo58.slaveOk();
        com.mongodb.DBTCPConnector dBTCPConnector61 = mongo58.getConnector();
        com.mongodb.BasicDBObject basicDBObject62 = new com.mongodb.BasicDBObject("ssl_verify_certificate", (java.lang.Object) mongo58);
        java.lang.Object obj64 = basicDBObject62.get((java.lang.Object) '#');
        com.mongodb.BasicDBObject basicDBObject65 = new com.mongodb.BasicDBObject();
        int int66 = basicDBObject65.size();
        com.mongodb.BasicDBObject basicDBObject67 = new com.mongodb.BasicDBObject();
        com.mongodb.BasicDBObject basicDBObject68 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject67);
        java.lang.Object obj70 = basicDBObject67.removeField("hi!");
        com.mongodb.BasicDBObject basicDBObject73 = new com.mongodb.BasicDBObject((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject74 = basicDBObject67.append("local", (java.lang.Object) basicDBObject73);
        java.util.Set<java.util.Map.Entry<java.lang.String, java.lang.Object>> strEntrySet75 = basicDBObject73.entrySet();
        java.lang.Object obj77 = basicDBObject73.get("");
        com.mongodb.BasicDBObject basicDBObject79 = new com.mongodb.BasicDBObject(129);
        java.lang.Object obj81 = basicDBObject79.get("advanced_transformation");
        com.mongodb.BasicDBObject basicDBObject82 = new com.mongodb.BasicDBObject();
        boolean boolean84 = basicDBObject82.equals((java.lang.Object) 100);
        com.mongodb.BasicDBObject basicDBObject85 = new com.mongodb.BasicDBObject((java.util.Map) basicDBObject82);
        com.mongodb.DBObject[] dBObjectArray86 = new com.mongodb.DBObject[] { basicDBObject65, basicDBObject73, basicDBObject79, basicDBObject85 };
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.AggregationOutput aggregationOutput87 = dBCollection52.aggregate((com.mongodb.DBObject) basicDBObject62, dBObjectArray86);
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(dBCollection52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bulkWriteOperation56);
        org.junit.Assert.assertNotNull(dBCollection59);
        org.junit.Assert.assertNotNull(dBTCPConnector61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(basicDBObject74);
        org.junit.Assert.assertNotNull(strEntrySet75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(dBObjectArray86);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.mongodb.BasicDBObject basicDBObject1 = new com.mongodb.BasicDBObject(0);
        java.util.Date date3 = null;
        java.util.Date date4 = basicDBObject1.getDate("script", date3);
        org.junit.Assert.assertNull(date4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        com.mongodb.DBCollection dBCollection52 = dB49.getCollectionFromString("{ }");
        com.mongodb.BasicDBObject basicDBObject54 = new com.mongodb.BasicDBObject((int) (byte) 1);
        boolean boolean55 = dBCollection52.equals((java.lang.Object) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject57 = new com.mongodb.BasicDBObject((int) (byte) 100);
        com.mongodb.DBObject dBObject58 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.WriteResult writeResult59 = dBCollection52.updateMulti((com.mongodb.DBObject) basicDBObject57, dBObject58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: update can not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(dBCollection52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        com.mongodb.DBCollection dBCollection52 = dB49.getCollectionFromString("{ }");
        java.lang.String str53 = dBCollection52.getFullName();
        com.mongodb.DBDecoderFactory dBDecoderFactory54 = null;
        dBCollection52.setDBDecoderFactory(dBDecoderFactory54);
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(dBCollection52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "secondary_read_preference.{ }" + "'", str53, "secondary_read_preference.{ }");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.mongodb.Mongo mongo0 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection1 = mongo0.getUsedDatabases();
        java.lang.String str2 = mongo0.getVersion();
        com.mongodb.DBTCPConnector dBTCPConnector3 = mongo0.getConnector();
        com.mongodb.Mongo mongo6 = new com.mongodb.Mongo("collection", 60000);
        com.mongodb.Mongo mongo8 = new com.mongodb.Mongo("");
        mongo8.addOption((-1));
        com.mongodb.Mongo mongo11 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection12 = mongo11.getUsedDatabases();
        java.lang.String str13 = mongo11.getVersion();
        com.mongodb.ReadPreference readPreference14 = mongo11.getReadPreference();
        com.mongodb.Mongo mongo15 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection16 = mongo15.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongo15.getAllAddress();
        com.mongodb.Mongo mongo18 = new com.mongodb.Mongo();
        int int19 = mongo18.getOptions();
        com.mongodb.MongoOptions mongoOptions20 = mongo18.getMongoOptions();
        com.mongodb.Mongo mongo21 = new com.mongodb.Mongo(serverAddressList17, mongoOptions20);
        com.mongodb.Mongo mongo22 = new com.mongodb.Mongo();
        int int23 = mongo22.getOptions();
        com.mongodb.Mongo mongo24 = new com.mongodb.Mongo();
        com.mongodb.ReadPreference readPreference25 = null;
        mongo24.setReadPreference(readPreference25);
        com.mongodb.Mongo mongo27 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection28 = mongo27.getUsedDatabases();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongo27.getAllAddress();
        com.mongodb.Mongo mongo30 = new com.mongodb.Mongo();
        int int31 = mongo30.getOptions();
        com.mongodb.MongoOptions mongoOptions32 = mongo30.getMongoOptions();
        com.mongodb.Mongo mongo33 = new com.mongodb.Mongo(serverAddressList29, mongoOptions32);
        com.mongodb.Mongo mongo34 = new com.mongodb.Mongo(serverAddressList29);
        com.mongodb.Mongo mongo36 = new com.mongodb.Mongo();
        int int37 = mongo36.getOptions();
        com.mongodb.MongoOptions mongoOptions38 = mongo36.getMongoOptions();
        com.mongodb.Mongo mongo39 = new com.mongodb.Mongo("connect_timeout", mongoOptions38);
        com.mongodb.Mongo mongo40 = new com.mongodb.Mongo();
        java.util.Collection<com.mongodb.DB> dBCollection41 = mongo40.getUsedDatabases();
        java.lang.String str42 = mongo40.getVersion();
        com.mongodb.ReadPreference readPreference43 = mongo40.getReadPreference();
        com.mongodb.Mongo mongo46 = new com.mongodb.Mongo("hi!", (int) (short) 100);
        org.elasticsearch.common.collect.ImmutableList<com.mongodb.Mongo> mongoList47 = org.elasticsearch.common.collect.ImmutableList.of(mongo0, mongo6, mongo8, mongo11, mongo21, mongo22, mongo24, mongo34, mongo39, mongo40, mongo46);
        com.mongodb.DB dB49 = mongo11.getDB("secondary_read_preference");
        com.mongodb.ReadPreference readPreference50 = dB49.getReadPreference();
        dB49.resetOptions();
        com.mongodb.DB dB53 = dB49.getSisterDB("size");
        // The following exception was thrown during execution in test generation
        try {
            dB49.resetError();
            org.junit.Assert.fail("Expected exception of type com.mongodb.MongoTimeoutException; message: Timed out after 10000 ms while waiting to connect. Client view of cluster state is {type=Unknown, servers=[{address=127.0.0.1:27017, type=Unknown, state=Connecting, exception={com.mongodb.MongoException$Network: Exception opening the socket}, caused by {java.net.ConnectException: Connection refused (Connection refused)}}]");
        } catch (com.mongodb.MongoTimeoutException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dBCollection1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.12.4" + "'", str2, "2.12.4");
        org.junit.Assert.assertNotNull(dBTCPConnector3);
        org.junit.Assert.assertNotNull(dBCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2.12.4" + "'", str13, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference14);
        org.junit.Assert.assertNotNull(dBCollection16);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(mongoOptions20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dBCollection28);
        org.junit.Assert.assertNotNull(serverAddressList29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(mongoOptions32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(mongoOptions38);
        org.junit.Assert.assertNotNull(dBCollection41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "2.12.4" + "'", str42, "2.12.4");
        org.junit.Assert.assertNotNull(readPreference43);
        org.junit.Assert.assertNotNull(mongoList47);
        org.junit.Assert.assertNotNull(dB49);
        org.junit.Assert.assertNotNull(readPreference50);
        org.junit.Assert.assertNotNull(dB53);
    }
}

