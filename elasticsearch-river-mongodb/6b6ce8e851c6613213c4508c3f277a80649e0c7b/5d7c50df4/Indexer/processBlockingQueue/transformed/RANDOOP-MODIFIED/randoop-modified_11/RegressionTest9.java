import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("size", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 100, -1, 1, 10]");
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 0, 10, 10]");
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl", "MongoDB River Plugin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?MongoDB River Plugin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("options", "port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("type", "password", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("sandbox", "is_mongos", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -1, 10, 100]");
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$or", "sandbox", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_bulk_requests", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_last_gtid", "u");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, 10, 1, 10]");
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, 100, 1]");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$or", ".scripts", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_ts", "name", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("config", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("o2", ".scripts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.scripts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("local", "script.disable_dynamic", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script.disable_dynamic", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb", "type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, -1, -1]");
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 100, -1, 1, 10]");
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("MongoDB River Plugin", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script.default_lang", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 10, 10, 1]");
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 0, 1]");
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "ns", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 10, 1, 0, -1]");
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 1, 0, 1, 0]");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("disable_index_refresh", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 100, 100, 0]");
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 100, 100, -1]");
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 0, -1, 1, -1]");
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("initial_timestamp", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 1, 1, 10]");
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_collection", "oplog.rs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("c", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) -1, (byte) 0, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, -1, 0, 1, 0]");
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 1, 1]");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("to", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, -1, -1, 1, 1]");
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("sandbox", "ur", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 100, 10, 10]");
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 1, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 1, -1, 1]");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_bulk_requests", "user", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("parent_types", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 1, 1]");
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ssl_verify_certificate", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 1, 0, 0]");
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 100, 0, -1]");
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, -1, 100, 1, 1]");
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
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
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("local", "options", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("o2", "import_all_collections", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("op", "_last_ts", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 10, 1, 100]");
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
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
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "oplog.rs", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("renameCollection", "collection", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, -1, -1, 10]");
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, -1, 0]");
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, 0, -1]");
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("to", "$natural", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("port", "ns");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_last_gtid", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 0, -1, -1]");
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "socket_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("advanced_transformation", "socket_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, -1, 10, 100, 1, 0]");
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "include_collection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 100, 100, 1, 1]");
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, -1, 10, 0]");
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 1, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 1, 1, 100]");
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix(".files", "sandbox");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
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
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-river", "_id");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_id?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("create", "throttle_size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 100, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 100, 1, 1, -1]");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 10, -1, 10]");
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 100, 10]");
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 1, 100, 1]");
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 1, -1]");
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("user", "user", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script", "status", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 10, 10, 10, -1]");
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("mongodb", "admin.$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
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
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("credentials", "mongodb");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 1, 1, 10]");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 100, 10, -1, 1]");
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("fromMigrate", "size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o", "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 10, 10, 0]");
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("index", "fromMigrate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?fromMigrate? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$in", "gridfs", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb", "renameCollection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("i", "ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 100, 0, 10]");
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("parent_types", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("create", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 1, 100, 1, -1]");
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 1, -1, 0, -1, 1]");
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("db", "$natural", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$or", "servers", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", "bulk_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 100, 100, 1, 100]");
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("exclude_fields", "", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("i", "ops", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 1, 100, -1, 100]");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, -1, 100, -1]");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("to", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ts", "name", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 100, 1, 100, 0]");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, -1, -1, 0]");
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script_type", "gridfs", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 0, 0, -1, 10]");
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 10, 0, 1]");
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 1, 1, 1]");
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) -1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 1, -1, -1, -1]");
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
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
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "ssl_verify_certificate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 100, -1, 1, 1]");
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("secondary_read_preference", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$cmd", "_last_gtid");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".scripts", "ops", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, 10, 0]");
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("options", "servers");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("o2", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, -1, -1, 1]");
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk_timeout", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 10, (byte) -1, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 10, -1, -1]");
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 1, 100, 0]");
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("store_statistics", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$natural", "user", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("servers", "size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 1, 100, 0, 1]");
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 0, -1, 0, 0]");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 1, 100, -1]");
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, -1, 10, 1]");
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "script.default_lang", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, -1, 1, 1]");
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) -1, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, -1, 0, 0]");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 0, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 10, 0, 100, 10]");
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o2", "to", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "u", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$in", "secondary_read_preference", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("u", "ssl", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 10, 100, 100, 0]");
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, -1, -1, 1, -1]");
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
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
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("to", "name", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 1, 1, 1]");
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "sandbox", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o", "name", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("local", "i", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("d", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "renameCollection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 100, 1, 0, 1]");
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 100, 0, -1]");
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) -1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 10, -1, 100]");
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("$cmd", "script.default_lang");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.default_lang?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk", "o2", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("o2", "$in");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$in?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 1, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 10, 1, 0, 10]");
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "concurrent_requests", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("o2", "_riverstatus", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".chunks", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 1, 0, -1]");
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("type", "include_fields", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, -1, 10, 1]");
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 10, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 10, 100, 1]");
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("actions", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("connect_timeout", ".scripts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.scripts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl_verify_certificate", "op", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?op?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "d");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 10, -1]");
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 100, 10, 10, 100, 10]");
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 10, 1, 1]");
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("port", "parent_types", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("i", "secondary_read_preference", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ssl", ".files");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "exclude_fields", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script_type", "parent_types", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 1, 0, -1]");
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) -1, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1, -1, 0]");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
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
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
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
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ur", "$in", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("disable_index_refresh", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 1, -1, 100, 1]");
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("u", "is_mongos", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 0, -1]");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 1, 100, -1]");
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
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
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("u", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop", "db", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("n", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 10, 10, -1]");
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 1, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 1, 10, 10, 10]");
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 10, 0, 0]");
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix(".scripts", "admin.$cmd");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin.$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
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
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 1, -1, -1]");
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 0, -1, 10]");
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, 10, 100]");
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("credentials", "status", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?status?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_last_ts", "o2", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?o2?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 10, 0, -1]");
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("u", "script.default_lang", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.default_lang?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("throttle_size", "is_mongos", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_fields", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
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
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 0, -1, 1]");
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("op", "drop", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "_riverstatus");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_riverstatus?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop", "index", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("to", "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("drop_collection", "ns");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 0, 100, 1]");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_bulk_requests", "fromMigrate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 100, 1, -1]");
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("initial_timestamp", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "fromMigrate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ts", "script.default_lang", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.default_lang?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("create", "ops", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ops?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("disable_index_refresh", "bulk_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("bulk", "servers", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("c", "$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("user", "$in", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("disable_index_refresh", "disable_index_refresh", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 100, 10, -1]");
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
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
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("oplog.rs", "initial_timestamp", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ts", "$natural");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_bulk_requests", "options", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("sandbox", "password", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("disable_index_refresh", "ssl_verify_certificate", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, -1, 10, 100]");
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb", "ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 100, (byte) -1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 100, -1, 0]");
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ts", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 100, 100]");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, 1, 0]");
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("parent_types", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$and", "bulk", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("hi!", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("advanced_transformation", "concurrent_bulk_requests", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 10, 0, 0, 100]");
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("mongodb-river", "config", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("hi!", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 1, 100]");
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 100, 1, 0]");
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script.disable_dynamic", "renameCollection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?renameCollection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("store_statistics", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin", "sandbox", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ts", "port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 1, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 1, 10, 0]");
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
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
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 1, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 1, 1, 0]");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 10, 100, 10]");
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "parent_types", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 1, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 1, 1, 10]");
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("throttle_size", "socket_timeout", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$cmd", "admin.$cmd", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("fromMigrate", "ssl", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, -1, -1]");
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 100, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 1, 100, 1, 10]");
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("db", "script_type", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("include_collection", "u");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 1, (byte) 0, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 1, 0, 1, 100, 1]");
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("MongoDB River Plugin", ".scripts", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.scripts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 100, -1, 10]");
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$and", "create", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 10, 1, -1, 0]");
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 10, 100, -1]");
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("initial_timestamp", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, -1, 1, 100]");
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 10, 0, -1]");
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("config", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, -1, -1, 1, 0]");
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("credentials", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_collection", "user", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
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
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("index", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl", "disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 1, 1, 10, -1]");
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "create");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?create?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
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
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("flush_interval", "flush_interval", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, -1, 100, 0, -1]");
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("i", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("password", ".files", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("size", "collection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 100, 100, 0]");
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 0, 100, 100, 0]");
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 100, 100, -1]");
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("status", "_last_gtid", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("exclude_fields", "oplog.rs", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 0, (byte) 100, (byte) 0, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 0, 100, 0, 10, 100]");
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, -1, 10, 1]");
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("drop", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "script", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 10, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 10, 0, 10, 0]");
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script.disable_dynamic", "_last_ts");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_ts?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 0, (byte) 0, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 0, 0, -1, 10]");
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script_type", "socket_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("MongoDB River Plugin", "ns", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ns? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("collection", "flush_interval", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 100, 1, 0, 1]");
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 1, 100, 0, 0]");
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("exclude_fields", "type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?type? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("type", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("o2", "$and", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings(".scripts", "name", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("collection", "script");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, 100, 0, -1]");
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 10, (byte) 10, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 10, 10, 10]");
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("n", "secondary_read_preference", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("localhost", "flush_interval");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("dropDatabase", "index", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 1, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 1, 1, -1, -1]");
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 1, 0, 1, 100]");
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop", "drop_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("renameCollection", "$in", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 1, 10, -1, 10]");
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("port", "to");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "ssl", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
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
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script", "$natural");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 0, (byte) -1, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 0, -1, 100]");
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 10, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 10, 100, -1]");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "socket_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 1, 100, -1, 10]");
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 1, 1, 10, 100]");
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "include_fields", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
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
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-river", "include_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 0, (byte) 1, (byte) 10, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 0, 1, 10, 100]");
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 1, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, 100, 1, 0, 1]");
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("config", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix(".chunks", "$natural", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("bulk_timeout", "is_mongos", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 1, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 10, 1, 10]");
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ur", "", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) -1, (byte) 0, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 0, -1, 0, 1]");
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("include_collection", "n", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?n? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 100, 0, 100]");
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("_id", "mongodb", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "$or");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script.disable_dynamic", "sandbox", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 10, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 0, 100, 100, 10, -1]");
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 100, (byte) -1, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 100, -1, 1, 10]");
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("drop", "u", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?u?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("credentials", "mongodb-river", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 1, 100, 100]");
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ts", ".chunks");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.chunks?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 10, 10, 0, 0]");
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 10, 0, 0]");
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 100, 100]");
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("index", "config");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?config?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1, (byte) 1, (byte) 0, (byte) 1, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1, 1, 0, 1, -1]");
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk", "mongodb-river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 10, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 10, 0, 10]");
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
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
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("credentials", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        java.lang.Class<?> wildcardClass7 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNull(wildcardTimestamp2);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(wildcardTimestamp4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("MongoDB River Plugin", "drop");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 0, 0, 1, 1]");
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("actions", "advanced_transformation", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("hi!", "c");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 10, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 10, 10, 0, 1]");
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", ".files");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("collection", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 1, (byte) 0, (byte) 100, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 1, 0, 100, 100]");
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ur", "concurrent_requests", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 100, 1, 100, -1]");
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "to", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("$in", "db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, 1, 100, 0, 10]");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
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
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("parent_types", "connect_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, -1, -1, 10]");
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("host", "d");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 100 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, -1, 100, 100]");
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 10, 1, -1, 100, -1]");
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("o2", ".chunks", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) -1, (byte) -1, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, -1, -1, 1, 0]");
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = wildcardTimestamp23.getClass();
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
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("n", "$and", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("hi!", "oplog.rs", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?oplog.rs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("sandbox", "ssl_verify_certificate", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 0, 0, 0]");
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("i", ".files", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?.files?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("parent_types", "mongodb-river", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script.default_lang", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        byte[] byteArray4 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[10, 0, -1, -1]");
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        byte[] byteArray6 = new byte[] { (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) 1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[0, 10, 100, 0, 1, 10]");
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 100, 1, 100, 1]");
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) -1, (byte) 0, (byte) 1, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, -1, 0, 1, 100]");
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("fromMigrate", "disable_index_refresh", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("flush_interval", "admin", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) -1, (byte) 0, (byte) -1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, -1, 0, -1, 1]");
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl_verify_certificate", "op", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 10, 0, 1]");
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("MongoDB River Plugin", "user", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "c");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?c?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "$cmd", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$cmd?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) 10, (byte) 1, (byte) 1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, -1, 10, 1, 1]");
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("options", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_last_gtid", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) 0, (byte) 100, (byte) 1, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, 0, 100, 1, 0]");
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("options", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "create", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 0, (byte) 100, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 0, 100, -1]");
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "$natural", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$natural?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("bulk", "parent_types", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("dropDatabase", "local", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 0, (byte) 10, (byte) 10 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 0, 10, 10]");
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("MongoDB River Plugin", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
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
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("$in", "u", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) 0, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1, 0, 100]");
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 10, (byte) 0, (byte) 10, (byte) 100, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 10, 0, 10, 100, 1]");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("servers", "include_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 100, 1, 1]");
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 100, (byte) 1, (byte) -1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 100, 1, -1, -1]");
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("sandbox", "_riverstatus", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 1, (byte) -1, (byte) 1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 1, -1, 1, 100, -1]");
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 10, (byte) -1, (byte) 100, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 10, -1, 100, -1]");
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "i");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?i?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ns", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 10, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 10, 100, 0, -1]");
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("hi!", "dropDatabase");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?dropDatabase?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("socket_timeout", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
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
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("config", "script", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("type", "drop", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
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
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("$or", "to", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?to? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 100, (byte) 1, (byte) 100, (byte) -1, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 100, 1, 100, -1, 10]");
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("renameCollection", "ns", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("local", "_last_gtid");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_last_gtid?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) 0, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 10, 0, 0, 0]");
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("db", "secondary_read_preference", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("admin.$cmd", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ts", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 10 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 100, 100, 10]");
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("oplog.rs", "status", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script_type", "d", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?d?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 100, (byte) 0, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, -1, 100, 0, -1]");
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
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
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 100 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 100]");
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 0, (byte) 10, (byte) 10, (byte) 10, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 0, 10, 10, 10, 100]");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 100, (byte) -1, (byte) -1 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 100, -1, -1]");
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("sandbox", "script_type", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
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
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("servers", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) -1, (byte) 10, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, -1, 10, 0]");
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 0, (byte) 100, (byte) 0, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 10, 0, 100, 0, 10]");
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        byte[] byteArray4 = new byte[] { (byte) 100, (byte) 10, (byte) 10, (byte) 0 };
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID6 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray4, date5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[100, 10, 10, 0]");
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 0, (byte) 1, (byte) 100, (byte) 0 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[-1, 0, 1, 100, 0]");
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
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
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("flush_interval", "o2", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) 100, (byte) 10, (byte) 1, (byte) -1 };
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID7 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray5, date6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[0, 100, 10, 1, -1]");
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_last_ts", "MongoDB River Plugin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?MongoDB River Plugin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script.default_lang", "size", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix(".chunks", "ur");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ur?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
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
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 100, (byte) 100, (byte) 0 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 100, 100, 0]");
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 100, (byte) 100, (byte) 1, (byte) 1 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 100, 100, 1, 1]");
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "status", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 1, (byte) 0, (byte) 1, (byte) 10, (byte) 10 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 1, 0, 1, 10, 10]");
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp2 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp4 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = org.elasticsearch.river.mongodb.Timestamp.on((com.mongodb.DBObject) basicDBObject1);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = org.elasticsearch.river.mongodb.Timestamp.on((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject1);
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
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ops", "ur");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ur?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("secondary_read_preference", "$or", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?$or?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) 100, (byte) 1, (byte) 10, (byte) 0, (byte) 100 };
        java.util.Date date7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.Timestamp.GTID gTID8 = new org.elasticsearch.river.mongodb.Timestamp.GTID(byteArray6, date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: gtid must encode two unsigned longs (128 total bits in length)");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, 100, 1, 10, 0, 100]");
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "ssl", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("store_statistics", "parent_types", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }
}

