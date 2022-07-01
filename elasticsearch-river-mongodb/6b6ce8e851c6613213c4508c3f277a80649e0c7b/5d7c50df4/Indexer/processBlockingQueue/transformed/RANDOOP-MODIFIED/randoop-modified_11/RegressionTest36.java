import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest36 {

    public static boolean debug = false;

    @Test
    public void test18001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18001");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, 0, -1, 0]");
    }

    @Test
    public void test18002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("config", "host", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18003");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass17 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("skip_initial_import", "disable_index_refresh", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18005");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass22 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("gridfs", "concurrent_bulk_requests", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18007");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass16 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18008");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 10, 100, -1]");
    }

    @Test
    public void test18009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("is_mongos", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18010");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, 1, 100, 10]");
    }

    @Test
    public void test18011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18011");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 1, 0, 100]");
    }

    @Test
    public void test18012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18012");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 0, 100, -1]");
    }

    @Test
    public void test18013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18013");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 0, -1, 100]");
    }

    @Test
    public void test18014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18014");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, 0, 100, 1]");
    }

    @Test
    public void test18015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("to", "credentials", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("throttle_size", "_last_gtid");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("gridfs", "script.disable_dynamic");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.disable_dynamic?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$cmd", "ssl", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18019");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test18020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18020");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, -1, 100, 1]");
    }

    @Test
    public void test18021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("hi!", "_last_gtid");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18022");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass14 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18023");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = wildcardTimestamp15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test18024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18024");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 100, 0, 1]");
    }

    @Test
    public void test18025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_collection", "d");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18026");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 0, 100, 1]");
    }

    @Test
    public void test18027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18027");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 0, 0, 100]");
    }

    @Test
    public void test18028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18028");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 1, 100, -1]");
    }

    @Test
    public void test18029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("is_mongos", "flush_interval");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18030");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("password", "ssl_verify_certificate", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_id", "_id");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_id?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18032");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 0, 1, -1]");
    }

    @Test
    public void test18033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("size", "status", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18034");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("dropDatabase", "skip_initial_import", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18035");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk_timeout", "connect_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18036");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 0, -1, -1]");
    }

    @Test
    public void test18037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18037");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 0, 1, 10]");
    }

    @Test
    public void test18038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("n", "bulk", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18039");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 0, 0, 1]");
    }

    @Test
    public void test18040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18040");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
    }

    @Test
    public void test18041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ops", "actions");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18042");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 0, 100, 100]");
    }

    @Test
    public void test18043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$and", "$and", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$and?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("advanced_transformation", "name", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18045");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("status", "parent_types", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$cmd", "type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18047");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "include_fields", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("include_fields", "bulk_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18049");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 0, 0, 100, 0]");
    }

    @Test
    public void test18050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18050");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("status", ".chunks", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18051");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 1, 10, 1]");
    }

    @Test
    public void test18052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18052");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 1, 100, 0]");
    }

    @Test
    public void test18053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18053");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("options", "drop_collection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18054");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("actions", "filter", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18055");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass8 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("exclude_fields", "status");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18057");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 10, 0, 100]");
    }

    @Test
    public void test18058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("parent_types", "u", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18059");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp25 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass26 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertNull(wildcardTimestamp24);
        org.junit.Assert.assertNull(wildcardTimestamp25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test18060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "o", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18061");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 10, 1, 100]");
    }

    @Test
    public void test18062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("advanced_transformation", "db", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", ".chunks", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18064");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
    }

    @Test
    public void test18065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("dropDatabase", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("name", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("host", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18068");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, -1, 10, 10]");
    }

    @Test
    public void test18069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".files", "connect_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18070");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 0, 10]");
    }

    @Test
    public void test18071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18071");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, -1, 100, 100]");
    }

    @Test
    public void test18072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18072");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("o2", "bulk", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18073");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 100, 10, -1]");
    }

    @Test
    public void test18074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("MongoDB River Plugin", "servers", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18075");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 0, 0, 100]");
    }

    @Test
    public void test18076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18076");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("admin", "o");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18078");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, 100, 100, 1]");
    }

    @Test
    public void test18079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("size", "admin.$cmd", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18080");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardTimestamp13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
    }

    @Test
    public void test18081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("to", "drop_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18082");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass21 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18083");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, -1, -1, 100]");
    }

    @Test
    public void test18084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18084");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 10, -1, 100]");
    }

    @Test
    public void test18085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "import_all_collections", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18086");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass14 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18087");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_collection", "script.disable_dynamic", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18088");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = wildcardTimestamp10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
    }

    @Test
    public void test18089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18089");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 1, 1, 1]");
    }

    @Test
    public void test18090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18090");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 100, 100, 10]");
    }

    @Test
    public void test18091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("oplog.rs", "admin", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18092");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 1, 100, 0]");
    }

    @Test
    public void test18093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18093");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 0, -1, 1, 100]");
    }

    @Test
    public void test18094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18094");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("port", "gridfs", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18095");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 100, 0, 0]");
    }

    @Test
    public void test18096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18096");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("password", "is_mongos", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18097");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, 100, 10, 100]");
    }

    @Test
    public void test18098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18098");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, -1, 1, 0]");
    }

    @Test
    public void test18099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18099");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 1, 10, 100]");
    }

    @Test
    public void test18100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("status", "script.default_lang", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.default_lang?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18101");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ts", "include_collection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_riverstatus", "index", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("db", "status", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18104");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script.default_lang", "host", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("to", "throttle_size", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18106");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, 10, 100, 100]");
    }

    @Test
    public void test18107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("secondary_read_preference", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18108");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 1, -1]");
    }

    @Test
    public void test18109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ns", "collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("fromMigrate", "servers");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18111");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("to", "flush_interval", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18112");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = wildcardTimestamp15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test18113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl_verify_certificate", "drop", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18114");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 1, 10, 100]");
    }

    @Test
    public void test18115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("o2", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ts", "flush_interval");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("servers", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18118");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, -1, 0, -1]");
    }

    @Test
    public void test18119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("options", "c", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18120");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, -1, 100, 100]");
    }

    @Test
    public void test18121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".chunks", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("credentials", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18123");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 100, 10, 100]");
    }

    @Test
    public void test18124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("name", "include_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$natural", "store_statistics", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18126");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 1, 0]");
    }

    @Test
    public void test18127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18127");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
    }

    @Test
    public void test18128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18128");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 0, 0, 1]");
    }

    @Test
    public void test18129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18129");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 0, -1, -1]");
    }

    @Test
    public void test18130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("skip_initial_import", "store_statistics", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18131");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_ts", "$or", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18132");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-river", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18133");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 10, -1, 1]");
    }

    @Test
    public void test18134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18134");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 100, 10, 1]");
    }

    @Test
    public void test18135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("local", "_last_gtid");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18136");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$or", "$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18137");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 0, 0, -1]");
    }

    @Test
    public void test18138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18138");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 10, -1, 10]");
    }

    @Test
    public void test18139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18139");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 100, 100, 100]");
    }

    @Test
    public void test18140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18140");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 0, 100, 10]");
    }

    @Test
    public void test18141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18141");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardTimestamp13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
    }

    @Test
    public void test18142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18142");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, -1, 1, 0]");
    }

    @Test
    public void test18143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18143");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 1, 10, 1, -1]");
    }

    @Test
    public void test18144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18144");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass9 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test18145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18145");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("gridfs", "bulk", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18146");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass17 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18147");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("localhost", "config", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18148");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 1, 1, 1]");
    }

    @Test
    public void test18149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18149");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass16 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("host", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18151");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_ts", "socket_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18152");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18153");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = wildcardTimestamp12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
    }

    @Test
    public void test18154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("size", ".files");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "_last_ts", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18156");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("u", "d", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18157");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ops", "drop", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", "name", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18159");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("disable_index_refresh", "_last_ts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18160");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 1, 10, 0]");
    }

    @Test
    public void test18161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18161");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, 0, 10, -1]");
    }

    @Test
    public void test18162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18162");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = wildcardTimestamp17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
    }

    @Test
    public void test18163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18163");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test18164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18164");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 1, 1, 0]");
    }

    @Test
    public void test18165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18165");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 1, 1, 100]");
    }

    @Test
    public void test18166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18166");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("admin.$cmd", "mongodb", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18167");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass17 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18168");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 100, 10, 0]");
    }

    @Test
    public void test18169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18169");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 10, -1, 10]");
    }

    @Test
    public void test18170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("bulk", "parent_types", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18171");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, 0, 10]");
    }

    @Test
    public void test18172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18172");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = wildcardTimestamp14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
    }

    @Test
    public void test18173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18173");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 10, 1, 10]");
    }

    @Test
    public void test18174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "config", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("gridfs", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o2", "dropDatabase", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?dropDatabase?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18177");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 0, 1, -1]");
    }

    @Test
    public void test18178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("flush_interval", "config");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18179");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 10, 0, 10, 0]");
    }

    @Test
    public void test18180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18180");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, -1, 1, 0]");
    }

    @Test
    public void test18181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18181");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 1, 0, 10]");
    }

    @Test
    public void test18182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18182");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass16 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18183");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, 10, 100, 0]");
    }

    @Test
    public void test18184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("socket_timeout", "connect_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18185");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, -1, -1, 10]");
    }

    @Test
    public void test18186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18186");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 1, -1, 0]");
    }

    @Test
    public void test18187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18187");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 10, 10]");
    }

    @Test
    public void test18188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18188");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "actions", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18189");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, -1, -1]");
    }

    @Test
    public void test18190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("actions", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18191");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = wildcardTimestamp16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test18192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin", "include_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18193");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 0, -1, 10]");
    }

    @Test
    public void test18194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18194");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("localhost", "u", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18195");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass17 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("local", "hi!", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("i", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18198");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 1, 0, 0]");
    }

    @Test
    public void test18199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("options", "_last_gtid");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18200");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = wildcardTimestamp18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
    }

    @Test
    public void test18201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18201");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
    }

    @Test
    public void test18202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ts", "bulk", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18203");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 10, -1, 1]");
    }

    @Test
    public void test18204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18204");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("secondary_read_preference", "options", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18205");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 10, 1, 1]");
    }

    @Test
    public void test18206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".scripts", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$cmd", "import_all_collections", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_bulk_requests", "n", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?n? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$and", "local");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18210");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "_last_gtid", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18211");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("dropDatabase", "dropDatabase", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18212");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
    }

    @Test
    public void test18213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18213");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 10, 0, 10]");
    }

    @Test
    public void test18214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18214");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = wildcardTimestamp16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test18215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18215");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100, 10, -1]");
    }

    @Test
    public void test18216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18216");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 10, 0, 100]");
    }

    @Test
    public void test18217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("index", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-river", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18219");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass15 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test18220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("connect_timeout", "c", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18221");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("config", "filter", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18222");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 1, -1]");
    }

    @Test
    public void test18223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18223");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, 0, 10, 100]");
    }

    @Test
    public void test18224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18224");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
    }

    @Test
    public void test18225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18225");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, 1, 100, 10]");
    }

    @Test
    public void test18226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("disable_index_refresh", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("host", "bulk_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18228");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-river", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18229");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass17 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18230");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
    }

    @Test
    public void test18231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18231");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass10 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test18232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("collection", "include_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18233");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 0, 0, 10]");
    }

    @Test
    public void test18234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18234");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardTimestamp13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
    }

    @Test
    public void test18235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("disable_index_refresh", ".chunks", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("type", "script.disable_dynamic", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.disable_dynamic?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$and", "name", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18239");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, -1, 1, 1]");
    }

    @Test
    public void test18240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18240");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 100, 1, 1]");
    }

    @Test
    public void test18241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18241");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("mongodb", "o", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("port", "secondary_read_preference", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18243");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("type", "$and");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$and?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18244");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, -1, 1, 10]");
    }

    @Test
    public void test18245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18245");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, 0, 100]");
    }

    @Test
    public void test18246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18246");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("flush_interval", "mongodb", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18247");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 10, 10, -1]");
    }

    @Test
    public void test18248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18248");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = wildcardTimestamp19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
    }

    @Test
    public void test18249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18249");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp25 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp26 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp27 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp28 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp29 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass30 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertNull(wildcardTimestamp24);
        org.junit.Assert.assertNull(wildcardTimestamp25);
        org.junit.Assert.assertNull(wildcardTimestamp26);
        org.junit.Assert.assertNull(wildcardTimestamp27);
        org.junit.Assert.assertNull(wildcardTimestamp28);
        org.junit.Assert.assertNull(wildcardTimestamp29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test18250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18250");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 0, 100, 10]");
    }

    @Test
    public void test18251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_collection", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18252");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 100, 1, 100]");
    }

    @Test
    public void test18253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18253");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, 1, 100, 100]");
    }

    @Test
    public void test18254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("connect_timeout", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18255");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "type", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18256");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
    }

    @Test
    public void test18257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18257");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 10, 100, 0]");
    }

    @Test
    public void test18258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("throttle_size", ".files");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18259");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, -1, 1, 10]");
    }

    @Test
    public void test18260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18260");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, -1, 100, 0]");
    }

    @Test
    public void test18261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18261");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("secondary_read_preference", "flush_interval", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("size", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18263");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass18 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18264");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
    }

    @Test
    public void test18265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18266");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("type", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test18267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18267");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 1, 10, 10]");
    }

    @Test
    public void test18268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18268");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, -1, 10]");
    }

    @Test
    public void test18269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18269");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 10, 1, 100]");
    }

    @Test
    public void test18270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("status", "exclude_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("gridfs", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18272");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, -1, 10, 0]");
    }

    @Test
    public void test18273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("secondary_read_preference", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18274");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("credentials", "config");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18275");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, -1, 1]");
    }

    @Test
    public void test18276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18276");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 100, 1, -1]");
    }

    @Test
    public void test18277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18277");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 10, 1, 0]");
    }

    @Test
    public void test18278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("parent_types", "$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("store_statistics", "n");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?n? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script", "o2");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o2?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("skip_initial_import", "flush_interval", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18282");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_fields", "script.default_lang", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18283");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, -1, 0, -1]");
    }

    @Test
    public void test18284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18284");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, 10, 0]");
    }

    @Test
    public void test18285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("flush_interval", "concurrent_requests", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18286");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18287");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, -1, 0, 10]");
    }

    @Test
    public void test18288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("gridfs", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18289");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk_timeout", "skip_initial_import", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18290");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 0, 10, -1]");
    }

    @Test
    public void test18291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18291");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "admin.$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18292");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("advanced_transformation", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18293");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
    }

    @Test
    public void test18294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18294");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass16 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("n", "config", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18296");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("config", "advanced_transformation", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("status", "bulk_size", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18298");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass13 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18299");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("gridfs", "o2", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18300");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script.disable_dynamic", "ops", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18301");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = wildcardTimestamp15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test18302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18302");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".files", "concurrent_bulk_requests", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18303");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".chunks", "c", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18304");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, -1, -1, -1]");
    }

    @Test
    public void test18305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18305");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass15 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test18306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18306");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("local", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18307");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 0, 0, 1]");
    }

    @Test
    public void test18308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18308");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".chunks", "ns", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18309");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("i", "config", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("filter", "bulk_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18311");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 100, -1, 0]");
    }

    @Test
    public void test18312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18312");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass13 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18313");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass8 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test18314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18314");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$or", "is_mongos", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18315");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = wildcardTimestamp24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertNull(wildcardTimestamp24);
    }

    @Test
    public void test18316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("advanced_transformation", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18317");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, 10, 1, 100]");
    }

    @Test
    public void test18318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("password", "script.disable_dynamic", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.disable_dynamic?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18319");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("throttle_size", "_riverstatus", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_last_gtid", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18321");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 1, 10, 100]");
    }

    @Test
    public void test18322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18322");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
    }

    @Test
    public void test18323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_gtid", "bulk_size", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18324");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test18325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18325");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass14 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18326");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("renameCollection", "admin", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18327");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = wildcardTimestamp12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
    }

    @Test
    public void test18328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18328");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 1, 100, 0]");
    }

    @Test
    public void test18329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script.default_lang", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18330");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("exclude_fields", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18331");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, -1, 0, 0, 1]");
    }

    @Test
    public void test18332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18332");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 1, 1, 1]");
    }

    @Test
    public void test18333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_requests", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18334");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script.disable_dynamic", "disable_index_refresh", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("advanced_transformation", "o2");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o2?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18336");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, 1, 1, 100]");
    }

    @Test
    public void test18337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18337");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, 10, 0, 100]");
    }

    @Test
    public void test18338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18338");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 10, -1, -1]");
    }

    @Test
    public void test18339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("config", "MongoDB River Plugin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?MongoDB River Plugin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18340");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("o2", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18341");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "include_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("secondary_read_preference", "bulk");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("n", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18344");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix(".files", "ur");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ur?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18345");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 1, 1, 100]");
    }

    @Test
    public void test18346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script.disable_dynamic", "ssl", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$and", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("local", "create");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18349");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 0, 0, 0]");
    }

    @Test
    public void test18350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18350");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("mongodb-river", "$and", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("exclude_fields", "is_mongos", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18352");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$cmd", "sandbox", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", "localhost", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("initial_timestamp", "MongoDB River Plugin", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?MongoDB River Plugin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18355");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass17 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("connect_timeout", "admin", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18357");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script.disable_dynamic", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$or", "$in");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$in?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18359");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 1, 10, 10, 0]");
    }

    @Test
    public void test18360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18360");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, 10, 0, 1]");
    }

    @Test
    public void test18361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18362");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop_collection", "c", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18363");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, -1, 10, -1]");
    }

    @Test
    public void test18364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("o2", "actions");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18365");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, 10, -1, 1]");
    }

    @Test
    public void test18366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18366");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp25 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp26 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp27 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertNull(wildcardTimestamp24);
        org.junit.Assert.assertNull(wildcardTimestamp25);
        org.junit.Assert.assertNull(wildcardTimestamp26);
        org.junit.Assert.assertNull(wildcardTimestamp27);
    }

    @Test
    public void test18367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "script.default_lang");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.default_lang?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18368");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
    }

    @Test
    public void test18369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_id", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18370");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
    }

    @Test
    public void test18371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("oplog.rs", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18372");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass14 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test18373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18373");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = wildcardTimestamp18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
    }

    @Test
    public void test18374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18374");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass12 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18375");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "ur", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ur?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("port", "MongoDB River Plugin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?MongoDB River Plugin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18377");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
    }

    @Test
    public void test18378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18378");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 0, 10, 0]");
    }

    @Test
    public void test18379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18379");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = wildcardTimestamp8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
    }

    @Test
    public void test18380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18380");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = wildcardTimestamp16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test18381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18381");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = wildcardTimestamp20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
    }

    @Test
    public void test18382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$in", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18383");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script", "$or", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18384");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
    }

    @Test
    public void test18385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18385");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 10, -1, 10]");
    }

    @Test
    public void test18386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18386");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "filter", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18387");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "concurrent_bulk_requests", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_collection", "ts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ts? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18389");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("import_all_collections", "actions");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18390");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("create", "type", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18391");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 10, 10, 0]");
    }

    @Test
    public void test18392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18392");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, -1, 0, 1]");
    }

    @Test
    public void test18393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("d", "dropDatabase");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?dropDatabase?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18394");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 1, 10, 10]");
    }

    @Test
    public void test18395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "create", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18396");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = wildcardTimestamp20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
    }

    @Test
    public void test18397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18397");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertNull(wildcardTimestamp24);
    }

    @Test
    public void test18398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".files", "ns", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18399");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".files", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18400");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 1, 0, 0]");
    }

    @Test
    public void test18401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18401");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 10, 0, 0]");
    }

    @Test
    public void test18402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("renameCollection", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18403");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("exclude_fields", "o", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18404");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 0, 1, 10]");
    }

    @Test
    public void test18405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18405");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 1, 10, 100]");
    }

    @Test
    public void test18406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix(".files", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("parent_types", "script.disable_dynamic");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.disable_dynamic?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18408");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass22 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18409");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 1, 1, -1]");
    }

    @Test
    public void test18410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script.default_lang", "servers");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18411");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script.disable_dynamic", "hi!", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_fields", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18413");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
    }

    @Test
    public void test18414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18414");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 1, -1, 100]");
    }

    @Test
    public void test18415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18415");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass12 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test18416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18416");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 100, 0]");
    }

    @Test
    public void test18417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18417");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 100, 100, -1]");
    }

    @Test
    public void test18418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("initial_timestamp", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18419");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass15 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test18420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18420");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 100, 10, 10]");
    }

    @Test
    public void test18421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18421");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 1, 1, -1]");
    }

    @Test
    public void test18422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18422");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 1, 0, 0]");
    }

    @Test
    public void test18423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18423");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("collection", "concurrent_bulk_requests", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18424");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("o", "user", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18425");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 10, 10, 100]");
    }

    @Test
    public void test18426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18426");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("password", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18427");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
    }

    @Test
    public void test18428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("n", "script.disable_dynamic");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.disable_dynamic?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("op", "include_collection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("localhost", "admin", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18431");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
    }

    @Test
    public void test18432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18432");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "throttle_size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("o2", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18434");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 0, 100, 10]");
    }

    @Test
    public void test18435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18435");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$natural", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18436");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$in", "c", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("skip_initial_import", "disable_index_refresh", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18438");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
    }

    @Test
    public void test18439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18439");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = wildcardTimestamp15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test18440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18440");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 0, 10, -1]");
    }

    @Test
    public void test18441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18441");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
    }

    @Test
    public void test18442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18442");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 100, -1, -1]");
    }

    @Test
    public void test18443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("c", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18444");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "user", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18445");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("import_all_collections", "disable_index_refresh", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18446");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
    }

    @Test
    public void test18447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18447");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp25 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp26 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp27 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertNull(wildcardTimestamp24);
        org.junit.Assert.assertNull(wildcardTimestamp25);
        org.junit.Assert.assertNull(wildcardTimestamp26);
        org.junit.Assert.assertNull(wildcardTimestamp27);
    }

    @Test
    public void test18448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18448");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("create", "mongodb", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18449");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 100, -1, 100]");
    }

    @Test
    public void test18450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18450");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_collection", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18451");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test18452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", "o", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18453");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_ts", "ur", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("type", "ops");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ur", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18456");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardTimestamp13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
    }

    @Test
    public void test18457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ur", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18458");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 100, 10, 10, 10]");
    }

    @Test
    public void test18459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("MongoDB River Plugin", "ssl_verify_certificate", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("oplog.rs", "actions", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$and", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18462");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
    }

    @Test
    public void test18463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18463");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
    }

    @Test
    public void test18464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18464");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ts", "ops", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18465");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 100, 10]");
    }

    @Test
    public void test18466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18466");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass16 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test18467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18467");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("is_mongos", "include_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18468");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("socket_timeout", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18469");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ts", "port", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18470");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
    }

    @Test
    public void test18471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18471");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_riverstatus", "options", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "bulk_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18473");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, -1, 100, -1]");
    }

    @Test
    public void test18474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18474");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 0, 100, 0]");
    }

    @Test
    public void test18475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18475");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        java.lang.Class<?> wildcardClass17 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test18476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18476");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "bulk_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18477");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 100, 0, 100, 10]");
    }

    @Test
    public void test18478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ns", "user", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl", "d");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18480");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 100, 1, 100]");
    }

    @Test
    public void test18481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18481");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, -1, 10, 1]");
    }

    @Test
    public void test18482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18482");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, -1, 0, 100]");
    }

    @Test
    public void test18483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script.disable_dynamic", "localhost", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18484");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_ts", "password", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18485");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$or", "i", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18486");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 10, 10, 0]");
    }

    @Test
    public void test18487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("connect_timeout", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18488");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass18 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18489");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 0, 1, -1]");
    }

    @Test
    public void test18490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18490");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass13 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("i", "fromMigrate", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18492");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".chunks", "credentials", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$or", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18494");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp19 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = wildcardTimestamp22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(wildcardTimestamp19);
        org.junit.Assert.assertNull(wildcardTimestamp20);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNull(wildcardTimestamp22);
    }

    @Test
    public void test18495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("advanced_transformation", "oplog.rs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18496");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = wildcardTimestamp13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
    }

    @Test
    public void test18497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18497");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 10, 0, 100]");
    }

    @Test
    public void test18498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18498");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("db", "drop", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("hi!", "concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test18500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test18500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("secondary_read_preference", "o");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }
}

