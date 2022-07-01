import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test07001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "$and");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$and?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07002");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("localhost", "c", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07003");
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
    public void test07004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07004");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 100, 10, 10]");
    }

    @Test
    public void test07005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07005");
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
    public void test07006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("is_mongos", "create");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07007");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, 0, 10, 10]");
    }

    @Test
    public void test07008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07008");
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
    public void test07009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("connect_timeout", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("sandbox", "$in", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$in?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07011");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = wildcardTimestamp9.getClass();
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
    }

    @Test
    public void test07012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07012");
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
    public void test07013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07013");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("is_mongos", ".chunks", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$or", "_id");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_id?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("socket_timeout", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07016");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, 1, -1, 1]");
    }

    @Test
    public void test07017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07017");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 10, -1, 100]");
    }

    @Test
    public void test07018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07018");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("create", "port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07019");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardTimestamp11.getClass();
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
    }

    @Test
    public void test07020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07020");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ur", "$natural", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07021");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 100, 100, 1]");
    }

    @Test
    public void test07022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07022");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 0, 100, 100]");
    }

    @Test
    public void test07023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07023");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("to", "$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07024");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 0, 10, 10]");
    }

    @Test
    public void test07025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07025");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 0, -1, 0, 100]");
    }

    @Test
    public void test07026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("to", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07027");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, 1, 10, 1]");
    }

    @Test
    public void test07028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_id", "collection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07029");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("actions", "host", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07030");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 0, 0, -1]");
    }

    @Test
    public void test07031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("admin", "_last_gtid");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07032");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, 0, 0]");
    }

    @Test
    public void test07033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07033");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("mongodb-river", "bulk_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07034");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, -1, 100, 0]");
    }

    @Test
    public void test07035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07035");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 100, 1]");
    }

    @Test
    public void test07036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("d", "socket_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07037");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 0, -1, 10, 1]");
    }

    @Test
    public void test07038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07038");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("port", "_last_gtid", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07039");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07040");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, -1, 0]");
    }

    @Test
    public void test07041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ts", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("advanced_transformation", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07043");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, 10, 1]");
    }

    @Test
    public void test07044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("i", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("collection", "ops");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("actions", "socket_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07048");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, -1, 100, 100]");
    }

    @Test
    public void test07049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07049");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 100, 100, 0]");
    }

    @Test
    public void test07050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07050");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, -1, 1]");
    }

    @Test
    public void test07051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07051");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 10, 100, 100, 0]");
    }

    @Test
    public void test07052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("throttle_size", "include_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07053");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 100, -1, 10]");
    }

    @Test
    public void test07054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07054");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_collection", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("name", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07057");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 1, 0, -1]");
    }

    @Test
    public void test07058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("servers", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07059");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07060");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_id", "collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07062");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("mongodb-river", "include_collection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ts", "oplog.rs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07064");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, -1, 100, 10]");
    }

    @Test
    public void test07065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07065");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 10, 1, 1]");
    }

    @Test
    public void test07066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("concurrent_bulk_requests", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("hi!", "flush_interval", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07068");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 0, 0, 100]");
    }

    @Test
    public void test07069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07069");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, -1, -1, 0]");
    }

    @Test
    public void test07070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07070");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 10, 1, 100, 0]");
    }

    @Test
    public void test07071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("collection", "script_type", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07072");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, -1, -1, 1, -1]");
    }

    @Test
    public void test07073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07073");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 100, 1, 10]");
    }

    @Test
    public void test07074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("name", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("disable_index_refresh", "type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07076");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 1, 10]");
    }

    @Test
    public void test07077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07077");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 10, 1, 1]");
    }

    @Test
    public void test07078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07078");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 10, 1]");
    }

    @Test
    public void test07079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07079");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, -1, -1, 100, 1]");
    }

    @Test
    public void test07080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("port", "o2");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o2?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("MongoDB River Plugin", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("skip_initial_import", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("parent_types", "status", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_riverstatus", "mongodb");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07085");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 0, 1, 0, 1]");
    }

    @Test
    public void test07086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07086");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("initial_timestamp", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07087");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_last_ts", "store_statistics", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07088");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, 1, -1, 10]");
    }

    @Test
    public void test07089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("hi!", "status");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07090");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, 10, 10]");
    }

    @Test
    public void test07091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("connect_timeout", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("password", "secondary_read_preference", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07093");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, 1, 10, 1]");
    }

    @Test
    public void test07094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script.default_lang", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07095");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ops", ".files", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("d", "o");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07097");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ur", "i", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-river", "db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07099");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, -1, -1, -1]");
    }

    @Test
    public void test07100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", "throttle_size", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07101");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, 1, 0, 10, 100]");
    }

    @Test
    public void test07102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("fromMigrate", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("skip_initial_import", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07104");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("is_mongos", "op", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07105");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$and", "", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07106");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 0, 1, 100]");
    }

    @Test
    public void test07107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("is_mongos", "sandbox", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-river", "op");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?op?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07109");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, 0, 10]");
    }

    @Test
    public void test07110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk_timeout", "oplog.rs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("oplog.rs", "config", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("flush_interval", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07113");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 1, 100, 1]");
    }

    @Test
    public void test07114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07114");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07115");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, 100, 100, 10]");
    }

    @Test
    public void test07116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "c");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07118");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 1, 0, 0]");
    }

    @Test
    public void test07119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07119");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 100, 0, 0]");
    }

    @Test
    public void test07120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("db", "secondary_read_preference", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07121");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 100, 1, 10]");
    }

    @Test
    public void test07122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_ts", "_riverstatus", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("skip_initial_import", "import_all_collections", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07124");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 10, 100, 1, 100]");
    }

    @Test
    public void test07125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07125");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 1, -1, 100]");
    }

    @Test
    public void test07126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07126");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 100, 10, 1, 10]");
    }

    @Test
    public void test07127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script.disable_dynamic", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("u", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07129");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("servers", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("store_statistics", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07131");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$and", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07132");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".scripts", "mongodb-river", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07133");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07134");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 10, -1, 100]");
    }

    @Test
    public void test07135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_bulk_requests", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("status", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07137");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "$in", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_id", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07139");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("c", "n", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("index", "hi!", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07142");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 10, 0, 0]");
    }

    @Test
    public void test07143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("op", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07144");
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
    public void test07145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07145");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 1, 1, -1]");
    }

    @Test
    public void test07146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07146");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardTimestamp11.getClass();
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
    }

    @Test
    public void test07147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07147");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, -1, 1, -1]");
    }

    @Test
    public void test07148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("initial_timestamp", ".files", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("size", "script_type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "type", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07151");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, -1, 1, 1]");
    }

    @Test
    public void test07152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07152");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "throttle_size", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07153");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "_last_ts", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07155");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, -1, 1, 100]");
    }

    @Test
    public void test07156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07156");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 1, 10, -1]");
    }

    @Test
    public void test07157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07157");
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
    public void test07158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07158");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 1, 10, 100]");
    }

    @Test
    public void test07159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07159");
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
    public void test07160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07160");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk_timeout", "MongoDB River Plugin", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07161");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07162");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 100, 1, 1]");
    }

    @Test
    public void test07163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07163");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 0, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 0, 10, 1]");
    }

    @Test
    public void test07164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07164");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".files", "include_fields", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("sandbox", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07167");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("admin.$cmd", "_riverstatus", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("mongodb-river", "$or", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07169");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, -1, 1, 0]");
    }

    @Test
    public void test07170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ns", "renameCollection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("renameCollection", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07172");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 1, -1, 10]");
    }

    @Test
    public void test07173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07173");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 100, -1, 100]");
    }

    @Test
    public void test07174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("i", "db", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07175");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07176");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("o", "to", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script.default_lang", "admin", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07178");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("MongoDB River Plugin", "_id", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07179");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 1, -1, 100, 100]");
    }

    @Test
    public void test07180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07180");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$natural", "db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07181");
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
    public void test07182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07182");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("port", "is_mongos", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07183");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "create", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07184");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("name", "status", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk_timeout", "port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07186");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, -1, -1, 100, -1]");
    }

    @Test
    public void test07187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07187");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 100, 1, 100]");
    }

    @Test
    public void test07188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07188");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 10, -1, 100]");
    }

    @Test
    public void test07189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07189");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardTimestamp11.getClass();
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
    }

    @Test
    public void test07190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("concurrent_bulk_requests", "ns");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "_last_ts", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("advanced_transformation", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("op", "script", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07194");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07195");
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
    public void test07196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("credentials", "bulk_size", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07197");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$or", "script.disable_dynamic", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop", "o", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07199");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("filter", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07200");
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
    public void test07201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("oplog.rs", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("servers", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07203");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 10, 10, 10]");
    }

    @Test
    public void test07204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("connect_timeout", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07206");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_fields", "ssl_verify_certificate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07207");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 100, 0]");
    }

    @Test
    public void test07208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ns", "connect_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("collection", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07210");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 10, 100, 1]");
    }

    @Test
    public void test07211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07211");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07212");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 1, 10, 1, 1]");
    }

    @Test
    public void test07213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07213");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, 1, 10, 10]");
    }

    @Test
    public void test07214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "bulk", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07215");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 10, 0, 100, -1]");
    }

    @Test
    public void test07216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07216");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, -1, 10, 0]");
    }

    @Test
    public void test07217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07217");
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
    public void test07218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07218");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 1, 1, 10]");
    }

    @Test
    public void test07219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_id", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07220");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test07221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07221");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 100, -1, 1, 10]");
    }

    @Test
    public void test07222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07222");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 0, 0, 0]");
    }

    @Test
    public void test07223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07223");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -1, 10, 100]");
    }

    @Test
    public void test07224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07224");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, -1, 100, 1]");
    }

    @Test
    public void test07225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("initial_timestamp", "o2", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o2?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("port", "script", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07227");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, -1, 1, -1]");
    }

    @Test
    public void test07228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07228");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 0, -1]");
    }

    @Test
    public void test07229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07229");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 0, 1, -1, -1]");
    }

    @Test
    public void test07230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "parent_types", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07231");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 10, 0]");
    }

    @Test
    public void test07232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07232");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 0, 10, -1, 10]");
    }

    @Test
    public void test07233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07233");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".files", "skip_initial_import", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07234");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, -1, 0, 100]");
    }

    @Test
    public void test07235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("connect_timeout", "secondary_read_preference", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07236");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 1, 100, 0]");
    }

    @Test
    public void test07237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07238");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 10, 10, 1, 1]");
    }

    @Test
    public void test07239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07239");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("index", "bulk_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07240");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07241");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07242");
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
    public void test07243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07243");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("dropDatabase", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07244");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("parent_types", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07245");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 0, 0]");
    }

    @Test
    public void test07246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07246");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 100, 1, 10]");
    }

    @Test
    public void test07247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07247");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = wildcardTimestamp11.getClass();
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
    }

    @Test
    public void test07248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin", "local", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07249");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 1, 1, 0]");
    }

    @Test
    public void test07250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07250");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 1, -1, 1]");
    }

    @Test
    public void test07251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("user", "size", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07252");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = wildcardTimestamp6.getClass();
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
    }

    @Test
    public void test07253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07253");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 1, 0, 10]");
    }

    @Test
    public void test07254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$natural", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "ur");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ur?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07256");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, -1, 100, -1]");
    }

    @Test
    public void test07257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07257");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 1, 10, 0]");
    }

    @Test
    public void test07258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".files", "import_all_collections", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07259");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl", "drop", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07260");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, 10, -1, 10]");
    }

    @Test
    public void test07261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07261");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("throttle_size", "is_mongos");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07262");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 10, 1, 100]");
    }

    @Test
    public void test07263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "parent_types", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "ts", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ts? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07265");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("c", ".files", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07266");
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
    public void test07267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07267");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 0, 100, 10]");
    }

    @Test
    public void test07268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07268");
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
    public void test07269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07269");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("c", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07271");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07272");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 0, -1, 1, 0]");
    }

    @Test
    public void test07273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop_collection", ".files", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07274");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 100, 100, 100]");
    }

    @Test
    public void test07275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("collection", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("servers", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("localhost", "u");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07278");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("concurrent_bulk_requests", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test07279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07279");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, 1, 1]");
    }

    @Test
    public void test07280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07280");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 0, -1, 10, 100]");
    }

    @Test
    public void test07281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07281");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, -1, 100, -1]");
    }

    @Test
    public void test07282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07282");
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
    public void test07283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07283");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, -1, -1, 0]");
    }

    @Test
    public void test07284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("import_all_collections", "status");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07285");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 100, 0, 10]");
    }

    @Test
    public void test07286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07286");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$or", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test07287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07287");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, -1, 0, 10, 10]");
    }

    @Test
    public void test07288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07288");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, 0, 1, -1]");
    }

    @Test
    public void test07289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07289");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("renameCollection", "throttle_size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07290");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 1, 10, -1]");
    }

    @Test
    public void test07291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_ts", "to", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07292");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("concurrent_requests", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07293");
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
    public void test07294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07294");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "script.disable_dynamic", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.disable_dynamic?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("password", "ops");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07296");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 10, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 10, 100, 0]");
    }

    @Test
    public void test07297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07297");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 10, -1, 0, 0]");
    }

    @Test
    public void test07298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("flush_interval", "admin.$cmd", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07299");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 100, -1, 100]");
    }

    @Test
    public void test07300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07300");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("is_mongos", "_last_gtid", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07301");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 100, 100]");
    }

    @Test
    public void test07302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "credentials", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07303");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 100, 100, 1]");
    }

    @Test
    public void test07304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "bulk_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07305");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 0, 1, 10]");
    }

    @Test
    public void test07306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07306");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass23 = basicDBObject1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test07307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$in", "renameCollection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07309");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("c", "create", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07310");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("status", "is_mongos");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07311");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100, 10, 1]");
    }

    @Test
    public void test07312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "$in");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$in?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07313");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 100, 100, 100, 1]");
    }

    @Test
    public void test07314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07314");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "store_statistics", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("sandbox", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("throttle_size", "admin", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07317");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07318");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 10, -1, 10, -1]");
    }

    @Test
    public void test07319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07319");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07320");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07321");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) -1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, -1, 0]");
    }

    @Test
    public void test07322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07322");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 10, -1, -1]");
    }

    @Test
    public void test07323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07323");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 10, 100, 10, 1]");
    }

    @Test
    public void test07324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07324");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, -1, 0, 0]");
    }

    @Test
    public void test07325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07325");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ns", "_last_ts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$cmd", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07327");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07328");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 1, 0]");
    }

    @Test
    public void test07329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ns", "config");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07330");
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
    public void test07331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_last_ts", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07332");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ts", "import_all_collections", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07333");
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
    public void test07334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07334");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 10, 1, 100, -1]");
    }

    @Test
    public void test07335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07335");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".chunks", "$or", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07336");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("admin.$cmd", "$and", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07337");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 100, 10, 1]");
    }

    @Test
    public void test07338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07338");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_fields", "u", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".chunks", "_last_ts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07340");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("disable_index_refresh", "oplog.rs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07341");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "servers", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("status", "d");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("filter", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07344");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("filter", "ssl_verify_certificate", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk", "servers");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07346");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$in", "concurrent_bulk_requests", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("credentials", "bulk");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07348");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$natural", "sandbox", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", "drop_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07350");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, -1, 1, 1, -1]");
    }

    @Test
    public void test07351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07351");
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
    public void test07352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07352");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, -1, 1, 0, -1]");
    }

    @Test
    public void test07353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("password", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07354");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("credentials", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07356");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, 100, 100, 0, 10]");
    }

    @Test
    public void test07357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07357");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("localhost", "gridfs", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk_timeout", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07359");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("user", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07360");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 100, 0, 1]");
    }

    @Test
    public void test07361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("oplog.rs", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07362");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, -1, 1, 0]");
    }

    @Test
    public void test07363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07363");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 0, 1, 1]");
    }

    @Test
    public void test07364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("db", "d");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07365");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 10, -1, 100]");
    }

    @Test
    public void test07366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "advanced_transformation", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07367");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("op", "throttle_size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script.default_lang", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07369");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, -1, 10, -1]");
    }

    @Test
    public void test07370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("import_all_collections", "import_all_collections", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("config", "disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07372");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("drop", "local");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07374");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, -1, -1, -1, -1]");
    }

    @Test
    public void test07375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07375");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 0, 0, 0]");
    }

    @Test
    public void test07376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07376");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("drop_collection", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07378");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = wildcardTimestamp7.getClass();
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
    }

    @Test
    public void test07379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07379");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$cmd", "store_statistics", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07380");
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
    public void test07381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07381");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, 100, 10, 1]");
    }

    @Test
    public void test07382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07382");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "host", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07383");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 10, 10, 1]");
    }

    @Test
    public void test07384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk_size", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07385");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 100, 0, 1]");
    }

    @Test
    public void test07386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07386");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 1, 0, 0]");
    }

    @Test
    public void test07387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07387");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, -1, 10, 1]");
    }

    @Test
    public void test07388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07388");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 1, 0, -1]");
    }

    @Test
    public void test07389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07389");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 10, 1, 0]");
    }

    @Test
    public void test07390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07390");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$or", "ssl", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07391");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("skip_initial_import", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07392");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, 0, 10, -1]");
    }

    @Test
    public void test07393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07393");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, -1, 1, 0]");
    }

    @Test
    public void test07394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07394");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 100, 0, 100]");
    }

    @Test
    public void test07395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07395");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("gridfs", "store_statistics", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07396");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("advanced_transformation", "exclude_fields", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07397");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl", "size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("initial_timestamp", "to");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07399");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("d", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("create", "import_all_collections", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07401");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("op", "index", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07402");
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
    public void test07403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07403");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ur", "is_mongos");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07404");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, -1, 1, -1]");
    }

    @Test
    public void test07405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("u", "script_type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("op", "index", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("fromMigrate", "$and", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$and?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07408");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 0, 0, 1]");
    }

    @Test
    public void test07409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07409");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, -1, -1, 10]");
    }

    @Test
    public void test07410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07410");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 10, -1, 1, 0]");
    }

    @Test
    public void test07411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ops", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07412");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 1, 10, -1]");
    }

    @Test
    public void test07413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07413");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("status", "include_fields", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07414");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("admin.$cmd", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07415");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, -1, 100, 10, 1]");
    }

    @Test
    public void test07416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07416");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 1, 100, -1]");
    }

    @Test
    public void test07417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07417");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test07418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07418");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_id", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07419");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, -1, 100, 100]");
    }

    @Test
    public void test07420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07420");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 0, 1, 0]");
    }

    @Test
    public void test07421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07421");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 100, 0, -1, -1]");
    }

    @Test
    public void test07422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07422");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("credentials", "admin.$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07423");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, -1, 10, 10]");
    }

    @Test
    public void test07424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07424");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 100, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 100, 10, 1]");
    }

    @Test
    public void test07425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("i", "connect_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07426");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 100, 1]");
    }

    @Test
    public void test07427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("hi!", "concurrent_requests", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("connect_timeout", "MongoDB River Plugin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?MongoDB River Plugin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("oplog.rs", "port", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07430");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 0, 1, 100]");
    }

    @Test
    public void test07431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07431");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("type", "n");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?n? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07432");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "mongodb", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07433");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, -1, -1]");
    }

    @Test
    public void test07434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07434");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 10, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 10, 1, -1]");
    }

    @Test
    public void test07435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07435");
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
    public void test07436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07436");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".files", "type", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07437");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, -1, -1]");
    }

    @Test
    public void test07438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("sandbox", "bulk_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07439");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 0, 1, 1, 1]");
    }

    @Test
    public void test07440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07440");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 10, 0, 100]");
    }

    @Test
    public void test07441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07441");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 100, 100, 0]");
    }

    @Test
    public void test07442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "db", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07443");
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
    public void test07444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("advanced_transformation", "db", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07445");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, -1, 1, -1, 0]");
    }

    @Test
    public void test07446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07446");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 100, 1, 0, 1]");
    }

    @Test
    public void test07447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("throttle_size", "parent_types");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("disable_index_refresh", "status");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07449");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 0, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 10, 0, 10]");
    }

    @Test
    public void test07450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07450");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 1, -1, 1]");
    }

    @Test
    public void test07451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07451");
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
    public void test07452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07452");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 0, 100, 10]");
    }

    @Test
    public void test07453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07453");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("collection", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07454");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, -1, -1, 100]");
    }

    @Test
    public void test07455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07455");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 100, -1, 10]");
    }

    @Test
    public void test07456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07456");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, 10, 1, 0]");
    }

    @Test
    public void test07457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07458");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("mongodb-river", "ts", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ts? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07459");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("port", ".files");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl", "flush_interval");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07461");
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
    public void test07462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "import_all_collections", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07463");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, 100, 100, 0]");
    }

    @Test
    public void test07464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07464");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 0, 10, 0]");
    }

    @Test
    public void test07465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("c", "gridfs", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07466");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 1, 0, 10, 100]");
    }

    @Test
    public void test07467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07467");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 10, -1, 0, -1]");
    }

    @Test
    public void test07468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07468");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 10, 10, 1]");
    }

    @Test
    public void test07469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07469");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, 100, 100, 10]");
    }

    @Test
    public void test07470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("local", "concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07471");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 10, -1, 100]");
    }

    @Test
    public void test07472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".chunks", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07473");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, -1, 1, -1, -1]");
    }

    @Test
    public void test07474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07474");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$in", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07475");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 100, 0, 1]");
    }

    @Test
    public void test07476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("include_collection", "drop_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "drop", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("flush_interval", "status");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07479");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, -1, -1, 10, -1]");
    }

    @Test
    public void test07480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("secondary_read_preference", "mongodb");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07481");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test07482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07482");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, -1, -1, 1, 0, 100]");
    }

    @Test
    public void test07483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("is_mongos", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07484");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("port", "db", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07485");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 1, -1, 0, 0]");
    }

    @Test
    public void test07486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07486");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 1, 0, -1]");
    }

    @Test
    public void test07487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07487");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("to", "mongodb", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("disable_index_refresh", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ops", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07490");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 0, 1, 10]");
    }

    @Test
    public void test07491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07491");
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
    public void test07492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07492");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("o", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-river", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07494");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 1, 100, 1]");
    }

    @Test
    public void test07495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07495");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 1, 0, 1]");
    }

    @Test
    public void test07496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07496");
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
    public void test07497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07497");
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
    public void test07498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script.disable_dynamic", "create", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("advanced_transformation", "concurrent_bulk_requests", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test07500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test07500");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("collection", "u", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }
}

